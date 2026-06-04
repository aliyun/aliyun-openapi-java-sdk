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

import com.aliyuncs.websitebuild.model.v20250429.GetAppSeoTrendsResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppSeoTrendsResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppSeoTrendsResponseUnmarshaller {

	public static GetAppSeoTrendsResponse unmarshall(GetAppSeoTrendsResponse getAppSeoTrendsResponse, UnmarshallerContext _ctx) {
		
		getAppSeoTrendsResponse.setRequestId(_ctx.stringValue("GetAppSeoTrendsResponse.RequestId"));
		getAppSeoTrendsResponse.setDynamicCode(_ctx.stringValue("GetAppSeoTrendsResponse.DynamicCode"));
		getAppSeoTrendsResponse.setDynamicMessage(_ctx.stringValue("GetAppSeoTrendsResponse.DynamicMessage"));
		getAppSeoTrendsResponse.setSynchro(_ctx.booleanValue("GetAppSeoTrendsResponse.Synchro"));
		getAppSeoTrendsResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppSeoTrendsResponse.AccessDeniedDetail"));
		getAppSeoTrendsResponse.setRootErrorMsg(_ctx.stringValue("GetAppSeoTrendsResponse.RootErrorMsg"));
		getAppSeoTrendsResponse.setRootErrorCode(_ctx.stringValue("GetAppSeoTrendsResponse.RootErrorCode"));
		getAppSeoTrendsResponse.setAllowRetry(_ctx.booleanValue("GetAppSeoTrendsResponse.AllowRetry"));
		getAppSeoTrendsResponse.setAppName(_ctx.stringValue("GetAppSeoTrendsResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppSeoTrendsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppSeoTrendsResponse.ErrorArgs["+ i +"]"));
		}
		getAppSeoTrendsResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setBaiduIndexTrends(_ctx.stringValue("GetAppSeoTrendsResponse.Module.BaiduIndexTrends"));
		module.setGoogleIndexTrends(_ctx.stringValue("GetAppSeoTrendsResponse.Module.GoogleIndexTrends"));
		module.setBingIndexTrends(_ctx.stringValue("GetAppSeoTrendsResponse.Module.BingIndexTrends"));
		getAppSeoTrendsResponse.setModule(module);
	 
	 	return getAppSeoTrendsResponse;
	}
}