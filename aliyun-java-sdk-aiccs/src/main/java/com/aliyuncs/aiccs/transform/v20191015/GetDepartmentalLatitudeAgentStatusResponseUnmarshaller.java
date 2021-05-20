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

import com.aliyuncs.aiccs.model.v20191015.GetDepartmentalLatitudeAgentStatusResponse;
import com.aliyuncs.aiccs.model.v20191015.GetDepartmentalLatitudeAgentStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDepartmentalLatitudeAgentStatusResponseUnmarshaller {

	public static GetDepartmentalLatitudeAgentStatusResponse unmarshall(GetDepartmentalLatitudeAgentStatusResponse getDepartmentalLatitudeAgentStatusResponse, UnmarshallerContext _ctx) {
		
		getDepartmentalLatitudeAgentStatusResponse.setRequestId(_ctx.stringValue("GetDepartmentalLatitudeAgentStatusResponse.RequestId"));
		getDepartmentalLatitudeAgentStatusResponse.setMessage(_ctx.stringValue("GetDepartmentalLatitudeAgentStatusResponse.Message"));
		getDepartmentalLatitudeAgentStatusResponse.setCode(_ctx.stringValue("GetDepartmentalLatitudeAgentStatusResponse.Code"));
		getDepartmentalLatitudeAgentStatusResponse.setSuccess(_ctx.booleanValue("GetDepartmentalLatitudeAgentStatusResponse.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.integerValue("GetDepartmentalLatitudeAgentStatusResponse.Data.TotalNum"));
		data.setPageSize(_ctx.integerValue("GetDepartmentalLatitudeAgentStatusResponse.Data.PageSize"));
		data.setPageNum(_ctx.integerValue("GetDepartmentalLatitudeAgentStatusResponse.Data.PageNum"));
		data.setRows(_ctx.stringValue("GetDepartmentalLatitudeAgentStatusResponse.Data.Rows"));
		getDepartmentalLatitudeAgentStatusResponse.setData(data);
	 
	 	return getDepartmentalLatitudeAgentStatusResponse;
	}
}