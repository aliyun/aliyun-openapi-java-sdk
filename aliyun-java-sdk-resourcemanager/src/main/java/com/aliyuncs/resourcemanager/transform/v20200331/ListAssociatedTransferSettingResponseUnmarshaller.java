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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.ListAssociatedTransferSettingResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListAssociatedTransferSettingResponse.AssociatedTransferSetting;
import com.aliyuncs.resourcemanager.model.v20200331.ListAssociatedTransferSettingResponse.AssociatedTransferSetting.RuleSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAssociatedTransferSettingResponseUnmarshaller {

	public static ListAssociatedTransferSettingResponse unmarshall(ListAssociatedTransferSettingResponse listAssociatedTransferSettingResponse, UnmarshallerContext _ctx) {
		
		listAssociatedTransferSettingResponse.setRequestId(_ctx.stringValue("ListAssociatedTransferSettingResponse.RequestId"));

		AssociatedTransferSetting associatedTransferSetting = new AssociatedTransferSetting();
		associatedTransferSetting.setAccountId(_ctx.stringValue("ListAssociatedTransferSettingResponse.AssociatedTransferSetting.AccountId"));
		associatedTransferSetting.setStatus(_ctx.stringValue("ListAssociatedTransferSettingResponse.AssociatedTransferSetting.Status"));
		associatedTransferSetting.setEnablePartialRule(_ctx.stringValue("ListAssociatedTransferSettingResponse.AssociatedTransferSetting.EnablePartialRule"));
		associatedTransferSetting.setEnableExistingResourcesTransfer(_ctx.stringValue("ListAssociatedTransferSettingResponse.AssociatedTransferSetting.EnableExistingResourcesTransfer"));

		List<RuleSetting> ruleSettings = new ArrayList<RuleSetting>();
		for (int i = 0; i < _ctx.lengthValue("ListAssociatedTransferSettingResponse.AssociatedTransferSetting.RuleSettings.Length"); i++) {
			RuleSetting ruleSetting = new RuleSetting();
			ruleSetting.setAssociatedResourceType(_ctx.stringValue("ListAssociatedTransferSettingResponse.AssociatedTransferSetting.RuleSettings["+ i +"].AssociatedResourceType"));
			ruleSetting.setMasterResourceType(_ctx.stringValue("ListAssociatedTransferSettingResponse.AssociatedTransferSetting.RuleSettings["+ i +"].MasterResourceType"));
			ruleSetting.setAssociatedService(_ctx.stringValue("ListAssociatedTransferSettingResponse.AssociatedTransferSetting.RuleSettings["+ i +"].AssociatedService"));
			ruleSetting.setMasterService(_ctx.stringValue("ListAssociatedTransferSettingResponse.AssociatedTransferSetting.RuleSettings["+ i +"].MasterService"));
			ruleSetting.setTriggerType(_ctx.stringValue("ListAssociatedTransferSettingResponse.AssociatedTransferSetting.RuleSettings["+ i +"].TriggerType"));
			ruleSetting.setRuleId(_ctx.stringValue("ListAssociatedTransferSettingResponse.AssociatedTransferSetting.RuleSettings["+ i +"].RuleId"));
			ruleSetting.setStatus(_ctx.stringValue("ListAssociatedTransferSettingResponse.AssociatedTransferSetting.RuleSettings["+ i +"].Status"));

			ruleSettings.add(ruleSetting);
		}
		associatedTransferSetting.setRuleSettings(ruleSettings);
		listAssociatedTransferSettingResponse.setAssociatedTransferSetting(associatedTransferSetting);
	 
	 	return listAssociatedTransferSettingResponse;
	}
}