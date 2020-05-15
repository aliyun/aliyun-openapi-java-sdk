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

package com.aliyuncs.saf.transform.v20180919;

import com.aliyuncs.saf.model.v20180919.ExecuteRequestResponse;
import com.aliyuncs.saf.model.v20180919.ExecuteRequestResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteRequestResponseUnmarshaller {

	public static ExecuteRequestResponse unmarshall(ExecuteRequestResponse executeRequestResponse, UnmarshallerContext _ctx) {
		
		executeRequestResponse.setRequestId(_ctx.stringValue("ExecuteRequestResponse.RequestId"));
		executeRequestResponse.setCode(_ctx.integerValue("ExecuteRequestResponse.Code"));
		executeRequestResponse.setMessage(_ctx.stringValue("ExecuteRequestResponse.Message"));

		Data data = new Data();
		data.setTags(_ctx.stringValue("ExecuteRequestResponse.Data.Tags"));
		data.setScore(_ctx.stringValue("ExecuteRequestResponse.Data.Score"));
		data.setExtend(_ctx.stringValue("ExecuteRequestResponse.Data.Extend"));
		executeRequestResponse.setData(data);
	 
	 	return executeRequestResponse;
	}
}