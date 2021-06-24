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

import com.aliyuncs.ecsops.model.v20160401.OpsListAxtPluginsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListAxtPluginsResponse.Plugin;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListAxtPluginsResponseUnmarshaller {

	public static OpsListAxtPluginsResponse unmarshall(OpsListAxtPluginsResponse opsListAxtPluginsResponse, UnmarshallerContext _ctx) {
		
		opsListAxtPluginsResponse.setRequestId(_ctx.stringValue("OpsListAxtPluginsResponse.RequestId"));
		opsListAxtPluginsResponse.setTotalCount(_ctx.longValue("OpsListAxtPluginsResponse.TotalCount"));
		opsListAxtPluginsResponse.setPageSize(_ctx.longValue("OpsListAxtPluginsResponse.PageSize"));
		opsListAxtPluginsResponse.setPageNumber(_ctx.longValue("OpsListAxtPluginsResponse.PageNumber"));

		List<Plugin> pluginList = new ArrayList<Plugin>();
		for (int i = 0; i < _ctx.lengthValue("OpsListAxtPluginsResponse.PluginList.Length"); i++) {
			Plugin plugin = new Plugin();
			plugin.setTimeout(_ctx.longValue("OpsListAxtPluginsResponse.PluginList["+ i +"].Timeout"));
			plugin.setPluginId(_ctx.stringValue("OpsListAxtPluginsResponse.PluginList["+ i +"].PluginId"));
			plugin.setArch(_ctx.stringValue("OpsListAxtPluginsResponse.PluginList["+ i +"].Arch"));
			plugin.setPublisher(_ctx.stringValue("OpsListAxtPluginsResponse.PluginList["+ i +"].Publisher"));
			plugin.setPreInstalled(_ctx.booleanValue("OpsListAxtPluginsResponse.PluginList["+ i +"].PreInstalled"));
			plugin.setRunPath(_ctx.stringValue("OpsListAxtPluginsResponse.PluginList["+ i +"].RunPath"));
			plugin.setUrl(_ctx.stringValue("OpsListAxtPluginsResponse.PluginList["+ i +"].Url"));
			plugin.setPluginVersion(_ctx.stringValue("OpsListAxtPluginsResponse.PluginList["+ i +"].PluginVersion"));
			plugin.setDistro(_ctx.stringValue("OpsListAxtPluginsResponse.PluginList["+ i +"].Distro"));
			plugin.setOsType(_ctx.stringValue("OpsListAxtPluginsResponse.PluginList["+ i +"].OsType"));
			plugin.setMd5(_ctx.stringValue("OpsListAxtPluginsResponse.PluginList["+ i +"].Md5"));
			plugin.setName(_ctx.stringValue("OpsListAxtPluginsResponse.PluginList["+ i +"].Name"));

			pluginList.add(plugin);
		}
		opsListAxtPluginsResponse.setPluginList(pluginList);
	 
	 	return opsListAxtPluginsResponse;
	}
}