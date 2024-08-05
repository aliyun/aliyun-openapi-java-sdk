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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetRumAppsResponse;
import com.aliyuncs.arms.model.v20190808.GetRumAppsResponse.AppListItem;
import com.aliyuncs.arms.model.v20190808.GetRumAppsResponse.AppListItem.ServiceDomainConfigsItem;
import com.aliyuncs.arms.model.v20190808.GetRumAppsResponse.AppListItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRumAppsResponseUnmarshaller {

	public static GetRumAppsResponse unmarshall(GetRumAppsResponse getRumAppsResponse, UnmarshallerContext _ctx) {
		
		getRumAppsResponse.setRequestId(_ctx.stringValue("GetRumAppsResponse.RequestId"));
		getRumAppsResponse.setCode(_ctx.integerValue("GetRumAppsResponse.Code"));
		getRumAppsResponse.setSuccess(_ctx.booleanValue("GetRumAppsResponse.Success"));
		getRumAppsResponse.setMessage(_ctx.stringValue("GetRumAppsResponse.Message"));
		getRumAppsResponse.setHttpStatusCode(_ctx.integerValue("GetRumAppsResponse.HttpStatusCode"));

		List<AppListItem> appList = new ArrayList<AppListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRumAppsResponse.AppList.Length"); i++) {
			AppListItem appListItem = new AppListItem();
			appListItem.setName(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].Name"));
			appListItem.setPid(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].Pid"));
			appListItem.setType(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].Type"));
			appListItem.setNickName(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].NickName"));
			appListItem.setRegionId(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].RegionId"));
			appListItem.setAppType(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].AppType"));
			appListItem.setStatus(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].Status"));
			appListItem.setResourceGroupId(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].ResourceGroupId"));
			appListItem.setIsSubscription(_ctx.booleanValue("GetRumAppsResponse.AppList["+ i +"].IsSubscription"));
			appListItem.setDescription(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].Description"));
			appListItem.setPackageName(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].PackageName"));
			appListItem.setEndpoint(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].Endpoint"));
			appListItem.setSlsProject(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].SlsProject"));
			appListItem.setSlsLogstore(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].SlsLogstore"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetRumAppsResponse.AppList["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			appListItem.setTags(tags);

			List<ServiceDomainConfigsItem> serviceDomainConfigs = new ArrayList<ServiceDomainConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetRumAppsResponse.AppList["+ i +"].ServiceDomainConfigs.Length"); j++) {
				ServiceDomainConfigsItem serviceDomainConfigsItem = new ServiceDomainConfigsItem();
				serviceDomainConfigsItem.setDomain(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].ServiceDomainConfigs["+ j +"].Domain"));
				serviceDomainConfigsItem.setDescription(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].ServiceDomainConfigs["+ j +"].Description"));
				serviceDomainConfigsItem.setTracing(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].ServiceDomainConfigs["+ j +"].Tracing"));

				List<String> propagatorTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetRumAppsResponse.AppList["+ i +"].ServiceDomainConfigs["+ j +"].PropagatorTypes.Length"); k++) {
					propagatorTypes.add(_ctx.stringValue("GetRumAppsResponse.AppList["+ i +"].ServiceDomainConfigs["+ j +"].PropagatorTypes["+ k +"]"));
				}
				serviceDomainConfigsItem.setPropagatorTypes(propagatorTypes);

				serviceDomainConfigs.add(serviceDomainConfigsItem);
			}
			appListItem.setServiceDomainConfigs(serviceDomainConfigs);

			appList.add(appListItem);
		}
		getRumAppsResponse.setAppList(appList);
	 
	 	return getRumAppsResponse;
	}
}