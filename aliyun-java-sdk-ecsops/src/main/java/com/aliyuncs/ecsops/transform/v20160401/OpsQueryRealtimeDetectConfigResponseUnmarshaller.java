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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryRealtimeDetectConfigResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryRealtimeDetectConfigResponse.ScriptConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryRealtimeDetectConfigResponseUnmarshaller {

	public static OpsQueryRealtimeDetectConfigResponse unmarshall(OpsQueryRealtimeDetectConfigResponse opsQueryRealtimeDetectConfigResponse, UnmarshallerContext _ctx) {
		
		opsQueryRealtimeDetectConfigResponse.setRequestId(_ctx.stringValue("OpsQueryRealtimeDetectConfigResponse.RequestId"));

		List<ScriptConfig> scriptConfigs = new ArrayList<ScriptConfig>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs.Length"); i++) {
			ScriptConfig scriptConfig = new ScriptConfig();
			scriptConfig.setTimeout(_ctx.integerValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].Timeout"));
			scriptConfig.setExecFlowControl(_ctx.integerValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].ExecFlowControl"));
			scriptConfig.setExecMode(_ctx.stringValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].ExecMode"));
			scriptConfig.setExecCondition(_ctx.stringValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].ExecCondition"));
			scriptConfig.setDesc(_ctx.stringValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].Desc"));
			scriptConfig.setBatchDetect(_ctx.booleanValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].BatchDetect"));
			scriptConfig.setDetectConfig(_ctx.stringValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].DetectConfig"));
			scriptConfig.setCommand(_ctx.stringValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].Command"));
			scriptConfig.setHandler(_ctx.stringValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].Handler"));
			scriptConfig.setName(_ctx.stringValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].Name"));
			scriptConfig.setTarget(_ctx.stringValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].Target"));
			scriptConfig.setConfigDesc(_ctx.stringValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].ConfigDesc"));
			scriptConfig.setEnable(_ctx.booleanValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].Enable"));

			List<String> params = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].Params.Length"); j++) {
				params.add(_ctx.stringValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].Params["+ j +"]"));
			}
			scriptConfig.setParams(params);

			List<String> detectItems = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].DetectItems.Length"); j++) {
				detectItems.add(_ctx.stringValue("OpsQueryRealtimeDetectConfigResponse.ScriptConfigs["+ i +"].DetectItems["+ j +"]"));
			}
			scriptConfig.setDetectItems(detectItems);

			scriptConfigs.add(scriptConfig);
		}
		opsQueryRealtimeDetectConfigResponse.setScriptConfigs(scriptConfigs);
	 
	 	return opsQueryRealtimeDetectConfigResponse;
	}
}