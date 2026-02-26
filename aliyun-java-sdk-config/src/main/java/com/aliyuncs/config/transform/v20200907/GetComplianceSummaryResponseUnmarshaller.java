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

package com.aliyuncs.config.transform.v20200907;

import com.aliyuncs.config.model.v20200907.GetComplianceSummaryResponse;
import com.aliyuncs.config.model.v20200907.GetComplianceSummaryResponse.ComplianceSummary;
import com.aliyuncs.config.model.v20200907.GetComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule;
import com.aliyuncs.config.model.v20200907.GetComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetComplianceSummaryResponseUnmarshaller {

	public static GetComplianceSummaryResponse unmarshall(GetComplianceSummaryResponse getComplianceSummaryResponse, UnmarshallerContext _ctx) {
		
		getComplianceSummaryResponse.setRequestId(_ctx.stringValue("GetComplianceSummaryResponse.RequestId"));

		ComplianceSummary complianceSummary = new ComplianceSummary();

		ComplianceSummaryByResource complianceSummaryByResource = new ComplianceSummaryByResource();
		complianceSummaryByResource.setCompliantCount(_ctx.integerValue("GetComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource.CompliantCount"));
		complianceSummaryByResource.setNonCompliantCount(_ctx.integerValue("GetComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource.NonCompliantCount"));
		complianceSummaryByResource.setComplianceSummaryTimestamp(_ctx.longValue("GetComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource.ComplianceSummaryTimestamp"));
		complianceSummaryByResource.setTotalCount(_ctx.longValue("GetComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource.TotalCount"));
		complianceSummary.setComplianceSummaryByResource(complianceSummaryByResource);

		ComplianceSummaryByConfigRule complianceSummaryByConfigRule = new ComplianceSummaryByConfigRule();
		complianceSummaryByConfigRule.setCompliantCount(_ctx.integerValue("GetComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule.CompliantCount"));
		complianceSummaryByConfigRule.setNonCompliantCount(_ctx.integerValue("GetComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule.NonCompliantCount"));
		complianceSummaryByConfigRule.setComplianceSummaryTimestamp(_ctx.longValue("GetComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule.ComplianceSummaryTimestamp"));
		complianceSummaryByConfigRule.setTotalCount(_ctx.longValue("GetComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule.TotalCount"));
		complianceSummary.setComplianceSummaryByConfigRule(complianceSummaryByConfigRule);
		getComplianceSummaryResponse.setComplianceSummary(complianceSummary);
	 
	 	return getComplianceSummaryResponse;
	}
}