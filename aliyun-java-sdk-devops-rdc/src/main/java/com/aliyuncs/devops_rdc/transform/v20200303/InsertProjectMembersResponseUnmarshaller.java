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

package com.aliyuncs.devops_rdc.transform.v20200303;

import com.aliyuncs.devops_rdc.model.v20200303.InsertProjectMembersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertProjectMembersResponseUnmarshaller {

	public static InsertProjectMembersResponse unmarshall(InsertProjectMembersResponse insertProjectMembersResponse, UnmarshallerContext _ctx) {
		
		insertProjectMembersResponse.setRequestId(_ctx.stringValue("InsertProjectMembersResponse.RequestId"));
		insertProjectMembersResponse.setErrorMsg(_ctx.stringValue("InsertProjectMembersResponse.ErrorMsg"));
		insertProjectMembersResponse.setObject(_ctx.booleanValue("InsertProjectMembersResponse.Object"));
		insertProjectMembersResponse.setSuccessful(_ctx.booleanValue("InsertProjectMembersResponse.Successful"));
		insertProjectMembersResponse.setErrorCode(_ctx.stringValue("InsertProjectMembersResponse.ErrorCode"));
	 
	 	return insertProjectMembersResponse;
	}
}