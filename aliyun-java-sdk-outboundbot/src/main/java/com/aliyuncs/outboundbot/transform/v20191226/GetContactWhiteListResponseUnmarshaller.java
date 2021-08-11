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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.GetContactWhiteListResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetContactWhiteListResponse.ContactWhitelistList;
import com.aliyuncs.outboundbot.model.v20191226.GetContactWhiteListResponse.ContactWhitelistList.ContactWhitelistList1;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContactWhiteListResponseUnmarshaller {

	public static GetContactWhiteListResponse unmarshall(GetContactWhiteListResponse getContactWhiteListResponse, UnmarshallerContext _ctx) {
		
		getContactWhiteListResponse.setRequestId(_ctx.stringValue("GetContactWhiteListResponse.RequestId"));
		getContactWhiteListResponse.setSuccess(_ctx.booleanValue("GetContactWhiteListResponse.Success"));
		getContactWhiteListResponse.setCode(_ctx.stringValue("GetContactWhiteListResponse.Code"));
		getContactWhiteListResponse.setMessage(_ctx.stringValue("GetContactWhiteListResponse.Message"));
		getContactWhiteListResponse.setHttpStatusCode(_ctx.integerValue("GetContactWhiteListResponse.HttpStatusCode"));

		ContactWhitelistList contactWhitelistList = new ContactWhitelistList();
		contactWhitelistList.setPageSize(_ctx.integerValue("GetContactWhiteListResponse.ContactWhitelistList.PageSize"));
		contactWhitelistList.setPageNumber(_ctx.integerValue("GetContactWhiteListResponse.ContactWhitelistList.PageNumber"));
		contactWhitelistList.setTotalCount(_ctx.integerValue("GetContactWhiteListResponse.ContactWhitelistList.TotalCount"));

		List<ContactWhitelistList1> list = new ArrayList<ContactWhitelistList1>();
		for (int i = 0; i < _ctx.lengthValue("GetContactWhiteListResponse.ContactWhitelistList.List.Length"); i++) {
			ContactWhitelistList1 contactWhitelistList1 = new ContactWhitelistList1();
			contactWhitelistList1.setContactWhiteListId(_ctx.stringValue("GetContactWhiteListResponse.ContactWhitelistList.List["+ i +"].ContactWhiteListId"));
			contactWhitelistList1.setInstanceId(_ctx.stringValue("GetContactWhiteListResponse.ContactWhitelistList.List["+ i +"].InstanceId"));
			contactWhitelistList1.setCreationTime(_ctx.longValue("GetContactWhiteListResponse.ContactWhitelistList.List["+ i +"].CreationTime"));
			contactWhitelistList1.setPhoneNumber(_ctx.stringValue("GetContactWhiteListResponse.ContactWhitelistList.List["+ i +"].PhoneNumber"));
			contactWhitelistList1.setName(_ctx.stringValue("GetContactWhiteListResponse.ContactWhitelistList.List["+ i +"].Name"));
			contactWhitelistList1.setCreator(_ctx.stringValue("GetContactWhiteListResponse.ContactWhitelistList.List["+ i +"].Creator"));
			contactWhitelistList1.setOperator(_ctx.stringValue("GetContactWhiteListResponse.ContactWhitelistList.List["+ i +"].Operator"));
			contactWhitelistList1.setRemark(_ctx.stringValue("GetContactWhiteListResponse.ContactWhitelistList.List["+ i +"].Remark"));

			list.add(contactWhitelistList1);
		}
		contactWhitelistList.setList(list);
		getContactWhiteListResponse.setContactWhitelistList(contactWhitelistList);
	 
	 	return getContactWhiteListResponse;
	}
}