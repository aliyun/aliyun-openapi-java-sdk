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

package com.aliyuncs.copyright.transform.v20190123;

import com.aliyuncs.copyright.model.v20190123.CheckCopyrightCenterCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckCopyrightCenterCodeResponseUnmarshaller {

	public static CheckCopyrightCenterCodeResponse unmarshall(CheckCopyrightCenterCodeResponse checkCopyrightCenterCodeResponse, UnmarshallerContext _ctx) {
		
		checkCopyrightCenterCodeResponse.setRequestId(_ctx.stringValue("CheckCopyrightCenterCodeResponse.RequestId"));
		checkCopyrightCenterCodeResponse.setCheckPass(_ctx.booleanValue("CheckCopyrightCenterCodeResponse.CheckPass"));
		checkCopyrightCenterCodeResponse.setSuccess(_ctx.booleanValue("CheckCopyrightCenterCodeResponse.Success"));
		checkCopyrightCenterCodeResponse.setMessage(_ctx.stringValue("CheckCopyrightCenterCodeResponse.Message"));
	 
	 	return checkCopyrightCenterCodeResponse;
	}
}