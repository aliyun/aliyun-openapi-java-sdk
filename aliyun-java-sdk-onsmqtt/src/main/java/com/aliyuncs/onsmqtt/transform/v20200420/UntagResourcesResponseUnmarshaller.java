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

package com.aliyuncs.onsmqtt.transform.v20200420;

import com.aliyuncs.onsmqtt.model.v20200420.UntagResourcesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UntagResourcesResponseUnmarshaller {

	public static UntagResourcesResponse unmarshall(UntagResourcesResponse untagResourcesResponse, UnmarshallerContext _ctx) {
		
		untagResourcesResponse.setRequestId(_ctx.stringValue("UntagResourcesResponse.RequestId"));
		untagResourcesResponse.setCode(_ctx.stringValue("UntagResourcesResponse.Code"));
		untagResourcesResponse.setData(_ctx.booleanValue("UntagResourcesResponse.Data"));
		untagResourcesResponse.setMessage(_ctx.stringValue("UntagResourcesResponse.Message"));
	 
	 	return untagResourcesResponse;
	}
}