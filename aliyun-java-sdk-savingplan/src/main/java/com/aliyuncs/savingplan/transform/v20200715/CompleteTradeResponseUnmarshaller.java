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

import com.aliyuncs.savingplan.model.v20200715.CompleteTradeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CompleteTradeResponseUnmarshaller {

	public static CompleteTradeResponse unmarshall(CompleteTradeResponse completeTradeResponse, UnmarshallerContext _ctx) {
		
		completeTradeResponse.setCode(_ctx.stringValue("CompleteTradeResponse.code"));
		completeTradeResponse.setRequestId(_ctx.stringValue("CompleteTradeResponse.requestId"));
		completeTradeResponse.setMessage(_ctx.stringValue("CompleteTradeResponse.message"));
		completeTradeResponse.setData(_ctx.stringValue("CompleteTradeResponse.data"));
		completeTradeResponse.setSuccess(_ctx.booleanValue("CompleteTradeResponse.success"));
		completeTradeResponse.setSynchro(_ctx.booleanValue("CompleteTradeResponse.synchro"));

		List<String> errorInfoList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CompleteTradeResponse.errorInfoList.Length"); i++) {
			errorInfoList.add(_ctx.stringValue("CompleteTradeResponse.errorInfoList["+ i +"]"));
		}
		completeTradeResponse.setErrorInfoList(errorInfoList);
	 
	 	return completeTradeResponse;
	}
}