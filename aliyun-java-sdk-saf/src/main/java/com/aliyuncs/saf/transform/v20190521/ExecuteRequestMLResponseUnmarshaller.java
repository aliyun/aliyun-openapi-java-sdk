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

package com.aliyuncs.saf.transform.v20190521;

import com.aliyuncs.saf.model.v20190521.ExecuteRequestMLResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteRequestMLResponseUnmarshaller {

	public static ExecuteRequestMLResponse unmarshall(ExecuteRequestMLResponse executeRequestMLResponse, UnmarshallerContext _ctx) {
		
		executeRequestMLResponse.setRequestId(_ctx.stringValue("ExecuteRequestMLResponse.RequestId"));
		executeRequestMLResponse.setCode(_ctx.integerValue("ExecuteRequestMLResponse.Code"));
		executeRequestMLResponse.setMessage(_ctx.stringValue("ExecuteRequestMLResponse.Message"));
		executeRequestMLResponse.setData(_ctx.mapValue("ExecuteRequestMLResponse.Data"));
	 
	 	return executeRequestMLResponse;
	}
}