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

import com.aliyuncs.mse.model.v20190531.QueryGatewayTypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGatewayTypeResponseUnmarshaller {

	public static QueryGatewayTypeResponse unmarshall(QueryGatewayTypeResponse queryGatewayTypeResponse, UnmarshallerContext _ctx) {
		
		queryGatewayTypeResponse.setRequestId(_ctx.stringValue("QueryGatewayTypeResponse.RequestId"));
		queryGatewayTypeResponse.setHttpStatusCode(_ctx.integerValue("QueryGatewayTypeResponse.HttpStatusCode"));
		queryGatewayTypeResponse.setMessage(_ctx.stringValue("QueryGatewayTypeResponse.Message"));
		queryGatewayTypeResponse.setCode(_ctx.integerValue("QueryGatewayTypeResponse.Code"));
		queryGatewayTypeResponse.setSuccess(_ctx.booleanValue("QueryGatewayTypeResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryGatewayTypeResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryGatewayTypeResponse.Data["+ i +"]"));
		}
		queryGatewayTypeResponse.setData(data);
	 
	 	return queryGatewayTypeResponse;
	}
}