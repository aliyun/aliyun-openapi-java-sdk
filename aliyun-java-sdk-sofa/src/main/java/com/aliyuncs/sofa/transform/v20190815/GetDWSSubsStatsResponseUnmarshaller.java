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

import com.aliyuncs.sofa.model.v20190815.GetDWSSubsStatsResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsStatsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSSubsStatsResponseUnmarshaller {

	public static GetDWSSubsStatsResponse unmarshall(GetDWSSubsStatsResponse getDWSSubsStatsResponse, UnmarshallerContext _ctx) {
		
		getDWSSubsStatsResponse.setRequestId(_ctx.stringValue("GetDWSSubsStatsResponse.RequestId"));
		getDWSSubsStatsResponse.setResultCode(_ctx.stringValue("GetDWSSubsStatsResponse.ResultCode"));
		getDWSSubsStatsResponse.setResultMessage(_ctx.stringValue("GetDWSSubsStatsResponse.ResultMessage"));

		Data data = new Data();
		data.setException(_ctx.longValue("GetDWSSubsStatsResponse.Data.Exception"));
		data.setInitializing(_ctx.longValue("GetDWSSubsStatsResponse.Data.Initializing"));
		data.setRunning(_ctx.longValue("GetDWSSubsStatsResponse.Data.Running"));
		data.setTotal(_ctx.longValue("GetDWSSubsStatsResponse.Data.Total"));
		data.setUnsubscribe(_ctx.longValue("GetDWSSubsStatsResponse.Data.Unsubscribe"));
		data.setWaiting(_ctx.longValue("GetDWSSubsStatsResponse.Data.Waiting"));
		getDWSSubsStatsResponse.setData(data);
	 
	 	return getDWSSubsStatsResponse;
	}
}