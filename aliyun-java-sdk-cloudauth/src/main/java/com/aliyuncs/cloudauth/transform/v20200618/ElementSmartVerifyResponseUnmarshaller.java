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

package com.aliyuncs.cloudauth.transform.v20200618;

import com.aliyuncs.cloudauth.model.v20200618.ElementSmartVerifyResponse;
import com.aliyuncs.cloudauth.model.v20200618.ElementSmartVerifyResponse.ResultObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class ElementSmartVerifyResponseUnmarshaller {

	public static ElementSmartVerifyResponse unmarshall(ElementSmartVerifyResponse elementSmartVerifyResponse, UnmarshallerContext _ctx) {
		
		elementSmartVerifyResponse.setRequestId(_ctx.stringValue("ElementSmartVerifyResponse.RequestId"));
		elementSmartVerifyResponse.setMessage(_ctx.stringValue("ElementSmartVerifyResponse.Message"));
		elementSmartVerifyResponse.setCode(_ctx.stringValue("ElementSmartVerifyResponse.Code"));

		ResultObject resultObject = new ResultObject();
		resultObject.setPassed(_ctx.stringValue("ElementSmartVerifyResponse.ResultObject.Passed"));
		resultObject.setSubCode(_ctx.stringValue("ElementSmartVerifyResponse.ResultObject.SubCode"));
		resultObject.setMaterialInfo(_ctx.stringValue("ElementSmartVerifyResponse.ResultObject.MaterialInfo"));
		elementSmartVerifyResponse.setResultObject(resultObject);
	 
	 	return elementSmartVerifyResponse;
	}
}