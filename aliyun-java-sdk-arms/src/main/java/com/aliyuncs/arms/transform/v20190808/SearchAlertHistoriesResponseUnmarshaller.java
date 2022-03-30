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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.SearchAlertHistoriesResponse;
import com.aliyuncs.arms.model.v20190808.SearchAlertHistoriesResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.SearchAlertHistoriesResponse.PageBean.AlarmHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchAlertHistoriesResponseUnmarshaller {

	public static SearchAlertHistoriesResponse unmarshall(SearchAlertHistoriesResponse searchAlertHistoriesResponse, UnmarshallerContext _ctx) {
		
		searchAlertHistoriesResponse.setRequestId(_ctx.stringValue("SearchAlertHistoriesResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setPageNumber(_ctx.integerValue("SearchAlertHistoriesResponse.PageBean.PageNumber"));
		pageBean.setPageSize(_ctx.integerValue("SearchAlertHistoriesResponse.PageBean.PageSize"));
		pageBean.setTotalCount(_ctx.integerValue("SearchAlertHistoriesResponse.PageBean.TotalCount"));

		List<AlarmHistory> alarmHistories = new ArrayList<AlarmHistory>();
		for (int i = 0; i < _ctx.lengthValue("SearchAlertHistoriesResponse.PageBean.AlarmHistories.Length"); i++) {
			AlarmHistory alarmHistory = new AlarmHistory();
			alarmHistory.setAlarmTime(_ctx.longValue("SearchAlertHistoriesResponse.PageBean.AlarmHistories["+ i +"].AlarmTime"));
			alarmHistory.setStrategyId(_ctx.stringValue("SearchAlertHistoriesResponse.PageBean.AlarmHistories["+ i +"].StrategyId"));
			alarmHistory.setAlarmResponseCode(_ctx.integerValue("SearchAlertHistoriesResponse.PageBean.AlarmHistories["+ i +"].AlarmResponseCode"));
			alarmHistory.setEmails(_ctx.stringValue("SearchAlertHistoriesResponse.PageBean.AlarmHistories["+ i +"].Emails"));
			alarmHistory.setUserId(_ctx.stringValue("SearchAlertHistoriesResponse.PageBean.AlarmHistories["+ i +"].UserId"));
			alarmHistory.setAlarmSources(_ctx.stringValue("SearchAlertHistoriesResponse.PageBean.AlarmHistories["+ i +"].AlarmSources"));
			alarmHistory.setAlarmContent(_ctx.stringValue("SearchAlertHistoriesResponse.PageBean.AlarmHistories["+ i +"].AlarmContent"));
			alarmHistory.setPhones(_ctx.stringValue("SearchAlertHistoriesResponse.PageBean.AlarmHistories["+ i +"].Phones"));
			alarmHistory.setAlarmType(_ctx.integerValue("SearchAlertHistoriesResponse.PageBean.AlarmHistories["+ i +"].AlarmType"));
			alarmHistory.setTarget(_ctx.stringValue("SearchAlertHistoriesResponse.PageBean.AlarmHistories["+ i +"].Target"));
			alarmHistory.setId(_ctx.longValue("SearchAlertHistoriesResponse.PageBean.AlarmHistories["+ i +"].Id"));

			alarmHistories.add(alarmHistory);
		}
		pageBean.setAlarmHistories(alarmHistories);
		searchAlertHistoriesResponse.setPageBean(pageBean);
	 
	 	return searchAlertHistoriesResponse;
	}
}