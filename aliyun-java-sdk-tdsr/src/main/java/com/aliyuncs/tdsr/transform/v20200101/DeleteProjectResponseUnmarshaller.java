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

package com.aliyuncs.tdsr.transform.v20200101;

import com.aliyuncs.tdsr.model.v20200101.DeleteProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteProjectResponseUnmarshaller {

	public static DeleteProjectResponse unmarshall(DeleteProjectResponse deleteProjectResponse, UnmarshallerContext _ctx) {
		
		deleteProjectResponse.setRequestId(_ctx.stringValue("DeleteProjectResponse.RequestId"));
		deleteProjectResponse.setSuccess(_ctx.booleanValue("DeleteProjectResponse.Success"));
		deleteProjectResponse.setErrMessage(_ctx.stringValue("DeleteProjectResponse.ErrMessage"));
	 
	 	return deleteProjectResponse;
	}
}