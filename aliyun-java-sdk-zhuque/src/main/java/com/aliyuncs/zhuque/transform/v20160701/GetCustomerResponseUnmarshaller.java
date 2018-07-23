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

package com.aliyuncs.zhuque.transform.v20160701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.zhuque.model.v20160701.GetCustomerResponse;
import com.aliyuncs.zhuque.model.v20160701.GetCustomerResponse.CustomerResp;
import com.aliyuncs.zhuque.model.v20160701.GetCustomerResponse.CustomerResp.UserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomerResponseUnmarshaller {

	public static GetCustomerResponse unmarshall(GetCustomerResponse getCustomerResponse, UnmarshallerContext context) {
		
		getCustomerResponse.setRequestId(context.stringValue("GetCustomerResponse.RequestId"));
		getCustomerResponse.setResult(context.stringValue("GetCustomerResponse.Result"));
		getCustomerResponse.setMessage(context.stringValue("GetCustomerResponse.Message"));

		CustomerResp customerResp = new CustomerResp();
		customerResp.setCustomerId(context.stringValue("GetCustomerResponse.CustomerResp.CustomerId"));
		customerResp.setCustomerName(context.stringValue("GetCustomerResponse.CustomerResp.CustomerName"));
		customerResp.setCustomerType(context.stringValue("GetCustomerResponse.CustomerResp.CustomerType"));
		customerResp.setDescription(context.stringValue("GetCustomerResponse.CustomerResp.Description"));
		customerResp.setOrigin(context.stringValue("GetCustomerResponse.CustomerResp.Origin"));

		List<UserListItem> userList = new ArrayList<UserListItem>();
		for (int i = 0; i < context.lengthValue("GetCustomerResponse.CustomerResp.UserList.Length"); i++) {
			UserListItem userListItem = new UserListItem();
			userListItem.setEmpId(context.stringValue("GetCustomerResponse.CustomerResp.UserList["+ i +"].EmpId"));
			userListItem.setAccount(context.stringValue("GetCustomerResponse.CustomerResp.UserList["+ i +"].Account"));
			userListItem.setEmailAddr(context.stringValue("GetCustomerResponse.CustomerResp.UserList["+ i +"].EmailAddr"));
			userListItem.setLastName(context.stringValue("GetCustomerResponse.CustomerResp.UserList["+ i +"].LastName"));
			userListItem.setUserType(context.stringValue("GetCustomerResponse.CustomerResp.UserList["+ i +"].UserType"));
			userListItem.setNickNameCn(context.stringValue("GetCustomerResponse.CustomerResp.UserList["+ i +"].NickNameCn"));

			userList.add(userListItem);
		}
		customerResp.setUserList(userList);
		getCustomerResponse.setCustomerResp(customerResp);
	 
	 	return getCustomerResponse;
	}
}