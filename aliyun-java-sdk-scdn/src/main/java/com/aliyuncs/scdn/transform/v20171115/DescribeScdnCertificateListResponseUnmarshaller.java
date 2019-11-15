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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnCertificateListResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnCertificateListResponse.CertificateListModel;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnCertificateListResponse.CertificateListModel.Cert;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnCertificateListResponseUnmarshaller {

	public static DescribeScdnCertificateListResponse unmarshall(DescribeScdnCertificateListResponse describeScdnCertificateListResponse, UnmarshallerContext _ctx) {
		
		describeScdnCertificateListResponse.setRequestId(_ctx.stringValue("DescribeScdnCertificateListResponse.RequestId"));

		CertificateListModel certificateListModel = new CertificateListModel();
		certificateListModel.setCount(_ctx.integerValue("DescribeScdnCertificateListResponse.CertificateListModel.Count"));

		List<Cert> certList = new ArrayList<Cert>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnCertificateListResponse.CertificateListModel.CertList.Length"); i++) {
			Cert cert = new Cert();
			cert.setCertName(_ctx.stringValue("DescribeScdnCertificateListResponse.CertificateListModel.CertList["+ i +"].CertName"));
			cert.setCertId(_ctx.longValue("DescribeScdnCertificateListResponse.CertificateListModel.CertList["+ i +"].CertId"));
			cert.setFingerprint(_ctx.stringValue("DescribeScdnCertificateListResponse.CertificateListModel.CertList["+ i +"].Fingerprint"));
			cert.setCommon(_ctx.stringValue("DescribeScdnCertificateListResponse.CertificateListModel.CertList["+ i +"].Common"));
			cert.setIssuer(_ctx.stringValue("DescribeScdnCertificateListResponse.CertificateListModel.CertList["+ i +"].Issuer"));
			cert.setLastTime(_ctx.longValue("DescribeScdnCertificateListResponse.CertificateListModel.CertList["+ i +"].LastTime"));

			certList.add(cert);
		}
		certificateListModel.setCertList(certList);
		describeScdnCertificateListResponse.setCertificateListModel(certificateListModel);
	 
	 	return describeScdnCertificateListResponse;
	}
}