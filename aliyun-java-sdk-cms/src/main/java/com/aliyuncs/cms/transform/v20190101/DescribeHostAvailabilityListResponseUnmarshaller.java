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

import com.aliyuncs.cms.model.v20190101.DescribeHostAvailabilityListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeHostAvailabilityListResponse.NodeTaskConfig;
import com.aliyuncs.cms.model.v20190101.DescribeHostAvailabilityListResponse.NodeTaskConfig.AlertConfig;
import com.aliyuncs.cms.model.v20190101.DescribeHostAvailabilityListResponse.NodeTaskConfig.AlertConfig.EscalationListItem;
import com.aliyuncs.cms.model.v20190101.DescribeHostAvailabilityListResponse.NodeTaskConfig.TaskOption;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHostAvailabilityListResponseUnmarshaller {

	public static DescribeHostAvailabilityListResponse unmarshall(DescribeHostAvailabilityListResponse describeHostAvailabilityListResponse, UnmarshallerContext _ctx) {
		
		describeHostAvailabilityListResponse.setRequestId(_ctx.stringValue("DescribeHostAvailabilityListResponse.RequestId"));
		describeHostAvailabilityListResponse.setCode(_ctx.stringValue("DescribeHostAvailabilityListResponse.Code"));
		describeHostAvailabilityListResponse.setMessage(_ctx.stringValue("DescribeHostAvailabilityListResponse.Message"));
		describeHostAvailabilityListResponse.setSuccess(_ctx.booleanValue("DescribeHostAvailabilityListResponse.Success"));
		describeHostAvailabilityListResponse.setTotal(_ctx.integerValue("DescribeHostAvailabilityListResponse.Total"));

		List<NodeTaskConfig> taskList = new ArrayList<NodeTaskConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHostAvailabilityListResponse.TaskList.Length"); i++) {
			NodeTaskConfig nodeTaskConfig = new NodeTaskConfig();
			nodeTaskConfig.setId(_ctx.longValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].Id"));
			nodeTaskConfig.setTaskName(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskName"));
			nodeTaskConfig.setTaskType(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskType"));
			nodeTaskConfig.setTaskScope(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskScope"));
			nodeTaskConfig.setDisabled(_ctx.booleanValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].Disabled"));
			nodeTaskConfig.setGroupId(_ctx.longValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].GroupId"));
			nodeTaskConfig.setGroupName(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].GroupName"));

			List<String> instances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].Instances.Length"); j++) {
				instances.add(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].Instances["+ j +"]"));
			}
			nodeTaskConfig.setInstances(instances);

			TaskOption taskOption = new TaskOption();
			taskOption.setHttpURI(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpURI"));
			taskOption.setTelnetOrPingHost(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.TelnetOrPingHost"));
			taskOption.setHttpResponseCharset(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpResponseCharset"));
			taskOption.setHttpPostContent(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpPostContent"));
			taskOption.setHttpKeyword(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpKeyword"));
			taskOption.setHttpMethod(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpMethod"));
			taskOption.setHttpNegative(_ctx.booleanValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpNegative"));
			taskOption.setInterval(_ctx.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.Interval"));
			nodeTaskConfig.setTaskOption(taskOption);

			AlertConfig alertConfig = new AlertConfig();
			alertConfig.setNotifyType(_ctx.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.NotifyType"));
			alertConfig.setStartTime(_ctx.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.StartTime"));
			alertConfig.setEndTime(_ctx.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EndTime"));
			alertConfig.setSilenceTime(_ctx.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.SilenceTime"));
			alertConfig.setWebHook(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.WebHook"));

			List<EscalationListItem> escalationList = new ArrayList<EscalationListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList.Length"); j++) {
				EscalationListItem escalationListItem = new EscalationListItem();
				escalationListItem.setMetricName(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].MetricName"));
				escalationListItem.setAggregate(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].Aggregate"));
				escalationListItem.setOperator(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].Operator"));
				escalationListItem.setValue(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].Value"));
				escalationListItem.setTimes(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].Times"));

				escalationList.add(escalationListItem);
			}
			alertConfig.setEscalationList(escalationList);
			nodeTaskConfig.setAlertConfig(alertConfig);

			taskList.add(nodeTaskConfig);
		}
		describeHostAvailabilityListResponse.setTaskList(taskList);
	 
	 	return describeHostAvailabilityListResponse;
	}
}