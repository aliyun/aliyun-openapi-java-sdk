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

import com.aliyuncs.oos.model.v20190601.ValidateTemplateContentResponse;
import com.aliyuncs.oos.model.v20190601.ValidateTemplateContentResponse.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateTemplateContentResponseUnmarshaller {

	public static ValidateTemplateContentResponse unmarshall(ValidateTemplateContentResponse validateTemplateContentResponse, UnmarshallerContext _ctx) {
		
		validateTemplateContentResponse.setRequestId(_ctx.stringValue("ValidateTemplateContentResponse.RequestId"));
		validateTemplateContentResponse.setParameters(_ctx.stringValue("ValidateTemplateContentResponse.Parameters"));
		validateTemplateContentResponse.setRamRole(_ctx.stringValue("ValidateTemplateContentResponse.RamRole"));
		validateTemplateContentResponse.setOutputs(_ctx.stringValue("ValidateTemplateContentResponse.Outputs"));

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateContentResponse.Tasks.Length"); i++) {
			Task task = new Task();
			task.setName(_ctx.stringValue("ValidateTemplateContentResponse.Tasks["+ i +"].Name"));
			task.setType(_ctx.stringValue("ValidateTemplateContentResponse.Tasks["+ i +"].Type"));
			task.setDescription(_ctx.stringValue("ValidateTemplateContentResponse.Tasks["+ i +"].Description"));
			task.setProperties(_ctx.stringValue("ValidateTemplateContentResponse.Tasks["+ i +"].Properties"));
			task.setOutputs(_ctx.stringValue("ValidateTemplateContentResponse.Tasks["+ i +"].Outputs"));

			tasks.add(task);
		}
		validateTemplateContentResponse.setTasks(tasks);
	 
	 	return validateTemplateContentResponse;
	}
}