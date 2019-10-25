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

package com.aliyuncs.aliyuncvc.transform.v20190919;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20190919.QueryStatisticsResponse;
import com.aliyuncs.aliyuncvc.model.v20190919.QueryStatisticsResponse.Data;
import com.aliyuncs.aliyuncvc.model.v20190919.QueryStatisticsResponse.Data.DayInfoItem;
import com.aliyuncs.aliyuncvc.model.v20190919.QueryStatisticsResponse.Data.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStatisticsResponseUnmarshaller {

	public static QueryStatisticsResponse unmarshall(QueryStatisticsResponse queryStatisticsResponse, UnmarshallerContext _ctx) {
		
		queryStatisticsResponse.setRequestId(_ctx.stringValue("QueryStatisticsResponse.RequestId"));
		queryStatisticsResponse.setErrorCode(_ctx.integerValue("QueryStatisticsResponse.ErrorCode"));
		queryStatisticsResponse.setMessage(_ctx.stringValue("QueryStatisticsResponse.Message"));
		queryStatisticsResponse.setSuccess(_ctx.booleanValue("QueryStatisticsResponse.Success"));

		Data data = new Data();

		Total total = new Total();
		total.setMeetingNum(_ctx.integerValue("QueryStatisticsResponse.Data.Total.MeetingNum"));
		total.setMeetingLength(_ctx.integerValue("QueryStatisticsResponse.Data.Total.MeetingLength"));
		total.setMemberNum(_ctx.integerValue("QueryStatisticsResponse.Data.Total.MemberNum"));
		data.setTotal(total);

		List<DayInfoItem> dayInfo = new ArrayList<DayInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryStatisticsResponse.Data.DayInfo.Length"); i++) {
			DayInfoItem dayInfoItem = new DayInfoItem();
			dayInfoItem.setMeetingNum(_ctx.stringValue("QueryStatisticsResponse.Data.DayInfo["+ i +"].MeetingNum"));
			dayInfoItem.setMeetingLength(_ctx.stringValue("QueryStatisticsResponse.Data.DayInfo["+ i +"].MeetingLength"));
			dayInfoItem.setMemberNum(_ctx.stringValue("QueryStatisticsResponse.Data.DayInfo["+ i +"].MemberNum"));
			dayInfoItem.setDay(_ctx.stringValue("QueryStatisticsResponse.Data.DayInfo["+ i +"].Day"));

			dayInfo.add(dayInfoItem);
		}
		data.setDayInfo(dayInfo);
		queryStatisticsResponse.setData(data);
	 
	 	return queryStatisticsResponse;
	}
}