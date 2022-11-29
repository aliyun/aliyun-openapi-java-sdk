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

import com.aliyuncs.cas.model.v20200630.DescribeClientCertificateResponse;
import com.aliyuncs.cas.model.v20200630.DescribeClientCertificateResponse.Certificate;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClientCertificateResponseUnmarshaller {

	public static DescribeClientCertificateResponse unmarshall(DescribeClientCertificateResponse describeClientCertificateResponse, UnmarshallerContext _ctx) {
		
		describeClientCertificateResponse.setRequestId(_ctx.stringValue("DescribeClientCertificateResponse.RequestId"));

		Certificate certificate = new Certificate();
		certificate.setX509Certificate(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.X509Certificate"));
		certificate.setIdentifier(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.Identifier"));
		certificate.setSerialNumber(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.SerialNumber"));
		certificate.setSubjectDN(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.SubjectDN"));
		certificate.setCommonName(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.CommonName"));
		certificate.setOrganizationUnit(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.OrganizationUnit"));
		certificate.setOrganization(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.Organization"));
		certificate.setLocality(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.Locality"));
		certificate.setState(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.State"));
		certificate.setCountryCode(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.CountryCode"));
		certificate.setSans(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.Sans"));
		certificate.setStatus(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.Status"));
		certificate.setBeforeDate(_ctx.longValue("DescribeClientCertificateResponse.Certificate.BeforeDate"));
		certificate.setAfterDate(_ctx.longValue("DescribeClientCertificateResponse.Certificate.AfterDate"));
		certificate.setAlgorithm(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.Algorithm"));
		certificate.setKeySize(_ctx.integerValue("DescribeClientCertificateResponse.Certificate.KeySize"));
		certificate.setSignAlgorithm(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.SignAlgorithm"));
		certificate.setCertificateType(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.CertificateType"));
		certificate.setParentIdentifier(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.ParentIdentifier"));
		certificate.setSha2(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.Sha2"));
		certificate.setMd5(_ctx.stringValue("DescribeClientCertificateResponse.Certificate.Md5"));
		certificate.setDays(_ctx.integerValue("DescribeClientCertificateResponse.Certificate.Days"));
		describeClientCertificateResponse.setCertificate(certificate);
	 
	 	return describeClientCertificateResponse;
	}
}