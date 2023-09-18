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

import com.aliyuncs.quotas.model.v20200510.GetQuotaAlarmResponse;
import com.aliyuncs.quotas.model.v20200510.GetQuotaAlarmResponse.QuotaAlarm;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQuotaAlarmResponseUnmarshaller {

	public static GetQuotaAlarmResponse unmarshall(GetQuotaAlarmResponse getQuotaAlarmResponse, UnmarshallerContext _ctx) {
		
		getQuotaAlarmResponse.setRequestId(_ctx.stringValue("GetQuotaAlarmResponse.RequestId"));

		QuotaAlarm quotaAlarm = new QuotaAlarm();
		quotaAlarm.setThresholdPercent(_ctx.floatValue("GetQuotaAlarmResponse.QuotaAlarm.ThresholdPercent"));
		quotaAlarm.setThresholdType(_ctx.stringValue("GetQuotaAlarmResponse.QuotaAlarm.ThresholdType"));
		quotaAlarm.setQuotaDimension(_ctx.mapValue("GetQuotaAlarmResponse.QuotaAlarm.QuotaDimension"));
		quotaAlarm.setCreateTime(_ctx.stringValue("GetQuotaAlarmResponse.QuotaAlarm.CreateTime"));
		quotaAlarm.setQuotaActionCode(_ctx.stringValue("GetQuotaAlarmResponse.QuotaAlarm.QuotaActionCode"));
		quotaAlarm.setAlarmName(_ctx.stringValue("GetQuotaAlarmResponse.QuotaAlarm.AlarmName"));
		quotaAlarm.setNotifyTarget(_ctx.stringValue("GetQuotaAlarmResponse.QuotaAlarm.NotifyTarget"));
		quotaAlarm.setQuotaUsage(_ctx.floatValue("GetQuotaAlarmResponse.QuotaAlarm.QuotaUsage"));
		quotaAlarm.setQuotaValue(_ctx.floatValue("GetQuotaAlarmResponse.QuotaAlarm.QuotaValue"));
		quotaAlarm.setAlarmId(_ctx.stringValue("GetQuotaAlarmResponse.QuotaAlarm.AlarmId"));
		quotaAlarm.setThreshold(_ctx.floatValue("GetQuotaAlarmResponse.QuotaAlarm.Threshold"));
		quotaAlarm.setProductCode(_ctx.stringValue("GetQuotaAlarmResponse.QuotaAlarm.ProductCode"));
		quotaAlarm.setWebhook(_ctx.stringValue("GetQuotaAlarmResponse.QuotaAlarm.Webhook"));

		List<String> notifyChannels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQuotaAlarmResponse.QuotaAlarm.NotifyChannels.Length"); i++) {
			notifyChannels.add(_ctx.stringValue("GetQuotaAlarmResponse.QuotaAlarm.NotifyChannels["+ i +"]"));
		}
		quotaAlarm.setNotifyChannels(notifyChannels);
		getQuotaAlarmResponse.setQuotaAlarm(quotaAlarm);
	 
	 	return getQuotaAlarmResponse;
	}
}