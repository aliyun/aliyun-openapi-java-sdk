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

import com.aliyuncs.mse.model.v20190531.AddGatewayResponse;
import com.aliyuncs.mse.model.v20190531.AddGatewayResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddGatewayResponseUnmarshaller {

	public static AddGatewayResponse unmarshall(AddGatewayResponse addGatewayResponse, UnmarshallerContext _ctx) {
		
		addGatewayResponse.setRequestId(_ctx.stringValue("AddGatewayResponse.RequestId"));
		addGatewayResponse.setHttpStatusCode(_ctx.integerValue("AddGatewayResponse.HttpStatusCode"));
		addGatewayResponse.setMessage(_ctx.stringValue("AddGatewayResponse.Message"));
		addGatewayResponse.setCode(_ctx.integerValue("AddGatewayResponse.Code"));
		addGatewayResponse.setSuccess(_ctx.booleanValue("AddGatewayResponse.Success"));

		Data data = new Data();
		data.setGatewayUniqueId(_ctx.stringValue("AddGatewayResponse.Data.GatewayUniqueId"));
		addGatewayResponse.setData(data);
	 
	 	return addGatewayResponse;
	}
}