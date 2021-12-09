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

import com.aliyuncs.sae.model.v20190506.CreateNamespaceResponse;
import com.aliyuncs.sae.model.v20190506.CreateNamespaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNamespaceResponseUnmarshaller {

	public static CreateNamespaceResponse unmarshall(CreateNamespaceResponse createNamespaceResponse, UnmarshallerContext _ctx) {
		
		createNamespaceResponse.setRequestId(_ctx.stringValue("CreateNamespaceResponse.RequestId"));
		createNamespaceResponse.setMessage(_ctx.stringValue("CreateNamespaceResponse.Message"));
		createNamespaceResponse.setTraceId(_ctx.stringValue("CreateNamespaceResponse.TraceId"));
		createNamespaceResponse.setErrorCode(_ctx.stringValue("CreateNamespaceResponse.ErrorCode"));
		createNamespaceResponse.setCode(_ctx.stringValue("CreateNamespaceResponse.Code"));
		createNamespaceResponse.setSuccess(_ctx.booleanValue("CreateNamespaceResponse.Success"));

		Data data = new Data();
		data.setNamespaceDescription(_ctx.stringValue("CreateNamespaceResponse.Data.NamespaceDescription"));
		data.setNamespaceId(_ctx.stringValue("CreateNamespaceResponse.Data.NamespaceId"));
		data.setNamespaceName(_ctx.stringValue("CreateNamespaceResponse.Data.NamespaceName"));
		data.setRegionId(_ctx.stringValue("CreateNamespaceResponse.Data.RegionId"));
		createNamespaceResponse.setData(data);
	 
	 	return createNamespaceResponse;
	}
}