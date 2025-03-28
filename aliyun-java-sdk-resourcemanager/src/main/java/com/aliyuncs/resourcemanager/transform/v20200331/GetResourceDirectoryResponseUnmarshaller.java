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

package com.aliyuncs.resourcemanager.transform.v20200331;

import com.aliyuncs.resourcemanager.model.v20200331.GetResourceDirectoryResponse;
import com.aliyuncs.resourcemanager.model.v20200331.GetResourceDirectoryResponse.ResourceDirectory;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceDirectoryResponseUnmarshaller {

	public static GetResourceDirectoryResponse unmarshall(GetResourceDirectoryResponse getResourceDirectoryResponse, UnmarshallerContext _ctx) {
		
		getResourceDirectoryResponse.setRequestId(_ctx.stringValue("GetResourceDirectoryResponse.RequestId"));

		ResourceDirectory resourceDirectory = new ResourceDirectory();
		resourceDirectory.setControlPolicyStatus(_ctx.stringValue("GetResourceDirectoryResponse.ResourceDirectory.ControlPolicyStatus"));
		resourceDirectory.setCreateTime(_ctx.stringValue("GetResourceDirectoryResponse.ResourceDirectory.CreateTime"));
		resourceDirectory.setIdentityInformation(_ctx.stringValue("GetResourceDirectoryResponse.ResourceDirectory.IdentityInformation"));
		resourceDirectory.setMasterAccountId(_ctx.stringValue("GetResourceDirectoryResponse.ResourceDirectory.MasterAccountId"));
		resourceDirectory.setMasterAccountName(_ctx.stringValue("GetResourceDirectoryResponse.ResourceDirectory.MasterAccountName"));
		resourceDirectory.setMemberDeletionStatus(_ctx.stringValue("GetResourceDirectoryResponse.ResourceDirectory.MemberDeletionStatus"));
		resourceDirectory.setResourceDirectoryId(_ctx.stringValue("GetResourceDirectoryResponse.ResourceDirectory.ResourceDirectoryId"));
		resourceDirectory.setRootFolderId(_ctx.stringValue("GetResourceDirectoryResponse.ResourceDirectory.RootFolderId"));
		resourceDirectory.setScpStatus(_ctx.stringValue("GetResourceDirectoryResponse.ResourceDirectory.ScpStatus"));
		getResourceDirectoryResponse.setResourceDirectory(resourceDirectory);
	 
	 	return getResourceDirectoryResponse;
	}
}