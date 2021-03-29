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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.GetGrayAppsResponse;
import com.aliyuncs.edas.model.v20170801.GetGrayAppsResponse.Data;
import com.aliyuncs.edas.model.v20170801.GetGrayAppsResponse.Data.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGrayAppsResponseUnmarshaller {

	public static GetGrayAppsResponse unmarshall(GetGrayAppsResponse getGrayAppsResponse, UnmarshallerContext _ctx) {
		
		getGrayAppsResponse.setRequestId(_ctx.stringValue("GetGrayAppsResponse.RequestId"));
		getGrayAppsResponse.setCode(_ctx.integerValue("GetGrayAppsResponse.Code"));
		getGrayAppsResponse.setMessage(_ctx.stringValue("GetGrayAppsResponse.Message"));

		Data data = new Data();

		Result result = new Result();
		result.setAppId(_ctx.stringValue("GetGrayAppsResponse.Data.Result.AppId"));
		result.setApplicationType(_ctx.stringValue("GetGrayAppsResponse.Data.Result.ApplicationType"));
		result.setAppname(_ctx.stringValue("GetGrayAppsResponse.Data.Result.Appname"));
		result.setDefaultGroupId(_ctx.stringValue("GetGrayAppsResponse.Data.Result.DefaultGroupId"));
		result.setPackageVersion(_ctx.stringValue("GetGrayAppsResponse.Data.Result.PackageVersion"));
		result.setRegionId(_ctx.stringValue("GetGrayAppsResponse.Data.Result.RegionId"));
		result.setDevelopType(_ctx.stringValue("GetGrayAppsResponse.Data.Result.DevelopType"));
		data.setResult(result);
		getGrayAppsResponse.setData(data);
	 
	 	return getGrayAppsResponse;
	}
}