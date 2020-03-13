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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeLinktRelatedlinkeiterationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeLinktRelatedlinkeiterationResponseUnmarshaller {

	public static RemoveLinkeLinktRelatedlinkeiterationResponse unmarshall(RemoveLinkeLinktRelatedlinkeiterationResponse removeLinkeLinktRelatedlinkeiterationResponse, UnmarshallerContext _ctx) {
		
		removeLinkeLinktRelatedlinkeiterationResponse.setRequestId(_ctx.stringValue("RemoveLinkeLinktRelatedlinkeiterationResponse.RequestId"));
		removeLinkeLinktRelatedlinkeiterationResponse.setResultCode(_ctx.stringValue("RemoveLinkeLinktRelatedlinkeiterationResponse.ResultCode"));
		removeLinkeLinktRelatedlinkeiterationResponse.setResultMessage(_ctx.stringValue("RemoveLinkeLinktRelatedlinkeiterationResponse.ResultMessage"));
		removeLinkeLinktRelatedlinkeiterationResponse.setData(_ctx.booleanValue("RemoveLinkeLinktRelatedlinkeiterationResponse.Data"));
		removeLinkeLinktRelatedlinkeiterationResponse.setErrorCode(_ctx.longValue("RemoveLinkeLinktRelatedlinkeiterationResponse.ErrorCode"));
		removeLinkeLinktRelatedlinkeiterationResponse.setErrorMessage(_ctx.stringValue("RemoveLinkeLinktRelatedlinkeiterationResponse.ErrorMessage"));
		removeLinkeLinktRelatedlinkeiterationResponse.setSuccess(_ctx.booleanValue("RemoveLinkeLinktRelatedlinkeiterationResponse.Success"));
	 
	 	return removeLinkeLinktRelatedlinkeiterationResponse;
	}
}