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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListETLJobInstanceResponseUnmarshaller {

	public static ListETLJobInstanceResponse unmarshall(ListETLJobInstanceResponse listETLJobInstanceResponse, UnmarshallerContext _ctx) {
		
		listETLJobInstanceResponse.setRequestId(_ctx.stringValue("ListETLJobInstanceResponse.RequestId"));
		listETLJobInstanceResponse.setTotal(_ctx.integerValue("ListETLJobInstanceResponse.Total"));
		listETLJobInstanceResponse.setPageSize(_ctx.integerValue("ListETLJobInstanceResponse.PageSize"));
		listETLJobInstanceResponse.setPageNumber(_ctx.integerValue("ListETLJobInstanceResponse.PageNumber"));

		List<Instance> instanceList = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListETLJobInstanceResponse.InstanceList.Length"); i++) {
			Instance instance = new Instance();
			instance.setId(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Id"));
			instance.setName(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Name"));
			instance.setEtlJobId(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].EtlJobId"));
			instance.setInstanceStatus(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].InstanceStatus"));
			instance.setTriggerType(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].TriggerType"));
			instance.setTriggerUser(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].TriggerUser"));
			instance.setStartTime(_ctx.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StartTime"));
			instance.setEndTime(_ctx.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].EndTime"));

			Arguments arguments = new Arguments();
			arguments.setKey(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Arguments.Key"));
			arguments.setValue(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Arguments.Value"));
			instance.setArguments(arguments);

			Metrics metrics = new Metrics();
			metrics.setTotalTime(_ctx.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.TotalTime"));
			metrics.setRecordsIn(_ctx.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.RecordsIn"));
			metrics.setRecordsOut(_ctx.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.RecordsOut"));
			metrics.setRecordsError(_ctx.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.RecordsError"));
			metrics.setRecordsRate(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.RecordsRate"));
			metrics.setVcores(_ctx.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.Vcores"));
			metrics.setMemSize(_ctx.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].Metrics.MemSize"));
			instance.setMetrics(metrics);

			List<FlowRelation> flowRelationList = new ArrayList<FlowRelation>();
			for (int j = 0; j < _ctx.lengthValue("ListETLJobInstanceResponse.InstanceList["+ i +"].FlowRelationList.Length"); j++) {
				FlowRelation flowRelation = new FlowRelation();
				flowRelation.setFlowJobId(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].FlowRelationList["+ j +"].FlowJobId"));
				flowRelation.setFlowJobInstanceId(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].FlowRelationList["+ j +"].FlowJobInstanceId"));

				flowRelationList.add(flowRelation);
			}
			instance.setFlowRelationList(flowRelationList);

			List<StageInstance> stageInstanceList = new ArrayList<StageInstance>();
			for (int j = 0; j < _ctx.lengthValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList.Length"); j++) {
				StageInstance stageInstance = new StageInstance();
				stageInstance.setId(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].Id"));
				stageInstance.setName(_ctx.stringValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].Name"));
				stageInstance.setStageStartTime(_ctx.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].StageStartTime"));
				stageInstance.setStageEndTime(_ctx.longValue("ListETLJobInstanceResponse.InstanceList["+ i +"].StageInstanceList["+ j +"].StageEndTime"));

				stageInstanceList.add(stageInstance);
			}
			instance.setStageInstanceList(stageInstanceList);

			instanceList.add(instance);
		}
		listETLJobInstanceResponse.setInstanceList(instanceList);
	 
	 	return listETLJobInstanceResponse;
	}
}