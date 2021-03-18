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

package com.aliyuncs.vpc.transform.v20160428;

import com.aliyuncs.vpc.model.v20160428.UpdateTrafficMirrorSessionAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTrafficMirrorSessionAttributeResponseUnmarshaller {

	public static UpdateTrafficMirrorSessionAttributeResponse unmarshall(UpdateTrafficMirrorSessionAttributeResponse updateTrafficMirrorSessionAttributeResponse, UnmarshallerContext _ctx) {
		
		updateTrafficMirrorSessionAttributeResponse.setRequestId(_ctx.stringValue("UpdateTrafficMirrorSessionAttributeResponse.RequestId"));
	 
	 	return updateTrafficMirrorSessionAttributeResponse;
	}
}