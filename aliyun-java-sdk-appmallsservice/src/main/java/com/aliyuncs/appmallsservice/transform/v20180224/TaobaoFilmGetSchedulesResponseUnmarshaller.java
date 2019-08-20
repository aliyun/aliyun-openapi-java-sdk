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

package com.aliyuncs.appmallsservice.transform.v20180224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetSchedulesResponse;
import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetSchedulesResponse.SchedulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaobaoFilmGetSchedulesResponseUnmarshaller {

	public static TaobaoFilmGetSchedulesResponse unmarshall(TaobaoFilmGetSchedulesResponse taobaoFilmGetSchedulesResponse, UnmarshallerContext _ctx) {
		
		taobaoFilmGetSchedulesResponse.setRequestId(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.RequestId"));
		taobaoFilmGetSchedulesResponse.setErrorCode(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.ErrorCode"));
		taobaoFilmGetSchedulesResponse.setMsg(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.Msg"));
		taobaoFilmGetSchedulesResponse.setSubCode(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.SubCode"));
		taobaoFilmGetSchedulesResponse.setSubMsg(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.SubMsg"));
		taobaoFilmGetSchedulesResponse.setLogsId(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.LogsId"));

		List<SchedulesItem> schedules = new ArrayList<SchedulesItem>();
		for (int i = 0; i < _ctx.lengthValue("TaobaoFilmGetSchedulesResponse.Schedules.Length"); i++) {
			SchedulesItem schedulesItem = new SchedulesItem();
			schedulesItem.setCinemaId(_ctx.longValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].CinemaId"));
			schedulesItem.setCloseTime(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].CloseTime"));
			schedulesItem.setHallName(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].HallName"));
			schedulesItem.setId(_ctx.longValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].Id"));
			schedulesItem.setIsExpired(_ctx.booleanValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].IsExpired"));
			schedulesItem.setMaxCanBuy(_ctx.longValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].MaxCanBuy"));
			schedulesItem.setPrice(_ctx.longValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].Price"));
			schedulesItem.setScheduleArea(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].ScheduleArea"));
			schedulesItem.setSectionId(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].SectionId"));
			schedulesItem.setServiceFee(_ctx.longValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].ServiceFee"));
			schedulesItem.setShowDate(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].ShowDate"));
			schedulesItem.setShowId(_ctx.longValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].ShowId"));
			schedulesItem.setShowTime(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].ShowTime"));
			schedulesItem.setShowVersion(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].ShowVersion"));
			schedulesItem.setHallId(_ctx.stringValue("TaobaoFilmGetSchedulesResponse.Schedules["+ i +"].HallId"));

			schedules.add(schedulesItem);
		}
		taobaoFilmGetSchedulesResponse.setSchedules(schedules);
	 
	 	return taobaoFilmGetSchedulesResponse;
	}
}