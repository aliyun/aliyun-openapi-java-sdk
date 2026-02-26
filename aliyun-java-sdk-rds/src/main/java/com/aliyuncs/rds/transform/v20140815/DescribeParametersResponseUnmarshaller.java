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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeParametersResponse;
import com.aliyuncs.rds.model.v20140815.DescribeParametersResponse.DBInstanceParameter;
import com.aliyuncs.rds.model.v20140815.DescribeParametersResponse.DBInstanceParameter1;
import com.aliyuncs.rds.model.v20140815.DescribeParametersResponse.ParamGroupInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParametersResponseUnmarshaller {

	public static DescribeParametersResponse unmarshall(DescribeParametersResponse describeParametersResponse, UnmarshallerContext _ctx) {
		
		describeParametersResponse.setRequestId(_ctx.stringValue("DescribeParametersResponse.RequestId"));
		describeParametersResponse.setEngine(_ctx.stringValue("DescribeParametersResponse.Engine"));
		describeParametersResponse.setEngineVersion(_ctx.stringValue("DescribeParametersResponse.EngineVersion"));

		ParamGroupInfo paramGroupInfo = new ParamGroupInfo();
		paramGroupInfo.setParamGroupId(_ctx.stringValue("DescribeParametersResponse.ParamGroupInfo.ParamGroupId"));
		paramGroupInfo.setParameterGroupDesc(_ctx.stringValue("DescribeParametersResponse.ParamGroupInfo.ParameterGroupDesc"));
		paramGroupInfo.setParameterGroupName(_ctx.stringValue("DescribeParametersResponse.ParamGroupInfo.ParameterGroupName"));
		paramGroupInfo.setParameterGroupType(_ctx.stringValue("DescribeParametersResponse.ParamGroupInfo.ParameterGroupType"));
		describeParametersResponse.setParamGroupInfo(paramGroupInfo);

		List<DBInstanceParameter> configParameters = new ArrayList<DBInstanceParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.ConfigParameters.Length"); i++) {
			DBInstanceParameter dBInstanceParameter = new DBInstanceParameter();
			dBInstanceParameter.setParameterDescription(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterDescription"));
			dBInstanceParameter.setParameterName(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterName"));
			dBInstanceParameter.setParameterValue(_ctx.stringValue("DescribeParametersResponse.ConfigParameters["+ i +"].ParameterValue"));

			configParameters.add(dBInstanceParameter);
		}
		describeParametersResponse.setConfigParameters(configParameters);

		List<DBInstanceParameter1> runningParameters = new ArrayList<DBInstanceParameter1>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.RunningParameters.Length"); i++) {
			DBInstanceParameter1 dBInstanceParameter1 = new DBInstanceParameter1();
			dBInstanceParameter1.setParameterDefaultValue(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterDefaultValue"));
			dBInstanceParameter1.setParameterDescription(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterDescription"));
			dBInstanceParameter1.setParameterName(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterName"));
			dBInstanceParameter1.setParameterValue(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterValue"));
			dBInstanceParameter1.setParameterValueRange(_ctx.stringValue("DescribeParametersResponse.RunningParameters["+ i +"].ParameterValueRange"));

			runningParameters.add(dBInstanceParameter1);
		}
		describeParametersResponse.setRunningParameters(runningParameters);
	 
	 	return describeParametersResponse;
	}
}