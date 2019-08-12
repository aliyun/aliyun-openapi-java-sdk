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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.SearchAlertContactResponse;
import com.aliyuncs.arms.model.v20190808.SearchAlertContactResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.SearchAlertContactResponse.PageBean.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchAlertContactResponseUnmarshaller {

	public static SearchAlertContactResponse unmarshall(SearchAlertContactResponse searchAlertContactResponse, UnmarshallerContext _ctx) {
		
		searchAlertContactResponse.setRequestId(_ctx.stringValue("SearchAlertContactResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotalCount(_ctx.integerValue("SearchAlertContactResponse.PageBean.TotalCount"));
		pageBean.setPageNumber(_ctx.integerValue("SearchAlertContactResponse.PageBean.PageNumber"));
		pageBean.setPageSize(_ctx.integerValue("SearchAlertContactResponse.PageBean.PageSize"));

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("SearchAlertContactResponse.PageBean.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setContactId(_ctx.longValue("SearchAlertContactResponse.PageBean.Contacts["+ i +"].ContactId"));
			contact.setContactName(_ctx.stringValue("SearchAlertContactResponse.PageBean.Contacts["+ i +"].ContactName"));
			contact.setPhone(_ctx.stringValue("SearchAlertContactResponse.PageBean.Contacts["+ i +"].Phone"));
			contact.setEmail(_ctx.stringValue("SearchAlertContactResponse.PageBean.Contacts["+ i +"].Email"));
			contact.setUserId(_ctx.stringValue("SearchAlertContactResponse.PageBean.Contacts["+ i +"].UserId"));
			contact.setDingRobot(_ctx.stringValue("SearchAlertContactResponse.PageBean.Contacts["+ i +"].DingRobot"));
			contact.setCreateTime(_ctx.longValue("SearchAlertContactResponse.PageBean.Contacts["+ i +"].CreateTime"));
			contact.setUpdateTime(_ctx.longValue("SearchAlertContactResponse.PageBean.Contacts["+ i +"].UpdateTime"));
			contact.setSystemNoc(_ctx.booleanValue("SearchAlertContactResponse.PageBean.Contacts["+ i +"].SystemNoc"));

			contacts.add(contact);
		}
		pageBean.setContacts(contacts);
		searchAlertContactResponse.setPageBean(pageBean);
	 
	 	return searchAlertContactResponse;
	}
}