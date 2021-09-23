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

import com.aliyuncs.savingplan.model.v20200715.CompleteCommodityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CompleteCommodityResponseUnmarshaller {

	public static CompleteCommodityResponse unmarshall(CompleteCommodityResponse completeCommodityResponse, UnmarshallerContext _ctx) {
		
		completeCommodityResponse.setCode(_ctx.stringValue("CompleteCommodityResponse.code"));
		completeCommodityResponse.setRequestId(_ctx.stringValue("CompleteCommodityResponse.requestId"));
		completeCommodityResponse.setMessage(_ctx.stringValue("CompleteCommodityResponse.message"));
		completeCommodityResponse.setData(_ctx.stringValue("CompleteCommodityResponse.data"));
		completeCommodityResponse.setSuccess(_ctx.booleanValue("CompleteCommodityResponse.success"));
		completeCommodityResponse.setSynchro(_ctx.booleanValue("CompleteCommodityResponse.synchro"));

		List<String> errorInfoList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CompleteCommodityResponse.errorInfoList.Length"); i++) {
			errorInfoList.add(_ctx.stringValue("CompleteCommodityResponse.errorInfoList["+ i +"]"));
		}
		completeCommodityResponse.setErrorInfoList(errorInfoList);
	 
	 	return completeCommodityResponse;
	}
}