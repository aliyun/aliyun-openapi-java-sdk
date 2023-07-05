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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.GetUserReportSubscriptionInfoResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetUserReportSubscriptionInfoResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.GetUserReportSubscriptionInfoResponse.Data.EmailsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserReportSubscriptionInfoResponseUnmarshaller {

	public static GetUserReportSubscriptionInfoResponse unmarshall(GetUserReportSubscriptionInfoResponse getUserReportSubscriptionInfoResponse, UnmarshallerContext _ctx) {
		
		getUserReportSubscriptionInfoResponse.setRequestId(_ctx.stringValue("GetUserReportSubscriptionInfoResponse.RequestId"));
		getUserReportSubscriptionInfoResponse.setSuccess(_ctx.booleanValue("GetUserReportSubscriptionInfoResponse.Success"));

		Data data = new Data();
		data.setReportSubscribe(_ctx.booleanValue("GetUserReportSubscriptionInfoResponse.Data.ReportSubscribe"));
		data.setTimeZone(_ctx.stringValue("GetUserReportSubscriptionInfoResponse.Data.TimeZone"));
		data.setDailySendTime(_ctx.stringValue("GetUserReportSubscriptionInfoResponse.Data.DailySendTime"));
		data.setWeeklySubscribe(_ctx.booleanValue("GetUserReportSubscriptionInfoResponse.Data.WeeklySubscribe"));
		data.setWeeklySendTime(_ctx.stringValue("GetUserReportSubscriptionInfoResponse.Data.WeeklySendTime"));
		data.setReportSendTime(_ctx.stringValue("GetUserReportSubscriptionInfoResponse.Data.ReportSendTime"));
		data.setDailySubscribe(_ctx.booleanValue("GetUserReportSubscriptionInfoResponse.Data.DailySubscribe"));
		data.setWeeklySendFrequency(_ctx.stringValue("GetUserReportSubscriptionInfoResponse.Data.WeeklySendFrequency"));
		data.setReportSendFrequency(_ctx.stringValue("GetUserReportSubscriptionInfoResponse.Data.ReportSendFrequency"));
		data.setLanguage(_ctx.stringValue("GetUserReportSubscriptionInfoResponse.Data.Language"));

		List<EmailsItem> emails = new ArrayList<EmailsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetUserReportSubscriptionInfoResponse.Data.Emails.Length"); i++) {
			EmailsItem emailsItem = new EmailsItem();
			emailsItem.set_Default(_ctx.booleanValue("GetUserReportSubscriptionInfoResponse.Data.Emails["+ i +"].Default"));
			emailsItem.setEmail(_ctx.stringValue("GetUserReportSubscriptionInfoResponse.Data.Emails["+ i +"].Email"));
			emailsItem.setSubscribe(_ctx.booleanValue("GetUserReportSubscriptionInfoResponse.Data.Emails["+ i +"].Subscribe"));

			emails.add(emailsItem);
		}
		data.setEmails(emails);
		getUserReportSubscriptionInfoResponse.setData(data);
	 
	 	return getUserReportSubscriptionInfoResponse;
	}
}