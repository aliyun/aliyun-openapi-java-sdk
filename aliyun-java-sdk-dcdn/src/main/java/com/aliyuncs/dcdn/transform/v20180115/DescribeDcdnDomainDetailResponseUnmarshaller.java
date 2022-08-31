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

	public static DescribeDcdnDomainDetailResponse unmarshall(DescribeDcdnDomainDetailResponse describeDcdnDomainDetailResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainDetailResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainDetailResponse.RequestId"));

		DomainDetail domainDetail = new DomainDetail();
		domainDetail.setGmtCreated(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.GmtCreated"));
		domainDetail.setSSLPub(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.SSLPub"));
		domainDetail.setDescription(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Description"));
		domainDetail.setSSLProtocol(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.SSLProtocol"));
		domainDetail.setResourceGroupId(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.ResourceGroupId"));
		domainDetail.setCertName(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.CertName"));
		domainDetail.setScope(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Scope"));
		domainDetail.setCname(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Cname"));
		domainDetail.setDomainStatus(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.DomainStatus"));
		domainDetail.setGmtModified(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.GmtModified"));
		domainDetail.setDomainName(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.DomainName"));

		List<Source> sources = new ArrayList<Source>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources.Length"); i++) {
			Source source = new Source();
			source.setType(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Type"));
			source.setWeight(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Weight"));
			source.setEnabled(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Enabled"));
			source.setPriority(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Priority"));
			source.setPort(_ctx.integerValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Port"));
			source.setContent(_ctx.stringValue("DescribeDcdnDomainDetailResponse.DomainDetail.Sources["+ i +"].Content"));

			sources.add(source);
		}
		domainDetail.setSources(sources);
		describeDcdnDomainDetailResponse.setDomainDetail(domainDetail);
	 
	 	return describeDcdnDomainDetailResponse;
	}
}