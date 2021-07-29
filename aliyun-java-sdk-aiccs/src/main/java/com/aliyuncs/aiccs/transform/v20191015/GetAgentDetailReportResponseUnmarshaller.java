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

import com.aliyuncs.aiccs.model.v20191015.GetAgentDetailReportResponse;
import com.aliyuncs.aiccs.model.v20191015.GetAgentDetailReportResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentDetailReportResponseUnmarshaller {

	public static GetAgentDetailReportResponse unmarshall(GetAgentDetailReportResponse getAgentDetailReportResponse, UnmarshallerContext _ctx) {
		
		getAgentDetailReportResponse.setRequestId(_ctx.stringValue("GetAgentDetailReportResponse.RequestId"));
		getAgentDetailReportResponse.setMessage(_ctx.stringValue("GetAgentDetailReportResponse.Message"));
		getAgentDetailReportResponse.setCode(_ctx.stringValue("GetAgentDetailReportResponse.Code"));
		getAgentDetailReportResponse.setSuccess(_ctx.stringValue("GetAgentDetailReportResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("GetAgentDetailReportResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("GetAgentDetailReportResponse.Data.PageSize"));
		data.setTotalNum(_ctx.longValue("GetAgentDetailReportResponse.Data.TotalNum"));
		data.setRows(_ctx.stringValue("GetAgentDetailReportResponse.Data.Rows"));
		getAgentDetailReportResponse.setData(data);
	 
	 	return getAgentDetailReportResponse;
	}
}