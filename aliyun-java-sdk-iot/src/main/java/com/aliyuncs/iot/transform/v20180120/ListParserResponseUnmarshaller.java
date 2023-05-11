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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListParserResponse;
import com.aliyuncs.iot.model.v20180120.ListParserResponse.ParserList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListParserResponseUnmarshaller {

	public static ListParserResponse unmarshall(ListParserResponse listParserResponse, UnmarshallerContext _ctx) {
		
		listParserResponse.setRequestId(_ctx.stringValue("ListParserResponse.RequestId"));
		listParserResponse.setSuccess(_ctx.booleanValue("ListParserResponse.Success"));
		listParserResponse.setCode(_ctx.stringValue("ListParserResponse.Code"));
		listParserResponse.setErrorMessage(_ctx.stringValue("ListParserResponse.ErrorMessage"));
		listParserResponse.setTotal(_ctx.integerValue("ListParserResponse.Total"));

		List<ParserList> data = new ArrayList<ParserList>();
		for (int i = 0; i < _ctx.lengthValue("ListParserResponse.Data.Length"); i++) {
			ParserList parserList = new ParserList();
			parserList.setName(_ctx.stringValue("ListParserResponse.Data["+ i +"].Name"));
			parserList.setParserId(_ctx.longValue("ListParserResponse.Data["+ i +"].ParserId"));
			parserList.setDescription(_ctx.stringValue("ListParserResponse.Data["+ i +"].Description"));
			parserList.setStatus(_ctx.stringValue("ListParserResponse.Data["+ i +"].Status"));
			parserList.setUtcCreated(_ctx.stringValue("ListParserResponse.Data["+ i +"].UtcCreated"));
			parserList.setUtcModified(_ctx.stringValue("ListParserResponse.Data["+ i +"].UtcModified"));

			data.add(parserList);
		}
		listParserResponse.setData(data);
	 
	 	return listParserResponse;
	}
}