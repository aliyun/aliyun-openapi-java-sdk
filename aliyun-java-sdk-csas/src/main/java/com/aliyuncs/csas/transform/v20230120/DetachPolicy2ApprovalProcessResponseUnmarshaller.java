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

package com.aliyuncs.csas.transform.v20230120;

import com.aliyuncs.csas.model.v20230120.DetachPolicy2ApprovalProcessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachPolicy2ApprovalProcessResponseUnmarshaller {

	public static DetachPolicy2ApprovalProcessResponse unmarshall(DetachPolicy2ApprovalProcessResponse detachPolicy2ApprovalProcessResponse, UnmarshallerContext _ctx) {
		
		detachPolicy2ApprovalProcessResponse.setRequestId(_ctx.stringValue("DetachPolicy2ApprovalProcessResponse.RequestId"));
	 
	 	return detachPolicy2ApprovalProcessResponse;
	}
}