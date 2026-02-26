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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainDetailResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainDetailResponse.DomainDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainDetailResponseUnmarshaller {

	public static DescribeLiveDomainDetailResponse unmarshall(DescribeLiveDomainDetailResponse describeLiveDomainDetailResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainDetailResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainDetailResponse.RequestId"));

		DomainDetail domainDetail = new DomainDetail();
		domainDetail.setCertName(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.CertName"));
		domainDetail.setCname(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.Cname"));
		domainDetail.setDescription(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.Description"));
		domainDetail.setDomainName(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.DomainName"));
		domainDetail.setDomainStatus(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.DomainStatus"));
		domainDetail.setGmtCreated(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.GmtCreated"));
		domainDetail.setGmtModified(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.GmtModified"));
		domainDetail.setLiveDomainType(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.LiveDomainType"));
		domainDetail.setRegion(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.Region"));
		domainDetail.setSSLProtocol(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.SSLProtocol"));
		domainDetail.setSSLPub(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.SSLPub"));
		domainDetail.setScope(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.Scope"));
		domainDetail.setResourceGroupId(_ctx.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.ResourceGroupId"));
		describeLiveDomainDetailResponse.setDomainDetail(domainDetail);
	 
	 	return describeLiveDomainDetailResponse;
	}
}