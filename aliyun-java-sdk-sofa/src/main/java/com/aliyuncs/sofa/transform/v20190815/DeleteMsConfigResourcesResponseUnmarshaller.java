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

import com.aliyuncs.sofa.model.v20190815.DeleteMsConfigResourcesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMsConfigResourcesResponseUnmarshaller {

	public static DeleteMsConfigResourcesResponse unmarshall(DeleteMsConfigResourcesResponse deleteMsConfigResourcesResponse, UnmarshallerContext _ctx) {
		
		deleteMsConfigResourcesResponse.setRequestId(_ctx.stringValue("DeleteMsConfigResourcesResponse.RequestId"));
		deleteMsConfigResourcesResponse.setResultCode(_ctx.stringValue("DeleteMsConfigResourcesResponse.ResultCode"));
		deleteMsConfigResourcesResponse.setResultMessage(_ctx.stringValue("DeleteMsConfigResourcesResponse.ResultMessage"));
	 
	 	return deleteMsConfigResourcesResponse;
	}
}