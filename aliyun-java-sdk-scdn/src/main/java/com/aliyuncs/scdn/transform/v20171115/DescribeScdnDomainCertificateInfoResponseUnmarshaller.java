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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainCertificateInfoResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainCertificateInfoResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainCertificateInfoResponseUnmarshaller {

	public static DescribeScdnDomainCertificateInfoResponse unmarshall(DescribeScdnDomainCertificateInfoResponse describeScdnDomainCertificateInfoResponse, UnmarshallerContext context) {
		
		describeScdnDomainCertificateInfoResponse.setRequestId(context.stringValue("DescribeScdnDomainCertificateInfoResponse.RequestId"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainCertificateInfoResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setDomainName(context.stringValue("DescribeScdnDomainCertificateInfoResponse.CertInfos["+ i +"].DomainName"));
			certInfo.setCertName(context.stringValue("DescribeScdnDomainCertificateInfoResponse.CertInfos["+ i +"].CertName"));
			certInfo.setCertDomainName(context.stringValue("DescribeScdnDomainCertificateInfoResponse.CertInfos["+ i +"].CertDomainName"));
			certInfo.setCertExpireTime(context.stringValue("DescribeScdnDomainCertificateInfoResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertLife(context.stringValue("DescribeScdnDomainCertificateInfoResponse.CertInfos["+ i +"].CertLife"));
			certInfo.setCertOrg(context.stringValue("DescribeScdnDomainCertificateInfoResponse.CertInfos["+ i +"].CertOrg"));
			certInfo.setCertType(context.stringValue("DescribeScdnDomainCertificateInfoResponse.CertInfos["+ i +"].CertType"));
			certInfo.setSSLProtocol(context.stringValue("DescribeScdnDomainCertificateInfoResponse.CertInfos["+ i +"].SSLProtocol"));
			certInfo.setStatus(context.stringValue("DescribeScdnDomainCertificateInfoResponse.CertInfos["+ i +"].Status"));
			certInfo.setSSLPub(context.stringValue("DescribeScdnDomainCertificateInfoResponse.CertInfos["+ i +"].SSLPub"));

			certInfos.add(certInfo);
		}
		describeScdnDomainCertificateInfoResponse.setCertInfos(certInfos);
	 
	 	return describeScdnDomainCertificateInfoResponse;
	}
}