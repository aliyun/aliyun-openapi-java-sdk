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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.GetLindormEngineConfigResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormEngineConfigResponse.EngineConfig;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormEngineConfigResponse.EngineConfig.ConfigFile;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormEngineConfigResponse.EngineConfig.ConfigFile.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLindormEngineConfigResponseUnmarshaller {

	public static GetLindormEngineConfigResponse unmarshall(GetLindormEngineConfigResponse getLindormEngineConfigResponse, UnmarshallerContext _ctx) {
		
		getLindormEngineConfigResponse.setRequestId(_ctx.stringValue("GetLindormEngineConfigResponse.RequestId"));
		getLindormEngineConfigResponse.setAccessDeniedDetail(_ctx.stringValue("GetLindormEngineConfigResponse.AccessDeniedDetail"));

		List<EngineConfig> engineConfigs = new ArrayList<EngineConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormEngineConfigResponse.EngineConfigs.Length"); i++) {
			EngineConfig engineConfig = new EngineConfig();
			engineConfig.setEngine(_ctx.stringValue("GetLindormEngineConfigResponse.EngineConfigs["+ i +"].Engine"));

			List<ConfigFile> configFiles = new ArrayList<ConfigFile>();
			for (int j = 0; j < _ctx.lengthValue("GetLindormEngineConfigResponse.EngineConfigs["+ i +"].ConfigFiles.Length"); j++) {
				ConfigFile configFile = new ConfigFile();
				configFile.setFileName(_ctx.stringValue("GetLindormEngineConfigResponse.EngineConfigs["+ i +"].ConfigFiles["+ j +"].FileName"));

				List<ConfigItem> configItems = new ArrayList<ConfigItem>();
				for (int k = 0; k < _ctx.lengthValue("GetLindormEngineConfigResponse.EngineConfigs["+ i +"].ConfigFiles["+ j +"].ConfigItems.Length"); k++) {
					ConfigItem configItem = new ConfigItem();
					configItem.setConfigItemKey(_ctx.stringValue("GetLindormEngineConfigResponse.EngineConfigs["+ i +"].ConfigFiles["+ j +"].ConfigItems["+ k +"].ConfigItemKey"));
					configItem.setConfigItemValue(_ctx.stringValue("GetLindormEngineConfigResponse.EngineConfigs["+ i +"].ConfigFiles["+ j +"].ConfigItems["+ k +"].ConfigItemValue"));

					configItems.add(configItem);
				}
				configFile.setConfigItems(configItems);

				configFiles.add(configFile);
			}
			engineConfig.setConfigFiles(configFiles);

			engineConfigs.add(engineConfig);
		}
		getLindormEngineConfigResponse.setEngineConfigs(engineConfigs);
	 
	 	return getLindormEngineConfigResponse;
	}
}