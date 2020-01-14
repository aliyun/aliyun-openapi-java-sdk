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

	public static DescribeUserCertificateDetailResponse unmarshall(DescribeUserCertificateDetailResponse describeUserCertificateDetailResponse, UnmarshallerContext _ctx) {
		
		describeUserCertificateDetailResponse.setRequestId(_ctx.stringValue("DescribeUserCertificateDetailResponse.RequestId"));
		describeUserCertificateDetailResponse.setId(_ctx.longValue("DescribeUserCertificateDetailResponse.Id"));
		describeUserCertificateDetailResponse.setName(_ctx.stringValue("DescribeUserCertificateDetailResponse.Name"));
		describeUserCertificateDetailResponse.setCommon(_ctx.stringValue("DescribeUserCertificateDetailResponse.Common"));
		describeUserCertificateDetailResponse.setFingerprint(_ctx.stringValue("DescribeUserCertificateDetailResponse.Fingerprint"));
		describeUserCertificateDetailResponse.setIssuer(_ctx.stringValue("DescribeUserCertificateDetailResponse.Issuer"));
		describeUserCertificateDetailResponse.setOrgName(_ctx.stringValue("DescribeUserCertificateDetailResponse.OrgName"));
		describeUserCertificateDetailResponse.setProvince(_ctx.stringValue("DescribeUserCertificateDetailResponse.Province"));
		describeUserCertificateDetailResponse.setCity(_ctx.stringValue("DescribeUserCertificateDetailResponse.City"));
		describeUserCertificateDetailResponse.setCountry(_ctx.stringValue("DescribeUserCertificateDetailResponse.Country"));
		describeUserCertificateDetailResponse.setStartDate(_ctx.stringValue("DescribeUserCertificateDetailResponse.StartDate"));
		describeUserCertificateDetailResponse.setEndDate(_ctx.stringValue("DescribeUserCertificateDetailResponse.EndDate"));
		describeUserCertificateDetailResponse.setSans(_ctx.stringValue("DescribeUserCertificateDetailResponse.Sans"));
		describeUserCertificateDetailResponse.setExpired(_ctx.booleanValue("DescribeUserCertificateDetailResponse.Expired"));
		describeUserCertificateDetailResponse.setBuyInAliyun(_ctx.booleanValue("DescribeUserCertificateDetailResponse.BuyInAliyun"));
		describeUserCertificateDetailResponse.setCert(_ctx.stringValue("DescribeUserCertificateDetailResponse.Cert"));
		describeUserCertificateDetailResponse.setKey(_ctx.stringValue("DescribeUserCertificateDetailResponse.Key"));
	 
	 	return describeUserCertificateDetailResponse;
	}
}