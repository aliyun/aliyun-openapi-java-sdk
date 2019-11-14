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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20191030.ListIsvStatisticsResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.ListIsvStatisticsResponse.Data;
import com.aliyuncs.aliyuncvc.model.v20191030.ListIsvStatisticsResponse.Data.Statistic;
import com.aliyuncs.aliyuncvc.model.v20191030.ListIsvStatisticsResponse.Data.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIsvStatisticsResponseUnmarshaller {

	public static ListIsvStatisticsResponse unmarshall(ListIsvStatisticsResponse listIsvStatisticsResponse, UnmarshallerContext _ctx) {
		
		listIsvStatisticsResponse.setRequestId(_ctx.stringValue("ListIsvStatisticsResponse.RequestId"));
		listIsvStatisticsResponse.setErrorCode(_ctx.integerValue("ListIsvStatisticsResponse.ErrorCode"));
		listIsvStatisticsResponse.setMessage(_ctx.stringValue("ListIsvStatisticsResponse.Message"));
		listIsvStatisticsResponse.setSuccess(_ctx.booleanValue("ListIsvStatisticsResponse.Success"));

		Data data = new Data();

		Total total = new Total();
		total.setMeetingNumber(_ctx.integerValue("ListIsvStatisticsResponse.Data.Total.MeetingNumber"));
		total.setMeetingLength(_ctx.integerValue("ListIsvStatisticsResponse.Data.Total.MeetingLength"));
		total.setMemberNumber(_ctx.integerValue("ListIsvStatisticsResponse.Data.Total.MemberNumber"));
		data.setTotal(total);

		List<Statistic> statistics = new ArrayList<Statistic>();
		for (int i = 0; i < _ctx.lengthValue("ListIsvStatisticsResponse.Data.Statistics.Length"); i++) {
			Statistic statistic = new Statistic();
			statistic.setMeetingNumber(_ctx.stringValue("ListIsvStatisticsResponse.Data.Statistics["+ i +"].MeetingNumber"));
			statistic.setMeetingLength(_ctx.stringValue("ListIsvStatisticsResponse.Data.Statistics["+ i +"].MeetingLength"));
			statistic.setMemberNumber(_ctx.stringValue("ListIsvStatisticsResponse.Data.Statistics["+ i +"].MemberNumber"));
			statistic.setDay(_ctx.stringValue("ListIsvStatisticsResponse.Data.Statistics["+ i +"].Day"));

			statistics.add(statistic);
		}
		data.setStatistics(statistics);
		listIsvStatisticsResponse.setData(data);
	 
	 	return listIsvStatisticsResponse;
	}
}