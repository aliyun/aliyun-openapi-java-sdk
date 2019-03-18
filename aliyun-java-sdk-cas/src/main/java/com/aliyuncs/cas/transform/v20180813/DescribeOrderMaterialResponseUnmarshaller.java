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

package com.aliyuncs.cas.transform.v20180813;

import com.aliyuncs.cas.model.v20180813.DescribeOrderMaterialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrderMaterialResponseUnmarshaller {

	public static DescribeOrderMaterialResponse unmarshall(DescribeOrderMaterialResponse describeOrderMaterialResponse, UnmarshallerContext context) {
		
		describeOrderMaterialResponse.setRequestId(context.stringValue("DescribeOrderMaterialResponse.RequestId"));
		describeOrderMaterialResponse.setCompanyName(context.stringValue("DescribeOrderMaterialResponse.CompanyName"));
		describeOrderMaterialResponse.setCompanyPhone(context.stringValue("DescribeOrderMaterialResponse.CompanyPhone"));
		describeOrderMaterialResponse.setCompanyCode(context.stringValue("DescribeOrderMaterialResponse.CompanyCode"));
		describeOrderMaterialResponse.setPersonName(context.stringValue("DescribeOrderMaterialResponse.PersonName"));
		describeOrderMaterialResponse.setPersonPhone(context.stringValue("DescribeOrderMaterialResponse.PersonPhone"));
		describeOrderMaterialResponse.setPersonEmail(context.stringValue("DescribeOrderMaterialResponse.PersonEmail"));
		describeOrderMaterialResponse.setCompanyEmail(context.stringValue("DescribeOrderMaterialResponse.CompanyEmail"));
		describeOrderMaterialResponse.setCompanyAddress(context.stringValue("DescribeOrderMaterialResponse.CompanyAddress"));
		describeOrderMaterialResponse.setPersonIdCardNumber(context.stringValue("DescribeOrderMaterialResponse.PersonIdCardNumber"));
		describeOrderMaterialResponse.setCompanyType(context.integerValue("DescribeOrderMaterialResponse.CompanyType"));
		describeOrderMaterialResponse.setCity(context.stringValue("DescribeOrderMaterialResponse.City"));
		describeOrderMaterialResponse.setProvince(context.stringValue("DescribeOrderMaterialResponse.Province"));
		describeOrderMaterialResponse.setCreateCsr(context.integerValue("DescribeOrderMaterialResponse.CreateCsr"));
		describeOrderMaterialResponse.setPostCode(context.stringValue("DescribeOrderMaterialResponse.PostCode"));
		describeOrderMaterialResponse.setCsrContent(context.stringValue("DescribeOrderMaterialResponse.CsrContent"));
		describeOrderMaterialResponse.setPersonTitle(context.stringValue("DescribeOrderMaterialResponse.PersonTitle"));
		describeOrderMaterialResponse.setLeaderName(context.stringValue("DescribeOrderMaterialResponse.LeaderName"));
		describeOrderMaterialResponse.setLeaderTitle(context.stringValue("DescribeOrderMaterialResponse.LeaderTitle"));
		describeOrderMaterialResponse.setLeaderEmail(context.stringValue("DescribeOrderMaterialResponse.LeaderEmail"));
		describeOrderMaterialResponse.setLeaderPhone(context.stringValue("DescribeOrderMaterialResponse.LeaderPhone"));
		describeOrderMaterialResponse.setCountryCode(context.stringValue("DescribeOrderMaterialResponse.CountryCode"));
		describeOrderMaterialResponse.setPersonDepartment(context.stringValue("DescribeOrderMaterialResponse.PersonDepartment"));
		describeOrderMaterialResponse.setDomainAuthType(context.integerValue("DescribeOrderMaterialResponse.DomainAuthType"));
		describeOrderMaterialResponse.setDomain(context.stringValue("DescribeOrderMaterialResponse.Domain"));
	 
	 	return describeOrderMaterialResponse;
	}
}