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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainCertificateInfoResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainCertificateInfoResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainCertificateInfoResponseUnmarshaller {

	public static DescribeDomainCertificateInfoResponse unmarshall(DescribeDomainCertificateInfoResponse describeDomainCertificateInfoResponse, UnmarshallerContext context) {
		
		describeDomainCertificateInfoResponse.setRequestId(context.stringValue("DescribeDomainCertificateInfoResponse.RequestId"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < context.lengthValue("DescribeDomainCertificateInfoResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setDomainName(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].DomainName"));
			certInfo.setCertName(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertName"));
			certInfo.setCertDomainName(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertDomainName"));
			certInfo.setCertExpireTime(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertLife(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertLife"));
			certInfo.setCertOrg(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertOrg"));
			certInfo.setCertType(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertType"));
			certInfo.setServerCertificateStatus(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].ServerCertificateStatus"));
			certInfo.setStatus(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].Status"));
			certInfo.setServerCertificate(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].ServerCertificate"));
			certInfo.setCertUpdateTime(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertUpdateTime"));
			certInfo.setCertStartTime(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].CertStartTime"));
			certInfo.setDomainCnameStatus(context.stringValue("DescribeDomainCertificateInfoResponse.CertInfos["+ i +"].DomainCnameStatus"));

			certInfos.add(certInfo);
		}
		describeDomainCertificateInfoResponse.setCertInfos(certInfos);
	 
	 	return describeDomainCertificateInfoResponse;
	}
}