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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20190108.DescribeComplianceResponse;
import com.aliyuncs.config.model.v20190108.DescribeComplianceResponse.ComplianceResult;
import com.aliyuncs.config.model.v20190108.DescribeComplianceResponse.ComplianceResult.CompliancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeComplianceResponseUnmarshaller {

	public static DescribeComplianceResponse unmarshall(DescribeComplianceResponse describeComplianceResponse, UnmarshallerContext _ctx) {
		
		describeComplianceResponse.setRequestId(_ctx.stringValue("DescribeComplianceResponse.RequestId"));

		ComplianceResult complianceResult = new ComplianceResult();
		complianceResult.setTotalCount(_ctx.longValue("DescribeComplianceResponse.ComplianceResult.TotalCount"));

		List<CompliancesItem> compliances = new ArrayList<CompliancesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeComplianceResponse.ComplianceResult.Compliances.Length"); i++) {
			CompliancesItem compliancesItem = new CompliancesItem();
			compliancesItem.setComplianceType(_ctx.stringValue("DescribeComplianceResponse.ComplianceResult.Compliances["+ i +"].ComplianceType"));
			compliancesItem.setCount(_ctx.integerValue("DescribeComplianceResponse.ComplianceResult.Compliances["+ i +"].Count"));

			compliances.add(compliancesItem);
		}
		complianceResult.setCompliances(compliances);
		describeComplianceResponse.setComplianceResult(complianceResult);
	 
	 	return describeComplianceResponse;
	}
}