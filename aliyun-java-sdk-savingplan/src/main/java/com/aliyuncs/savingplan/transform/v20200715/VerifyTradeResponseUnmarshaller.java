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

package com.aliyuncs.savingplan.transform.v20200715;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.savingplan.model.v20200715.VerifyTradeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyTradeResponseUnmarshaller {

	public static VerifyTradeResponse unmarshall(VerifyTradeResponse verifyTradeResponse, UnmarshallerContext _ctx) {
		
		verifyTradeResponse.setCode(_ctx.stringValue("VerifyTradeResponse.code"));
		verifyTradeResponse.setRequestId(_ctx.stringValue("VerifyTradeResponse.requestId"));
		verifyTradeResponse.setMessage(_ctx.stringValue("VerifyTradeResponse.message"));
		verifyTradeResponse.setData(_ctx.stringValue("VerifyTradeResponse.data"));
		verifyTradeResponse.setSuccess(_ctx.booleanValue("VerifyTradeResponse.success"));
		verifyTradeResponse.setSynchro(_ctx.booleanValue("VerifyTradeResponse.synchro"));

		List<String> errorInfoList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("VerifyTradeResponse.errorInfoList.Length"); i++) {
			errorInfoList.add(_ctx.stringValue("VerifyTradeResponse.errorInfoList["+ i +"]"));
		}
		verifyTradeResponse.setErrorInfoList(errorInfoList);
	 
	 	return verifyTradeResponse;
	}
}