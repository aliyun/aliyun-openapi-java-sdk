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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.DeprecateFlowResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeprecateFlowResponseUnmarshaller {

	public static DeprecateFlowResponse unmarshall(DeprecateFlowResponse deprecateFlowResponse, UnmarshallerContext _ctx) {
		
		deprecateFlowResponse.setRequestId(_ctx.stringValue("DeprecateFlowResponse.RequestId"));
		deprecateFlowResponse.setCode(_ctx.stringValue("DeprecateFlowResponse.Code"));
		deprecateFlowResponse.setMessage(_ctx.stringValue("DeprecateFlowResponse.Message"));
	 
	 	return deprecateFlowResponse;
	}
}