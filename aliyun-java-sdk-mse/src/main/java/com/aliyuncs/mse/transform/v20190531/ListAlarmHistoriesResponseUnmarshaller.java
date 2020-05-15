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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListAlarmHistoriesResponse;
import com.aliyuncs.mse.model.v20190531.ListAlarmHistoriesResponse.AlarmHistoryModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlarmHistoriesResponseUnmarshaller {

	public static ListAlarmHistoriesResponse unmarshall(ListAlarmHistoriesResponse listAlarmHistoriesResponse, UnmarshallerContext _ctx) {
		
		listAlarmHistoriesResponse.setRequestId(_ctx.stringValue("ListAlarmHistoriesResponse.RequestId"));
		listAlarmHistoriesResponse.setSuccess(_ctx.booleanValue("ListAlarmHistoriesResponse.Success"));
		listAlarmHistoriesResponse.setMessage(_ctx.stringValue("ListAlarmHistoriesResponse.Message"));
		listAlarmHistoriesResponse.setErrorCode(_ctx.stringValue("ListAlarmHistoriesResponse.ErrorCode"));
		listAlarmHistoriesResponse.setPageNumber(_ctx.integerValue("ListAlarmHistoriesResponse.PageNumber"));
		listAlarmHistoriesResponse.setPageSize(_ctx.integerValue("ListAlarmHistoriesResponse.PageSize"));
		listAlarmHistoriesResponse.setTotalCount(_ctx.integerValue("ListAlarmHistoriesResponse.TotalCount"));
		listAlarmHistoriesResponse.setHttpCode(_ctx.stringValue("ListAlarmHistoriesResponse.HttpCode"));

		List<AlarmHistoryModel> data = new ArrayList<AlarmHistoryModel>();
		for (int i = 0; i < _ctx.lengthValue("ListAlarmHistoriesResponse.Data.Length"); i++) {
			AlarmHistoryModel alarmHistoryModel = new AlarmHistoryModel();
			alarmHistoryModel.setAlarmTime(_ctx.stringValue("ListAlarmHistoriesResponse.Data["+ i +"].AlarmTime"));
			alarmHistoryModel.setAlarmPhone(_ctx.stringValue("ListAlarmHistoriesResponse.Data["+ i +"].AlarmPhone"));
			alarmHistoryModel.setAlarmDingDing(_ctx.stringValue("ListAlarmHistoriesResponse.Data["+ i +"].AlarmDingDing"));
			alarmHistoryModel.setAlarmName(_ctx.stringValue("ListAlarmHistoriesResponse.Data["+ i +"].AlarmName"));
			alarmHistoryModel.setAlarmContent(_ctx.stringValue("ListAlarmHistoriesResponse.Data["+ i +"].AlarmContent"));
			alarmHistoryModel.setAlarmEmail(_ctx.stringValue("ListAlarmHistoriesResponse.Data["+ i +"].AlarmEmail"));

			data.add(alarmHistoryModel);
		}
		listAlarmHistoriesResponse.setData(data);
	 
	 	return listAlarmHistoriesResponse;
	}
}