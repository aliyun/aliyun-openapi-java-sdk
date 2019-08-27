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
import com.aliyuncs.emr.model.v20160408.DescribeETLJobInstanceResponse.TriggerHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeETLJobInstanceResponseUnmarshaller {

	public static DescribeETLJobInstanceResponse unmarshall(DescribeETLJobInstanceResponse describeETLJobInstanceResponse, UnmarshallerContext _ctx) {
		
		describeETLJobInstanceResponse.setRequestId(_ctx.stringValue("DescribeETLJobInstanceResponse.RequestId"));
		describeETLJobInstanceResponse.setId(_ctx.stringValue("DescribeETLJobInstanceResponse.Id"));
		describeETLJobInstanceResponse.setEtlJobId(_ctx.stringValue("DescribeETLJobInstanceResponse.EtlJobId"));
		describeETLJobInstanceResponse.setInstanceStatus(_ctx.stringValue("DescribeETLJobInstanceResponse.InstanceStatus"));
		describeETLJobInstanceResponse.setTriggerUser(_ctx.stringValue("DescribeETLJobInstanceResponse.TriggerUser"));
		describeETLJobInstanceResponse.setStartTime(_ctx.longValue("DescribeETLJobInstanceResponse.StartTime"));
		describeETLJobInstanceResponse.setEndTime(_ctx.longValue("DescribeETLJobInstanceResponse.EndTime"));

		TriggerHistory triggerHistory = new TriggerHistory();
		triggerHistory.setHistoryId(_ctx.stringValue("DescribeETLJobInstanceResponse.TriggerHistory.HistoryId"));
		triggerHistory.setTriggerId(_ctx.stringValue("DescribeETLJobInstanceResponse.TriggerHistory.TriggerId"));
		triggerHistory.setTriggerType(_ctx.stringValue("DescribeETLJobInstanceResponse.TriggerHistory.TriggerType"));
		triggerHistory.setFireState(_ctx.stringValue("DescribeETLJobInstanceResponse.TriggerHistory.FireState"));
		triggerHistory.setFireTime(_ctx.longValue("DescribeETLJobInstanceResponse.TriggerHistory.FireTime"));
		describeETLJobInstanceResponse.setTriggerHistory(triggerHistory);

		Arguments arguments = new Arguments();
		arguments.setKey(_ctx.stringValue("DescribeETLJobInstanceResponse.Arguments.Key"));
		arguments.setValue(_ctx.stringValue("DescribeETLJobInstanceResponse.Arguments.Value"));
		describeETLJobInstanceResponse.setArguments(arguments);

		Metrics metrics = new Metrics();
		metrics.setTotalTime(_ctx.longValue("DescribeETLJobInstanceResponse.Metrics.TotalTime"));
		metrics.setRecordsIn(_ctx.longValue("DescribeETLJobInstanceResponse.Metrics.RecordsIn"));
		metrics.setRecordsOut(_ctx.longValue("DescribeETLJobInstanceResponse.Metrics.RecordsOut"));
		metrics.setRecordsError(_ctx.longValue("DescribeETLJobInstanceResponse.Metrics.RecordsError"));
		metrics.setRecordsRate(_ctx.stringValue("DescribeETLJobInstanceResponse.Metrics.RecordsRate"));
		metrics.setVcores(_ctx.longValue("DescribeETLJobInstanceResponse.Metrics.Vcores"));
		metrics.setMemSize(_ctx.longValue("DescribeETLJobInstanceResponse.Metrics.MemSize"));
		describeETLJobInstanceResponse.setMetrics(metrics);

		List<FlowRelation> flowRelationList = new ArrayList<FlowRelation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeETLJobInstanceResponse.FlowRelationList.Length"); i++) {
			FlowRelation flowRelation = new FlowRelation();
			flowRelation.setFlowJobId(_ctx.stringValue("DescribeETLJobInstanceResponse.FlowRelationList["+ i +"].FlowJobId"));
			flowRelation.setFlowJobInstanceId(_ctx.stringValue("DescribeETLJobInstanceResponse.FlowRelationList["+ i +"].FlowJobInstanceId"));

			flowRelationList.add(flowRelation);
		}
		describeETLJobInstanceResponse.setFlowRelationList(flowRelationList);

		List<StageInstance> stageInstanceList = new ArrayList<StageInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeETLJobInstanceResponse.StageInstanceList.Length"); i++) {
			StageInstance stageInstance = new StageInstance();
			stageInstance.setId(_ctx.stringValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].Id"));
			stageInstance.setName(_ctx.stringValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].Name"));
			stageInstance.setStageStartTime(_ctx.longValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].StageStartTime"));
			stageInstance.setStageEndTime(_ctx.longValue("DescribeETLJobInstanceResponse.StageInstanceList["+ i +"].StageEndTime"));

			stageInstanceList.add(stageInstance);
		}
		describeETLJobInstanceResponse.setStageInstanceList(stageInstanceList);
	 
	 	return describeETLJobInstanceResponse;
	}
}