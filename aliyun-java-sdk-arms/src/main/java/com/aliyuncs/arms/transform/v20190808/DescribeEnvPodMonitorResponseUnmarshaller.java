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

import com.aliyuncs.arms.model.v20190808.DescribeEnvPodMonitorResponse;
import com.aliyuncs.arms.model.v20190808.DescribeEnvPodMonitorResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnvPodMonitorResponseUnmarshaller {

	public static DescribeEnvPodMonitorResponse unmarshall(DescribeEnvPodMonitorResponse describeEnvPodMonitorResponse, UnmarshallerContext _ctx) {
		
		describeEnvPodMonitorResponse.setRequestId(_ctx.stringValue("DescribeEnvPodMonitorResponse.RequestId"));
		describeEnvPodMonitorResponse.setCode(_ctx.integerValue("DescribeEnvPodMonitorResponse.Code"));
		describeEnvPodMonitorResponse.setMessage(_ctx.stringValue("DescribeEnvPodMonitorResponse.Message"));

		Data data = new Data();
		data.setEnvironmentId(_ctx.stringValue("DescribeEnvPodMonitorResponse.Data.EnvironmentId"));
		data.setRegionId(_ctx.stringValue("DescribeEnvPodMonitorResponse.Data.RegionId"));
		data.setNamespace(_ctx.stringValue("DescribeEnvPodMonitorResponse.Data.Namespace"));
		data.setPodMonitorName(_ctx.stringValue("DescribeEnvPodMonitorResponse.Data.PodMonitorName"));
		data.setConfigYaml(_ctx.stringValue("DescribeEnvPodMonitorResponse.Data.ConfigYaml"));
		data.setStatus(_ctx.stringValue("DescribeEnvPodMonitorResponse.Data.Status"));
		describeEnvPodMonitorResponse.setData(data);
	 
	 	return describeEnvPodMonitorResponse;
	}
}