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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryOpsRiskResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryOpsRiskResponse.OpsRiskConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryOpsRiskResponseUnmarshaller {

	public static OpsQueryOpsRiskResponse unmarshall(OpsQueryOpsRiskResponse opsQueryOpsRiskResponse, UnmarshallerContext _ctx) {
		
		opsQueryOpsRiskResponse.setRequestId(_ctx.stringValue("OpsQueryOpsRiskResponse.RequestId"));

		List<OpsRiskConfig> opsRiskConfigs = new ArrayList<OpsRiskConfig>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryOpsRiskResponse.OpsRiskConfigs.Length"); i++) {
			OpsRiskConfig opsRiskConfig = new OpsRiskConfig();
			opsRiskConfig.setAlwaysExec(_ctx.booleanValue("OpsQueryOpsRiskResponse.OpsRiskConfigs["+ i +"].AlwaysExec"));
			opsRiskConfig.setLimitNum(_ctx.integerValue("OpsQueryOpsRiskResponse.OpsRiskConfigs["+ i +"].LimitNum"));
			opsRiskConfig.setName(_ctx.stringValue("OpsQueryOpsRiskResponse.OpsRiskConfigs["+ i +"].Name"));
			opsRiskConfig.setOpsAction(_ctx.stringValue("OpsQueryOpsRiskResponse.OpsRiskConfigs["+ i +"].OpsAction"));
			opsRiskConfig.setMaxFreezeTime(_ctx.integerValue("OpsQueryOpsRiskResponse.OpsRiskConfigs["+ i +"].MaxFreezeTime"));
			opsRiskConfig.setEnable(_ctx.booleanValue("OpsQueryOpsRiskResponse.OpsRiskConfigs["+ i +"].Enable"));

			List<String> postActions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryOpsRiskResponse.OpsRiskConfigs["+ i +"].PostActions.Length"); j++) {
				postActions.add(_ctx.stringValue("OpsQueryOpsRiskResponse.OpsRiskConfigs["+ i +"].PostActions["+ j +"]"));
			}
			opsRiskConfig.setPostActions(postActions);

			List<String> exclusions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryOpsRiskResponse.OpsRiskConfigs["+ i +"].Exclusions.Length"); j++) {
				exclusions.add(_ctx.stringValue("OpsQueryOpsRiskResponse.OpsRiskConfigs["+ i +"].Exclusions["+ j +"]"));
			}
			opsRiskConfig.setExclusions(exclusions);

			List<String> groupByKeys = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryOpsRiskResponse.OpsRiskConfigs["+ i +"].GroupByKeys.Length"); j++) {
				groupByKeys.add(_ctx.stringValue("OpsQueryOpsRiskResponse.OpsRiskConfigs["+ i +"].GroupByKeys["+ j +"]"));
			}
			opsRiskConfig.setGroupByKeys(groupByKeys);

			opsRiskConfigs.add(opsRiskConfig);
		}
		opsQueryOpsRiskResponse.setOpsRiskConfigs(opsRiskConfigs);
	 
	 	return opsQueryOpsRiskResponse;
	}
}