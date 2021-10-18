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

package com.aliyuncs.waf_openapi.transform.v20180117;

import com.aliyuncs.waf_openapi.model.v20180117.DescribeDomainConfigResponse;
import com.aliyuncs.waf_openapi.model.v20180117.DescribeDomainConfigResponse.Result;
import com.aliyuncs.waf_openapi.model.v20180117.DescribeDomainConfigResponse.Result.DomainConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainConfigResponseUnmarshaller {

	public static DescribeDomainConfigResponse unmarshall(DescribeDomainConfigResponse describeDomainConfigResponse, UnmarshallerContext _ctx) {
		
		describeDomainConfigResponse.setRequestId(_ctx.stringValue("DescribeDomainConfigResponse.RequestId"));

		Result result = new Result();
		result.setWafTaskId(_ctx.stringValue("DescribeDomainConfigResponse.Result.WafTaskId"));
		result.setStatus(_ctx.integerValue("DescribeDomainConfigResponse.Result.Status"));

		DomainConfig domainConfig = new DomainConfig();
		domainConfig.setCname(_ctx.stringValue("DescribeDomainConfigResponse.Result.DomainConfig.Cname"));
		domainConfig.setProtocolType(_ctx.integerValue("DescribeDomainConfigResponse.Result.DomainConfig.ProtocolType"));
		domainConfig.setSourceIps(_ctx.stringValue("DescribeDomainConfigResponse.Result.DomainConfig.SourceIps"));
		result.setDomainConfig(domainConfig);
		describeDomainConfigResponse.setResult(result);
	 
	 	return describeDomainConfigResponse;
	}
}