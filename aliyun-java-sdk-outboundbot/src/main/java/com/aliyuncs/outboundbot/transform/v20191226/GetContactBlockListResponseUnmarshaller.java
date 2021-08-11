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

import com.aliyuncs.outboundbot.model.v20191226.GetContactBlockListResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetContactBlockListResponse.ContactBlocklistList;
import com.aliyuncs.outboundbot.model.v20191226.GetContactBlockListResponse.ContactBlocklistList.ContactBlockList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContactBlockListResponseUnmarshaller {

	public static GetContactBlockListResponse unmarshall(GetContactBlockListResponse getContactBlockListResponse, UnmarshallerContext _ctx) {
		
		getContactBlockListResponse.setRequestId(_ctx.stringValue("GetContactBlockListResponse.RequestId"));
		getContactBlockListResponse.setSuccess(_ctx.booleanValue("GetContactBlockListResponse.Success"));
		getContactBlockListResponse.setCode(_ctx.stringValue("GetContactBlockListResponse.Code"));
		getContactBlockListResponse.setMessage(_ctx.stringValue("GetContactBlockListResponse.Message"));
		getContactBlockListResponse.setHttpStatusCode(_ctx.integerValue("GetContactBlockListResponse.HttpStatusCode"));

		ContactBlocklistList contactBlocklistList = new ContactBlocklistList();
		contactBlocklistList.setPageNumber(_ctx.integerValue("GetContactBlockListResponse.ContactBlocklistList.PageNumber"));
		contactBlocklistList.setPageSize(_ctx.integerValue("GetContactBlockListResponse.ContactBlocklistList.PageSize"));
		contactBlocklistList.setTotalCount(_ctx.integerValue("GetContactBlockListResponse.ContactBlocklistList.TotalCount"));

		List<ContactBlockList> list = new ArrayList<ContactBlockList>();
		for (int i = 0; i < _ctx.lengthValue("GetContactBlockListResponse.ContactBlocklistList.List.Length"); i++) {
			ContactBlockList contactBlockList = new ContactBlockList();
			contactBlockList.setContactBlockListId(_ctx.stringValue("GetContactBlockListResponse.ContactBlocklistList.List["+ i +"].ContactBlockListId"));
			contactBlockList.setInstanceId(_ctx.stringValue("GetContactBlockListResponse.ContactBlocklistList.List["+ i +"].InstanceId"));
			contactBlockList.setCreationTime(_ctx.longValue("GetContactBlockListResponse.ContactBlocklistList.List["+ i +"].CreationTime"));
			contactBlockList.setPhoneNumber(_ctx.stringValue("GetContactBlockListResponse.ContactBlocklistList.List["+ i +"].PhoneNumber"));
			contactBlockList.setName(_ctx.stringValue("GetContactBlockListResponse.ContactBlocklistList.List["+ i +"].Name"));
			contactBlockList.setCreator(_ctx.stringValue("GetContactBlockListResponse.ContactBlocklistList.List["+ i +"].Creator"));
			contactBlockList.setOperator(_ctx.stringValue("GetContactBlockListResponse.ContactBlocklistList.List["+ i +"].Operator"));
			contactBlockList.setRemark(_ctx.stringValue("GetContactBlockListResponse.ContactBlocklistList.List["+ i +"].Remark"));

			list.add(contactBlockList);
		}
		contactBlocklistList.setList(list);
		getContactBlockListResponse.setContactBlocklistList(contactBlocklistList);
	 
	 	return getContactBlockListResponse;
	}
}