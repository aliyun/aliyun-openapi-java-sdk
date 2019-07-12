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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainConfigsResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainConfigsResponse.DomainConfig;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainConfigsResponse.DomainConfig.FunctionArg;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainConfigsResponseUnmarshaller {

	public static DescribeLiveDomainConfigsResponse unmarshall(DescribeLiveDomainConfigsResponse describeLiveDomainConfigsResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainConfigsResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainConfigsResponse.RequestId"));

		List<DomainConfig> domainConfigs = new ArrayList<DomainConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainConfigsResponse.DomainConfigs.Length"); i++) {
			DomainConfig domainConfig = new DomainConfig();
			domainConfig.setFunctionName(_ctx.stringValue("DescribeLiveDomainConfigsResponse.DomainConfigs["+ i +"].FunctionName"));
			domainConfig.setConfigId(_ctx.stringValue("DescribeLiveDomainConfigsResponse.DomainConfigs["+ i +"].ConfigId"));
			domainConfig.setStatus(_ctx.stringValue("DescribeLiveDomainConfigsResponse.DomainConfigs["+ i +"].Status"));

			List<FunctionArg> functionArgs = new ArrayList<FunctionArg>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs.Length"); j++) {
				FunctionArg functionArg = new FunctionArg();
				functionArg.setArgName(_ctx.stringValue("DescribeLiveDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgName"));
				functionArg.setArgValue(_ctx.stringValue("DescribeLiveDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgValue"));

				functionArgs.add(functionArg);
			}
			domainConfig.setFunctionArgs(functionArgs);

			domainConfigs.add(domainConfig);
		}
		describeLiveDomainConfigsResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeLiveDomainConfigsResponse;
	}
}