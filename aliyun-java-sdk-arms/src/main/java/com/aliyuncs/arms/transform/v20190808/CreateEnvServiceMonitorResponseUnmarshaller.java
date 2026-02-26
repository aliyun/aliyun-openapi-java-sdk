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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.CreateEnvServiceMonitorResponse;
import com.aliyuncs.arms.model.v20190808.CreateEnvServiceMonitorResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEnvServiceMonitorResponseUnmarshaller {

	public static CreateEnvServiceMonitorResponse unmarshall(CreateEnvServiceMonitorResponse createEnvServiceMonitorResponse, UnmarshallerContext _ctx) {
		
		createEnvServiceMonitorResponse.setRequestId(_ctx.stringValue("CreateEnvServiceMonitorResponse.RequestId"));
		createEnvServiceMonitorResponse.setCode(_ctx.integerValue("CreateEnvServiceMonitorResponse.Code"));
		createEnvServiceMonitorResponse.setMessage(_ctx.stringValue("CreateEnvServiceMonitorResponse.Message"));

		Data data = new Data();
		data.setMatchedMsg(_ctx.stringValue("CreateEnvServiceMonitorResponse.Data.MatchedMsg"));
		data.setNamespace(_ctx.stringValue("CreateEnvServiceMonitorResponse.Data.Namespace"));
		data.setServiceMonitorName(_ctx.stringValue("CreateEnvServiceMonitorResponse.Data.ServiceMonitorName"));
		data.setMatchedTargetCount(_ctx.integerValue("CreateEnvServiceMonitorResponse.Data.MatchedTargetCount"));
		createEnvServiceMonitorResponse.setData(data);
	 
	 	return createEnvServiceMonitorResponse;
	}
}