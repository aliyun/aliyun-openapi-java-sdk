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

package com.aliyuncs.resourcecenter.transform.v20221201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcecenter.model.v20221201.ListExampleQueriesResponse;
import com.aliyuncs.resourcecenter.model.v20221201.ListExampleQueriesResponse.ExampleQuery;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExampleQueriesResponseUnmarshaller {

	public static ListExampleQueriesResponse unmarshall(ListExampleQueriesResponse listExampleQueriesResponse, UnmarshallerContext _ctx) {
		
		listExampleQueriesResponse.setRequestId(_ctx.stringValue("ListExampleQueriesResponse.RequestId"));
		listExampleQueriesResponse.setMaxResults(_ctx.stringValue("ListExampleQueriesResponse.MaxResults"));
		listExampleQueriesResponse.setNextToken(_ctx.stringValue("ListExampleQueriesResponse.NextToken"));

		List<ExampleQuery> exampleQueries = new ArrayList<ExampleQuery>();
		for (int i = 0; i < _ctx.lengthValue("ListExampleQueriesResponse.ExampleQueries.Length"); i++) {
			ExampleQuery exampleQuery = new ExampleQuery();
			exampleQuery.setDescription(_ctx.stringValue("ListExampleQueriesResponse.ExampleQueries["+ i +"].Description"));
			exampleQuery.setName(_ctx.stringValue("ListExampleQueriesResponse.ExampleQueries["+ i +"].Name"));
			exampleQuery.setQueryId(_ctx.stringValue("ListExampleQueriesResponse.ExampleQueries["+ i +"].QueryId"));

			exampleQueries.add(exampleQuery);
		}
		listExampleQueriesResponse.setExampleQueries(exampleQueries);
	 
	 	return listExampleQueriesResponse;
	}
}