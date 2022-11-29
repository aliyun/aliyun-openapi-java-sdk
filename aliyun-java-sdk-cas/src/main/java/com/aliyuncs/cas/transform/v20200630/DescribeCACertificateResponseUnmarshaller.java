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

import com.aliyuncs.cas.model.v20200630.DescribeCACertificateResponse;
import com.aliyuncs.cas.model.v20200630.DescribeCACertificateResponse.Certificate;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCACertificateResponseUnmarshaller {

	public static DescribeCACertificateResponse unmarshall(DescribeCACertificateResponse describeCACertificateResponse, UnmarshallerContext _ctx) {
		
		describeCACertificateResponse.setRequestId(_ctx.stringValue("DescribeCACertificateResponse.RequestId"));
		describeCACertificateResponse.setYears(_ctx.integerValue("DescribeCACertificateResponse.Years"));

		Certificate certificate = new Certificate();
		certificate.setCertificateType(_ctx.stringValue("DescribeCACertificateResponse.Certificate.CertificateType"));
		certificate.setX509Certificate(_ctx.stringValue("DescribeCACertificateResponse.Certificate.X509Certificate"));
		certificate.setIdentifier(_ctx.stringValue("DescribeCACertificateResponse.Certificate.Identifier"));
		certificate.setSerialNumber(_ctx.stringValue("DescribeCACertificateResponse.Certificate.SerialNumber"));
		certificate.setSubjectDN(_ctx.stringValue("DescribeCACertificateResponse.Certificate.SubjectDN"));
		certificate.setCommonName(_ctx.stringValue("DescribeCACertificateResponse.Certificate.CommonName"));
		certificate.setOrganizationUnit(_ctx.stringValue("DescribeCACertificateResponse.Certificate.OrganizationUnit"));
		certificate.setOrganization(_ctx.stringValue("DescribeCACertificateResponse.Certificate.Organization"));
		certificate.setLocality(_ctx.stringValue("DescribeCACertificateResponse.Certificate.Locality"));
		certificate.setState(_ctx.stringValue("DescribeCACertificateResponse.Certificate.State"));
		certificate.setCountryCode(_ctx.stringValue("DescribeCACertificateResponse.Certificate.CountryCode"));
		certificate.setSans(_ctx.stringValue("DescribeCACertificateResponse.Certificate.Sans"));
		certificate.setStatus(_ctx.stringValue("DescribeCACertificateResponse.Certificate.Status"));
		certificate.setAlgorithm(_ctx.stringValue("DescribeCACertificateResponse.Certificate.Algorithm"));
		certificate.setKeySize(_ctx.integerValue("DescribeCACertificateResponse.Certificate.KeySize"));
		certificate.setSignAlgorithm(_ctx.stringValue("DescribeCACertificateResponse.Certificate.SignAlgorithm"));
		certificate.setBeforeDate(_ctx.longValue("DescribeCACertificateResponse.Certificate.BeforeDate"));
		certificate.setAfterDate(_ctx.longValue("DescribeCACertificateResponse.Certificate.AfterDate"));
		certificate.setParentIdentifier(_ctx.stringValue("DescribeCACertificateResponse.Certificate.ParentIdentifier"));
		certificate.setSha2(_ctx.stringValue("DescribeCACertificateResponse.Certificate.Sha2"));
		certificate.setMd5(_ctx.stringValue("DescribeCACertificateResponse.Certificate.Md5"));
		certificate.setCrlStatus(_ctx.stringValue("DescribeCACertificateResponse.Certificate.CrlStatus"));
		certificate.setCrlUrl(_ctx.stringValue("DescribeCACertificateResponse.Certificate.CrlUrl"));
		describeCACertificateResponse.setCertificate(certificate);
	 
	 	return describeCACertificateResponse;
	}
}