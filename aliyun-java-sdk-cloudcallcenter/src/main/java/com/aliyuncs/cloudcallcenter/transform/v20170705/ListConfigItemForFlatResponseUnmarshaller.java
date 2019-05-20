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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListConfigItemForFlatResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListConfigItemForFlatResponse.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConfigItemForFlatResponseUnmarshaller {

	public static ListConfigItemForFlatResponse unmarshall(ListConfigItemForFlatResponse listConfigItemForFlatResponse, UnmarshallerContext context) {
		
		listConfigItemForFlatResponse.setRequestId(context.stringValue("ListConfigItemForFlatResponse.RequestId"));
		listConfigItemForFlatResponse.setSuccess(context.booleanValue("ListConfigItemForFlatResponse.Success"));
		listConfigItemForFlatResponse.setCode(context.stringValue("ListConfigItemForFlatResponse.Code"));
		listConfigItemForFlatResponse.setMessage(context.stringValue("ListConfigItemForFlatResponse.Message"));
		listConfigItemForFlatResponse.setHttpStatusCode(context.integerValue("ListConfigItemForFlatResponse.HttpStatusCode"));

		List<ConfigItem> configItems = new ArrayList<ConfigItem>();
		for (int i = 0; i < context.lengthValue("ListConfigItemForFlatResponse.ConfigItems.Length"); i++) {
			ConfigItem configItem = new ConfigItem();
			configItem.setName(context.stringValue("ListConfigItemForFlatResponse.ConfigItems["+ i +"].Name"));
			configItem.setValue(context.stringValue("ListConfigItemForFlatResponse.ConfigItems["+ i +"].Value"));

			configItems.add(configItem);
		}
		listConfigItemForFlatResponse.setConfigItems(configItems);
	 
	 	return listConfigItemForFlatResponse;
	}
}