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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetDailyPlayRegionStatisResponse;
import com.aliyuncs.vod.model.v20170321.GetDailyPlayRegionStatisResponse.DailyPlayRegionStatisFileDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDailyPlayRegionStatisResponseUnmarshaller {

	public static GetDailyPlayRegionStatisResponse unmarshall(GetDailyPlayRegionStatisResponse getDailyPlayRegionStatisResponse, UnmarshallerContext _ctx) {
		
		getDailyPlayRegionStatisResponse.setRequestId(_ctx.stringValue("GetDailyPlayRegionStatisResponse.RequestId"));

		List<String> failDates = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDailyPlayRegionStatisResponse.FailDates.Length"); i++) {
			failDates.add(_ctx.stringValue("GetDailyPlayRegionStatisResponse.FailDates["+ i +"]"));
		}
		getDailyPlayRegionStatisResponse.setFailDates(failDates);

		List<String> emptyDates = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDailyPlayRegionStatisResponse.EmptyDates.Length"); i++) {
			emptyDates.add(_ctx.stringValue("GetDailyPlayRegionStatisResponse.EmptyDates["+ i +"]"));
		}
		getDailyPlayRegionStatisResponse.setEmptyDates(emptyDates);

		List<DailyPlayRegionStatisFileDO> dailyPlayRegionStatisList = new ArrayList<DailyPlayRegionStatisFileDO>();
		for (int i = 0; i < _ctx.lengthValue("GetDailyPlayRegionStatisResponse.DailyPlayRegionStatisList.Length"); i++) {
			DailyPlayRegionStatisFileDO dailyPlayRegionStatisFileDO = new DailyPlayRegionStatisFileDO();
			dailyPlayRegionStatisFileDO.setDate(_ctx.stringValue("GetDailyPlayRegionStatisResponse.DailyPlayRegionStatisList["+ i +"].Date"));
			dailyPlayRegionStatisFileDO.setFileUrl(_ctx.stringValue("GetDailyPlayRegionStatisResponse.DailyPlayRegionStatisList["+ i +"].FileUrl"));

			dailyPlayRegionStatisList.add(dailyPlayRegionStatisFileDO);
		}
		getDailyPlayRegionStatisResponse.setDailyPlayRegionStatisList(dailyPlayRegionStatisList);
	 
	 	return getDailyPlayRegionStatisResponse;
	}
}