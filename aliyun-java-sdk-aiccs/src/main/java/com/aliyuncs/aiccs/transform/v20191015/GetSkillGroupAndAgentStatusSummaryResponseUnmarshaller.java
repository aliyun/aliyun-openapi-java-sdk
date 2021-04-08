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

import com.aliyuncs.aiccs.model.v20191015.GetSkillGroupAndAgentStatusSummaryResponse;
import com.aliyuncs.aiccs.model.v20191015.GetSkillGroupAndAgentStatusSummaryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSkillGroupAndAgentStatusSummaryResponseUnmarshaller {

	public static GetSkillGroupAndAgentStatusSummaryResponse unmarshall(GetSkillGroupAndAgentStatusSummaryResponse getSkillGroupAndAgentStatusSummaryResponse, UnmarshallerContext _ctx) {
		
		getSkillGroupAndAgentStatusSummaryResponse.setRequestId(_ctx.stringValue("GetSkillGroupAndAgentStatusSummaryResponse.RequestId"));
		getSkillGroupAndAgentStatusSummaryResponse.setMessage(_ctx.stringValue("GetSkillGroupAndAgentStatusSummaryResponse.Message"));
		getSkillGroupAndAgentStatusSummaryResponse.setCode(_ctx.stringValue("GetSkillGroupAndAgentStatusSummaryResponse.Code"));
		getSkillGroupAndAgentStatusSummaryResponse.setSuccess(_ctx.stringValue("GetSkillGroupAndAgentStatusSummaryResponse.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.integerValue("GetSkillGroupAndAgentStatusSummaryResponse.Data.TotalNum"));
		data.setPageSize(_ctx.integerValue("GetSkillGroupAndAgentStatusSummaryResponse.Data.PageSize"));
		data.setPageNum(_ctx.integerValue("GetSkillGroupAndAgentStatusSummaryResponse.Data.PageNum"));
		data.setRows(_ctx.stringValue("GetSkillGroupAndAgentStatusSummaryResponse.Data.Rows"));
		getSkillGroupAndAgentStatusSummaryResponse.setData(data);
	 
	 	return getSkillGroupAndAgentStatusSummaryResponse;
	}
}