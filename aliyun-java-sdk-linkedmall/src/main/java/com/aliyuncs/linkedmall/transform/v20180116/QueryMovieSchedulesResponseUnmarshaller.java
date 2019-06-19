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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryMovieSchedulesResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryMovieSchedulesResponse.Schedule;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMovieSchedulesResponseUnmarshaller {

	public static QueryMovieSchedulesResponse unmarshall(QueryMovieSchedulesResponse queryMovieSchedulesResponse, UnmarshallerContext context) {
		
		queryMovieSchedulesResponse.setRequestId(context.stringValue("QueryMovieSchedulesResponse.RequestId"));
		queryMovieSchedulesResponse.setLogsId(context.stringValue("QueryMovieSchedulesResponse.LogsId"));
		queryMovieSchedulesResponse.setSubCode(context.stringValue("QueryMovieSchedulesResponse.SubCode"));
		queryMovieSchedulesResponse.setSubMessage(context.stringValue("QueryMovieSchedulesResponse.SubMessage"));
		queryMovieSchedulesResponse.setCode(context.stringValue("QueryMovieSchedulesResponse.Code"));
		queryMovieSchedulesResponse.setSuccess(context.booleanValue("QueryMovieSchedulesResponse.Success"));
		queryMovieSchedulesResponse.setMessage(context.stringValue("QueryMovieSchedulesResponse.Message"));

		List<Schedule> schedules = new ArrayList<Schedule>();
		for (int i = 0; i < context.lengthValue("QueryMovieSchedulesResponse.Schedules.Length"); i++) {
			Schedule schedule = new Schedule();
			schedule.setCinemaId(context.longValue("QueryMovieSchedulesResponse.Schedules["+ i +"].CinemaId"));
			schedule.setSessionEndingTime(context.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].SessionEndingTime"));
			schedule.setHallName(context.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].HallName"));
			schedule.setId(context.longValue("QueryMovieSchedulesResponse.Schedules["+ i +"].Id"));
			schedule.setIsExpired(context.booleanValue("QueryMovieSchedulesResponse.Schedules["+ i +"].IsExpired"));
			schedule.setMaxCanBuy(context.longValue("QueryMovieSchedulesResponse.Schedules["+ i +"].MaxCanBuy"));
			schedule.setPrice(context.longValue("QueryMovieSchedulesResponse.Schedules["+ i +"].Price"));
			schedule.setScheduleArea(context.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].ScheduleArea"));
			schedule.setSectionId(context.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].SectionId"));
			schedule.setServiceFee(context.longValue("QueryMovieSchedulesResponse.Schedules["+ i +"].ServiceFee"));
			schedule.setReleaseDate(context.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].ReleaseDate"));
			schedule.setMovieId(context.longValue("QueryMovieSchedulesResponse.Schedules["+ i +"].MovieId"));
			schedule.setSessionStartingTime(context.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].SessionStartingTime"));
			schedule.setMovieVersion(context.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].MovieVersion"));

			schedules.add(schedule);
		}
		queryMovieSchedulesResponse.setSchedules(schedules);
	 
	 	return queryMovieSchedulesResponse;
	}
}