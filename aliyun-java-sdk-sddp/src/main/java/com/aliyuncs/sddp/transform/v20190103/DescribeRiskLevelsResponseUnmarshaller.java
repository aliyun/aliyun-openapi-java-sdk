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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeRiskLevelsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeRiskLevelsResponse.RiskLevel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRiskLevelsResponseUnmarshaller {

	public static DescribeRiskLevelsResponse unmarshall(DescribeRiskLevelsResponse describeRiskLevelsResponse, UnmarshallerContext _ctx) {
		
		describeRiskLevelsResponse.setRequestId(_ctx.stringValue("DescribeRiskLevelsResponse.RequestId"));

		List<RiskLevel> riskLevelList = new ArrayList<RiskLevel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRiskLevelsResponse.RiskLevelList.Length"); i++) {
			RiskLevel riskLevel = new RiskLevel();
			riskLevel.setId(_ctx.longValue("DescribeRiskLevelsResponse.RiskLevelList["+ i +"].Id"));
			riskLevel.setDescription(_ctx.stringValue("DescribeRiskLevelsResponse.RiskLevelList["+ i +"].Description"));
			riskLevel.setName(_ctx.stringValue("DescribeRiskLevelsResponse.RiskLevelList["+ i +"].Name"));
			riskLevel.setAlias(_ctx.stringValue("DescribeRiskLevelsResponse.RiskLevelList["+ i +"].Alias"));
			riskLevel.setReferenceNum(_ctx.integerValue("DescribeRiskLevelsResponse.RiskLevelList["+ i +"].ReferenceNum"));

			riskLevelList.add(riskLevel);
		}
		describeRiskLevelsResponse.setRiskLevelList(riskLevelList);
	 
	 	return describeRiskLevelsResponse;
	}
}