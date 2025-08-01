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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.CreateAndroidInstanceGroupResponse;
import com.aliyuncs.eds_aic.model.v20230930.CreateAndroidInstanceGroupResponse.InstanceGroupInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAndroidInstanceGroupResponseUnmarshaller {

	public static CreateAndroidInstanceGroupResponse unmarshall(CreateAndroidInstanceGroupResponse createAndroidInstanceGroupResponse, UnmarshallerContext _ctx) {
		
		createAndroidInstanceGroupResponse.setRequestId(_ctx.stringValue("CreateAndroidInstanceGroupResponse.RequestId"));
		createAndroidInstanceGroupResponse.setOrderId(_ctx.stringValue("CreateAndroidInstanceGroupResponse.OrderId"));

		List<String> instanceGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAndroidInstanceGroupResponse.InstanceGroupIds.Length"); i++) {
			instanceGroupIds.add(_ctx.stringValue("CreateAndroidInstanceGroupResponse.InstanceGroupIds["+ i +"]"));
		}
		createAndroidInstanceGroupResponse.setInstanceGroupIds(instanceGroupIds);

		List<InstanceGroupInfosItem> instanceGroupInfos = new ArrayList<InstanceGroupInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateAndroidInstanceGroupResponse.InstanceGroupInfos.Length"); i++) {
			InstanceGroupInfosItem instanceGroupInfosItem = new InstanceGroupInfosItem();
			instanceGroupInfosItem.setInstanceGroupId(_ctx.stringValue("CreateAndroidInstanceGroupResponse.InstanceGroupInfos["+ i +"].InstanceGroupId"));

			List<String> instanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateAndroidInstanceGroupResponse.InstanceGroupInfos["+ i +"].InstanceIds.Length"); j++) {
				instanceIds.add(_ctx.stringValue("CreateAndroidInstanceGroupResponse.InstanceGroupInfos["+ i +"].InstanceIds["+ j +"]"));
			}
			instanceGroupInfosItem.setInstanceIds(instanceIds);

			instanceGroupInfos.add(instanceGroupInfosItem);
		}
		createAndroidInstanceGroupResponse.setInstanceGroupInfos(instanceGroupInfos);
	 
	 	return createAndroidInstanceGroupResponse;
	}
}