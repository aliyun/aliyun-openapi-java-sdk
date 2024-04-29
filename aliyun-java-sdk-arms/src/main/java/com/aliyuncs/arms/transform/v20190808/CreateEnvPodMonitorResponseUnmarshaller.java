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

import com.aliyuncs.arms.model.v20190808.CreateEnvPodMonitorResponse;
import com.aliyuncs.arms.model.v20190808.CreateEnvPodMonitorResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEnvPodMonitorResponseUnmarshaller {

	public static CreateEnvPodMonitorResponse unmarshall(CreateEnvPodMonitorResponse createEnvPodMonitorResponse, UnmarshallerContext _ctx) {
		
		createEnvPodMonitorResponse.setRequestId(_ctx.stringValue("CreateEnvPodMonitorResponse.RequestId"));
		createEnvPodMonitorResponse.setCode(_ctx.integerValue("CreateEnvPodMonitorResponse.Code"));
		createEnvPodMonitorResponse.setMessage(_ctx.stringValue("CreateEnvPodMonitorResponse.Message"));

		Data data = new Data();
		data.setMatchedMsg(_ctx.stringValue("CreateEnvPodMonitorResponse.Data.MatchedMsg"));
		data.setNamespace(_ctx.stringValue("CreateEnvPodMonitorResponse.Data.Namespace"));
		data.setPodMonitorName(_ctx.stringValue("CreateEnvPodMonitorResponse.Data.PodMonitorName"));
		data.setMatchedTargetCount(_ctx.stringValue("CreateEnvPodMonitorResponse.Data.MatchedTargetCount"));
		createEnvPodMonitorResponse.setData(data);
	 
	 	return createEnvPodMonitorResponse;
	}
}