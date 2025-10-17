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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeApplicationParametersResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationParametersResponse.ParameterTemplates;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplate;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplate.Parameter3;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationParametersResponse.Parameters;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationParametersResponse.Parameters.ComponentParameter;
import com.aliyuncs.polardb.model.v20170801.DescribeApplicationParametersResponse.Parameters.ComponentParameter.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationParametersResponseUnmarshaller {

	public static DescribeApplicationParametersResponse unmarshall(DescribeApplicationParametersResponse describeApplicationParametersResponse, UnmarshallerContext _ctx) {
		
		describeApplicationParametersResponse.setRequestId(_ctx.stringValue("DescribeApplicationParametersResponse.RequestId"));

		Parameters parameters = new Parameters();

		List<ComponentParameter> componentParameters = new ArrayList<ComponentParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters.Length"); i++) {
			ComponentParameter componentParameter = new ComponentParameter();
			componentParameter.setComponentType(_ctx.stringValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters["+ i +"].ComponentType"));
			componentParameter.setComponentId(_ctx.stringValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters["+ i +"].ComponentId"));

			List<Parameter> parameters1 = new ArrayList<Parameter>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters["+ i +"].Parameters.Length"); j++) {
				Parameter parameter = new Parameter();
				parameter.setStatus(_ctx.stringValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters["+ i +"].Parameters["+ j +"].Status"));
				parameter.setReadOnly(_ctx.booleanValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters["+ i +"].Parameters["+ j +"].ReadOnly"));
				parameter.setPattern(_ctx.stringValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters["+ i +"].Parameters["+ j +"].Pattern"));
				parameter.setType(_ctx.stringValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters["+ i +"].Parameters["+ j +"].Type"));
				parameter.setDescription(_ctx.stringValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters["+ i +"].Parameters["+ j +"].Description"));
				parameter.setValue(_ctx.stringValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters["+ i +"].Parameters["+ j +"].Value"));
				parameter.setNeedRestart(_ctx.booleanValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters["+ i +"].Parameters["+ j +"].NeedRestart"));
				parameter.set_Default(_ctx.stringValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters["+ i +"].Parameters["+ j +"].Default"));
				parameter.setName(_ctx.stringValue("DescribeApplicationParametersResponse.Parameters.ComponentParameters["+ i +"].Parameters["+ j +"].Name"));

				parameters1.add(parameter);
			}
			componentParameter.setParameters1(parameters1);

			componentParameters.add(componentParameter);
		}
		parameters.setComponentParameters(componentParameters);
		describeApplicationParametersResponse.setParameters(parameters);

		ParameterTemplates parameterTemplates = new ParameterTemplates();

		List<ComponentParameterTemplate> componentParameterTemplates = new ArrayList<ComponentParameterTemplate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates.Length"); i++) {
			ComponentParameterTemplate componentParameterTemplate = new ComponentParameterTemplate();
			componentParameterTemplate.setComponentType(_ctx.stringValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates["+ i +"].ComponentType"));
			componentParameterTemplate.setParameterTemplateId(_ctx.stringValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates["+ i +"].ParameterTemplateId"));
			componentParameterTemplate.setComponentId(_ctx.stringValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates["+ i +"].ComponentId"));
			componentParameterTemplate.setParentParameterTemplateId(_ctx.stringValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates["+ i +"].ParentParameterTemplateId"));

			List<Parameter3> parameters2 = new ArrayList<Parameter3>();
			for (int j = 0; j < _ctx.lengthValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates["+ i +"].Parameters.Length"); j++) {
				Parameter3 parameter3 = new Parameter3();
				parameter3.setPattern(_ctx.stringValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates["+ i +"].Parameters["+ j +"].Pattern"));
				parameter3.setType(_ctx.stringValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates["+ i +"].Parameters["+ j +"].Type"));
				parameter3.setDescription(_ctx.stringValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates["+ i +"].Parameters["+ j +"].Description"));
				parameter3.setReadOnly(_ctx.booleanValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates["+ i +"].Parameters["+ j +"].ReadOnly"));
				parameter3.set_Default(_ctx.stringValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates["+ i +"].Parameters["+ j +"].Default"));
				parameter3.setName(_ctx.stringValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates["+ i +"].Parameters["+ j +"].Name"));
				parameter3.setNeedRestart(_ctx.booleanValue("DescribeApplicationParametersResponse.ParameterTemplates.ComponentParameterTemplates["+ i +"].Parameters["+ j +"].NeedRestart"));

				parameters2.add(parameter3);
			}
			componentParameterTemplate.setParameters2(parameters2);

			componentParameterTemplates.add(componentParameterTemplate);
		}
		parameterTemplates.setComponentParameterTemplates(componentParameterTemplates);
		describeApplicationParametersResponse.setParameterTemplates(parameterTemplates);
	 
	 	return describeApplicationParametersResponse;
	}
}