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

import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainStagingConfigResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainStagingConfigResponse.DomainConfig;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainStagingConfigResponse.DomainConfig.FunctionArg;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnDomainStagingConfigResponseUnmarshaller {

	public static DescribeCdnDomainStagingConfigResponse unmarshall(DescribeCdnDomainStagingConfigResponse describeCdnDomainStagingConfigResponse, UnmarshallerContext _ctx) {
		
		describeCdnDomainStagingConfigResponse.setRequestId(_ctx.stringValue("DescribeCdnDomainStagingConfigResponse.RequestId"));

		List<DomainConfig> domainConfigs = new ArrayList<DomainConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnDomainStagingConfigResponse.DomainConfigs.Length"); i++) {
			DomainConfig domainConfig = new DomainConfig();
			domainConfig.setFunctionName(_ctx.stringValue("DescribeCdnDomainStagingConfigResponse.DomainConfigs["+ i +"].FunctionName"));
			domainConfig.setConfigId(_ctx.stringValue("DescribeCdnDomainStagingConfigResponse.DomainConfigs["+ i +"].ConfigId"));
			domainConfig.setStatus(_ctx.stringValue("DescribeCdnDomainStagingConfigResponse.DomainConfigs["+ i +"].Status"));

			List<FunctionArg> functionArgs = new ArrayList<FunctionArg>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCdnDomainStagingConfigResponse.DomainConfigs["+ i +"].FunctionArgs.Length"); j++) {
				FunctionArg functionArg = new FunctionArg();
				functionArg.setArgName(_ctx.stringValue("DescribeCdnDomainStagingConfigResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgName"));
				functionArg.setArgValue(_ctx.stringValue("DescribeCdnDomainStagingConfigResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgValue"));

				functionArgs.add(functionArg);
			}
			domainConfig.setFunctionArgs(functionArgs);

			domainConfigs.add(domainConfig);
		}
		describeCdnDomainStagingConfigResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeCdnDomainStagingConfigResponse;
	}
}