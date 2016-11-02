/*******************************************************************************
 * Copyright 2014 Virginia Polytechnic Institute and State University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.patricbrc.dlp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args){

		// check params


		// create cache for DLP
		DataGenerator cacheGen = new DataGenerator();
		try {

			if("AntibioticResistance".equalsIgnoreCase(args[1]) || "All".equalsIgnoreCase(args[1])) {
				boolean antibioticResistance = cacheGen.createCacheFileAntibioticResistanceGenes("AntibioticResistance.json");
				if (antibioticResistance) {
					LOGGER.info("AntibioticResistance Landing data is generated");
				}
				else {
					LOGGER.info("AntibioticResistance Landing data is failed");
				}
			}

			if("Genomes".equalsIgnoreCase(args[1]) || "All".equalsIgnoreCase(args[1])) {
				boolean genome = cacheGen.createCacheFileGenomes("Genomes.json");
				if (genome) {
					LOGGER.info("Genome Landing data is generated");
				}
				else {
					LOGGER.info("Genome Landing data is failed");
				}
			}

			if("GenomicFeatures".equalsIgnoreCase(args[1]) || "All".equalsIgnoreCase(args[1])) {
				boolean feature = cacheGen.createCacheFileGenomicFeatures("GenomicFeatures.json");
				if (feature) {
					LOGGER.info("Feature Landing data is generated");
				}
				else {
					LOGGER.info("Feature Landing data is failed");
				}
			}

			if("Pathways".equalsIgnoreCase(args[1]) || "All".equalsIgnoreCase(args[1])) {
				boolean pathway = cacheGen.createCacheFilePathways("Pathways.json");
				if (pathway) {
					LOGGER.info("Pathway Landing data is generated");
				}
				else {
					LOGGER.info("Pathway Landing data is failed");
				}
			}

			if("ProteinFamilies".equalsIgnoreCase(args[1]) || "All".equalsIgnoreCase(args[1])) {
				boolean proteinFamily = cacheGen.createCacheFileProteinFamilies("ProteinFamilies.json");
				if (proteinFamily) {
					LOGGER.info("ProteinFamily Landing data is generated");
				}
				else {
					LOGGER.info("ProteinFamily Landing data is failed");
				}
			}

			if("SpecialtyGenes".equalsIgnoreCase(args[1]) || "All".equalsIgnoreCase(args[1])) {
				boolean spGene = cacheGen.createCacheFileSpecialtyGenes("SpecialtyGenes.json");
				if (spGene) {
					LOGGER.info("SpecialtyGene Landing data is generated");
				}
				else {
					LOGGER.info("SpecialtyGene Landing data is failed");
				}
			}

			if("Transcriptomics".equalsIgnoreCase(args[1]) || "All".equalsIgnoreCase(args[1])) {
				boolean transcriptomics = cacheGen.createCacheFileTranscriptomics("Transcriptomics.json");
				if (transcriptomics) {
					LOGGER.info("Transcriptomics Landing data is generated");
				}
				else {
					LOGGER.info("Transcriptomics Landing data is failed");
				}
			}
		}
		catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		finally{
			cacheGen.close();
		}
	}
}
