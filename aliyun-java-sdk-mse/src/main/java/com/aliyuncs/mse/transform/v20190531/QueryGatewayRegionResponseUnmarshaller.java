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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.QueryGatewayRegionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGatewayRegionResponseUnmarshaller {

	public static QueryGatewayRegionResponse unmarshall(QueryGatewayRegionResponse queryGatewayRegionResponse, UnmarshallerContext _ctx) {
		
		queryGatewayRegionResponse.setRequestId(_ctx.stringValue("QueryGatewayRegionResponse.RequestId"));
		queryGatewayRegionResponse.setHttpStatusCode(_ctx.integerValue("QueryGatewayRegionResponse.HttpStatusCode"));
		queryGatewayRegionResponse.setMessage(_ctx.stringValue("QueryGatewayRegionResponse.Message"));
		queryGatewayRegionResponse.setCode(_ctx.integerValue("QueryGatewayRegionResponse.Code"));
		queryGatewayRegionResponse.setSuccess(_ctx.booleanValue("QueryGatewayRegionResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryGatewayRegionResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryGatewayRegionResponse.Data["+ i +"]"));
		}
		queryGatewayRegionResponse.setData(data);
	 
	 	return queryGatewayRegionResponse;
	}
}