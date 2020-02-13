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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeConfigOfVersionResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeConfigOfVersionResponse.VersionConfig;
import com.aliyuncs.cdn.model.v20180510.DescribeConfigOfVersionResponse.VersionConfig.FunctionArg;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConfigOfVersionResponseUnmarshaller {

	public static DescribeConfigOfVersionResponse unmarshall(DescribeConfigOfVersionResponse describeConfigOfVersionResponse, UnmarshallerContext _ctx) {
		
		describeConfigOfVersionResponse.setRequestId(_ctx.stringValue("DescribeConfigOfVersionResponse.RequestId"));

		List<VersionConfig> versionConfigs = new ArrayList<VersionConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConfigOfVersionResponse.VersionConfigs.Length"); i++) {
			VersionConfig versionConfig = new VersionConfig();
			versionConfig.setStatus(_ctx.stringValue("DescribeConfigOfVersionResponse.VersionConfigs["+ i +"].Status"));
			versionConfig.setConfigId(_ctx.stringValue("DescribeConfigOfVersionResponse.VersionConfigs["+ i +"].ConfigId"));
			versionConfig.setFunctionName(_ctx.stringValue("DescribeConfigOfVersionResponse.VersionConfigs["+ i +"].FunctionName"));

			List<FunctionArg> functionArgs = new ArrayList<FunctionArg>();
			for (int j = 0; j < _ctx.lengthValue("DescribeConfigOfVersionResponse.VersionConfigs["+ i +"].FunctionArgs.Length"); j++) {
				FunctionArg functionArg = new FunctionArg();
				functionArg.setArgName(_ctx.stringValue("DescribeConfigOfVersionResponse.VersionConfigs["+ i +"].FunctionArgs["+ j +"].ArgName"));
				functionArg.setArgValue(_ctx.stringValue("DescribeConfigOfVersionResponse.VersionConfigs["+ i +"].FunctionArgs["+ j +"].ArgValue"));

				functionArgs.add(functionArg);
			}
			versionConfig.setFunctionArgs(functionArgs);

			versionConfigs.add(versionConfig);
		}
		describeConfigOfVersionResponse.setVersionConfigs(versionConfigs);
	 
	 	return describeConfigOfVersionResponse;
	}
}