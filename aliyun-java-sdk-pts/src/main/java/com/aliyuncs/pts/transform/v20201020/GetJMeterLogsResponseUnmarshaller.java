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

package com.aliyuncs.pts.transform.v20201020;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20201020.GetJMeterLogsResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJMeterLogsResponseUnmarshaller {

	public static GetJMeterLogsResponse unmarshall(GetJMeterLogsResponse getJMeterLogsResponse, UnmarshallerContext _ctx) {
		
		getJMeterLogsResponse.setRequestId(_ctx.stringValue("GetJMeterLogsResponse.RequestId"));
		getJMeterLogsResponse.setTotalCount(_ctx.longValue("GetJMeterLogsResponse.TotalCount"));
		getJMeterLogsResponse.setMessage(_ctx.stringValue("GetJMeterLogsResponse.Message"));
		getJMeterLogsResponse.setPageSize(_ctx.integerValue("GetJMeterLogsResponse.PageSize"));
		getJMeterLogsResponse.setPageNumber(_ctx.integerValue("GetJMeterLogsResponse.PageNumber"));
		getJMeterLogsResponse.setCode(_ctx.stringValue("GetJMeterLogsResponse.Code"));
		getJMeterLogsResponse.setSuccess(_ctx.booleanValue("GetJMeterLogsResponse.Success"));
		getJMeterLogsResponse.setAgentCount(_ctx.integerValue("GetJMeterLogsResponse.AgentCount"));

		List<Map<Object, Object>> logs = _ctx.listMapValue("GetJMeterLogsResponse.Logs");
		getJMeterLogsResponse.setLogs(logs);
	 
	 	return getJMeterLogsResponse;
	}
}