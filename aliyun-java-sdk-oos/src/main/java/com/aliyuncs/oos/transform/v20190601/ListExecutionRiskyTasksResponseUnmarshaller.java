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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListExecutionRiskyTasksResponse;
import com.aliyuncs.oos.model.v20190601.ListExecutionRiskyTasksResponse.RiskyTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutionRiskyTasksResponseUnmarshaller {

	public static ListExecutionRiskyTasksResponse unmarshall(ListExecutionRiskyTasksResponse listExecutionRiskyTasksResponse, UnmarshallerContext _ctx) {
		
		listExecutionRiskyTasksResponse.setRequestId(_ctx.stringValue("ListExecutionRiskyTasksResponse.RequestId"));

		List<RiskyTask> riskyTasks = new ArrayList<RiskyTask>();
		for (int i = 0; i < _ctx.lengthValue("ListExecutionRiskyTasksResponse.RiskyTasks.Length"); i++) {
			RiskyTask riskyTask = new RiskyTask();
			riskyTask.setService(_ctx.stringValue("ListExecutionRiskyTasksResponse.RiskyTasks["+ i +"].Service"));
			riskyTask.setAPI(_ctx.stringValue("ListExecutionRiskyTasksResponse.RiskyTasks["+ i +"].API"));

			List<String> task = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListExecutionRiskyTasksResponse.RiskyTasks["+ i +"].Task.Length"); j++) {
				task.add(_ctx.stringValue("ListExecutionRiskyTasksResponse.RiskyTasks["+ i +"].Task["+ j +"]"));
			}
			riskyTask.setTask(task);

			List<String> template = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListExecutionRiskyTasksResponse.RiskyTasks["+ i +"].Template.Length"); j++) {
				template.add(_ctx.stringValue("ListExecutionRiskyTasksResponse.RiskyTasks["+ i +"].Template["+ j +"]"));
			}
			riskyTask.setTemplate(template);

			riskyTasks.add(riskyTask);
		}
		listExecutionRiskyTasksResponse.setRiskyTasks(riskyTasks);
	 
	 	return listExecutionRiskyTasksResponse;
	}
}