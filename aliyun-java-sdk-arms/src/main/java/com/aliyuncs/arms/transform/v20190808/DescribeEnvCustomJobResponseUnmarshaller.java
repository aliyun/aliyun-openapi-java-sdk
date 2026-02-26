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

import com.aliyuncs.arms.model.v20190808.DescribeEnvCustomJobResponse;
import com.aliyuncs.arms.model.v20190808.DescribeEnvCustomJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnvCustomJobResponseUnmarshaller {

	public static DescribeEnvCustomJobResponse unmarshall(DescribeEnvCustomJobResponse describeEnvCustomJobResponse, UnmarshallerContext _ctx) {
		
		describeEnvCustomJobResponse.setRequestId(_ctx.stringValue("DescribeEnvCustomJobResponse.RequestId"));
		describeEnvCustomJobResponse.setCode(_ctx.integerValue("DescribeEnvCustomJobResponse.Code"));
		describeEnvCustomJobResponse.setMessage(_ctx.stringValue("DescribeEnvCustomJobResponse.Message"));

		Data data = new Data();
		data.setEnvironmentId(_ctx.stringValue("DescribeEnvCustomJobResponse.Data.EnvironmentId"));
		data.setRegionId(_ctx.stringValue("DescribeEnvCustomJobResponse.Data.RegionId"));
		data.setCustomJobName(_ctx.stringValue("DescribeEnvCustomJobResponse.Data.CustomJobName"));
		data.setConfigYaml(_ctx.stringValue("DescribeEnvCustomJobResponse.Data.ConfigYaml"));
		data.setStatus(_ctx.stringValue("DescribeEnvCustomJobResponse.Data.Status"));
		describeEnvCustomJobResponse.setData(data);
	 
	 	return describeEnvCustomJobResponse;
	}
}