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

import com.aliyuncs.dbfs.model.v20200418.ListDbfsAttachableEcsInstancesResponse;
import com.aliyuncs.dbfs.model.v20200418.ListDbfsAttachableEcsInstancesResponse.LabelInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDbfsAttachableEcsInstancesResponseUnmarshaller {

	public static ListDbfsAttachableEcsInstancesResponse unmarshall(ListDbfsAttachableEcsInstancesResponse listDbfsAttachableEcsInstancesResponse, UnmarshallerContext _ctx) {
		
		listDbfsAttachableEcsInstancesResponse.setRequestId(_ctx.stringValue("ListDbfsAttachableEcsInstancesResponse.RequestId"));
		listDbfsAttachableEcsInstancesResponse.setTotalCount(_ctx.integerValue("ListDbfsAttachableEcsInstancesResponse.TotalCount"));

		List<LabelInfo> ecsLabelInfo = new ArrayList<LabelInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDbfsAttachableEcsInstancesResponse.EcsLabelInfo.Length"); i++) {
			LabelInfo labelInfo = new LabelInfo();
			labelInfo.setValue(_ctx.stringValue("ListDbfsAttachableEcsInstancesResponse.EcsLabelInfo["+ i +"].value"));
			labelInfo.setLabel(_ctx.stringValue("ListDbfsAttachableEcsInstancesResponse.EcsLabelInfo["+ i +"].label"));
			labelInfo.setInstanceTypeFamily(_ctx.stringValue("ListDbfsAttachableEcsInstancesResponse.EcsLabelInfo["+ i +"].InstanceTypeFamily"));
			labelInfo.setOSName(_ctx.stringValue("ListDbfsAttachableEcsInstancesResponse.EcsLabelInfo["+ i +"].OSName"));
			labelInfo.setStatus(_ctx.stringValue("ListDbfsAttachableEcsInstancesResponse.EcsLabelInfo["+ i +"].Status"));
			labelInfo.setZoneId(_ctx.stringValue("ListDbfsAttachableEcsInstancesResponse.EcsLabelInfo["+ i +"].ZoneId"));

			ecsLabelInfo.add(labelInfo);
		}
		listDbfsAttachableEcsInstancesResponse.setEcsLabelInfo(ecsLabelInfo);
	 
	 	return listDbfsAttachableEcsInstancesResponse;
	}
}