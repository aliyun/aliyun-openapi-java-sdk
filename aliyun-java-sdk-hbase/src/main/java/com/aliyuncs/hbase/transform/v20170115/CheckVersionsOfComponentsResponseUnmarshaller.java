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

package com.aliyuncs.hbase.transform.v20170115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20170115.CheckVersionsOfComponentsResponse;
import com.aliyuncs.hbase.model.v20170115.CheckVersionsOfComponentsResponse.ComponentsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckVersionsOfComponentsResponseUnmarshaller {

	public static CheckVersionsOfComponentsResponse unmarshall(CheckVersionsOfComponentsResponse checkVersionsOfComponentsResponse, UnmarshallerContext context) {
		
		checkVersionsOfComponentsResponse.setRequestId(context.stringValue("CheckVersionsOfComponentsResponse.RequestId"));

		List<ComponentsItem> components = new ArrayList<ComponentsItem>();
		for (int i = 0; i < context.lengthValue("CheckVersionsOfComponentsResponse.Components.Length"); i++) {
			ComponentsItem componentsItem = new ComponentsItem();
			componentsItem.setComponent(context.stringValue("CheckVersionsOfComponentsResponse.Components["+ i +"].Component"));
			componentsItem.setIsLatestVersion(context.stringValue("CheckVersionsOfComponentsResponse.Components["+ i +"].IsLatestVersion"));

			components.add(componentsItem);
		}
		checkVersionsOfComponentsResponse.setComponents(components);
	 
	 	return checkVersionsOfComponentsResponse;
	}
}