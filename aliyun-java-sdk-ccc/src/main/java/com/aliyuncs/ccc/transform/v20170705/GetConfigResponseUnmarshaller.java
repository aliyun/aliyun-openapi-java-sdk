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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.GetConfigResponse;
import com.aliyuncs.ccc.model.v20170705.GetConfigResponse.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConfigResponseUnmarshaller {

	public static GetConfigResponse unmarshall(GetConfigResponse getConfigResponse, UnmarshallerContext context) {
		
		getConfigResponse.setRequestId(context.stringValue("GetConfigResponse.RequestId"));
		getConfigResponse.setSuccess(context.booleanValue("GetConfigResponse.Success"));
		getConfigResponse.setCode(context.stringValue("GetConfigResponse.Code"));
		getConfigResponse.setMessage(context.stringValue("GetConfigResponse.Message"));
		getConfigResponse.setHttpStatusCode(context.integerValue("GetConfigResponse.HttpStatusCode"));

		ConfigItem configItem = new ConfigItem();
		configItem.setName(context.stringValue("GetConfigResponse.ConfigItem.Name"));
		configItem.setValue(context.stringValue("GetConfigResponse.ConfigItem.Value"));
		getConfigResponse.setConfigItem(configItem);
	 
	 	return getConfigResponse;
	}
}