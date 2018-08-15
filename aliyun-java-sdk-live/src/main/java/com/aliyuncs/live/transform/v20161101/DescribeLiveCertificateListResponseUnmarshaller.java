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

import com.aliyuncs.live.model.v20161101.DescribeLiveCertificateListResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveCertificateListResponse.CertificateListModel;
import com.aliyuncs.live.model.v20161101.DescribeLiveCertificateListResponse.CertificateListModel.Cert;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveCertificateListResponseUnmarshaller {

	public static DescribeLiveCertificateListResponse unmarshall(DescribeLiveCertificateListResponse describeLiveCertificateListResponse, UnmarshallerContext context) {
		
		describeLiveCertificateListResponse.setRequestId(context.stringValue("DescribeLiveCertificateListResponse.RequestId"));

		CertificateListModel certificateListModel = new CertificateListModel();
		certificateListModel.setCount(context.integerValue("DescribeLiveCertificateListResponse.CertificateListModel.Count"));

		List<Cert> certList = new ArrayList<Cert>();
		for (int i = 0; i < context.lengthValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList.Length"); i++) {
			Cert cert = new Cert();
			cert.setCertName(context.stringValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList["+ i +"].CertName"));
			cert.setCertId(context.longValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList["+ i +"].CertId"));
			cert.setFingerprint(context.stringValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList["+ i +"].Fingerprint"));
			cert.setCommon(context.stringValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList["+ i +"].Common"));
			cert.setIssuer(context.stringValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList["+ i +"].Issuer"));
			cert.setLastTime(context.longValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList["+ i +"].LastTime"));

			certList.add(cert);
		}
		certificateListModel.setCertList(certList);
		describeLiveCertificateListResponse.setCertificateListModel(certificateListModel);
	 
	 	return describeLiveCertificateListResponse;
	}
}