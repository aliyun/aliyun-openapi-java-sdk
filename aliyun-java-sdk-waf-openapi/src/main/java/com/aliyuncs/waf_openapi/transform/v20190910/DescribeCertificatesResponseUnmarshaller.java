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

package com.aliyuncs.waf_openapi.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.waf_openapi.model.v20190910.DescribeCertificatesResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeCertificatesResponse.Certificate;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCertificatesResponseUnmarshaller {

	public static DescribeCertificatesResponse unmarshall(DescribeCertificatesResponse describeCertificatesResponse, UnmarshallerContext _ctx) {
		
		describeCertificatesResponse.setRequestId(_ctx.stringValue("DescribeCertificatesResponse.RequestId"));

		List<Certificate> certificates = new ArrayList<Certificate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCertificatesResponse.Certificates.Length"); i++) {
			Certificate certificate = new Certificate();
			certificate.setCommonName(_ctx.stringValue("DescribeCertificatesResponse.Certificates["+ i +"].CommonName"));
			certificate.setIsUsing(_ctx.booleanValue("DescribeCertificatesResponse.Certificates["+ i +"].IsUsing"));
			certificate.setCertificateName(_ctx.stringValue("DescribeCertificatesResponse.Certificates["+ i +"].CertificateName"));
			certificate.setCertificateId(_ctx.longValue("DescribeCertificatesResponse.Certificates["+ i +"].CertificateId"));

			List<String> sans = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCertificatesResponse.Certificates["+ i +"].Sans.Length"); j++) {
				sans.add(_ctx.stringValue("DescribeCertificatesResponse.Certificates["+ i +"].Sans["+ j +"]"));
			}
			certificate.setSans(sans);

			certificates.add(certificate);
		}
		describeCertificatesResponse.setCertificates(certificates);
	 
	 	return describeCertificatesResponse;
	}
}