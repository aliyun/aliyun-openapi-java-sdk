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

import com.aliyuncs.mhub.model.v20170825.CreateAppResponse;
import com.aliyuncs.mhub.model.v20170825.CreateAppResponse.AppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppResponseUnmarshaller {

	public static CreateAppResponse unmarshall(CreateAppResponse createAppResponse, UnmarshallerContext _ctx) {
		
		createAppResponse.setRequestId(_ctx.stringValue("CreateAppResponse.RequestId"));

		AppInfo appInfo = new AppInfo();
		appInfo.setProductId(_ctx.stringValue("CreateAppResponse.AppInfo.ProductId"));
		appInfo.setAppKey(_ctx.stringValue("CreateAppResponse.AppInfo.AppKey"));
		appInfo.setName(_ctx.stringValue("CreateAppResponse.AppInfo.Name"));
		appInfo.setType(_ctx.integerValue("CreateAppResponse.AppInfo.Type"));
		appInfo.setBundleId(_ctx.stringValue("CreateAppResponse.AppInfo.BundleId"));
		appInfo.setPackageName(_ctx.stringValue("CreateAppResponse.AppInfo.PackageName"));
		appInfo.setDescription(_ctx.stringValue("CreateAppResponse.AppInfo.Description"));
		appInfo.setCreateTime(_ctx.stringValue("CreateAppResponse.AppInfo.CreateTime"));
		appInfo.setModifyTime(_ctx.stringValue("CreateAppResponse.AppInfo.ModifyTime"));
		createAppResponse.setAppInfo(appInfo);
	 
	 	return createAppResponse;
	}
}