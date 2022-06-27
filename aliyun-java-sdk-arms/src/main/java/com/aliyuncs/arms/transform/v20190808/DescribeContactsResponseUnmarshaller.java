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

import com.aliyuncs.arms.model.v20190808.DescribeContactsResponse;
import com.aliyuncs.arms.model.v20190808.DescribeContactsResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.DescribeContactsResponse.PageBean.Contacts;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContactsResponseUnmarshaller {

	public static DescribeContactsResponse unmarshall(DescribeContactsResponse describeContactsResponse, UnmarshallerContext _ctx) {
		
		describeContactsResponse.setRequestId(_ctx.stringValue("DescribeContactsResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.longValue("DescribeContactsResponse.PageBean.Total"));
		pageBean.setPage(_ctx.longValue("DescribeContactsResponse.PageBean.Page"));
		pageBean.setSize(_ctx.longValue("DescribeContactsResponse.PageBean.Size"));

		List<Contacts> alertContacts = new ArrayList<Contacts>();
		for (int i = 0; i < _ctx.lengthValue("DescribeContactsResponse.PageBean.AlertContacts.Length"); i++) {
			Contacts contacts = new Contacts();
			contacts.setContactId(_ctx.floatValue("DescribeContactsResponse.PageBean.AlertContacts["+ i +"].ContactId"));
			contacts.setContactName(_ctx.stringValue("DescribeContactsResponse.PageBean.AlertContacts["+ i +"].ContactName"));
			contacts.setPhone(_ctx.stringValue("DescribeContactsResponse.PageBean.AlertContacts["+ i +"].Phone"));
			contacts.setEmail(_ctx.stringValue("DescribeContactsResponse.PageBean.AlertContacts["+ i +"].Email"));
			contacts.setIsVerify(_ctx.booleanValue("DescribeContactsResponse.PageBean.AlertContacts["+ i +"].IsVerify"));
			contacts.setReissueSendNotice(_ctx.longValue("DescribeContactsResponse.PageBean.AlertContacts["+ i +"].ReissueSendNotice"));

			alertContacts.add(contacts);
		}
		pageBean.setAlertContacts(alertContacts);
		describeContactsResponse.setPageBean(pageBean);
	 
	 	return describeContactsResponse;
	}
}