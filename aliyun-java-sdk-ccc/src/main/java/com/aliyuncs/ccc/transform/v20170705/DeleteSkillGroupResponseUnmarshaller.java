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

import com.aliyuncs.ccc.model.v20170705.DeleteSkillGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSkillGroupResponseUnmarshaller {

	public static DeleteSkillGroupResponse unmarshall(DeleteSkillGroupResponse deleteSkillGroupResponse, UnmarshallerContext _ctx) {
		
		deleteSkillGroupResponse.setRequestId(_ctx.stringValue("DeleteSkillGroupResponse.RequestId"));
		deleteSkillGroupResponse.setSuccess(_ctx.booleanValue("DeleteSkillGroupResponse.Success"));
		deleteSkillGroupResponse.setCode(_ctx.stringValue("DeleteSkillGroupResponse.Code"));
		deleteSkillGroupResponse.setMessage(_ctx.stringValue("DeleteSkillGroupResponse.Message"));
		deleteSkillGroupResponse.setHttpStatusCode(_ctx.integerValue("DeleteSkillGroupResponse.HttpStatusCode"));
	 
	 	return deleteSkillGroupResponse;
	}
}