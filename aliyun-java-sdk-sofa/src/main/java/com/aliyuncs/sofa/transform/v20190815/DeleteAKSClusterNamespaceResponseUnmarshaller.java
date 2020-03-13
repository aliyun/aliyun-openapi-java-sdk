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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.DeleteAKSClusterNamespaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAKSClusterNamespaceResponseUnmarshaller {

	public static DeleteAKSClusterNamespaceResponse unmarshall(DeleteAKSClusterNamespaceResponse deleteAKSClusterNamespaceResponse, UnmarshallerContext _ctx) {
		
		deleteAKSClusterNamespaceResponse.setRequestId(_ctx.stringValue("DeleteAKSClusterNamespaceResponse.RequestId"));
		deleteAKSClusterNamespaceResponse.setResultCode(_ctx.stringValue("DeleteAKSClusterNamespaceResponse.ResultCode"));
		deleteAKSClusterNamespaceResponse.setResultMessage(_ctx.stringValue("DeleteAKSClusterNamespaceResponse.ResultMessage"));
		deleteAKSClusterNamespaceResponse.setName(_ctx.stringValue("DeleteAKSClusterNamespaceResponse.Name"));
	 
	 	return deleteAKSClusterNamespaceResponse;
	}
}