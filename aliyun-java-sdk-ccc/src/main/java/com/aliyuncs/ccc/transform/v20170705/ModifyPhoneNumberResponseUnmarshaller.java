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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ModifyPhoneNumberResponse;
import com.aliyuncs.ccc.model.v20170705.ModifyPhoneNumberResponse.PhoneNumber;
import com.aliyuncs.ccc.model.v20170705.ModifyPhoneNumberResponse.PhoneNumber.ContactFlow;
import com.aliyuncs.ccc.model.v20170705.ModifyPhoneNumberResponse.PhoneNumber.SkillGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyPhoneNumberResponseUnmarshaller {

	public static ModifyPhoneNumberResponse unmarshall(ModifyPhoneNumberResponse modifyPhoneNumberResponse, UnmarshallerContext _ctx) {
		
		modifyPhoneNumberResponse.setRequestId(_ctx.stringValue("ModifyPhoneNumberResponse.RequestId"));
		modifyPhoneNumberResponse.setHttpStatusCode(_ctx.integerValue("ModifyPhoneNumberResponse.HttpStatusCode"));
		modifyPhoneNumberResponse.setCode(_ctx.stringValue("ModifyPhoneNumberResponse.Code"));
		modifyPhoneNumberResponse.setMessage(_ctx.stringValue("ModifyPhoneNumberResponse.Message"));
		modifyPhoneNumberResponse.setSuccess(_ctx.booleanValue("ModifyPhoneNumberResponse.Success"));

		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setTestOnly(_ctx.booleanValue("ModifyPhoneNumberResponse.PhoneNumber.TestOnly"));
		phoneNumber.setTrunks(_ctx.integerValue("ModifyPhoneNumberResponse.PhoneNumber.Trunks"));
		phoneNumber.setRemainingTime(_ctx.integerValue("ModifyPhoneNumberResponse.PhoneNumber.RemainingTime"));
		phoneNumber.setNumber(_ctx.stringValue("ModifyPhoneNumberResponse.PhoneNumber.Number"));
		phoneNumber.setInstanceId(_ctx.stringValue("ModifyPhoneNumberResponse.PhoneNumber.InstanceId"));
		phoneNumber.setUsage(_ctx.stringValue("ModifyPhoneNumberResponse.PhoneNumber.Usage"));
		phoneNumber.setAllowOutbound(_ctx.booleanValue("ModifyPhoneNumberResponse.PhoneNumber.AllowOutbound"));
		phoneNumber.setPhoneNumberDescription(_ctx.stringValue("ModifyPhoneNumberResponse.PhoneNumber.PhoneNumberDescription"));
		phoneNumber.setPhoneNumberId(_ctx.stringValue("ModifyPhoneNumberResponse.PhoneNumber.PhoneNumberId"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setType(_ctx.stringValue("ModifyPhoneNumberResponse.PhoneNumber.ContactFlow.Type"));
		contactFlow.setContactFlowDescription(_ctx.stringValue("ModifyPhoneNumberResponse.PhoneNumber.ContactFlow.ContactFlowDescription"));
		contactFlow.setInstanceId(_ctx.stringValue("ModifyPhoneNumberResponse.PhoneNumber.ContactFlow.InstanceId"));
		contactFlow.setContactFlowName(_ctx.stringValue("ModifyPhoneNumberResponse.PhoneNumber.ContactFlow.ContactFlowName"));
		contactFlow.setContactFlowId(_ctx.stringValue("ModifyPhoneNumberResponse.PhoneNumber.ContactFlow.ContactFlowId"));
		phoneNumber.setContactFlow(contactFlow);

		List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
		for (int i = 0; i < _ctx.lengthValue("ModifyPhoneNumberResponse.PhoneNumber.SkillGroups.Length"); i++) {
			SkillGroup skillGroup = new SkillGroup();
			skillGroup.setSkillGroupName(_ctx.stringValue("ModifyPhoneNumberResponse.PhoneNumber.SkillGroups["+ i +"].SkillGroupName"));
			skillGroup.setSkillGroupId(_ctx.stringValue("ModifyPhoneNumberResponse.PhoneNumber.SkillGroups["+ i +"].SkillGroupId"));

			skillGroups.add(skillGroup);
		}
		phoneNumber.setSkillGroups(skillGroups);
		modifyPhoneNumberResponse.setPhoneNumber(phoneNumber);
	 
	 	return modifyPhoneNumberResponse;
	}
}