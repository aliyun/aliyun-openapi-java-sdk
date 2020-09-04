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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainStagingConfigResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainStagingConfigResponse.DomainConfig;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainStagingConfigResponse.DomainConfig.FunctionArg;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainStagingConfigResponseUnmarshaller {

	public static DescribeDcdnDomainStagingConfigResponse unmarshall(DescribeDcdnDomainStagingConfigResponse describeDcdnDomainStagingConfigResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainStagingConfigResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainStagingConfigResponse.RequestId"));

		List<DomainConfig> domainConfigs = new ArrayList<DomainConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainStagingConfigResponse.DomainConfigs.Length"); i++) {
			DomainConfig domainConfig = new DomainConfig();
			domainConfig.setFunctionName(_ctx.stringValue("DescribeDcdnDomainStagingConfigResponse.DomainConfigs["+ i +"].FunctionName"));
			domainConfig.setConfigId(_ctx.stringValue("DescribeDcdnDomainStagingConfigResponse.DomainConfigs["+ i +"].ConfigId"));
			domainConfig.setStatus(_ctx.stringValue("DescribeDcdnDomainStagingConfigResponse.DomainConfigs["+ i +"].Status"));

			List<FunctionArg> functionArgs = new ArrayList<FunctionArg>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnDomainStagingConfigResponse.DomainConfigs["+ i +"].FunctionArgs.Length"); j++) {
				FunctionArg functionArg = new FunctionArg();
				functionArg.setArgName(_ctx.stringValue("DescribeDcdnDomainStagingConfigResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgName"));
				functionArg.setArgValue(_ctx.stringValue("DescribeDcdnDomainStagingConfigResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgValue"));

				functionArgs.add(functionArg);
			}
			domainConfig.setFunctionArgs(functionArgs);

			domainConfigs.add(domainConfig);
		}
		describeDcdnDomainStagingConfigResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeDcdnDomainStagingConfigResponse;
	}
}