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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.DescribeFaceVerifyResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeFaceVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFaceVerifyResponseUnmarshaller {

	public static DescribeFaceVerifyResponse unmarshall(DescribeFaceVerifyResponse describeFaceVerifyResponse, UnmarshallerContext _ctx) {
		
		describeFaceVerifyResponse.setRequestId(_ctx.stringValue("DescribeFaceVerifyResponse.RequestId"));
		describeFaceVerifyResponse.setMessage(_ctx.stringValue("DescribeFaceVerifyResponse.Message"));
		describeFaceVerifyResponse.setCode(_ctx.stringValue("DescribeFaceVerifyResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setPassed(_ctx.stringValue("DescribeFaceVerifyResponse.ResultObject.Passed"));
		resultObject.setIdentityInfo(_ctx.stringValue("DescribeFaceVerifyResponse.ResultObject.IdentityInfo"));
		resultObject.setMaterialInfo(_ctx.stringValue("DescribeFaceVerifyResponse.ResultObject.MaterialInfo"));
		describeFaceVerifyResponse.setResultObject(resultObject);
	 
	 	return describeFaceVerifyResponse;
	}
}