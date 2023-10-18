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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainByCertificateResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainByCertificateResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainByCertificateResponseUnmarshaller {

	public static DescribeLiveDomainByCertificateResponse unmarshall(DescribeLiveDomainByCertificateResponse describeLiveDomainByCertificateResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainByCertificateResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainByCertificateResponse.RequestId"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainByCertificateResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setCertExpireTime(_ctx.stringValue("DescribeLiveDomainByCertificateResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertStartTime(_ctx.stringValue("DescribeLiveDomainByCertificateResponse.CertInfos["+ i +"].CertStartTime"));
			certInfo.setCertType(_ctx.stringValue("DescribeLiveDomainByCertificateResponse.CertInfos["+ i +"].CertType"));
			certInfo.setCertSubjectCommonName(_ctx.stringValue("DescribeLiveDomainByCertificateResponse.CertInfos["+ i +"].CertSubjectCommonName"));
			certInfo.setCertCaIsLegacy(_ctx.stringValue("DescribeLiveDomainByCertificateResponse.CertInfos["+ i +"].CertCaIsLegacy"));
			certInfo.setDomainNames(_ctx.stringValue("DescribeLiveDomainByCertificateResponse.CertInfos["+ i +"].DomainNames"));
			certInfo.setCertExpired(_ctx.stringValue("DescribeLiveDomainByCertificateResponse.CertInfos["+ i +"].CertExpired"));
			certInfo.setIssuer(_ctx.stringValue("DescribeLiveDomainByCertificateResponse.CertInfos["+ i +"].Issuer"));
			certInfo.setDomainList(_ctx.stringValue("DescribeLiveDomainByCertificateResponse.CertInfos["+ i +"].DomainList"));

			certInfos.add(certInfo);
		}
		describeLiveDomainByCertificateResponse.setCertInfos(certInfos);
	 
	 	return describeLiveDomainByCertificateResponse;
	}
}