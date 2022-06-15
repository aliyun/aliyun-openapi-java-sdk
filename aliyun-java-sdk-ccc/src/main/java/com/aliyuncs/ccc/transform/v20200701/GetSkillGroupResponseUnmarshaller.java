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

import com.aliyuncs.ccc.model.v20200701.GetSkillGroupResponse;
import com.aliyuncs.ccc.model.v20200701.GetSkillGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSkillGroupResponseUnmarshaller {

	public static GetSkillGroupResponse unmarshall(GetSkillGroupResponse getSkillGroupResponse, UnmarshallerContext _ctx) {
		
		getSkillGroupResponse.setRequestId(_ctx.stringValue("GetSkillGroupResponse.RequestId"));
		getSkillGroupResponse.setCode(_ctx.stringValue("GetSkillGroupResponse.Code"));
		getSkillGroupResponse.setHttpStatusCode(_ctx.integerValue("GetSkillGroupResponse.HttpStatusCode"));
		getSkillGroupResponse.setMessage(_ctx.stringValue("GetSkillGroupResponse.Message"));

		Data data = new Data();
		data.setDisplayName(_ctx.stringValue("GetSkillGroupResponse.Data.DisplayName"));
		data.setInstanceId(_ctx.stringValue("GetSkillGroupResponse.Data.InstanceId"));
		data.setName(_ctx.stringValue("GetSkillGroupResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("GetSkillGroupResponse.Data.Description"));
		data.setSkillGroupId(_ctx.stringValue("GetSkillGroupResponse.Data.SkillGroupId"));
		getSkillGroupResponse.setData(data);
	 
	 	return getSkillGroupResponse;
	}
}