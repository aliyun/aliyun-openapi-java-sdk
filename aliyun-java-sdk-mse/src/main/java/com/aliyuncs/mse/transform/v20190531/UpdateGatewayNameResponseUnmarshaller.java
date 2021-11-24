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

import com.aliyuncs.mse.model.v20190531.UpdateGatewayNameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayNameResponseUnmarshaller {

	public static UpdateGatewayNameResponse unmarshall(UpdateGatewayNameResponse updateGatewayNameResponse, UnmarshallerContext _ctx) {
		
		updateGatewayNameResponse.setRequestId(_ctx.stringValue("UpdateGatewayNameResponse.RequestId"));
		updateGatewayNameResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayNameResponse.HttpStatusCode"));
		updateGatewayNameResponse.setMessage(_ctx.stringValue("UpdateGatewayNameResponse.Message"));
		updateGatewayNameResponse.setCode(_ctx.integerValue("UpdateGatewayNameResponse.Code"));
		updateGatewayNameResponse.setSuccess(_ctx.booleanValue("UpdateGatewayNameResponse.Success"));
		updateGatewayNameResponse.setData(_ctx.stringValue("UpdateGatewayNameResponse.Data"));
	 
	 	return updateGatewayNameResponse;
	}
}