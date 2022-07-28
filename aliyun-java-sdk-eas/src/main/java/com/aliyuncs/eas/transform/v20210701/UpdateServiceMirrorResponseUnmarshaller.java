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

package com.aliyuncs.eas.transform.v20210701;

import com.aliyuncs.eas.model.v20210701.UpdateServiceMirrorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateServiceMirrorResponseUnmarshaller {

	public static UpdateServiceMirrorResponse unmarshall(UpdateServiceMirrorResponse updateServiceMirrorResponse, UnmarshallerContext _ctx) {
		
		updateServiceMirrorResponse.setRequestId(_ctx.stringValue("UpdateServiceMirrorResponse.RequestId"));
		updateServiceMirrorResponse.setMessage(_ctx.stringValue("UpdateServiceMirrorResponse.Message"));
	 
	 	return updateServiceMirrorResponse;
	}
}