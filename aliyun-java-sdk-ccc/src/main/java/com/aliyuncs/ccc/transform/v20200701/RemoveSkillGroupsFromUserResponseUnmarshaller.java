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

import com.aliyuncs.ccc.model.v20200701.RemoveSkillGroupsFromUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveSkillGroupsFromUserResponseUnmarshaller {

	public static RemoveSkillGroupsFromUserResponse unmarshall(RemoveSkillGroupsFromUserResponse removeSkillGroupsFromUserResponse, UnmarshallerContext _ctx) {
		
		removeSkillGroupsFromUserResponse.setRequestId(_ctx.stringValue("RemoveSkillGroupsFromUserResponse.RequestId"));
		removeSkillGroupsFromUserResponse.setCode(_ctx.stringValue("RemoveSkillGroupsFromUserResponse.Code"));
		removeSkillGroupsFromUserResponse.setData(_ctx.stringValue("RemoveSkillGroupsFromUserResponse.Data"));
		removeSkillGroupsFromUserResponse.setHttpStatusCode(_ctx.integerValue("RemoveSkillGroupsFromUserResponse.HttpStatusCode"));
		removeSkillGroupsFromUserResponse.setMessage(_ctx.stringValue("RemoveSkillGroupsFromUserResponse.Message"));
	 
	 	return removeSkillGroupsFromUserResponse;
	}
}