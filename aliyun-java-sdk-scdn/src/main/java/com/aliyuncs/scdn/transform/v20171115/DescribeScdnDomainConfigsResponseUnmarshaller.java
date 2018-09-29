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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainConfigsResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainConfigsResponse.DomainConfig;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainConfigsResponse.DomainConfig.FunctionArg;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainConfigsResponseUnmarshaller {

	public static DescribeScdnDomainConfigsResponse unmarshall(DescribeScdnDomainConfigsResponse describeScdnDomainConfigsResponse, UnmarshallerContext context) {
		
		describeScdnDomainConfigsResponse.setRequestId(context.stringValue("DescribeScdnDomainConfigsResponse.RequestId"));

		List<DomainConfig> domainConfigs = new ArrayList<DomainConfig>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainConfigsResponse.DomainConfigs.Length"); i++) {
			DomainConfig domainConfig = new DomainConfig();
			domainConfig.setFunctionName(context.stringValue("DescribeScdnDomainConfigsResponse.DomainConfigs["+ i +"].FunctionName"));
			domainConfig.setConfigId(context.stringValue("DescribeScdnDomainConfigsResponse.DomainConfigs["+ i +"].ConfigId"));
			domainConfig.setStatus(context.stringValue("DescribeScdnDomainConfigsResponse.DomainConfigs["+ i +"].Status"));

			List<FunctionArg> functionArgs = new ArrayList<FunctionArg>();
			for (int j = 0; j < context.lengthValue("DescribeScdnDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs.Length"); j++) {
				FunctionArg functionArg = new FunctionArg();
				functionArg.setArgName(context.stringValue("DescribeScdnDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgName"));
				functionArg.setArgValue(context.stringValue("DescribeScdnDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgValue"));

				functionArgs.add(functionArg);
			}
			domainConfig.setFunctionArgs(functionArgs);

			domainConfigs.add(domainConfig);
		}
		describeScdnDomainConfigsResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeScdnDomainConfigsResponse;
	}
}