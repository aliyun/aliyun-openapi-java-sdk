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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveCertificateListResponseUnmarshaller {

	public static DescribeLiveCertificateListResponse unmarshall(DescribeLiveCertificateListResponse describeLiveCertificateListResponse, UnmarshallerContext _ctx) {
		
		describeLiveCertificateListResponse.setRequestId(_ctx.stringValue("DescribeLiveCertificateListResponse.RequestId"));

		CertificateListModel certificateListModel = new CertificateListModel();
		certificateListModel.setCount(_ctx.integerValue("DescribeLiveCertificateListResponse.CertificateListModel.Count"));

		List<Cert> certList = new ArrayList<Cert>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList.Length"); i++) {
			Cert cert = new Cert();
			cert.setLastTime(_ctx.longValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList["+ i +"].LastTime"));
			cert.setFingerprint(_ctx.stringValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList["+ i +"].Fingerprint"));
			cert.setCertName(_ctx.stringValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList["+ i +"].CertName"));
			cert.setIssuer(_ctx.stringValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList["+ i +"].Issuer"));
			cert.setCertId(_ctx.longValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList["+ i +"].CertId"));
			cert.setCommon(_ctx.stringValue("DescribeLiveCertificateListResponse.CertificateListModel.CertList["+ i +"].Common"));

			certList.add(cert);
		}
		certificateListModel.setCertList(certList);
		describeLiveCertificateListResponse.setCertificateListModel(certificateListModel);
	 
	 	return describeLiveCertificateListResponse;
	}
}