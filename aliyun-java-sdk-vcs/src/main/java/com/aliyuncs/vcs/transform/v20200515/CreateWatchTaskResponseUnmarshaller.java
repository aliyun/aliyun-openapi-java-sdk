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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.CreateWatchTaskResponse;
import com.aliyuncs.vcs.model.v20200515.CreateWatchTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateWatchTaskResponseUnmarshaller {

	public static CreateWatchTaskResponse unmarshall(CreateWatchTaskResponse createWatchTaskResponse, UnmarshallerContext _ctx) {
		
		createWatchTaskResponse.setRequestId(_ctx.stringValue("CreateWatchTaskResponse.RequestId"));
		createWatchTaskResponse.setSuccess(_ctx.booleanValue("CreateWatchTaskResponse.Success"));
		createWatchTaskResponse.setCode(_ctx.stringValue("CreateWatchTaskResponse.Code"));
		createWatchTaskResponse.setMessage(_ctx.stringValue("CreateWatchTaskResponse.Message"));

		Data data = new Data();
		data.setWatchTaskId(_ctx.stringValue("CreateWatchTaskResponse.Data.WatchTaskId"));
		createWatchTaskResponse.setData(data);
	 
	 	return createWatchTaskResponse;
	}
}