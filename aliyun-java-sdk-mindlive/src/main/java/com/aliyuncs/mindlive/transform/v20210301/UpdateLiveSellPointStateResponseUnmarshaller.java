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

import com.aliyuncs.mindlive.model.v20210301.UpdateLiveSellPointStateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLiveSellPointStateResponseUnmarshaller {

	public static UpdateLiveSellPointStateResponse unmarshall(UpdateLiveSellPointStateResponse updateLiveSellPointStateResponse, UnmarshallerContext _ctx) {
		
		updateLiveSellPointStateResponse.setRequestId(_ctx.stringValue("UpdateLiveSellPointStateResponse.RequestId"));
		updateLiveSellPointStateResponse.setErrorCode(_ctx.stringValue("UpdateLiveSellPointStateResponse.ErrorCode"));
		updateLiveSellPointStateResponse.setErrorMessage(_ctx.stringValue("UpdateLiveSellPointStateResponse.ErrorMessage"));
		updateLiveSellPointStateResponse.setSuccess(_ctx.booleanValue("UpdateLiveSellPointStateResponse.Success"));
	 
	 	return updateLiveSellPointStateResponse;
	}
}