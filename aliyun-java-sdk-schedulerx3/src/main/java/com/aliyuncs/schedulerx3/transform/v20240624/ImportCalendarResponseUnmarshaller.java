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

import com.aliyuncs.schedulerx3.model.v20240624.ImportCalendarResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportCalendarResponseUnmarshaller {

	public static ImportCalendarResponse unmarshall(ImportCalendarResponse importCalendarResponse, UnmarshallerContext _ctx) {
		
		importCalendarResponse.setRequestId(_ctx.stringValue("ImportCalendarResponse.RequestId"));
		importCalendarResponse.setCode(_ctx.integerValue("ImportCalendarResponse.Code"));
		importCalendarResponse.setMessage(_ctx.stringValue("ImportCalendarResponse.Message"));
		importCalendarResponse.setSuccess(_ctx.booleanValue("ImportCalendarResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ImportCalendarResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("ImportCalendarResponse.Data["+ i +"]"));
		}
		importCalendarResponse.setData(data);
	 
	 	return importCalendarResponse;
	}
}