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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.CheckResourcePermissionResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CheckResourcePermissionResponse.ResourcePermission;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckResourcePermissionResponseUnmarshaller {

	public static CheckResourcePermissionResponse unmarshall(CheckResourcePermissionResponse checkResourcePermissionResponse, UnmarshallerContext _ctx) {
		
		checkResourcePermissionResponse.setRequestId(_ctx.stringValue("CheckResourcePermissionResponse.RequestId"));
		checkResourcePermissionResponse.setSuccess(_ctx.booleanValue("CheckResourcePermissionResponse.Success"));
		checkResourcePermissionResponse.setHttpStatusCode(_ctx.integerValue("CheckResourcePermissionResponse.HttpStatusCode"));
		checkResourcePermissionResponse.setCode(_ctx.stringValue("CheckResourcePermissionResponse.Code"));
		checkResourcePermissionResponse.setMessage(_ctx.stringValue("CheckResourcePermissionResponse.Message"));

		List<ResourcePermission> resourcePermissionList = new ArrayList<ResourcePermission>();
		for (int i = 0; i < _ctx.lengthValue("CheckResourcePermissionResponse.ResourcePermissionList.Length"); i++) {
			ResourcePermission resourcePermission = new ResourcePermission();
			resourcePermission.setResourceId(_ctx.stringValue("CheckResourcePermissionResponse.ResourcePermissionList["+ i +"].ResourceId"));
			resourcePermission.setHasPermission(_ctx.booleanValue("CheckResourcePermissionResponse.ResourcePermissionList["+ i +"].HasPermission"));

			resourcePermissionList.add(resourcePermission);
		}
		checkResourcePermissionResponse.setResourcePermissionList(resourcePermissionList);
	 
	 	return checkResourcePermissionResponse;
	}
}