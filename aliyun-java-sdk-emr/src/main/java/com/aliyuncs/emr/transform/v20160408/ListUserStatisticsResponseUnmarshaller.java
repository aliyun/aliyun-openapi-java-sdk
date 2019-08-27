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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListUserStatisticsResponse;
import com.aliyuncs.emr.model.v20160408.ListUserStatisticsResponse.UserStatistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserStatisticsResponseUnmarshaller {

	public static ListUserStatisticsResponse unmarshall(ListUserStatisticsResponse listUserStatisticsResponse, UnmarshallerContext _ctx) {
		
		listUserStatisticsResponse.setTotal(_ctx.longValue("ListUserStatisticsResponse.Total"));

		List<UserStatistics> userStatisticsList = new ArrayList<UserStatistics>();
		for (int i = 0; i < _ctx.lengthValue("ListUserStatisticsResponse.UserStatisticsList.Length"); i++) {
			UserStatistics userStatistics = new UserStatistics();
			userStatistics.setId(_ctx.longValue("ListUserStatisticsResponse.UserStatisticsList["+ i +"].Id"));
			userStatistics.setUserId(_ctx.stringValue("ListUserStatisticsResponse.UserStatisticsList["+ i +"].UserId"));
			userStatistics.setJobNum(_ctx.integerValue("ListUserStatisticsResponse.UserStatisticsList["+ i +"].JobNum"));
			userStatistics.setExecutePlanNum(_ctx.integerValue("ListUserStatisticsResponse.UserStatisticsList["+ i +"].ExecutePlanNum"));
			userStatistics.setInteractionJobNum(_ctx.integerValue("ListUserStatisticsResponse.UserStatisticsList["+ i +"].InteractionJobNum"));
			userStatistics.setJobMigratedNum(_ctx.integerValue("ListUserStatisticsResponse.UserStatisticsList["+ i +"].JobMigratedNum"));
			userStatistics.setExecutePlanMigratedNum(_ctx.integerValue("ListUserStatisticsResponse.UserStatisticsList["+ i +"].ExecutePlanMigratedNum"));
			userStatistics.setInteractionJobMigratedNum(_ctx.integerValue("ListUserStatisticsResponse.UserStatisticsList["+ i +"].InteractionJobMigratedNum"));

			userStatisticsList.add(userStatistics);
		}
		listUserStatisticsResponse.setUserStatisticsList(userStatisticsList);
	 
	 	return listUserStatisticsResponse;
	}
}