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

package com.aliyuncs.cr.transform.v20181201;

import com.aliyuncs.cr.model.v20181201.GetNamespaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNamespaceResponseUnmarshaller {

	public static GetNamespaceResponse unmarshall(GetNamespaceResponse getNamespaceResponse, UnmarshallerContext _ctx) {
		
		getNamespaceResponse.setRequestId(_ctx.stringValue("GetNamespaceResponse.RequestId"));
		getNamespaceResponse.setIsSuccess(_ctx.booleanValue("GetNamespaceResponse.IsSuccess"));
		getNamespaceResponse.setCode(_ctx.stringValue("GetNamespaceResponse.Code"));
		getNamespaceResponse.setNamespaceName(_ctx.stringValue("GetNamespaceResponse.NamespaceName"));
		getNamespaceResponse.setNamespaceStatus(_ctx.stringValue("GetNamespaceResponse.NamespaceStatus"));
		getNamespaceResponse.setAutoCreateRepo(_ctx.booleanValue("GetNamespaceResponse.AutoCreateRepo"));
		getNamespaceResponse.setDefaultRepoType(_ctx.stringValue("GetNamespaceResponse.DefaultRepoType"));
		getNamespaceResponse.setInstanceId(_ctx.stringValue("GetNamespaceResponse.InstanceId"));
		getNamespaceResponse.setNamespaceId(_ctx.stringValue("GetNamespaceResponse.NamespaceId"));
	 
	 	return getNamespaceResponse;
	}
}