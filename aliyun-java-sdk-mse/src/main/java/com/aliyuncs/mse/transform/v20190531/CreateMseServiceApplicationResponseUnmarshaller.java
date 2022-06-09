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

import com.aliyuncs.mse.model.v20190531.CreateMseServiceApplicationResponse;
import com.aliyuncs.mse.model.v20190531.CreateMseServiceApplicationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMseServiceApplicationResponseUnmarshaller {

	public static CreateMseServiceApplicationResponse unmarshall(CreateMseServiceApplicationResponse createMseServiceApplicationResponse, UnmarshallerContext _ctx) {
		
		createMseServiceApplicationResponse.setRequestId(_ctx.stringValue("CreateMseServiceApplicationResponse.RequestId"));
		createMseServiceApplicationResponse.setMessage(_ctx.stringValue("CreateMseServiceApplicationResponse.Message"));
		createMseServiceApplicationResponse.setCode(_ctx.integerValue("CreateMseServiceApplicationResponse.Code"));
		createMseServiceApplicationResponse.setSuccess(_ctx.stringValue("CreateMseServiceApplicationResponse.Success"));
		createMseServiceApplicationResponse.setHttpStatusCode(_ctx.integerValue("CreateMseServiceApplicationResponse.HttpStatusCode"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("CreateMseServiceApplicationResponse.Data.Status"));
		data.setExtraInfo(_ctx.stringValue("CreateMseServiceApplicationResponse.Data.ExtraInfo"));
		data.setAppName(_ctx.stringValue("CreateMseServiceApplicationResponse.Data.AppName"));
		data.setUpdateTime(_ctx.longValue("CreateMseServiceApplicationResponse.Data.UpdateTime"));
		data.setLicenseKey(_ctx.stringValue("CreateMseServiceApplicationResponse.Data.LicenseKey"));
		data.setCreateTime(_ctx.longValue("CreateMseServiceApplicationResponse.Data.CreateTime"));
		data.setAppId(_ctx.stringValue("CreateMseServiceApplicationResponse.Data.AppId"));
		data.setUserId(_ctx.stringValue("CreateMseServiceApplicationResponse.Data.UserId"));
		data.setSource(_ctx.stringValue("CreateMseServiceApplicationResponse.Data.Source"));
		data.setLanguage(_ctx.stringValue("CreateMseServiceApplicationResponse.Data.Language"));
		data.setRegionId(_ctx.stringValue("CreateMseServiceApplicationResponse.Data.RegionId"));
		data.setVersion(_ctx.stringValue("CreateMseServiceApplicationResponse.Data.Version"));
		createMseServiceApplicationResponse.setData(data);
	 
	 	return createMseServiceApplicationResponse;
	}
}