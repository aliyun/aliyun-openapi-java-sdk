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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.ListOrganizationRoleUsersResponse;
import com.aliyuncs.quickbi_public.model.v20220101.ListOrganizationRoleUsersResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.ListOrganizationRoleUsersResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrganizationRoleUsersResponseUnmarshaller {

	public static ListOrganizationRoleUsersResponse unmarshall(ListOrganizationRoleUsersResponse listOrganizationRoleUsersResponse, UnmarshallerContext _ctx) {
		
		listOrganizationRoleUsersResponse.setRequestId(_ctx.stringValue("ListOrganizationRoleUsersResponse.RequestId"));
		listOrganizationRoleUsersResponse.setSuccess(_ctx.booleanValue("ListOrganizationRoleUsersResponse.Success"));

		Result result = new Result();
		result.setPageNum(_ctx.integerValue("ListOrganizationRoleUsersResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("ListOrganizationRoleUsersResponse.Result.PageSize"));
		result.setTotalNum(_ctx.integerValue("ListOrganizationRoleUsersResponse.Result.TotalNum"));
		result.setTotalPages(_ctx.integerValue("ListOrganizationRoleUsersResponse.Result.TotalPages"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListOrganizationRoleUsersResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setNickName(_ctx.stringValue("ListOrganizationRoleUsersResponse.Result.Data["+ i +"].NickName"));
			dataItem.setUserId(_ctx.stringValue("ListOrganizationRoleUsersResponse.Result.Data["+ i +"].UserId"));

			data.add(dataItem);
		}
		result.setData(data);
		listOrganizationRoleUsersResponse.setResult(result);
	 
	 	return listOrganizationRoleUsersResponse;
	}
}