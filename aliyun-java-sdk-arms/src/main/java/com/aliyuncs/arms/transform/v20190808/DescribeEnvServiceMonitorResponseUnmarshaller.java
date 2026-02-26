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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.DescribeEnvServiceMonitorResponse;
import com.aliyuncs.arms.model.v20190808.DescribeEnvServiceMonitorResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnvServiceMonitorResponseUnmarshaller {

	public static DescribeEnvServiceMonitorResponse unmarshall(DescribeEnvServiceMonitorResponse describeEnvServiceMonitorResponse, UnmarshallerContext _ctx) {
		
		describeEnvServiceMonitorResponse.setRequestId(_ctx.stringValue("DescribeEnvServiceMonitorResponse.RequestId"));
		describeEnvServiceMonitorResponse.setCode(_ctx.integerValue("DescribeEnvServiceMonitorResponse.Code"));
		describeEnvServiceMonitorResponse.setMessage(_ctx.stringValue("DescribeEnvServiceMonitorResponse.Message"));

		Data data = new Data();
		data.setEnvironmentId(_ctx.stringValue("DescribeEnvServiceMonitorResponse.Data.EnvironmentId"));
		data.setNamespace(_ctx.stringValue("DescribeEnvServiceMonitorResponse.Data.Namespace"));
		data.setRegionId(_ctx.stringValue("DescribeEnvServiceMonitorResponse.Data.RegionId"));
		data.setServiceMonitorName(_ctx.stringValue("DescribeEnvServiceMonitorResponse.Data.ServiceMonitorName"));
		data.setConfigYaml(_ctx.stringValue("DescribeEnvServiceMonitorResponse.Data.ConfigYaml"));
		data.setStatus(_ctx.stringValue("DescribeEnvServiceMonitorResponse.Data.Status"));
		describeEnvServiceMonitorResponse.setData(data);
	 
	 	return describeEnvServiceMonitorResponse;
	}
}