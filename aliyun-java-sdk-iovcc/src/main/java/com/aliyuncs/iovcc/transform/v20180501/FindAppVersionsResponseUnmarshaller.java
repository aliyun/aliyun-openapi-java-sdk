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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.FindAppVersionsResponse;
import com.aliyuncs.iovcc.model.v20180501.FindAppVersionsResponse.AppVersionList;
import com.aliyuncs.iovcc.model.v20180501.FindAppVersionsResponse.AppVersionList.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindAppVersionsResponseUnmarshaller {

	public static FindAppVersionsResponse unmarshall(FindAppVersionsResponse findAppVersionsResponse, UnmarshallerContext _ctx) {
		
		findAppVersionsResponse.setRequestId(_ctx.stringValue("FindAppVersionsResponse.RequestId"));

		AppVersionList appVersionList = new AppVersionList();
		appVersionList.setTotalCount(_ctx.integerValue("FindAppVersionsResponse.AppVersionList.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("FindAppVersionsResponse.AppVersionList.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(_ctx.longValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].Id"));
			itemsItem.setAppId(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].AppId"));
			itemsItem.setVersionCode(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].VersionCode"));
			itemsItem.setStatus(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].Status"));
			itemsItem.setGmtCreate(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].GmtCreate"));
			itemsItem.setGmtModify(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].GmtModify"));
			itemsItem.setAppVersion(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].AppVersion"));
			itemsItem.setIsNeedRestart(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].IsNeedRestart"));
			itemsItem.setIsForceUpgrade(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].IsForceUpgrade"));
			itemsItem.setIsSilentUpgrade(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].IsSilentUpgrade"));
			itemsItem.setIsAllowNewInstall(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].IsAllowNewInstall"));
			itemsItem.setRestartType(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].RestartType"));
			itemsItem.setRestartAppType(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].RestartAppType"));
			itemsItem.setRestartAppParam(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].RestartAppParam"));
			itemsItem.setInstallType(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].InstallType"));
			itemsItem.setAppName(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].AppName"));
			itemsItem.setAppPackageName(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].AppPackageName"));
			itemsItem.setStatusName(_ctx.stringValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].StatusName"));
			itemsItem.setGmtCreateTimestamp(_ctx.longValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].GmtCreateTimestamp"));
			itemsItem.setGmtModifyTimestamp(_ctx.longValue("FindAppVersionsResponse.AppVersionList.Items["+ i +"].GmtModifyTimestamp"));

			items.add(itemsItem);
		}
		appVersionList.setItems(items);
		findAppVersionsResponse.setAppVersionList(appVersionList);
	 
	 	return findAppVersionsResponse;
	}
}