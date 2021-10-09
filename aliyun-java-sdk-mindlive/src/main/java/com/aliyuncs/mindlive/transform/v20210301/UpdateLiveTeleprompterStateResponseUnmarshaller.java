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

package com.aliyuncs.mindlive.transform.v20210301;

import com.aliyuncs.mindlive.model.v20210301.UpdateLiveTeleprompterStateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLiveTeleprompterStateResponseUnmarshaller {

	public static UpdateLiveTeleprompterStateResponse unmarshall(UpdateLiveTeleprompterStateResponse updateLiveTeleprompterStateResponse, UnmarshallerContext _ctx) {
		
		updateLiveTeleprompterStateResponse.setRequestId(_ctx.stringValue("UpdateLiveTeleprompterStateResponse.RequestId"));
		updateLiveTeleprompterStateResponse.setErrorCode(_ctx.stringValue("UpdateLiveTeleprompterStateResponse.ErrorCode"));
		updateLiveTeleprompterStateResponse.setErrorMessage(_ctx.stringValue("UpdateLiveTeleprompterStateResponse.ErrorMessage"));
		updateLiveTeleprompterStateResponse.setSuccess(_ctx.booleanValue("UpdateLiveTeleprompterStateResponse.Success"));
	 
	 	return updateLiveTeleprompterStateResponse;
	}
}