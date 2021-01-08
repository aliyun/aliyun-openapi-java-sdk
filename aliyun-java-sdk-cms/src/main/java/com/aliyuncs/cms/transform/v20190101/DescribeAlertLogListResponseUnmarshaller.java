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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm.DimensionsItem;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm.Escalation;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogListResponse.Alarm.ExtInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertLogListResponseUnmarshaller {

	public static DescribeAlertLogListResponse unmarshall(DescribeAlertLogListResponse describeAlertLogListResponse, UnmarshallerContext _ctx) {
		
		describeAlertLogListResponse.setRequestId(_ctx.stringValue("DescribeAlertLogListResponse.RequestId"));
		describeAlertLogListResponse.setCode(_ctx.stringValue("DescribeAlertLogListResponse.Code"));
		describeAlertLogListResponse.setMessage(_ctx.stringValue("DescribeAlertLogListResponse.Message"));
		describeAlertLogListResponse.setSuccess(_ctx.booleanValue("DescribeAlertLogListResponse.Success"));
		describeAlertLogListResponse.setTotal(_ctx.integerValue("DescribeAlertLogListResponse.Total"));
		describeAlertLogListResponse.setPageSize(_ctx.integerValue("DescribeAlertLogListResponse.PageSize"));
		describeAlertLogListResponse.setPageNumber(_ctx.integerValue("DescribeAlertLogListResponse.PageNumber"));

		List<Alarm> alertLogList = new ArrayList<Alarm>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList.Length"); i++) {
			Alarm alarm = new Alarm();
			alarm.setRuleId(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].RuleId"));
			alarm.setRuleName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].RuleName"));
			alarm.setNamespace(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Namespace"));
			alarm.setProduct(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Product"));
			alarm.setEventName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].EventName"));
			alarm.setGroupId(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].GroupId"));
			alarm.setGroupName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].GroupName"));
			alarm.setMetricName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].MetricName"));
			alarm.setInstanceId(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].InstanceId"));
			alarm.setInstanceName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].InstanceName"));
			alarm.setLevel(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Level"));
			alarm.setLevelChange(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].LevelChange"));
			alarm.setSendStatus(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].SendStatus"));
			alarm.setAlertTime(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].AlertTime"));
			alarm.setMessage(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Message"));

			List<String> contactGroups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactGroups.Length"); j++) {
				contactGroups.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactGroups["+ j +"]"));
			}
			alarm.setContactGroups(contactGroups);

			List<String> webhookList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].WebhookList.Length"); j++) {
				webhookList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].WebhookList["+ j +"]"));
			}
			alarm.setWebhookList(webhookList);

			List<String> contactALIIWWList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactALIIWWList.Length"); j++) {
				contactALIIWWList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactALIIWWList["+ j +"]"));
			}
			alarm.setContactALIIWWList(contactALIIWWList);

			List<String> contactSMSList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactSMSList.Length"); j++) {
				contactSMSList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactSMSList["+ j +"]"));
			}
			alarm.setContactSMSList(contactSMSList);

			List<String> contactOnCallList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactOnCallList.Length"); j++) {
				contactOnCallList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactOnCallList["+ j +"]"));
			}
			alarm.setContactOnCallList(contactOnCallList);

			List<String> contactMailList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactMailList.Length"); j++) {
				contactMailList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactMailList["+ j +"]"));
			}
			alarm.setContactMailList(contactMailList);

			List<String> contactDingList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactDingList.Length"); j++) {
				contactDingList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ContactDingList["+ j +"]"));
			}
			alarm.setContactDingList(contactDingList);

			List<String> dingdingWebhookList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].DingdingWebhookList.Length"); j++) {
				dingdingWebhookList.add(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].DingdingWebhookList["+ j +"]"));
			}
			alarm.setDingdingWebhookList(dingdingWebhookList);

			Escalation escalation = new Escalation();
			escalation.setTimes(_ctx.integerValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Escalation.Times"));
			escalation.setExpression(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Escalation.Expression"));
			escalation.setLevel(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Escalation.Level"));
			alarm.setEscalation(escalation);

			List<ExtInfo> extendedInfo = new ArrayList<ExtInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ExtendedInfo.Length"); j++) {
				ExtInfo extInfo = new ExtInfo();
				extInfo.setName(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ExtendedInfo["+ j +"].Name"));
				extInfo.setValue(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].ExtendedInfo["+ j +"].Value"));

				extendedInfo.add(extInfo);
			}
			alarm.setExtendedInfo(extendedInfo);

			List<DimensionsItem> dimensions = new ArrayList<DimensionsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Dimensions.Length"); j++) {
				DimensionsItem dimensionsItem = new DimensionsItem();
				dimensionsItem.setKey(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Dimensions["+ j +"].Key"));
				dimensionsItem.setValue(_ctx.stringValue("DescribeAlertLogListResponse.AlertLogList["+ i +"].Dimensions["+ j +"].Value"));

				dimensions.add(dimensionsItem);
			}
			alarm.setDimensions(dimensions);

			alertLogList.add(alarm);
		}
		describeAlertLogListResponse.setAlertLogList(alertLogList);
	 
	 	return describeAlertLogListResponse;
	}
}