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

import com.aliyuncs.ddoscoo.model.v20200101.DisableSceneDefensePolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableSceneDefensePolicyResponseUnmarshaller {

	public static DisableSceneDefensePolicyResponse unmarshall(DisableSceneDefensePolicyResponse disableSceneDefensePolicyResponse, UnmarshallerContext _ctx) {
		
		disableSceneDefensePolicyResponse.setRequestId(_ctx.stringValue("DisableSceneDefensePolicyResponse.RequestId"));
		disableSceneDefensePolicyResponse.setSuccess(_ctx.booleanValue("DisableSceneDefensePolicyResponse.Success"));
	 
	 	return disableSceneDefensePolicyResponse;
	}
}