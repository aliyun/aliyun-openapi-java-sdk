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

package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainResponseUnmarshaller {

	public static DescribeDomainResponse unmarshall(DescribeDomainResponse describeDomainResponse, UnmarshallerContext _ctx) {
		
		describeDomainResponse.setRequestId(_ctx.stringValue("DescribeDomainResponse.RequestId"));
		describeDomainResponse.setGroupId(_ctx.stringValue("DescribeDomainResponse.GroupId"));
		describeDomainResponse.setDomainName(_ctx.stringValue("DescribeDomainResponse.DomainName"));
		describeDomainResponse.setSubDomain(_ctx.stringValue("DescribeDomainResponse.SubDomain"));
		describeDomainResponse.setCertificateId(_ctx.stringValue("DescribeDomainResponse.CertificateId"));
		describeDomainResponse.setCertificateName(_ctx.stringValue("DescribeDomainResponse.CertificateName"));
		describeDomainResponse.setCertificateBody(_ctx.stringValue("DescribeDomainResponse.CertificateBody"));
		describeDomainResponse.setCertificatePrivateKey(_ctx.stringValue("DescribeDomainResponse.CertificatePrivateKey"));
		describeDomainResponse.setDomainBindingStatus(_ctx.stringValue("DescribeDomainResponse.DomainBindingStatus"));
		describeDomainResponse.setDomainCNAMEStatus(_ctx.stringValue("DescribeDomainResponse.DomainCNAMEStatus"));
		describeDomainResponse.setDomainLegalStatus(_ctx.stringValue("DescribeDomainResponse.DomainLegalStatus"));
		describeDomainResponse.setDomainWebSocketStatus(_ctx.stringValue("DescribeDomainResponse.DomainWebSocketStatus"));
		describeDomainResponse.setDomainRemark(_ctx.stringValue("DescribeDomainResponse.DomainRemark"));
	 
	 	return describeDomainResponse;
	}
}