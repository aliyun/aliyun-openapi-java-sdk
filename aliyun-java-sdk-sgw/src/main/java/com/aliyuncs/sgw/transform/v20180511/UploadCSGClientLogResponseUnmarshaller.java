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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.UploadCSGClientLogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadCSGClientLogResponseUnmarshaller {

	public static UploadCSGClientLogResponse unmarshall(UploadCSGClientLogResponse uploadCSGClientLogResponse, UnmarshallerContext _ctx) {
		
		uploadCSGClientLogResponse.setRequestId(_ctx.stringValue("UploadCSGClientLogResponse.RequestId"));
		uploadCSGClientLogResponse.setCode(_ctx.stringValue("UploadCSGClientLogResponse.Code"));
		uploadCSGClientLogResponse.setMessage(_ctx.stringValue("UploadCSGClientLogResponse.Message"));
		uploadCSGClientLogResponse.setTaskId(_ctx.stringValue("UploadCSGClientLogResponse.TaskId"));
		uploadCSGClientLogResponse.setSuccess(_ctx.booleanValue("UploadCSGClientLogResponse.Success"));
	 
	 	return uploadCSGClientLogResponse;
	}
}