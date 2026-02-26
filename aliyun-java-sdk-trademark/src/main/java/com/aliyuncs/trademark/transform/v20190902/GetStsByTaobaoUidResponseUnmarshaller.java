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

package com.aliyuncs.trademark.transform.v20190902;

import com.aliyuncs.trademark.model.v20190902.GetStsByTaobaoUidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStsByTaobaoUidResponseUnmarshaller {

	public static GetStsByTaobaoUidResponse unmarshall(GetStsByTaobaoUidResponse getStsByTaobaoUidResponse, UnmarshallerContext _ctx) {
		
		getStsByTaobaoUidResponse.setRequestId(_ctx.stringValue("GetStsByTaobaoUidResponse.RequestId"));
		getStsByTaobaoUidResponse.setErrorMessage(_ctx.stringValue("GetStsByTaobaoUidResponse.ErrorMessage"));
		getStsByTaobaoUidResponse.setSecurityToken(_ctx.stringValue("GetStsByTaobaoUidResponse.SecurityToken"));
		getStsByTaobaoUidResponse.setErrorCode(_ctx.stringValue("GetStsByTaobaoUidResponse.ErrorCode"));
		getStsByTaobaoUidResponse.setSuccess(_ctx.booleanValue("GetStsByTaobaoUidResponse.Success"));
		getStsByTaobaoUidResponse.setExpiration(_ctx.stringValue("GetStsByTaobaoUidResponse.Expiration"));
		getStsByTaobaoUidResponse.setAccessKeySecret(_ctx.stringValue("GetStsByTaobaoUidResponse.AccessKeySecret"));
		getStsByTaobaoUidResponse.setAccessKeyId(_ctx.stringValue("GetStsByTaobaoUidResponse.AccessKeyId"));
	 
	 	return getStsByTaobaoUidResponse;
	}
}