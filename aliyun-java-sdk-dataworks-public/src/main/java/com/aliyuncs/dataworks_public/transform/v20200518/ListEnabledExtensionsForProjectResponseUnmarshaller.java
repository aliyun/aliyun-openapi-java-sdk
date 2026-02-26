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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListEnabledExtensionsForProjectResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListEnabledExtensionsForProjectResponse.ExtensionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnabledExtensionsForProjectResponseUnmarshaller {

	public static ListEnabledExtensionsForProjectResponse unmarshall(ListEnabledExtensionsForProjectResponse listEnabledExtensionsForProjectResponse, UnmarshallerContext _ctx) {
		
		listEnabledExtensionsForProjectResponse.setRequestId(_ctx.stringValue("ListEnabledExtensionsForProjectResponse.RequestId"));

		List<ExtensionsItem> extensions = new ArrayList<ExtensionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnabledExtensionsForProjectResponse.Extensions.Length"); i++) {
			ExtensionsItem extensionsItem = new ExtensionsItem();
			extensionsItem.setExtensionCode(_ctx.stringValue("ListEnabledExtensionsForProjectResponse.Extensions["+ i +"].ExtensionCode"));
			extensionsItem.setExtensionName(_ctx.stringValue("ListEnabledExtensionsForProjectResponse.Extensions["+ i +"].ExtensionName"));
			extensionsItem.setTenantId(_ctx.longValue("ListEnabledExtensionsForProjectResponse.Extensions["+ i +"].TenantId"));
			extensionsItem.setCreateUser(_ctx.stringValue("ListEnabledExtensionsForProjectResponse.Extensions["+ i +"].CreateUser"));
			extensionsItem.setModifyUser(_ctx.stringValue("ListEnabledExtensionsForProjectResponse.Extensions["+ i +"].ModifyUser"));
			extensionsItem.setExtensionDesc(_ctx.stringValue("ListEnabledExtensionsForProjectResponse.Extensions["+ i +"].ExtensionDesc"));
			extensionsItem.setOwner(_ctx.stringValue("ListEnabledExtensionsForProjectResponse.Extensions["+ i +"].Owner"));
			extensionsItem.setParameterSetting(_ctx.stringValue("ListEnabledExtensionsForProjectResponse.Extensions["+ i +"].ParameterSetting"));

			extensions.add(extensionsItem);
		}
		listEnabledExtensionsForProjectResponse.setExtensions(extensions);
	 
	 	return listEnabledExtensionsForProjectResponse;
	}
}