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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.CompleteCommodityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CompleteCommodityResponseUnmarshaller {

	public static CompleteCommodityResponse unmarshall(CompleteCommodityResponse completeCommodityResponse, UnmarshallerContext _ctx) {
		
		completeCommodityResponse.setRequestId(_ctx.stringValue("CompleteCommodityResponse.requestId"));
		completeCommodityResponse.setData(_ctx.stringValue("CompleteCommodityResponse.data"));
		completeCommodityResponse.setCode(_ctx.stringValue("CompleteCommodityResponse.code"));
		completeCommodityResponse.setMessage(_ctx.stringValue("CompleteCommodityResponse.message"));
		completeCommodityResponse.setSuccess(_ctx.booleanValue("CompleteCommodityResponse.success"));
		completeCommodityResponse.setSynchro(_ctx.stringValue("CompleteCommodityResponse.synchro"));
	 
	 	return completeCommodityResponse;
	}
}