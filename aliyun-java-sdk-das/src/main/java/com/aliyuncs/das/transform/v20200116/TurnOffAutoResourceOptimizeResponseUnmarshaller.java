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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.TurnOffAutoResourceOptimizeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TurnOffAutoResourceOptimizeResponseUnmarshaller {

	public static TurnOffAutoResourceOptimizeResponse unmarshall(TurnOffAutoResourceOptimizeResponse turnOffAutoResourceOptimizeResponse, UnmarshallerContext _ctx) {
		
		turnOffAutoResourceOptimizeResponse.setRequestId(_ctx.stringValue("TurnOffAutoResourceOptimizeResponse.RequestId"));
		turnOffAutoResourceOptimizeResponse.setCode(_ctx.stringValue("TurnOffAutoResourceOptimizeResponse.Code"));
		turnOffAutoResourceOptimizeResponse.setData(_ctx.stringValue("TurnOffAutoResourceOptimizeResponse.Data"));
		turnOffAutoResourceOptimizeResponse.setMessage(_ctx.stringValue("TurnOffAutoResourceOptimizeResponse.Message"));
		turnOffAutoResourceOptimizeResponse.setSynchro(_ctx.stringValue("TurnOffAutoResourceOptimizeResponse.Synchro"));
		turnOffAutoResourceOptimizeResponse.setSuccess(_ctx.stringValue("TurnOffAutoResourceOptimizeResponse.Success"));
	 
	 	return turnOffAutoResourceOptimizeResponse;
	}
}