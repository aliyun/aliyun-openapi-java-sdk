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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.GetInstanceConfigResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetInstanceConfigResponse.Data;
import com.aliyuncs.outboundbot.model.v20191226.GetInstanceConfigResponse.Data.InstanceConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceConfigResponseUnmarshaller {

	public static GetInstanceConfigResponse unmarshall(GetInstanceConfigResponse getInstanceConfigResponse, UnmarshallerContext _ctx) {
		
		getInstanceConfigResponse.setRequestId(_ctx.stringValue("GetInstanceConfigResponse.RequestId"));
		getInstanceConfigResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceConfigResponse.HttpStatusCode"));
		getInstanceConfigResponse.setCode(_ctx.stringValue("GetInstanceConfigResponse.Code"));
		getInstanceConfigResponse.setMessage(_ctx.stringValue("GetInstanceConfigResponse.Message"));
		getInstanceConfigResponse.setSuccess(_ctx.booleanValue("GetInstanceConfigResponse.Success"));

		Data data = new Data();

		InstanceConfig instanceConfig = new InstanceConfig();
		instanceConfig.setMiniPlaybackSystemSwitch(_ctx.booleanValue("GetInstanceConfigResponse.Data.InstanceConfig.MiniPlaybackSystemSwitch"));
		instanceConfig.setNewBargeInSystemSwitch(_ctx.booleanValue("GetInstanceConfigResponse.Data.InstanceConfig.NewBargeInSystemSwitch"));
		instanceConfig.setSearchTaskFunctionSwitch(_ctx.booleanValue("GetInstanceConfigResponse.Data.InstanceConfig.SearchTaskFunctionSwitch"));
		instanceConfig.setEsAllDataKeepDay(_ctx.longValue("GetInstanceConfigResponse.Data.InstanceConfig.EsAllDataKeepDay"));
		data.setInstanceConfig(instanceConfig);
		getInstanceConfigResponse.setData(data);
	 
	 	return getInstanceConfigResponse;
	}
}