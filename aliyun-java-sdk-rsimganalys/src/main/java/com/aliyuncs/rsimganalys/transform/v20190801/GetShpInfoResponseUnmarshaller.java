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

package com.aliyuncs.rsimganalys.transform.v20190801;

import com.aliyuncs.rsimganalys.model.v20190801.GetShpInfoResponse;
import com.aliyuncs.rsimganalys.model.v20190801.GetShpInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetShpInfoResponseUnmarshaller {

	public static GetShpInfoResponse unmarshall(GetShpInfoResponse getShpInfoResponse, UnmarshallerContext _ctx) {
		
		getShpInfoResponse.setRequestId(_ctx.stringValue("GetShpInfoResponse.RequestId"));
		getShpInfoResponse.setResultCode(_ctx.integerValue("GetShpInfoResponse.ResultCode"));
		getShpInfoResponse.setResultMessage(_ctx.stringValue("GetShpInfoResponse.ResultMessage"));

		Data data = new Data();
		data.setArea(_ctx.stringValue("GetShpInfoResponse.Data.Area"));
		data.setCategory(_ctx.stringValue("GetShpInfoResponse.Data.Category"));
		getShpInfoResponse.setData(data);
	 
	 	return getShpInfoResponse;
	}
}