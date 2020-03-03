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

package com.aliyuncs.geoip.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.geoip.model.v20200101.DescribeGeoipInstanceStatisticsResponse;
import com.aliyuncs.geoip.model.v20200101.DescribeGeoipInstanceStatisticsResponse.Statistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGeoipInstanceStatisticsResponseUnmarshaller {

	public static DescribeGeoipInstanceStatisticsResponse unmarshall(DescribeGeoipInstanceStatisticsResponse describeGeoipInstanceStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeGeoipInstanceStatisticsResponse.setRequestId(_ctx.stringValue("DescribeGeoipInstanceStatisticsResponse.RequestId"));

		List<Statistic> statistics = new ArrayList<Statistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGeoipInstanceStatisticsResponse.Statistics.Length"); i++) {
			Statistic statistic = new Statistic();
			statistic.setTimestamp(_ctx.longValue("DescribeGeoipInstanceStatisticsResponse.Statistics["+ i +"].Timestamp"));
			statistic.setCount(_ctx.longValue("DescribeGeoipInstanceStatisticsResponse.Statistics["+ i +"].Count"));

			statistics.add(statistic);
		}
		describeGeoipInstanceStatisticsResponse.setStatistics(statistics);
	 
	 	return describeGeoipInstanceStatisticsResponse;
	}
}