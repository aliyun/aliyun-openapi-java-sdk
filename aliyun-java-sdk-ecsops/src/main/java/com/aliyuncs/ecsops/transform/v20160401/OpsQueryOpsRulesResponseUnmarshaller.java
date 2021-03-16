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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryOpsRulesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryOpsRulesResponse.OpsRuleConfig;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryOpsRulesResponse.OpsRuleConfig.LinkedFeature;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryOpsRulesResponse.OpsRuleConfig.LinkedMonitor;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryOpsRulesResponseUnmarshaller {

	public static OpsQueryOpsRulesResponse unmarshall(OpsQueryOpsRulesResponse opsQueryOpsRulesResponse, UnmarshallerContext _ctx) {
		
		opsQueryOpsRulesResponse.setRequestId(_ctx.stringValue("OpsQueryOpsRulesResponse.RequestId"));

		List<OpsRuleConfig> opsRuleConfigs = new ArrayList<OpsRuleConfig>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryOpsRulesResponse.OpsRuleConfigs.Length"); i++) {
			OpsRuleConfig opsRuleConfig = new OpsRuleConfig();
			opsRuleConfig.setName(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].Name"));
			opsRuleConfig.setEnable(_ctx.booleanValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].Enable"));
			opsRuleConfig.setSilent(_ctx.integerValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].Silent"));
			opsRuleConfig.setLevel(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].Level"));
			opsRuleConfig.setDesc(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].Desc"));
			opsRuleConfig.setOpsType(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].OpsType"));
			opsRuleConfig.setOpsTargetType(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].OpsTargetType"));
			opsRuleConfig.setOpsReason(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].OpsReason"));
			opsRuleConfig.setMaxTimes(_ctx.integerValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].MaxTimes"));
			opsRuleConfig.setDelayExec(_ctx.integerValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].DelayExec"));

			List<String> exclusions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].Exclusions.Length"); j++) {
				exclusions.add(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].Exclusions["+ j +"]"));
			}
			opsRuleConfig.setExclusions(exclusions);

			List<String> conditions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].Conditions.Length"); j++) {
				conditions.add(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].Conditions["+ j +"]"));
			}
			opsRuleConfig.setConditions(conditions);

			List<String> actions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].Actions.Length"); j++) {
				actions.add(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].Actions["+ j +"]"));
			}
			opsRuleConfig.setActions(actions);

			List<LinkedFeature> linkedFeatures = new ArrayList<LinkedFeature>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedFeatures.Length"); j++) {
				LinkedFeature linkedFeature = new LinkedFeature();
				linkedFeature.setName(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedFeatures["+ j +"].Name"));
				linkedFeature.setException(_ctx.booleanValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedFeatures["+ j +"].Exception"));
				linkedFeature.setValidTimeRange(_ctx.integerValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedFeatures["+ j +"].ValidTimeRange"));
				linkedFeature.setType(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedFeatures["+ j +"].Type"));
				linkedFeature.setDesc(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedFeatures["+ j +"].Desc"));

				List<String> conditions1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedFeatures["+ j +"].Conditions.Length"); k++) {
					conditions1.add(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedFeatures["+ j +"].Conditions["+ k +"]"));
				}
				linkedFeature.setConditions1(conditions1);

				linkedFeatures.add(linkedFeature);
			}
			opsRuleConfig.setLinkedFeatures(linkedFeatures);

			List<LinkedMonitor> linkedMonitors = new ArrayList<LinkedMonitor>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedMonitors.Length"); j++) {
				LinkedMonitor linkedMonitor = new LinkedMonitor();
				linkedMonitor.setLogstore(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedMonitors["+ j +"].Logstore"));
				linkedMonitor.setTimeRange(_ctx.integerValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedMonitors["+ j +"].TimeRange"));
				linkedMonitor.setMonitorName(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedMonitors["+ j +"].MonitorName"));
				linkedMonitor.setInterval(_ctx.integerValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedMonitors["+ j +"].Interval"));
				linkedMonitor.setSlsConfigName(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedMonitors["+ j +"].SlsConfigName"));
				linkedMonitor.setDefaultProject(_ctx.stringValue("OpsQueryOpsRulesResponse.OpsRuleConfigs["+ i +"].LinkedMonitors["+ j +"].DefaultProject"));

				linkedMonitors.add(linkedMonitor);
			}
			opsRuleConfig.setLinkedMonitors(linkedMonitors);

			opsRuleConfigs.add(opsRuleConfig);
		}
		opsQueryOpsRulesResponse.setOpsRuleConfigs(opsRuleConfigs);
	 
	 	return opsQueryOpsRulesResponse;
	}
}