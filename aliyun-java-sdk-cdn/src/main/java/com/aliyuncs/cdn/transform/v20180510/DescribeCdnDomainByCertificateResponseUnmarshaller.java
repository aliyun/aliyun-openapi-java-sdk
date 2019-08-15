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

import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainByCertificateResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainByCertificateResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnDomainByCertificateResponseUnmarshaller {

	public static DescribeCdnDomainByCertificateResponse unmarshall(DescribeCdnDomainByCertificateResponse describeCdnDomainByCertificateResponse, UnmarshallerContext _ctx) {
		
		describeCdnDomainByCertificateResponse.setRequestId(_ctx.stringValue("DescribeCdnDomainByCertificateResponse.RequestId"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnDomainByCertificateResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setIssuer(_ctx.stringValue("DescribeCdnDomainByCertificateResponse.CertInfos["+ i +"].Issuer"));
			certInfo.setCertType(_ctx.stringValue("DescribeCdnDomainByCertificateResponse.CertInfos["+ i +"].CertType"));
			certInfo.setCertSubjectCommonName(_ctx.stringValue("DescribeCdnDomainByCertificateResponse.CertInfos["+ i +"].CertSubjectCommonName"));
			certInfo.setCertExpireTime(_ctx.stringValue("DescribeCdnDomainByCertificateResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertStartTime(_ctx.stringValue("DescribeCdnDomainByCertificateResponse.CertInfos["+ i +"].CertStartTime"));
			certInfo.setDomainNames(_ctx.stringValue("DescribeCdnDomainByCertificateResponse.CertInfos["+ i +"].DomainNames"));
			certInfo.setDomainList(_ctx.stringValue("DescribeCdnDomainByCertificateResponse.CertInfos["+ i +"].DomainList"));
			certInfo.setCertExpired(_ctx.stringValue("DescribeCdnDomainByCertificateResponse.CertInfos["+ i +"].CertExpired"));
			certInfo.setCertCaIsLegacy(_ctx.stringValue("DescribeCdnDomainByCertificateResponse.CertInfos["+ i +"].CertCaIsLegacy"));

			certInfos.add(certInfo);
		}
		describeCdnDomainByCertificateResponse.setCertInfos(certInfos);
	 
	 	return describeCdnDomainByCertificateResponse;
	}
}