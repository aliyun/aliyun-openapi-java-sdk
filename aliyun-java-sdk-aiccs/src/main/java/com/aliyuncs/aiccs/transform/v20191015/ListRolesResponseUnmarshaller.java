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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.ListRolesResponse;
import com.aliyuncs.aiccs.model.v20191015.ListRolesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRolesResponseUnmarshaller {

	public static ListRolesResponse unmarshall(ListRolesResponse listRolesResponse, UnmarshallerContext _ctx) {
		
		listRolesResponse.setRequestId(_ctx.stringValue("ListRolesResponse.RequestId"));
		listRolesResponse.setMessage(_ctx.stringValue("ListRolesResponse.Message"));
		listRolesResponse.setHttpStatusCode(_ctx.integerValue("ListRolesResponse.HttpStatusCode"));
		listRolesResponse.setSuccess(_ctx.booleanValue("ListRolesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRolesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRoleId(_ctx.longValue("ListRolesResponse.Data["+ i +"].RoleId"));
			dataItem.setCreateTime(_ctx.stringValue("ListRolesResponse.Data["+ i +"].CreateTime"));
			dataItem.setBuId(_ctx.longValue("ListRolesResponse.Data["+ i +"].BuId"));
			dataItem.setTitle(_ctx.stringValue("ListRolesResponse.Data["+ i +"].Title"));
			dataItem.setCode(_ctx.stringValue("ListRolesResponse.Data["+ i +"].Code"));
			dataItem.setDescription(_ctx.stringValue("ListRolesResponse.Data["+ i +"].Description"));
			dataItem.setRoleGroupId(_ctx.longValue("ListRolesResponse.Data["+ i +"].RoleGroupId"));
			dataItem.setRoleGroupName(_ctx.stringValue("ListRolesResponse.Data["+ i +"].RoleGroupName"));

			data.add(dataItem);
		}
		listRolesResponse.setData(data);
	 
	 	return listRolesResponse;
	}
}