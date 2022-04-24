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

import com.aliyuncs.polardb.model.v20170801.DescribeDBNodesParametersResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBNodesParametersResponse.DBNodeParameter;
import com.aliyuncs.polardb.model.v20170801.DescribeDBNodesParametersResponse.DBNodeParameter.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBNodesParametersResponseUnmarshaller {

	public static DescribeDBNodesParametersResponse unmarshall(DescribeDBNodesParametersResponse describeDBNodesParametersResponse, UnmarshallerContext _ctx) {
		
		describeDBNodesParametersResponse.setRequestId(_ctx.stringValue("DescribeDBNodesParametersResponse.RequestId"));
		describeDBNodesParametersResponse.setDBVersion(_ctx.stringValue("DescribeDBNodesParametersResponse.DBVersion"));
		describeDBNodesParametersResponse.setDBType(_ctx.stringValue("DescribeDBNodesParametersResponse.DBType"));
		describeDBNodesParametersResponse.setEngine(_ctx.stringValue("DescribeDBNodesParametersResponse.Engine"));

		List<DBNodeParameter> dBNodeIds = new ArrayList<DBNodeParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBNodesParametersResponse.DBNodeIds.Length"); i++) {
			DBNodeParameter dBNodeParameter = new DBNodeParameter();
			dBNodeParameter.setDBNodeId(_ctx.stringValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].DBNodeId"));

			List<Parameter> runningParameters = new ArrayList<Parameter>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].RunningParameters.Length"); j++) {
				Parameter parameter = new Parameter();
				parameter.setCheckingCode(_ctx.stringValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].RunningParameters["+ j +"].CheckingCode"));
				parameter.setDataType(_ctx.stringValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].RunningParameters["+ j +"].DataType"));
				parameter.setDefaultParameterValue(_ctx.stringValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].RunningParameters["+ j +"].DefaultParameterValue"));
				parameter.setForceRestart(_ctx.booleanValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].RunningParameters["+ j +"].ForceRestart"));
				parameter.setIsModifiable(_ctx.booleanValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].RunningParameters["+ j +"].IsModifiable"));
				parameter.setParameterDescription(_ctx.stringValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].RunningParameters["+ j +"].ParameterDescription"));
				parameter.setParameterName(_ctx.stringValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].RunningParameters["+ j +"].ParameterName"));
				parameter.setParameterStatus(_ctx.stringValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].RunningParameters["+ j +"].ParameterStatus"));
				parameter.setParameterValue(_ctx.stringValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].RunningParameters["+ j +"].ParameterValue"));
				parameter.setIsNodeAvailable(_ctx.stringValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].RunningParameters["+ j +"].IsNodeAvailable"));
				parameter.setParamRelyRule(_ctx.stringValue("DescribeDBNodesParametersResponse.DBNodeIds["+ i +"].RunningParameters["+ j +"].ParamRelyRule"));

				runningParameters.add(parameter);
			}
			dBNodeParameter.setRunningParameters(runningParameters);

			dBNodeIds.add(dBNodeParameter);
		}
		describeDBNodesParametersResponse.setDBNodeIds(dBNodeIds);
	 
	 	return describeDBNodesParametersResponse;
	}
}