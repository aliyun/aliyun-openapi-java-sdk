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

package com.aliyuncs.mpaas.transform.v20190821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20190821.ListMappCenterAppsResponse;
import com.aliyuncs.mpaas.model.v20190821.ListMappCenterAppsResponse.ListMappCenterAppResult;
import com.aliyuncs.mpaas.model.v20190821.ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppListItem;
import com.aliyuncs.mpaas.model.v20190821.ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppListItem.AndroidConfig;
import com.aliyuncs.mpaas.model.v20190821.ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppListItem.IosConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMappCenterAppsResponseUnmarshaller {

	public static ListMappCenterAppsResponse unmarshall(ListMappCenterAppsResponse listMappCenterAppsResponse, UnmarshallerContext _ctx) {
		
		listMappCenterAppsResponse.setRequestId(_ctx.stringValue("ListMappCenterAppsResponse.RequestId"));
		listMappCenterAppsResponse.setResultCode(_ctx.stringValue("ListMappCenterAppsResponse.ResultCode"));
		listMappCenterAppsResponse.setResultMessage(_ctx.stringValue("ListMappCenterAppsResponse.ResultMessage"));

		ListMappCenterAppResult listMappCenterAppResult = new ListMappCenterAppResult();
		listMappCenterAppResult.setResultMsg(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.ResultMsg"));
		listMappCenterAppResult.setSuccess(_ctx.booleanValue("ListMappCenterAppsResponse.ListMappCenterAppResult.Success"));

		List<MappCenterAppListItem> mappCenterAppList = new ArrayList<MappCenterAppListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList.Length"); i++) {
			MappCenterAppListItem mappCenterAppListItem = new MappCenterAppListItem();
			mappCenterAppListItem.setAppDesc(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].AppDesc"));
			mappCenterAppListItem.setAppIcon(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].AppIcon"));
			mappCenterAppListItem.setAppId(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].AppId"));
			mappCenterAppListItem.setAppName(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].AppName"));
			mappCenterAppListItem.setAppSecret(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].AppSecret"));
			mappCenterAppListItem.setCreator(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].Creator"));
			mappCenterAppListItem.setGmtCreate(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].GmtCreate"));
			mappCenterAppListItem.setGmtModified(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].GmtModified"));
			mappCenterAppListItem.setId(_ctx.longValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].Id"));
			mappCenterAppListItem.setModifier(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].Modifier"));
			mappCenterAppListItem.setMonitorJson(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].MonitorJson"));
			mappCenterAppListItem.setStatus(_ctx.longValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].Status"));
			mappCenterAppListItem.setTenantId(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].TenantId"));
			mappCenterAppListItem.setType(_ctx.longValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].Type"));

			AndroidConfig androidConfig = new AndroidConfig();
			androidConfig.setCertRSA(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].AndroidConfig.CertRSA"));
			androidConfig.setPackageName(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].AndroidConfig.PackageName"));
			mappCenterAppListItem.setAndroidConfig(androidConfig);

			IosConfig iosConfig = new IosConfig();
			iosConfig.setBundleId(_ctx.stringValue("ListMappCenterAppsResponse.ListMappCenterAppResult.MappCenterAppList["+ i +"].IosConfig.BundleId"));
			mappCenterAppListItem.setIosConfig(iosConfig);

			mappCenterAppList.add(mappCenterAppListItem);
		}
		listMappCenterAppResult.setMappCenterAppList(mappCenterAppList);
		listMappCenterAppsResponse.setListMappCenterAppResult(listMappCenterAppResult);
	 
	 	return listMappCenterAppsResponse;
	}
}