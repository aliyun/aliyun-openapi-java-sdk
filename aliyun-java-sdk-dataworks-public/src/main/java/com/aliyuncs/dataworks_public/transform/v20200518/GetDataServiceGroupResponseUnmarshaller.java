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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceGroupResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceGroupResponse.Group;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceGroupResponseUnmarshaller {

	public static GetDataServiceGroupResponse unmarshall(GetDataServiceGroupResponse getDataServiceGroupResponse, UnmarshallerContext _ctx) {
		
		getDataServiceGroupResponse.setRequestId(_ctx.stringValue("GetDataServiceGroupResponse.RequestId"));

		Group group = new Group();
		group.setTenantId(_ctx.longValue("GetDataServiceGroupResponse.Group.TenantId"));
		group.setProjectId(_ctx.longValue("GetDataServiceGroupResponse.Group.ProjectId"));
		group.setGroupId(_ctx.stringValue("GetDataServiceGroupResponse.Group.GroupId"));
		group.setApiGatewayGroupId(_ctx.stringValue("GetDataServiceGroupResponse.Group.ApiGatewayGroupId"));
		group.setGroupName(_ctx.stringValue("GetDataServiceGroupResponse.Group.GroupName"));
		group.setDescription(_ctx.stringValue("GetDataServiceGroupResponse.Group.Description"));
		group.setCreatedTime(_ctx.stringValue("GetDataServiceGroupResponse.Group.CreatedTime"));
		group.setModifiedTime(_ctx.stringValue("GetDataServiceGroupResponse.Group.ModifiedTime"));
		group.setCreatorId(_ctx.stringValue("GetDataServiceGroupResponse.Group.CreatorId"));
		getDataServiceGroupResponse.setGroup(group);
	 
	 	return getDataServiceGroupResponse;
	}
}