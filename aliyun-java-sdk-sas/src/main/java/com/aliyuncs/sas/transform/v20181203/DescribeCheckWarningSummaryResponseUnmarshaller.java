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

import com.aliyuncs.sas.model.v20181203.DescribeCheckWarningSummaryResponse;
import com.aliyuncs.sas.model.v20181203.DescribeCheckWarningSummaryResponse.WarningSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCheckWarningSummaryResponseUnmarshaller {

	public static DescribeCheckWarningSummaryResponse unmarshall(DescribeCheckWarningSummaryResponse describeCheckWarningSummaryResponse, UnmarshallerContext _ctx) {
		
		describeCheckWarningSummaryResponse.setRequestId(_ctx.stringValue("DescribeCheckWarningSummaryResponse.RequestId"));
		describeCheckWarningSummaryResponse.setCurrentPage(_ctx.integerValue("DescribeCheckWarningSummaryResponse.CurrentPage"));
		describeCheckWarningSummaryResponse.setPageSize(_ctx.integerValue("DescribeCheckWarningSummaryResponse.PageSize"));
		describeCheckWarningSummaryResponse.setTotalCount(_ctx.integerValue("DescribeCheckWarningSummaryResponse.TotalCount"));
		describeCheckWarningSummaryResponse.setCount(_ctx.integerValue("DescribeCheckWarningSummaryResponse.Count"));

		List<WarningSummary> warningSummarys = new ArrayList<WarningSummary>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCheckWarningSummaryResponse.WarningSummarys.Length"); i++) {
			WarningSummary warningSummary = new WarningSummary();
			warningSummary.setLowWarningCount(_ctx.integerValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].LowWarningCount"));
			warningSummary.setCheckCount(_ctx.integerValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].CheckCount"));
			warningSummary.setMediumWarningCount(_ctx.integerValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].MediumWarningCount"));
			warningSummary.setLastFoundTime(_ctx.stringValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].LastFoundTime"));
			warningSummary.setRiskId(_ctx.longValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].RiskId"));
			warningSummary.setSubTypeAlias(_ctx.stringValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].SubTypeAlias"));
			warningSummary.setWarningMachineCount(_ctx.integerValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].WarningMachineCount"));
			warningSummary.setHighWarningCount(_ctx.integerValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].HighWarningCount"));
			warningSummary.setTypeAlias(_ctx.stringValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].TypeAlias"));
			warningSummary.setRiskName(_ctx.stringValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].RiskName"));
			warningSummary.setLevel(_ctx.stringValue("DescribeCheckWarningSummaryResponse.WarningSummarys["+ i +"].Level"));

			warningSummarys.add(warningSummary);
		}
		describeCheckWarningSummaryResponse.setWarningSummarys(warningSummarys);
	 
	 	return describeCheckWarningSummaryResponse;
	}
}