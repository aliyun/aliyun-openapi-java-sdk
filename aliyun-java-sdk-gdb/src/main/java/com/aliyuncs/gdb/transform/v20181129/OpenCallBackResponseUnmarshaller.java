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

package com.aliyuncs.gdb.transform.v20181129;

import com.aliyuncs.gdb.model.v20181129.OpenCallBackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpenCallBackResponseUnmarshaller {

	public static OpenCallBackResponse unmarshall(OpenCallBackResponse openCallBackResponse, UnmarshallerContext context) {
		
		openCallBackResponse.setRequestId(context.stringValue("OpenCallBackResponse.RequestId"));
		openCallBackResponse.setCode(context.stringValue("OpenCallBackResponse.Code"));
		openCallBackResponse.setData(context.stringValue("OpenCallBackResponse.Data"));
		openCallBackResponse.setMessage(context.stringValue("OpenCallBackResponse.Message"));
		openCallBackResponse.setSuccess(context.stringValue("OpenCallBackResponse.Success"));
		openCallBackResponse.setSynchro(context.stringValue("OpenCallBackResponse.Synchro"));
	 
	 	return openCallBackResponse;
	}
}