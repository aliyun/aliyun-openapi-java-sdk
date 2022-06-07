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

package com.aliyuncs.appstream_center.transform.v20210901;

import com.aliyuncs.appstream_center.model.v20210901.CreateAppInstanceGroupResponse;
import com.aliyuncs.appstream_center.model.v20210901.CreateAppInstanceGroupResponse.AppInstanceGroupModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppInstanceGroupResponseUnmarshaller {

	public static CreateAppInstanceGroupResponse unmarshall(CreateAppInstanceGroupResponse createAppInstanceGroupResponse, UnmarshallerContext _ctx) {
		
		createAppInstanceGroupResponse.setRequestId(_ctx.stringValue("CreateAppInstanceGroupResponse.RequestId"));

		AppInstanceGroupModel appInstanceGroupModel = new AppInstanceGroupModel();
		appInstanceGroupModel.setAppInstanceGroupId(_ctx.stringValue("CreateAppInstanceGroupResponse.AppInstanceGroupModel.AppInstanceGroupId"));
		appInstanceGroupModel.setOrderId(_ctx.stringValue("CreateAppInstanceGroupResponse.AppInstanceGroupModel.OrderId"));
		appInstanceGroupModel.setSpecId(_ctx.stringValue("CreateAppInstanceGroupResponse.AppInstanceGroupModel.SpecId"));
		appInstanceGroupModel.setNodePoolId(_ctx.stringValue("CreateAppInstanceGroupResponse.AppInstanceGroupModel.NodePoolId"));
		createAppInstanceGroupResponse.setAppInstanceGroupModel(appInstanceGroupModel);
	 
	 	return createAppInstanceGroupResponse;
	}
}