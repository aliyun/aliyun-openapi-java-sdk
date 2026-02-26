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

import com.aliyuncs.arms.model.v20190808.UpdateEnvServiceMonitorResponse;
import com.aliyuncs.arms.model.v20190808.UpdateEnvServiceMonitorResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateEnvServiceMonitorResponseUnmarshaller {

	public static UpdateEnvServiceMonitorResponse unmarshall(UpdateEnvServiceMonitorResponse updateEnvServiceMonitorResponse, UnmarshallerContext _ctx) {
		
		updateEnvServiceMonitorResponse.setRequestId(_ctx.stringValue("UpdateEnvServiceMonitorResponse.RequestId"));
		updateEnvServiceMonitorResponse.setCode(_ctx.integerValue("UpdateEnvServiceMonitorResponse.Code"));
		updateEnvServiceMonitorResponse.setMessage(_ctx.stringValue("UpdateEnvServiceMonitorResponse.Message"));

		Data data = new Data();
		data.setMatchedMsg(_ctx.stringValue("UpdateEnvServiceMonitorResponse.Data.MatchedMsg"));
		data.setMatchedTargetCount(_ctx.stringValue("UpdateEnvServiceMonitorResponse.Data.MatchedTargetCount"));
		updateEnvServiceMonitorResponse.setData(data);
	 
	 	return updateEnvServiceMonitorResponse;
	}
}