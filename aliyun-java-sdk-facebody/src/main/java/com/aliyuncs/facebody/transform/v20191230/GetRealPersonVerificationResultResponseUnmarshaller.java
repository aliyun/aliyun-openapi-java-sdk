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

package com.aliyuncs.facebody.transform.v20191230;

import com.aliyuncs.facebody.model.v20191230.GetRealPersonVerificationResultResponse;
import com.aliyuncs.facebody.model.v20191230.GetRealPersonVerificationResultResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRealPersonVerificationResultResponseUnmarshaller {

	public static GetRealPersonVerificationResultResponse unmarshall(GetRealPersonVerificationResultResponse getRealPersonVerificationResultResponse, UnmarshallerContext _ctx) {
		
		getRealPersonVerificationResultResponse.setRequestId(_ctx.stringValue("GetRealPersonVerificationResultResponse.RequestId"));
		getRealPersonVerificationResultResponse.setErrorMessage(_ctx.stringValue("GetRealPersonVerificationResultResponse.ErrorMessage"));
		getRealPersonVerificationResultResponse.setCode(_ctx.stringValue("GetRealPersonVerificationResultResponse.Code"));
		getRealPersonVerificationResultResponse.setSuccess(_ctx.booleanValue("GetRealPersonVerificationResultResponse.Success"));

		Data data = new Data();
		data.setPassed(_ctx.booleanValue("GetRealPersonVerificationResultResponse.Data.Passed"));
		data.setIdentityInfo(_ctx.stringValue("GetRealPersonVerificationResultResponse.Data.IdentityInfo"));
		data.setMaterialMatch(_ctx.stringValue("GetRealPersonVerificationResultResponse.Data.MaterialMatch"));
		getRealPersonVerificationResultResponse.setData(data);
	 
	 	return getRealPersonVerificationResultResponse;
	}
}