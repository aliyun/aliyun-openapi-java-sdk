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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMsConfigDataResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsConfigDataResponse.QueryResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsConfigDataResponseUnmarshaller {

	public static QueryMsConfigDataResponse unmarshall(QueryMsConfigDataResponse queryMsConfigDataResponse, UnmarshallerContext _ctx) {
		
		queryMsConfigDataResponse.setRequestId(_ctx.stringValue("QueryMsConfigDataResponse.RequestId"));
		queryMsConfigDataResponse.setResultCode(_ctx.stringValue("QueryMsConfigDataResponse.ResultCode"));
		queryMsConfigDataResponse.setResultMessage(_ctx.stringValue("QueryMsConfigDataResponse.ResultMessage"));

		List<QueryResultItem> queryResult = new ArrayList<QueryResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsConfigDataResponse.QueryResult.Length"); i++) {
			QueryResultItem queryResultItem = new QueryResultItem();
			queryResultItem.setCell(_ctx.stringValue("QueryMsConfigDataResponse.QueryResult["+ i +"].Cell"));
			queryResultItem.setData(_ctx.stringValue("QueryMsConfigDataResponse.QueryResult["+ i +"].Data"));

			queryResult.add(queryResultItem);
		}
		queryMsConfigDataResponse.setQueryResult(queryResult);
	 
	 	return queryMsConfigDataResponse;
	}
}