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

import com.aliyuncs.onsmqtt.model.v20200420.QueryCustomAuthIdentityResponse;
import com.aliyuncs.onsmqtt.model.v20200420.QueryCustomAuthIdentityResponse.Data;
import com.aliyuncs.onsmqtt.model.v20200420.QueryCustomAuthIdentityResponse.Data.ResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCustomAuthIdentityResponseUnmarshaller {

	public static QueryCustomAuthIdentityResponse unmarshall(QueryCustomAuthIdentityResponse queryCustomAuthIdentityResponse, UnmarshallerContext _ctx) {
		
		queryCustomAuthIdentityResponse.setRequestId(_ctx.stringValue("QueryCustomAuthIdentityResponse.RequestId"));
		queryCustomAuthIdentityResponse.setCode(_ctx.integerValue("QueryCustomAuthIdentityResponse.Code"));
		queryCustomAuthIdentityResponse.setSuccess(_ctx.booleanValue("QueryCustomAuthIdentityResponse.Success"));
		queryCustomAuthIdentityResponse.setMessage(_ctx.stringValue("QueryCustomAuthIdentityResponse.Message"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("QueryCustomAuthIdentityResponse.Data.NextToken"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCustomAuthIdentityResponse.Data.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setUsername(_ctx.stringValue("QueryCustomAuthIdentityResponse.Data.Results["+ i +"].Username"));
			resultsItem.setSecret(_ctx.stringValue("QueryCustomAuthIdentityResponse.Data.Results["+ i +"].Secret"));
			resultsItem.setIdentityType(_ctx.stringValue("QueryCustomAuthIdentityResponse.Data.Results["+ i +"].IdentityType"));
			resultsItem.setClientId(_ctx.stringValue("QueryCustomAuthIdentityResponse.Data.Results["+ i +"].ClientId"));
			resultsItem.setSignMode(_ctx.stringValue("QueryCustomAuthIdentityResponse.Data.Results["+ i +"].SignMode"));

			results.add(resultsItem);
		}
		data.setResults(results);
		queryCustomAuthIdentityResponse.setData(data);
	 
	 	return queryCustomAuthIdentityResponse;
	}
}