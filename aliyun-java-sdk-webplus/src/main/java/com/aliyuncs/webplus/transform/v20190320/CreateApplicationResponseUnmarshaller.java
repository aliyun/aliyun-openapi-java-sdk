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

package com.aliyuncs.webplus.transform.v20190320;

import com.aliyuncs.webplus.model.v20190320.CreateApplicationResponse;
import com.aliyuncs.webplus.model.v20190320.CreateApplicationResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApplicationResponseUnmarshaller {

	public static CreateApplicationResponse unmarshall(CreateApplicationResponse createApplicationResponse, UnmarshallerContext _ctx) {
		
		createApplicationResponse.setRequestId(_ctx.stringValue("CreateApplicationResponse.RequestId"));
		createApplicationResponse.setCode(_ctx.stringValue("CreateApplicationResponse.Code"));
		createApplicationResponse.setMessage(_ctx.stringValue("CreateApplicationResponse.Message"));

		Application application = new Application();
		application.setAppId(_ctx.stringValue("CreateApplicationResponse.Application.AppId"));
		application.setAppName(_ctx.stringValue("CreateApplicationResponse.Application.AppName"));
		application.setAppDescription(_ctx.stringValue("CreateApplicationResponse.Application.AppDescription"));
		application.setCategoryName(_ctx.stringValue("CreateApplicationResponse.Application.CategoryName"));
		application.setCreateUsername(_ctx.stringValue("CreateApplicationResponse.Application.CreateUsername"));
		application.setUpdateUsername(_ctx.stringValue("CreateApplicationResponse.Application.UpdateUsername"));
		application.setCreateTime(_ctx.longValue("CreateApplicationResponse.Application.CreateTime"));
		application.setUpdateTime(_ctx.longValue("CreateApplicationResponse.Application.UpdateTime"));
		createApplicationResponse.setApplication(application);
	 
	 	return createApplicationResponse;
	}
}