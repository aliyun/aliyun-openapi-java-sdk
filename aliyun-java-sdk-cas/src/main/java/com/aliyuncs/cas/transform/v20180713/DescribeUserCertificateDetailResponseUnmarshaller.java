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

import com.aliyuncs.cas.model.v20180713.DescribeUserCertificateDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserCertificateDetailResponseUnmarshaller {

	public static DescribeUserCertificateDetailResponse unmarshall(DescribeUserCertificateDetailResponse describeUserCertificateDetailResponse, UnmarshallerContext context) {
		
		describeUserCertificateDetailResponse.setRequestId(context.stringValue("DescribeUserCertificateDetailResponse.RequestId"));
		describeUserCertificateDetailResponse.setId(context.longValue("DescribeUserCertificateDetailResponse.Id"));
		describeUserCertificateDetailResponse.setName(context.stringValue("DescribeUserCertificateDetailResponse.Name"));
		describeUserCertificateDetailResponse.setCommon(context.stringValue("DescribeUserCertificateDetailResponse.Common"));
		describeUserCertificateDetailResponse.setFingerprint(context.stringValue("DescribeUserCertificateDetailResponse.Fingerprint"));
		describeUserCertificateDetailResponse.setIssuer(context.stringValue("DescribeUserCertificateDetailResponse.Issuer"));
		describeUserCertificateDetailResponse.setOrgName(context.stringValue("DescribeUserCertificateDetailResponse.OrgName"));
		describeUserCertificateDetailResponse.setProvince(context.stringValue("DescribeUserCertificateDetailResponse.Province"));
		describeUserCertificateDetailResponse.setCity(context.stringValue("DescribeUserCertificateDetailResponse.City"));
		describeUserCertificateDetailResponse.setCountry(context.stringValue("DescribeUserCertificateDetailResponse.Country"));
		describeUserCertificateDetailResponse.setStartDate(context.stringValue("DescribeUserCertificateDetailResponse.StartDate"));
		describeUserCertificateDetailResponse.setEndDate(context.stringValue("DescribeUserCertificateDetailResponse.EndDate"));
		describeUserCertificateDetailResponse.setSans(context.stringValue("DescribeUserCertificateDetailResponse.Sans"));
		describeUserCertificateDetailResponse.setExpired(context.booleanValue("DescribeUserCertificateDetailResponse.Expired"));
		describeUserCertificateDetailResponse.setBuyInAliyun(context.booleanValue("DescribeUserCertificateDetailResponse.BuyInAliyun"));
		describeUserCertificateDetailResponse.setCert(context.stringValue("DescribeUserCertificateDetailResponse.Cert"));
		describeUserCertificateDetailResponse.setKey(context.stringValue("DescribeUserCertificateDetailResponse.Key"));
	 
	 	return describeUserCertificateDetailResponse;
	}
}