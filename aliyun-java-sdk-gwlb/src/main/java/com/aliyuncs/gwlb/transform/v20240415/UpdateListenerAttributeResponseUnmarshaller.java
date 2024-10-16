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

package com.aliyuncs.gwlb.transform.v20240415;

import com.aliyuncs.gwlb.model.v20240415.UpdateListenerAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateListenerAttributeResponseUnmarshaller {

	public static UpdateListenerAttributeResponse unmarshall(UpdateListenerAttributeResponse updateListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		updateListenerAttributeResponse.setRequestId(_ctx.stringValue("UpdateListenerAttributeResponse.RequestId"));
	 
	 	return updateListenerAttributeResponse;
	}
}