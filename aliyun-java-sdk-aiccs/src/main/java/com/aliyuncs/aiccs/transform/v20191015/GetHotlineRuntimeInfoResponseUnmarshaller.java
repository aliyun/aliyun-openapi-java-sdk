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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.GetHotlineRuntimeInfoResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHotlineRuntimeInfoResponseUnmarshaller {

	public static GetHotlineRuntimeInfoResponse unmarshall(GetHotlineRuntimeInfoResponse getHotlineRuntimeInfoResponse, UnmarshallerContext _ctx) {
		
		getHotlineRuntimeInfoResponse.setRequestId(_ctx.stringValue("GetHotlineRuntimeInfoResponse.RequestId"));
		getHotlineRuntimeInfoResponse.setSuccess(_ctx.booleanValue("GetHotlineRuntimeInfoResponse.Success"));
		getHotlineRuntimeInfoResponse.setCode(_ctx.stringValue("GetHotlineRuntimeInfoResponse.Code"));
		getHotlineRuntimeInfoResponse.setMessage(_ctx.stringValue("GetHotlineRuntimeInfoResponse.Message"));
		getHotlineRuntimeInfoResponse.setData(_ctx.mapValue("GetHotlineRuntimeInfoResponse.Data"));
	 
	 	return getHotlineRuntimeInfoResponse;
	}
}