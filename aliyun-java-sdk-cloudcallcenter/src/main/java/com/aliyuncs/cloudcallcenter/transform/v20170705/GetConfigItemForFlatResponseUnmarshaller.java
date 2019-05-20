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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetConfigItemForFlatResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetConfigItemForFlatResponse.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConfigItemForFlatResponseUnmarshaller {

	public static GetConfigItemForFlatResponse unmarshall(GetConfigItemForFlatResponse getConfigItemForFlatResponse, UnmarshallerContext context) {
		
		getConfigItemForFlatResponse.setRequestId(context.stringValue("GetConfigItemForFlatResponse.RequestId"));
		getConfigItemForFlatResponse.setSuccess(context.booleanValue("GetConfigItemForFlatResponse.Success"));
		getConfigItemForFlatResponse.setCode(context.stringValue("GetConfigItemForFlatResponse.Code"));
		getConfigItemForFlatResponse.setMessage(context.stringValue("GetConfigItemForFlatResponse.Message"));
		getConfigItemForFlatResponse.setHttpStatusCode(context.integerValue("GetConfigItemForFlatResponse.HttpStatusCode"));

		ConfigItem configItem = new ConfigItem();
		configItem.setName(context.stringValue("GetConfigItemForFlatResponse.ConfigItem.Name"));
		configItem.setValue(context.stringValue("GetConfigItemForFlatResponse.ConfigItem.Value"));
		getConfigItemForFlatResponse.setConfigItem(configItem);
	 
	 	return getConfigItemForFlatResponse;
	}
}