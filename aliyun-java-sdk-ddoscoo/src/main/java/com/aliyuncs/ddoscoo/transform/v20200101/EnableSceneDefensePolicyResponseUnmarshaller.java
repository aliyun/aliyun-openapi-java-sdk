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

package com.aliyuncs.ddoscoo.transform.v20200101;

import com.aliyuncs.ddoscoo.model.v20200101.EnableSceneDefensePolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableSceneDefensePolicyResponseUnmarshaller {

	public static EnableSceneDefensePolicyResponse unmarshall(EnableSceneDefensePolicyResponse enableSceneDefensePolicyResponse, UnmarshallerContext _ctx) {
		
		enableSceneDefensePolicyResponse.setRequestId(_ctx.stringValue("EnableSceneDefensePolicyResponse.RequestId"));
		enableSceneDefensePolicyResponse.setSuccess(_ctx.booleanValue("EnableSceneDefensePolicyResponse.Success"));
	 
	 	return enableSceneDefensePolicyResponse;
	}
}