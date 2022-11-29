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

package com.aliyuncs.cas.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20200630.ListRevokeCertificateResponse;
import com.aliyuncs.cas.model.v20200630.ListRevokeCertificateResponse.Certificate;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRevokeCertificateResponseUnmarshaller {

	public static ListRevokeCertificateResponse unmarshall(ListRevokeCertificateResponse listRevokeCertificateResponse, UnmarshallerContext _ctx) {
		
		listRevokeCertificateResponse.setRequestId(_ctx.stringValue("ListRevokeCertificateResponse.RequestId"));
		listRevokeCertificateResponse.setCurrentPage(_ctx.integerValue("ListRevokeCertificateResponse.CurrentPage"));
		listRevokeCertificateResponse.setPageCount(_ctx.integerValue("ListRevokeCertificateResponse.PageCount"));
		listRevokeCertificateResponse.setShowSize(_ctx.integerValue("ListRevokeCertificateResponse.ShowSize"));
		listRevokeCertificateResponse.setTotalCount(_ctx.longValue("ListRevokeCertificateResponse.TotalCount"));

		List<Certificate> certificateList = new ArrayList<Certificate>();
		for (int i = 0; i < _ctx.lengthValue("ListRevokeCertificateResponse.CertificateList.Length"); i++) {
			Certificate certificate = new Certificate();
			certificate.setRevokeDate(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].RevokeDate"));
			certificate.setIdentifier(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].Identifier"));
			certificate.setSerialNumber(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].SerialNumber"));
			certificate.setSubjectDN(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].SubjectDN"));
			certificate.setCommonName(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].CommonName"));
			certificate.setOrganizationUnit(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].OrganizationUnit"));
			certificate.setOrganization(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].Organization"));
			certificate.setLocality(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].Locality"));
			certificate.setState(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].State"));
			certificate.setCountryCode(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].CountryCode"));
			certificate.setSans(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].Sans"));
			certificate.setStatus(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].Status"));
			certificate.setBeforeDate(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].BeforeDate"));
			certificate.setAfterDate(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].AfterDate"));
			certificate.setAlgorithm(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].Algorithm"));
			certificate.setKeySize(_ctx.integerValue("ListRevokeCertificateResponse.CertificateList["+ i +"].KeySize"));
			certificate.setSignAlgorithm(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].SignAlgorithm"));
			certificate.setCertificateType(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].CertificateType"));
			certificate.setParentIdentifier(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].ParentIdentifier"));
			certificate.setSha2(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].Sha2"));
			certificate.setMd5(_ctx.stringValue("ListRevokeCertificateResponse.CertificateList["+ i +"].Md5"));

			certificateList.add(certificate);
		}
		listRevokeCertificateResponse.setCertificateList(certificateList);
	 
	 	return listRevokeCertificateResponse;
	}
}