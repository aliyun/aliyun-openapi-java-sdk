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
		describeCertificateResponse.setStatus(_ctx.stringValue("DescribeCertificateResponse.Status"));
		describeCertificateResponse.setSerial(_ctx.stringValue("DescribeCertificateResponse.Serial"));
		describeCertificateResponse.setCreatedAt(_ctx.stringValue("DescribeCertificateResponse.CreatedAt"));
		describeCertificateResponse.setTags(_ctx.mapValue("DescribeCertificateResponse.Tags"));
		describeCertificateResponse.setSubjectKeyIdentifier(_ctx.stringValue("DescribeCertificateResponse.SubjectKeyIdentifier"));
		describeCertificateResponse.setExportablePrivateKey(_ctx.booleanValue("DescribeCertificateResponse.ExportablePrivateKey"));
		describeCertificateResponse.setIssuer(_ctx.stringValue("DescribeCertificateResponse.Issuer"));
		describeCertificateResponse.setSignatureAlgorithm(_ctx.stringValue("DescribeCertificateResponse.SignatureAlgorithm"));
		describeCertificateResponse.setNotAfter(_ctx.stringValue("DescribeCertificateResponse.NotAfter"));
		describeCertificateResponse.setArn(_ctx.stringValue("DescribeCertificateResponse.Arn"));
		describeCertificateResponse.setCertificateId(_ctx.stringValue("DescribeCertificateResponse.CertificateId"));
		describeCertificateResponse.setKeySpec(_ctx.stringValue("DescribeCertificateResponse.KeySpec"));
		describeCertificateResponse.setProtectionLevel(_ctx.stringValue("DescribeCertificateResponse.ProtectionLevel"));
		describeCertificateResponse.setSubjectPublicKey(_ctx.stringValue("DescribeCertificateResponse.SubjectPublicKey"));
		describeCertificateResponse.setSubject(_ctx.stringValue("DescribeCertificateResponse.Subject"));
		describeCertificateResponse.setNotBefore(_ctx.stringValue("DescribeCertificateResponse.NotBefore"));
		describeCertificateResponse.setUpdatedAt(_ctx.stringValue("DescribeCertificateResponse.UpdatedAt"));

		List<String> subjectAlternativeNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCertificateResponse.SubjectAlternativeNames.Length"); i++) {
			subjectAlternativeNames.add(_ctx.stringValue("DescribeCertificateResponse.SubjectAlternativeNames["+ i +"]"));
		}
		describeCertificateResponse.setSubjectAlternativeNames(subjectAlternativeNames);
	 
	 	return describeCertificateResponse;
	}
}