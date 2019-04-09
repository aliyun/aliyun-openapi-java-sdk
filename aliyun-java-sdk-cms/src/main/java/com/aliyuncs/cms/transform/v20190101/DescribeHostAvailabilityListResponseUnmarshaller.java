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

	public static DescribeHostAvailabilityListResponse unmarshall(DescribeHostAvailabilityListResponse describeHostAvailabilityListResponse, UnmarshallerContext context) {
		
		describeHostAvailabilityListResponse.setRequestId(context.stringValue("DescribeHostAvailabilityListResponse.RequestId"));
		describeHostAvailabilityListResponse.setCode(context.stringValue("DescribeHostAvailabilityListResponse.Code"));
		describeHostAvailabilityListResponse.setMessage(context.stringValue("DescribeHostAvailabilityListResponse.Message"));
		describeHostAvailabilityListResponse.setSuccess(context.booleanValue("DescribeHostAvailabilityListResponse.Success"));
		describeHostAvailabilityListResponse.setTotal(context.integerValue("DescribeHostAvailabilityListResponse.Total"));

		List<NodeTaskConfig> taskList = new ArrayList<NodeTaskConfig>();
		for (int i = 0; i < context.lengthValue("DescribeHostAvailabilityListResponse.TaskList.Length"); i++) {
			NodeTaskConfig nodeTaskConfig = new NodeTaskConfig();
			nodeTaskConfig.setId(context.longValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].Id"));
			nodeTaskConfig.setTaskName(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskName"));
			nodeTaskConfig.setTaskType(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskType"));
			nodeTaskConfig.setTaskScope(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskScope"));
			nodeTaskConfig.setDisabled(context.booleanValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].Disabled"));
			nodeTaskConfig.setGroupId(context.longValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].GroupId"));
			nodeTaskConfig.setGroupName(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].GroupName"));

			List<String> instances = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].Instances.Length"); j++) {
				instances.add(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].Instances["+ j +"]"));
			}
			nodeTaskConfig.setInstances(instances);

			TaskOption taskOption = new TaskOption();
			taskOption.setHttpURI(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpURI"));
			taskOption.setTelnetOrPingHost(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.TelnetOrPingHost"));
			taskOption.setHttpResponseCharset(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpResponseCharset"));
			taskOption.setHttpKeyword(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpKeyword"));
			taskOption.setHttpMethod(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpMethod"));
			taskOption.setHttpNegative(context.booleanValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].TaskOption.HttpNegative"));
			nodeTaskConfig.setTaskOption(taskOption);

			AlertConfig alertConfig = new AlertConfig();
			alertConfig.setNotifyType(context.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.NotifyType"));
			alertConfig.setStartTime(context.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.StartTime"));
			alertConfig.setEndTime(context.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EndTime"));
			alertConfig.setSilenceTime(context.integerValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.SilenceTime"));
			alertConfig.setWebHook(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.WebHook"));

			List<EscalationListItem> escalationList = new ArrayList<EscalationListItem>();
			for (int j = 0; j < context.lengthValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList.Length"); j++) {
				EscalationListItem escalationListItem = new EscalationListItem();
				escalationListItem.setMetricName(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].MetricName"));
				escalationListItem.setAggregate(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].Aggregate"));
				escalationListItem.setOperator(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].Operator"));
				escalationListItem.setValue(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].Value"));
				escalationListItem.setTimes(context.stringValue("DescribeHostAvailabilityListResponse.TaskList["+ i +"].AlertConfig.EscalationList["+ j +"].Times"));

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