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

package com.aliyuncs.acm.transform.v20200206;

import com.aliyuncs.acm.model.v20200206.CreateNamespaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNamespaceResponseUnmarshaller {

	public static CreateNamespaceResponse unmarshall(CreateNamespaceResponse createNamespaceResponse, UnmarshallerContext _ctx) {
		
		createNamespaceResponse.setRequestId(_ctx.stringValue("CreateNamespaceResponse.RequestId"));
		createNamespaceResponse.setCode(_ctx.stringValue("CreateNamespaceResponse.Code"));
		createNamespaceResponse.setMessage(_ctx.stringValue("CreateNamespaceResponse.Message"));
		createNamespaceResponse.setNamespaceId(_ctx.stringValue("CreateNamespaceResponse.NamespaceId"));
	 
	 	return createNamespaceResponse;
	}
}