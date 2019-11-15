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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaDomainDetailResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaDomainDetailResponse.DomainDetail;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaDomainDetailResponse.DomainDetail.Source;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnIpaDomainDetailResponseUnmarshaller {

	public static DescribeDcdnIpaDomainDetailResponse unmarshall(DescribeDcdnIpaDomainDetailResponse describeDcdnIpaDomainDetailResponse, UnmarshallerContext _ctx) {
		
		describeDcdnIpaDomainDetailResponse.setRequestId(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.RequestId"));

		DomainDetail domainDetail = new DomainDetail();
		domainDetail.setGmtCreated(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.GmtCreated"));
		domainDetail.setGmtModified(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.GmtModified"));
		domainDetail.setDomainStatus(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.DomainStatus"));
		domainDetail.setCname(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.Cname"));
		domainDetail.setDomainName(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.DomainName"));
		domainDetail.setDescription(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.Description"));
		domainDetail.setSSLProtocol(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.SSLProtocol"));
		domainDetail.setSSLPub(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.SSLPub"));
		domainDetail.setScope(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.Scope"));
		domainDetail.setCertName(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.CertName"));
		domainDetail.setResourceGroupId(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.ResourceGroupId"));

		List<Source> sources = new ArrayList<Source>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.Sources.Length"); i++) {
			Source source = new Source();
			source.setContent(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.Sources["+ i +"].Content"));
			source.setType(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.Sources["+ i +"].Type"));
			source.setPort(_ctx.integerValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.Sources["+ i +"].Port"));
			source.setEnabled(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.Sources["+ i +"].Enabled"));
			source.setPriority(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.Sources["+ i +"].Priority"));
			source.setWeight(_ctx.stringValue("DescribeDcdnIpaDomainDetailResponse.DomainDetail.Sources["+ i +"].Weight"));

			sources.add(source);
		}
		domainDetail.setSources(sources);
		describeDcdnIpaDomainDetailResponse.setDomainDetail(domainDetail);
	 
	 	return describeDcdnIpaDomainDetailResponse;
	}
}