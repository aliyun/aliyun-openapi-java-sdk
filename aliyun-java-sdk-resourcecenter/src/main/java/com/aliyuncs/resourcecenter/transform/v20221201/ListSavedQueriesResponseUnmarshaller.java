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

import com.aliyuncs.resourcecenter.model.v20221201.ListSavedQueriesResponse;
import com.aliyuncs.resourcecenter.model.v20221201.ListSavedQueriesResponse.SavedQuery;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSavedQueriesResponseUnmarshaller {

	public static ListSavedQueriesResponse unmarshall(ListSavedQueriesResponse listSavedQueriesResponse, UnmarshallerContext _ctx) {
		
		listSavedQueriesResponse.setRequestId(_ctx.stringValue("ListSavedQueriesResponse.RequestId"));
		listSavedQueriesResponse.setMaxResults(_ctx.stringValue("ListSavedQueriesResponse.MaxResults"));
		listSavedQueriesResponse.setNextToken(_ctx.stringValue("ListSavedQueriesResponse.NextToken"));

		List<SavedQuery> savedQueries = new ArrayList<SavedQuery>();
		for (int i = 0; i < _ctx.lengthValue("ListSavedQueriesResponse.SavedQueries.Length"); i++) {
			SavedQuery savedQuery = new SavedQuery();
			savedQuery.setCreateTime(_ctx.stringValue("ListSavedQueriesResponse.SavedQueries["+ i +"].CreateTime"));
			savedQuery.setDescription(_ctx.stringValue("ListSavedQueriesResponse.SavedQueries["+ i +"].Description"));
			savedQuery.setName(_ctx.stringValue("ListSavedQueriesResponse.SavedQueries["+ i +"].Name"));
			savedQuery.setQueryId(_ctx.stringValue("ListSavedQueriesResponse.SavedQueries["+ i +"].QueryId"));
			savedQuery.setUpdateTime(_ctx.stringValue("ListSavedQueriesResponse.SavedQueries["+ i +"].UpdateTime"));

			savedQueries.add(savedQuery);
		}
		listSavedQueriesResponse.setSavedQueries(savedQueries);
	 
	 	return listSavedQueriesResponse;
	}
}