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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaDomainConfigsResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaDomainConfigsResponse.DomainConfig;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaDomainConfigsResponse.DomainConfig.FunctionArg;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnIpaDomainConfigsResponseUnmarshaller {

	public static DescribeDcdnIpaDomainConfigsResponse unmarshall(DescribeDcdnIpaDomainConfigsResponse describeDcdnIpaDomainConfigsResponse, UnmarshallerContext _ctx) {
		
		describeDcdnIpaDomainConfigsResponse.setRequestId(_ctx.stringValue("DescribeDcdnIpaDomainConfigsResponse.RequestId"));

		List<DomainConfig> domainConfigs = new ArrayList<DomainConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnIpaDomainConfigsResponse.DomainConfigs.Length"); i++) {
			DomainConfig domainConfig = new DomainConfig();
			domainConfig.setFunctionName(_ctx.stringValue("DescribeDcdnIpaDomainConfigsResponse.DomainConfigs["+ i +"].FunctionName"));
			domainConfig.setConfigId(_ctx.stringValue("DescribeDcdnIpaDomainConfigsResponse.DomainConfigs["+ i +"].ConfigId"));
			domainConfig.setStatus(_ctx.stringValue("DescribeDcdnIpaDomainConfigsResponse.DomainConfigs["+ i +"].Status"));

			List<FunctionArg> functionArgs = new ArrayList<FunctionArg>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnIpaDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs.Length"); j++) {
				FunctionArg functionArg = new FunctionArg();
				functionArg.setArgName(_ctx.stringValue("DescribeDcdnIpaDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgName"));
				functionArg.setArgValue(_ctx.stringValue("DescribeDcdnIpaDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgValue"));

				functionArgs.add(functionArg);
			}
			domainConfig.setFunctionArgs(functionArgs);

			domainConfigs.add(domainConfig);
		}
		describeDcdnIpaDomainConfigsResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeDcdnIpaDomainConfigsResponse;
	}
}