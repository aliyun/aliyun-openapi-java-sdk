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

import com.aliyuncs.cloudcallcenter.model.v20170705.DeleteSkillGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSkillGroupResponseUnmarshaller {

	public static DeleteSkillGroupResponse unmarshall(DeleteSkillGroupResponse deleteSkillGroupResponse, UnmarshallerContext context) {
		
		deleteSkillGroupResponse.setRequestId(context.stringValue("DeleteSkillGroupResponse.RequestId"));
		deleteSkillGroupResponse.setSuccess(context.booleanValue("DeleteSkillGroupResponse.Success"));
		deleteSkillGroupResponse.setCode(context.stringValue("DeleteSkillGroupResponse.Code"));
		deleteSkillGroupResponse.setMessage(context.stringValue("DeleteSkillGroupResponse.Message"));
		deleteSkillGroupResponse.setHttpStatusCode(context.integerValue("DeleteSkillGroupResponse.HttpStatusCode"));
	 
	 	return deleteSkillGroupResponse;
	}
}