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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.CreateInstanceBindNumberResponse;
import com.aliyuncs.outboundbot.model.v20191226.CreateInstanceBindNumberResponse.Data;
import com.aliyuncs.outboundbot.model.v20191226.CreateInstanceBindNumberResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstanceBindNumberResponseUnmarshaller {

	public static CreateInstanceBindNumberResponse unmarshall(CreateInstanceBindNumberResponse createInstanceBindNumberResponse, UnmarshallerContext _ctx) {
		
		createInstanceBindNumberResponse.setRequestId(_ctx.stringValue("CreateInstanceBindNumberResponse.RequestId"));
		createInstanceBindNumberResponse.setSuccess(_ctx.booleanValue("CreateInstanceBindNumberResponse.Success"));
		createInstanceBindNumberResponse.setCode(_ctx.stringValue("CreateInstanceBindNumberResponse.Code"));
		createInstanceBindNumberResponse.setMessage(_ctx.stringValue("CreateInstanceBindNumberResponse.Message"));
		createInstanceBindNumberResponse.setHttpStatusCode(_ctx.integerValue("CreateInstanceBindNumberResponse.HttpStatusCode"));

		Data data = new Data();

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateInstanceBindNumberResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setInstanceId(_ctx.stringValue("CreateInstanceBindNumberResponse.Data.List["+ i +"].InstanceId"));
			listItem.setSuccess(_ctx.booleanValue("CreateInstanceBindNumberResponse.Data.List["+ i +"].Success"));

			list.add(listItem);
		}
		data.setList(list);
		createInstanceBindNumberResponse.setData(data);
	 
	 	return createInstanceBindNumberResponse;
	}
}