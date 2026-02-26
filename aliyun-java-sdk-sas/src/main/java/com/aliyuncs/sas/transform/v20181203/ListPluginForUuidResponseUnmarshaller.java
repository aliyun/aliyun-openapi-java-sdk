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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListPluginForUuidResponse;
import com.aliyuncs.sas.model.v20181203.ListPluginForUuidResponse.AegisUuidTargetPluginConfig;
import com.aliyuncs.sas.model.v20181203.ListPluginForUuidResponse.AegisUuidTargetPluginConfig.AegisSuspiciousConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPluginForUuidResponseUnmarshaller {

	public static ListPluginForUuidResponse unmarshall(ListPluginForUuidResponse listPluginForUuidResponse, UnmarshallerContext _ctx) {
		
		listPluginForUuidResponse.setRequestId(_ctx.stringValue("ListPluginForUuidResponse.RequestId"));
		listPluginForUuidResponse.setCode(_ctx.integerValue("ListPluginForUuidResponse.Code"));
		listPluginForUuidResponse.setMessage(_ctx.stringValue("ListPluginForUuidResponse.Message"));

		List<AegisUuidTargetPluginConfig> aegisUuidTargetPluginConfigList = new ArrayList<AegisUuidTargetPluginConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListPluginForUuidResponse.AegisUuidTargetPluginConfigList.Length"); i++) {
			AegisUuidTargetPluginConfig aegisUuidTargetPluginConfig = new AegisUuidTargetPluginConfig();
			aegisUuidTargetPluginConfig.setPluginName(_ctx.stringValue("ListPluginForUuidResponse.AegisUuidTargetPluginConfigList["+ i +"].PluginName"));
			aegisUuidTargetPluginConfig.setPluginOnlineInstalled(_ctx.booleanValue("ListPluginForUuidResponse.AegisUuidTargetPluginConfigList["+ i +"].PluginOnlineInstalled"));
			aegisUuidTargetPluginConfig.setPluginOnlineStatus(_ctx.booleanValue("ListPluginForUuidResponse.AegisUuidTargetPluginConfigList["+ i +"].PluginOnlineStatus"));
			aegisUuidTargetPluginConfig.setPluginInstallCode(_ctx.stringValue("ListPluginForUuidResponse.AegisUuidTargetPluginConfigList["+ i +"].PluginInstallCode"));
			aegisUuidTargetPluginConfig.setPluginVersion(_ctx.stringValue("ListPluginForUuidResponse.AegisUuidTargetPluginConfigList["+ i +"].PluginVersion"));

			List<AegisSuspiciousConfig> aegisSuspiciousConfigList = new ArrayList<AegisSuspiciousConfig>();
			for (int j = 0; j < _ctx.lengthValue("ListPluginForUuidResponse.AegisUuidTargetPluginConfigList["+ i +"].AegisSuspiciousConfigList.Length"); j++) {
				AegisSuspiciousConfig aegisSuspiciousConfig = new AegisSuspiciousConfig();
				aegisSuspiciousConfig.setType(_ctx.stringValue("ListPluginForUuidResponse.AegisUuidTargetPluginConfigList["+ i +"].AegisSuspiciousConfigList["+ j +"].Type"));
				aegisSuspiciousConfig.setConfig(_ctx.booleanValue("ListPluginForUuidResponse.AegisUuidTargetPluginConfigList["+ i +"].AegisSuspiciousConfigList["+ j +"].Config"));
				aegisSuspiciousConfig.setMsg(_ctx.stringValue("ListPluginForUuidResponse.AegisUuidTargetPluginConfigList["+ i +"].AegisSuspiciousConfigList["+ j +"].Msg"));
				aegisSuspiciousConfig.setOverallConfig(_ctx.booleanValue("ListPluginForUuidResponse.AegisUuidTargetPluginConfigList["+ i +"].AegisSuspiciousConfigList["+ j +"].OverallConfig"));

				aegisSuspiciousConfigList.add(aegisSuspiciousConfig);
			}
			aegisUuidTargetPluginConfig.setAegisSuspiciousConfigList(aegisSuspiciousConfigList);

			aegisUuidTargetPluginConfigList.add(aegisUuidTargetPluginConfig);
		}
		listPluginForUuidResponse.setAegisUuidTargetPluginConfigList(aegisUuidTargetPluginConfigList);
	 
	 	return listPluginForUuidResponse;
	}
}