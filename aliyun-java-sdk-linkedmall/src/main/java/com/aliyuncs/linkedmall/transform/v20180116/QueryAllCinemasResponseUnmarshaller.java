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

import com.aliyuncs.linkedmall.model.v20180116.QueryAllCinemasResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryAllCinemasResponse.Cinema;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAllCinemasResponseUnmarshaller {

	public static QueryAllCinemasResponse unmarshall(QueryAllCinemasResponse queryAllCinemasResponse, UnmarshallerContext _ctx) {
		
		queryAllCinemasResponse.setRequestId(_ctx.stringValue("QueryAllCinemasResponse.RequestId"));
		queryAllCinemasResponse.setCode(_ctx.stringValue("QueryAllCinemasResponse.Code"));
		queryAllCinemasResponse.setMessage(_ctx.stringValue("QueryAllCinemasResponse.Message"));
		queryAllCinemasResponse.setSubCode(_ctx.stringValue("QueryAllCinemasResponse.SubCode"));
		queryAllCinemasResponse.setSubMessage(_ctx.stringValue("QueryAllCinemasResponse.SubMessage"));
		queryAllCinemasResponse.setLogsId(_ctx.stringValue("QueryAllCinemasResponse.LogsId"));
		queryAllCinemasResponse.setSuccess(_ctx.booleanValue("QueryAllCinemasResponse.Success"));
		queryAllCinemasResponse.setTotalCount(_ctx.longValue("QueryAllCinemasResponse.TotalCount"));

		List<Cinema> cinemas = new ArrayList<Cinema>();
		for (int i = 0; i < _ctx.lengthValue("QueryAllCinemasResponse.Cinemas.Length"); i++) {
			Cinema cinema = new Cinema();
			cinema.setCityId(_ctx.longValue("QueryAllCinemasResponse.Cinemas["+ i +"].CityId"));
			cinema.setCityName(_ctx.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].CityName"));
			cinema.setScheduleCloseTime(_ctx.longValue("QueryAllCinemasResponse.Cinemas["+ i +"].ScheduleCloseTime"));
			cinema.setLatitude(_ctx.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].Latitude"));
			cinema.setLongitude(_ctx.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].Longitude"));
			cinema.setCinemaName(_ctx.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].CinemaName"));
			cinema.setAddress(_ctx.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].Address"));
			cinema.setId(_ctx.longValue("QueryAllCinemasResponse.Cinemas["+ i +"].Id"));
			cinema.setPhone(_ctx.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].Phone"));
			cinema.setStandardId(_ctx.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].StandardId"));

			cinemas.add(cinema);
		}
		queryAllCinemasResponse.setCinemas(cinemas);
	 
	 	return queryAllCinemasResponse;
	}
}