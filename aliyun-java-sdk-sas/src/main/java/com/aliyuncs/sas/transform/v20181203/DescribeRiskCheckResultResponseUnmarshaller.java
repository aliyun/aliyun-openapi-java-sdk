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

import com.aliyuncs.sas.model.v20181203.DescribeRiskCheckResultResponse;
import com.aliyuncs.sas.model.v20181203.DescribeRiskCheckResultResponse.RiskCheckResultForDisplay;
import com.aliyuncs.sas.model.v20181203.DescribeRiskCheckResultResponse.RiskCheckResultForDisplay.RiskItemResource;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRiskCheckResultResponseUnmarshaller {

	public static DescribeRiskCheckResultResponse unmarshall(DescribeRiskCheckResultResponse describeRiskCheckResultResponse, UnmarshallerContext _ctx) {
		
		describeRiskCheckResultResponse.setRequestId(_ctx.stringValue("DescribeRiskCheckResultResponse.RequestId"));
		describeRiskCheckResultResponse.setCurrentPage(_ctx.integerValue("DescribeRiskCheckResultResponse.CurrentPage"));
		describeRiskCheckResultResponse.setPageSize(_ctx.integerValue("DescribeRiskCheckResultResponse.PageSize"));
		describeRiskCheckResultResponse.setTotalCount(_ctx.integerValue("DescribeRiskCheckResultResponse.TotalCount"));
		describeRiskCheckResultResponse.setPageCount(_ctx.integerValue("DescribeRiskCheckResultResponse.PageCount"));
		describeRiskCheckResultResponse.setCount(_ctx.integerValue("DescribeRiskCheckResultResponse.Count"));

		List<RiskCheckResultForDisplay> list = new ArrayList<RiskCheckResultForDisplay>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRiskCheckResultResponse.List.Length"); i++) {
			RiskCheckResultForDisplay riskCheckResultForDisplay = new RiskCheckResultForDisplay();
			riskCheckResultForDisplay.setRiskLevel(_ctx.stringValue("DescribeRiskCheckResultResponse.List["+ i +"].RiskLevel"));
			riskCheckResultForDisplay.setStatus(_ctx.stringValue("DescribeRiskCheckResultResponse.List["+ i +"].Status"));
			riskCheckResultForDisplay.setType(_ctx.stringValue("DescribeRiskCheckResultResponse.List["+ i +"].Type"));
			riskCheckResultForDisplay.setSort(_ctx.integerValue("DescribeRiskCheckResultResponse.List["+ i +"].Sort"));
			riskCheckResultForDisplay.setRepairStatus(_ctx.stringValue("DescribeRiskCheckResultResponse.List["+ i +"].RepairStatus"));
			riskCheckResultForDisplay.setRemainingTime(_ctx.integerValue("DescribeRiskCheckResultResponse.List["+ i +"].RemainingTime"));
			riskCheckResultForDisplay.setItemId(_ctx.longValue("DescribeRiskCheckResultResponse.List["+ i +"].ItemId"));
			riskCheckResultForDisplay.setStartStatus(_ctx.stringValue("DescribeRiskCheckResultResponse.List["+ i +"].StartStatus"));
			riskCheckResultForDisplay.setAffectedCount(_ctx.integerValue("DescribeRiskCheckResultResponse.List["+ i +"].AffectedCount"));
			riskCheckResultForDisplay.setRiskAssertType(_ctx.stringValue("DescribeRiskCheckResultResponse.List["+ i +"].RiskAssertType"));
			riskCheckResultForDisplay.setTitle(_ctx.stringValue("DescribeRiskCheckResultResponse.List["+ i +"].Title"));
			riskCheckResultForDisplay.setTaskId(_ctx.longValue("DescribeRiskCheckResultResponse.List["+ i +"].TaskId"));
			riskCheckResultForDisplay.setCheckTime(_ctx.longValue("DescribeRiskCheckResultResponse.List["+ i +"].CheckTime"));

			List<RiskItemResource> riskItemResources = new ArrayList<RiskItemResource>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRiskCheckResultResponse.List["+ i +"].RiskItemResources.Length"); j++) {
				RiskItemResource riskItemResource = new RiskItemResource();
				riskItemResource.setContentResource(_ctx.mapValue("DescribeRiskCheckResultResponse.List["+ i +"].RiskItemResources["+ j +"].ContentResource"));
				riskItemResource.setResourceName(_ctx.stringValue("DescribeRiskCheckResultResponse.List["+ i +"].RiskItemResources["+ j +"].ResourceName"));

				riskItemResources.add(riskItemResource);
			}
			riskCheckResultForDisplay.setRiskItemResources(riskItemResources);

			list.add(riskCheckResultForDisplay);
		}
		describeRiskCheckResultResponse.setList(list);
	 
	 	return describeRiskCheckResultResponse;
	}
}