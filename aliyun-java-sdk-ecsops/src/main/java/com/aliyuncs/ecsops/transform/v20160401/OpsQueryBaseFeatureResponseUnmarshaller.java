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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryBaseFeatureResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryBaseFeatureResponse.BaseFeature;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryBaseFeatureResponse.BaseFeature.LinkedMonitor;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryBaseFeatureResponseUnmarshaller {

	public static OpsQueryBaseFeatureResponse unmarshall(OpsQueryBaseFeatureResponse opsQueryBaseFeatureResponse, UnmarshallerContext _ctx) {
		
		opsQueryBaseFeatureResponse.setRequestId(_ctx.stringValue("OpsQueryBaseFeatureResponse.RequestId"));

		List<BaseFeature> baseFeatures = new ArrayList<BaseFeature>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryBaseFeatureResponse.BaseFeatures.Length"); i++) {
			BaseFeature baseFeature = new BaseFeature();
			baseFeature.setType(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].Type"));
			baseFeature.setValidTimeRange(_ctx.integerValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].ValidTimeRange"));
			baseFeature.setFeatureType(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].FeatureType"));
			baseFeature.setExecOpsRuleNow(_ctx.booleanValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].ExecOpsRuleNow"));
			baseFeature.setDesc(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].Desc"));
			baseFeature.setExceptionTarget(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].ExceptionTarget"));
			baseFeature.setName(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].Name"));
			baseFeature.setReason(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].Reason"));

			List<String> restrictions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].Restrictions.Length"); j++) {
				restrictions.add(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].Restrictions["+ j +"]"));
			}
			baseFeature.setRestrictions(restrictions);

			List<String> conditions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].Conditions.Length"); j++) {
				conditions.add(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].Conditions["+ j +"]"));
			}
			baseFeature.setConditions(conditions);

			List<String> supportTeams = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].SupportTeams.Length"); j++) {
				supportTeams.add(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].SupportTeams["+ j +"]"));
			}
			baseFeature.setSupportTeams(supportTeams);

			List<LinkedMonitor> linkedMonitors = new ArrayList<LinkedMonitor>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].LinkedMonitors.Length"); j++) {
				LinkedMonitor linkedMonitor = new LinkedMonitor();
				linkedMonitor.setSlsConfigName(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].LinkedMonitors["+ j +"].SlsConfigName"));
				linkedMonitor.setInterval(_ctx.integerValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].LinkedMonitors["+ j +"].Interval"));
				linkedMonitor.setTimeRange(_ctx.integerValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].LinkedMonitors["+ j +"].TimeRange"));
				linkedMonitor.setLogstore(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].LinkedMonitors["+ j +"].Logstore"));
				linkedMonitor.setMonitorName(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].LinkedMonitors["+ j +"].MonitorName"));
				linkedMonitor.setDefaultProject(_ctx.stringValue("OpsQueryBaseFeatureResponse.BaseFeatures["+ i +"].LinkedMonitors["+ j +"].DefaultProject"));

				linkedMonitors.add(linkedMonitor);
			}
			baseFeature.setLinkedMonitors(linkedMonitors);

			baseFeatures.add(baseFeature);
		}
		opsQueryBaseFeatureResponse.setBaseFeatures(baseFeatures);
	 
	 	return opsQueryBaseFeatureResponse;
	}
}