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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterParametersResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterParametersResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterParametersResponseUnmarshaller {

	public static DescribeDBClusterParametersResponse unmarshall(DescribeDBClusterParametersResponse describeDBClusterParametersResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterParametersResponse.setRequestId(_ctx.stringValue("DescribeDBClusterParametersResponse.RequestId"));
		describeDBClusterParametersResponse.setDBVersion(_ctx.stringValue("DescribeDBClusterParametersResponse.DBVersion"));
		describeDBClusterParametersResponse.setDBType(_ctx.stringValue("DescribeDBClusterParametersResponse.DBType"));
		describeDBClusterParametersResponse.setEngine(_ctx.stringValue("DescribeDBClusterParametersResponse.Engine"));

		List<Parameter> runningParameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterParametersResponse.RunningParameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setCheckingCode(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].CheckingCode"));
			parameter.setDataType(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].DataType"));
			parameter.setParameterName(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].ParameterName"));
			parameter.setParameterValue(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].ParameterValue"));
			parameter.setForceRestart(_ctx.booleanValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].ForceRestart"));
			parameter.setParameterDescription(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].ParameterDescription"));
			parameter.setParameterStatus(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].ParameterStatus"));
			parameter.setDefaultParameterValue(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].DefaultParameterValue"));
			parameter.setIsModifiable(_ctx.booleanValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].IsModifiable"));
			parameter.setIsNodeAvailable(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].IsNodeAvailable"));
			parameter.setParamRelyRule(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].ParamRelyRule"));

			runningParameters.add(parameter);
		}
		describeDBClusterParametersResponse.setRunningParameters(runningParameters);
	 
	 	return describeDBClusterParametersResponse;
	}
}