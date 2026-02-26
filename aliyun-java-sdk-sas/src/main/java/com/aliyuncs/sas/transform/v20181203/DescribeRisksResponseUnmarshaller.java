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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeRisksResponse;
import com.aliyuncs.sas.model.v20181203.DescribeRisksResponse.Risk;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRisksResponseUnmarshaller {

	public static DescribeRisksResponse unmarshall(DescribeRisksResponse describeRisksResponse, UnmarshallerContext _ctx) {
		
		describeRisksResponse.setRequestId(_ctx.stringValue("DescribeRisksResponse.RequestId"));
		describeRisksResponse.setTotalCount(_ctx.integerValue("DescribeRisksResponse.TotalCount"));

		List<Risk> risks = new ArrayList<Risk>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRisksResponse.Risks.Length"); i++) {
			Risk risk = new Risk();
			risk.setRiskId(_ctx.longValue("DescribeRisksResponse.Risks["+ i +"].RiskId"));
			risk.setRiskName(_ctx.stringValue("DescribeRisksResponse.Risks["+ i +"].RiskName"));
			risk.setRiskDetail(_ctx.stringValue("DescribeRisksResponse.Risks["+ i +"].RiskDetail"));
			risk.setRiskType(_ctx.stringValue("DescribeRisksResponse.Risks["+ i +"].RiskType"));
			risk.setTypeAlias(_ctx.stringValue("DescribeRisksResponse.Risks["+ i +"].TypeAlias"));
			risk.setSubRiskType(_ctx.stringValue("DescribeRisksResponse.Risks["+ i +"].SubRiskType"));
			risk.setSubTypeAlias(_ctx.stringValue("DescribeRisksResponse.Risks["+ i +"].SubTypeAlias"));

			risks.add(risk);
		}
		describeRisksResponse.setRisks(risks);
	 
	 	return describeRisksResponse;
	}
}