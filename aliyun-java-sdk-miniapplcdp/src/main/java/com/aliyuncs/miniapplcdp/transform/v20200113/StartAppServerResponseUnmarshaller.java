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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.StartAppServerResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.StartAppServerResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartAppServerResponseUnmarshaller {

	public static StartAppServerResponse unmarshall(StartAppServerResponse startAppServerResponse, UnmarshallerContext _ctx) {
		
		startAppServerResponse.setRequestId(_ctx.stringValue("StartAppServerResponse.RequestId"));

		Data data = new Data();
		data.setEnvId(_ctx.stringValue("StartAppServerResponse.Data.EnvId"));
		data.setAppId(_ctx.stringValue("StartAppServerResponse.Data.AppId"));
		data.setAppServerStatus(_ctx.stringValue("StartAppServerResponse.Data.AppServerStatus"));
		startAppServerResponse.setData(data);
	 
	 	return startAppServerResponse;
	}
}