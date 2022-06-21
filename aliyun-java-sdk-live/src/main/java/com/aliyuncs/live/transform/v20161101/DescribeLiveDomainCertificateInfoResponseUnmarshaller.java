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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainCertificateInfoResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainCertificateInfoResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainCertificateInfoResponseUnmarshaller {

	public static DescribeLiveDomainCertificateInfoResponse unmarshall(DescribeLiveDomainCertificateInfoResponse describeLiveDomainCertificateInfoResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainCertificateInfoResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainCertificateInfoResponse.RequestId"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainCertificateInfoResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setDomainName(_ctx.stringValue("DescribeLiveDomainCertificateInfoResponse.CertInfos["+ i +"].DomainName"));
			certInfo.setCertName(_ctx.stringValue("DescribeLiveDomainCertificateInfoResponse.CertInfos["+ i +"].CertName"));
			certInfo.setCertDomainName(_ctx.stringValue("DescribeLiveDomainCertificateInfoResponse.CertInfos["+ i +"].CertDomainName"));
			certInfo.setCertExpireTime(_ctx.stringValue("DescribeLiveDomainCertificateInfoResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertLife(_ctx.stringValue("DescribeLiveDomainCertificateInfoResponse.CertInfos["+ i +"].CertLife"));
			certInfo.setCertOrg(_ctx.stringValue("DescribeLiveDomainCertificateInfoResponse.CertInfos["+ i +"].CertOrg"));
			certInfo.setCertType(_ctx.stringValue("DescribeLiveDomainCertificateInfoResponse.CertInfos["+ i +"].CertType"));
			certInfo.setSSLProtocol(_ctx.stringValue("DescribeLiveDomainCertificateInfoResponse.CertInfos["+ i +"].SSLProtocol"));
			certInfo.setStatus(_ctx.stringValue("DescribeLiveDomainCertificateInfoResponse.CertInfos["+ i +"].Status"));
			certInfo.setSSLPub(_ctx.stringValue("DescribeLiveDomainCertificateInfoResponse.CertInfos["+ i +"].SSLPub"));

			certInfos.add(certInfo);
		}
		describeLiveDomainCertificateInfoResponse.setCertInfos(certInfos);
	 
	 	return describeLiveDomainCertificateInfoResponse;
	}
}