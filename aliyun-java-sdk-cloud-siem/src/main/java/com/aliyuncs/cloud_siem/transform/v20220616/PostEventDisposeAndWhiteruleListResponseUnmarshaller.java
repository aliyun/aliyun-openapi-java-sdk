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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.PostEventDisposeAndWhiteruleListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PostEventDisposeAndWhiteruleListResponseUnmarshaller {

	public static PostEventDisposeAndWhiteruleListResponse unmarshall(PostEventDisposeAndWhiteruleListResponse postEventDisposeAndWhiteruleListResponse, UnmarshallerContext _ctx) {
		
		postEventDisposeAndWhiteruleListResponse.setRequestId(_ctx.stringValue("PostEventDisposeAndWhiteruleListResponse.RequestId"));
		postEventDisposeAndWhiteruleListResponse.setData(_ctx.stringValue("PostEventDisposeAndWhiteruleListResponse.Data"));
		postEventDisposeAndWhiteruleListResponse.setSuccess(_ctx.booleanValue("PostEventDisposeAndWhiteruleListResponse.Success"));
		postEventDisposeAndWhiteruleListResponse.setCode(_ctx.integerValue("PostEventDisposeAndWhiteruleListResponse.Code"));
		postEventDisposeAndWhiteruleListResponse.setMessage(_ctx.stringValue("PostEventDisposeAndWhiteruleListResponse.Message"));
	 
	 	return postEventDisposeAndWhiteruleListResponse;
	}
}