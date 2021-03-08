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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetInstanceLogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceLogResponseUnmarshaller {

	public static GetInstanceLogResponse unmarshall(GetInstanceLogResponse getInstanceLogResponse, UnmarshallerContext _ctx) {
		
		getInstanceLogResponse.setRequestId(_ctx.stringValue("GetInstanceLogResponse.RequestId"));
		getInstanceLogResponse.setErrorCode(_ctx.stringValue("GetInstanceLogResponse.ErrorCode"));
		getInstanceLogResponse.setErrorMessage(_ctx.stringValue("GetInstanceLogResponse.ErrorMessage"));
		getInstanceLogResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceLogResponse.HttpStatusCode"));
		getInstanceLogResponse.setSuccess(_ctx.booleanValue("GetInstanceLogResponse.Success"));
		getInstanceLogResponse.setData(_ctx.stringValue("GetInstanceLogResponse.Data"));
	 
	 	return getInstanceLogResponse;
	}
}