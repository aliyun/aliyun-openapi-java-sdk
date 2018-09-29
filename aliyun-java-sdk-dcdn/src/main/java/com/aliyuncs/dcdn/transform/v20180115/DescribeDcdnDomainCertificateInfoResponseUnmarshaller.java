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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainCertificateInfoResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainCertificateInfoResponse.CertInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainCertificateInfoResponseUnmarshaller {

	public static DescribeDcdnDomainCertificateInfoResponse unmarshall(DescribeDcdnDomainCertificateInfoResponse describeDcdnDomainCertificateInfoResponse, UnmarshallerContext context) {
		
		describeDcdnDomainCertificateInfoResponse.setRequestId(context.stringValue("DescribeDcdnDomainCertificateInfoResponse.RequestId"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainCertificateInfoResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setDomainName(context.stringValue("DescribeDcdnDomainCertificateInfoResponse.CertInfos["+ i +"].DomainName"));
			certInfo.setCertName(context.stringValue("DescribeDcdnDomainCertificateInfoResponse.CertInfos["+ i +"].CertName"));
			certInfo.setCertDomainName(context.stringValue("DescribeDcdnDomainCertificateInfoResponse.CertInfos["+ i +"].CertDomainName"));
			certInfo.setCertExpireTime(context.stringValue("DescribeDcdnDomainCertificateInfoResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertLife(context.stringValue("DescribeDcdnDomainCertificateInfoResponse.CertInfos["+ i +"].CertLife"));
			certInfo.setCertOrg(context.stringValue("DescribeDcdnDomainCertificateInfoResponse.CertInfos["+ i +"].CertOrg"));
			certInfo.setCertType(context.stringValue("DescribeDcdnDomainCertificateInfoResponse.CertInfos["+ i +"].CertType"));
			certInfo.setSSLProtocol(context.stringValue("DescribeDcdnDomainCertificateInfoResponse.CertInfos["+ i +"].SSLProtocol"));
			certInfo.setStatus(context.stringValue("DescribeDcdnDomainCertificateInfoResponse.CertInfos["+ i +"].Status"));
			certInfo.setSSLPub(context.stringValue("DescribeDcdnDomainCertificateInfoResponse.CertInfos["+ i +"].SSLPub"));

			certInfos.add(certInfo);
		}
		describeDcdnDomainCertificateInfoResponse.setCertInfos(certInfos);
	 
	 	return describeDcdnDomainCertificateInfoResponse;
	}
}