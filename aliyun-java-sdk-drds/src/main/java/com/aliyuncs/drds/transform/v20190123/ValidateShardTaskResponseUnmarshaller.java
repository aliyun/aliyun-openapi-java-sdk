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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.ValidateShardTaskResponse;
import com.aliyuncs.drds.model.v20190123.ValidateShardTaskResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateShardTaskResponseUnmarshaller {

	public static ValidateShardTaskResponse unmarshall(ValidateShardTaskResponse validateShardTaskResponse, UnmarshallerContext _ctx) {
		
		validateShardTaskResponse.setRequestId(_ctx.stringValue("ValidateShardTaskResponse.RequestId"));
		validateShardTaskResponse.setSuccess(_ctx.booleanValue("ValidateShardTaskResponse.Success"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ValidateShardTaskResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setItem(_ctx.stringValue("ValidateShardTaskResponse.List["+ i +"].Item"));
			listItem.setResult(_ctx.integerValue("ValidateShardTaskResponse.List["+ i +"].Result"));

			list.add(listItem);
		}
		validateShardTaskResponse.setList(list);
	 
	 	return validateShardTaskResponse;
	}
}