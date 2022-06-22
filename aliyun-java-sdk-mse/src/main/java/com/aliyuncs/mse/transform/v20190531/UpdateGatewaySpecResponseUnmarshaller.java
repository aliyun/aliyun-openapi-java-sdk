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

import com.aliyuncs.mse.model.v20190531.UpdateGatewaySpecResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewaySpecResponseUnmarshaller {

	public static UpdateGatewaySpecResponse unmarshall(UpdateGatewaySpecResponse updateGatewaySpecResponse, UnmarshallerContext _ctx) {
		
		updateGatewaySpecResponse.setRequestId(_ctx.stringValue("UpdateGatewaySpecResponse.RequestId"));
		updateGatewaySpecResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewaySpecResponse.HttpStatusCode"));
		updateGatewaySpecResponse.setMessage(_ctx.stringValue("UpdateGatewaySpecResponse.Message"));
		updateGatewaySpecResponse.setCode(_ctx.integerValue("UpdateGatewaySpecResponse.Code"));
		updateGatewaySpecResponse.setSuccess(_ctx.booleanValue("UpdateGatewaySpecResponse.Success"));
		updateGatewaySpecResponse.setData(_ctx.stringValue("UpdateGatewaySpecResponse.Data"));
	 
	 	return updateGatewaySpecResponse;
	}
}