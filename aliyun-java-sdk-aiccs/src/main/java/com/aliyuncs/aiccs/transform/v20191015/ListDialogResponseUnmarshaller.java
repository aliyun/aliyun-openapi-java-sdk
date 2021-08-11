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

import com.aliyuncs.aiccs.model.v20191015.ListDialogResponse;
import com.aliyuncs.aiccs.model.v20191015.ListDialogResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDialogResponseUnmarshaller {

	public static ListDialogResponse unmarshall(ListDialogResponse listDialogResponse, UnmarshallerContext _ctx) {
		
		listDialogResponse.setRequestId(_ctx.stringValue("ListDialogResponse.RequestId"));
		listDialogResponse.setCode(_ctx.stringValue("ListDialogResponse.Code"));
		listDialogResponse.setMessage(_ctx.stringValue("ListDialogResponse.Message"));
		listDialogResponse.setSuccess(_ctx.booleanValue("ListDialogResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDialogResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRole(_ctx.stringValue("ListDialogResponse.Data["+ i +"].Role"));
			dataItem.setContent(_ctx.stringValue("ListDialogResponse.Data["+ i +"].Content"));
			dataItem.setNodeType(_ctx.stringValue("ListDialogResponse.Data["+ i +"].NodeType"));
			dataItem.setTime(_ctx.stringValue("ListDialogResponse.Data["+ i +"].Time"));
			dataItem.setTag(_ctx.stringValue("ListDialogResponse.Data["+ i +"].Tag"));

			data.add(dataItem);
		}
		listDialogResponse.setData(data);
	 
	 	return listDialogResponse;
	}
}