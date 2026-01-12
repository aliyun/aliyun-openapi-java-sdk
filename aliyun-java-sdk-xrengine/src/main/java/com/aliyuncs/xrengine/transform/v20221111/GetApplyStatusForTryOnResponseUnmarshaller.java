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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.GetApplyStatusForTryOnResponse;
import com.aliyuncs.xrengine.model.v20221111.GetApplyStatusForTryOnResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplyStatusForTryOnResponseUnmarshaller {

	public static GetApplyStatusForTryOnResponse unmarshall(GetApplyStatusForTryOnResponse getApplyStatusForTryOnResponse, UnmarshallerContext _ctx) {
		
		getApplyStatusForTryOnResponse.setRequestId(_ctx.stringValue("GetApplyStatusForTryOnResponse.RequestId"));
		getApplyStatusForTryOnResponse.setSuccess(_ctx.booleanValue("GetApplyStatusForTryOnResponse.Success"));
		getApplyStatusForTryOnResponse.setCode(_ctx.stringValue("GetApplyStatusForTryOnResponse.Code"));
		getApplyStatusForTryOnResponse.setMessage(_ctx.stringValue("GetApplyStatusForTryOnResponse.Message"));
		getApplyStatusForTryOnResponse.setErrorName(_ctx.stringValue("GetApplyStatusForTryOnResponse.ErrorName"));
		getApplyStatusForTryOnResponse.setHttpCode(_ctx.integerValue("GetApplyStatusForTryOnResponse.HttpCode"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetApplyStatusForTryOnResponse.Data.Status"));
		data.setAgreement(_ctx.booleanValue("GetApplyStatusForTryOnResponse.Data.Agreement"));
		getApplyStatusForTryOnResponse.setData(data);
	 
	 	return getApplyStatusForTryOnResponse;
	}
}