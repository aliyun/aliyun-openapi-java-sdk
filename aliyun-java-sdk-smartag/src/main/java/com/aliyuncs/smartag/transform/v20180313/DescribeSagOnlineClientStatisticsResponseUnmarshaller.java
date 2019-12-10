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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSagOnlineClientStatisticsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagOnlineClientStatisticsResponse.Statistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagOnlineClientStatisticsResponseUnmarshaller {

	public static DescribeSagOnlineClientStatisticsResponse unmarshall(DescribeSagOnlineClientStatisticsResponse describeSagOnlineClientStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeSagOnlineClientStatisticsResponse.setRequestId(_ctx.stringValue("DescribeSagOnlineClientStatisticsResponse.RequestId"));

		List<Statistics> sagStatistics = new ArrayList<Statistics>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagOnlineClientStatisticsResponse.SagStatistics.Length"); i++) {
			Statistics statistics = new Statistics();
			statistics.setSmartAGId(_ctx.stringValue("DescribeSagOnlineClientStatisticsResponse.SagStatistics["+ i +"].SmartAGId"));
			statistics.setOnlineCount(_ctx.stringValue("DescribeSagOnlineClientStatisticsResponse.SagStatistics["+ i +"].OnlineCount"));

			sagStatistics.add(statistics);
		}
		describeSagOnlineClientStatisticsResponse.setSagStatistics(sagStatistics);
	 
	 	return describeSagOnlineClientStatisticsResponse;
	}
}