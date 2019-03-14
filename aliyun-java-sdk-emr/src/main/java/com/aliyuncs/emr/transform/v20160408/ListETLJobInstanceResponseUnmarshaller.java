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

import com.aliyuncs.emr.model.v20160408.ListETLJobInstanceResponse;
import com.aliyuncs.emr.model.v20160408.ListETLJobInstanceResponse.Instance;
import com.aliyuncs.emr.model.v20160408.ListETLJobInstanceResponse.Instance.Arguments;
import com.aliyuncs.emr.model.v20160408.ListETLJobInstanceResponse.Instance.FlowRelation;
import com.aliyuncs.emr.model.v20160408.ListETLJobInstanceResponse.Instance.Metrics;
import com.aliyuncs.emr.model.v20160408.ListETLJobInstanceResponse.Instance.StageInstance;
import com.aliyuncs.emr.model.v20160408.ListETLJobInstanceResponse.Instance.StageInstance.Metrics1;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListETLJobInstanceResponseUnmarshaller {

	public static ListETLJobInstanceResponse unmarshall(ListETLJobInstanceResponse listETLJobInstanceResponse, UnmarshallerContext context) {
		
		listETLJobInstanceResponse.setRequestId(context.stringValue("ListETLJobInstanceResponse.RequestId"));
		listETLJobInstanceResponse.setTotal(context.integerValue("ListETLJobInstanceResponse.Total"));
		listETLJobInstanceResponse.setPageSize(context.integerValue("ListETLJobInstanceResponse.PageSize"));
		listETLJobInstanceResponse.setPageNumber(context.integerValue("ListETLJobInstanceResponse.PageNumber"));

		List<Instance> instanceList = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("ListETLJobInstanceResponse.InstanceList.Length"); i++) {
			Instance instance = new Instance();
			instance.setId(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Id"));
			instance.setName(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Name"));
			instance.setEtlJobId(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].EtlJobId"));
			instance.setInstanceStatus(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].InstanceStatus"));
			instance.setTriggerType(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].TriggerType"));
			instance.setTriggerUser(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].TriggerUser"));
			instance.setStartTime(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StartTime"));
			instance.setEndTime(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].EndTime"));

			Arguments arguments = new Arguments();
			arguments.setKey(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Arguments.Key"));
			arguments.setValue(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Arguments.Value"));
			instance.setArguments(arguments);

			Metrics metrics = new Metrics();
			metrics.setTotalTime(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.TotalTime"));
			metrics.setRecordsIn(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.RecordsIn"));
			metrics.setRecordsOut(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.RecordsOut"));
			metrics.setRecordsError(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.RecordsError"));
			metrics.setRecordsRate(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.RecordsRate"));
			metrics.setVcores(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.Vcores"));
			metrics.setMemSize(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.MemSize"));
			instance.setMetrics(metrics);

			List<FlowRelation> flowRelationList = new ArrayList<FlowRelation>();
			for (int j = 0; j < context.lengthValue("ListETLJobInstanceResponse.InstanceList["+ i +"].FlowRelationList.Length"); j++) {
				FlowRelation flowRelation = new FlowRelation();
				flowRelation.setFlowJobId(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].FlowRelationList["+ j +"].FlowJobId"));
				flowRelation.setFlowJobInstanceId(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].FlowRelationList["+ j +"].FlowJobInstanceId"));

				flowRelationList.add(flowRelation);
			}
			instance.setFlowRelationList(flowRelationList);

			List<StageInstance> stageInstanceList = new ArrayList<StageInstance>();
			for (int j = 0; j < context.lengthValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList.Length"); j++) {
				StageInstance stageInstance = new StageInstance();
				stageInstance.setId(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].Id"));
				stageInstance.setName(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].Name"));
				stageInstance.setStartTime(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].StartTime"));
				stageInstance.setEndTime(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].EndTime"));

				Metrics1 metrics1 = new Metrics1();
				metrics1.setTotalTime(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].Metrics.TotalTime"));
				metrics1.setRecordsIn(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].Metrics.RecordsIn"));
				metrics1.setRecordsOut(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].Metrics.RecordsOut"));
				metrics1.setRecordsError(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].Metrics.RecordsError"));
				metrics1.setRecordsRate(context.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].Metrics.RecordsRate"));
				metrics1.setVcores(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].Metrics.Vcores"));
				metrics1.setMemSize(context.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].Metrics.MemSize"));
				stageInstance.setMetrics1(metrics1);

				stageInstanceList.add(stageInstance);
			}
			instance.setStageInstanceList(stageInstanceList);

			instanceList.add(instance);
		}
		listETLJobInstanceResponse.setInstanceList(instanceList);
	 
	 	return listETLJobInstanceResponse;
	}
}