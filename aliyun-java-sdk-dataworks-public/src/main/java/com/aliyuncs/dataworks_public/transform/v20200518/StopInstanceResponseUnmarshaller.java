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

import com.aliyuncs.dataworks_public.model.v20200518.StopInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopInstanceResponseUnmarshaller {

	public static StopInstanceResponse unmarshall(StopInstanceResponse stopInstanceResponse, UnmarshallerContext _ctx) {
		
		stopInstanceResponse.setRequestId(_ctx.stringValue("StopInstanceResponse.RequestId"));
		stopInstanceResponse.setErrorCode(_ctx.stringValue("StopInstanceResponse.ErrorCode"));
		stopInstanceResponse.setErrorMessage(_ctx.stringValue("StopInstanceResponse.ErrorMessage"));
		stopInstanceResponse.setHttpStatusCode(_ctx.integerValue("StopInstanceResponse.HttpStatusCode"));
		stopInstanceResponse.setSuccess(_ctx.booleanValue("StopInstanceResponse.Success"));
		stopInstanceResponse.setData(_ctx.booleanValue("StopInstanceResponse.Data"));
	 
	 	return stopInstanceResponse;
	}
}