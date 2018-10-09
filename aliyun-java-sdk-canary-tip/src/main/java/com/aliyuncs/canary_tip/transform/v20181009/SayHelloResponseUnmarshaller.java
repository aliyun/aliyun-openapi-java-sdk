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

package com.aliyuncs.canary_tip.transform.v20181009;

import com.aliyuncs.canary_tip.model.v20181009.SayHelloResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SayHelloResponseUnmarshaller {

	public static SayHelloResponse unmarshall(SayHelloResponse sayHelloResponse, UnmarshallerContext context) {
		
		sayHelloResponse.setRequestId(context.stringValue("SayHelloResponse.RequestId"));
		sayHelloResponse.setMsg(context.stringValue("SayHelloResponse.Msg"));
	 
	 	return sayHelloResponse;
	}
}