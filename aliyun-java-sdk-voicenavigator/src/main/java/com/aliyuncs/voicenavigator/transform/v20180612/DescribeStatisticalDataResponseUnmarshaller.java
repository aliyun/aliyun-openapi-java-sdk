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

package com.aliyuncs.voicenavigator.transform.v20180612;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.voicenavigator.model.v20180612.DescribeStatisticalDataResponse;
import com.aliyuncs.voicenavigator.model.v20180612.DescribeStatisticalDataResponse.StatisticalDataReport;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStatisticalDataResponseUnmarshaller {

	public static DescribeStatisticalDataResponse unmarshall(DescribeStatisticalDataResponse describeStatisticalDataResponse, UnmarshallerContext _ctx) {
		
		describeStatisticalDataResponse.setRequestId(_ctx.stringValue("DescribeStatisticalDataResponse.RequestId"));
		describeStatisticalDataResponse.setResolvedQuestionTotalNum(_ctx.longValue("DescribeStatisticalDataResponse.ResolvedQuestionTotalNum"));
		describeStatisticalDataResponse.setConversationTotalNum(_ctx.longValue("DescribeStatisticalDataResponse.ConversationTotalNum"));
		describeStatisticalDataResponse.setTotalResolutionRate(_ctx.stringValue("DescribeStatisticalDataResponse.TotalResolutionRate"));
		describeStatisticalDataResponse.setTotalValidAnswerRate(_ctx.stringValue("DescribeStatisticalDataResponse.TotalValidAnswerRate"));
		describeStatisticalDataResponse.setTotalDialoguePassRate(_ctx.stringValue("DescribeStatisticalDataResponse.TotalDialoguePassRate"));
		describeStatisticalDataResponse.setTotalKnowledgeHitRate(_ctx.stringValue("DescribeStatisticalDataResponse.TotalKnowledgeHitRate"));

		List<StatisticalDataReport> statisticalDataReports = new ArrayList<StatisticalDataReport>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStatisticalDataResponse.StatisticalDataReports.Length"); i++) {
			StatisticalDataReport statisticalDataReport = new StatisticalDataReport();
			statisticalDataReport.setStatisticalDate(_ctx.stringValue("DescribeStatisticalDataResponse.StatisticalDataReports["+ i +"].StatisticalDate"));
			statisticalDataReport.setResolvedQuestionNum(_ctx.integerValue("DescribeStatisticalDataResponse.StatisticalDataReports["+ i +"].ResolvedQuestionNum"));
			statisticalDataReport.setTotalConversationNum(_ctx.integerValue("DescribeStatisticalDataResponse.StatisticalDataReports["+ i +"].TotalConversationNum"));
			statisticalDataReport.setResolutionRate(_ctx.stringValue("DescribeStatisticalDataResponse.StatisticalDataReports["+ i +"].ResolutionRate"));
			statisticalDataReport.setValidAnswerRate(_ctx.stringValue("DescribeStatisticalDataResponse.StatisticalDataReports["+ i +"].ValidAnswerRate"));
			statisticalDataReport.setDialoguePassRate(_ctx.stringValue("DescribeStatisticalDataResponse.StatisticalDataReports["+ i +"].DialoguePassRate"));
			statisticalDataReport.setKnowledgeHitRate(_ctx.stringValue("DescribeStatisticalDataResponse.StatisticalDataReports["+ i +"].KnowledgeHitRate"));

			statisticalDataReports.add(statisticalDataReport);
		}
		describeStatisticalDataResponse.setStatisticalDataReports(statisticalDataReports);
	 
	 	return describeStatisticalDataResponse;
	}
}