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

import com.aliyuncs.mse.model.v20190531.UpdateGatewayAuthConsumerResourceStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayAuthConsumerResourceStatusResponseUnmarshaller {

	public static UpdateGatewayAuthConsumerResourceStatusResponse unmarshall(UpdateGatewayAuthConsumerResourceStatusResponse updateGatewayAuthConsumerResourceStatusResponse, UnmarshallerContext _ctx) {
		
		updateGatewayAuthConsumerResourceStatusResponse.setRequestId(_ctx.stringValue("UpdateGatewayAuthConsumerResourceStatusResponse.RequestId"));
		updateGatewayAuthConsumerResourceStatusResponse.setSuccess(_ctx.booleanValue("UpdateGatewayAuthConsumerResourceStatusResponse.Success"));
		updateGatewayAuthConsumerResourceStatusResponse.setCode(_ctx.integerValue("UpdateGatewayAuthConsumerResourceStatusResponse.Code"));
		updateGatewayAuthConsumerResourceStatusResponse.setErrorCode(_ctx.stringValue("UpdateGatewayAuthConsumerResourceStatusResponse.ErrorCode"));
		updateGatewayAuthConsumerResourceStatusResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayAuthConsumerResourceStatusResponse.HttpStatusCode"));
		updateGatewayAuthConsumerResourceStatusResponse.setMessage(_ctx.stringValue("UpdateGatewayAuthConsumerResourceStatusResponse.Message"));
		updateGatewayAuthConsumerResourceStatusResponse.setDynamicCode(_ctx.stringValue("UpdateGatewayAuthConsumerResourceStatusResponse.DynamicCode"));
		updateGatewayAuthConsumerResourceStatusResponse.setDynamicMessage(_ctx.stringValue("UpdateGatewayAuthConsumerResourceStatusResponse.DynamicMessage"));
		updateGatewayAuthConsumerResourceStatusResponse.setData(_ctx.booleanValue("UpdateGatewayAuthConsumerResourceStatusResponse.Data"));
	 
	 	return updateGatewayAuthConsumerResourceStatusResponse;
	}
}