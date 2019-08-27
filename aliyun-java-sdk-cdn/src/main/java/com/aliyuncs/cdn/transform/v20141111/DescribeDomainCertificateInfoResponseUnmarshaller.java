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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainCertificateInfoResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainCertificateInfoResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainCertificateInfoResponseUnmarshaller {

	public static DescribeDomainCertificateInfoResponse unmarshall(DescribeDomainCertificateInfoResponse describeDomainCertificateInfoResponse, UnmarshallerContext _ctx) {
		
		describeDomainCertificateInfoResponse.setRequestId(_ctx.stringValue("DescribeDomainCertificateInfoResponse.RequestId"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainCertificateInfoResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setDomainName(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].DomainName"));
			certInfo.setCertName(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertName"));
			certInfo.setCertDomainName(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertDomainName"));
			certInfo.setCertExpireTime(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertLife(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertLife"));
			certInfo.setCertOrg(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertOrg"));
			certInfo.setCertType(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertType"));
			certInfo.setServerCertificateStatus(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].ServerCertificateStatus"));
			certInfo.setStatus(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].Status"));
			certInfo.setServerCertificate(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].ServerCertificate"));
			certInfo.setCertUpdateTime(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertUpdateTime"));
			certInfo.setCertStartTime(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertStartTime"));
			certInfo.setCertCommonName(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertCommonName"));
			certInfo.setDomainCnameStatus(_ctx.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].DomainCnameStatus"));

			certInfos.add(certInfo);
		}
		describeDomainCertificateInfoResponse.setCertInfos(certInfos);
	 
	 	return describeDomainCertificateInfoResponse;
	}
}