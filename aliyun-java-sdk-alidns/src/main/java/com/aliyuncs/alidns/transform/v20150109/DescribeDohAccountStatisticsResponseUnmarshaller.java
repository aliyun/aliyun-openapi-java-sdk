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

import com.aliyuncs.alidns.model.v20150109.DescribeDohAccountStatisticsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDohAccountStatisticsResponse.Statistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDohAccountStatisticsResponseUnmarshaller {

	public static DescribeDohAccountStatisticsResponse unmarshall(DescribeDohAccountStatisticsResponse describeDohAccountStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeDohAccountStatisticsResponse.setRequestId(_ctx.stringValue("DescribeDohAccountStatisticsResponse.RequestId"));

		List<Statistic> statistics = new ArrayList<Statistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDohAccountStatisticsResponse.Statistics.Length"); i++) {
			Statistic statistic = new Statistic();
			statistic.setTimestamp(_ctx.longValue("DescribeDohAccountStatisticsResponse.Statistics["+ i +"].Timestamp"));
			statistic.setV4HttpCount(_ctx.longValue("DescribeDohAccountStatisticsResponse.Statistics["+ i +"].V4HttpCount"));
			statistic.setV6HttpCount(_ctx.longValue("DescribeDohAccountStatisticsResponse.Statistics["+ i +"].V6HttpCount"));
			statistic.setV4HttpsCount(_ctx.longValue("DescribeDohAccountStatisticsResponse.Statistics["+ i +"].V4HttpsCount"));
			statistic.setV6HttpsCount(_ctx.longValue("DescribeDohAccountStatisticsResponse.Statistics["+ i +"].V6HttpsCount"));
			statistic.setTotalCount(_ctx.longValue("DescribeDohAccountStatisticsResponse.Statistics["+ i +"].TotalCount"));

			statistics.add(statistic);
		}
		describeDohAccountStatisticsResponse.setStatistics(statistics);
	 
	 	return describeDohAccountStatisticsResponse;
	}
}