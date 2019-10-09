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

package com.aliyuncs.pts.transform.v20181111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20181111.QueryPlanStatusResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPlanStatusResponseUnmarshaller {

	public static QueryPlanStatusResponse unmarshall(QueryPlanStatusResponse queryPlanStatusResponse, UnmarshallerContext _ctx) {
		
		queryPlanStatusResponse.setRequestId(_ctx.stringValue("QueryPlanStatusResponse.RequestId"));
		queryPlanStatusResponse.setCode(_ctx.stringValue("QueryPlanStatusResponse.Code"));
		queryPlanStatusResponse.setMessage(_ctx.stringValue("QueryPlanStatusResponse.Message"));
		queryPlanStatusResponse.setSuccess(_ctx.booleanValue("QueryPlanStatusResponse.Success"));
		queryPlanStatusResponse.setTips(_ctx.stringValue("QueryPlanStatusResponse.Tips"));
		queryPlanStatusResponse.setRequestCount(_ctx.stringValue("QueryPlanStatusResponse.RequestCount"));
		queryPlanStatusResponse.setVum(_ctx.integerValue("QueryPlanStatusResponse.Vum"));
		queryPlanStatusResponse.setBpsRequest(_ctx.stringValue("QueryPlanStatusResponse.BpsRequest"));
		queryPlanStatusResponse.setBpsResponse(_ctx.stringValue("QueryPlanStatusResponse.BpsResponse"));
		queryPlanStatusResponse.setFailedRequestCount(_ctx.integerValue("QueryPlanStatusResponse.FailedRequestCount"));
		queryPlanStatusResponse.setFailedBusinessCount(_ctx.integerValue("QueryPlanStatusResponse.FailedBusinessCount"));
		queryPlanStatusResponse.setConcurrency(_ctx.integerValue("QueryPlanStatusResponse.Concurrency"));
		queryPlanStatusResponse.setConcurrencyLimit(_ctx.integerValue("QueryPlanStatusResponse.ConcurrencyLimit"));
		queryPlanStatusResponse.setTps(_ctx.integerValue("QueryPlanStatusResponse.Tps"));
		queryPlanStatusResponse.setTpsLimit(_ctx.integerValue("QueryPlanStatusResponse.TpsLimit"));
		queryPlanStatusResponse.setAliveAgentCount(_ctx.integerValue("QueryPlanStatusResponse.AliveAgentCount"));
		queryPlanStatusResponse.setTotalAgentCount(_ctx.integerValue("QueryPlanStatusResponse.TotalAgentCount"));
		queryPlanStatusResponse.setSeg90Rt(_ctx.integerValue("QueryPlanStatusResponse.Seg90Rt"));
		queryPlanStatusResponse.setAverageRt(_ctx.integerValue("QueryPlanStatusResponse.AverageRt"));
		queryPlanStatusResponse.setReportId(_ctx.longValue("QueryPlanStatusResponse.ReportId"));
		queryPlanStatusResponse.setStartTime(_ctx.longValue("QueryPlanStatusResponse.StartTime"));
		queryPlanStatusResponse.setCurrentTime(_ctx.longValue("QueryPlanStatusResponse.CurrentTime"));

		List<Map<Object, Object>> monitorData = _ctx.listMapValue("QueryPlanStatusResponse.MonitorData");
		queryPlanStatusResponse.setMonitorData(monitorData);

		List<String> agentLocations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryPlanStatusResponse.AgentLocations.Length"); i++) {
			agentLocations.add(_ctx.stringValue("QueryPlanStatusResponse.AgentLocations["+ i +"]"));
		}
		queryPlanStatusResponse.setAgentLocations(agentLocations);
	 
	 	return queryPlanStatusResponse;
	}
}