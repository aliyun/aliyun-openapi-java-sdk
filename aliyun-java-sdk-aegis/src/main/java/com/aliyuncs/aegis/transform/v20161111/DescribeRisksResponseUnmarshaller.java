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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeRisksResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeRisksResponse.Risk;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRisksResponseUnmarshaller {

	public static DescribeRisksResponse unmarshall(DescribeRisksResponse describeRisksResponse, UnmarshallerContext context) {
		
		describeRisksResponse.setRequestId(context.stringValue("DescribeRisksResponse.RequestId"));
		describeRisksResponse.setTotalCount(context.integerValue("DescribeRisksResponse.TotalCount"));

		List<Risk> risks = new ArrayList<Risk>();
		for (int i = 0; i < context.lengthValue("DescribeRisksResponse.Risks.Length"); i++) {
			Risk risk = new Risk();
			risk.setRiskId(context.longValue("DescribeRisksResponse.Risks["+ i +"].RiskId"));
			risk.setRiskName(context.stringValue("DescribeRisksResponse.Risks["+ i +"].RiskName"));
			risk.setRiskDetail(context.stringValue("DescribeRisksResponse.Risks["+ i +"].RiskDetail"));
			risk.setRiskType(context.stringValue("DescribeRisksResponse.Risks["+ i +"].RiskType"));
			risk.setTypeAlias(context.stringValue("DescribeRisksResponse.Risks["+ i +"].TypeAlias"));
			risk.setSubRiskType(context.stringValue("DescribeRisksResponse.Risks["+ i +"].SubRiskType"));
			risk.setSubTypeAlias(context.stringValue("DescribeRisksResponse.Risks["+ i +"].SubTypeAlias"));

			risks.add(risk);
		}
		describeRisksResponse.setRisks(risks);
	 
	 	return describeRisksResponse;
	}
}