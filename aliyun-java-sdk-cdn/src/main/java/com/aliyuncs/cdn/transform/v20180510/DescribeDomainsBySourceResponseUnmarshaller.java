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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainsBySourceResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainsBySourceResponse.DomainsData;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainsBySourceResponse.DomainsData.DomainInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainsBySourceResponseUnmarshaller {

	public static DescribeDomainsBySourceResponse unmarshall(DescribeDomainsBySourceResponse describeDomainsBySourceResponse, UnmarshallerContext context) {
		
		describeDomainsBySourceResponse.setRequestId(context.stringValue("DescribeDomainsBySourceResponse.RequestId"));
		describeDomainsBySourceResponse.setSources(context.stringValue("DescribeDomainsBySourceResponse.Sources"));

		List<DomainsData> domainsList = new ArrayList<DomainsData>();
		for (int i = 0; i < context.lengthValue("DescribeDomainsBySourceResponse.DomainsList.Length"); i++) {
			DomainsData domainsData = new DomainsData();
			domainsData.setSource(context.stringValue("DescribeDomainsBySourceResponse.DomainsList["+ i +"].Source"));

			List<String> domains = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeDomainsBySourceResponse.DomainsList["+ i +"].Domains.Length"); j++) {
				domains.add(context.stringValue("DescribeDomainsBySourceResponse.DomainsList["+ i +"].Domains["+ j +"]"));
			}
			domainsData.setDomains(domains);

			List<DomainInfo> domainInfos = new ArrayList<DomainInfo>();
			for (int j = 0; j < context.lengthValue("DescribeDomainsBySourceResponse.DomainsList["+ i +"].DomainInfos.Length"); j++) {
				DomainInfo domainInfo = new DomainInfo();
				domainInfo.setDomainName(context.stringValue("DescribeDomainsBySourceResponse.DomainsList["+ i +"].DomainInfos["+ j +"].DomainName"));
				domainInfo.setDomainCname(context.stringValue("DescribeDomainsBySourceResponse.DomainsList["+ i +"].DomainInfos["+ j +"].DomainCname"));
				domainInfo.setCreateTime(context.stringValue("DescribeDomainsBySourceResponse.DomainsList["+ i +"].DomainInfos["+ j +"].CreateTime"));
				domainInfo.setUpdateTime(context.stringValue("DescribeDomainsBySourceResponse.DomainsList["+ i +"].DomainInfos["+ j +"].UpdateTime"));
				domainInfo.setStatus(context.stringValue("DescribeDomainsBySourceResponse.DomainsList["+ i +"].DomainInfos["+ j +"].Status"));

				domainInfos.add(domainInfo);
			}
			domainsData.setDomainInfos(domainInfos);

			domainsList.add(domainsData);
		}
		describeDomainsBySourceResponse.setDomainsList(domainsList);
	 
	 	return describeDomainsBySourceResponse;
	}
}