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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmMetricResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmMetricResponse.ResponseItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmMetricResponse.ResponseItem.At;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmMetricResponse.ResponseItem.MasItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmMetricResponse.ResponseItem.MasItem.Am;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmMetricResponse.ResponseItem.MasItem.Am.BlackListsItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmMetricResponse.ResponseItem.MasItem.Am.WhiteListsItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmMetricResponse.ResponseItem.MasItem.TriggersItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmMetricResponse.ResponseItem.MasItem.TriggersItem.Downsample;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmMetricResponse.ResponseItem.Status;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmMetricResponse.ResponseItem.SubersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAlarmMetricResponseUnmarshaller {

	public static QueryRmsAlarmMetricResponse unmarshall(QueryRmsAlarmMetricResponse queryRmsAlarmMetricResponse, UnmarshallerContext _ctx) {
		
		queryRmsAlarmMetricResponse.setRequestId(_ctx.stringValue("QueryRmsAlarmMetricResponse.RequestId"));
		queryRmsAlarmMetricResponse.setResultCode(_ctx.stringValue("QueryRmsAlarmMetricResponse.ResultCode"));
		queryRmsAlarmMetricResponse.setResultMessage(_ctx.stringValue("QueryRmsAlarmMetricResponse.ResultMessage"));

		List<ResponseItem> response = new ArrayList<ResponseItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAlarmMetricResponse.Response.Length"); i++) {
			ResponseItem responseItem = new ResponseItem();
			responseItem.setAlertLevel(_ctx.longValue("QueryRmsAlarmMetricResponse.Response["+ i +"].AlertLevel"));
			responseItem.setHasOne(_ctx.booleanValue("QueryRmsAlarmMetricResponse.Response["+ i +"].HasOne"));
			responseItem.setId(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Id"));
			responseItem.setMagName(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].MagName"));
			responseItem.setOpen(_ctx.booleanValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Open"));

			At at = new At();
			at.setCheckMinute(_ctx.longValue("QueryRmsAlarmMetricResponse.Response["+ i +"].At.CheckMinute"));
			at.setEndTime(_ctx.longValue("QueryRmsAlarmMetricResponse.Response["+ i +"].At.EndTime"));
			at.setPauseEndTime(_ctx.longValue("QueryRmsAlarmMetricResponse.Response["+ i +"].At.PauseEndTime"));
			at.setPauseStartTime(_ctx.longValue("QueryRmsAlarmMetricResponse.Response["+ i +"].At.PauseStartTime"));
			at.setSilentPeriod(_ctx.longValue("QueryRmsAlarmMetricResponse.Response["+ i +"].At.SilentPeriod"));
			at.setStartTime(_ctx.longValue("QueryRmsAlarmMetricResponse.Response["+ i +"].At.StartTime"));
			responseItem.setAt(at);

			Status status = new Status();
			status.setLastCheckResult(_ctx.booleanValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Status.LastCheckResult"));
			status.setLastCheckSuccess(_ctx.booleanValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Status.LastCheckSuccess"));
			status.setLastCheckTime(_ctx.longValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Status.LastCheckTime"));
			status.setLastNotifyTime(_ctx.longValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Status.LastNotifyTime"));
			responseItem.setStatus(status);

			List<MasItem> mas = new ArrayList<MasItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas.Length"); j++) {
				MasItem masItem = new MasItem();
				masItem.setHasOne(_ctx.booleanValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].HasOne"));
				masItem.setId(_ctx.longValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Id"));
				masItem.setMaName(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].MaName"));

				Am am = new Am();
				am.setMetricName(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Am.MetricName"));

				List<BlackListsItem> blackLists = new ArrayList<BlackListsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Am.BlackLists.Length"); k++) {
					BlackListsItem blackListsItem = new BlackListsItem();
					blackListsItem.setKey(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Am.BlackLists["+ k +"].Key"));

					List<String> values = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Am.BlackLists["+ k +"].Values.Length"); l++) {
						values.add(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Am.BlackLists["+ k +"].Values["+ l +"]"));
					}
					blackListsItem.setValues(values);

					blackLists.add(blackListsItem);
				}
				am.setBlackLists(blackLists);

				List<WhiteListsItem> whiteLists = new ArrayList<WhiteListsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Am.WhiteLists.Length"); k++) {
					WhiteListsItem whiteListsItem = new WhiteListsItem();
					whiteListsItem.setKey(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Am.WhiteLists["+ k +"].Key"));

					List<String> values1 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Am.WhiteLists["+ k +"].Values.Length"); l++) {
						values1.add(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Am.WhiteLists["+ k +"].Values["+ l +"]"));
					}
					whiteListsItem.setValues1(values1);

					whiteLists.add(whiteListsItem);
				}
				am.setWhiteLists(whiteLists);
				masItem.setAm(am);

				List<TriggersItem> triggers = new ArrayList<TriggersItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Triggers.Length"); k++) {
					TriggersItem triggersItem = new TriggersItem();
					triggersItem.setAggregator(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Triggers["+ k +"].Aggregator"));
					triggersItem.setId(_ctx.longValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Triggers["+ k +"].Id"));
					triggersItem.setN(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Triggers["+ k +"].N"));
					triggersItem.setThreshold(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Triggers["+ k +"].Threshold"));
					triggersItem.setTriggerOperator(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Triggers["+ k +"].TriggerOperator"));
					triggersItem.setTriggerType(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Triggers["+ k +"].TriggerType"));

					Downsample downsample = new Downsample();
					downsample.setAggregator(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Triggers["+ k +"].Downsample.Aggregator"));
					downsample.setInterval(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Triggers["+ k +"].Downsample.Interval"));
					downsample.setUnits(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Mas["+ j +"].Triggers["+ k +"].Downsample.Units"));
					triggersItem.setDownsample(downsample);

					triggers.add(triggersItem);
				}
				masItem.setTriggers(triggers);

				mas.add(masItem);
			}
			responseItem.setMas(mas);

			List<SubersItem> subers = new ArrayList<SubersItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Subers.Length"); j++) {
				SubersItem subersItem = new SubersItem();
				subersItem.setSuberId(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Subers["+ j +"].SuberId"));
				subersItem.setSuberType(_ctx.stringValue("QueryRmsAlarmMetricResponse.Response["+ i +"].Subers["+ j +"].SuberType"));

				subers.add(subersItem);
			}
			responseItem.setSubers(subers);

			response.add(responseItem);
		}
		queryRmsAlarmMetricResponse.setResponse(response);
	 
	 	return queryRmsAlarmMetricResponse;
	}
}