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

import com.aliyuncs.zhuque.model.v20160701.ListCustomerResponse;
import com.aliyuncs.zhuque.model.v20160701.ListCustomerResponse.CustomerRespItem;
import com.aliyuncs.zhuque.model.v20160701.ListCustomerResponse.CustomerRespItem.UserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomerResponseUnmarshaller {

	public static ListCustomerResponse unmarshall(ListCustomerResponse listCustomerResponse, UnmarshallerContext context) {
		
		listCustomerResponse.setRequestId(context.stringValue("ListCustomerResponse.RequestId"));
		listCustomerResponse.setResult(context.stringValue("ListCustomerResponse.Result"));
		listCustomerResponse.setMessage(context.stringValue("ListCustomerResponse.Message"));

		List<CustomerRespItem> customerResp = new ArrayList<CustomerRespItem>();
		for (int i = 0; i < context.lengthValue("ListCustomerResponse.CustomerResp.Length"); i++) {
			CustomerRespItem customerRespItem = new CustomerRespItem();
			customerRespItem.setCustomerId(context.stringValue("ListCustomerResponse.CustomerResp["+ i +"].CustomerId"));
			customerRespItem.setCustomerName(context.stringValue("ListCustomerResponse.CustomerResp["+ i +"].CustomerName"));
			customerRespItem.setCustomerType(context.stringValue("ListCustomerResponse.CustomerResp["+ i +"].CustomerType"));
			customerRespItem.setDescription(context.stringValue("ListCustomerResponse.CustomerResp["+ i +"].Description"));
			customerRespItem.setOrigin(context.stringValue("ListCustomerResponse.CustomerResp["+ i +"].Origin"));

			List<UserListItem> userList = new ArrayList<UserListItem>();
			for (int j = 0; j < context.lengthValue("ListCustomerResponse.CustomerResp["+ i +"].UserList.Length"); j++) {
				UserListItem userListItem = new UserListItem();
				userListItem.setEmpId(context.stringValue("ListCustomerResponse.CustomerResp["+ i +"].UserList["+ j +"].EmpId"));
				userListItem.setAccount(context.stringValue("ListCustomerResponse.CustomerResp["+ i +"].UserList["+ j +"].Account"));
				userListItem.setEmailAddr(context.stringValue("ListCustomerResponse.CustomerResp["+ i +"].UserList["+ j +"].EmailAddr"));
				userListItem.setLastName(context.stringValue("ListCustomerResponse.CustomerResp["+ i +"].UserList["+ j +"].LastName"));
				userListItem.setUserType(context.stringValue("ListCustomerResponse.CustomerResp["+ i +"].UserList["+ j +"].UserType"));
				userListItem.setNickNameCn(context.stringValue("ListCustomerResponse.CustomerResp["+ i +"].UserList["+ j +"].NickNameCn"));

				userList.add(userListItem);
			}
			customerRespItem.setUserList(userList);

			customerResp.add(customerRespItem);
		}
		listCustomerResponse.setCustomerResp(customerResp);
	 
	 	return listCustomerResponse;
	}
}