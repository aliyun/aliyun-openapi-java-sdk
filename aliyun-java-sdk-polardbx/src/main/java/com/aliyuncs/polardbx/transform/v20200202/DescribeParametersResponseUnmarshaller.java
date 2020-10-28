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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeParametersResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeParametersResponse.Data;
import com.aliyuncs.polardbx.model.v20200202.DescribeParametersResponse.Data.DBInstanceParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParametersResponseUnmarshaller {

	public static DescribeParametersResponse unmarshall(DescribeParametersResponse describeParametersResponse, UnmarshallerContext _ctx) {
		
		describeParametersResponse.setRequestId(_ctx.stringValue("DescribeParametersResponse.RequestId"));

		Data data = new Data();
		data.setEngine(_ctx.stringValue("DescribeParametersResponse.Data.Engine"));
		data.setEngineVersion(_ctx.stringValue("DescribeParametersResponse.Data.EngineVersion"));

		List<DBInstanceParameter> configParameters = new ArrayList<DBInstanceParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.Data.ConfigParameters.Length"); i++) {
			DBInstanceParameter dBInstanceParameter = new DBInstanceParameter();
			dBInstanceParameter.setParameterDescription(_ctx.stringValue("DescribeParametersResponse.Data.ConfigParameters["+ i +"].ParameterDescription"));
			dBInstanceParameter.setParameterName(_ctx.stringValue("DescribeParametersResponse.Data.ConfigParameters["+ i +"].ParameterName"));
			dBInstanceParameter.setParameterValue(_ctx.stringValue("DescribeParametersResponse.Data.ConfigParameters["+ i +"].ParameterValue"));

			configParameters.add(dBInstanceParameter);
		}
		data.setConfigParameters(configParameters);

		List<DBInstanceParameter> runningParameters = new ArrayList<DBInstanceParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParametersResponse.Data.RunningParameters.Length"); i++) {
			DBInstanceParameter dBInstanceParameter_ = new DBInstanceParameter();
			dBInstanceParameter_.setParameterDescription(_ctx.stringValue("DescribeParametersResponse.Data.RunningParameters["+ i +"].ParameterDescription"));
			dBInstanceParameter_.setParameterName(_ctx.stringValue("DescribeParametersResponse.Data.RunningParameters["+ i +"].ParameterName"));
			dBInstanceParameter_.setParameterValue(_ctx.stringValue("DescribeParametersResponse.Data.RunningParameters["+ i +"].ParameterValue"));

			runningParameters.add(dBInstanceParameter_);
		}
		data.setRunningParameters(runningParameters);
		describeParametersResponse.setData(data);
	 
	 	return describeParametersResponse;
	}
}