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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.GetTemplateResponse;
import com.aliyuncs.ros.model.v20190910.GetTemplateResponse.Permission;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateResponseUnmarshaller {

	public static GetTemplateResponse unmarshall(GetTemplateResponse getTemplateResponse, UnmarshallerContext _ctx) {
		
		getTemplateResponse.setRequestId(_ctx.stringValue("GetTemplateResponse.RequestId"));
		getTemplateResponse.setTemplateBody(_ctx.stringValue("GetTemplateResponse.TemplateBody"));
		getTemplateResponse.setStackId(_ctx.stringValue("GetTemplateResponse.StackId"));
		getTemplateResponse.setTemplateId(_ctx.stringValue("GetTemplateResponse.TemplateId"));
		getTemplateResponse.setStackGroupName(_ctx.stringValue("GetTemplateResponse.StackGroupName"));
		getTemplateResponse.setChangeSetId(_ctx.stringValue("GetTemplateResponse.ChangeSetId"));
		getTemplateResponse.setRegionId(_ctx.stringValue("GetTemplateResponse.RegionId"));
		getTemplateResponse.setCreateTime(_ctx.stringValue("GetTemplateResponse.CreateTime"));
		getTemplateResponse.setDescription(_ctx.stringValue("GetTemplateResponse.Description"));
		getTemplateResponse.setTemplateName(_ctx.stringValue("GetTemplateResponse.TemplateName"));
		getTemplateResponse.setUpdateTime(_ctx.stringValue("GetTemplateResponse.UpdateTime"));
		getTemplateResponse.setTemplateVersion(_ctx.stringValue("GetTemplateResponse.TemplateVersion"));
		getTemplateResponse.setShareType(_ctx.stringValue("GetTemplateResponse.ShareType"));
		getTemplateResponse.setOwnerId(_ctx.stringValue("GetTemplateResponse.OwnerId"));
		getTemplateResponse.setTemplateARN(_ctx.stringValue("GetTemplateResponse.TemplateARN"));

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateResponse.Permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setShareOption(_ctx.stringValue("GetTemplateResponse.Permissions["+ i +"].ShareOption"));
			permission.setVersionOption(_ctx.stringValue("GetTemplateResponse.Permissions["+ i +"].VersionOption"));
			permission.setTemplateVersion(_ctx.stringValue("GetTemplateResponse.Permissions["+ i +"].TemplateVersion"));
			permission.setAccountId(_ctx.stringValue("GetTemplateResponse.Permissions["+ i +"].AccountId"));

			permissions.add(permission);
		}
		getTemplateResponse.setPermissions(permissions);
	 
	 	return getTemplateResponse;
	}
}