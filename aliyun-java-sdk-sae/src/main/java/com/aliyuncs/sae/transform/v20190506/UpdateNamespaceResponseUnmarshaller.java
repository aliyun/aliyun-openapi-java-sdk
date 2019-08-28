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

import com.aliyuncs.sae.model.v20190506.UpdateNamespaceResponse;
import com.aliyuncs.sae.model.v20190506.UpdateNamespaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateNamespaceResponseUnmarshaller {

	public static UpdateNamespaceResponse unmarshall(UpdateNamespaceResponse updateNamespaceResponse, UnmarshallerContext _ctx) {
		
		updateNamespaceResponse.setRequestId(_ctx.stringValue("UpdateNamespaceResponse.RequestId"));
		updateNamespaceResponse.setCode(_ctx.stringValue("UpdateNamespaceResponse.Code"));
		updateNamespaceResponse.setErrorCode(_ctx.stringValue("UpdateNamespaceResponse.ErrorCode"));
		updateNamespaceResponse.setMessage(_ctx.stringValue("UpdateNamespaceResponse.Message"));
		updateNamespaceResponse.setSuccess(_ctx.booleanValue("UpdateNamespaceResponse.Success"));
		updateNamespaceResponse.setTraceId(_ctx.stringValue("UpdateNamespaceResponse.TraceId"));

		Data data = new Data();
		data.setRegionId(_ctx.stringValue("UpdateNamespaceResponse.Data.RegionId"));
		data.setNamespaceId(_ctx.stringValue("UpdateNamespaceResponse.Data.NamespaceId"));
		data.setNamespaceName(_ctx.stringValue("UpdateNamespaceResponse.Data.NamespaceName"));
		data.setNamespaceDescription(_ctx.stringValue("UpdateNamespaceResponse.Data.NamespaceDescription"));
		updateNamespaceResponse.setData(data);
	 
	 	return updateNamespaceResponse;
	}
}