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
		describeDBClusterParametersResponse.setEngine(_ctx.stringValue("DescribeDBClusterParametersResponse.Engine"));
		describeDBClusterParametersResponse.setDBType(_ctx.stringValue("DescribeDBClusterParametersResponse.DBType"));
		describeDBClusterParametersResponse.setDBVersion(_ctx.stringValue("DescribeDBClusterParametersResponse.DBVersion"));

		List<Parameter> runningParameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterParametersResponse.RunningParameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setParameterName(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].ParameterName"));
			parameter.setDataType(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].DataType"));
			parameter.setDefaultParameterValue(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].DefaultParameterValue"));
			parameter.setParameterValue(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].ParameterValue"));
			parameter.setIsModifiable(_ctx.booleanValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].IsModifiable"));
			parameter.setForceRestart(_ctx.booleanValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].ForceRestart"));
			parameter.setParameterStatus(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].ParameterStatus"));
			parameter.setCheckingCode(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].CheckingCode"));
			parameter.setParameterDescription(_ctx.stringValue("DescribeDBClusterParametersResponse.RunningParameters["+ i +"].ParameterDescription"));

			runningParameters.add(parameter);
		}
		describeDBClusterParametersResponse.setRunningParameters(runningParameters);
	 
	 	return describeDBClusterParametersResponse;
	}
}