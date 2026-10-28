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

package com.aliyuncs.quotas.transform.v20200510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quotas.model.v20200510.ListQuotaAlarmsResponse;
import com.aliyuncs.quotas.model.v20200510.ListQuotaAlarmsResponse.QuotaAlarm;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQuotaAlarmsResponseUnmarshaller {

	public static ListQuotaAlarmsResponse unmarshall(ListQuotaAlarmsResponse listQuotaAlarmsResponse, UnmarshallerContext _ctx) {
		
		listQuotaAlarmsResponse.setRequestId(_ctx.stringValue("ListQuotaAlarmsResponse.RequestId"));
		listQuotaAlarmsResponse.setTotalCount(_ctx.integerValue("ListQuotaAlarmsResponse.TotalCount"));
		listQuotaAlarmsResponse.setNextToken(_ctx.stringValue("ListQuotaAlarmsResponse.NextToken"));
		listQuotaAlarmsResponse.setMaxResults(_ctx.integerValue("ListQuotaAlarmsResponse.MaxResults"));

		List<QuotaAlarm> quotaAlarms = new ArrayList<QuotaAlarm>();
		for (int i = 0; i < _ctx.lengthValue("ListQuotaAlarmsResponse.QuotaAlarms.Length"); i++) {
			QuotaAlarm quotaAlarm = new QuotaAlarm();
			quotaAlarm.setAlarmId(_ctx.stringValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].AlarmId"));
			quotaAlarm.setQuotaDimensions(_ctx.mapValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].QuotaDimensions"));
			quotaAlarm.setThresholdPercent(_ctx.floatValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].ThresholdPercent"));
			quotaAlarm.setProductCode(_ctx.stringValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].ProductCode"));
			quotaAlarm.setCreateTime(_ctx.stringValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].CreateTime"));
			quotaAlarm.setWebHook(_ctx.stringValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].WebHook"));
			quotaAlarm.setQuotaUsage(_ctx.floatValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].QuotaUsage"));
			quotaAlarm.setExceedThreshold(_ctx.booleanValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].ExceedThreshold"));
			quotaAlarm.setQuotaActionCode(_ctx.stringValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].QuotaActionCode"));
			quotaAlarm.setQuotaValue(_ctx.floatValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].QuotaValue"));
			quotaAlarm.setAlarmName(_ctx.stringValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].AlarmName"));
			quotaAlarm.setNotifyTarget(_ctx.stringValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].NotifyTarget"));
			quotaAlarm.setThreshold(_ctx.floatValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].Threshold"));
			quotaAlarm.setThresholdType(_ctx.stringValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].ThresholdType"));

			List<String> notifyChannels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].NotifyChannels.Length"); j++) {
				notifyChannels.add(_ctx.stringValue("ListQuotaAlarmsResponse.QuotaAlarms["+ i +"].NotifyChannels["+ j +"]"));
			}
			quotaAlarm.setNotifyChannels(notifyChannels);

			quotaAlarms.add(quotaAlarm);
		}
		listQuotaAlarmsResponse.setQuotaAlarms(quotaAlarms);
	 
	 	return listQuotaAlarmsResponse;
	}
}