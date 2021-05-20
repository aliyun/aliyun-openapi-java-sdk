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

import com.aliyuncs.aiccs.model.v20191015.GetAgentStatisticsResponse;
import com.aliyuncs.aiccs.model.v20191015.GetAgentStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentStatisticsResponseUnmarshaller {

	public static GetAgentStatisticsResponse unmarshall(GetAgentStatisticsResponse getAgentStatisticsResponse, UnmarshallerContext _ctx) {
		
		getAgentStatisticsResponse.setRequestId(_ctx.stringValue("GetAgentStatisticsResponse.RequestId"));
		getAgentStatisticsResponse.setMessage(_ctx.stringValue("GetAgentStatisticsResponse.Message"));
		getAgentStatisticsResponse.setCode(_ctx.stringValue("GetAgentStatisticsResponse.Code"));
		getAgentStatisticsResponse.setSuccess(_ctx.stringValue("GetAgentStatisticsResponse.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.integerValue("GetAgentStatisticsResponse.Data.TotalNum"));
		data.setPageSize(_ctx.integerValue("GetAgentStatisticsResponse.Data.PageSize"));
		data.setPageNum(_ctx.integerValue("GetAgentStatisticsResponse.Data.PageNum"));
		data.setRows(_ctx.stringValue("GetAgentStatisticsResponse.Data.Rows"));
		getAgentStatisticsResponse.setData(data);
	 
	 	return getAgentStatisticsResponse;
	}
}