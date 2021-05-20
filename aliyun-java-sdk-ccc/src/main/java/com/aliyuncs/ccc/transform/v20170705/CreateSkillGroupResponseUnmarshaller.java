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

import com.aliyuncs.ccc.model.v20170705.CreateSkillGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSkillGroupResponseUnmarshaller {

	public static CreateSkillGroupResponse unmarshall(CreateSkillGroupResponse createSkillGroupResponse, UnmarshallerContext _ctx) {
		
		createSkillGroupResponse.setRequestId(_ctx.stringValue("CreateSkillGroupResponse.RequestId"));
		createSkillGroupResponse.setSuccess(_ctx.booleanValue("CreateSkillGroupResponse.Success"));
		createSkillGroupResponse.setCode(_ctx.stringValue("CreateSkillGroupResponse.Code"));
		createSkillGroupResponse.setMessage(_ctx.stringValue("CreateSkillGroupResponse.Message"));
		createSkillGroupResponse.setHttpStatusCode(_ctx.integerValue("CreateSkillGroupResponse.HttpStatusCode"));
		createSkillGroupResponse.setSkillGroupId(_ctx.stringValue("CreateSkillGroupResponse.SkillGroupId"));
	 
	 	return createSkillGroupResponse;
	}
}