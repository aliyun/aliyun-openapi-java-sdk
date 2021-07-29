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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.ListRobotCallDialogResponse;
import com.aliyuncs.aiccs.model.v20191015.ListRobotCallDialogResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRobotCallDialogResponseUnmarshaller {

	public static ListRobotCallDialogResponse unmarshall(ListRobotCallDialogResponse listRobotCallDialogResponse, UnmarshallerContext _ctx) {
		
		listRobotCallDialogResponse.setRequestId(_ctx.stringValue("ListRobotCallDialogResponse.RequestId"));
		listRobotCallDialogResponse.setCode(_ctx.stringValue("ListRobotCallDialogResponse.Code"));
		listRobotCallDialogResponse.setMessage(_ctx.stringValue("ListRobotCallDialogResponse.Message"));
		listRobotCallDialogResponse.setSuccess(_ctx.booleanValue("ListRobotCallDialogResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRobotCallDialogResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRole(_ctx.stringValue("ListRobotCallDialogResponse.Data["+ i +"].Role"));
			dataItem.setContent(_ctx.stringValue("ListRobotCallDialogResponse.Data["+ i +"].Content"));
			dataItem.setNodeType(_ctx.stringValue("ListRobotCallDialogResponse.Data["+ i +"].NodeType"));
			dataItem.setTime(_ctx.stringValue("ListRobotCallDialogResponse.Data["+ i +"].Time"));
			dataItem.setTag(_ctx.stringValue("ListRobotCallDialogResponse.Data["+ i +"].Tag"));

			data.add(dataItem);
		}
		listRobotCallDialogResponse.setData(data);
	 
	 	return listRobotCallDialogResponse;
	}
}