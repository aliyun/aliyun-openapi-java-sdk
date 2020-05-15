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
import com.aliyuncs.ros.model.v20190910.PreviewStackResponse.Stack.Parameter;
import com.aliyuncs.ros.model.v20190910.PreviewStackResponse.Stack.Resource;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreviewStackResponseUnmarshaller {

	public static PreviewStackResponse unmarshall(PreviewStackResponse previewStackResponse, UnmarshallerContext _ctx) {
		
		previewStackResponse.setRequestId(_ctx.stringValue("PreviewStackResponse.RequestId"));

		Stack stack = new Stack();
		stack.setDescription(_ctx.stringValue("PreviewStackResponse.Stack.Description"));
		stack.setDisableRollback(_ctx.booleanValue("PreviewStackResponse.Stack.DisableRollback"));
		stack.setRegionId(_ctx.stringValue("PreviewStackResponse.Stack.RegionId"));
		stack.setStackName(_ctx.stringValue("PreviewStackResponse.Stack.StackName"));
		stack.setStackPolicyBody(_ctx.mapValue("PreviewStackResponse.Stack.StackPolicyBody"));
		stack.setTemplateDescription(_ctx.stringValue("PreviewStackResponse.Stack.TemplateDescription"));
		stack.setTimeoutInMinutes(_ctx.integerValue("PreviewStackResponse.Stack.TimeoutInMinutes"));

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
			resource.setDescription(_ctx.stringValue("PreviewStackResponse.Stack.Resources["+ i +"].Description"));
			resource.setLogicalResourceId(_ctx.stringValue("PreviewStackResponse.Stack.Resources["+ i +"].LogicalResourceId"));
			resource.setProperties(_ctx.mapValue("PreviewStackResponse.Stack.Resources["+ i +"].Properties"));
			resource.setResourceType(_ctx.stringValue("PreviewStackResponse.Stack.Resources["+ i +"].ResourceType"));
			resource.setStack(_ctx.mapValue("PreviewStackResponse.Stack.Resources["+ i +"].Stack"));

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