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
		describeGroupMonitoringAgentProcessResponse.setCode(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Code"));
		describeGroupMonitoringAgentProcessResponse.setMessage(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Message"));
		describeGroupMonitoringAgentProcessResponse.setSuccess(_ctx.booleanValue("DescribeGroupMonitoringAgentProcessResponse.Success"));

		List<Process> processes = new ArrayList<Process>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupMonitoringAgentProcessResponse.Processes.Length"); i++) {
			Process process = new Process();
			process.setId(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].Id"));
			process.setGroupId(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].GroupId"));
			process.setProcessName(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].ProcessName"));
			process.setMatchExpressFilterRelation(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].MatchExpressFilterRelation"));

			List<MatchExpressItem> matchExpress = new ArrayList<MatchExpressItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].MatchExpress.Length"); j++) {
				MatchExpressItem matchExpressItem = new MatchExpressItem();
				matchExpressItem.setName(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].MatchExpress["+ j +"].Name"));
				matchExpressItem.setFunction(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].MatchExpress["+ j +"].Function"));
				matchExpressItem.setValue(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].MatchExpress["+ j +"].Value"));

				matchExpress.add(matchExpressItem);
			}
			process.setMatchExpress(matchExpress);

			List<AlertConfigItem> alertConfig = new ArrayList<AlertConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig.Length"); j++) {
				AlertConfigItem alertConfigItem = new AlertConfigItem();
				alertConfigItem.setEffectiveInterval(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].EffectiveInterval"));
				alertConfigItem.setNoEffectiveInterval(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].NoEffectiveInterval"));
				alertConfigItem.setSilenceTime(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].SilenceTime"));
				alertConfigItem.setWebhook(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].Webhook"));
				alertConfigItem.setEscalationsLevel(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].EscalationsLevel"));
				alertConfigItem.setComparisonOperator(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].ComparisonOperator"));
				alertConfigItem.setStatistics(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].Statistics"));
				alertConfigItem.setThreshold(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].Threshold"));
				alertConfigItem.setTimes(_ctx.stringValue("DescribeGroupMonitoringAgentProcessResponse.Processes["+ i +"].AlertConfig["+ j +"].Times"));

				alertConfig.add(alertConfigItem);
			}
			process.setAlertConfig(alertConfig);

			processes.add(process);
		}
		describeGroupMonitoringAgentProcessResponse.setProcesses(processes);
	 
	 	return describeGroupMonitoringAgentProcessResponse;
	}
}