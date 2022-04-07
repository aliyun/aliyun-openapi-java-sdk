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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeParametersResponse;
import com.aliyuncs.dds.model.v20151201.DescribeParametersResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParametersResponseUnmarshaller {

	public static DescribeParametersResponse unmarshall(DescribeParametersResponse describeParametersResponse, UnmarshallerContext _ctx) {
		
		describeParametersResponse.setRequestId(_ctx.stringValue("DescribeParametersResponse.RequestId"));
		describeParametersResponse.setEngineVersion(_ctx.stringValue("DescribeParametersResponse.EngineVersion"));
		describeParametersResponse.setEngine(_ctx.stringValue("DescribeParametersResponse.Engine"));

		List<Parameter> runningParameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.RunningParameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setCheckingCode(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].CheckingCode"));
			parameter.setParameterName(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterName"));
			parameter.setParameterValue(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterValue"));
			parameter.setForceRestart(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ForceRestart"));
			parameter.setParameterDescription(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterDescription"));
			parameter.setModifiableStatus(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ModifiableStatus"));

			runningParameters.add(parameter);
		}
		describeParametersResponse.setRunningParameters(runningParameters);

		List<Parameter> configParameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.ConfigParameters.Length"); i++) {
			Parameter parameter1 = new Parameter();
			parameter1.setCheckingCode(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].CheckingCode"));
			parameter1.setParameterName(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterName"));
			parameter1.setParameterValue(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterValue"));
			parameter1.setForceRestart(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ForceRestart"));
			parameter1.setParameterDescription(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterDescription"));
			parameter1.setModifiableStatus(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ModifiableStatus"));

			configParameters.add(parameter1);
		}
		describeParametersResponse.setConfigParameters(configParameters);
	 
	 	return describeParametersResponse;
	}
}