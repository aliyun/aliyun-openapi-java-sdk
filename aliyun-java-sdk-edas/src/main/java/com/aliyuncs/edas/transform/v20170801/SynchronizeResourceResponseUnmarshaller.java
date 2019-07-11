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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.SynchronizeResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SynchronizeResourceResponseUnmarshaller {

	public static SynchronizeResourceResponse unmarshall(SynchronizeResourceResponse synchronizeResourceResponse, UnmarshallerContext _ctx) {
		
		synchronizeResourceResponse.setRequestId(_ctx.stringValue("SynchronizeResourceResponse.RequestId"));
		synchronizeResourceResponse.setCode(_ctx.integerValue("SynchronizeResourceResponse.Code"));
		synchronizeResourceResponse.setMessage(_ctx.stringValue("SynchronizeResourceResponse.Message"));
		synchronizeResourceResponse.setSuccess(_ctx.booleanValue("SynchronizeResourceResponse.Success"));
		synchronizeResourceResponse.setData(_ctx.stringValue("SynchronizeResourceResponse.Data"));
	 
	 	return synchronizeResourceResponse;
	}
}