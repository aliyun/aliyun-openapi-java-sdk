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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainDetailResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainDetailResponse.DomainDetail;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainDetailResponse.DomainDetail.Source;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainDetailResponseUnmarshaller {

	public static DescribeScdnDomainDetailResponse unmarshall(DescribeScdnDomainDetailResponse describeScdnDomainDetailResponse, UnmarshallerContext context) {
		
		describeScdnDomainDetailResponse.setRequestId(context.stringValue("DescribeScdnDomainDetailResponse.RequestId"));

		DomainDetail domainDetail = new DomainDetail();
		domainDetail.setGmtCreated(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.GmtCreated"));
		domainDetail.setGmtModified(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.GmtModified"));
		domainDetail.setDomainStatus(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.DomainStatus"));
		domainDetail.setCname(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.Cname"));
		domainDetail.setDomainName(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.DomainName"));
		domainDetail.setDescription(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.Description"));
		domainDetail.setSSLProtocol(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.SSLProtocol"));
		domainDetail.setSSLPub(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.SSLPub"));
		domainDetail.setScope(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.Scope"));
		domainDetail.setCertName(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.CertName"));
		domainDetail.setResourceGroupId(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.ResourceGroupId"));

		List<Source> sources = new ArrayList<Source>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainDetailResponse.DomainDetail.Sources.Length"); i++) {
			Source source = new Source();
			source.setContent(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Content"));
			source.setType(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Type"));
			source.setPort(context.integerValue("DescribeScdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Port"));
			source.setEnabled(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Enabled"));
			source.setPriority(context.stringValue("DescribeScdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Priority"));

			sources.add(source);
		}
		domainDetail.setSources(sources);
		describeScdnDomainDetailResponse.setDomainDetail(domainDetail);
	 
	 	return describeScdnDomainDetailResponse;
	}
}