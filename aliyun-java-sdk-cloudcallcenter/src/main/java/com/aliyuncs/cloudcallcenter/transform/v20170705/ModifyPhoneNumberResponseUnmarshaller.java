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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyPhoneNumberResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyPhoneNumberResponse.PhoneNumber;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyPhoneNumberResponse.PhoneNumber.ContactFlow;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyPhoneNumberResponse.PhoneNumber.SkillGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyPhoneNumberResponseUnmarshaller {

	public static ModifyPhoneNumberResponse unmarshall(ModifyPhoneNumberResponse modifyPhoneNumberResponse, UnmarshallerContext context) {
		
		modifyPhoneNumberResponse.setRequestId(context.stringValue("ModifyPhoneNumberResponse.RequestId"));
		modifyPhoneNumberResponse.setSuccess(context.booleanValue("ModifyPhoneNumberResponse.Success"));
		modifyPhoneNumberResponse.setCode(context.stringValue("ModifyPhoneNumberResponse.Code"));
		modifyPhoneNumberResponse.setMessage(context.stringValue("ModifyPhoneNumberResponse.Message"));
		modifyPhoneNumberResponse.setHttpStatusCode(context.integerValue("ModifyPhoneNumberResponse.HttpStatusCode"));

		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setPhoneNumberId(context.stringValue("ModifyPhoneNumberResponse.PhoneNumber.PhoneNumberId"));
		phoneNumber.setInstanceId(context.stringValue("ModifyPhoneNumberResponse.PhoneNumber.InstanceId"));
		phoneNumber.setNumber(context.stringValue("ModifyPhoneNumberResponse.PhoneNumber.Number"));
		phoneNumber.setPhoneNumberDescription(context.stringValue("ModifyPhoneNumberResponse.PhoneNumber.PhoneNumberDescription"));
		phoneNumber.setTestOnly(context.booleanValue("ModifyPhoneNumberResponse.PhoneNumber.TestOnly"));
		phoneNumber.setRemainingTime(context.integerValue("ModifyPhoneNumberResponse.PhoneNumber.RemainingTime"));
		phoneNumber.setAllowOutbound(context.booleanValue("ModifyPhoneNumberResponse.PhoneNumber.AllowOutbound"));
		phoneNumber.setUsage(context.stringValue("ModifyPhoneNumberResponse.PhoneNumber.Usage"));
		phoneNumber.setTrunks(context.integerValue("ModifyPhoneNumberResponse.PhoneNumber.Trunks"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowId(context.stringValue("ModifyPhoneNumberResponse.PhoneNumber.ContactFlow.ContactFlowId"));
		contactFlow.setInstanceId(context.stringValue("ModifyPhoneNumberResponse.PhoneNumber.ContactFlow.InstanceId"));
		contactFlow.setContactFlowName(context.stringValue("ModifyPhoneNumberResponse.PhoneNumber.ContactFlow.ContactFlowName"));
		contactFlow.setContactFlowDescription(context.stringValue("ModifyPhoneNumberResponse.PhoneNumber.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(context.stringValue("ModifyPhoneNumberResponse.PhoneNumber.ContactFlow.Type"));
		phoneNumber.setContactFlow(contactFlow);

		List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
		for (int i = 0; i < context.lengthValue("ModifyPhoneNumberResponse.PhoneNumber.SkillGroups.Length"); i++) {
			SkillGroup skillGroup = new SkillGroup();
			skillGroup.setSkillGroupId(context.stringValue("ModifyPhoneNumberResponse.PhoneNumber.SkillGroups["+ i +"].SkillGroupId"));
			skillGroup.setSkillGroupName(context.stringValue("ModifyPhoneNumberResponse.PhoneNumber.SkillGroups["+ i +"].SkillGroupName"));

			skillGroups.add(skillGroup);
		}
		phoneNumber.setSkillGroups(skillGroups);
		modifyPhoneNumberResponse.setPhoneNumber(phoneNumber);
	 
	 	return modifyPhoneNumberResponse;
	}
}