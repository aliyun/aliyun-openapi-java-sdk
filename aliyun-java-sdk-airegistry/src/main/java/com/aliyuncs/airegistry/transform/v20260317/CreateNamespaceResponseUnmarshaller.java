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

package com.aliyuncs.airegistry.transform.v20260317;

import com.aliyuncs.airegistry.model.v20260317.CreateNamespaceResponse;
import com.aliyuncs.airegistry.model.v20260317.CreateNamespaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNamespaceResponseUnmarshaller {

	public static CreateNamespaceResponse unmarshall(CreateNamespaceResponse createNamespaceResponse, UnmarshallerContext _ctx) {
		
		createNamespaceResponse.setRequestId(_ctx.stringValue("CreateNamespaceResponse.RequestId"));

		Data data = new Data();
		data.setNamespaceId(_ctx.stringValue("CreateNamespaceResponse.Data.NamespaceId"));
		createNamespaceResponse.setData(data);
	 
	 	return createNamespaceResponse;
	}
}