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

package com.aliyuncs.zhuque.transform.v20160701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.zhuque.model.v20160701.ListMachineTypeGroupResponse;
import com.aliyuncs.zhuque.model.v20160701.ListMachineTypeGroupResponse.MachineTypeGroupItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMachineTypeGroupResponseUnmarshaller {

	public static ListMachineTypeGroupResponse unmarshall(ListMachineTypeGroupResponse listMachineTypeGroupResponse, UnmarshallerContext context) {
		
		listMachineTypeGroupResponse.setRequestId(context.stringValue("ListMachineTypeGroupResponse.RequestId"));
		listMachineTypeGroupResponse.setResult(context.stringValue("ListMachineTypeGroupResponse.Result"));
		listMachineTypeGroupResponse.setMessage(context.stringValue("ListMachineTypeGroupResponse.Message"));

		List<MachineTypeGroupItem> machineTypeGroup = new ArrayList<MachineTypeGroupItem>();
		for (int i = 0; i < context.lengthValue("ListMachineTypeGroupResponse.MachineTypeGroup.Length"); i++) {
			MachineTypeGroupItem machineTypeGroupItem = new MachineTypeGroupItem();
			machineTypeGroupItem.setGroupName(context.stringValue("ListMachineTypeGroupResponse.MachineTypeGroup["+ i +"].GroupName"));
			machineTypeGroupItem.setMachineTypes(context.stringValue("ListMachineTypeGroupResponse.MachineTypeGroup["+ i +"].MachineTypes"));
			machineTypeGroupItem.setDescription(context.stringValue("ListMachineTypeGroupResponse.MachineTypeGroup["+ i +"].Description"));
			machineTypeGroupItem.setId(context.integerValue("ListMachineTypeGroupResponse.MachineTypeGroup["+ i +"].Id"));
			machineTypeGroupItem.setCreator(context.stringValue("ListMachineTypeGroupResponse.MachineTypeGroup["+ i +"].Creator"));
			machineTypeGroupItem.setModifier(context.stringValue("ListMachineTypeGroupResponse.MachineTypeGroup["+ i +"].Modifier"));
			machineTypeGroupItem.setCreateTime(context.stringValue("ListMachineTypeGroupResponse.MachineTypeGroup["+ i +"].CreateTime"));
			machineTypeGroupItem.setUpdateTime(context.stringValue("ListMachineTypeGroupResponse.MachineTypeGroup["+ i +"].UpdateTime"));

			List<String> machineTypeList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListMachineTypeGroupResponse.MachineTypeGroup["+ i +"].MachineTypeList.Length"); j++) {
				machineTypeList.add(context.stringValue("ListMachineTypeGroupResponse.MachineTypeGroup["+ i +"].MachineTypeList["+ j +"]"));
			}
			machineTypeGroupItem.setMachineTypeList(machineTypeList);

			machineTypeGroup.add(machineTypeGroupItem);
		}
		listMachineTypeGroupResponse.setMachineTypeGroup(machineTypeGroup);
	 
	 	return listMachineTypeGroupResponse;
	}
}