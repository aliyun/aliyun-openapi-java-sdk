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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainByCertificateResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainByCertificateResponse.CertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainByCertificateResponseUnmarshaller {

	public static DescribeDcdnDomainByCertificateResponse unmarshall(DescribeDcdnDomainByCertificateResponse describeDcdnDomainByCertificateResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainByCertificateResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainByCertificateResponse.RequestId"));

		List<CertInfo> certInfos = new ArrayList<CertInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainByCertificateResponse.CertInfos.Length"); i++) {
			CertInfo certInfo = new CertInfo();
			certInfo.setIssuer(_ctx.stringValue("DescribeDcdnDomainByCertificateResponse.CertInfos["+ i +"].Issuer"));
			certInfo.setCertType(_ctx.stringValue("DescribeDcdnDomainByCertificateResponse.CertInfos["+ i +"].CertType"));
			certInfo.setCertSubjectCommonName(_ctx.stringValue("DescribeDcdnDomainByCertificateResponse.CertInfos["+ i +"].CertSubjectCommonName"));
			certInfo.setCertExpireTime(_ctx.stringValue("DescribeDcdnDomainByCertificateResponse.CertInfos["+ i +"].CertExpireTime"));
			certInfo.setCertStartTime(_ctx.stringValue("DescribeDcdnDomainByCertificateResponse.CertInfos["+ i +"].CertStartTime"));
			certInfo.setDomainNames(_ctx.stringValue("DescribeDcdnDomainByCertificateResponse.CertInfos["+ i +"].DomainNames"));
			certInfo.setDomainList(_ctx.stringValue("DescribeDcdnDomainByCertificateResponse.CertInfos["+ i +"].DomainList"));
			certInfo.setCertExpired(_ctx.stringValue("DescribeDcdnDomainByCertificateResponse.CertInfos["+ i +"].CertExpired"));
			certInfo.setCertCaIsLegacy(_ctx.stringValue("DescribeDcdnDomainByCertificateResponse.CertInfos["+ i +"].CertCaIsLegacy"));

			certInfos.add(certInfo);
		}
		describeDcdnDomainByCertificateResponse.setCertInfos(certInfos);
	 
	 	return describeDcdnDomainByCertificateResponse;
	}
}