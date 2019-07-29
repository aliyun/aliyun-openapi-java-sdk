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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainConfigsResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainConfigsResponse.DomainConfig;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainConfigsResponse.DomainConfig.FunctionArg;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainConfigsResponseUnmarshaller {

	public static DescribeVsDomainConfigsResponse unmarshall(DescribeVsDomainConfigsResponse describeVsDomainConfigsResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainConfigsResponse.setRequestId(_ctx.stringValue("DescribeVsDomainConfigsResponse.RequestId"));

		List<DomainConfig> domainConfigs = new ArrayList<DomainConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDomainConfigsResponse.DomainConfigs.Length"); i++) {
			DomainConfig domainConfig = new DomainConfig();
			domainConfig.setFunctionName(_ctx.stringValue("DescribeVsDomainConfigsResponse.DomainConfigs["+ i +"].FunctionName"));
			domainConfig.setConfigId(_ctx.stringValue("DescribeVsDomainConfigsResponse.DomainConfigs["+ i +"].ConfigId"));
			domainConfig.setStatus(_ctx.stringValue("DescribeVsDomainConfigsResponse.DomainConfigs["+ i +"].Status"));

			List<FunctionArg> functionArgs = new ArrayList<FunctionArg>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVsDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs.Length"); j++) {
				FunctionArg functionArg = new FunctionArg();
				functionArg.setArgName(_ctx.stringValue("DescribeVsDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgName"));
				functionArg.setArgValue(_ctx.stringValue("DescribeVsDomainConfigsResponse.DomainConfigs["+ i +"].FunctionArgs["+ j +"].ArgValue"));

				functionArgs.add(functionArg);
			}
			domainConfig.setFunctionArgs(functionArgs);

			domainConfigs.add(domainConfig);
		}
		describeVsDomainConfigsResponse.setDomainConfigs(domainConfigs);
	 
	 	return describeVsDomainConfigsResponse;
	}
}