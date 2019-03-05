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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainDetailResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainDetailResponse.DomainDetail;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainDetailResponse.DomainDetail.Source;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainDetailResponseUnmarshaller {

	public static DescribeDcdnDomainDetailResponse unmarshall(DescribeDcdnDomainDetailResponse describeDcdnDomainDetailResponse, UnmarshallerContext context) {
		
		describeDcdnDomainDetailResponse.setRequestId(context.stringValue("DescribeDcdnDomainDetailResponse.RequestId"));

		DomainDetail domainDetail = new DomainDetail();
		domainDetail.setGmtCreated(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.GmtCreated"));
		domainDetail.setGmtModified(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.GmtModified"));
		domainDetail.setDomainStatus(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.DomainStatus"));
		domainDetail.setCname(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Cname"));
		domainDetail.setDomainName(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.DomainName"));
		domainDetail.setDescription(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Description"));
		domainDetail.setSSLProtocol(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.SSLProtocol"));
		domainDetail.setSSLPub(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.SSLPub"));
		domainDetail.setScope(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Scope"));
		domainDetail.setCertName(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.CertName"));
		domainDetail.setResourceGroupId(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.ResourceGroupId"));

		List<Source> sources = new ArrayList<Source>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources.Length"); i++) {
			Source source = new Source();
			source.setContent(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Content"));
			source.setType(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Type"));
			source.setPort(context.integerValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Port"));
			source.setEnabled(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Enabled"));
			source.setPriority(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Priority"));
			source.setWeight(context.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Weight"));

			sources.add(source);
		}
		domainDetail.setSources(sources);
		describeDcdnDomainDetailResponse.setDomainDetail(domainDetail);
	 
	 	return describeDcdnDomainDetailResponse;
	}
}