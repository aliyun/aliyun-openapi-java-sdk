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

import com.aliyuncs.cas.model.v20200630.ListClientCertificateResponse;
import com.aliyuncs.cas.model.v20200630.ListClientCertificateResponse.Certificate;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClientCertificateResponseUnmarshaller {

	public static ListClientCertificateResponse unmarshall(ListClientCertificateResponse listClientCertificateResponse, UnmarshallerContext _ctx) {
		
		listClientCertificateResponse.setRequestId(_ctx.stringValue("ListClientCertificateResponse.RequestId"));
		listClientCertificateResponse.setCurrentPage(_ctx.integerValue("ListClientCertificateResponse.CurrentPage"));
		listClientCertificateResponse.setPageCount(_ctx.integerValue("ListClientCertificateResponse.PageCount"));
		listClientCertificateResponse.setShowSize(_ctx.integerValue("ListClientCertificateResponse.ShowSize"));
		listClientCertificateResponse.setTotalCount(_ctx.longValue("ListClientCertificateResponse.TotalCount"));

		List<Certificate> certificateList = new ArrayList<Certificate>();
		for (int i = 0; i < _ctx.lengthValue("ListClientCertificateResponse.CertificateList.Length"); i++) {
			Certificate certificate = new Certificate();
			certificate.setX509Certificate(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].X509Certificate"));
			certificate.setIdentifier(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].Identifier"));
			certificate.setSerialNumber(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].SerialNumber"));
			certificate.setSubjectDN(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].SubjectDN"));
			certificate.setCommonName(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].CommonName"));
			certificate.setOrganizationUnit(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].OrganizationUnit"));
			certificate.setOrganization(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].Organization"));
			certificate.setLocality(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].Locality"));
			certificate.setState(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].State"));
			certificate.setCountryCode(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].CountryCode"));
			certificate.setSans(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].Sans"));
			certificate.setStatus(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].Status"));
			certificate.setBeforeDate(_ctx.longValue("ListClientCertificateResponse.CertificateList["+ i +"].BeforeDate"));
			certificate.setAfterDate(_ctx.longValue("ListClientCertificateResponse.CertificateList["+ i +"].AfterDate"));
			certificate.setAlgorithm(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].Algorithm"));
			certificate.setKeySize(_ctx.integerValue("ListClientCertificateResponse.CertificateList["+ i +"].KeySize"));
			certificate.setSignAlgorithm(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].SignAlgorithm"));
			certificate.setCertificateType(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].CertificateType"));
			certificate.setParentIdentifier(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].ParentIdentifier"));
			certificate.setSha2(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].Sha2"));
			certificate.setMd5(_ctx.stringValue("ListClientCertificateResponse.CertificateList["+ i +"].Md5"));
			certificate.setDays(_ctx.integerValue("ListClientCertificateResponse.CertificateList["+ i +"].Days"));

			certificateList.add(certificate);
		}
		listClientCertificateResponse.setCertificateList(certificateList);
	 
	 	return listClientCertificateResponse;
	}
}