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

import com.aliyuncs.mse.model.v20190531.DeleteNamespaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteNamespaceResponseUnmarshaller {

	public static DeleteNamespaceResponse unmarshall(DeleteNamespaceResponse deleteNamespaceResponse, UnmarshallerContext _ctx) {
		
		deleteNamespaceResponse.setRequestId(_ctx.stringValue("DeleteNamespaceResponse.RequestId"));
		deleteNamespaceResponse.setHttpStatusCode(_ctx.integerValue("DeleteNamespaceResponse.HttpStatusCode"));
		deleteNamespaceResponse.setMessage(_ctx.stringValue("DeleteNamespaceResponse.Message"));
		deleteNamespaceResponse.setSuccess(_ctx.booleanValue("DeleteNamespaceResponse.Success"));
		deleteNamespaceResponse.setErrorCode(_ctx.stringValue("DeleteNamespaceResponse.ErrorCode"));
		deleteNamespaceResponse.setData(_ctx.longValue("DeleteNamespaceResponse.Data"));
	 
	 	return deleteNamespaceResponse;
	}
}