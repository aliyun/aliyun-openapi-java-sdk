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

package com.aliyuncs.schedulerx2.transform.v20190430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx2.model.v20190430.GetLogResponse;
import com.aliyuncs.schedulerx2.model.v20190430.GetLogResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLogResponseUnmarshaller {

	public static GetLogResponse unmarshall(GetLogResponse getLogResponse, UnmarshallerContext _ctx) {
		
		getLogResponse.setRequestId(_ctx.stringValue("GetLogResponse.RequestId"));
		getLogResponse.setCode(_ctx.integerValue("GetLogResponse.Code"));
		getLogResponse.setSuccess(_ctx.booleanValue("GetLogResponse.Success"));
		getLogResponse.setMessage(_ctx.stringValue("GetLogResponse.Message"));

		Data data = new Data();

		List<String> logs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLogResponse.Data.Logs.Length"); i++) {
			logs.add(_ctx.stringValue("GetLogResponse.Data.Logs["+ i +"]"));
		}
		data.setLogs(logs);
		getLogResponse.setData(data);
	 
	 	return getLogResponse;
	}
}