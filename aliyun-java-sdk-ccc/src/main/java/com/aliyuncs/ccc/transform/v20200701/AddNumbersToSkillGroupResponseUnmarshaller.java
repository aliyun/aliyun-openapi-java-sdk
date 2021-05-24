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

import com.aliyuncs.ccc.model.v20200701.AddNumbersToSkillGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddNumbersToSkillGroupResponseUnmarshaller {

	public static AddNumbersToSkillGroupResponse unmarshall(AddNumbersToSkillGroupResponse addNumbersToSkillGroupResponse, UnmarshallerContext _ctx) {
		
		addNumbersToSkillGroupResponse.setRequestId(_ctx.stringValue("AddNumbersToSkillGroupResponse.RequestId"));
		addNumbersToSkillGroupResponse.setCode(_ctx.stringValue("AddNumbersToSkillGroupResponse.Code"));
		addNumbersToSkillGroupResponse.setHttpStatusCode(_ctx.integerValue("AddNumbersToSkillGroupResponse.HttpStatusCode"));
		addNumbersToSkillGroupResponse.setMessage(_ctx.stringValue("AddNumbersToSkillGroupResponse.Message"));
	 
	 	return addNumbersToSkillGroupResponse;
	}
}