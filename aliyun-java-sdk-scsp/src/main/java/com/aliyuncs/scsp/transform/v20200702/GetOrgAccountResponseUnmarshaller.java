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

package com.aliyuncs.scsp.transform.v20200702;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.GetOrgAccountResponse;
import com.aliyuncs.scsp.model.v20200702.GetOrgAccountResponse.DataItem;
import com.aliyuncs.scsp.model.v20200702.GetOrgAccountResponse.DataItem.AccountItem;
import com.aliyuncs.scsp.model.v20200702.GetOrgAccountResponse.DataItem.AccountItem.RolesItem;
import com.aliyuncs.scsp.model.v20200702.GetOrgAccountResponse.DataItem.CurrentDept;
import com.aliyuncs.scsp.model.v20200702.GetOrgAccountResponse.DataItem.ParentDeptItem;
import com.aliyuncs.scsp.model.v20200702.GetOrgAccountResponse.DataItem.SubDeptItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrgAccountResponseUnmarshaller {

	public static GetOrgAccountResponse unmarshall(GetOrgAccountResponse getOrgAccountResponse, UnmarshallerContext _ctx) {
		
		getOrgAccountResponse.setRequestId(_ctx.stringValue("GetOrgAccountResponse.RequestId"));
		getOrgAccountResponse.setMessage(_ctx.stringValue("GetOrgAccountResponse.Message"));
		getOrgAccountResponse.setCode(_ctx.stringValue("GetOrgAccountResponse.Code"));
		getOrgAccountResponse.setSuccess(_ctx.booleanValue("GetOrgAccountResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOrgAccountResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();

			CurrentDept currentDept = new CurrentDept();
			currentDept.setParentCode(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].CurrentDept.ParentCode"));
			currentDept.setCode(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].CurrentDept.Code"));
			currentDept.setName(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].CurrentDept.Name"));
			dataItem.setCurrentDept(currentDept);

			List<AccountItem> account = new ArrayList<AccountItem>();
			for (int j = 0; j < _ctx.lengthValue("GetOrgAccountResponse.Data["+ i +"].Account.Length"); j++) {
				AccountItem accountItem = new AccountItem();
				accountItem.setDeptCode(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].Account["+ j +"].DeptCode"));
				accountItem.setUserId(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].Account["+ j +"].UserId"));
				accountItem.setNick(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].Account["+ j +"].Nick"));
				accountItem.setName(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].Account["+ j +"].Name"));

				List<RolesItem> roles = new ArrayList<RolesItem>();
				for (int k = 0; k < _ctx.lengthValue("GetOrgAccountResponse.Data["+ i +"].Account["+ j +"].Roles.Length"); k++) {
					RolesItem rolesItem = new RolesItem();
					rolesItem.setId(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].Account["+ j +"].Roles["+ k +"].Id"));
					rolesItem.setName(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].Account["+ j +"].Roles["+ k +"].Name"));

					roles.add(rolesItem);
				}
				accountItem.setRoles(roles);

				account.add(accountItem);
			}
			dataItem.setAccount(account);

			List<SubDeptItem> subDept = new ArrayList<SubDeptItem>();
			for (int j = 0; j < _ctx.lengthValue("GetOrgAccountResponse.Data["+ i +"].SubDept.Length"); j++) {
				SubDeptItem subDeptItem = new SubDeptItem();
				subDeptItem.setParentCode(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].SubDept["+ j +"].ParentCode"));
				subDeptItem.setCode(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].SubDept["+ j +"].Code"));
				subDeptItem.setName(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].SubDept["+ j +"].Name"));

				subDept.add(subDeptItem);
			}
			dataItem.setSubDept(subDept);

			List<ParentDeptItem> parentDept = new ArrayList<ParentDeptItem>();
			for (int j = 0; j < _ctx.lengthValue("GetOrgAccountResponse.Data["+ i +"].ParentDept.Length"); j++) {
				ParentDeptItem parentDeptItem = new ParentDeptItem();
				parentDeptItem.setParentCode(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].ParentDept["+ j +"].ParentCode"));
				parentDeptItem.setCode(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].ParentDept["+ j +"].Code"));
				parentDeptItem.setName(_ctx.stringValue("GetOrgAccountResponse.Data["+ i +"].ParentDept["+ j +"].Name"));

				parentDept.add(parentDeptItem);
			}
			dataItem.setParentDept(parentDept);

			data.add(dataItem);
		}
		getOrgAccountResponse.setData(data);
	 
	 	return getOrgAccountResponse;
	}
}