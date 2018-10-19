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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAllCinemasResponseUnmarshaller {

	public static QueryAllCinemasResponse unmarshall(QueryAllCinemasResponse queryAllCinemasResponse, UnmarshallerContext context) {
		
		queryAllCinemasResponse.setRequestId(context.stringValue("QueryAllCinemasResponse.RequestId"));
		queryAllCinemasResponse.setCode(context.stringValue("QueryAllCinemasResponse.Code"));
		queryAllCinemasResponse.setMessage(context.stringValue("QueryAllCinemasResponse.Message"));
		queryAllCinemasResponse.setSubCode(context.stringValue("QueryAllCinemasResponse.SubCode"));
		queryAllCinemasResponse.setSubMessage(context.stringValue("QueryAllCinemasResponse.SubMessage"));
		queryAllCinemasResponse.setLogsId(context.stringValue("QueryAllCinemasResponse.LogsId"));
		queryAllCinemasResponse.setSuccess(context.booleanValue("QueryAllCinemasResponse.Success"));
		queryAllCinemasResponse.setTotalCount(context.longValue("QueryAllCinemasResponse.TotalCount"));

		List<Cinema> cinemas = new ArrayList<Cinema>();
		for (int i = 0; i < context.lengthValue("QueryAllCinemasResponse.Cinemas.Length"); i++) {
			Cinema cinema = new Cinema();
			cinema.setCityId(context.longValue("QueryAllCinemasResponse.Cinemas["+ i +"].CityId"));
			cinema.setCityName(context.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].CityName"));
			cinema.setScheduleCloseTime(context.longValue("QueryAllCinemasResponse.Cinemas["+ i +"].ScheduleCloseTime"));
			cinema.setLatitude(context.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].Latitude"));
			cinema.setLongitude(context.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].Longitude"));
			cinema.setCinemaName(context.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].CinemaName"));
			cinema.setAddress(context.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].Address"));
			cinema.setId(context.longValue("QueryAllCinemasResponse.Cinemas["+ i +"].Id"));
			cinema.setPhone(context.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].Phone"));
			cinema.setStandardId(context.stringValue("QueryAllCinemasResponse.Cinemas["+ i +"].StandardId"));

			cinemas.add(cinema);
		}
		queryAllCinemasResponse.setCinemas(cinemas);
	 
	 	return queryAllCinemasResponse;
	}
}