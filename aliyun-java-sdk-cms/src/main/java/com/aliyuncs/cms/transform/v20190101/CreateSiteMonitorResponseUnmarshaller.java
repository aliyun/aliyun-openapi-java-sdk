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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.CreateSiteMonitorResponse;
import com.aliyuncs.cms.model.v20190101.CreateSiteMonitorResponse.CreateResultListItem;
import com.aliyuncs.cms.model.v20190101.CreateSiteMonitorResponse.Data;
import com.aliyuncs.cms.model.v20190101.CreateSiteMonitorResponse.Data.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSiteMonitorResponseUnmarshaller {

	public static CreateSiteMonitorResponse unmarshall(CreateSiteMonitorResponse createSiteMonitorResponse, UnmarshallerContext _ctx) {
		
		createSiteMonitorResponse.setRequestId(_ctx.stringValue("CreateSiteMonitorResponse.RequestId"));
		createSiteMonitorResponse.setCode(_ctx.stringValue("CreateSiteMonitorResponse.Code"));
		createSiteMonitorResponse.setMessage(_ctx.stringValue("CreateSiteMonitorResponse.Message"));
		createSiteMonitorResponse.setSuccess(_ctx.stringValue("CreateSiteMonitorResponse.Success"));

		Data data = new Data();

		List<Contact> attachAlertResult = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("CreateSiteMonitorResponse.Data.AttachAlertResult.Length"); i++) {
			Contact contact = new Contact();
			contact.setMessage(_ctx.stringValue("CreateSiteMonitorResponse.Data.AttachAlertResult["+ i +"].Message"));
			contact.setRequestId(_ctx.stringValue("CreateSiteMonitorResponse.Data.AttachAlertResult["+ i +"].RequestId"));
			contact.setCode(_ctx.stringValue("CreateSiteMonitorResponse.Data.AttachAlertResult["+ i +"].Code"));
			contact.setSuccess(_ctx.stringValue("CreateSiteMonitorResponse.Data.AttachAlertResult["+ i +"].Success"));
			contact.setRuleId(_ctx.stringValue("CreateSiteMonitorResponse.Data.AttachAlertResult["+ i +"].RuleId"));

			attachAlertResult.add(contact);
		}
		data.setAttachAlertResult(attachAlertResult);
		createSiteMonitorResponse.setData(data);

		List<CreateResultListItem> createResultList = new ArrayList<CreateResultListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateSiteMonitorResponse.CreateResultList.Length"); i++) {
			CreateResultListItem createResultListItem = new CreateResultListItem();
			createResultListItem.setTaskName(_ctx.stringValue("CreateSiteMonitorResponse.CreateResultList["+ i +"].TaskName"));
			createResultListItem.setTaskId(_ctx.stringValue("CreateSiteMonitorResponse.CreateResultList["+ i +"].TaskId"));

			createResultList.add(createResultListItem);
		}
		createSiteMonitorResponse.setCreateResultList(createResultList);
	 
	 	return createSiteMonitorResponse;
	}
}