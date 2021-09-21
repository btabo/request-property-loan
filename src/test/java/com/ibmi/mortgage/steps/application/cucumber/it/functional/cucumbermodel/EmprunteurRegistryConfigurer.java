package com.ibmi.mortgage.steps.application.cucumber.it.functional.cucumbermodel;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableTransformer;

public class EmprunteurRegistryConfigurer implements TypeRegistryConfigurer {

	@Override
	public void configureTypeRegistry(TypeRegistry typeRegistry) {
		typeRegistry.defineDataTableType(
				new DataTableType(EmprunteursCucumber.class, new ListeEmprunteursTableTransformer()));
	}

	private static class ListeEmprunteursTableTransformer implements TableTransformer<EmprunteursCucumber> {

		@Override
		public EmprunteursCucumber transform(DataTable table) throws Throwable {

			EmprunteursCucumber emprunteursCucumber = new EmprunteursCucumber();
			// EmprunteurCatalog catalog = new EmprunteurCatalog();

			table.cells().stream().skip(1) // Skip header row
					.map(fields -> new EmprunteurCucumber(Integer.valueOf(fields.get(0)), fields.get(1), fields.get(2)))
					.forEach(emprunteursCucumber::addEmprunteurCucumber);

			return emprunteursCucumber;
		}

	}
}
