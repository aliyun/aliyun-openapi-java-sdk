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

import com.aliyuncs.arms.model.v20190808.UpdateEnvPodMonitorResponse;
import com.aliyuncs.arms.model.v20190808.UpdateEnvPodMonitorResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateEnvPodMonitorResponseUnmarshaller {

	public static UpdateEnvPodMonitorResponse unmarshall(UpdateEnvPodMonitorResponse updateEnvPodMonitorResponse, UnmarshallerContext _ctx) {
		
		updateEnvPodMonitorResponse.setRequestId(_ctx.stringValue("UpdateEnvPodMonitorResponse.RequestId"));
		updateEnvPodMonitorResponse.setCode(_ctx.integerValue("UpdateEnvPodMonitorResponse.Code"));
		updateEnvPodMonitorResponse.setMessage(_ctx.stringValue("UpdateEnvPodMonitorResponse.Message"));

		Data data = new Data();
		data.setMatchedMsg(_ctx.stringValue("UpdateEnvPodMonitorResponse.Data.MatchedMsg"));
		data.setMatchedTargetCount(_ctx.stringValue("UpdateEnvPodMonitorResponse.Data.MatchedTargetCount"));
		updateEnvPodMonitorResponse.setData(data);
	 
	 	return updateEnvPodMonitorResponse;
	}
}