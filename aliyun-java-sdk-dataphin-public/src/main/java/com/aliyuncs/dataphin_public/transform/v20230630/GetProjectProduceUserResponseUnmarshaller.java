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

import com.aliyuncs.dataphin_public.model.v20230630.GetProjectProduceUserResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetProjectProduceUserResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectProduceUserResponseUnmarshaller {

	public static GetProjectProduceUserResponse unmarshall(GetProjectProduceUserResponse getProjectProduceUserResponse, UnmarshallerContext _ctx) {
		
		getProjectProduceUserResponse.setRequestId(_ctx.stringValue("GetProjectProduceUserResponse.RequestId"));
		getProjectProduceUserResponse.setSuccess(_ctx.booleanValue("GetProjectProduceUserResponse.Success"));
		getProjectProduceUserResponse.setHttpStatusCode(_ctx.integerValue("GetProjectProduceUserResponse.HttpStatusCode"));
		getProjectProduceUserResponse.setCode(_ctx.stringValue("GetProjectProduceUserResponse.Code"));
		getProjectProduceUserResponse.setMessage(_ctx.stringValue("GetProjectProduceUserResponse.Message"));

		User user = new User();
		user.setId(_ctx.stringValue("GetProjectProduceUserResponse.User.Id"));
		getProjectProduceUserResponse.setUser(user);
	 
	 	return getProjectProduceUserResponse;
	}
}