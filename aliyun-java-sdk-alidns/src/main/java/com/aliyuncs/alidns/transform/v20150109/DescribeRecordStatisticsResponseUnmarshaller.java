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

import com.aliyuncs.alidns.model.v20150109.DescribeRecordStatisticsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeRecordStatisticsResponse.Statistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordStatisticsResponseUnmarshaller {

	public static DescribeRecordStatisticsResponse unmarshall(DescribeRecordStatisticsResponse describeRecordStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeRecordStatisticsResponse.setRequestId(_ctx.stringValue("DescribeRecordStatisticsResponse.RequestId"));

		List<Statistic> statistics = new ArrayList<Statistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordStatisticsResponse.Statistics.Length"); i++) {
			Statistic statistic = new Statistic();
			statistic.setTimestamp(_ctx.longValue("DescribeRecordStatisticsResponse.Statistics["+ i +"].Timestamp"));
			statistic.setCount(_ctx.longValue("DescribeRecordStatisticsResponse.Statistics["+ i +"].Count"));

			statistics.add(statistic);
		}
		describeRecordStatisticsResponse.setStatistics(statistics);
	 
	 	return describeRecordStatisticsResponse;
	}
}