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

import com.aliyuncs.trademark.model.v20190902.CheckDuplicateTrademarkResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckDuplicateTrademarkResponseUnmarshaller {

	public static CheckDuplicateTrademarkResponse unmarshall(CheckDuplicateTrademarkResponse checkDuplicateTrademarkResponse, UnmarshallerContext _ctx) {
		
		checkDuplicateTrademarkResponse.setRequestId(_ctx.stringValue("CheckDuplicateTrademarkResponse.RequestId"));
		checkDuplicateTrademarkResponse.setType(_ctx.stringValue("CheckDuplicateTrademarkResponse.Type"));
		checkDuplicateTrademarkResponse.setCode(_ctx.stringValue("CheckDuplicateTrademarkResponse.Code"));
		checkDuplicateTrademarkResponse.setMessage(_ctx.stringValue("CheckDuplicateTrademarkResponse.Message"));
		checkDuplicateTrademarkResponse.setDuplicateTrademark(_ctx.stringValue("CheckDuplicateTrademarkResponse.DuplicateTrademark"));
	 
	 	return checkDuplicateTrademarkResponse;
	}
}