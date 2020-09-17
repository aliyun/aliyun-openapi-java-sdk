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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.DeleteDtxAppActionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDtxAppActionResponseUnmarshaller {

	public static DeleteDtxAppActionResponse unmarshall(DeleteDtxAppActionResponse deleteDtxAppActionResponse, UnmarshallerContext _ctx) {
		
		deleteDtxAppActionResponse.setRequestId(_ctx.stringValue("DeleteDtxAppActionResponse.RequestId"));
		deleteDtxAppActionResponse.setResultCode(_ctx.stringValue("DeleteDtxAppActionResponse.ResultCode"));
		deleteDtxAppActionResponse.setResultMessage(_ctx.stringValue("DeleteDtxAppActionResponse.ResultMessage"));
	 
	 	return deleteDtxAppActionResponse;
	}
}