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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20180619.CreateServiceLinkedRoleResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.CreateServiceLinkedRoleResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateServiceLinkedRoleResponseUnmarshaller {

	public static CreateServiceLinkedRoleResponse unmarshall(CreateServiceLinkedRoleResponse createServiceLinkedRoleResponse, UnmarshallerContext _ctx) {
		
		createServiceLinkedRoleResponse.setRequestId(_ctx.stringValue("CreateServiceLinkedRoleResponse.RequestId"));
		createServiceLinkedRoleResponse.setRegionId(_ctx.stringValue("CreateServiceLinkedRoleResponse.RegionId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateServiceLinkedRoleResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setArn(_ctx.stringValue("CreateServiceLinkedRoleResponse.Data["+ i +"].Arn"));
			dataItem.setAssumeRolePolicyDocument(_ctx.stringValue("CreateServiceLinkedRoleResponse.Data["+ i +"].AssumeRolePolicyDocument"));
			dataItem.setCreateDate(_ctx.stringValue("CreateServiceLinkedRoleResponse.Data["+ i +"].CreateDate"));
			dataItem.setDescription(_ctx.stringValue("CreateServiceLinkedRoleResponse.Data["+ i +"].Description"));
			dataItem.setIsServiceLinkRole(_ctx.booleanValue("CreateServiceLinkedRoleResponse.Data["+ i +"].IsServiceLinkRole"));
			dataItem.setRoleId(_ctx.stringValue("CreateServiceLinkedRoleResponse.Data["+ i +"].RoleId"));
			dataItem.setRoleName(_ctx.stringValue("CreateServiceLinkedRoleResponse.Data["+ i +"].RoleName"));
			dataItem.setRolePrincipalName(_ctx.stringValue("CreateServiceLinkedRoleResponse.Data["+ i +"].RolePrincipalName"));

			data.add(dataItem);
		}
		createServiceLinkedRoleResponse.setData(data);
	 
	 	return createServiceLinkedRoleResponse;
	}
}