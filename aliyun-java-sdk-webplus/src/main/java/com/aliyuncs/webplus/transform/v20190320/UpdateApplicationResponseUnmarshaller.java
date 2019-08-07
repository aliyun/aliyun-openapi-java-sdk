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

import com.aliyuncs.webplus.model.v20190320.UpdateApplicationResponse;
import com.aliyuncs.webplus.model.v20190320.UpdateApplicationResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateApplicationResponseUnmarshaller {

	public static UpdateApplicationResponse unmarshall(UpdateApplicationResponse updateApplicationResponse, UnmarshallerContext _ctx) {
		
		updateApplicationResponse.setRequestId(_ctx.stringValue("UpdateApplicationResponse.RequestId"));
		updateApplicationResponse.setCode(_ctx.stringValue("UpdateApplicationResponse.Code"));
		updateApplicationResponse.setMessage(_ctx.stringValue("UpdateApplicationResponse.Message"));

		Application application = new Application();
		application.setAppId(_ctx.stringValue("UpdateApplicationResponse.Application.AppId"));
		application.setAppName(_ctx.stringValue("UpdateApplicationResponse.Application.AppName"));
		application.setAppDescription(_ctx.stringValue("UpdateApplicationResponse.Application.AppDescription"));
		application.setCategoryName(_ctx.stringValue("UpdateApplicationResponse.Application.CategoryName"));
		application.setCreateUsername(_ctx.stringValue("UpdateApplicationResponse.Application.CreateUsername"));
		application.setUpdateUsername(_ctx.stringValue("UpdateApplicationResponse.Application.UpdateUsername"));
		application.setCreateTime(_ctx.longValue("UpdateApplicationResponse.Application.CreateTime"));
		application.setUpdateTime(_ctx.longValue("UpdateApplicationResponse.Application.UpdateTime"));
		updateApplicationResponse.setApplication(application);
	 
	 	return updateApplicationResponse;
	}
}