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

import com.aliyuncs.mse.model.v20190531.UpdateGatewayAuthConsumerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayAuthConsumerResponseUnmarshaller {

	public static UpdateGatewayAuthConsumerResponse unmarshall(UpdateGatewayAuthConsumerResponse updateGatewayAuthConsumerResponse, UnmarshallerContext _ctx) {
		
		updateGatewayAuthConsumerResponse.setRequestId(_ctx.stringValue("UpdateGatewayAuthConsumerResponse.RequestId"));
		updateGatewayAuthConsumerResponse.setSuccess(_ctx.booleanValue("UpdateGatewayAuthConsumerResponse.Success"));
		updateGatewayAuthConsumerResponse.setCode(_ctx.integerValue("UpdateGatewayAuthConsumerResponse.Code"));
		updateGatewayAuthConsumerResponse.setErrorCode(_ctx.stringValue("UpdateGatewayAuthConsumerResponse.ErrorCode"));
		updateGatewayAuthConsumerResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayAuthConsumerResponse.HttpStatusCode"));
		updateGatewayAuthConsumerResponse.setMessage(_ctx.stringValue("UpdateGatewayAuthConsumerResponse.Message"));
		updateGatewayAuthConsumerResponse.setDynamicCode(_ctx.stringValue("UpdateGatewayAuthConsumerResponse.DynamicCode"));
		updateGatewayAuthConsumerResponse.setDynamicMessage(_ctx.stringValue("UpdateGatewayAuthConsumerResponse.DynamicMessage"));
		updateGatewayAuthConsumerResponse.setData(_ctx.longValue("UpdateGatewayAuthConsumerResponse.Data"));
	 
	 	return updateGatewayAuthConsumerResponse;
	}
}