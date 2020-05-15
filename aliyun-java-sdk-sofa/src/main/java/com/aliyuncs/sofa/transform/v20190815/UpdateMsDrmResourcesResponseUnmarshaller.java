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

import com.aliyuncs.sofa.model.v20190815.UpdateMsDrmResourcesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMsDrmResourcesResponseUnmarshaller {

	public static UpdateMsDrmResourcesResponse unmarshall(UpdateMsDrmResourcesResponse updateMsDrmResourcesResponse, UnmarshallerContext _ctx) {
		
		updateMsDrmResourcesResponse.setRequestId(_ctx.stringValue("UpdateMsDrmResourcesResponse.RequestId"));
		updateMsDrmResourcesResponse.setResultCode(_ctx.stringValue("UpdateMsDrmResourcesResponse.ResultCode"));
		updateMsDrmResourcesResponse.setResultMessage(_ctx.stringValue("UpdateMsDrmResourcesResponse.ResultMessage"));
		updateMsDrmResourcesResponse.setResult(_ctx.longValue("UpdateMsDrmResourcesResponse.Result"));
	 
	 	return updateMsDrmResourcesResponse;
	}
}