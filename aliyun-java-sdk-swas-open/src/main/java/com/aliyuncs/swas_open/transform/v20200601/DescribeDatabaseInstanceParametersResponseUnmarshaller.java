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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.DescribeDatabaseInstanceParametersResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeDatabaseInstanceParametersResponse.ConfigParameter;
import com.aliyuncs.swas_open.model.v20200601.DescribeDatabaseInstanceParametersResponse.RunningParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabaseInstanceParametersResponseUnmarshaller {

	public static DescribeDatabaseInstanceParametersResponse unmarshall(DescribeDatabaseInstanceParametersResponse describeDatabaseInstanceParametersResponse, UnmarshallerContext _ctx) {
		
		describeDatabaseInstanceParametersResponse.setRequestId(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.RequestId"));
		describeDatabaseInstanceParametersResponse.setEngineVersion(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.EngineVersion"));
		describeDatabaseInstanceParametersResponse.setEngine(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.Engine"));

		List<RunningParameter> runningParameters = new ArrayList<RunningParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDatabaseInstanceParametersResponse.RunningParameters.Length"); i++) {
			RunningParameter runningParameter = new RunningParameter();
			runningParameter.setForceModify(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.RunningParameters["+ i +"].ForceModify"));
			runningParameter.setCheckingCode(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.RunningParameters["+ i +"].CheckingCode"));
			runningParameter.setParameterValue(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.RunningParameters["+ i +"].ParameterValue"));
			runningParameter.setForceRestart(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.RunningParameters["+ i +"].ForceRestart"));
			runningParameter.setParameterName(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.RunningParameters["+ i +"].ParameterName"));
			runningParameter.setParameterDescription(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.RunningParameters["+ i +"].ParameterDescription"));

			runningParameters.add(runningParameter);
		}
		describeDatabaseInstanceParametersResponse.setRunningParameters(runningParameters);

		List<ConfigParameter> configParameters = new ArrayList<ConfigParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDatabaseInstanceParametersResponse.ConfigParameters.Length"); i++) {
			ConfigParameter configParameter = new ConfigParameter();
			configParameter.setForceModify(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.ConfigParameters["+ i +"].ForceModify"));
			configParameter.setCheckingCode(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.ConfigParameters["+ i +"].CheckingCode"));
			configParameter.setParameterValue(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.ConfigParameters["+ i +"].ParameterValue"));
			configParameter.setForceRestart(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.ConfigParameters["+ i +"].ForceRestart"));
			configParameter.setParameterName(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.ConfigParameters["+ i +"].ParameterName"));
			configParameter.setParameterDescription(_ctx.stringValue("DescribeDatabaseInstanceParametersResponse.ConfigParameters["+ i +"].ParameterDescription"));

			configParameters.add(configParameter);
		}
		describeDatabaseInstanceParametersResponse.setConfigParameters(configParameters);
	 
	 	return describeDatabaseInstanceParametersResponse;
	}
}