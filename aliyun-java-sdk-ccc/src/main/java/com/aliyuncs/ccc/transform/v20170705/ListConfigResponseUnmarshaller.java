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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListConfigResponse;
import com.aliyuncs.ccc.model.v20170705.ListConfigResponse.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConfigResponseUnmarshaller {

	public static ListConfigResponse unmarshall(ListConfigResponse listConfigResponse, UnmarshallerContext context) {
		
		listConfigResponse.setRequestId(context.stringValue("ListConfigResponse.RequestId"));
		listConfigResponse.setSuccess(context.booleanValue("ListConfigResponse.Success"));
		listConfigResponse.setCode(context.stringValue("ListConfigResponse.Code"));
		listConfigResponse.setMessage(context.stringValue("ListConfigResponse.Message"));
		listConfigResponse.setHttpStatusCode(context.integerValue("ListConfigResponse.HttpStatusCode"));

		List<ConfigItem> configItems = new ArrayList<ConfigItem>();
		for (int i = 0; i < context.lengthValue("ListConfigResponse.ConfigItems.Length"); i++) {
			ConfigItem configItem = new ConfigItem();
			configItem.setName(context.stringValue("ListConfigResponse.ConfigItems["+ i +"].Name"));
			configItem.setValue(context.stringValue("ListConfigResponse.ConfigItems["+ i +"].Value"));

			configItems.add(configItem);
		}
		listConfigResponse.setConfigItems(configItems);
	 
	 	return listConfigResponse;
	}
}