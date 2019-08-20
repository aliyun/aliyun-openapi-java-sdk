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

import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetCinemasResponse;
import com.aliyuncs.appmallsservice.model.v20180224.TaobaoFilmGetCinemasResponse.CinemasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TaobaoFilmGetCinemasResponseUnmarshaller {

	public static TaobaoFilmGetCinemasResponse unmarshall(TaobaoFilmGetCinemasResponse taobaoFilmGetCinemasResponse, UnmarshallerContext _ctx) {
		
		taobaoFilmGetCinemasResponse.setRequestId(_ctx.stringValue("TaobaoFilmGetCinemasResponse.RequestId"));
		taobaoFilmGetCinemasResponse.setErrorCode(_ctx.stringValue("TaobaoFilmGetCinemasResponse.ErrorCode"));
		taobaoFilmGetCinemasResponse.setMsg(_ctx.stringValue("TaobaoFilmGetCinemasResponse.Msg"));
		taobaoFilmGetCinemasResponse.setSubCode(_ctx.stringValue("TaobaoFilmGetCinemasResponse.SubCode"));
		taobaoFilmGetCinemasResponse.setSubMsg(_ctx.stringValue("TaobaoFilmGetCinemasResponse.SubMsg"));
		taobaoFilmGetCinemasResponse.setTotalCount(_ctx.longValue("TaobaoFilmGetCinemasResponse.TotalCount"));
		taobaoFilmGetCinemasResponse.setLogsId(_ctx.stringValue("TaobaoFilmGetCinemasResponse.LogsId"));

		List<CinemasItem> cinemas = new ArrayList<CinemasItem>();
		for (int i = 0; i < _ctx.lengthValue("TaobaoFilmGetCinemasResponse.Cinemas.Length"); i++) {
			CinemasItem cinemasItem = new CinemasItem();
			cinemasItem.setAddress(_ctx.stringValue("TaobaoFilmGetCinemasResponse.Cinemas["+ i +"].Address"));
			cinemasItem.setCinemaName(_ctx.stringValue("TaobaoFilmGetCinemasResponse.Cinemas["+ i +"].CinemaName"));
			cinemasItem.setCityId(_ctx.longValue("TaobaoFilmGetCinemasResponse.Cinemas["+ i +"].CityId"));
			cinemasItem.setId(_ctx.longValue("TaobaoFilmGetCinemasResponse.Cinemas["+ i +"].Id"));
			cinemasItem.setLatitude(_ctx.stringValue("TaobaoFilmGetCinemasResponse.Cinemas["+ i +"].Latitude"));
			cinemasItem.setLongitude(_ctx.stringValue("TaobaoFilmGetCinemasResponse.Cinemas["+ i +"].Longitude"));
			cinemasItem.setPhone(_ctx.stringValue("TaobaoFilmGetCinemasResponse.Cinemas["+ i +"].Phone"));
			cinemasItem.setRegionName(_ctx.stringValue("TaobaoFilmGetCinemasResponse.Cinemas["+ i +"].RegionName"));
			cinemasItem.setScheduleCloseTime(_ctx.longValue("TaobaoFilmGetCinemasResponse.Cinemas["+ i +"].ScheduleCloseTime"));
			cinemasItem.setStandardId(_ctx.stringValue("TaobaoFilmGetCinemasResponse.Cinemas["+ i +"].StandardId"));

			cinemas.add(cinemasItem);
		}
		taobaoFilmGetCinemasResponse.setCinemas(cinemas);
	 
	 	return taobaoFilmGetCinemasResponse;
	}
}