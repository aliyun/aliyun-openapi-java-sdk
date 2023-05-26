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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowsByPageResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowsByPageResponse.TaskFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskFlowsByPageResponseUnmarshaller {

	public static ListTaskFlowsByPageResponse unmarshall(ListTaskFlowsByPageResponse listTaskFlowsByPageResponse, UnmarshallerContext _ctx) {
		
		listTaskFlowsByPageResponse.setRequestId(_ctx.stringValue("ListTaskFlowsByPageResponse.RequestId"));
		listTaskFlowsByPageResponse.setErrorCode(_ctx.stringValue("ListTaskFlowsByPageResponse.ErrorCode"));
		listTaskFlowsByPageResponse.setErrorMessage(_ctx.stringValue("ListTaskFlowsByPageResponse.ErrorMessage"));
		listTaskFlowsByPageResponse.setSuccess(_ctx.booleanValue("ListTaskFlowsByPageResponse.Success"));
		listTaskFlowsByPageResponse.setTotalCount(_ctx.integerValue("ListTaskFlowsByPageResponse.TotalCount"));

		List<TaskFlow> taskFlowList = new ArrayList<TaskFlow>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskFlowsByPageResponse.TaskFlowList.Length"); i++) {
			TaskFlow taskFlow = new TaskFlow();
			taskFlow.setId(_ctx.longValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].Id"));
			taskFlow.setDagName(_ctx.stringValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].DagName"));
			taskFlow.setDescription(_ctx.stringValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].Description"));
			taskFlow.setCreatorId(_ctx.stringValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].CreatorId"));
			taskFlow.setCreatorNickName(_ctx.stringValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].CreatorNickName"));
			taskFlow.setDagOwnerNickName(_ctx.stringValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].DagOwnerNickName"));
			taskFlow.setDeployId(_ctx.longValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].DeployId"));
			taskFlow.setStatus(_ctx.integerValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].Status"));
			taskFlow.setLatestInstanceStatus(_ctx.integerValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].LatestInstanceStatus"));
			taskFlow.setLatestInstanceTime(_ctx.stringValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].LatestInstanceTime"));
			taskFlow.setScenarioId(_ctx.stringValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].ScenarioId"));
			taskFlow.setCronSwitch(_ctx.booleanValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].CronSwitch"));
			taskFlow.setCronStr(_ctx.stringValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].CronStr"));
			taskFlow.setScheduleParam(_ctx.stringValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].ScheduleParam"));
			taskFlow.setTriggerType(_ctx.integerValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].TriggerType"));
			taskFlow.setCronType(_ctx.integerValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].CronType"));
			taskFlow.setCronBeginDate(_ctx.stringValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].CronBeginDate"));
			taskFlow.setCronEndDate(_ctx.stringValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].CronEndDate"));
			taskFlow.setTimeZoneId(_ctx.stringValue("ListTaskFlowsByPageResponse.TaskFlowList["+ i +"].TimeZoneId"));

			taskFlowList.add(taskFlow);
		}
		listTaskFlowsByPageResponse.setTaskFlowList(taskFlowList);
	 
	 	return listTaskFlowsByPageResponse;
	}
}