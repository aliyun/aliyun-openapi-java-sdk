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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeGroupMonitoringAgentProcessResponse;
import com.aliyuncs.cms.model.v20190101.DescribeGroupMonitoringAgentProcessResponse.Process;
import com.aliyuncs.cms.model.v20190101.DescribeGroupMonitoringAgentProcessResponse.Process.AlertConfigItem;
import com.aliyuncs.cms.model.v20190101.DescribeGroupMonitoringAgentProcessResponse.Process.MatchExpressItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupMonitoringAgentProcessResponseUnmarshaller {

	public static DescribeGroupMonitoringAgentProcessResponse unmarshall(DescribeGroupMonitoringAgentProcessResponse describeGroupMonitoringAgentProcessResponse, UnmarshallerContext _ctx) {
		
		describeGroupMonitoringAgentProcessResponse.setRequestId(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.RequestId"));
		describeGroupMonitoringAgentProcessResponse.setSuccess(_ctx.booleanValue("DescribeGroupMonitoringAgentProcessResponse.Success"));
		describeGroupMonitoringAgentProcessResponse.setCode(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Code"));
		describeGroupMonitoringAgentProcessResponse.setMessage(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Message"));
		describeGroupMonitoringAgentProcessResponse.setPageNumber(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.PageNumber"));
		describeGroupMonitoringAgentProcessResponse.setPageSize(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.PageSize"));
		describeGroupMonitoringAgentProcessResponse.setTotal(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Total"));

		List<Process> processes = new ArrayList<Process>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupMonitoringAgentProcessResponse.Processes.Length"); i++) {
			Process process = new Process();
			process.setProcessName(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].ProcessName"));
			process.setMatchExpressFilterRelation(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].MatchExpressFilterRelation"));
			process.setGroupId(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].GroupId"));
			process.setId(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].Id"));

			List<MatchExpressItem> matchExpress = new ArrayList<MatchExpressItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].MatchExpress.Length"); j++) {
				MatchExpressItem matchExpressItem = new MatchExpressItem();
				matchExpressItem.setValue(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].MatchExpress["+ j +"].Value"));
				matchExpressItem.setName(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].MatchExpress["+ j +"].Name"));
				matchExpressItem.setFunction(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].MatchExpress["+ j +"].Function"));

				matchExpress.add(matchExpressItem);
			}
			process.setMatchExpress(matchExpress);

			List<AlertConfigItem> alertConfig = new ArrayList<AlertConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig.Length"); j++) {
				AlertConfigItem alertConfigItem = new AlertConfigItem();
				alertConfigItem.setComparisonOperator(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].ComparisonOperator"));
				alertConfigItem.setSilenceTime(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].SilenceTime"));
				alertConfigItem.setWebhook(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].Webhook"));
				alertConfigItem.setTimes(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].Times"));
				alertConfigItem.setEscalationsLevel(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].EscalationsLevel"));
				alertConfigItem.setNoEffectiveInterval(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].NoEffectiveInterval"));
				alertConfigItem.setEffectiveInterval(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].EffectiveInterval"));
				alertConfigItem.setThreshold(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].Threshold"));
				alertConfigItem.setStatistics(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].Statistics"));

				alertConfig.add(alertConfigItem);
			}
			process.setAlertConfig(alertConfig);

			processes.add(process);
		}
		describeGroupMonitoringAgentProcessResponse.setProcesses(processes);
	 
	 	return describeGroupMonitoringAgentProcessResponse;
	}
}