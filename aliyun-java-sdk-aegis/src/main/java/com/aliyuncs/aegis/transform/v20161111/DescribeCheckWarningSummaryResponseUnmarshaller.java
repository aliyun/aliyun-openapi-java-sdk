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

import com.aliyuncs.aegis.model.v20161111.DescribeCheckWarningSummaryResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeCheckWarningSummaryResponse.WarningSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCheckWarningSummaryResponseUnmarshaller {

	public static DescribeCheckWarningSummaryResponse unmarshall(DescribeCheckWarningSummaryResponse describeCheckWarningSummaryResponse, UnmarshallerContext context) {
		
		describeCheckWarningSummaryResponse.setRequestId(context.stringValue("DescribeCheckWarningSummaryResponse.RequestId"));
		describeCheckWarningSummaryResponse.setCount(context.integerValue("DescribeCheckWarningSummaryResponse.Count"));
		describeCheckWarningSummaryResponse.setPageSize(context.integerValue("DescribeCheckWarningSummaryResponse.PageSize"));
		describeCheckWarningSummaryResponse.setTotalCount(context.integerValue("DescribeCheckWarningSummaryResponse.TotalCount"));
		describeCheckWarningSummaryResponse.setCurrentPage(context.integerValue("DescribeCheckWarningSummaryResponse.CurrentPage"));

		List<WarningSummary> warningSummarys = new ArrayList<WarningSummary>();
		for (int i = 0; i < context.lengthValue("DescribeCheckWarningSummaryResponse.WarningSummarys.Length"); i++) {
			WarningSummary warningSummary = new WarningSummary();
			warningSummary.setRiskId(context.longValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].RiskId"));
			warningSummary.setRiskName(context.stringValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].RiskName"));
			warningSummary.setTypeAlias(context.stringValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].TypeAlias"));
			warningSummary.setSubTypeAlias(context.stringValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].SubTypeAlias"));
			warningSummary.setLastFoundTime(context.stringValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].LastFoundTime"));
			warningSummary.setLevel(context.stringValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].Level"));
			warningSummary.setCheckCount(context.integerValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].CheckCount"));
			warningSummary.setHighWarningCount(context.integerValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].HighWarningCount"));
			warningSummary.setMediumWarningCount(context.integerValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].MediumWarningCount"));
			warningSummary.setLowWarningCount(context.integerValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].LowWarningCount"));
			warningSummary.setWarningMachineCount(context.integerValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].WarningMachineCount"));

			warningSummarys.add(warningSummary);
		}
		describeCheckWarningSummaryResponse.setWarningSummarys(warningSummarys);
	 
	 	return describeCheckWarningSummaryResponse;
	}
}