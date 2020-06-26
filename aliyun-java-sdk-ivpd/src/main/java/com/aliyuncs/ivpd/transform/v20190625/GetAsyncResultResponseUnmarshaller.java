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

package com.aliyuncs.ivpd.transform.v20190625;

import com.aliyuncs.ivpd.model.v20190625.GetAsyncResultResponse;
import com.aliyuncs.ivpd.model.v20190625.GetAsyncResultResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAsyncResultResponseUnmarshaller {

	public static GetAsyncResultResponse unmarshall(GetAsyncResultResponse getAsyncResultResponse, UnmarshallerContext _ctx) {
		
		getAsyncResultResponse.setRequestId(_ctx.stringValue("GetAsyncResultResponse.RequestId"));
		getAsyncResultResponse.setCode(_ctx.stringValue("GetAsyncResultResponse.Code"));
		getAsyncResultResponse.setMessage(_ctx.stringValue("GetAsyncResultResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetAsyncResultResponse.Data.Status"));
		data.setBatchSize(_ctx.stringValue("GetAsyncResultResponse.Data.BatchSize"));
		data.setFinish(_ctx.booleanValue("GetAsyncResultResponse.Data.Finish"));
		data.setProgress(_ctx.floatValue("GetAsyncResultResponse.Data.Progress"));
		data.setMessage(_ctx.stringValue("GetAsyncResultResponse.Data.Message"));
		data.setCompleted(_ctx.booleanValue("GetAsyncResultResponse.Data.Completed"));
		data.setTotalUsedTime(_ctx.longValue("GetAsyncResultResponse.Data.TotalUsedTime"));
		data.setResult(_ctx.mapValue("GetAsyncResultResponse.Data.Result"));
		data.setCode(_ctx.stringValue("GetAsyncResultResponse.Data.Code"));
		getAsyncResultResponse.setData(data);
	 
	 	return getAsyncResultResponse;
	}
}