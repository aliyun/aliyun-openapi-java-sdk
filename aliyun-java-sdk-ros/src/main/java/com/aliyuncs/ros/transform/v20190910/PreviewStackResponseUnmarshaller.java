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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.PreviewStackResponse;
import com.aliyuncs.ros.model.v20190910.PreviewStackResponse.Stack;
import com.aliyuncs.ros.model.v20190910.PreviewStackResponse.Stack.Log;
import com.aliyuncs.ros.model.v20190910.PreviewStackResponse.Stack.Log.TerraformLog;
import com.aliyuncs.ros.model.v20190910.PreviewStackResponse.Stack.Parameter;
import com.aliyuncs.ros.model.v20190910.PreviewStackResponse.Stack.Resource;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreviewStackResponseUnmarshaller {

	public static PreviewStackResponse unmarshall(PreviewStackResponse previewStackResponse, UnmarshallerContext _ctx) {
		
		previewStackResponse.setRequestId(_ctx.stringValue("PreviewStackResponse.RequestId"));

		Stack stack = new Stack();
		stack.setTemplateDescription(_ctx.stringValue("PreviewStackResponse.Stack.TemplateDescription"));
		stack.setDescription(_ctx.stringValue("PreviewStackResponse.Stack.Description"));
		stack.setDisableRollback(_ctx.booleanValue("PreviewStackResponse.Stack.DisableRollback"));
		stack.setStackName(_ctx.stringValue("PreviewStackResponse.Stack.StackName"));
		stack.setTimeoutInMinutes(_ctx.integerValue("PreviewStackResponse.Stack.TimeoutInMinutes"));
		stack.setStackPolicyBody(_ctx.mapValue("PreviewStackResponse.Stack.StackPolicyBody"));
		stack.setRegionId(_ctx.stringValue("PreviewStackResponse.Stack.RegionId"));

		Log log = new Log();

		List<TerraformLog> terraformLogs = new ArrayList<TerraformLog>();
		for (int i = 0; i < _ctx.lengthValue("PreviewStackResponse.Stack.Log.TerraformLogs.Length"); i++) {
			TerraformLog terraformLog = new TerraformLog();
			terraformLog.setCommand(_ctx.stringValue("PreviewStackResponse.Stack.Log.TerraformLogs["+ i +"].Command"));
			terraformLog.setStream(_ctx.stringValue("PreviewStackResponse.Stack.Log.TerraformLogs["+ i +"].Stream"));
			terraformLog.setContent(_ctx.stringValue("PreviewStackResponse.Stack.Log.TerraformLogs["+ i +"].Content"));

			terraformLogs.add(terraformLog);
		}
		log.setTerraformLogs(terraformLogs);
		stack.setLog(log);

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("PreviewStackResponse.Stack.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setParameterKey(_ctx.stringValue("PreviewStackResponse.Stack.Parameters["+ i +"].ParameterKey"));
			parameter.setParameterValue(_ctx.stringValue("PreviewStackResponse.Stack.Parameters["+ i +"].ParameterValue"));

			parameters.add(parameter);
		}
		stack.setParameters(parameters);

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("PreviewStackResponse.Stack.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setLogicalResourceId(_ctx.stringValue("PreviewStackResponse.Stack.Resources["+ i +"].LogicalResourceId"));
			resource.setAcsResourceType(_ctx.stringValue("PreviewStackResponse.Stack.Resources["+ i +"].AcsResourceType"));
			resource.setResourceType(_ctx.stringValue("PreviewStackResponse.Stack.Resources["+ i +"].ResourceType"));
			resource.setDescription(_ctx.stringValue("PreviewStackResponse.Stack.Resources["+ i +"].Description"));
			resource.setStack(_ctx.mapValue("PreviewStackResponse.Stack.Resources["+ i +"].Stack"));
			resource.setProperties(_ctx.mapValue("PreviewStackResponse.Stack.Resources["+ i +"].Properties"));
			resource.setAction(_ctx.stringValue("PreviewStackResponse.Stack.Resources["+ i +"].Action"));
			resource.setReplacement(_ctx.stringValue("PreviewStackResponse.Stack.Resources["+ i +"].Replacement"));
			resource.setPhysicalResourceId(_ctx.stringValue("PreviewStackResponse.Stack.Resources["+ i +"].PhysicalResourceId"));

			List<String> requiredBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PreviewStackResponse.Stack.Resources["+ i +"].RequiredBy.Length"); j++) {
				requiredBy.add(_ctx.stringValue("PreviewStackResponse.Stack.Resources["+ i +"].RequiredBy["+ j +"]"));
			}
			resource.setRequiredBy(requiredBy);

			resources.add(resource);
		}
		stack.setResources(resources);
		previewStackResponse.setStack(stack);
	 
	 	return previewStackResponse;
	}
}