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

import com.aliyuncs.mse.model.v20190531.AddGatewaySlbResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddGatewaySlbResponseUnmarshaller {

	public static AddGatewaySlbResponse unmarshall(AddGatewaySlbResponse addGatewaySlbResponse, UnmarshallerContext _ctx) {
		
		addGatewaySlbResponse.setRequestId(_ctx.stringValue("AddGatewaySlbResponse.RequestId"));
		addGatewaySlbResponse.setHttpStatusCode(_ctx.integerValue("AddGatewaySlbResponse.HttpStatusCode"));
		addGatewaySlbResponse.setMessage(_ctx.stringValue("AddGatewaySlbResponse.Message"));
		addGatewaySlbResponse.setCode(_ctx.integerValue("AddGatewaySlbResponse.Code"));
		addGatewaySlbResponse.setSuccess(_ctx.booleanValue("AddGatewaySlbResponse.Success"));
		addGatewaySlbResponse.setData(_ctx.stringValue("AddGatewaySlbResponse.Data"));
	 
	 	return addGatewaySlbResponse;
	}
}