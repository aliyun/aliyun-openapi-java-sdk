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

package com.aliyuncs.cas.transform.v20180713;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20180713.DescribeUserCertificateListResponse;
import com.aliyuncs.cas.model.v20180713.DescribeUserCertificateListResponse.Certificate;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserCertificateListResponseUnmarshaller {

	public static DescribeUserCertificateListResponse unmarshall(DescribeUserCertificateListResponse describeUserCertificateListResponse, UnmarshallerContext context) {
		
		describeUserCertificateListResponse.setRequestId(context.stringValue("DescribeUserCertificateListResponse.RequestId"));
		describeUserCertificateListResponse.setTotalCount(context.integerValue("DescribeUserCertificateListResponse.TotalCount"));
		describeUserCertificateListResponse.setShowSize(context.integerValue("DescribeUserCertificateListResponse.ShowSize"));
		describeUserCertificateListResponse.setCurrentPage(context.integerValue("DescribeUserCertificateListResponse.CurrentPage"));

		List<Certificate> certificateList = new ArrayList<Certificate>();
		for (int i = 0; i < context.lengthValue("DescribeUserCertificateListResponse.CertificateList.Length"); i++) {
			Certificate certificate = new Certificate();
			certificate.setId(context.longValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].id"));
			certificate.setName(context.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].name"));
			certificate.setCommon(context.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].common"));
			certificate.setFingerprint(context.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].fingerprint"));
			certificate.setIssuer(context.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].issuer"));
			certificate.setOrgName(context.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].orgName"));
			certificate.setProvince(context.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].province"));
			certificate.setCity(context.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].city"));
			certificate.setCountry(context.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].country"));
			certificate.setStartDate(context.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].startDate"));
			certificate.setEndDate(context.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].endDate"));
			certificate.setSans(context.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].sans"));
			certificate.setExpired(context.booleanValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].expired"));
			certificate.setBuyInAliyun(context.booleanValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].buyInAliyun"));

			certificateList.add(certificate);
		}
		describeUserCertificateListResponse.setCertificateList(certificateList);
	 
	 	return describeUserCertificateListResponse;
	}
}