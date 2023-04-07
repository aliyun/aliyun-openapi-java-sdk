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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.ListFilePermissionResponse;
import com.aliyuncs.ecd.model.v20200930.ListFilePermissionResponse.FilePermission;
import com.aliyuncs.ecd.model.v20200930.ListFilePermissionResponse.FilePermission.CdsIdentity;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFilePermissionResponseUnmarshaller {

	public static ListFilePermissionResponse unmarshall(ListFilePermissionResponse listFilePermissionResponse, UnmarshallerContext _ctx) {
		
		listFilePermissionResponse.setRequestId(_ctx.stringValue("ListFilePermissionResponse.RequestId"));

		List<FilePermission> filePermissions = new ArrayList<FilePermission>();
		for (int i = 0; i < _ctx.lengthValue("ListFilePermissionResponse.FilePermissions.Length"); i++) {
			FilePermission filePermission = new FilePermission();
			filePermission.setRoleId(_ctx.stringValue("ListFilePermissionResponse.FilePermissions["+ i +"].RoleId"));
			filePermission.setExpireTime(_ctx.longValue("ListFilePermissionResponse.FilePermissions["+ i +"].ExpireTime"));
			filePermission.setDisinheritSubGroup(_ctx.booleanValue("ListFilePermissionResponse.FilePermissions["+ i +"].DisinheritSubGroup"));

			CdsIdentity cdsIdentity = new CdsIdentity();
			cdsIdentity.setId(_ctx.stringValue("ListFilePermissionResponse.FilePermissions["+ i +"].CdsIdentity.Id"));
			cdsIdentity.setType(_ctx.stringValue("ListFilePermissionResponse.FilePermissions["+ i +"].CdsIdentity.Type"));
			filePermission.setCdsIdentity(cdsIdentity);

			filePermissions.add(filePermission);
		}
		listFilePermissionResponse.setFilePermissions(filePermissions);
	 
	 	return listFilePermissionResponse;
	}
}