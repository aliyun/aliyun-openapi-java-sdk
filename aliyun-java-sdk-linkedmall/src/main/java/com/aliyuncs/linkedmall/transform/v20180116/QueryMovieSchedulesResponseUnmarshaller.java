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

	public static QueryMovieSchedulesResponse unmarshall(QueryMovieSchedulesResponse queryMovieSchedulesResponse, UnmarshallerContext _ctx) {
		
		queryMovieSchedulesResponse.setRequestId(_ctx.stringValue("QueryMovieSchedulesResponse.RequestId"));
		queryMovieSchedulesResponse.setLogsId(_ctx.stringValue("QueryMovieSchedulesResponse.LogsId"));
		queryMovieSchedulesResponse.setSubCode(_ctx.stringValue("QueryMovieSchedulesResponse.SubCode"));
		queryMovieSchedulesResponse.setSubMessage(_ctx.stringValue("QueryMovieSchedulesResponse.SubMessage"));
		queryMovieSchedulesResponse.setCode(_ctx.stringValue("QueryMovieSchedulesResponse.Code"));
		queryMovieSchedulesResponse.setSuccess(_ctx.booleanValue("QueryMovieSchedulesResponse.Success"));
		queryMovieSchedulesResponse.setMessage(_ctx.stringValue("QueryMovieSchedulesResponse.Message"));

		List<Schedule> schedules = new ArrayList<Schedule>();
		for (int i = 0; i < _ctx.lengthValue("QueryMovieSchedulesResponse.Schedules.Length"); i++) {
			Schedule schedule = new Schedule();
			schedule.setCinemaId(_ctx.longValue("QueryMovieSchedulesResponse.Schedules["+ i +"].CinemaId"));
			schedule.setSessionEndingTime(_ctx.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].SessionEndingTime"));
			schedule.setHallName(_ctx.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].HallName"));
			schedule.setId(_ctx.longValue("QueryMovieSchedulesResponse.Schedules["+ i +"].Id"));
			schedule.setIsExpired(_ctx.booleanValue("QueryMovieSchedulesResponse.Schedules["+ i +"].IsExpired"));
			schedule.setMaxCanBuy(_ctx.longValue("QueryMovieSchedulesResponse.Schedules["+ i +"].MaxCanBuy"));
			schedule.setPrice(_ctx.longValue("QueryMovieSchedulesResponse.Schedules["+ i +"].Price"));
			schedule.setScheduleArea(_ctx.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].ScheduleArea"));
			schedule.setSectionId(_ctx.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].SectionId"));
			schedule.setServiceFee(_ctx.longValue("QueryMovieSchedulesResponse.Schedules["+ i +"].ServiceFee"));
			schedule.setReleaseDate(_ctx.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].ReleaseDate"));
			schedule.setMovieId(_ctx.longValue("QueryMovieSchedulesResponse.Schedules["+ i +"].MovieId"));
			schedule.setSessionStartingTime(_ctx.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].SessionStartingTime"));
			schedule.setMovieVersion(_ctx.stringValue("QueryMovieSchedulesResponse.Schedules["+ i +"].MovieVersion"));

			schedules.add(schedule);
		}
		queryMovieSchedulesResponse.setSchedules(schedules);
	 
	 	return queryMovieSchedulesResponse;
	}
}