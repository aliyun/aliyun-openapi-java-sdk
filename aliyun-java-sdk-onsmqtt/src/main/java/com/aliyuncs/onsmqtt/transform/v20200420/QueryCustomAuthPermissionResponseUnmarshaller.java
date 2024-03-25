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

package com.aliyuncs.onsmqtt.transform.v20200420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.onsmqtt.model.v20200420.QueryCustomAuthPermissionResponse;
import com.aliyuncs.onsmqtt.model.v20200420.QueryCustomAuthPermissionResponse.Data;
import com.aliyuncs.onsmqtt.model.v20200420.QueryCustomAuthPermissionResponse.Data.ResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCustomAuthPermissionResponseUnmarshaller {

	public static QueryCustomAuthPermissionResponse unmarshall(QueryCustomAuthPermissionResponse queryCustomAuthPermissionResponse, UnmarshallerContext _ctx) {
		
		queryCustomAuthPermissionResponse.setRequestId(_ctx.stringValue("QueryCustomAuthPermissionResponse.RequestId"));
		queryCustomAuthPermissionResponse.setCode(_ctx.integerValue("QueryCustomAuthPermissionResponse.Code"));
		queryCustomAuthPermissionResponse.setSuccess(_ctx.booleanValue("QueryCustomAuthPermissionResponse.Success"));
		queryCustomAuthPermissionResponse.setMessage(_ctx.stringValue("QueryCustomAuthPermissionResponse.Message"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("QueryCustomAuthPermissionResponse.Data.NextToken"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCustomAuthPermissionResponse.Data.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setIdentity(_ctx.stringValue("QueryCustomAuthPermissionResponse.Data.Results["+ i +"].Identity"));
			resultsItem.setPermitAction(_ctx.stringValue("QueryCustomAuthPermissionResponse.Data.Results["+ i +"].PermitAction"));
			resultsItem.setEffect(_ctx.stringValue("QueryCustomAuthPermissionResponse.Data.Results["+ i +"].Effect"));
			resultsItem.setIdentityType(_ctx.stringValue("QueryCustomAuthPermissionResponse.Data.Results["+ i +"].IdentityType"));
			resultsItem.setTopic(_ctx.stringValue("QueryCustomAuthPermissionResponse.Data.Results["+ i +"].Topic"));

			results.add(resultsItem);
		}
		data.setResults(results);
		queryCustomAuthPermissionResponse.setData(data);
	 
	 	return queryCustomAuthPermissionResponse;
	}
}