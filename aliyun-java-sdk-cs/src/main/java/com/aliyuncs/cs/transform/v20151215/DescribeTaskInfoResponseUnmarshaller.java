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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribeTaskInfoResponse;
import com.aliyuncs.cs.model.v20151215.DescribeTaskInfoResponse.Error;
import com.aliyuncs.cs.model.v20151215.DescribeTaskInfoResponse.EventsItem;
import com.aliyuncs.cs.model.v20151215.DescribeTaskInfoResponse.StagesItem;
import com.aliyuncs.cs.model.v20151215.DescribeTaskInfoResponse.Target;
import com.aliyuncs.cs.model.v20151215.DescribeTaskInfoResponse.Task;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTaskInfoResponseUnmarshaller {

	public static DescribeTaskInfoResponse unmarshall(DescribeTaskInfoResponse describeTaskInfoResponse, UnmarshallerContext _ctx) {
		
		describeTaskInfoResponse.setTask_id(_ctx.stringValue("DescribeTaskInfoResponse.task_id"));
		describeTaskInfoResponse.setCluster_id(_ctx.stringValue("DescribeTaskInfoResponse.cluster_id"));
		describeTaskInfoResponse.setTask_type(_ctx.stringValue("DescribeTaskInfoResponse.task_type"));
		describeTaskInfoResponse.setState(_ctx.stringValue("DescribeTaskInfoResponse.state"));
		describeTaskInfoResponse.setCreated(_ctx.stringValue("DescribeTaskInfoResponse.created"));
		describeTaskInfoResponse.setUpdated(_ctx.stringValue("DescribeTaskInfoResponse.updated"));
		describeTaskInfoResponse.setParameters(_ctx.mapValue("DescribeTaskInfoResponse.parameters"));
		describeTaskInfoResponse.setCurrent_stage(_ctx.stringValue("DescribeTaskInfoResponse.current_stage"));

		Target target = new Target();
		target.setId(_ctx.stringValue("DescribeTaskInfoResponse.target.id"));
		target.setType(_ctx.stringValue("DescribeTaskInfoResponse.target.type"));
		describeTaskInfoResponse.setTarget(target);

		Error error = new Error();
		error.setCode(_ctx.stringValue("DescribeTaskInfoResponse.error.code"));
		error.setMessage(_ctx.stringValue("DescribeTaskInfoResponse.error.message"));
		describeTaskInfoResponse.setError(error);

		List<StagesItem> stages = new ArrayList<StagesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTaskInfoResponse.stages.Length"); i++) {
			StagesItem stagesItem = new StagesItem();
			stagesItem.setState(_ctx.stringValue("DescribeTaskInfoResponse.stages["+ i +"].state"));
			stagesItem.setStart_time(_ctx.stringValue("DescribeTaskInfoResponse.stages["+ i +"].start_time"));
			stagesItem.setEnd_time(_ctx.stringValue("DescribeTaskInfoResponse.stages["+ i +"].end_time"));
			stagesItem.setMessage(_ctx.stringValue("DescribeTaskInfoResponse.stages["+ i +"].message"));
			stagesItem.setOutputs(_ctx.mapValue("DescribeTaskInfoResponse.stages["+ i +"].outputs"));

			stages.add(stagesItem);
		}
		describeTaskInfoResponse.setStages(stages);

		List<EventsItem> events = new ArrayList<EventsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTaskInfoResponse.events.Length"); i++) {
			EventsItem eventsItem = new EventsItem();
			eventsItem.setAction(_ctx.stringValue("DescribeTaskInfoResponse.events["+ i +"].action"));
			eventsItem.setLevel(_ctx.stringValue("DescribeTaskInfoResponse.events["+ i +"].level"));
			eventsItem.setMessage(_ctx.stringValue("DescribeTaskInfoResponse.events["+ i +"].message"));
			eventsItem.setReason(_ctx.stringValue("DescribeTaskInfoResponse.events["+ i +"].reason"));
			eventsItem.setSource(_ctx.stringValue("DescribeTaskInfoResponse.events["+ i +"].source"));
			eventsItem.setTimestamp(_ctx.stringValue("DescribeTaskInfoResponse.events["+ i +"].timestamp"));

			events.add(eventsItem);
		}
		describeTaskInfoResponse.setEvents(events);

		List<Task> task_result = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTaskInfoResponse.task_result.Length"); i++) {
			Task task = new Task();
			task.setData(_ctx.stringValue("DescribeTaskInfoResponse.task_result["+ i +"].data"));
			task.setStatus(_ctx.stringValue("DescribeTaskInfoResponse.task_result["+ i +"].status"));

			task_result.add(task);
		}
		describeTaskInfoResponse.setTask_result(task_result);
	 
	 	return describeTaskInfoResponse;
	}
}