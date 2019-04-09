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
import com.aliyuncs.cms.model.v20190101.CreateSiteMonitorResponse.Data;
import com.aliyuncs.cms.model.v20190101.CreateSiteMonitorResponse.Data.Contact;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSiteMonitorResponseUnmarshaller {

	public static CreateSiteMonitorResponse unmarshall(CreateSiteMonitorResponse createSiteMonitorResponse, UnmarshallerContext context) {
		
		createSiteMonitorResponse.setRequestId(context.stringValue("CreateSiteMonitorResponse.RequestId"));
		createSiteMonitorResponse.setCode(context.stringValue("CreateSiteMonitorResponse.Code"));
		createSiteMonitorResponse.setMessage(context.stringValue("CreateSiteMonitorResponse.Message"));
		createSiteMonitorResponse.setSuccess(context.stringValue("CreateSiteMonitorResponse.Success"));
		createSiteMonitorResponse.setAlertRule(context.stringValue("CreateSiteMonitorResponse.AlertRule"));

		Data data = new Data();

		List<Contact> attachAlertResult = new ArrayList<Contact>();
		for (int i = 0; i < context.lengthValue("CreateSiteMonitorResponse.Data.AttachAlertResult.Length"); i++) {
			Contact contact = new Contact();
			contact.setMessage(context.stringValue("CreateSiteMonitorResponse.Data.AttachAlertResult["+ i +"].Message"));
			contact.setRequestId(context.stringValue("CreateSiteMonitorResponse.Data.AttachAlertResult["+ i +"].RequestId"));
			contact.setCode(context.stringValue("CreateSiteMonitorResponse.Data.AttachAlertResult["+ i +"].Code"));
			contact.setSuccess(context.stringValue("CreateSiteMonitorResponse.Data.AttachAlertResult["+ i +"].Success"));
			contact.setRuleId(context.stringValue("CreateSiteMonitorResponse.Data.AttachAlertResult["+ i +"].RuleId"));

			attachAlertResult.add(contact);
		}
		data.setAttachAlertResult(attachAlertResult);
		createSiteMonitorResponse.setData(data);
	 
	 	return createSiteMonitorResponse;
	}
}