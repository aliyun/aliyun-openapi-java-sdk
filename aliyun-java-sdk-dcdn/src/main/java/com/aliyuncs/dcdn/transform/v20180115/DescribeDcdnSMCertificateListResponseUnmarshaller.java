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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSMCertificateListResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSMCertificateListResponse.CertificateListModel;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSMCertificateListResponse.CertificateListModel.Cert;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnSMCertificateListResponseUnmarshaller {

	public static DescribeDcdnSMCertificateListResponse unmarshall(DescribeDcdnSMCertificateListResponse describeDcdnSMCertificateListResponse, UnmarshallerContext _ctx) {
		
		describeDcdnSMCertificateListResponse.setRequestId(_ctx.stringValue("DescribeDcdnSMCertificateListResponse.RequestId"));

		CertificateListModel certificateListModel = new CertificateListModel();
		certificateListModel.setCount(_ctx.integerValue("DescribeDcdnSMCertificateListResponse.CertificateListModel.Count"));

		List<Cert> certList = new ArrayList<Cert>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnSMCertificateListResponse.CertificateListModel.CertList.Length"); i++) {
			Cert cert = new Cert();
			cert.setCertName(_ctx.stringValue("DescribeDcdnSMCertificateListResponse.CertificateListModel.CertList["+ i +"].CertName"));
			cert.setIssuer(_ctx.stringValue("DescribeDcdnSMCertificateListResponse.CertificateListModel.CertList["+ i +"].Issuer"));
			cert.setCertIdentifier(_ctx.stringValue("DescribeDcdnSMCertificateListResponse.CertificateListModel.CertList["+ i +"].CertIdentifier"));
			cert.setCommon(_ctx.stringValue("DescribeDcdnSMCertificateListResponse.CertificateListModel.CertList["+ i +"].Common"));

			certList.add(cert);
		}
		certificateListModel.setCertList(certList);
		describeDcdnSMCertificateListResponse.setCertificateListModel(certificateListModel);
	 
	 	return describeDcdnSMCertificateListResponse;
	}
}