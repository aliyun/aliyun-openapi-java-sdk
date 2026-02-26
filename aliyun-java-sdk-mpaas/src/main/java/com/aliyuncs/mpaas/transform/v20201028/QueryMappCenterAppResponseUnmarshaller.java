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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.QueryMappCenterAppResponse;
import com.aliyuncs.mpaas.model.v20201028.QueryMappCenterAppResponse.QueryMappCenterAppResult;
import com.aliyuncs.mpaas.model.v20201028.QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp;
import com.aliyuncs.mpaas.model.v20201028.QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AndroidConfig;
import com.aliyuncs.mpaas.model.v20201028.QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.IosConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMappCenterAppResponseUnmarshaller {

	public static QueryMappCenterAppResponse unmarshall(QueryMappCenterAppResponse queryMappCenterAppResponse, UnmarshallerContext _ctx) {
		
		queryMappCenterAppResponse.setRequestId(_ctx.stringValue("QueryMappCenterAppResponse.RequestId"));
		queryMappCenterAppResponse.setResultMessage(_ctx.stringValue("QueryMappCenterAppResponse.ResultMessage"));
		queryMappCenterAppResponse.setResultCode(_ctx.stringValue("QueryMappCenterAppResponse.ResultCode"));

		QueryMappCenterAppResult queryMappCenterAppResult = new QueryMappCenterAppResult();
		queryMappCenterAppResult.setSuccess(_ctx.booleanValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.Success"));
		queryMappCenterAppResult.setResultMsg(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.ResultMsg"));

		MappCenterApp mappCenterApp = new MappCenterApp();
		mappCenterApp.setType(_ctx.longValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.Type"));
		mappCenterApp.setStatus(_ctx.longValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.Status"));
		mappCenterApp.setGmtModified(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.GmtModified"));
		mappCenterApp.setAppDesc(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AppDesc"));
		mappCenterApp.setCreator(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.Creator"));
		mappCenterApp.setAppIcon(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AppIcon"));
		mappCenterApp.setAppName(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AppName"));
		mappCenterApp.setAppSecret(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AppSecret"));
		mappCenterApp.setModifier(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.Modifier"));
		mappCenterApp.setAppId(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AppId"));
		mappCenterApp.setMonitorJson(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.MonitorJson"));
		mappCenterApp.setGmtCreate(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.GmtCreate"));
		mappCenterApp.setId(_ctx.longValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.Id"));
		mappCenterApp.setTenantId(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.TenantId"));

		AndroidConfig androidConfig = new AndroidConfig();
		androidConfig.setPackageName(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AndroidConfig.PackageName"));
		androidConfig.setCertRSA(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AndroidConfig.CertRSA"));
		mappCenterApp.setAndroidConfig(androidConfig);

		IosConfig iosConfig = new IosConfig();
		iosConfig.setBundleId(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.IosConfig.BundleId"));
		mappCenterApp.setIosConfig(iosConfig);
		queryMappCenterAppResult.setMappCenterApp(mappCenterApp);
		queryMappCenterAppResponse.setQueryMappCenterAppResult(queryMappCenterAppResult);
	 
	 	return queryMappCenterAppResponse;
	}
}