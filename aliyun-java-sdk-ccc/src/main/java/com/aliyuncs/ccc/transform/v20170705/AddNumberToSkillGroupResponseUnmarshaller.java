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

import com.aliyuncs.ccc.model.v20170705.AddNumberToSkillGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddNumberToSkillGroupResponseUnmarshaller {

	public static AddNumberToSkillGroupResponse unmarshall(AddNumberToSkillGroupResponse addNumberToSkillGroupResponse, UnmarshallerContext _ctx) {
		
		addNumberToSkillGroupResponse.setRequestId(_ctx.stringValue("AddNumberToSkillGroupResponse.RequestId"));
		addNumberToSkillGroupResponse.setSuccess(_ctx.booleanValue("AddNumberToSkillGroupResponse.Success"));
		addNumberToSkillGroupResponse.setCode(_ctx.stringValue("AddNumberToSkillGroupResponse.Code"));
		addNumberToSkillGroupResponse.setMessage(_ctx.stringValue("AddNumberToSkillGroupResponse.Message"));
		addNumberToSkillGroupResponse.setHttpStatusCode(_ctx.integerValue("AddNumberToSkillGroupResponse.HttpStatusCode"));
	 
	 	return addNumberToSkillGroupResponse;
	}
}