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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.SummaryJobDetailResponse;
import com.aliyuncs.dts.model.v20200101.SummaryJobDetailResponse.ProgressSummaryDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class SummaryJobDetailResponseUnmarshaller {

	public static SummaryJobDetailResponse unmarshall(SummaryJobDetailResponse summaryJobDetailResponse, UnmarshallerContext _ctx) {
		
		summaryJobDetailResponse.setRequestId(_ctx.stringValue("SummaryJobDetailResponse.RequestId"));
		summaryJobDetailResponse.setCode(_ctx.stringValue("SummaryJobDetailResponse.Code"));
		summaryJobDetailResponse.setHttpStatusCode(_ctx.integerValue("SummaryJobDetailResponse.HttpStatusCode"));
		summaryJobDetailResponse.setJobId(_ctx.stringValue("SummaryJobDetailResponse.JobId"));
		summaryJobDetailResponse.setSuccess(_ctx.booleanValue("SummaryJobDetailResponse.Success"));

		List<ProgressSummaryDetail> progressSummaryDetails = new ArrayList<ProgressSummaryDetail>();
		for (int i = 0; i < _ctx.lengthValue("SummaryJobDetailResponse.ProgressSummaryDetails.Length"); i++) {
			ProgressSummaryDetail progressSummaryDetail = new ProgressSummaryDetail();
			progressSummaryDetail.setKey(_ctx.stringValue("SummaryJobDetailResponse.ProgressSummaryDetails["+ i +"].Key"));
			progressSummaryDetail.setTotalCount(_ctx.longValue("SummaryJobDetailResponse.ProgressSummaryDetails["+ i +"].TotalCount"));
			progressSummaryDetail.setState(_ctx.integerValue("SummaryJobDetailResponse.ProgressSummaryDetails["+ i +"].State"));

			progressSummaryDetails.add(progressSummaryDetail);
		}
		summaryJobDetailResponse.setProgressSummaryDetails(progressSummaryDetails);
	 
	 	return summaryJobDetailResponse;
	}
}