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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnConfigOfVersionResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnConfigOfVersionResponse.VersionConfig;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnConfigOfVersionResponse.VersionConfig.FunctionArg;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnConfigOfVersionResponseUnmarshaller {

	public static DescribeDcdnConfigOfVersionResponse unmarshall(DescribeDcdnConfigOfVersionResponse describeDcdnConfigOfVersionResponse, UnmarshallerContext _ctx) {
		
		describeDcdnConfigOfVersionResponse.setRequestId(_ctx.stringValue("DescribeDcdnConfigOfVersionResponse.RequestId"));

		List<VersionConfig> versionConfigs = new ArrayList<VersionConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnConfigOfVersionResponse.VersionConfigs.Length"); i++) {
			VersionConfig versionConfig = new VersionConfig();
			versionConfig.setStatus(_ctx.stringValue("DescribeDcdnConfigOfVersionResponse.VersionConfigs["+ i +"].Status"));
			versionConfig.setConfigId(_ctx.stringValue("DescribeDcdnConfigOfVersionResponse.VersionConfigs["+ i +"].ConfigId"));
			versionConfig.setFunctionName(_ctx.stringValue("DescribeDcdnConfigOfVersionResponse.VersionConfigs["+ i +"].FunctionName"));

			List<FunctionArg> functionArgs = new ArrayList<FunctionArg>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnConfigOfVersionResponse.VersionConfigs["+ i +"].FunctionArgs.Length"); j++) {
				FunctionArg functionArg = new FunctionArg();
				functionArg.setArgName(_ctx.stringValue("DescribeDcdnConfigOfVersionResponse.VersionConfigs["+ i +"].FunctionArgs["+ j +"].ArgName"));
				functionArg.setArgValue(_ctx.stringValue("DescribeDcdnConfigOfVersionResponse.VersionConfigs["+ i +"].FunctionArgs["+ j +"].ArgValue"));

				functionArgs.add(functionArg);
			}
			versionConfig.setFunctionArgs(functionArgs);

			versionConfigs.add(versionConfig);
		}
		describeDcdnConfigOfVersionResponse.setVersionConfigs(versionConfigs);
	 
	 	return describeDcdnConfigOfVersionResponse;
	}
}