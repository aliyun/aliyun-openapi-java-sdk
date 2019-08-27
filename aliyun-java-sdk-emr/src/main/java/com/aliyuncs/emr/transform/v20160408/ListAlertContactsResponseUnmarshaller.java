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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListAlertContactsResponse;
import com.aliyuncs.emr.model.v20160408.ListAlertContactsResponse.AlertContact;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlertContactsResponseUnmarshaller {

	public static ListAlertContactsResponse unmarshall(ListAlertContactsResponse listAlertContactsResponse, UnmarshallerContext _ctx) {
		

		List<AlertContact> alertContactList = new ArrayList<AlertContact>();
		for (int i = 0; i < _ctx.lengthValue("ListAlertContactsResponse.AlertContactList.Length"); i++) {
			AlertContact alertContact = new AlertContact();
			alertContact.setId(_ctx.longValue("ListAlertContactsResponse.AlertContactList["+ i +"].Id"));
			alertContact.setGmtCreate(_ctx.stringValue("ListAlertContactsResponse.AlertContactList["+ i +"].GmtCreate"));
			alertContact.setGmtModified(_ctx.stringValue("ListAlertContactsResponse.AlertContactList["+ i +"].GmtModified"));
			alertContact.setBizId(_ctx.stringValue("ListAlertContactsResponse.AlertContactList["+ i +"].BizId"));
			alertContact.setName(_ctx.stringValue("ListAlertContactsResponse.AlertContactList["+ i +"].Name"));
			alertContact.setEmail(_ctx.stringValue("ListAlertContactsResponse.AlertContactList["+ i +"].Email"));
			alertContact.setPhoneNumber(_ctx.stringValue("ListAlertContactsResponse.AlertContactList["+ i +"].PhoneNumber"));

			alertContactList.add(alertContact);
		}
		listAlertContactsResponse.setAlertContactList(alertContactList);
	 
	 	return listAlertContactsResponse;
	}
}