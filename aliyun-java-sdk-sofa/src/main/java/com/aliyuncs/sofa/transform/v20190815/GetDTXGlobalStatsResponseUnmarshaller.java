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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetDTXGlobalStatsResponse;
import com.aliyuncs.sofa.model.v20190815.GetDTXGlobalStatsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDTXGlobalStatsResponseUnmarshaller {

	public static GetDTXGlobalStatsResponse unmarshall(GetDTXGlobalStatsResponse getDTXGlobalStatsResponse, UnmarshallerContext _ctx) {
		
		getDTXGlobalStatsResponse.setRequestId(_ctx.stringValue("GetDTXGlobalStatsResponse.RequestId"));
		getDTXGlobalStatsResponse.setResultCode(_ctx.stringValue("GetDTXGlobalStatsResponse.ResultCode"));
		getDTXGlobalStatsResponse.setResultMessage(_ctx.stringValue("GetDTXGlobalStatsResponse.ResultMessage"));
		getDTXGlobalStatsResponse.setSuccess(_ctx.booleanValue("GetDTXGlobalStatsResponse.Success"));

		Data data = new Data();
		data.setActivity(_ctx.longValue("GetDTXGlobalStatsResponse.Data.Activity"));
		data.setException(_ctx.longValue("GetDTXGlobalStatsResponse.Data.Exception"));
		data.setToday(_ctx.longValue("GetDTXGlobalStatsResponse.Data.Today"));
		getDTXGlobalStatsResponse.setData(data);
	 
	 	return getDTXGlobalStatsResponse;
	}
}