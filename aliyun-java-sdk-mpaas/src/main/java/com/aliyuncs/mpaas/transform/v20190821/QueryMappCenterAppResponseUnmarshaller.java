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

import com.aliyuncs.mpaas.model.v20190821.QueryMappCenterAppResponse;
import com.aliyuncs.mpaas.model.v20190821.QueryMappCenterAppResponse.QueryMappCenterAppResult;
import com.aliyuncs.mpaas.model.v20190821.QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp;
import com.aliyuncs.mpaas.model.v20190821.QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AndroidConfig;
import com.aliyuncs.mpaas.model.v20190821.QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.IosConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMappCenterAppResponseUnmarshaller {

	public static QueryMappCenterAppResponse unmarshall(QueryMappCenterAppResponse queryMappCenterAppResponse, UnmarshallerContext _ctx) {
		
		queryMappCenterAppResponse.setRequestId(_ctx.stringValue("QueryMappCenterAppResponse.RequestId"));
		queryMappCenterAppResponse.setResultCode(_ctx.stringValue("QueryMappCenterAppResponse.ResultCode"));
		queryMappCenterAppResponse.setResultMessage(_ctx.stringValue("QueryMappCenterAppResponse.ResultMessage"));

		QueryMappCenterAppResult queryMappCenterAppResult = new QueryMappCenterAppResult();
		queryMappCenterAppResult.setResultMsg(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.ResultMsg"));
		queryMappCenterAppResult.setSuccess(_ctx.booleanValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.Success"));

		MappCenterApp mappCenterApp = new MappCenterApp();
		mappCenterApp.setAppDesc(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AppDesc"));
		mappCenterApp.setAppIcon(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AppIcon"));
		mappCenterApp.setAppId(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AppId"));
		mappCenterApp.setAppName(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AppName"));
		mappCenterApp.setAppSecret(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AppSecret"));
		mappCenterApp.setCreator(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.Creator"));
		mappCenterApp.setGmtCreate(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.GmtCreate"));
		mappCenterApp.setGmtModified(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.GmtModified"));
		mappCenterApp.setId(_ctx.longValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.Id"));
		mappCenterApp.setModifier(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.Modifier"));
		mappCenterApp.setMonitorJson(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.MonitorJson"));
		mappCenterApp.setStatus(_ctx.longValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.Status"));
		mappCenterApp.setTenantId(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.TenantId"));
		mappCenterApp.setType(_ctx.longValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.Type"));

		AndroidConfig androidConfig = new AndroidConfig();
		androidConfig.setCertRSA(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AndroidConfig.CertRSA"));
		androidConfig.setPackageName(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.AndroidConfig.PackageName"));
		mappCenterApp.setAndroidConfig(androidConfig);

		IosConfig iosConfig = new IosConfig();
		iosConfig.setBundleId(_ctx.stringValue("QueryMappCenterAppResponse.QueryMappCenterAppResult.MappCenterApp.IosConfig.BundleId"));
		mappCenterApp.setIosConfig(iosConfig);
		queryMappCenterAppResult.setMappCenterApp(mappCenterApp);
		queryMappCenterAppResponse.setQueryMappCenterAppResult(queryMappCenterAppResult);
	 
	 	return queryMappCenterAppResponse;
	}
}