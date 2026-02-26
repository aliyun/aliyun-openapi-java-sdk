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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncTaskResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncTaskResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncTaskResponse.Data.AlarmListItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncTaskResponse.Data.AlarmListItem.AlarmRuleListItem;
import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncTaskResponse.Data.AlarmListItem.NotifyRule;
import com.aliyuncs.dataworks_public.model.v20200518.GetDISyncTaskResponse.Data.SolutionDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDISyncTaskResponseUnmarshaller {

	public static GetDISyncTaskResponse unmarshall(GetDISyncTaskResponse getDISyncTaskResponse, UnmarshallerContext _ctx) {
		
		getDISyncTaskResponse.setRequestId(_ctx.stringValue("GetDISyncTaskResponse.RequestId"));
		getDISyncTaskResponse.setSuccess(_ctx.booleanValue("GetDISyncTaskResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.stringValue("GetDISyncTaskResponse.Data.Code"));
		data.setStatus(_ctx.stringValue("GetDISyncTaskResponse.Data.Status"));
		data.setMessage(_ctx.stringValue("GetDISyncTaskResponse.Data.Message"));

		SolutionDetail solutionDetail = new SolutionDetail();
		solutionDetail.setStatus(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.Status"));
		solutionDetail.setType(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.Type"));
		solutionDetail.setStartTime(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.StartTime"));
		solutionDetail.setCreatorName(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.CreatorName"));
		solutionDetail.setProjectId(_ctx.longValue("GetDISyncTaskResponse.Data.SolutionDetail.ProjectId"));
		solutionDetail.setSourceType(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.SourceType"));
		solutionDetail.setProcessContent(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.ProcessContent"));
		solutionDetail.setName(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.Name"));
		solutionDetail.setProcessExtra(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.ProcessExtra"));
		solutionDetail.setSubmitTime(_ctx.stringValue("GetDISyncTaskResponse.Data.SolutionDetail.SubmitTime"));
		solutionDetail.setId(_ctx.longValue("GetDISyncTaskResponse.Data.SolutionDetail.Id"));
		data.setSolutionDetail(solutionDetail);

		List<AlarmListItem> alarmList = new ArrayList<AlarmListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDISyncTaskResponse.Data.AlarmList.Length"); i++) {
			AlarmListItem alarmListItem = new AlarmListItem();
			alarmListItem.setId(_ctx.longValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].Id"));
			alarmListItem.setEnabled(_ctx.booleanValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].Enabled"));
			alarmListItem.setRuleName(_ctx.stringValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].RuleName"));
			alarmListItem.setMetric(_ctx.stringValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].Metric"));
			alarmListItem.setDescription(_ctx.stringValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].Description"));

			NotifyRule notifyRule = new NotifyRule();
			notifyRule.setInterval(_ctx.longValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].NotifyRule.Interval"));

			List<String> warning = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].NotifyRule.Warning.Length"); j++) {
				warning.add(_ctx.stringValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].NotifyRule.Warning["+ j +"]"));
			}
			notifyRule.setWarning(warning);

			List<String> critical = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].NotifyRule.Critical.Length"); j++) {
				critical.add(_ctx.stringValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].NotifyRule.Critical["+ j +"]"));
			}
			notifyRule.setCritical(critical);
			alarmListItem.setNotifyRule(notifyRule);

			List<AlarmRuleListItem> alarmRuleList = new ArrayList<AlarmRuleListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].AlarmRuleList.Length"); j++) {
				AlarmRuleListItem alarmRuleListItem = new AlarmRuleListItem();
				alarmRuleListItem.setLevel(_ctx.stringValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].AlarmRuleList["+ j +"].Level"));
				alarmRuleListItem.setComparator(_ctx.stringValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].AlarmRuleList["+ j +"].Comparator"));
				alarmRuleListItem.setThreshold(_ctx.longValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].AlarmRuleList["+ j +"].Threshold"));
				alarmRuleListItem.setDuration(_ctx.longValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].AlarmRuleList["+ j +"].Duration"));
				alarmRuleListItem.setAggregator(_ctx.stringValue("GetDISyncTaskResponse.Data.AlarmList["+ i +"].AlarmRuleList["+ j +"].Aggregator"));

				alarmRuleList.add(alarmRuleListItem);
			}
			alarmListItem.setAlarmRuleList(alarmRuleList);

			alarmList.add(alarmListItem);
		}
		data.setAlarmList(alarmList);
		getDISyncTaskResponse.setData(data);
	 
	 	return getDISyncTaskResponse;
	}
}