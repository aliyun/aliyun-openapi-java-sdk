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

package com.aliyuncs.kms.transform.v20160120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.kms.model.v20160120.DescribeCertificateResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCertificateResponseUnmarshaller {

	public static DescribeCertificateResponse unmarshall(DescribeCertificateResponse describeCertificateResponse, UnmarshallerContext _ctx) {
		
		describeCertificateResponse.setRequestId(_ctx.stringValue("DescribeCertificateResponse.RequestId"));
		describeCertificateResponse.setCertificateId(_ctx.stringValue("DescribeCertificateResponse.CertificateId"));
		describeCertificateResponse.setArn(_ctx.stringValue("DescribeCertificateResponse.Arn"));
		describeCertificateResponse.setKeySpec(_ctx.stringValue("DescribeCertificateResponse.KeySpec"));
		describeCertificateResponse.setStatus(_ctx.stringValue("DescribeCertificateResponse.Status"));
		describeCertificateResponse.setCreatedAt(_ctx.stringValue("DescribeCertificateResponse.CreatedAt"));
		describeCertificateResponse.setUpdatedAt(_ctx.stringValue("DescribeCertificateResponse.UpdatedAt"));
		describeCertificateResponse.setSerial(_ctx.stringValue("DescribeCertificateResponse.Serial"));
		describeCertificateResponse.setSubject(_ctx.stringValue("DescribeCertificateResponse.Subject"));
		describeCertificateResponse.setIssuer(_ctx.stringValue("DescribeCertificateResponse.Issuer"));
		describeCertificateResponse.setNotBefore(_ctx.stringValue("DescribeCertificateResponse.NotBefore"));
		describeCertificateResponse.setNotAfter(_ctx.stringValue("DescribeCertificateResponse.NotAfter"));
		describeCertificateResponse.setSignatureAlgorithm(_ctx.stringValue("DescribeCertificateResponse.SignatureAlgorithm"));
		describeCertificateResponse.setSubjectPublicKey(_ctx.stringValue("DescribeCertificateResponse.SubjectPublicKey"));
		describeCertificateResponse.setSubjectKeyIdentifier(_ctx.stringValue("DescribeCertificateResponse.SubjectKeyIdentifier"));
		describeCertificateResponse.setTags(_ctx.mapValue("DescribeCertificateResponse.Tags"));
		describeCertificateResponse.setExportablePrivateKey(_ctx.booleanValue("DescribeCertificateResponse.ExportablePrivateKey"));
		describeCertificateResponse.setProtectionLevel(_ctx.stringValue("DescribeCertificateResponse.ProtectionLevel"));

		List<String> subjectAlternativeNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCertificateResponse.SubjectAlternativeNames.Length"); i++) {
			subjectAlternativeNames.add(_ctx.stringValue("DescribeCertificateResponse.SubjectAlternativeNames["+ i +"]"));
		}
		describeCertificateResponse.setSubjectAlternativeNames(subjectAlternativeNames);
	 
	 	return describeCertificateResponse;
	}
}