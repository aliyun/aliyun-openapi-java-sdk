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

import com.aliyuncs.resourcemanager.model.v20200331.EnableResourceDirectoryResponse;
import com.aliyuncs.resourcemanager.model.v20200331.EnableResourceDirectoryResponse.ResourceDirectory;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableResourceDirectoryResponseUnmarshaller {

	public static EnableResourceDirectoryResponse unmarshall(EnableResourceDirectoryResponse enableResourceDirectoryResponse, UnmarshallerContext _ctx) {
		
		enableResourceDirectoryResponse.setRequestId(_ctx.stringValue("EnableResourceDirectoryResponse.RequestId"));

		ResourceDirectory resourceDirectory = new ResourceDirectory();
		resourceDirectory.setResourceDirectoryId(_ctx.stringValue("EnableResourceDirectoryResponse.ResourceDirectory.ResourceDirectoryId"));
		resourceDirectory.setMasterAccountId(_ctx.stringValue("EnableResourceDirectoryResponse.ResourceDirectory.MasterAccountId"));
		resourceDirectory.setMasterAccountName(_ctx.stringValue("EnableResourceDirectoryResponse.ResourceDirectory.MasterAccountName"));
		resourceDirectory.setRootFolderId(_ctx.stringValue("EnableResourceDirectoryResponse.ResourceDirectory.RootFolderId"));
		resourceDirectory.setCreateTime(_ctx.stringValue("EnableResourceDirectoryResponse.ResourceDirectory.CreateTime"));
		enableResourceDirectoryResponse.setResourceDirectory(resourceDirectory);
	 
	 	return enableResourceDirectoryResponse;
	}
}