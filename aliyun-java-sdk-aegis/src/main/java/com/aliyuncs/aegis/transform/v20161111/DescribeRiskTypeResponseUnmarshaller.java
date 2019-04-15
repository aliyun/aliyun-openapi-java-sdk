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

import com.aliyuncs.aegis.model.v20161111.DescribeRiskTypeResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeRiskTypeResponse.RiskType;
import com.aliyuncs.aegis.model.v20161111.DescribeRiskTypeResponse.RiskType.SubType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRiskTypeResponseUnmarshaller {

	public static DescribeRiskTypeResponse unmarshall(DescribeRiskTypeResponse describeRiskTypeResponse, UnmarshallerContext context) {
		
		describeRiskTypeResponse.setRequestId(context.stringValue("DescribeRiskTypeResponse.RequestId"));
		describeRiskTypeResponse.setCount(context.integerValue("DescribeRiskTypeResponse.Count"));

		List<RiskType> riskTypes = new ArrayList<RiskType>();
		for (int i = 0; i < context.lengthValue("DescribeRiskTypeResponse.RiskTypes.Length"); i++) {
			RiskType riskType = new RiskType();
			riskType.setTypeName(context.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].TypeName"));
			riskType.setAlias(context.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].Alias"));
			riskType.setWarnCount(context.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].WarnCount"));

			List<SubType> subTypes = new ArrayList<SubType>();
			for (int j = 0; j < context.lengthValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes.Length"); j++) {
				SubType subType = new SubType();
				subType.setWarnCount(context.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].WarnCount"));
				subType.setTypeName(context.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].TypeName"));
				subType.setAlias(context.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].Alias"));

				subTypes.add(subType);
			}
			riskType.setSubTypes(subTypes);

			riskTypes.add(riskType);
		}
		describeRiskTypeResponse.setRiskTypes(riskTypes);
	 
	 	return describeRiskTypeResponse;
	}
}