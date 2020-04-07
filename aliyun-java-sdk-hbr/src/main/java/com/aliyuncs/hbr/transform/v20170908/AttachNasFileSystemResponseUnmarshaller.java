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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.AttachNasFileSystemResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachNasFileSystemResponseUnmarshaller {

	public static AttachNasFileSystemResponse unmarshall(AttachNasFileSystemResponse attachNasFileSystemResponse, UnmarshallerContext _ctx) {
		
		attachNasFileSystemResponse.setRequestId(_ctx.stringValue("AttachNasFileSystemResponse.RequestId"));
		attachNasFileSystemResponse.setSuccess(_ctx.booleanValue("AttachNasFileSystemResponse.Success"));
		attachNasFileSystemResponse.setCode(_ctx.stringValue("AttachNasFileSystemResponse.Code"));
		attachNasFileSystemResponse.setMessage(_ctx.stringValue("AttachNasFileSystemResponse.Message"));
		attachNasFileSystemResponse.setTaskId(_ctx.stringValue("AttachNasFileSystemResponse.TaskId"));
	 
	 	return attachNasFileSystemResponse;
	}
}