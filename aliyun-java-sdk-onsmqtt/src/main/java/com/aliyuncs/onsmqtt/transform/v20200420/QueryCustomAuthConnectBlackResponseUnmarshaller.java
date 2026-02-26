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

import com.aliyuncs.onsmqtt.model.v20200420.QueryCustomAuthConnectBlackResponse;
import com.aliyuncs.onsmqtt.model.v20200420.QueryCustomAuthConnectBlackResponse.Data;
import com.aliyuncs.onsmqtt.model.v20200420.QueryCustomAuthConnectBlackResponse.Data.ResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCustomAuthConnectBlackResponseUnmarshaller {

	public static QueryCustomAuthConnectBlackResponse unmarshall(QueryCustomAuthConnectBlackResponse queryCustomAuthConnectBlackResponse, UnmarshallerContext _ctx) {
		
		queryCustomAuthConnectBlackResponse.setRequestId(_ctx.stringValue("QueryCustomAuthConnectBlackResponse.RequestId"));
		queryCustomAuthConnectBlackResponse.setCode(_ctx.integerValue("QueryCustomAuthConnectBlackResponse.Code"));
		queryCustomAuthConnectBlackResponse.setSuccess(_ctx.booleanValue("QueryCustomAuthConnectBlackResponse.Success"));
		queryCustomAuthConnectBlackResponse.setMessage(_ctx.stringValue("QueryCustomAuthConnectBlackResponse.Message"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("QueryCustomAuthConnectBlackResponse.Data.NextToken"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCustomAuthConnectBlackResponse.Data.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setClientId(_ctx.stringValue("QueryCustomAuthConnectBlackResponse.Data.Results["+ i +"].ClientId"));
			resultsItem.setEffect(_ctx.stringValue("QueryCustomAuthConnectBlackResponse.Data.Results["+ i +"].Effect"));
			resultsItem.setPermitAction(_ctx.stringValue("QueryCustomAuthConnectBlackResponse.Data.Results["+ i +"].PermitAction"));

			results.add(resultsItem);
		}
		data.setResults(results);
		queryCustomAuthConnectBlackResponse.setData(data);
	 
	 	return queryCustomAuthConnectBlackResponse;
	}
}