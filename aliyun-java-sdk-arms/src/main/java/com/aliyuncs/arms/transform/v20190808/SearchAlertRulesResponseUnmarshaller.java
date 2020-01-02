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

import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRule;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRule.AlarmContext;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRule.AlertRule1;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRule.AlertRule1.Rule;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRule.MetricParam;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRule.MetricParam.Dimension;
import com.aliyuncs.arms.model.v20190808.SearchAlertRulesResponse.PageBean.AlertRule.Notice;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchAlertRulesResponseUnmarshaller {

	public static SearchAlertRulesResponse unmarshall(SearchAlertRulesResponse searchAlertRulesResponse, UnmarshallerContext _ctx) {
		
		searchAlertRulesResponse.setRequestId(_ctx.stringValue("SearchAlertRulesResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotalCount(_ctx.integerValue("SearchAlertRulesResponse.PageBean.TotalCount"));
		pageBean.setPageNumber(_ctx.integerValue("SearchAlertRulesResponse.PageBean.PageNumber"));
		pageBean.setPageSize(_ctx.integerValue("SearchAlertRulesResponse.PageBean.PageSize"));

		List<AlertRule> alertRules = new ArrayList<AlertRule>();
		for (int i = 0; i < _ctx.lengthValue("SearchAlertRulesResponse.PageBean.AlertRules.Length"); i++) {
			AlertRule alertRule = new AlertRule();
			alertRule.setAlertTitle(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertTitle"));
			alertRule.setAlertLevel(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertLevel"));
			alertRule.setAlertType(_ctx.integerValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertType"));
			alertRule.setAlertVersion(_ctx.integerValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertVersion"));
			alertRule.setConfig(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Config"));
			alertRule.setContactGroupIdList(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].ContactGroupIdList"));
			alertRule.setCreateTime(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].CreateTime"));
			alertRule.setId(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Id"));
			alertRule.setRegionId(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].RegionId"));
			alertRule.setStatus(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Status"));
			alertRule.setTaskId(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].TaskId"));
			alertRule.setTaskStatus(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].TaskStatus"));
			alertRule.setUpdateTime(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].UpdateTime"));
			alertRule.setUserId(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].UserId"));

			List<String> alertWays = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertWays.Length"); j++) {
				alertWays.add(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertWays["+ j +"]"));
			}
			alertRule.setAlertWays(alertWays);

			AlarmContext alarmContext = new AlarmContext();
			alarmContext.setAlarmContentTemplate(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlarmContext.AlarmContentTemplate"));
			alarmContext.setAlarmContentSubTitle(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlarmContext.AlarmContentSubTitle"));
			alertRule.setAlarmContext(alarmContext);

			AlertRule1 alertRule1 = new AlertRule1();
			alertRule1.setOperator(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Operator"));

			List<Rule> rules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules.Length"); j++) {
				Rule rule = new Rule();
				rule.setAggregates(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules["+ j +"].Aggregates"));
				rule.setAlias(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules["+ j +"].Alias"));
				rule.setMeasure(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules["+ j +"].Measure"));
				rule.setNValue(_ctx.integerValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules["+ j +"].NValue"));
				rule.setOperator(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules["+ j +"].Operator"));
				rule.setValue(_ctx.floatValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].AlertRule.Rules["+ j +"].Value"));

				rules.add(rule);
			}
			alertRule1.setRules(rules);
			alertRule.setAlertRule1(alertRule1);

			MetricParam metricParam = new MetricParam();
			metricParam.setAppGroupId(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.AppGroupId"));
			metricParam.setAppId(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.AppId"));
			metricParam.setPid(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.Pid"));
			metricParam.setType(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.Type"));

			List<Dimension> dimensions = new ArrayList<Dimension>();
			for (int j = 0; j < _ctx.lengthValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.Dimensions.Length"); j++) {
				Dimension dimension = new Dimension();
				dimension.setKey(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.Dimensions["+ j +"].Key"));
				dimension.setType(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.Dimensions["+ j +"].Type"));
				dimension.setValue(_ctx.stringValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].MetricParam.Dimensions["+ j +"].Value"));

				dimensions.add(dimension);
			}
			metricParam.setDimensions(dimensions);
			alertRule.setMetricParam(metricParam);

			Notice notice = new Notice();
			notice.setEndTime(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Notice.EndTime"));
			notice.setNoticeEndTime(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Notice.NoticeEndTime"));
			notice.setNoticeStartTime(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Notice.NoticeStartTime"));
			notice.setStartTime(_ctx.longValue("SearchAlertRulesResponse.PageBean.AlertRules["+ i +"].Notice.StartTime"));
			alertRule.setNotice(notice);

			alertRules.add(alertRule);
		}
		pageBean.setAlertRules(alertRules);
		searchAlertRulesResponse.setPageBean(pageBean);
	 
	 	return searchAlertRulesResponse;
	}
}