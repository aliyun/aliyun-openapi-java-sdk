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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.GetSkillGroupAgentStatusDetailsResponse;
import com.aliyuncs.aiccs.model.v20191015.GetSkillGroupAgentStatusDetailsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSkillGroupAgentStatusDetailsResponseUnmarshaller {

	public static GetSkillGroupAgentStatusDetailsResponse unmarshall(GetSkillGroupAgentStatusDetailsResponse getSkillGroupAgentStatusDetailsResponse, UnmarshallerContext _ctx) {
		
		getSkillGroupAgentStatusDetailsResponse.setRequestId(_ctx.stringValue("GetSkillGroupAgentStatusDetailsResponse.RequestId"));
		getSkillGroupAgentStatusDetailsResponse.setMessage(_ctx.stringValue("GetSkillGroupAgentStatusDetailsResponse.Message"));
		getSkillGroupAgentStatusDetailsResponse.setCode(_ctx.stringValue("GetSkillGroupAgentStatusDetailsResponse.Code"));
		getSkillGroupAgentStatusDetailsResponse.setSuccess(_ctx.stringValue("GetSkillGroupAgentStatusDetailsResponse.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.longValue("GetSkillGroupAgentStatusDetailsResponse.Data.TotalNum"));
		data.setPageSize(_ctx.longValue("GetSkillGroupAgentStatusDetailsResponse.Data.PageSize"));
		data.setPageNum(_ctx.longValue("GetSkillGroupAgentStatusDetailsResponse.Data.PageNum"));
		data.setRows(_ctx.stringValue("GetSkillGroupAgentStatusDetailsResponse.Data.Rows"));
		getSkillGroupAgentStatusDetailsResponse.setData(data);
	 
	 	return getSkillGroupAgentStatusDetailsResponse;
	}
}