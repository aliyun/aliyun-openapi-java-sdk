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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.StopUnionTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopUnionTaskResponseUnmarshaller {

	public static StopUnionTaskResponse unmarshall(StopUnionTaskResponse stopUnionTaskResponse, UnmarshallerContext _ctx) {
		
		stopUnionTaskResponse.setRequestId(_ctx.stringValue("StopUnionTaskResponse.RequestId"));
		stopUnionTaskResponse.setErrorMsg(_ctx.stringValue("StopUnionTaskResponse.ErrorMsg"));
		stopUnionTaskResponse.setCode(_ctx.longValue("StopUnionTaskResponse.Code"));
		stopUnionTaskResponse.setSuccess(_ctx.booleanValue("StopUnionTaskResponse.Success"));
		stopUnionTaskResponse.setData(_ctx.booleanValue("StopUnionTaskResponse.Data"));
	 
	 	return stopUnionTaskResponse;
	}
}