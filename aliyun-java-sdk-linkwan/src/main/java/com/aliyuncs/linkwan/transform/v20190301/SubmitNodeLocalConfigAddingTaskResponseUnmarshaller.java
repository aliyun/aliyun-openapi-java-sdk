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

package com.aliyuncs.linkwan.transform.v20190301;

import com.aliyuncs.linkwan.model.v20190301.SubmitNodeLocalConfigAddingTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitNodeLocalConfigAddingTaskResponseUnmarshaller {

	public static SubmitNodeLocalConfigAddingTaskResponse unmarshall(SubmitNodeLocalConfigAddingTaskResponse submitNodeLocalConfigAddingTaskResponse, UnmarshallerContext _ctx) {
		
		submitNodeLocalConfigAddingTaskResponse.setRequestId(_ctx.stringValue("SubmitNodeLocalConfigAddingTaskResponse.RequestId"));
		submitNodeLocalConfigAddingTaskResponse.setSuccess(_ctx.booleanValue("SubmitNodeLocalConfigAddingTaskResponse.Success"));
		submitNodeLocalConfigAddingTaskResponse.setCode(_ctx.stringValue("SubmitNodeLocalConfigAddingTaskResponse.Code"));
		submitNodeLocalConfigAddingTaskResponse.setErrorMessage(_ctx.stringValue("SubmitNodeLocalConfigAddingTaskResponse.ErrorMessage"));
		submitNodeLocalConfigAddingTaskResponse.setData(_ctx.longValue("SubmitNodeLocalConfigAddingTaskResponse.Data"));
	 
	 	return submitNodeLocalConfigAddingTaskResponse;
	}
}