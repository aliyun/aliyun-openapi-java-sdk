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

import com.aliyuncs.aegis.model.v20161111.DescribesummaryResponse;
import com.aliyuncs.aegis.model.v20161111.DescribesummaryResponse.WarningSummary;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribesummaryResponseUnmarshaller {

	public static DescribesummaryResponse unmarshall(DescribesummaryResponse describesummaryResponse, UnmarshallerContext context) {
		
		describesummaryResponse.setRequestId(context.stringValue("DescribesummaryResponse.RequestId"));
		describesummaryResponse.setCount(context.integerValue("DescribesummaryResponse.Count"));
		describesummaryResponse.setPageSize(context.integerValue("DescribesummaryResponse.PageSize"));
		describesummaryResponse.setTotalCount(context.integerValue("DescribesummaryResponse.TotalCount"));
		describesummaryResponse.setCurrentPage(context.integerValue("DescribesummaryResponse.CurrentPage"));

		List<WarningSummary> warningSummarys = new ArrayList<WarningSummary>();
		for (int i = 0; i < context.lengthValue("DescribesummaryResponse.WarningSummarys.Length"); i++) {
			WarningSummary warningSummary = new WarningSummary();
			warningSummary.setRiskId(context.longValue("DescribesummaryResponse.WarningSummarys["+ i +"].RiskId"));
			warningSummary.setRiskName(context.stringValue("DescribesummaryResponse.WarningSummarys["+ i +"].RiskName"));
			warningSummary.setLevel(context.stringValue("DescribesummaryResponse.WarningSummarys["+ i +"].Level"));
			warningSummary.setTypeAlias(context.stringValue("DescribesummaryResponse.WarningSummarys["+ i +"].TypeAlias"));
			warningSummary.setSubTypeAlias(context.stringValue("DescribesummaryResponse.WarningSummarys["+ i +"].SubTypeAlias"));
			warningSummary.setLastFoundTime(context.stringValue("DescribesummaryResponse.WarningSummarys["+ i +"].LastFoundTime"));
			warningSummary.setPendingCount(context.integerValue("DescribesummaryResponse.WarningSummarys["+ i +"].PendingCount"));
			warningSummary.setTotalCount(context.integerValue("DescribesummaryResponse.WarningSummarys["+ i +"].TotalCount"));
			warningSummary.setRiskDetail(context.stringValue("DescribesummaryResponse.WarningSummarys["+ i +"].RiskDetail"));

			warningSummarys.add(warningSummary);
		}
		describesummaryResponse.setWarningSummarys(warningSummarys);
	 
	 	return describesummaryResponse;
	}
}