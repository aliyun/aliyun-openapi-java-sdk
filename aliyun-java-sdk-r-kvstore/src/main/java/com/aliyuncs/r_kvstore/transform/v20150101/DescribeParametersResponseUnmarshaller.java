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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeParametersResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeParametersResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParametersResponseUnmarshaller {

	public static DescribeParametersResponse unmarshall(DescribeParametersResponse describeParametersResponse, UnmarshallerContext _ctx) {
		
		describeParametersResponse.setRequestId(_ctx.stringValue("DescribeParametersResponse.RequestId"));
		describeParametersResponse.setEngine(_ctx.stringValue("DescribeParametersResponse.Engine"));
		describeParametersResponse.setEngineVersion(_ctx.stringValue("DescribeParametersResponse.EngineVersion"));

		List<Parameter> configParameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.ConfigParameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setParameterName(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterName"));
			parameter.setParameterValue(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterValue"));
			parameter.setModifiableStatus(_ctx.booleanValue("DescribeParametersResponse.ConfigParameters["+ i +"].ModifiableStatus"));
			parameter.setForceRestart(_ctx.booleanValue("DescribeParametersResponse.ConfigParameters["+ i +"].ForceRestart"));
			parameter.setCheckingCode(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].CheckingCode"));
			parameter.setParameterDescription(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterDescription"));

			configParameters.add(parameter);
		}
		describeParametersResponse.setConfigParameters(configParameters);

		List<Parameter> runningParameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.RunningParameters.Length"); i++) {
			Parameter parameter_ = new Parameter();
			parameter_.setParameterName(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterName"));
			parameter_.setParameterValue(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterValue"));
			parameter_.setModifiableStatus(_ctx.booleanValue("DescribeParametersResponse.RunningParameters["+ i +"].ModifiableStatus"));
			parameter_.setForceRestart(_ctx.booleanValue("DescribeParametersResponse.RunningParameters["+ i +"].ForceRestart"));
			parameter_.setCheckingCode(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].CheckingCode"));
			parameter_.setParameterDescription(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterDescription"));

			runningParameters.add(parameter_);
		}
		describeParametersResponse.setRunningParameters(runningParameters);
	 
	 	return describeParametersResponse;
	}
}