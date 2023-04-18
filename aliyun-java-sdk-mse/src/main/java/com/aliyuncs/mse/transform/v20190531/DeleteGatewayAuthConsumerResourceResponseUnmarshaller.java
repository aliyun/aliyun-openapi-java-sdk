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

import com.aliyuncs.mse.model.v20190531.DeleteGatewayAuthConsumerResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGatewayAuthConsumerResourceResponseUnmarshaller {

	public static DeleteGatewayAuthConsumerResourceResponse unmarshall(DeleteGatewayAuthConsumerResourceResponse deleteGatewayAuthConsumerResourceResponse, UnmarshallerContext _ctx) {
		
		deleteGatewayAuthConsumerResourceResponse.setRequestId(_ctx.stringValue("DeleteGatewayAuthConsumerResourceResponse.RequestId"));
		deleteGatewayAuthConsumerResourceResponse.setSuccess(_ctx.booleanValue("DeleteGatewayAuthConsumerResourceResponse.Success"));
		deleteGatewayAuthConsumerResourceResponse.setCode(_ctx.integerValue("DeleteGatewayAuthConsumerResourceResponse.Code"));
		deleteGatewayAuthConsumerResourceResponse.setErrorCode(_ctx.stringValue("DeleteGatewayAuthConsumerResourceResponse.ErrorCode"));
		deleteGatewayAuthConsumerResourceResponse.setHttpStatusCode(_ctx.integerValue("DeleteGatewayAuthConsumerResourceResponse.HttpStatusCode"));
		deleteGatewayAuthConsumerResourceResponse.setMessage(_ctx.stringValue("DeleteGatewayAuthConsumerResourceResponse.Message"));
		deleteGatewayAuthConsumerResourceResponse.setDynamicCode(_ctx.stringValue("DeleteGatewayAuthConsumerResourceResponse.DynamicCode"));
		deleteGatewayAuthConsumerResourceResponse.setDynamicMessage(_ctx.stringValue("DeleteGatewayAuthConsumerResourceResponse.DynamicMessage"));
		deleteGatewayAuthConsumerResourceResponse.setData(_ctx.booleanValue("DeleteGatewayAuthConsumerResourceResponse.Data"));
	 
	 	return deleteGatewayAuthConsumerResourceResponse;
	}
}