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

package com.aliyuncs.config.transform.v20190108;

import com.aliyuncs.config.model.v20190108.DescribeComplianceSummaryResponse;
import com.aliyuncs.config.model.v20190108.DescribeComplianceSummaryResponse.ComplianceSummary;
import com.aliyuncs.config.model.v20190108.DescribeComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule;
import com.aliyuncs.config.model.v20190108.DescribeComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeComplianceSummaryResponseUnmarshaller {

	public static DescribeComplianceSummaryResponse unmarshall(DescribeComplianceSummaryResponse describeComplianceSummaryResponse, UnmarshallerContext _ctx) {
		
		describeComplianceSummaryResponse.setRequestId(_ctx.stringValue("DescribeComplianceSummaryResponse.RequestId"));

		ComplianceSummary complianceSummary = new ComplianceSummary();

		ComplianceSummaryByConfigRule complianceSummaryByConfigRule = new ComplianceSummaryByConfigRule();
		complianceSummaryByConfigRule.setComplianceSummaryTimestamp(_ctx.longValue("DescribeComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule.ComplianceSummaryTimestamp"));
		complianceSummaryByConfigRule.setCompliantCount(_ctx.integerValue("DescribeComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule.CompliantCount"));
		complianceSummaryByConfigRule.setNonCompliantCount(_ctx.integerValue("DescribeComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule.NonCompliantCount"));
		complianceSummaryByConfigRule.setTotalCount(_ctx.longValue("DescribeComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByConfigRule.TotalCount"));
		complianceSummary.setComplianceSummaryByConfigRule(complianceSummaryByConfigRule);

		ComplianceSummaryByResource complianceSummaryByResource = new ComplianceSummaryByResource();
		complianceSummaryByResource.setComplianceSummaryTimestamp(_ctx.longValue("DescribeComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource.ComplianceSummaryTimestamp"));
		complianceSummaryByResource.setCompliantCount(_ctx.integerValue("DescribeComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource.CompliantCount"));
		complianceSummaryByResource.setNonCompliantCount(_ctx.integerValue("DescribeComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource.NonCompliantCount"));
		complianceSummaryByResource.setTotalCount(_ctx.longValue("DescribeComplianceSummaryResponse.ComplianceSummary.ComplianceSummaryByResource.TotalCount"));
		complianceSummary.setComplianceSummaryByResource(complianceSummaryByResource);
		describeComplianceSummaryResponse.setComplianceSummary(complianceSummary);
	 
	 	return describeComplianceSummaryResponse;
	}
}