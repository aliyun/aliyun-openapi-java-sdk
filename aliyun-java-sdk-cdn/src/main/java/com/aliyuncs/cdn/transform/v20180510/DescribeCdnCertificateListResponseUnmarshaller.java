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

import com.aliyuncs.cdn.model.v20180510.DescribeCdnCertificateListResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnCertificateListResponse.CertificateListModel;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnCertificateListResponse.CertificateListModel.Cert;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnCertificateListResponseUnmarshaller {

	public static DescribeCdnCertificateListResponse unmarshall(DescribeCdnCertificateListResponse describeCdnCertificateListResponse, UnmarshallerContext context) {
		
		describeCdnCertificateListResponse.setRequestId(context.stringValue("DescribeCdnCertificateListResponse.RequestId"));

		CertificateListModel certificateListModel = new CertificateListModel();
		certificateListModel.setCount(context.integerValue("DescribeCdnCertificateListResponse.CertificateListModel.Count"));

		List<Cert> certList = new ArrayList<Cert>();
		for (int i = 0; i < context.lengthValue("DescribeCdnCertificateListResponse.CertificateListModel.CertList.Length"); i++) {
			Cert cert = new Cert();
			cert.setCertName(context.stringValue("DescribeCdnCertificateListResponse.CertificateListModel.CertList["+ i +"].CertName"));
			cert.setCertId(context.longValue("DescribeCdnCertificateListResponse.CertificateListModel.CertList["+ i +"].CertId"));
			cert.setFingerprint(context.stringValue("DescribeCdnCertificateListResponse.CertificateListModel.CertList["+ i +"].Fingerprint"));
			cert.setCommon(context.stringValue("DescribeCdnCertificateListResponse.CertificateListModel.CertList["+ i +"].Common"));
			cert.setIssuer(context.stringValue("DescribeCdnCertificateListResponse.CertificateListModel.CertList["+ i +"].Issuer"));
			cert.setLastTime(context.longValue("DescribeCdnCertificateListResponse.CertificateListModel.CertList["+ i +"].LastTime"));

			certList.add(cert);
		}
		certificateListModel.setCertList(certList);
		describeCdnCertificateListResponse.setCertificateListModel(certificateListModel);
	 
	 	return describeCdnCertificateListResponse;
	}
}