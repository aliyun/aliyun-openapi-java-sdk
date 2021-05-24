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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.RemovePhoneNumbersFromSkillGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemovePhoneNumbersFromSkillGroupResponseUnmarshaller {

	public static RemovePhoneNumbersFromSkillGroupResponse unmarshall(RemovePhoneNumbersFromSkillGroupResponse removePhoneNumbersFromSkillGroupResponse, UnmarshallerContext _ctx) {
		
		removePhoneNumbersFromSkillGroupResponse.setRequestId(_ctx.stringValue("RemovePhoneNumbersFromSkillGroupResponse.RequestId"));
		removePhoneNumbersFromSkillGroupResponse.setCode(_ctx.stringValue("RemovePhoneNumbersFromSkillGroupResponse.Code"));
		removePhoneNumbersFromSkillGroupResponse.setHttpStatusCode(_ctx.integerValue("RemovePhoneNumbersFromSkillGroupResponse.HttpStatusCode"));
		removePhoneNumbersFromSkillGroupResponse.setMessage(_ctx.stringValue("RemovePhoneNumbersFromSkillGroupResponse.Message"));
	 
	 	return removePhoneNumbersFromSkillGroupResponse;
	}
}