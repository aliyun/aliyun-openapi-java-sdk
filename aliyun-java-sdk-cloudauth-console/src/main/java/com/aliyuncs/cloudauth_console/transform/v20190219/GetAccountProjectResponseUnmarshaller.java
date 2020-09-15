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

package com.aliyuncs.cloudauth_console.transform.v20190219;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth_console.model.v20190219.GetAccountProjectResponse;
import com.aliyuncs.cloudauth_console.model.v20190219.GetAccountProjectResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountProjectResponseUnmarshaller {

	public static GetAccountProjectResponse unmarshall(GetAccountProjectResponse getAccountProjectResponse, UnmarshallerContext _ctx) {
		
		getAccountProjectResponse.setRequestId(_ctx.stringValue("GetAccountProjectResponse.RequestId"));
		getAccountProjectResponse.setSuccess(_ctx.booleanValue("GetAccountProjectResponse.Success"));
		getAccountProjectResponse.setHttpStatusCode(_ctx.integerValue("GetAccountProjectResponse.HttpStatusCode"));

		List<Data> list = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("GetAccountProjectResponse.List.Length"); i++) {
			Data data = new Data();
			data.setProjectName(_ctx.stringValue("GetAccountProjectResponse.List["+ i +"].ProjectName"));
			data.setProjectId(_ctx.stringValue("GetAccountProjectResponse.List["+ i +"].ProjectId"));

			list.add(data);
		}
		getAccountProjectResponse.setList(list);
	 
	 	return getAccountProjectResponse;
	}
}