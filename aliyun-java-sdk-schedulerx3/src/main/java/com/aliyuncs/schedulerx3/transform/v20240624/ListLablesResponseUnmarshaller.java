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

package com.aliyuncs.schedulerx3.transform.v20240624;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx3.model.v20240624.ListLablesResponse;
import com.aliyuncs.schedulerx3.model.v20240624.ListLablesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLablesResponseUnmarshaller {

	public static ListLablesResponse unmarshall(ListLablesResponse listLablesResponse, UnmarshallerContext _ctx) {
		
		listLablesResponse.setRequestId(_ctx.stringValue("ListLablesResponse.RequestId"));
		listLablesResponse.setCode(_ctx.integerValue("ListLablesResponse.Code"));
		listLablesResponse.setMessage(_ctx.stringValue("ListLablesResponse.Message"));
		listLablesResponse.setSuccess(_ctx.booleanValue("ListLablesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLablesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setLabel(_ctx.stringValue("ListLablesResponse.Data["+ i +"].Label"));
			dataItem.setOnline(_ctx.booleanValue("ListLablesResponse.Data["+ i +"].Online"));
			dataItem.setSize(_ctx.integerValue("ListLablesResponse.Data["+ i +"].Size"));
			dataItem.setIsDesignated(_ctx.booleanValue("ListLablesResponse.Data["+ i +"].IsDesignated"));

			data.add(dataItem);
		}
		listLablesResponse.setData(data);
	 
	 	return listLablesResponse;
	}
}