/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.ListAggregateResourcesByAdvancedSearchResponse;
import com.aliyuncs.config.model.v20200907.ListAggregateResourcesByAdvancedSearchResponse.QueryResults;
import com.aliyuncs.config.model.v20200907.ListAggregateResourcesByAdvancedSearchResponse.QueryResults.QueryResultList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAggregateResourcesByAdvancedSearchResponseUnmarshaller {

	public static ListAggregateResourcesByAdvancedSearchResponse unmarshall(ListAggregateResourcesByAdvancedSearchResponse listAggregateResourcesByAdvancedSearchResponse, UnmarshallerContext _ctx) {
		
		listAggregateResourcesByAdvancedSearchResponse.setRequestId(_ctx.stringValue("ListAggregateResourcesByAdvancedSearchResponse.RequestId"));

		QueryResults queryResults = new QueryResults();

		QueryResultList queryResultList = new QueryResultList();

		List<String> columns = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAggregateResourcesByAdvancedSearchResponse.QueryResults.QueryResultList.Columns.Length"); i++) {
			columns.add(_ctx.stringValue("ListAggregateResourcesByAdvancedSearchResponse.QueryResults.QueryResultList.Columns["+ i +"]"));
		}
		queryResultList.setColumns(columns);

		List<String> values = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAggregateResourcesByAdvancedSearchResponse.QueryResults.QueryResultList.Values.Length"); i++) {
			values.add(_ctx.stringValue("ListAggregateResourcesByAdvancedSearchResponse.QueryResults.QueryResultList.Values["+ i +"]"));
		}
		queryResultList.setValues(values);
		queryResults.setQueryResultList(queryResultList);
		listAggregateResourcesByAdvancedSearchResponse.setQueryResults(queryResults);
	 
	 	return listAggregateResourcesByAdvancedSearchResponse;
	}
}