package it.dipendeti.rest;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import it.dipendenti.pojo.ContoCorrente;
import it.dipendenti.pojo.Movimenti;


@Path("/ewallet")
public class GestioneEwallet {

	private static List<ContoCorrente> contoCorrente = new ArrayList<ContoCorrente>();
	private static List<Movimenti> listaMovimenti = new ArrayList<Movimenti>();


	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ContoCorrente> retrieveContoCorrente() {

		return contoCorrente;
	}

	@DELETE
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cancellaDipendente(ContoCorrente cc) {

		for (ContoCorrente contCorr : contoCorrente) {
			if (contCorr.getNumeroConto() == cc.getNumeroConto()) {
				contoCorrente.remove(cc);
				break;
			}
		}

		return Response.status(200).entity("Eliminazione avvenuta con successo").build();
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserisciContoCorrente(ContoCorrente cc) {
		contoCorrente.add(cc);
		return Response.status(200).entity("Inserimento avvenuto con successo").build();
	}

	@PUT
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response aggiornaContoCorrente(ContoCorrente cc) {

		for (ContoCorrente contCorr : contoCorrente) {
			if (contCorr.getNumeroConto() == cc.getNumeroConto()) {
				int index = contoCorrente.lastIndexOf(contCorr);
				contoCorrente.set(index, cc);
			}
		}

		return Response.status(200).entity("Aggiornamento avvenuto con successo").build();		
	}

	@PUT
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response prelievo(ContoCorrente cc,String data,Double importo, String tipoMovimento) {

		for (ContoCorrente contCorr : contoCorrente) {
			if (contCorr.getNumeroConto() == cc.getNumeroConto()) {

				int index = contoCorrente.lastIndexOf(contCorr);

				Double saldoConto = contoCorrente.get(index).getSaldoConto();

				contoCorrente.get(index).setSaldoConto(saldoConto-importo);

				Movimenti movimentiConto = new Movimenti(cc,tipoMovimento,data,importo);

				listaMovimenti.add(movimentiConto);

			}
		}



		return Response.status(200).entity("Aggiornamento avvenuto con successo").build();		
	}

	@PUT
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response versamento(ContoCorrente cc,String data,Double importo, String tipoMovimento) {

		for (ContoCorrente contCorr : contoCorrente) {
			if (contCorr.getNumeroConto() == cc.getNumeroConto()) {

				int index = contoCorrente.lastIndexOf(contCorr);

				Double saldoConto = contoCorrente.get(index).getSaldoConto();

				contoCorrente.get(index).setSaldoConto(saldoConto+importo);

				Movimenti movimentiConto = new Movimenti(cc,tipoMovimento,data,importo);

				listaMovimenti.add(movimentiConto);

			}
		}
			return Response.status(200).entity("Aggiornamento avvenuto con successo").build();		

	}
		}

