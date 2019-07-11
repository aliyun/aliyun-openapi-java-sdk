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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListSubAccountResponse;
import com.aliyuncs.edas.model.v20170801.ListSubAccountResponse.SubAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubAccountResponseUnmarshaller {

	public static ListSubAccountResponse unmarshall(ListSubAccountResponse listSubAccountResponse, UnmarshallerContext _ctx) {
		
		listSubAccountResponse.setRequestId(_ctx.stringValue("ListSubAccountResponse.RequestId"));
		listSubAccountResponse.setCode(_ctx.integerValue("ListSubAccountResponse.Code"));
		listSubAccountResponse.setMessage(_ctx.stringValue("ListSubAccountResponse.Message"));

		List<SubAccount> subAccountList = new ArrayList<SubAccount>();
		for (int i = 0; i < _ctx.lengthValue("ListSubAccountResponse.SubAccountList.Length"); i++) {
			SubAccount subAccount = new SubAccount();
			subAccount.setAdminUserId(_ctx.stringValue("ListSubAccountResponse.SubAccountList["+ i +"].AdminUserId"));
			subAccount.setSubUserId(_ctx.stringValue("ListSubAccountResponse.SubAccountList["+ i +"].SubUserId"));
			subAccount.setEmail(_ctx.stringValue("ListSubAccountResponse.SubAccountList["+ i +"].Email"));
			subAccount.setPhone(_ctx.stringValue("ListSubAccountResponse.SubAccountList["+ i +"].Phone"));
			subAccount.setAdminUserKp(_ctx.stringValue("ListSubAccountResponse.SubAccountList["+ i +"].AdminUserKp"));
			subAccount.setSubUserKp(_ctx.stringValue("ListSubAccountResponse.SubAccountList["+ i +"].SubUserKp"));

			subAccountList.add(subAccount);
		}
		listSubAccountResponse.setSubAccountList(subAccountList);
	 
	 	return listSubAccountResponse;
	}
}