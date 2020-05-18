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

package com.aliyuncs.iotsoc.transform.v20190815;

import com.aliyuncs.iotsoc.model.v20190815.GetSummaryResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSummaryResponseUnmarshaller {

	public static GetSummaryResponse unmarshall(GetSummaryResponse getSummaryResponse, UnmarshallerContext _ctx) {
		
		getSummaryResponse.setRequestId(_ctx.stringValue("GetSummaryResponse.RequestId"));
		getSummaryResponse.setSuccess(_ctx.booleanValue("GetSummaryResponse.Success"));
		getSummaryResponse.setCode(_ctx.stringValue("GetSummaryResponse.Code"));
		getSummaryResponse.setMessage(_ctx.stringValue("GetSummaryResponse.Message"));
		getSummaryResponse.setData(_ctx.mapValue("GetSummaryResponse.Data"));
	 
	 	return getSummaryResponse;
	}
}