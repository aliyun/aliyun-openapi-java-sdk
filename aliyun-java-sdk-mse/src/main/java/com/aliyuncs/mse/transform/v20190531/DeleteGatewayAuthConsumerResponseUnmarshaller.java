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

import com.aliyuncs.mse.model.v20190531.DeleteGatewayAuthConsumerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGatewayAuthConsumerResponseUnmarshaller {

	public static DeleteGatewayAuthConsumerResponse unmarshall(DeleteGatewayAuthConsumerResponse deleteGatewayAuthConsumerResponse, UnmarshallerContext _ctx) {
		
		deleteGatewayAuthConsumerResponse.setRequestId(_ctx.stringValue("DeleteGatewayAuthConsumerResponse.RequestId"));
		deleteGatewayAuthConsumerResponse.setSuccess(_ctx.booleanValue("DeleteGatewayAuthConsumerResponse.Success"));
		deleteGatewayAuthConsumerResponse.setCode(_ctx.integerValue("DeleteGatewayAuthConsumerResponse.Code"));
		deleteGatewayAuthConsumerResponse.setErrorCode(_ctx.stringValue("DeleteGatewayAuthConsumerResponse.ErrorCode"));
		deleteGatewayAuthConsumerResponse.setHttpStatusCode(_ctx.integerValue("DeleteGatewayAuthConsumerResponse.HttpStatusCode"));
		deleteGatewayAuthConsumerResponse.setMessage(_ctx.stringValue("DeleteGatewayAuthConsumerResponse.Message"));
		deleteGatewayAuthConsumerResponse.setDynamicCode(_ctx.stringValue("DeleteGatewayAuthConsumerResponse.DynamicCode"));
		deleteGatewayAuthConsumerResponse.setDynamicMessage(_ctx.stringValue("DeleteGatewayAuthConsumerResponse.DynamicMessage"));
		deleteGatewayAuthConsumerResponse.setData(_ctx.booleanValue("DeleteGatewayAuthConsumerResponse.Data"));
	 
	 	return deleteGatewayAuthConsumerResponse;
	}
}