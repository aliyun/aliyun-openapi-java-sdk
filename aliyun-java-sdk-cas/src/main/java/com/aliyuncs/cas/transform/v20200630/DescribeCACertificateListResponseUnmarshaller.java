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

import com.aliyuncs.cas.model.v20200630.DescribeCACertificateListResponse;
import com.aliyuncs.cas.model.v20200630.DescribeCACertificateListResponse.Certificate;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCACertificateListResponseUnmarshaller {

	public static DescribeCACertificateListResponse unmarshall(DescribeCACertificateListResponse describeCACertificateListResponse, UnmarshallerContext _ctx) {
		
		describeCACertificateListResponse.setRequestId(_ctx.stringValue("DescribeCACertificateListResponse.RequestId"));
		describeCACertificateListResponse.setCurrentPage(_ctx.integerValue("DescribeCACertificateListResponse.CurrentPage"));
		describeCACertificateListResponse.setTotalCount(_ctx.integerValue("DescribeCACertificateListResponse.TotalCount"));
		describeCACertificateListResponse.setPageCount(_ctx.integerValue("DescribeCACertificateListResponse.PageCount"));
		describeCACertificateListResponse.setShowSize(_ctx.integerValue("DescribeCACertificateListResponse.ShowSize"));

		List<Certificate> certificateList = new ArrayList<Certificate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCACertificateListResponse.CertificateList.Length"); i++) {
			Certificate certificate = new Certificate();
			certificate.setYears(_ctx.integerValue("DescribeCACertificateListResponse.CertificateList["+ i +"].Years"));
			certificate.setStatus(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].Status"));
			certificate.setSerialNumber(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].SerialNumber"));
			certificate.setCertificateType(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].CertificateType"));
			certificate.setAlgorithm(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].Algorithm"));
			certificate.setState(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].State"));
			certificate.setOrganization(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].Organization"));
			certificate.setParentIdentifier(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].ParentIdentifier"));
			certificate.setLocality(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].Locality"));
			certificate.setIdentifier(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].Identifier"));
			certificate.setSans(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].Sans"));
			certificate.setKeySize(_ctx.integerValue("DescribeCACertificateListResponse.CertificateList["+ i +"].KeySize"));
			certificate.setX509Certificate(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].X509Certificate"));
			certificate.setSubjectDN(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].SubjectDN"));
			certificate.setSignAlgorithm(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].SignAlgorithm"));
			certificate.setOrganizationUnit(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].OrganizationUnit"));
			certificate.setAfterDate(_ctx.longValue("DescribeCACertificateListResponse.CertificateList["+ i +"].AfterDate"));
			certificate.setSha2(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].Sha2"));
			certificate.setCommonName(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].CommonName"));
			certificate.setMd5(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].Md5"));
			certificate.setCountryCode(_ctx.stringValue("DescribeCACertificateListResponse.CertificateList["+ i +"].CountryCode"));
			certificate.setBeforeDate(_ctx.longValue("DescribeCACertificateListResponse.CertificateList["+ i +"].BeforeDate"));

			certificateList.add(certificate);
		}
		describeCACertificateListResponse.setCertificateList(certificateList);
	 
	 	return describeCACertificateListResponse;
	}
}