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

package com.aliyuncs.idaas_doraemon.transform.v20210520;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idaas_doraemon.model.v20210520.QuerySmsReportsResponse;
import com.aliyuncs.idaas_doraemon.model.v20210520.QuerySmsReportsResponse.SmsReportsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySmsReportsResponseUnmarshaller {

	public static QuerySmsReportsResponse unmarshall(QuerySmsReportsResponse querySmsReportsResponse, UnmarshallerContext _ctx) {
		
		querySmsReportsResponse.setRequestId(_ctx.stringValue("QuerySmsReportsResponse.RequestId"));
		querySmsReportsResponse.setTotalElements(_ctx.longValue("QuerySmsReportsResponse.TotalElements"));

		List<SmsReportsItem> smsReports = new ArrayList<SmsReportsItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySmsReportsResponse.SmsReports.Length"); i++) {
			SmsReportsItem smsReportsItem = new SmsReportsItem();
			smsReportsItem.setTid(_ctx.stringValue("QuerySmsReportsResponse.SmsReports["+ i +"].Tid"));
			smsReportsItem.setMobile(_ctx.stringValue("QuerySmsReportsResponse.SmsReports["+ i +"].Mobile"));
			smsReportsItem.setCode(_ctx.stringValue("QuerySmsReportsResponse.SmsReports["+ i +"].Code"));
			smsReportsItem.setStat(_ctx.stringValue("QuerySmsReportsResponse.SmsReports["+ i +"].Stat"));
			smsReportsItem.setSn(_ctx.stringValue("QuerySmsReportsResponse.SmsReports["+ i +"].Sn"));
			smsReportsItem.setTenantId(_ctx.stringValue("QuerySmsReportsResponse.SmsReports["+ i +"].TenantId"));
			smsReportsItem.setAppId(_ctx.stringValue("QuerySmsReportsResponse.SmsReports["+ i +"].AppId"));
			smsReportsItem.setEventId(_ctx.stringValue("QuerySmsReportsResponse.SmsReports["+ i +"].EventId"));
			smsReportsItem.setTime(_ctx.stringValue("QuerySmsReportsResponse.SmsReports["+ i +"].Time"));
			smsReportsItem.setChargedCount(_ctx.integerValue("QuerySmsReportsResponse.SmsReports["+ i +"].ChargedCount"));

			smsReports.add(smsReportsItem);
		}
		querySmsReportsResponse.setSmsReports(smsReports);
	 
	 	return querySmsReportsResponse;
	}
}