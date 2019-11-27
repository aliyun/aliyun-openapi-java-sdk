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

package com.aliyuncs.alikafka.transform.v20190916;

import com.aliyuncs.alikafka.model.v20190916.StartInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartInstanceResponseUnmarshaller {

	public static StartInstanceResponse unmarshall(StartInstanceResponse startInstanceResponse, UnmarshallerContext _ctx) {
		
		startInstanceResponse.setRequestId(_ctx.stringValue("StartInstanceResponse.RequestId"));
		startInstanceResponse.setSuccess(_ctx.booleanValue("StartInstanceResponse.Success"));
		startInstanceResponse.setCode(_ctx.integerValue("StartInstanceResponse.Code"));
		startInstanceResponse.setMessage(_ctx.stringValue("StartInstanceResponse.Message"));
	 
	 	return startInstanceResponse;
	}
}