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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.CreateApplicationResponse;
import com.aliyuncs.mse.model.v20190531.CreateApplicationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApplicationResponseUnmarshaller {

	public static CreateApplicationResponse unmarshall(CreateApplicationResponse createApplicationResponse, UnmarshallerContext _ctx) {
		
		createApplicationResponse.setRequestId(_ctx.stringValue("CreateApplicationResponse.RequestId"));
		createApplicationResponse.setMessage(_ctx.stringValue("CreateApplicationResponse.Message"));
		createApplicationResponse.setCode(_ctx.integerValue("CreateApplicationResponse.Code"));
		createApplicationResponse.setSuccess(_ctx.stringValue("CreateApplicationResponse.Success"));
		createApplicationResponse.setHttpStatusCode(_ctx.integerValue("CreateApplicationResponse.HttpStatusCode"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("CreateApplicationResponse.Data.Status"));
		data.setExtraInfo(_ctx.stringValue("CreateApplicationResponse.Data.ExtraInfo"));
		data.setAppName(_ctx.stringValue("CreateApplicationResponse.Data.AppName"));
		data.setUpdateTime(_ctx.longValue("CreateApplicationResponse.Data.UpdateTime"));
		data.setLicenseKey(_ctx.stringValue("CreateApplicationResponse.Data.LicenseKey"));
		data.setCreateTime(_ctx.longValue("CreateApplicationResponse.Data.CreateTime"));
		data.setAppId(_ctx.stringValue("CreateApplicationResponse.Data.AppId"));
		data.setUserId(_ctx.stringValue("CreateApplicationResponse.Data.UserId"));
		data.setSource(_ctx.stringValue("CreateApplicationResponse.Data.Source"));
		data.setLanguage(_ctx.stringValue("CreateApplicationResponse.Data.Language"));
		data.setRegionId(_ctx.stringValue("CreateApplicationResponse.Data.RegionId"));
		createApplicationResponse.setData(data);
	 
	 	return createApplicationResponse;
	}
}