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

import com.aliyuncs.cdn.model.v20180510.DescribeCdnSMCertificateListResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnSMCertificateListResponse.CertificateListModel;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnSMCertificateListResponse.CertificateListModel.Cert;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnSMCertificateListResponseUnmarshaller {

	public static DescribeCdnSMCertificateListResponse unmarshall(DescribeCdnSMCertificateListResponse describeCdnSMCertificateListResponse, UnmarshallerContext _ctx) {
		
		describeCdnSMCertificateListResponse.setRequestId(_ctx.stringValue("DescribeCdnSMCertificateListResponse.RequestId"));

		CertificateListModel certificateListModel = new CertificateListModel();
		certificateListModel.setCount(_ctx.integerValue("DescribeCdnSMCertificateListResponse.CertificateListModel.Count"));

		List<Cert> certList = new ArrayList<Cert>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnSMCertificateListResponse.CertificateListModel.CertList.Length"); i++) {
			Cert cert = new Cert();
			cert.setCertName(_ctx.stringValue("DescribeCdnSMCertificateListResponse.CertificateListModel.CertList["+ i +"].CertName"));
			cert.setIssuer(_ctx.stringValue("DescribeCdnSMCertificateListResponse.CertificateListModel.CertList["+ i +"].Issuer"));
			cert.setCertIdentifier(_ctx.stringValue("DescribeCdnSMCertificateListResponse.CertificateListModel.CertList["+ i +"].CertIdentifier"));
			cert.setCommon(_ctx.stringValue("DescribeCdnSMCertificateListResponse.CertificateListModel.CertList["+ i +"].Common"));

			certList.add(cert);
		}
		certificateListModel.setCertList(certList);
		describeCdnSMCertificateListResponse.setCertificateListModel(certificateListModel);
	 
	 	return describeCdnSMCertificateListResponse;
	}
}