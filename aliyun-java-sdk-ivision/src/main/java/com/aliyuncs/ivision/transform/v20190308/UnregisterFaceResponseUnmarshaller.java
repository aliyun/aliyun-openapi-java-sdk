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

package com.aliyuncs.ivision.transform.v20190308;

import com.aliyuncs.ivision.model.v20190308.UnregisterFaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnregisterFaceResponseUnmarshaller {

	public static UnregisterFaceResponse unmarshall(UnregisterFaceResponse unregisterFaceResponse, UnmarshallerContext _ctx) {
		
		unregisterFaceResponse.setRequestId(_ctx.stringValue("UnregisterFaceResponse.RequestId"));
		unregisterFaceResponse.setFaceToken(_ctx.stringValue("UnregisterFaceResponse.FaceToken"));
		unregisterFaceResponse.setGroupId(_ctx.stringValue("UnregisterFaceResponse.GroupId"));
	 
	 	return unregisterFaceResponse;
	}
}