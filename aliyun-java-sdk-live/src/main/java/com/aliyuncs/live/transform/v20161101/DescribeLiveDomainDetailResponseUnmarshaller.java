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

	public static DescribeLiveDomainDetailResponse unmarshall(DescribeLiveDomainDetailResponse describeLiveDomainDetailResponse, UnmarshallerContext context) {
		
		describeLiveDomainDetailResponse.setRequestId(context.stringValue("DescribeLiveDomainDetailResponse.RequestId"));

		DomainDetail domainDetail = new DomainDetail();
		domainDetail.setGmtCreated(context.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.GmtCreated"));
		domainDetail.setGmtModified(context.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.GmtModified"));
		domainDetail.setDomainStatus(context.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.DomainStatus"));
		domainDetail.setCname(context.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.Cname"));
		domainDetail.setDomainName(context.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.DomainName"));
		domainDetail.setLiveDomainType(context.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.LiveDomainType"));
		domainDetail.setRegion(context.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.Region"));
		domainDetail.setDescription(context.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.Description"));
		domainDetail.setSSLProtocol(context.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.SSLProtocol"));
		domainDetail.setSSLPub(context.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.SSLPub"));
		domainDetail.setScope(context.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.Scope"));
		domainDetail.setCertName(context.stringValue("DescribeLiveDomainDetailResponse.DomainDetail.CertName"));
		describeLiveDomainDetailResponse.setDomainDetail(domainDetail);
	 
	 	return describeLiveDomainDetailResponse;
	}
}