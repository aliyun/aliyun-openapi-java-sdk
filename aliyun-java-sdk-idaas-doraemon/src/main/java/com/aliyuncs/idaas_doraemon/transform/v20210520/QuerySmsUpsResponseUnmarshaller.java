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

import com.aliyuncs.idaas_doraemon.model.v20210520.QuerySmsUpsResponse;
import com.aliyuncs.idaas_doraemon.model.v20210520.QuerySmsUpsResponse.SmsUpsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySmsUpsResponseUnmarshaller {

	public static QuerySmsUpsResponse unmarshall(QuerySmsUpsResponse querySmsUpsResponse, UnmarshallerContext _ctx) {
		
		querySmsUpsResponse.setRequestId(_ctx.stringValue("QuerySmsUpsResponse.RequestId"));
		querySmsUpsResponse.setTotalElements(_ctx.longValue("QuerySmsUpsResponse.TotalElements"));

		List<SmsUpsItem> smsUps = new ArrayList<SmsUpsItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySmsUpsResponse.SmsUps.Length"); i++) {
			SmsUpsItem smsUpsItem = new SmsUpsItem();
			smsUpsItem.setPhoneNumber(_ctx.stringValue("QuerySmsUpsResponse.SmsUps["+ i +"].PhoneNumber"));
			smsUpsItem.setContent(_ctx.stringValue("QuerySmsUpsResponse.SmsUps["+ i +"].Content"));
			smsUpsItem.setDestCode(_ctx.stringValue("QuerySmsUpsResponse.SmsUps["+ i +"].DestCode"));
			smsUpsItem.setSequenceId(_ctx.stringValue("QuerySmsUpsResponse.SmsUps["+ i +"].SequenceId"));
			smsUpsItem.setTenantId(_ctx.stringValue("QuerySmsUpsResponse.SmsUps["+ i +"].TenantId"));
			smsUpsItem.setSendTime(_ctx.stringValue("QuerySmsUpsResponse.SmsUps["+ i +"].SendTime"));

			smsUps.add(smsUpsItem);
		}
		querySmsUpsResponse.setSmsUps(smsUps);
	 
	 	return querySmsUpsResponse;
	}
}