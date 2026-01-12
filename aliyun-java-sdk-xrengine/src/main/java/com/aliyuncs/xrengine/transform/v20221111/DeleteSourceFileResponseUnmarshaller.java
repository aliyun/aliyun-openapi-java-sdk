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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.DeleteSourceFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSourceFileResponseUnmarshaller {

	public static DeleteSourceFileResponse unmarshall(DeleteSourceFileResponse deleteSourceFileResponse, UnmarshallerContext _ctx) {
		
		deleteSourceFileResponse.setRequestId(_ctx.stringValue("DeleteSourceFileResponse.RequestId"));
		deleteSourceFileResponse.setSuccess(_ctx.booleanValue("DeleteSourceFileResponse.Success"));
		deleteSourceFileResponse.setCode(_ctx.stringValue("DeleteSourceFileResponse.Code"));
		deleteSourceFileResponse.setMessage(_ctx.stringValue("DeleteSourceFileResponse.Message"));
	 
	 	return deleteSourceFileResponse;
	}
}