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

package com.aliyuncs.voicenavigator.transform.v20180612;

import com.aliyuncs.voicenavigator.model.v20180612.GetInstanceConfigResponse;
import com.aliyuncs.voicenavigator.model.v20180612.GetInstanceConfigResponse.Data;
import com.aliyuncs.voicenavigator.model.v20180612.GetInstanceConfigResponse.Data.InstanceConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceConfigResponseUnmarshaller {

	public static GetInstanceConfigResponse unmarshall(GetInstanceConfigResponse getInstanceConfigResponse, UnmarshallerContext _ctx) {
		
		getInstanceConfigResponse.setRequestId(_ctx.stringValue("GetInstanceConfigResponse.RequestId"));
		getInstanceConfigResponse.setSuccess(_ctx.booleanValue("GetInstanceConfigResponse.Success"));
		getInstanceConfigResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceConfigResponse.HttpStatusCode"));
		getInstanceConfigResponse.setCode(_ctx.stringValue("GetInstanceConfigResponse.Code"));
		getInstanceConfigResponse.setErrorMsg(_ctx.stringValue("GetInstanceConfigResponse.ErrorMsg"));

		Data data = new Data();

		InstanceConfig instanceConfig = new InstanceConfig();
		instanceConfig.setMiniPlaybackSystemSwitch(_ctx.booleanValue("GetInstanceConfigResponse.Data.InstanceConfig.MiniPlaybackSystemSwitch"));
		instanceConfig.setNewBargeInSystemSwitch(_ctx.booleanValue("GetInstanceConfigResponse.Data.InstanceConfig.NewBargeInSystemSwitch"));
		data.setInstanceConfig(instanceConfig);
		getInstanceConfigResponse.setData(data);
	 
	 	return getInstanceConfigResponse;
	}
}