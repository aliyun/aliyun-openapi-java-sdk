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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.CheckProjectHasDependencyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckProjectHasDependencyResponseUnmarshaller {

	public static CheckProjectHasDependencyResponse unmarshall(CheckProjectHasDependencyResponse checkProjectHasDependencyResponse, UnmarshallerContext _ctx) {
		
		checkProjectHasDependencyResponse.setRequestId(_ctx.stringValue("CheckProjectHasDependencyResponse.RequestId"));
		checkProjectHasDependencyResponse.setSuccess(_ctx.booleanValue("CheckProjectHasDependencyResponse.Success"));
		checkProjectHasDependencyResponse.setHttpStatusCode(_ctx.integerValue("CheckProjectHasDependencyResponse.HttpStatusCode"));
		checkProjectHasDependencyResponse.setCode(_ctx.stringValue("CheckProjectHasDependencyResponse.Code"));
		checkProjectHasDependencyResponse.setMessage(_ctx.stringValue("CheckProjectHasDependencyResponse.Message"));
		checkProjectHasDependencyResponse.setData(_ctx.booleanValue("CheckProjectHasDependencyResponse.Data"));
	 
	 	return checkProjectHasDependencyResponse;
	}
}