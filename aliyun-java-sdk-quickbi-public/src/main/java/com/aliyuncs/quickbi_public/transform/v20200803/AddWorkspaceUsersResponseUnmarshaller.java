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

package com.aliyuncs.quickbi_public.transform.v20200803;

import com.aliyuncs.quickbi_public.model.v20200803.AddWorkspaceUsersResponse;
import com.aliyuncs.quickbi_public.model.v20200803.AddWorkspaceUsersResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddWorkspaceUsersResponseUnmarshaller {

	public static AddWorkspaceUsersResponse unmarshall(AddWorkspaceUsersResponse addWorkspaceUsersResponse, UnmarshallerContext _ctx) {
		
		addWorkspaceUsersResponse.setRequestId(_ctx.stringValue("AddWorkspaceUsersResponse.RequestId"));
		addWorkspaceUsersResponse.setSuccess(_ctx.booleanValue("AddWorkspaceUsersResponse.Success"));

		Result result = new Result();
		result.setTotal(_ctx.integerValue("AddWorkspaceUsersResponse.Result.Total"));
		result.setSuccess(_ctx.integerValue("AddWorkspaceUsersResponse.Result.Success"));
		result.setFailure(_ctx.integerValue("AddWorkspaceUsersResponse.Result.Failure"));
		result.setFailureDetail(_ctx.mapValue("AddWorkspaceUsersResponse.Result.FailureDetail"));
		addWorkspaceUsersResponse.setResult(result);
	 
	 	return addWorkspaceUsersResponse;
	}
}