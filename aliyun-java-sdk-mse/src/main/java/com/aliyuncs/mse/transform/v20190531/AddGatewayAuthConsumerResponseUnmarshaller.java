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

import com.aliyuncs.mse.model.v20190531.AddGatewayAuthConsumerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddGatewayAuthConsumerResponseUnmarshaller {

	public static AddGatewayAuthConsumerResponse unmarshall(AddGatewayAuthConsumerResponse addGatewayAuthConsumerResponse, UnmarshallerContext _ctx) {
		
		addGatewayAuthConsumerResponse.setRequestId(_ctx.stringValue("AddGatewayAuthConsumerResponse.RequestId"));
		addGatewayAuthConsumerResponse.setSuccess(_ctx.booleanValue("AddGatewayAuthConsumerResponse.Success"));
		addGatewayAuthConsumerResponse.setCode(_ctx.integerValue("AddGatewayAuthConsumerResponse.Code"));
		addGatewayAuthConsumerResponse.setErrorCode(_ctx.stringValue("AddGatewayAuthConsumerResponse.ErrorCode"));
		addGatewayAuthConsumerResponse.setHttpStatusCode(_ctx.integerValue("AddGatewayAuthConsumerResponse.HttpStatusCode"));
		addGatewayAuthConsumerResponse.setMessage(_ctx.stringValue("AddGatewayAuthConsumerResponse.Message"));
		addGatewayAuthConsumerResponse.setDynamicCode(_ctx.stringValue("AddGatewayAuthConsumerResponse.DynamicCode"));
		addGatewayAuthConsumerResponse.setDynamicMessage(_ctx.stringValue("AddGatewayAuthConsumerResponse.DynamicMessage"));
		addGatewayAuthConsumerResponse.setData(_ctx.longValue("AddGatewayAuthConsumerResponse.Data"));
	 
	 	return addGatewayAuthConsumerResponse;
	}
}