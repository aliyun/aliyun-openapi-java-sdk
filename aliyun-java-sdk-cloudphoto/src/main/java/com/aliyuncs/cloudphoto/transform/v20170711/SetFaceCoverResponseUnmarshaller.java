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

package com.aliyuncs.cloudphoto.transform.v20170711;

import com.aliyuncs.cloudphoto.model.v20170711.SetFaceCoverResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetFaceCoverResponseUnmarshaller {

	public static SetFaceCoverResponse unmarshall(SetFaceCoverResponse setFaceCoverResponse, UnmarshallerContext context) {
		
		setFaceCoverResponse.setRequestId(context.stringValue("SetFaceCoverResponse.RequestId"));
		setFaceCoverResponse.setCode(context.stringValue("SetFaceCoverResponse.Code"));
		setFaceCoverResponse.setMessage(context.stringValue("SetFaceCoverResponse.Message"));
		setFaceCoverResponse.setAction(context.stringValue("SetFaceCoverResponse.Action"));
	 
	 	return setFaceCoverResponse;
	}
}