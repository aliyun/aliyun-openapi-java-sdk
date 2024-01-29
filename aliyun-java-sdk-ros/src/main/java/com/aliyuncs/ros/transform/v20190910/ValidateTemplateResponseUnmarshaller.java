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

import com.aliyuncs.ros.model.v20190910.ValidateTemplateResponse;
import com.aliyuncs.ros.model.v20190910.ValidateTemplateResponse.Output;
import com.aliyuncs.ros.model.v20190910.ValidateTemplateResponse.Resource;
import com.aliyuncs.ros.model.v20190910.ValidateTemplateResponse.ResourceTypes;
import com.aliyuncs.ros.model.v20190910.ValidateTemplateResponse.UpdateInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateTemplateResponseUnmarshaller {

	public static ValidateTemplateResponse unmarshall(ValidateTemplateResponse validateTemplateResponse, UnmarshallerContext _ctx) {
		
		validateTemplateResponse.setRequestId(_ctx.stringValue("ValidateTemplateResponse.RequestId"));
		validateTemplateResponse.setDescription(_ctx.stringValue("ValidateTemplateResponse.Description"));

		List<Map<Object, Object>> parameters = _ctx.listMapValue("ValidateTemplateResponse.Parameters");
		validateTemplateResponse.setParameters(parameters);

		ResourceTypes resourceTypes = new ResourceTypes();

		List<String> resources1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.ResourceTypes.Resources.Length"); i++) {
			resources1.add(_ctx.stringValue("ValidateTemplateResponse.ResourceTypes.Resources["+ i +"]"));
		}
		resourceTypes.setResources1(resources1);

		List<String> dataSources = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.ResourceTypes.DataSources.Length"); i++) {
			dataSources.add(_ctx.stringValue("ValidateTemplateResponse.ResourceTypes.DataSources["+ i +"]"));
		}
		resourceTypes.setDataSources(dataSources);
		validateTemplateResponse.setResourceTypes(resourceTypes);

		UpdateInfo updateInfo = new UpdateInfo();

		List<String> parametersAllowedToBeModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.UpdateInfo.ParametersAllowedToBeModified.Length"); i++) {
			parametersAllowedToBeModified.add(_ctx.stringValue("ValidateTemplateResponse.UpdateInfo.ParametersAllowedToBeModified["+ i +"]"));
		}
		updateInfo.setParametersAllowedToBeModified(parametersAllowedToBeModified);

		List<String> parametersCauseInterruptionIfModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.UpdateInfo.ParametersCauseInterruptionIfModified.Length"); i++) {
			parametersCauseInterruptionIfModified.add(_ctx.stringValue("ValidateTemplateResponse.UpdateInfo.ParametersCauseInterruptionIfModified["+ i +"]"));
		}
		updateInfo.setParametersCauseInterruptionIfModified(parametersCauseInterruptionIfModified);

		List<String> parametersConditionallyAllowedToBeModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.UpdateInfo.ParametersConditionallyAllowedToBeModified.Length"); i++) {
			parametersConditionallyAllowedToBeModified.add(_ctx.stringValue("ValidateTemplateResponse.UpdateInfo.ParametersConditionallyAllowedToBeModified["+ i +"]"));
		}
		updateInfo.setParametersConditionallyAllowedToBeModified(parametersConditionallyAllowedToBeModified);

		List<String> parametersConditionallyCauseInterruptionIfModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.UpdateInfo.ParametersConditionallyCauseInterruptionIfModified.Length"); i++) {
			parametersConditionallyCauseInterruptionIfModified.add(_ctx.stringValue("ValidateTemplateResponse.UpdateInfo.ParametersConditionallyCauseInterruptionIfModified["+ i +"]"));
		}
		updateInfo.setParametersConditionallyCauseInterruptionIfModified(parametersConditionallyCauseInterruptionIfModified);

		List<String> parametersNotAllowedToBeModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.UpdateInfo.ParametersNotAllowedToBeModified.Length"); i++) {
			parametersNotAllowedToBeModified.add(_ctx.stringValue("ValidateTemplateResponse.UpdateInfo.ParametersNotAllowedToBeModified["+ i +"]"));
		}
		updateInfo.setParametersNotAllowedToBeModified(parametersNotAllowedToBeModified);

		List<String> parametersUncertainlyAllowedToBeModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.UpdateInfo.ParametersUncertainlyAllowedToBeModified.Length"); i++) {
			parametersUncertainlyAllowedToBeModified.add(_ctx.stringValue("ValidateTemplateResponse.UpdateInfo.ParametersUncertainlyAllowedToBeModified["+ i +"]"));
		}
		updateInfo.setParametersUncertainlyAllowedToBeModified(parametersUncertainlyAllowedToBeModified);

		List<String> parametersUncertainlyCauseInterruptionIfModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.UpdateInfo.ParametersUncertainlyCauseInterruptionIfModified.Length"); i++) {
			parametersUncertainlyCauseInterruptionIfModified.add(_ctx.stringValue("ValidateTemplateResponse.UpdateInfo.ParametersUncertainlyCauseInterruptionIfModified["+ i +"]"));
		}
		updateInfo.setParametersUncertainlyCauseInterruptionIfModified(parametersUncertainlyCauseInterruptionIfModified);

		List<String> parametersCauseReplacementIfModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.UpdateInfo.ParametersCauseReplacementIfModified.Length"); i++) {
			parametersCauseReplacementIfModified.add(_ctx.stringValue("ValidateTemplateResponse.UpdateInfo.ParametersCauseReplacementIfModified["+ i +"]"));
		}
		updateInfo.setParametersCauseReplacementIfModified(parametersCauseReplacementIfModified);

		List<String> parametersConditionallyCauseReplacementIfModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.UpdateInfo.ParametersConditionallyCauseReplacementIfModified.Length"); i++) {
			parametersConditionallyCauseReplacementIfModified.add(_ctx.stringValue("ValidateTemplateResponse.UpdateInfo.ParametersConditionallyCauseReplacementIfModified["+ i +"]"));
		}
		updateInfo.setParametersConditionallyCauseReplacementIfModified(parametersConditionallyCauseReplacementIfModified);

		List<String> parametersUncertainlyCauseReplacementIfModified = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.UpdateInfo.ParametersUncertainlyCauseReplacementIfModified.Length"); i++) {
			parametersUncertainlyCauseReplacementIfModified.add(_ctx.stringValue("ValidateTemplateResponse.UpdateInfo.ParametersUncertainlyCauseReplacementIfModified["+ i +"]"));
		}
		updateInfo.setParametersUncertainlyCauseReplacementIfModified(parametersUncertainlyCauseReplacementIfModified);
		validateTemplateResponse.setUpdateInfo(updateInfo);

		List<Output> outputs = new ArrayList<Output>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.Outputs.Length"); i++) {
			Output output = new Output();
			output.setOutputKey(_ctx.stringValue("ValidateTemplateResponse.Outputs["+ i +"].OutputKey"));
			output.setDescription(_ctx.stringValue("ValidateTemplateResponse.Outputs["+ i +"].Description"));
			output.setLabel(_ctx.stringValue("ValidateTemplateResponse.Outputs["+ i +"].Label"));

			outputs.add(output);
		}
		validateTemplateResponse.setOutputs(outputs);

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("ValidateTemplateResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setResourceType(_ctx.stringValue("ValidateTemplateResponse.Resources["+ i +"].ResourceType"));
			resource.setResourcePath(_ctx.stringValue("ValidateTemplateResponse.Resources["+ i +"].ResourcePath"));
			resource.setLogicalResourceIdPattern(_ctx.stringValue("ValidateTemplateResponse.Resources["+ i +"].LogicalResourceIdPattern"));

			resources.add(resource);
		}
		validateTemplateResponse.setResources(resources);
	 
	 	return validateTemplateResponse;
	}
}