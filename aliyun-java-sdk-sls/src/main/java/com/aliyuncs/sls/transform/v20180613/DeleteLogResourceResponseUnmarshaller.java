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

package com.aliyuncs.sls.transform.v20180613;

import com.aliyuncs.sls.model.v20180613.DeleteLogResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLogResourceResponseUnmarshaller {

	public static DeleteLogResourceResponse unmarshall(DeleteLogResourceResponse deleteLogResourceResponse, UnmarshallerContext _ctx) {
		
		deleteLogResourceResponse.setRequestId(_ctx.stringValue("DeleteLogResourceResponse.RequestId"));
		deleteLogResourceResponse.setCode(_ctx.stringValue("DeleteLogResourceResponse.Code"));
		deleteLogResourceResponse.setSuccess(_ctx.stringValue("DeleteLogResourceResponse.Success"));
		deleteLogResourceResponse.setMessage(_ctx.stringValue("DeleteLogResourceResponse.Message"));
	 
	 	return deleteLogResourceResponse;
	}
}