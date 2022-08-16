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

package com.aliyuncs.dbfs.transform.v20200418;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbfs.model.v20200418.ListDbfsAttachedEcsInstancesResponse;
import com.aliyuncs.dbfs.model.v20200418.ListDbfsAttachedEcsInstancesResponse.LabelInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDbfsAttachedEcsInstancesResponseUnmarshaller {

	public static ListDbfsAttachedEcsInstancesResponse unmarshall(ListDbfsAttachedEcsInstancesResponse listDbfsAttachedEcsInstancesResponse, UnmarshallerContext _ctx) {
		
		listDbfsAttachedEcsInstancesResponse.setRequestId(_ctx.stringValue("ListDbfsAttachedEcsInstancesResponse.RequestId"));

		List<LabelInfo> ecsLabelInfo = new ArrayList<LabelInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDbfsAttachedEcsInstancesResponse.EcsLabelInfo.Length"); i++) {
			LabelInfo labelInfo = new LabelInfo();
			labelInfo.setMountPoint(_ctx.stringValue("ListDbfsAttachedEcsInstancesResponse.EcsLabelInfo["+ i +"].MountPoint"));
			labelInfo.setValue(_ctx.stringValue("ListDbfsAttachedEcsInstancesResponse.EcsLabelInfo["+ i +"].value"));
			labelInfo.setLabel(_ctx.stringValue("ListDbfsAttachedEcsInstancesResponse.EcsLabelInfo["+ i +"].label"));
			labelInfo.setMountedTime(_ctx.stringValue("ListDbfsAttachedEcsInstancesResponse.EcsLabelInfo["+ i +"].MountedTime"));
			labelInfo.setInstanceTypeFamily(_ctx.stringValue("ListDbfsAttachedEcsInstancesResponse.EcsLabelInfo["+ i +"].InstanceTypeFamily"));
			labelInfo.setOSName(_ctx.stringValue("ListDbfsAttachedEcsInstancesResponse.EcsLabelInfo["+ i +"].OSName"));

			ecsLabelInfo.add(labelInfo);
		}
		listDbfsAttachedEcsInstancesResponse.setEcsLabelInfo(ecsLabelInfo);
	 
	 	return listDbfsAttachedEcsInstancesResponse;
	}
}