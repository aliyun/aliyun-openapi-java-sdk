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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticPluginResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticPluginResponse.Plugin;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticPluginResponse.Plugin.PluginItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeDiagnosticPluginResponseUnmarshaller {

	public static OpsDescribeDiagnosticPluginResponse unmarshall(OpsDescribeDiagnosticPluginResponse opsDescribeDiagnosticPluginResponse, UnmarshallerContext _ctx) {
		
		opsDescribeDiagnosticPluginResponse.setRequestId(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.RequestId"));
		opsDescribeDiagnosticPluginResponse.setTotalCount(_ctx.integerValue("OpsDescribeDiagnosticPluginResponse.TotalCount"));
		opsDescribeDiagnosticPluginResponse.setPageSize(_ctx.integerValue("OpsDescribeDiagnosticPluginResponse.PageSize"));
		opsDescribeDiagnosticPluginResponse.setPageNumber(_ctx.integerValue("OpsDescribeDiagnosticPluginResponse.PageNumber"));

		List<Plugin> plugins = new ArrayList<Plugin>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeDiagnosticPluginResponse.Plugins.Length"); i++) {
			Plugin plugin = new Plugin();
			plugin.setStatus(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].Status"));
			plugin.setOwner(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].Owner"));
			plugin.setDescription(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].Description"));
			plugin.setVersion(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].Version"));
			plugin.setGmtCreate(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].GmtCreate"));
			plugin.setGmtModified(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].GmtModified"));
			plugin.setPluginCode(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].PluginCode"));
			plugin.setId(_ctx.longValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].Id"));

			List<PluginItem> pluginItems = new ArrayList<PluginItem>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].PluginItems.Length"); j++) {
				PluginItem pluginItem = new PluginItem();
				pluginItem.setItemCategory(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].PluginItems["+ j +"].ItemCategory"));
				pluginItem.setStatus(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].PluginItems["+ j +"].Status"));
				pluginItem.setWeight(_ctx.integerValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].PluginItems["+ j +"].Weight"));
				pluginItem.setPluginId(_ctx.longValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].PluginItems["+ j +"].PluginId"));
				pluginItem.setGmtCreate(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].PluginItems["+ j +"].GmtCreate"));
				pluginItem.setItemCode(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].PluginItems["+ j +"].ItemCode"));
				pluginItem.setGmtModified(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].PluginItems["+ j +"].GmtModified"));
				pluginItem.setCreator(_ctx.stringValue("OpsDescribeDiagnosticPluginResponse.Plugins["+ i +"].PluginItems["+ j +"].Creator"));

				pluginItems.add(pluginItem);
			}
			plugin.setPluginItems(pluginItems);

			plugins.add(plugin);
		}
		opsDescribeDiagnosticPluginResponse.setPlugins(plugins);
	 
	 	return opsDescribeDiagnosticPluginResponse;
	}
}