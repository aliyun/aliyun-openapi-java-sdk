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

import com.aliyuncs.ccc.model.v20170705.ModifySkillGroupBasicInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifySkillGroupBasicInfoResponseUnmarshaller {

	public static ModifySkillGroupBasicInfoResponse unmarshall(ModifySkillGroupBasicInfoResponse modifySkillGroupBasicInfoResponse, UnmarshallerContext _ctx) {
		
		modifySkillGroupBasicInfoResponse.setRequestId(_ctx.stringValue("ModifySkillGroupBasicInfoResponse.RequestId"));
		modifySkillGroupBasicInfoResponse.setHttpStatusCode(_ctx.integerValue("ModifySkillGroupBasicInfoResponse.HttpStatusCode"));
		modifySkillGroupBasicInfoResponse.setCode(_ctx.stringValue("ModifySkillGroupBasicInfoResponse.Code"));
		modifySkillGroupBasicInfoResponse.setMessage(_ctx.stringValue("ModifySkillGroupBasicInfoResponse.Message"));
		modifySkillGroupBasicInfoResponse.setSuccess(_ctx.booleanValue("ModifySkillGroupBasicInfoResponse.Success"));
	 
	 	return modifySkillGroupBasicInfoResponse;
	}
}