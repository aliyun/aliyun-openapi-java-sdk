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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.UpdateNamespaceVpcResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateNamespaceVpcResponseUnmarshaller {

	public static UpdateNamespaceVpcResponse unmarshall(UpdateNamespaceVpcResponse updateNamespaceVpcResponse, UnmarshallerContext _ctx) {
		
		updateNamespaceVpcResponse.setRequestId(_ctx.stringValue("UpdateNamespaceVpcResponse.RequestId"));
		updateNamespaceVpcResponse.setCode(_ctx.stringValue("UpdateNamespaceVpcResponse.Code"));
		updateNamespaceVpcResponse.setMessage(_ctx.stringValue("UpdateNamespaceVpcResponse.Message"));
		updateNamespaceVpcResponse.setErrorCode(_ctx.stringValue("UpdateNamespaceVpcResponse.ErrorCode"));
		updateNamespaceVpcResponse.setTraceId(_ctx.stringValue("UpdateNamespaceVpcResponse.TraceId"));
		updateNamespaceVpcResponse.setSuccess(_ctx.booleanValue("UpdateNamespaceVpcResponse.Success"));
	 
	 	return updateNamespaceVpcResponse;
	}
}