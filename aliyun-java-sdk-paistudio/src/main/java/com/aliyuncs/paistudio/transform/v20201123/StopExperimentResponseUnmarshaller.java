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

package com.aliyuncs.paistudio.transform.v20201123;

import com.aliyuncs.paistudio.model.v20201123.StopExperimentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopExperimentResponseUnmarshaller {

	public static StopExperimentResponse unmarshall(StopExperimentResponse stopExperimentResponse, UnmarshallerContext _ctx) {
		
		stopExperimentResponse.setRequestId(_ctx.stringValue("StopExperimentResponse.RequestId"));
		stopExperimentResponse.setCode(_ctx.stringValue("StopExperimentResponse.Code"));
		stopExperimentResponse.setMessage(_ctx.stringValue("StopExperimentResponse.Message"));
	 
	 	return stopExperimentResponse;
	}
}