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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.UpdateLiveItemResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLiveItemResponseUnmarshaller {

	public static UpdateLiveItemResponse unmarshall(UpdateLiveItemResponse updateLiveItemResponse, UnmarshallerContext _ctx) {
		
		updateLiveItemResponse.setRequestId(_ctx.stringValue("UpdateLiveItemResponse.RequestId"));
		updateLiveItemResponse.setErrorMessage(_ctx.stringValue("UpdateLiveItemResponse.ErrorMessage"));
		updateLiveItemResponse.setSuccess(_ctx.booleanValue("UpdateLiveItemResponse.Success"));
		updateLiveItemResponse.setErrorCode(_ctx.stringValue("UpdateLiveItemResponse.ErrorCode"));
	 
	 	return updateLiveItemResponse;
	}
}