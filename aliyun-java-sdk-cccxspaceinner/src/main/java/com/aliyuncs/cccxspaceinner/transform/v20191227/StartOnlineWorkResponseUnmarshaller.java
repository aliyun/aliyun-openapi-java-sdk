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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import com.aliyuncs.cccxspaceinner.model.v20191227.StartOnlineWorkResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.StartOnlineWorkResponse.Data;
import com.aliyuncs.cccxspaceinner.model.v20191227.StartOnlineWorkResponse.Data.InitStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartOnlineWorkResponseUnmarshaller {

	public static StartOnlineWorkResponse unmarshall(StartOnlineWorkResponse startOnlineWorkResponse, UnmarshallerContext _ctx) {
		
		startOnlineWorkResponse.setMessage(_ctx.stringValue("StartOnlineWorkResponse.Message"));
		startOnlineWorkResponse.setCode(_ctx.stringValue("StartOnlineWorkResponse.Code"));
		startOnlineWorkResponse.setSuccess(_ctx.booleanValue("StartOnlineWorkResponse.Success"));

		Data data = new Data();

		InitStatus initStatus = new InitStatus();
		initStatus.setStatus(_ctx.booleanValue("StartOnlineWorkResponse.Data.InitStatus.Status"));
		data.setInitStatus(initStatus);
		startOnlineWorkResponse.setData(data);
	 
	 	return startOnlineWorkResponse;
	}
}