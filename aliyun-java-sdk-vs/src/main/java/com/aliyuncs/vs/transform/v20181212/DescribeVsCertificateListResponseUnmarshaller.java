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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsCertificateListResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsCertificateListResponse.CertificateListModel;
import com.aliyuncs.vs.model.v20181212.DescribeVsCertificateListResponse.CertificateListModel.Cert;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsCertificateListResponseUnmarshaller {

	public static DescribeVsCertificateListResponse unmarshall(DescribeVsCertificateListResponse describeVsCertificateListResponse, UnmarshallerContext _ctx) {
		
		describeVsCertificateListResponse.setRequestId(_ctx.stringValue("DescribeVsCertificateListResponse.RequestId"));

		CertificateListModel certificateListModel = new CertificateListModel();
		certificateListModel.setCount(_ctx.integerValue("DescribeVsCertificateListResponse.CertificateListModel.Count"));

		List<Cert> certList = new ArrayList<Cert>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsCertificateListResponse.CertificateListModel.CertList.Length"); i++) {
			Cert cert = new Cert();
			cert.setCertName(_ctx.stringValue("DescribeVsCertificateListResponse.CertificateListModel.CertList["+ i +"].CertName"));
			cert.setCertId(_ctx.longValue("DescribeVsCertificateListResponse.CertificateListModel.CertList["+ i +"].CertId"));
			cert.setFingerprint(_ctx.stringValue("DescribeVsCertificateListResponse.CertificateListModel.CertList["+ i +"].Fingerprint"));
			cert.setCommon(_ctx.stringValue("DescribeVsCertificateListResponse.CertificateListModel.CertList["+ i +"].Common"));
			cert.setIssuer(_ctx.stringValue("DescribeVsCertificateListResponse.CertificateListModel.CertList["+ i +"].Issuer"));
			cert.setLastTime(_ctx.longValue("DescribeVsCertificateListResponse.CertificateListModel.CertList["+ i +"].LastTime"));

			certList.add(cert);
		}
		certificateListModel.setCertList(certList);
		describeVsCertificateListResponse.setCertificateListModel(certificateListModel);
	 
	 	return describeVsCertificateListResponse;
	}
}