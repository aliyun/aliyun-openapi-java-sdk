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

import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainConfigsResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainConfigsResponse.DomainConfig;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainConfigsResponse.DomainConfig.FunctionArg;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnDomainConfigsResponseUnmarshaller {

	public static DescribeCdnDomainConfigsResponse unmarshall(DescribeCdnDomainConfigsResponse describeCdnDomainConfigsResponse, UnmarshallerContext context) {
		
		describeCdnDomainConfigsResponse.setRequestId(context.stringValue("DescribeCdnDomainConfigsResponse.RequestId"));

		List<DomainConfig> domainConfigs = new ArrayList<DomainConfig>();
		for (int i = 0; i < context.lengthValue("DescribeCdnDomainConfigsResponse.DomainConfigs.Length"); i++) {
			DomainConfig domainConfig = new DomainConfig();
			domainConfig.setFunctionName(context.stringValue("DescribeCdnDomainConfigsResponse.DomainConfigs["+ i +"].FunctionName"));
			domainConfig.setConfigId(context.stringValue("DescribeCdnDomainConfigsResponse.DomainConfigs["+ i +"].ConfigId"));
			domainConfig.setStatus(context.stringValue("DescribeCdnDomainConfigsResponse.DomainConfigs["+ i +"].Status"));

			List<FunctionArg> functionArgs = new ArrayList<FunctionArg>();
			for (int j = 0; j < context.lengthValue("DescribeCdnDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs.Length"); j++) {
				FunctionArg functionArg = new FunctionArg();
				functionArg.setArgName(context.stringValue("DescribeCdnDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgName"));
				functionArg.setArgValue(context.stringValue("DescribeCdnDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgValue"));

				functionArgs.add(functionArg);
			}
			domainConfig.setFunctionArgs(functionArgs);

			domainConfigs.add(domainConfig);
		}
		describeCdnDomainConfigsResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeCdnDomainConfigsResponse;
	}
}