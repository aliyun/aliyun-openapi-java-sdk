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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ContextQueryLogResponse;
import com.aliyuncs.emr.model.v20160408.ContextQueryLogResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ContextQueryLogResponseUnmarshaller {

	public static ContextQueryLogResponse unmarshall(ContextQueryLogResponse contextQueryLogResponse, UnmarshallerContext _ctx) {
		
		contextQueryLogResponse.setRequestId(_ctx.stringValue("ContextQueryLogResponse.RequestId"));
		contextQueryLogResponse.setPackId(_ctx.stringValue("ContextQueryLogResponse.PackId"));
		contextQueryLogResponse.setPackMeta(_ctx.stringValue("ContextQueryLogResponse.PackMeta"));
		contextQueryLogResponse.setTime(_ctx.stringValue("ContextQueryLogResponse.Time"));

		List<Item> logs = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ContextQueryLogResponse.Logs.Length"); i++) {
			Item item = new Item();
			item.setIndex(_ctx.integerValue("ContextQueryLogResponse.Logs["+ i +"].Index"));
			item.setContent(_ctx.stringValue("ContextQueryLogResponse.Logs["+ i +"].Content"));

			logs.add(item);
		}
		contextQueryLogResponse.setLogs(logs);
	 
	 	return contextQueryLogResponse;
	}
}