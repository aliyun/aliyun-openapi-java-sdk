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

	public static DescribeUserCertificateListResponse unmarshall(DescribeUserCertificateListResponse describeUserCertificateListResponse, UnmarshallerContext _ctx) {
		
		describeUserCertificateListResponse.setRequestId(_ctx.stringValue("DescribeUserCertificateListResponse.RequestId"));
		describeUserCertificateListResponse.setTotalCount(_ctx.integerValue("DescribeUserCertificateListResponse.TotalCount"));
		describeUserCertificateListResponse.setShowSize(_ctx.integerValue("DescribeUserCertificateListResponse.ShowSize"));
		describeUserCertificateListResponse.setCurrentPage(_ctx.integerValue("DescribeUserCertificateListResponse.CurrentPage"));

		List<Certificate> certificateList = new ArrayList<Certificate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserCertificateListResponse.CertificateList.Length"); i++) {
			Certificate certificate = new Certificate();
			certificate.setId(_ctx.longValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].id"));
			certificate.setName(_ctx.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].name"));
			certificate.setCommon(_ctx.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].common"));
			certificate.setFingerprint(_ctx.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].fingerprint"));
			certificate.setIssuer(_ctx.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].issuer"));
			certificate.setOrgName(_ctx.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].orgName"));
			certificate.setProvince(_ctx.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].province"));
			certificate.setCity(_ctx.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].city"));
			certificate.setCountry(_ctx.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].country"));
			certificate.setStartDate(_ctx.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].startDate"));
			certificate.setEndDate(_ctx.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].endDate"));
			certificate.setSans(_ctx.stringValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].sans"));
			certificate.setExpired(_ctx.booleanValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].expired"));
			certificate.setBuyInAliyun(_ctx.booleanValue("DescribeUserCertificateListResponse.CertificateList["+ i +"].buyInAliyun"));

			certificateList.add(certificate);
		}
		describeUserCertificateListResponse.setCertificateList(certificateList);
	 
	 	return describeUserCertificateListResponse;
	}
}