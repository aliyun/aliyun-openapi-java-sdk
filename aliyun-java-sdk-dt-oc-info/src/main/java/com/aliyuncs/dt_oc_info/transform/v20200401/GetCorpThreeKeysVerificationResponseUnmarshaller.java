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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import com.aliyuncs.dt_oc_info.model.v20200401.GetCorpThreeKeysVerificationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCorpThreeKeysVerificationResponseUnmarshaller {

	public static GetCorpThreeKeysVerificationResponse unmarshall(GetCorpThreeKeysVerificationResponse getCorpThreeKeysVerificationResponse, UnmarshallerContext _ctx) {
		
		getCorpThreeKeysVerificationResponse.setRequestId(_ctx.stringValue("GetCorpThreeKeysVerificationResponse.RequestId"));
		getCorpThreeKeysVerificationResponse.setMessage(_ctx.stringValue("GetCorpThreeKeysVerificationResponse.Message"));
		getCorpThreeKeysVerificationResponse.setData(_ctx.booleanValue("GetCorpThreeKeysVerificationResponse.Data"));
		getCorpThreeKeysVerificationResponse.setCode(_ctx.longValue("GetCorpThreeKeysVerificationResponse.Code"));
	 
	 	return getCorpThreeKeysVerificationResponse;
	}
}