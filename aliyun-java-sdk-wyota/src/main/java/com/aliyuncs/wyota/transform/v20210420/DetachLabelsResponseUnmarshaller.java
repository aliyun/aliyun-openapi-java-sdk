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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.DetachLabelsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachLabelsResponseUnmarshaller {

	public static DetachLabelsResponse unmarshall(DetachLabelsResponse detachLabelsResponse, UnmarshallerContext _ctx) {
		
		detachLabelsResponse.setRequestId(_ctx.stringValue("DetachLabelsResponse.RequestId"));
		detachLabelsResponse.setMessage(_ctx.stringValue("DetachLabelsResponse.Message"));
		detachLabelsResponse.setCode(_ctx.stringValue("DetachLabelsResponse.Code"));
	 
	 	return detachLabelsResponse;
	}
}