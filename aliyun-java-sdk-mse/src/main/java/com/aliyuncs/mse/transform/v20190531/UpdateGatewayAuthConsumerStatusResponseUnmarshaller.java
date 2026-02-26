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

import com.aliyuncs.mse.model.v20190531.UpdateGatewayAuthConsumerStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayAuthConsumerStatusResponseUnmarshaller {

	public static UpdateGatewayAuthConsumerStatusResponse unmarshall(UpdateGatewayAuthConsumerStatusResponse updateGatewayAuthConsumerStatusResponse, UnmarshallerContext _ctx) {
		
		updateGatewayAuthConsumerStatusResponse.setRequestId(_ctx.stringValue("UpdateGatewayAuthConsumerStatusResponse.RequestId"));
		updateGatewayAuthConsumerStatusResponse.setSuccess(_ctx.booleanValue("UpdateGatewayAuthConsumerStatusResponse.Success"));
		updateGatewayAuthConsumerStatusResponse.setCode(_ctx.integerValue("UpdateGatewayAuthConsumerStatusResponse.Code"));
		updateGatewayAuthConsumerStatusResponse.setErrorCode(_ctx.stringValue("UpdateGatewayAuthConsumerStatusResponse.ErrorCode"));
		updateGatewayAuthConsumerStatusResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayAuthConsumerStatusResponse.HttpStatusCode"));
		updateGatewayAuthConsumerStatusResponse.setMessage(_ctx.stringValue("UpdateGatewayAuthConsumerStatusResponse.Message"));
		updateGatewayAuthConsumerStatusResponse.setDynamicCode(_ctx.stringValue("UpdateGatewayAuthConsumerStatusResponse.DynamicCode"));
		updateGatewayAuthConsumerStatusResponse.setDynamicMessage(_ctx.stringValue("UpdateGatewayAuthConsumerStatusResponse.DynamicMessage"));
		updateGatewayAuthConsumerStatusResponse.setData(_ctx.booleanValue("UpdateGatewayAuthConsumerStatusResponse.Data"));
	 
	 	return updateGatewayAuthConsumerStatusResponse;
	}
}