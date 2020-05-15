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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.GenerateOverallStatisticsReportResponse;
import com.aliyuncs.outboundbot.model.v20191226.GenerateOverallStatisticsReportResponse.OverallStatisticsReport;
import com.aliyuncs.outboundbot.model.v20191226.GenerateOverallStatisticsReportResponse.OverallStatisticsReport.KeyValuePair;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateOverallStatisticsReportResponseUnmarshaller {

	public static GenerateOverallStatisticsReportResponse unmarshall(GenerateOverallStatisticsReportResponse generateOverallStatisticsReportResponse, UnmarshallerContext _ctx) {
		
		generateOverallStatisticsReportResponse.setRequestId(_ctx.stringValue("GenerateOverallStatisticsReportResponse.RequestId"));
		generateOverallStatisticsReportResponse.setSuccess(_ctx.booleanValue("GenerateOverallStatisticsReportResponse.Success"));
		generateOverallStatisticsReportResponse.setCode(_ctx.stringValue("GenerateOverallStatisticsReportResponse.Code"));
		generateOverallStatisticsReportResponse.setMessage(_ctx.stringValue("GenerateOverallStatisticsReportResponse.Message"));
		generateOverallStatisticsReportResponse.setHttpStatusCode(_ctx.integerValue("GenerateOverallStatisticsReportResponse.HttpStatusCode"));

		OverallStatisticsReport overallStatisticsReport = new OverallStatisticsReport();

		List<KeyValuePair> indicators = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("GenerateOverallStatisticsReportResponse.OverallStatisticsReport.Indicators.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(_ctx.stringValue("GenerateOverallStatisticsReportResponse.OverallStatisticsReport.Indicators["+ i +"].Key"));
			keyValuePair.setValue(_ctx.stringValue("GenerateOverallStatisticsReportResponse.OverallStatisticsReport.Indicators["+ i +"].Value"));

			indicators.add(keyValuePair);
		}
		overallStatisticsReport.setIndicators(indicators);

		List<KeyValuePair> briefs = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("GenerateOverallStatisticsReportResponse.OverallStatisticsReport.Briefs.Length"); i++) {
			KeyValuePair keyValuePair_ = new KeyValuePair();
			keyValuePair_.setKey(_ctx.stringValue("GenerateOverallStatisticsReportResponse.OverallStatisticsReport.Briefs["+ i +"].Key"));
			keyValuePair_.setValue(_ctx.stringValue("GenerateOverallStatisticsReportResponse.OverallStatisticsReport.Briefs["+ i +"].Value"));

			briefs.add(keyValuePair_);
		}
		overallStatisticsReport.setBriefs(briefs);

		List<KeyValuePair> summaries = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("GenerateOverallStatisticsReportResponse.OverallStatisticsReport.Summaries.Length"); i++) {
			KeyValuePair keyValuePair_ = new KeyValuePair();
			keyValuePair_.setKey(_ctx.stringValue("GenerateOverallStatisticsReportResponse.OverallStatisticsReport.Summaries["+ i +"].Key"));
			keyValuePair_.setValue(_ctx.stringValue("GenerateOverallStatisticsReportResponse.OverallStatisticsReport.Summaries["+ i +"].Value"));

			summaries.add(keyValuePair_);
		}
		overallStatisticsReport.setSummaries(summaries);
		generateOverallStatisticsReportResponse.setOverallStatisticsReport(overallStatisticsReport);
	 
	 	return generateOverallStatisticsReportResponse;
	}
}