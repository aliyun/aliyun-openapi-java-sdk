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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeRecordStatisticsHistoryResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeRecordStatisticsHistoryResponse.Statistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordStatisticsHistoryResponseUnmarshaller {

	public static DescribeRecordStatisticsHistoryResponse unmarshall(DescribeRecordStatisticsHistoryResponse describeRecordStatisticsHistoryResponse, UnmarshallerContext _ctx) {
		
		describeRecordStatisticsHistoryResponse.setRequestId(_ctx.stringValue("DescribeRecordStatisticsHistoryResponse.RequestId"));

		List<Statistic> statistics = new ArrayList<Statistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordStatisticsHistoryResponse.Statistics.Length"); i++) {
			Statistic statistic = new Statistic();
			statistic.setTimestamp(_ctx.longValue("DescribeRecordStatisticsHistoryResponse.Statistics["+ i +"].Timestamp"));
			statistic.setCount(_ctx.longValue("DescribeRecordStatisticsHistoryResponse.Statistics["+ i +"].Count"));

			statistics.add(statistic);
		}
		describeRecordStatisticsHistoryResponse.setStatistics(statistics);
	 
	 	return describeRecordStatisticsHistoryResponse;
	}
}