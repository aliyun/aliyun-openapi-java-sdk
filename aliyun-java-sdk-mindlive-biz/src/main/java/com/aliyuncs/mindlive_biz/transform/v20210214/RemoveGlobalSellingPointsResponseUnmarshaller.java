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

import com.aliyuncs.mindlive_biz.model.v20210214.RemoveGlobalSellingPointsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveGlobalSellingPointsResponseUnmarshaller {

	public static RemoveGlobalSellingPointsResponse unmarshall(RemoveGlobalSellingPointsResponse removeGlobalSellingPointsResponse, UnmarshallerContext _ctx) {
		
		removeGlobalSellingPointsResponse.setRequestId(_ctx.stringValue("RemoveGlobalSellingPointsResponse.RequestId"));
		removeGlobalSellingPointsResponse.setData(_ctx.integerValue("RemoveGlobalSellingPointsResponse.Data"));
		removeGlobalSellingPointsResponse.setErrorMessage(_ctx.stringValue("RemoveGlobalSellingPointsResponse.ErrorMessage"));
		removeGlobalSellingPointsResponse.setErrorCode(_ctx.stringValue("RemoveGlobalSellingPointsResponse.ErrorCode"));
		removeGlobalSellingPointsResponse.setSuccess(_ctx.booleanValue("RemoveGlobalSellingPointsResponse.Success"));
	 
	 	return removeGlobalSellingPointsResponse;
	}
}