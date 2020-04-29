package com.smartlogic.ontologyeditor.examples;

import java.io.IOException;
import java.util.Collection;

import com.smartlogic.cloud.CloudException;
import com.smartlogic.ontologyeditor.OEClientException;
import com.smartlogic.ontologyeditor.OEClientReadWrite;
import com.smartlogic.ontologyeditor.beans.Concept;

public class GetAllConcepts extends ModelManipulation {
	public static void main(String args[]) throws IOException, CloudException, OEClientException {
		runTests(new GetAllConcepts());
	}
	
	@Override
	protected void alterModel(OEClientReadWrite oeClient) throws OEClientException {

		Collection<Concept> concepts = oeClient.getAllConcepts();
		for (Concept concept: concepts) {
			System.err.println(concept);
		}

		System.err.println(String.format("%d concepts returned", concepts.size()));

	}

}
