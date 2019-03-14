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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeETLJobInstanceResponse;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobInstanceResponse.Arguments;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobInstanceResponse.FlowRelation;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobInstanceResponse.Metrics;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobInstanceResponse.StageInstance;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobInstanceResponse.StageInstance.Metrics1;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobInstanceResponse.TriggerHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeETLJobInstanceResponseUnmarshaller {

	public static DescribeETLJobInstanceResponse unmarshall(DescribeETLJobInstanceResponse describeETLJobInstanceResponse, UnmarshallerContext context) {
		
		describeETLJobInstanceResponse.setRequestId(context.stringValue("DescribeETLJobInstanceResponse.RequestId"));
		describeETLJobInstanceResponse.setId(context.stringValue("DescribeETLJobInstanceResponse.Id"));
		describeETLJobInstanceResponse.setEtlJobId(context.stringValue("DescribeETLJobInstanceResponse.EtlJobId"));
		describeETLJobInstanceResponse.setInstanceStatus(context.stringValue("DescribeETLJobInstanceResponse.InstanceStatus"));
		describeETLJobInstanceResponse.setTriggerUser(context.stringValue("DescribeETLJobInstanceResponse.TriggerUser"));
		describeETLJobInstanceResponse.setStartTime(context.longValue("DescribeETLJobInstanceResponse.StartTime"));
		describeETLJobInstanceResponse.setEndTime(context.longValue("DescribeETLJobInstanceResponse.EndTime"));

		TriggerHistory triggerHistory = new TriggerHistory();
		triggerHistory.setHistoryId(context.stringValue("DescribeETLJobInstanceResponse.TriggerHistory.HistoryId"));
		triggerHistory.setTriggerId(context.stringValue("DescribeETLJobInstanceResponse.TriggerHistory.TriggerId"));
		triggerHistory.setTriggerType(context.stringValue("DescribeETLJobInstanceResponse.TriggerHistory.TriggerType"));
		triggerHistory.setFireState(context.stringValue("DescribeETLJobInstanceResponse.TriggerHistory.FireState"));
		triggerHistory.setFireTime(context.longValue("DescribeETLJobInstanceResponse.TriggerHistory.FireTime"));
		describeETLJobInstanceResponse.setTriggerHistory(triggerHistory);

		Arguments arguments = new Arguments();
		arguments.setKey(context.stringValue("DescribeETLJobInstanceResponse.Arguments.Key"));
		arguments.setValue(context.stringValue("DescribeETLJobInstanceResponse.Arguments.Value"));
		describeETLJobInstanceResponse.setArguments(arguments);

		Metrics metrics = new Metrics();
		metrics.setTotalTime(context.longValue("DescribeETLJobInstanceResponse.Metrics.TotalTime"));
		metrics.setRecordsIn(context.longValue("DescribeETLJobInstanceResponse.Metrics.RecordsIn"));
		metrics.setRecordsOut(context.longValue("DescribeETLJobInstanceResponse.Metrics.RecordsOut"));
		metrics.setRecordsError(context.longValue("DescribeETLJobInstanceResponse.Metrics.RecordsError"));
		metrics.setRecordsRate(context.stringValue("DescribeETLJobInstanceResponse.Metrics.RecordsRate"));
		metrics.setVcores(context.longValue("DescribeETLJobInstanceResponse.Metrics.Vcores"));
		metrics.setMemSize(context.longValue("DescribeETLJobInstanceResponse.Metrics.MemSize"));
		describeETLJobInstanceResponse.setMetrics(metrics);

		List<FlowRelation> flowRelationList = new ArrayList<FlowRelation>();
		for (int i = 0; i < context.lengthValue("DescribeETLJobInstanceResponse.FlowRelationList.Length"); i++) {
			FlowRelation flowRelation = new FlowRelation();
			flowRelation.setFlowJobId(context.stringValue("DescribeETLJobInstanceResponse.FlowRelationList["+ i +"].FlowJobId"));
			flowRelation.setFlowJobInstanceId(context.stringValue("DescribeETLJobInstanceResponse.FlowRelationList["+ i +"].FlowJobInstanceId"));

			flowRelationList.add(flowRelation);
		}
		describeETLJobInstanceResponse.setFlowRelationList(flowRelationList);

		List<StageInstance> stageInstanceList = new ArrayList<StageInstance>();
		for (int i = 0; i < context.lengthValue("DescribeETLJobInstanceResponse.StageInstanceList.Length"); i++) {
			StageInstance stageInstance = new StageInstance();
			stageInstance.setId(context.stringValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].Id"));
			stageInstance.setName(context.stringValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].Name"));
			stageInstance.setStartTime(context.longValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].StartTime"));
			stageInstance.setEndTime(context.longValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].EndTime"));

			Metrics1 metrics1 = new Metrics1();
			metrics1.setTotalTime(context.longValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].Metrics.TotalTime"));
			metrics1.setRecordsIn(context.longValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].Metrics.RecordsIn"));
			metrics1.setRecordsOut(context.longValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].Metrics.RecordsOut"));
			metrics1.setRecordsError(context.longValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].Metrics.RecordsError"));
			metrics1.setRecordsRate(context.stringValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].Metrics.RecordsRate"));
			metrics1.setVcores(context.longValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].Metrics.Vcores"));
			metrics1.setMemSize(context.longValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].Metrics.MemSize"));
			stageInstance.setMetrics1(metrics1);

			stageInstanceList.add(stageInstance);
		}
		describeETLJobInstanceResponse.setStageInstanceList(stageInstanceList);
	 
	 	return describeETLJobInstanceResponse;
	}
}