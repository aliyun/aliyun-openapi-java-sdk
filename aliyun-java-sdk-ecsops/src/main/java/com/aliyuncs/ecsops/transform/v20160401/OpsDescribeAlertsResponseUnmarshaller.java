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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAlertsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeAlertsResponse.Alert;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeAlertsResponseUnmarshaller {

	public static OpsDescribeAlertsResponse unmarshall(OpsDescribeAlertsResponse opsDescribeAlertsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeAlertsResponse.setRequestId(_ctx.stringValue("OpsDescribeAlertsResponse.RequestId"));
		opsDescribeAlertsResponse.setTotalCount(_ctx.integerValue("OpsDescribeAlertsResponse.TotalCount"));
		opsDescribeAlertsResponse.setPageNumber(_ctx.integerValue("OpsDescribeAlertsResponse.PageNumber"));
		opsDescribeAlertsResponse.setPageSize(_ctx.integerValue("OpsDescribeAlertsResponse.PageSize"));

		List<Alert> alerts = new ArrayList<Alert>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeAlertsResponse.Alerts.Length"); i++) {
			Alert alert = new Alert();
			alert.setAlertId(_ctx.longValue("OpsDescribeAlertsResponse.Alerts["+ i +"].AlertId"));
			alert.setAlertItem(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].AlertItem"));
			alert.setAlertStatus(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].AlertStatus"));
			alert.setAlertSource(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].AlertSource"));
			alert.setAlertLevel(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].AlertLevel"));
			alert.setAlertTitle(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].AlertTitle"));
			alert.setBelongTeam(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].BelongTeam"));
			alert.setOwner(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].Owner"));
			alert.setAlertTime(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].AlertTime"));
			alert.setCreateTime(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].CreateTime"));
			alert.setModifyTime(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].ModifyTime"));
			alert.setAlertDetail(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].AlertDetail"));
			alert.setDiagnosisTemplate(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].DiagnosisTemplate"));
			alert.setDiagnosisResult(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].DiagnosisResult"));
			alert.setExtra(_ctx.stringValue("OpsDescribeAlertsResponse.Alerts["+ i +"].Extra"));

			alerts.add(alert);
		}
		opsDescribeAlertsResponse.setAlerts(alerts);
	 
	 	return opsDescribeAlertsResponse;
	}
}