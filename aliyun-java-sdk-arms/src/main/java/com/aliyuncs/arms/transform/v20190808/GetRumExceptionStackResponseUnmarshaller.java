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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetRumExceptionStackResponse;
import com.aliyuncs.arms.model.v20190808.GetRumExceptionStackResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRumExceptionStackResponseUnmarshaller {

	public static GetRumExceptionStackResponse unmarshall(GetRumExceptionStackResponse getRumExceptionStackResponse, UnmarshallerContext _ctx) {
		
		getRumExceptionStackResponse.setRequestId(_ctx.stringValue("GetRumExceptionStackResponse.RequestId"));
		getRumExceptionStackResponse.setCode(_ctx.stringValue("GetRumExceptionStackResponse.Code"));
		getRumExceptionStackResponse.setSuccess(_ctx.stringValue("GetRumExceptionStackResponse.Success"));
		getRumExceptionStackResponse.setMessage(_ctx.stringValue("GetRumExceptionStackResponse.Message"));
		getRumExceptionStackResponse.setHttpStatusCode(_ctx.stringValue("GetRumExceptionStackResponse.HttpStatusCode"));

		Data data = new Data();
		data.setThreadId(_ctx.stringValue("GetRumExceptionStackResponse.Data.ThreadId"));

		List<String> lines = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRumExceptionStackResponse.Data.Lines.Length"); i++) {
			lines.add(_ctx.stringValue("GetRumExceptionStackResponse.Data.Lines["+ i +"]"));
		}
		data.setLines(lines);
		getRumExceptionStackResponse.setData(data);
	 
	 	return getRumExceptionStackResponse;
	}
}