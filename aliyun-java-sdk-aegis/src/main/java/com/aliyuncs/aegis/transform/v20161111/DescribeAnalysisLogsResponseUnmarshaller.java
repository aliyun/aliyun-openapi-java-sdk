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

import com.aliyuncs.aegis.model.v20161111.DescribeAnalysisLogsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeAnalysisLogsResponse.Logs;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAnalysisLogsResponseUnmarshaller {

	public static DescribeAnalysisLogsResponse unmarshall(DescribeAnalysisLogsResponse describeAnalysisLogsResponse, UnmarshallerContext context) {
		
		describeAnalysisLogsResponse.setRequestId(context.stringValue("DescribeAnalysisLogsResponse.RequestId"));

		Logs logs = new Logs();
		logs.setProcessedRow(context.integerValue("DescribeAnalysisLogsResponse.Logs.ProcessedRow"));
		logs.setWhereQuery(context.stringValue("DescribeAnalysisLogsResponse.Logs.WhereQuery"));
		logs.setAggQuery(context.stringValue("DescribeAnalysisLogsResponse.Logs.AggQuery"));
		logs.setMLimited(context.integerValue("DescribeAnalysisLogsResponse.Logs.MLimited"));
		logs.setTerms(context.stringValue("DescribeAnalysisLogsResponse.Logs.Terms"));
		logs.setKeys(context.stringValue("DescribeAnalysisLogsResponse.Logs.Keys"));
		logs.setCount(context.integerValue("DescribeAnalysisLogsResponse.Logs.Count"));
		logs.setElapsedMilliSecond(context.integerValue("DescribeAnalysisLogsResponse.Logs.ElapsedMilliSecond"));
		logs.setLogs(context.stringValue("DescribeAnalysisLogsResponse.Logs.Logs"));
		logs.setMMarker(context.stringValue("DescribeAnalysisLogsResponse.Logs.MMarker"));
		describeAnalysisLogsResponse.setLogs(logs);
	 
	 	return describeAnalysisLogsResponse;
	}
}