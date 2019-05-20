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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateOverallStatisticsReportResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateOverallStatisticsReportResponse.Report;
import com.aliyuncs.cloudcallcenter.model.v20170705.GenerateOverallStatisticsReportResponse.Report.KeyValuePair;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateOverallStatisticsReportResponseUnmarshaller {

	public static GenerateOverallStatisticsReportResponse unmarshall(GenerateOverallStatisticsReportResponse generateOverallStatisticsReportResponse, UnmarshallerContext context) {
		
		generateOverallStatisticsReportResponse.setRequestId(context.stringValue("GenerateOverallStatisticsReportResponse.RequestId"));
		generateOverallStatisticsReportResponse.setSuccess(context.booleanValue("GenerateOverallStatisticsReportResponse.Success"));
		generateOverallStatisticsReportResponse.setCode(context.stringValue("GenerateOverallStatisticsReportResponse.Code"));
		generateOverallStatisticsReportResponse.setMessage(context.stringValue("GenerateOverallStatisticsReportResponse.Message"));
		generateOverallStatisticsReportResponse.setHttpStatusCode(context.integerValue("GenerateOverallStatisticsReportResponse.HttpStatusCode"));

		Report report = new Report();

		List<KeyValuePair> indicators = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("GenerateOverallStatisticsReportResponse.Report.Indicators.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("GenerateOverallStatisticsReportResponse.Report.Indicators["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("GenerateOverallStatisticsReportResponse.Report.Indicators["+ i +"].Value"));

			indicators.add(keyValuePair);
		}
		report.setIndicators(indicators);

		List<KeyValuePair> briefs = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("GenerateOverallStatisticsReportResponse.Report.Briefs.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("GenerateOverallStatisticsReportResponse.Report.Briefs["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("GenerateOverallStatisticsReportResponse.Report.Briefs["+ i +"].Value"));

			briefs.add(keyValuePair);
		}
		report.setBriefs(briefs);

		List<KeyValuePair> summaries = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("GenerateOverallStatisticsReportResponse.Report.Summaries.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("GenerateOverallStatisticsReportResponse.Report.Summaries["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("GenerateOverallStatisticsReportResponse.Report.Summaries["+ i +"].Value"));

			summaries.add(keyValuePair);
		}
		report.setSummaries(summaries);
		generateOverallStatisticsReportResponse.setReport(report);
	 
	 	return generateOverallStatisticsReportResponse;
	}
}