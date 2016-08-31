/**
 * ****************************************************************************
 * Copyright 2014 Virginia Polytechnic Institute and State University
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ****************************************************************************
 */
package org.patricbrc.common;

public class StringHelper {

	public static String parseSolrKeywordOperator(String keyword) {
		keyword = keyword.replaceAll("\\s+or\\s+|\\s+Or\\s+|\\s+oR\\s+", " OR ").replaceAll("( )+", " ");

		return keyword;
	}

	public static String stripQuoteAndParseSolrKeywordOperator(String keyword) {

		keyword = keyword.replaceAll("%20", " ").replaceAll("%22", "\"").replaceAll("%27", "'").replaceAll("%2F", "\\\\/");

		return parseSolrKeywordOperator(keyword);
	}
}
