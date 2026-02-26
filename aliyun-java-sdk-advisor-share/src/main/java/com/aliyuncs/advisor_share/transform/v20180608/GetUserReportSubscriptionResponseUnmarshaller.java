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

import com.aliyuncs.advisor_share.model.v20180608.GetUserReportSubscriptionResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetUserReportSubscriptionResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.GetUserReportSubscriptionResponse.Data.EmailsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserReportSubscriptionResponseUnmarshaller {

	public static GetUserReportSubscriptionResponse unmarshall(GetUserReportSubscriptionResponse getUserReportSubscriptionResponse, UnmarshallerContext _ctx) {
		
		getUserReportSubscriptionResponse.setRequestId(_ctx.stringValue("GetUserReportSubscriptionResponse.RequestId"));
		getUserReportSubscriptionResponse.setSuccess(_ctx.booleanValue("GetUserReportSubscriptionResponse.Success"));

		Data data = new Data();
		data.setTimeZone(_ctx.stringValue("GetUserReportSubscriptionResponse.Data.TimeZone"));
		data.setMobile(_ctx.stringValue("GetUserReportSubscriptionResponse.Data.Mobile"));
		data.setSendEmailFrequency(_ctx.stringValue("GetUserReportSubscriptionResponse.Data.SendEmailFrequency"));
		data.setLanguage(_ctx.stringValue("GetUserReportSubscriptionResponse.Data.Language"));
		data.setSubscribe(_ctx.booleanValue("GetUserReportSubscriptionResponse.Data.Subscribe"));

		List<EmailsItem> emails = new ArrayList<EmailsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetUserReportSubscriptionResponse.Data.Emails.Length"); i++) {
			EmailsItem emailsItem = new EmailsItem();
			emailsItem.set_Default(_ctx.booleanValue("GetUserReportSubscriptionResponse.Data.Emails["+ i +"].Default"));
			emailsItem.setEmail(_ctx.stringValue("GetUserReportSubscriptionResponse.Data.Emails["+ i +"].Email"));
			emailsItem.setSubscribe(_ctx.booleanValue("GetUserReportSubscriptionResponse.Data.Emails["+ i +"].Subscribe"));

			emails.add(emailsItem);
		}
		data.setEmails(emails);
		getUserReportSubscriptionResponse.setData(data);
	 
	 	return getUserReportSubscriptionResponse;
	}
}