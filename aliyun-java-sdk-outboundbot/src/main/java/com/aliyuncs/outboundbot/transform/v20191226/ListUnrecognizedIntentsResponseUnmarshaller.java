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

import com.aliyuncs.outboundbot.model.v20191226.ListUnrecognizedIntentsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListUnrecognizedIntentsResponse.UnrecognizedIntents;
import com.aliyuncs.outboundbot.model.v20191226.ListUnrecognizedIntentsResponse.UnrecognizedIntents.UnrecognizedIntent;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUnrecognizedIntentsResponseUnmarshaller {

	public static ListUnrecognizedIntentsResponse unmarshall(ListUnrecognizedIntentsResponse listUnrecognizedIntentsResponse, UnmarshallerContext _ctx) {
		
		listUnrecognizedIntentsResponse.setRequestId(_ctx.stringValue("ListUnrecognizedIntentsResponse.RequestId"));
		listUnrecognizedIntentsResponse.setSuccess(_ctx.booleanValue("ListUnrecognizedIntentsResponse.Success"));
		listUnrecognizedIntentsResponse.setCode(_ctx.stringValue("ListUnrecognizedIntentsResponse.Code"));
		listUnrecognizedIntentsResponse.setMessage(_ctx.stringValue("ListUnrecognizedIntentsResponse.Message"));
		listUnrecognizedIntentsResponse.setHttpStatusCode(_ctx.integerValue("ListUnrecognizedIntentsResponse.HttpStatusCode"));

		UnrecognizedIntents unrecognizedIntents = new UnrecognizedIntents();
		unrecognizedIntents.setTotalCount(_ctx.integerValue("ListUnrecognizedIntentsResponse.UnrecognizedIntents.TotalCount"));
		unrecognizedIntents.setPageNumber(_ctx.integerValue("ListUnrecognizedIntentsResponse.UnrecognizedIntents.PageNumber"));
		unrecognizedIntents.setPageSize(_ctx.integerValue("ListUnrecognizedIntentsResponse.UnrecognizedIntents.PageSize"));

		List<UnrecognizedIntent> list = new ArrayList<UnrecognizedIntent>();
		for (int i = 0; i < _ctx.lengthValue("ListUnrecognizedIntentsResponse.UnrecognizedIntents.List.Length"); i++) {
			UnrecognizedIntent unrecognizedIntent = new UnrecognizedIntent();
			unrecognizedIntent.setQuestion(_ctx.stringValue("ListUnrecognizedIntentsResponse.UnrecognizedIntents.List["+ i +"].Question"));
			unrecognizedIntent.setNodeId(_ctx.stringValue("ListUnrecognizedIntentsResponse.UnrecognizedIntents.List["+ i +"].NodeId"));
			unrecognizedIntent.setTotalCount(_ctx.integerValue("ListUnrecognizedIntentsResponse.UnrecognizedIntents.List["+ i +"].TotalCount"));
			unrecognizedIntent.setUnrecognizedCount(_ctx.integerValue("ListUnrecognizedIntentsResponse.UnrecognizedIntents.List["+ i +"].UnrecognizedCount"));
			unrecognizedIntent.setUnrecognizedPercentage(_ctx.integerValue("ListUnrecognizedIntentsResponse.UnrecognizedIntents.List["+ i +"].UnrecognizedPercentage"));

			list.add(unrecognizedIntent);
		}
		unrecognizedIntents.setList(list);
		listUnrecognizedIntentsResponse.setUnrecognizedIntents(unrecognizedIntents);
	 
	 	return listUnrecognizedIntentsResponse;
	}
}