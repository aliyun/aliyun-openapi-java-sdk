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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetInstanceConfigResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetInstanceConfigResponse.Config;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetInstanceConfigResponse.Config.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceConfigResponseUnmarshaller {

	public static GetInstanceConfigResponse unmarshall(GetInstanceConfigResponse getInstanceConfigResponse, UnmarshallerContext context) {
		
		getInstanceConfigResponse.setRequestId(context.stringValue("GetInstanceConfigResponse.RequestId"));
		getInstanceConfigResponse.setSuccess(context.booleanValue("GetInstanceConfigResponse.Success"));
		getInstanceConfigResponse.setCode(context.stringValue("GetInstanceConfigResponse.Code"));
		getInstanceConfigResponse.setMessage(context.stringValue("GetInstanceConfigResponse.Message"));
		getInstanceConfigResponse.setHttpStatusCode(context.integerValue("GetInstanceConfigResponse.HttpStatusCode"));
		getInstanceConfigResponse.setInstanceId(context.stringValue("GetInstanceConfigResponse.InstanceId"));

		Config config = new Config();

		List<ConfigItem> items = new ArrayList<ConfigItem>();
		for (int i = 0; i < context.lengthValue("GetInstanceConfigResponse.Config.Items.Length"); i++) {
			ConfigItem configItem = new ConfigItem();
			configItem.setName(context.stringValue("GetInstanceConfigResponse.Config.Items["+ i +"].Name"));
			configItem.setValue(context.stringValue("GetInstanceConfigResponse.Config.Items["+ i +"].Value"));

			items.add(configItem);
		}
		config.setItems(items);
		getInstanceConfigResponse.setConfig(config);
	 
	 	return getInstanceConfigResponse;
	}
}