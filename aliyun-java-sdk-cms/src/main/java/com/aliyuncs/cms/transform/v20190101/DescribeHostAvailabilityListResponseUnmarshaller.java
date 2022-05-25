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
		describeHostAvailabilityListResponse.setTotal(_ctx.integerValue("DescribeHostAvailabilityListResponse.Total"));
		describeHostAvailabilityListResponse.setSuccess(_ctx.booleanValue("DescribeHostAvailabilityListResponse.Success"));

		List<NodeTaskConfig> taskList = new ArrayList<NodeTaskConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHostAvailabilityListResponse.TaskList.Length"); i++) {
			NodeTaskConfig nodeTaskConfig = new NodeTaskConfig();
			nodeTaskConfig.setTaskType(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskType"));
			nodeTaskConfig.setGroupName(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].GroupName"));
			nodeTaskConfig.setGroupId(_ctx.longValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].GroupId"));
			nodeTaskConfig.setTaskName(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskName"));
			nodeTaskConfig.setDisabled(_ctx.booleanValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].Disabled"));
			nodeTaskConfig.setTaskScope(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskScope"));
			nodeTaskConfig.setId(_ctx.longValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].Id"));

			List<String> instances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].Instances.Length"); j++) {
				instances.add(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].Instances["+ j +"]"));
			}
			nodeTaskConfig.setInstances(instances);

			TaskOption taskOption = new TaskOption();
			taskOption.setHttpMethod(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpMethod"));
			taskOption.setInterval(_ctx.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.Interval"));
			taskOption.setHttpURI(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpURI"));
			taskOption.setTelnetOrPingHost(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.TelnetOrPingHost"));
			taskOption.setHttpResponseCharset(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpResponseCharset"));
			taskOption.setHttpPostContent(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpPostContent"));
			taskOption.setHttpNegative(_ctx.booleanValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpNegative"));
			taskOption.setHttpKeyword(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpKeyword"));
			taskOption.setHttpHeader(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpHeader"));
			nodeTaskConfig.setTaskOption(taskOption);

			AlertConfig alertConfig = new AlertConfig();
			alertConfig.setSilenceTime(_ctx.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.SilenceTime"));
			alertConfig.setEndTime(_ctx.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EndTime"));
			alertConfig.setStartTime(_ctx.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.StartTime"));
			alertConfig.setWebHook(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.WebHook"));
			alertConfig.setNotifyType(_ctx.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.NotifyType"));

			List<EscalationListItem> escalationList = new ArrayList<EscalationListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList.Length"); j++) {
				EscalationListItem escalationListItem = new EscalationListItem();
				escalationListItem.setValue(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].Value"));
				escalationListItem.setMetricName(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].MetricName"));
				escalationListItem.setOperator(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].Operator"));
				escalationListItem.setTimes(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].Times"));
				escalationListItem.setAggregate(_ctx.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].Aggregate"));

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