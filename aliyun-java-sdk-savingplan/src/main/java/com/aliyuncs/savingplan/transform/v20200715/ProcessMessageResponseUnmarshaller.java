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

package com.aliyuncs.savingplan.transform.v20200715;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.savingplan.model.v20200715.ProcessMessageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ProcessMessageResponseUnmarshaller {

	public static ProcessMessageResponse unmarshall(ProcessMessageResponse processMessageResponse, UnmarshallerContext _ctx) {
		
		processMessageResponse.setCode(_ctx.stringValue("ProcessMessageResponse.code"));
		processMessageResponse.setRequestId(_ctx.stringValue("ProcessMessageResponse.requestId"));
		processMessageResponse.setMessage(_ctx.stringValue("ProcessMessageResponse.message"));
		processMessageResponse.setData(_ctx.stringValue("ProcessMessageResponse.data"));
		processMessageResponse.setSuccess(_ctx.booleanValue("ProcessMessageResponse.success"));
		processMessageResponse.setSynchro(_ctx.booleanValue("ProcessMessageResponse.synchro"));

		List<String> errorInfoList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ProcessMessageResponse.errorInfoList.Length"); i++) {
			errorInfoList.add(_ctx.stringValue("ProcessMessageResponse.errorInfoList["+ i +"]"));
		}
		processMessageResponse.setErrorInfoList(errorInfoList);
	 
	 	return processMessageResponse;
	}
}