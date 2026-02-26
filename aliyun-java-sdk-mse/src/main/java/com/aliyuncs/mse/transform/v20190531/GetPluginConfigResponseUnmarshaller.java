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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.GetPluginConfigResponse;
import com.aliyuncs.mse.model.v20190531.GetPluginConfigResponse.Data;
import com.aliyuncs.mse.model.v20190531.GetPluginConfigResponse.Data.GatewayConfigListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPluginConfigResponseUnmarshaller {

	public static GetPluginConfigResponse unmarshall(GetPluginConfigResponse getPluginConfigResponse, UnmarshallerContext _ctx) {
		
		getPluginConfigResponse.setRequestId(_ctx.stringValue("GetPluginConfigResponse.RequestId"));
		getPluginConfigResponse.setSuccess(_ctx.booleanValue("GetPluginConfigResponse.Success"));
		getPluginConfigResponse.setCode(_ctx.integerValue("GetPluginConfigResponse.Code"));
		getPluginConfigResponse.setErrorCode(_ctx.stringValue("GetPluginConfigResponse.ErrorCode"));
		getPluginConfigResponse.setHttpStatusCode(_ctx.integerValue("GetPluginConfigResponse.HttpStatusCode"));
		getPluginConfigResponse.setMessage(_ctx.stringValue("GetPluginConfigResponse.Message"));
		getPluginConfigResponse.setDynamicCode(_ctx.stringValue("GetPluginConfigResponse.DynamicCode"));
		getPluginConfigResponse.setDynamicMessage(_ctx.stringValue("GetPluginConfigResponse.DynamicMessage"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetPluginConfigResponse.Data.Id"));
		data.setPrimaryUser(_ctx.stringValue("GetPluginConfigResponse.Data.PrimaryUser"));
		data.setType(_ctx.integerValue("GetPluginConfigResponse.Data.Type"));
		data.setCategory(_ctx.integerValue("GetPluginConfigResponse.Data.Category"));
		data.setName(_ctx.stringValue("GetPluginConfigResponse.Data.Name"));
		data.setVersion(_ctx.stringValue("GetPluginConfigResponse.Data.Version"));
		data.setSummary(_ctx.stringValue("GetPluginConfigResponse.Data.Summary"));
		data.setReadme(_ctx.stringValue("GetPluginConfigResponse.Data.Readme"));
		data.setReadmeEn(_ctx.stringValue("GetPluginConfigResponse.Data.ReadmeEn"));
		data.setPhase(_ctx.integerValue("GetPluginConfigResponse.Data.Phase"));
		data.setPriority(_ctx.integerValue("GetPluginConfigResponse.Data.Priority"));
		data.setConfigCheck(_ctx.stringValue("GetPluginConfigResponse.Data.ConfigCheck"));
		data.setMode(_ctx.integerValue("GetPluginConfigResponse.Data.Mode"));
		data.setWasmLang(_ctx.integerValue("GetPluginConfigResponse.Data.WasmLang"));
		data.setImageName(_ctx.stringValue("GetPluginConfigResponse.Data.ImageName"));
		data.setPublishState(_ctx.integerValue("GetPluginConfigResponse.Data.PublishState"));
		data.setStatus(_ctx.stringValue("GetPluginConfigResponse.Data.Status"));
		data.setVersionJson(_ctx.stringValue("GetPluginConfigResponse.Data.VersionJson"));

		List<GatewayConfigListItem> gatewayConfigList = new ArrayList<GatewayConfigListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPluginConfigResponse.Data.GatewayConfigList.Length"); i++) {
			GatewayConfigListItem gatewayConfigListItem = new GatewayConfigListItem();
			gatewayConfigListItem.setId(_ctx.longValue("GetPluginConfigResponse.Data.GatewayConfigList["+ i +"].Id"));
			gatewayConfigListItem.setGatewayId(_ctx.longValue("GetPluginConfigResponse.Data.GatewayConfigList["+ i +"].GatewayId"));
			gatewayConfigListItem.setGatewayUniqueId(_ctx.stringValue("GetPluginConfigResponse.Data.GatewayConfigList["+ i +"].GatewayUniqueId"));
			gatewayConfigListItem.setPluginId(_ctx.longValue("GetPluginConfigResponse.Data.GatewayConfigList["+ i +"].PluginId"));
			gatewayConfigListItem.setEnable(_ctx.booleanValue("GetPluginConfigResponse.Data.GatewayConfigList["+ i +"].Enable"));
			gatewayConfigListItem.setConfig(_ctx.stringValue("GetPluginConfigResponse.Data.GatewayConfigList["+ i +"].Config"));
			gatewayConfigListItem.setConfigLevel(_ctx.integerValue("GetPluginConfigResponse.Data.GatewayConfigList["+ i +"].ConfigLevel"));
			gatewayConfigListItem.setGmtCreate(_ctx.stringValue("GetPluginConfigResponse.Data.GatewayConfigList["+ i +"].GmtCreate"));
			gatewayConfigListItem.setGmtModified(_ctx.stringValue("GetPluginConfigResponse.Data.GatewayConfigList["+ i +"].GmtModified"));

			gatewayConfigList.add(gatewayConfigListItem);
		}
		data.setGatewayConfigList(gatewayConfigList);
		getPluginConfigResponse.setData(data);
	 
	 	return getPluginConfigResponse;
	}
}