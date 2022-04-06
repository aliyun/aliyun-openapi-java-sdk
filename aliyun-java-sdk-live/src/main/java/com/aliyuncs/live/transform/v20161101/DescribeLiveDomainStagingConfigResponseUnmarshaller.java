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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainStagingConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainStagingConfigResponse.DomainConfig;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainStagingConfigResponse.DomainConfig.FunctionArg;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainStagingConfigResponseUnmarshaller {

	public static DescribeLiveDomainStagingConfigResponse unmarshall(DescribeLiveDomainStagingConfigResponse describeLiveDomainStagingConfigResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainStagingConfigResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainStagingConfigResponse.RequestId"));

		List<DomainConfig> domainConfigs = new ArrayList<DomainConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainStagingConfigResponse.DomainConfigs.Length"); i++) {
			DomainConfig domainConfig = new DomainConfig();
			domainConfig.setStatus(_ctx.stringValue("DescribeLiveDomainStagingConfigResponse.DomainConfigs["+ i +"].Status"));
			domainConfig.setConfigId(_ctx.stringValue("DescribeLiveDomainStagingConfigResponse.DomainConfigs["+ i +"].ConfigId"));
			domainConfig.setFunctionName(_ctx.stringValue("DescribeLiveDomainStagingConfigResponse.DomainConfigs["+ i +"].FunctionName"));

			List<FunctionArg> functionArgs = new ArrayList<FunctionArg>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveDomainStagingConfigResponse.DomainConfigs["+ i +"].FunctionArgs.Length"); j++) {
				FunctionArg functionArg = new FunctionArg();
				functionArg.setArgName(_ctx.stringValue("DescribeLiveDomainStagingConfigResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgName"));
				functionArg.setArgValue(_ctx.stringValue("DescribeLiveDomainStagingConfigResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgValue"));

				functionArgs.add(functionArg);
			}
			domainConfig.setFunctionArgs(functionArgs);

			domainConfigs.add(domainConfig);
		}
		describeLiveDomainStagingConfigResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeLiveDomainStagingConfigResponse;
	}
}