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

package com.aliyuncs.ehpc.transform.v20180412;

import com.aliyuncs.ehpc.model.v20180412.GetWorkbenchTokenResponse;
import com.aliyuncs.ehpc.model.v20180412.GetWorkbenchTokenResponse.Root;
import com.aliyuncs.ehpc.model.v20180412.GetWorkbenchTokenResponse.Root.InstanceLoginView;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkbenchTokenResponseUnmarshaller {

	public static GetWorkbenchTokenResponse unmarshall(GetWorkbenchTokenResponse getWorkbenchTokenResponse, UnmarshallerContext _ctx) {
		
		getWorkbenchTokenResponse.setRequestId(_ctx.stringValue("GetWorkbenchTokenResponse.RequestId"));

		Root root = new Root();

		InstanceLoginView instanceLoginView = new InstanceLoginView();
		instanceLoginView.setViewName(_ctx.stringValue("GetWorkbenchTokenResponse.root.instanceLoginView.viewName"));
		instanceLoginView.setDefaultViewUrl(_ctx.stringValue("GetWorkbenchTokenResponse.root.instanceLoginView.defaultViewUrl"));
		instanceLoginView.setBaseViewUrl(_ctx.stringValue("GetWorkbenchTokenResponse.root.instanceLoginView.baseViewUrl"));
		instanceLoginView.setTerminalViewUrl(_ctx.stringValue("GetWorkbenchTokenResponse.root.instanceLoginView.terminalViewUrl"));
		instanceLoginView.setFileTreeViewUrl(_ctx.stringValue("GetWorkbenchTokenResponse.root.instanceLoginView.fileTreeViewUrl"));
		instanceLoginView.setRdpViewUrl(_ctx.stringValue("GetWorkbenchTokenResponse.root.instanceLoginView.rdpViewUrl"));
		root.setInstanceLoginView(instanceLoginView);
		getWorkbenchTokenResponse.setRoot(root);
	 
	 	return getWorkbenchTokenResponse;
	}
}