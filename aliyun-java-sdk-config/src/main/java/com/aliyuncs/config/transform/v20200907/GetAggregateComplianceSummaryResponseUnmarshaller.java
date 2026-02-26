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

import com.aliyuncs.config.model.v20200907.GetAggregateComplianceSummaryResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateComplianceSummaryResponse.ComplianceSummary;
import com.aliyuncs.config.model.v20200907.GetAggregateComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule;
import com.aliyuncs.config.model.v20200907.GetAggregateComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateComplianceSummaryResponseUnmarshaller {

	public static GetAggregateComplianceSummaryResponse unmarshall(GetAggregateComplianceSummaryResponse getAggregateComplianceSummaryResponse, UnmarshallerContext _ctx) {
		
		getAggregateComplianceSummaryResponse.setRequestId(_ctx.stringValue("GetAggregateComplianceSummaryResponse.RequestId"));

		ComplianceSummary complianceSummary = new ComplianceSummary();

		ComplianceSummaryByResource complianceSummaryByResource = new ComplianceSummaryByResource();
		complianceSummaryByResource.setCompliantCount(_ctx.integerValue("GetAggregateComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource.CompliantCount"));
		complianceSummaryByResource.setNonCompliantCount(_ctx.integerValue("GetAggregateComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource.NonCompliantCount"));
		complianceSummaryByResource.setComplianceSummaryTimestamp(_ctx.longValue("GetAggregateComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource.ComplianceSummaryTimestamp"));
		complianceSummaryByResource.setTotalCount(_ctx.longValue("GetAggregateComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource.TotalCount"));
		complianceSummary.setComplianceSummaryByResource(complianceSummaryByResource);

		ComplianceSummaryByConfigRule complianceSummaryByConfigRule = new ComplianceSummaryByConfigRule();
		complianceSummaryByConfigRule.setCompliantCount(_ctx.integerValue("GetAggregateComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule.CompliantCount"));
		complianceSummaryByConfigRule.setNonCompliantCount(_ctx.integerValue("GetAggregateComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule.NonCompliantCount"));
		complianceSummaryByConfigRule.setComplianceSummaryTimestamp(_ctx.longValue("GetAggregateComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule.ComplianceSummaryTimestamp"));
		complianceSummaryByConfigRule.setTotalCount(_ctx.longValue("GetAggregateComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule.TotalCount"));
		complianceSummary.setComplianceSummaryByConfigRule(complianceSummaryByConfigRule);
		getAggregateComplianceSummaryResponse.setComplianceSummary(complianceSummary);
	 
	 	return getAggregateComplianceSummaryResponse;
	}
}