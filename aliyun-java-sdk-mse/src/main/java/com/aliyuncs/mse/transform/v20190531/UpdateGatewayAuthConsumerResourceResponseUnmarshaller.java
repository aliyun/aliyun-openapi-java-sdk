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

import com.aliyuncs.mse.model.v20190531.UpdateGatewayAuthConsumerResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayAuthConsumerResourceResponseUnmarshaller {

	public static UpdateGatewayAuthConsumerResourceResponse unmarshall(UpdateGatewayAuthConsumerResourceResponse updateGatewayAuthConsumerResourceResponse, UnmarshallerContext _ctx) {
		
		updateGatewayAuthConsumerResourceResponse.setRequestId(_ctx.stringValue("UpdateGatewayAuthConsumerResourceResponse.RequestId"));
		updateGatewayAuthConsumerResourceResponse.setSuccess(_ctx.booleanValue("UpdateGatewayAuthConsumerResourceResponse.Success"));
		updateGatewayAuthConsumerResourceResponse.setCode(_ctx.integerValue("UpdateGatewayAuthConsumerResourceResponse.Code"));
		updateGatewayAuthConsumerResourceResponse.setErrorCode(_ctx.stringValue("UpdateGatewayAuthConsumerResourceResponse.ErrorCode"));
		updateGatewayAuthConsumerResourceResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayAuthConsumerResourceResponse.HttpStatusCode"));
		updateGatewayAuthConsumerResourceResponse.setMessage(_ctx.stringValue("UpdateGatewayAuthConsumerResourceResponse.Message"));
		updateGatewayAuthConsumerResourceResponse.setDynamicCode(_ctx.stringValue("UpdateGatewayAuthConsumerResourceResponse.DynamicCode"));
		updateGatewayAuthConsumerResourceResponse.setDynamicMessage(_ctx.stringValue("UpdateGatewayAuthConsumerResourceResponse.DynamicMessage"));
		updateGatewayAuthConsumerResourceResponse.setData(_ctx.booleanValue("UpdateGatewayAuthConsumerResourceResponse.Data"));
	 
	 	return updateGatewayAuthConsumerResourceResponse;
	}
}