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
package org.patricbrc.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@SuppressWarnings("unchecked")
public class SolrInterface {

//	SolrCore core;

	private String startDate = "1990-01-01T00:00:000Z";

	private String endDate = "2020-01-01T00:00:000Z";

	private String rangeDate = "+1YEAR";

	private Date startDateFormat, endDateFormat;

	private SimpleDateFormat shortDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	private static final Logger LOGGER = LoggerFactory.getLogger(SolrInterface.class);

	public SolrInterface() {

		try {
			startDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(startDate);
			endDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(endDate);

			// reset timezone for short date format
			shortDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		}
		catch (java.text.ParseException e) {
			e.printStackTrace();
		}
	}

	public Date getRangeStartDate() {
		return startDateFormat;
	}

	public Date getRangeEndDate() {
		return endDateFormat;
	}

	public String getRangeDate() { return rangeDate; }
}
