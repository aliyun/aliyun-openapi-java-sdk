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

import com.aliyuncs.mse.model.v20190531.UpdateGatewayServiceVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayServiceVersionResponseUnmarshaller {

	public static UpdateGatewayServiceVersionResponse unmarshall(UpdateGatewayServiceVersionResponse updateGatewayServiceVersionResponse, UnmarshallerContext _ctx) {
		
		updateGatewayServiceVersionResponse.setRequestId(_ctx.stringValue("UpdateGatewayServiceVersionResponse.RequestId"));
		updateGatewayServiceVersionResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayServiceVersionResponse.HttpStatusCode"));
		updateGatewayServiceVersionResponse.setMessage(_ctx.stringValue("UpdateGatewayServiceVersionResponse.Message"));
		updateGatewayServiceVersionResponse.setCode(_ctx.integerValue("UpdateGatewayServiceVersionResponse.Code"));
		updateGatewayServiceVersionResponse.setSuccess(_ctx.booleanValue("UpdateGatewayServiceVersionResponse.Success"));
		updateGatewayServiceVersionResponse.setData(_ctx.longValue("UpdateGatewayServiceVersionResponse.Data"));
	 
	 	return updateGatewayServiceVersionResponse;
	}
}