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

import com.aliyuncs.sas.model.v20181203.GetCheckSummaryResponse;
import com.aliyuncs.sas.model.v20181203.GetCheckSummaryResponse.SummarysItem;
import com.aliyuncs.sas.model.v20181203.GetCheckSummaryResponse.SummarysItem.StandardsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCheckSummaryResponseUnmarshaller {

	public static GetCheckSummaryResponse unmarshall(GetCheckSummaryResponse getCheckSummaryResponse, UnmarshallerContext _ctx) {
		
		getCheckSummaryResponse.setRequestId(_ctx.stringValue("GetCheckSummaryResponse.RequestId"));
		getCheckSummaryResponse.setTaskId(_ctx.stringValue("GetCheckSummaryResponse.TaskId"));

		List<SummarysItem> summarys = new ArrayList<SummarysItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckSummaryResponse.Summarys.Length"); i++) {
			SummarysItem summarysItem = new SummarysItem();
			summarysItem.setType(_ctx.stringValue("GetCheckSummaryResponse.Summarys["+ i +"].Type"));
			summarysItem.setPassCount(_ctx.longValue("GetCheckSummaryResponse.Summarys["+ i +"].PassCount"));
			summarysItem.setFailCount(_ctx.integerValue("GetCheckSummaryResponse.Summarys["+ i +"].FailCount"));

			List<StandardsItem> standards = new ArrayList<StandardsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetCheckSummaryResponse.Summarys["+ i +"].Standards.Length"); j++) {
				StandardsItem standardsItem = new StandardsItem();
				standardsItem.setId(_ctx.longValue("GetCheckSummaryResponse.Summarys["+ i +"].Standards["+ j +"].Id"));
				standardsItem.setShowName(_ctx.stringValue("GetCheckSummaryResponse.Summarys["+ i +"].Standards["+ j +"].ShowName"));
				standardsItem.setPassCount(_ctx.integerValue("GetCheckSummaryResponse.Summarys["+ i +"].Standards["+ j +"].PassCount"));
				standardsItem.setFailCount(_ctx.integerValue("GetCheckSummaryResponse.Summarys["+ i +"].Standards["+ j +"].FailCount"));
				standardsItem.setRiskLevelHighCount(_ctx.integerValue("GetCheckSummaryResponse.Summarys["+ i +"].Standards["+ j +"].RiskLevelHighCount"));
				standardsItem.setRiskLevelMediumCount(_ctx.integerValue("GetCheckSummaryResponse.Summarys["+ i +"].Standards["+ j +"].RiskLevelMediumCount"));
				standardsItem.setRiskLevelLowCount(_ctx.integerValue("GetCheckSummaryResponse.Summarys["+ i +"].Standards["+ j +"].RiskLevelLowCount"));

				standards.add(standardsItem);
			}
			summarysItem.setStandards(standards);

			summarys.add(summarysItem);
		}
		getCheckSummaryResponse.setSummarys(summarys);
	 
	 	return getCheckSummaryResponse;
	}
}