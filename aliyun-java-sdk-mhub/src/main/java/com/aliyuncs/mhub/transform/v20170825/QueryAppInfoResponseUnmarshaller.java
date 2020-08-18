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

package com.aliyuncs.mhub.transform.v20170825;

import com.aliyuncs.mhub.model.v20170825.QueryAppInfoResponse;
import com.aliyuncs.mhub.model.v20170825.QueryAppInfoResponse.AppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAppInfoResponseUnmarshaller {

	public static QueryAppInfoResponse unmarshall(QueryAppInfoResponse queryAppInfoResponse, UnmarshallerContext _ctx) {
		
		queryAppInfoResponse.setRequestId(_ctx.stringValue("QueryAppInfoResponse.RequestId"));

		AppInfo appInfo = new AppInfo();
		appInfo.setAppKey(_ctx.stringValue("QueryAppInfoResponse.AppInfo.AppKey"));
		appInfo.setAppName(_ctx.stringValue("QueryAppInfoResponse.AppInfo.AppName"));
		appInfo.setType(_ctx.integerValue("QueryAppInfoResponse.AppInfo.Type"));
		appInfo.setReadonly(_ctx.booleanValue("QueryAppInfoResponse.AppInfo.Readonly"));
		appInfo.setBundleId(_ctx.stringValue("QueryAppInfoResponse.AppInfo.BundleId"));
		appInfo.setPackageName(_ctx.stringValue("QueryAppInfoResponse.AppInfo.PackageName"));
		appInfo.setCertDevelopAvail(_ctx.booleanValue("QueryAppInfoResponse.AppInfo.CertDevelopAvail"));
		appInfo.setCertDevelopExpiration(_ctx.stringValue("QueryAppInfoResponse.AppInfo.CertDevelopExpiration"));
		appInfo.setCertProductAvail(_ctx.booleanValue("QueryAppInfoResponse.AppInfo.CertProductAvail"));
		appInfo.setCertProductExpiration(_ctx.stringValue("QueryAppInfoResponse.AppInfo.CertProductExpiration"));
		queryAppInfoResponse.setAppInfo(appInfo);
	 
	 	return queryAppInfoResponse;
	}
}