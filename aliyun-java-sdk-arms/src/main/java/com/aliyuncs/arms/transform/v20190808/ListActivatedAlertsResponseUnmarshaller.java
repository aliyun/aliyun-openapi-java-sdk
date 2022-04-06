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

import com.aliyuncs.arms.model.v20190808.ListActivatedAlertsResponse;
import com.aliyuncs.arms.model.v20190808.ListActivatedAlertsResponse.Page;
import com.aliyuncs.arms.model.v20190808.ListActivatedAlertsResponse.Page.Alert;
import com.aliyuncs.arms.model.v20190808.ListActivatedAlertsResponse.Page.Alert.DispatchRule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListActivatedAlertsResponseUnmarshaller {

	public static ListActivatedAlertsResponse unmarshall(ListActivatedAlertsResponse listActivatedAlertsResponse, UnmarshallerContext _ctx) {
		
		listActivatedAlertsResponse.setRequestId(_ctx.stringValue("ListActivatedAlertsResponse.RequestId"));

		Page page = new Page();
		page.setPageSize(_ctx.integerValue("ListActivatedAlertsResponse.Page.PageSize"));
		page.setTotal(_ctx.integerValue("ListActivatedAlertsResponse.Page.Total"));
		page.setPage(_ctx.integerValue("ListActivatedAlertsResponse.Page.Page"));

		List<Alert> alerts = new ArrayList<Alert>();
		for (int i = 0; i < _ctx.lengthValue("ListActivatedAlertsResponse.Page.Alerts.Length"); i++) {
			Alert alert = new Alert();
			alert.setStatus(_ctx.stringValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].Status"));
			alert.setSeverity(_ctx.stringValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].Severity"));
			alert.setIntegrationName(_ctx.stringValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].IntegrationName"));
			alert.setCreateTime(_ctx.longValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].CreateTime"));
			alert.setMessage(_ctx.stringValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].Message"));
			alert.setAlertType(_ctx.stringValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].AlertType"));
			alert.setInvolvedObjectName(_ctx.stringValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].InvolvedObjectName"));
			alert.setAlertName(_ctx.stringValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].AlertName"));
			alert.setCount(_ctx.integerValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].Count"));
			alert.setExpandFields(_ctx.mapValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].ExpandFields"));
			alert.setEndsAt(_ctx.longValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].EndsAt"));
			alert.setInvolvedObjectKind(_ctx.stringValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].InvolvedObjectKind"));
			alert.setIntegrationType(_ctx.stringValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].IntegrationType"));
			alert.setStartsAt(_ctx.longValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].StartsAt"));
			alert.setAlertId(_ctx.stringValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].AlertId"));

			List<DispatchRule> dispatchRules = new ArrayList<DispatchRule>();
			for (int j = 0; j < _ctx.lengthValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].DispatchRules.Length"); j++) {
				DispatchRule dispatchRule = new DispatchRule();
				dispatchRule.setRuleId(_ctx.integerValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].DispatchRules["+ j +"].RuleId"));
				dispatchRule.setRuleName(_ctx.stringValue("ListActivatedAlertsResponse.Page.Alerts["+ i +"].DispatchRules["+ j +"].RuleName"));

				dispatchRules.add(dispatchRule);
			}
			alert.setDispatchRules(dispatchRules);

			alerts.add(alert);
		}
		page.setAlerts(alerts);
		listActivatedAlertsResponse.setPage(page);
	 
	 	return listActivatedAlertsResponse;
	}
}