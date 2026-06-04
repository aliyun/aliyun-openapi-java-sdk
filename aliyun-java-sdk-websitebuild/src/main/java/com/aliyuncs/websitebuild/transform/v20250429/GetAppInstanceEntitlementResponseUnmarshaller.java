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

package com.aliyuncs.websitebuild.transform.v20250429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceEntitlementResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceEntitlementResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.GetAppInstanceEntitlementResponse.Module.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppInstanceEntitlementResponseUnmarshaller {

	public static GetAppInstanceEntitlementResponse unmarshall(GetAppInstanceEntitlementResponse getAppInstanceEntitlementResponse, UnmarshallerContext _ctx) {
		
		getAppInstanceEntitlementResponse.setRequestId(_ctx.stringValue("GetAppInstanceEntitlementResponse.RequestId"));
		getAppInstanceEntitlementResponse.setDynamicCode(_ctx.stringValue("GetAppInstanceEntitlementResponse.DynamicCode"));
		getAppInstanceEntitlementResponse.setDynamicMessage(_ctx.stringValue("GetAppInstanceEntitlementResponse.DynamicMessage"));
		getAppInstanceEntitlementResponse.setSynchro(_ctx.booleanValue("GetAppInstanceEntitlementResponse.Synchro"));
		getAppInstanceEntitlementResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppInstanceEntitlementResponse.AccessDeniedDetail"));
		getAppInstanceEntitlementResponse.setRootErrorMsg(_ctx.stringValue("GetAppInstanceEntitlementResponse.RootErrorMsg"));
		getAppInstanceEntitlementResponse.setRootErrorCode(_ctx.stringValue("GetAppInstanceEntitlementResponse.RootErrorCode"));
		getAppInstanceEntitlementResponse.setAllowRetry(_ctx.booleanValue("GetAppInstanceEntitlementResponse.AllowRetry"));
		getAppInstanceEntitlementResponse.setAppName(_ctx.stringValue("GetAppInstanceEntitlementResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceEntitlementResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppInstanceEntitlementResponse.ErrorArgs["+ i +"]"));
		}
		getAppInstanceEntitlementResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setBizId(_ctx.stringValue("GetAppInstanceEntitlementResponse.Module.BizId"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstanceEntitlementResponse.Module.Items.Length"); i++) {
			Item item = new Item();
			item.setCode(_ctx.stringValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].Code"));
			item.setName(_ctx.stringValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].Name"));
			item.setType(_ctx.stringValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].Type"));
			item.setResourceCode(_ctx.stringValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].ResourceCode"));
			item.setEntitled(_ctx.booleanValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].Entitled"));
			item.setAvailable(_ctx.booleanValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].Available"));
			item.setFeatureType(_ctx.stringValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].FeatureType"));
			item.setPluginId(_ctx.stringValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].PluginId"));
			item.setConfigured(_ctx.booleanValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].Configured"));
			item.setResourceType(_ctx.stringValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].ResourceType"));
			item.setQuota(_ctx.longValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].Quota"));
			item.setUsed(_ctx.longValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].Used"));
			item.setRemaining(_ctx.longValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].Remaining"));
			item.setUsagePercent(_ctx.integerValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].UsagePercent"));
			item.setInstanceId(_ctx.stringValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].InstanceId"));
			item.setAllocated(_ctx.booleanValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].Allocated"));
			item.setRunning(_ctx.booleanValue("GetAppInstanceEntitlementResponse.Module.Items["+ i +"].Running"));

			items.add(item);
		}
		module.setItems(items);
		getAppInstanceEntitlementResponse.setModule(module);
	 
	 	return getAppInstanceEntitlementResponse;
	}
}