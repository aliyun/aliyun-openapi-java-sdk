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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnCertificateListResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnCertificateListResponse.CertificateListModel;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnCertificateListResponse.CertificateListModel.Cert;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnCertificateListResponseUnmarshaller {

	public static DescribeDcdnCertificateListResponse unmarshall(DescribeDcdnCertificateListResponse describeDcdnCertificateListResponse, UnmarshallerContext context) {
		
		describeDcdnCertificateListResponse.setRequestId(context.stringValue("DescribeDcdnCertificateListResponse.RequestId"));

		CertificateListModel certificateListModel = new CertificateListModel();
		certificateListModel.setCount(context.integerValue("DescribeDcdnCertificateListResponse.CertificateListModel.Count"));

		List<Cert> certList = new ArrayList<Cert>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnCertificateListResponse.CertificateListModel.CertList.Length"); i++) {
			Cert cert = new Cert();
			cert.setCertName(context.stringValue("DescribeDcdnCertificateListResponse.CertificateListModel.CertList["+ i +"].CertName"));
			cert.setCertId(context.longValue("DescribeDcdnCertificateListResponse.CertificateListModel.CertList["+ i +"].CertId"));
			cert.setFingerprint(context.stringValue("DescribeDcdnCertificateListResponse.CertificateListModel.CertList["+ i +"].Fingerprint"));
			cert.setCommon(context.stringValue("DescribeDcdnCertificateListResponse.CertificateListModel.CertList["+ i +"].Common"));
			cert.setIssuer(context.stringValue("DescribeDcdnCertificateListResponse.CertificateListModel.CertList["+ i +"].Issuer"));
			cert.setLastTime(context.longValue("DescribeDcdnCertificateListResponse.CertificateListModel.CertList["+ i +"].LastTime"));

			certList.add(cert);
		}
		certificateListModel.setCertList(certList);
		describeDcdnCertificateListResponse.setCertificateListModel(certificateListModel);
	 
	 	return describeDcdnCertificateListResponse;
	}
}