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

package com.aliyuncs.rsimganalys.transform.v20190801;

import com.aliyuncs.rsimganalys.model.v20190801.DeleteTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTaskResponseUnmarshaller {

	public static DeleteTaskResponse unmarshall(DeleteTaskResponse deleteTaskResponse, UnmarshallerContext _ctx) {
		
		deleteTaskResponse.setRequestId(_ctx.stringValue("DeleteTaskResponse.RequestId"));
		deleteTaskResponse.setResultCode(_ctx.integerValue("DeleteTaskResponse.ResultCode"));
		deleteTaskResponse.setResultMessage(_ctx.stringValue("DeleteTaskResponse.ResultMessage"));
		deleteTaskResponse.setData(_ctx.booleanValue("DeleteTaskResponse.Data"));
	 
	 	return deleteTaskResponse;
	}
}