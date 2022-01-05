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

import com.aliyuncs.ccc.model.v20200701.RemoveUsersFromSkillGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveUsersFromSkillGroupResponseUnmarshaller {

	public static RemoveUsersFromSkillGroupResponse unmarshall(RemoveUsersFromSkillGroupResponse removeUsersFromSkillGroupResponse, UnmarshallerContext _ctx) {
		
		removeUsersFromSkillGroupResponse.setRequestId(_ctx.stringValue("RemoveUsersFromSkillGroupResponse.RequestId"));
		removeUsersFromSkillGroupResponse.setCode(_ctx.stringValue("RemoveUsersFromSkillGroupResponse.Code"));
		removeUsersFromSkillGroupResponse.setHttpStatusCode(_ctx.integerValue("RemoveUsersFromSkillGroupResponse.HttpStatusCode"));
		removeUsersFromSkillGroupResponse.setMessage(_ctx.stringValue("RemoveUsersFromSkillGroupResponse.Message"));
	 
	 	return removeUsersFromSkillGroupResponse;
	}
}