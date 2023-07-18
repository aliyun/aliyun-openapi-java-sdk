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

package com.aliyuncs.ecs_workbench.transform.v20220220;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs_workbench.model.v20220220.LoginInstanceResponse;
import com.aliyuncs.ecs_workbench.model.v20220220.LoginInstanceResponse.Root;
import com.aliyuncs.ecs_workbench.model.v20220220.LoginInstanceResponse.Root.DisposableAccount;
import com.aliyuncs.ecs_workbench.model.v20220220.LoginInstanceResponse.Root.InstanceLoginInfoListItem;
import com.aliyuncs.ecs_workbench.model.v20220220.LoginInstanceResponse.Root.InstanceLoginInfoListItem.InstanceLoginView;
import com.aliyuncs.ecs_workbench.model.v20220220.LoginInstanceResponse.Root.SessionControl;
import com.aliyuncs.transform.UnmarshallerContext;


public class LoginInstanceResponseUnmarshaller {

	public static LoginInstanceResponse unmarshall(LoginInstanceResponse loginInstanceResponse, UnmarshallerContext _ctx) {
		
		loginInstanceResponse.setRequestId(_ctx.stringValue("LoginInstanceResponse.RequestId"));
		loginInstanceResponse.setSuccess(_ctx.stringValue("LoginInstanceResponse.Success"));
		loginInstanceResponse.setCode(_ctx.stringValue("LoginInstanceResponse.Code"));
		loginInstanceResponse.setMessage(_ctx.stringValue("LoginInstanceResponse.Message"));

		Root root = new Root();

		DisposableAccount disposableAccount = new DisposableAccount();
		disposableAccount.setLoginUrl(_ctx.stringValue("LoginInstanceResponse.Root.DisposableAccount.LoginUrl"));
		disposableAccount.setLoginFormActionUrl(_ctx.stringValue("LoginInstanceResponse.Root.DisposableAccount.LoginFormActionUrl"));
		root.setDisposableAccount(disposableAccount);

		SessionControl sessionControl = new SessionControl();
		sessionControl.setBaseUrl(_ctx.stringValue("LoginInstanceResponse.Root.SessionControl.BaseUrl"));
		root.setSessionControl(sessionControl);

		List<InstanceLoginInfoListItem> instanceLoginInfoList = new ArrayList<InstanceLoginInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("LoginInstanceResponse.Root.InstanceLoginInfoList.Length"); i++) {
			InstanceLoginInfoListItem instanceLoginInfoListItem = new InstanceLoginInfoListItem();
			instanceLoginInfoListItem.setInstanceId(_ctx.stringValue("LoginInstanceResponse.Root.InstanceLoginInfoList["+ i +"].InstanceId"));
			instanceLoginInfoListItem.setInstanceLoginToken(_ctx.stringValue("LoginInstanceResponse.Root.InstanceLoginInfoList["+ i +"].InstanceLoginToken"));
			instanceLoginInfoListItem.setLoginSuccess(_ctx.booleanValue("LoginInstanceResponse.Root.InstanceLoginInfoList["+ i +"].LoginSuccess"));

			InstanceLoginView instanceLoginView = new InstanceLoginView();
			instanceLoginView.setDefaultViewUrl(_ctx.stringValue("LoginInstanceResponse.Root.InstanceLoginInfoList["+ i +"].InstanceLoginView.DefaultViewUrl"));
			instanceLoginInfoListItem.setInstanceLoginView(instanceLoginView);

			instanceLoginInfoList.add(instanceLoginInfoListItem);
		}
		root.setInstanceLoginInfoList(instanceLoginInfoList);
		loginInstanceResponse.setRoot(root);
	 
	 	return loginInstanceResponse;
	}
}