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

import com.aliyuncs.aiccs.model.v20191015.GetAgentServiceStatusResponse;
import com.aliyuncs.aiccs.model.v20191015.GetAgentServiceStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentServiceStatusResponseUnmarshaller {

	public static GetAgentServiceStatusResponse unmarshall(GetAgentServiceStatusResponse getAgentServiceStatusResponse, UnmarshallerContext _ctx) {
		
		getAgentServiceStatusResponse.setRequestId(_ctx.stringValue("GetAgentServiceStatusResponse.RequestId"));
		getAgentServiceStatusResponse.setMessage(_ctx.stringValue("GetAgentServiceStatusResponse.Message"));
		getAgentServiceStatusResponse.setCode(_ctx.stringValue("GetAgentServiceStatusResponse.Code"));
		getAgentServiceStatusResponse.setSuccess(_ctx.booleanValue("GetAgentServiceStatusResponse.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.longValue("GetAgentServiceStatusResponse.Data.TotalNum"));
		data.setPageSize(_ctx.longValue("GetAgentServiceStatusResponse.Data.PageSize"));
		data.setPageNum(_ctx.longValue("GetAgentServiceStatusResponse.Data.PageNum"));
		data.setRows(_ctx.stringValue("GetAgentServiceStatusResponse.Data.Rows"));
		getAgentServiceStatusResponse.setData(data);
	 
	 	return getAgentServiceStatusResponse;
	}
}