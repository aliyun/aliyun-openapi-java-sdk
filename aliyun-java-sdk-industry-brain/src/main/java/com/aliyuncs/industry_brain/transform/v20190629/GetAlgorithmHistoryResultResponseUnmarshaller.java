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

package com.aliyuncs.industry_brain.transform.v20190629;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.industry_brain.model.v20190629.GetAlgorithmHistoryResultResponse;
import com.aliyuncs.industry_brain.model.v20190629.GetAlgorithmHistoryResultResponse.Region;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAlgorithmHistoryResultResponseUnmarshaller {

	public static GetAlgorithmHistoryResultResponse unmarshall(GetAlgorithmHistoryResultResponse getAlgorithmHistoryResultResponse, UnmarshallerContext _ctx) {
		
		getAlgorithmHistoryResultResponse.setRequestId(_ctx.stringValue("GetAlgorithmHistoryResultResponse.RequestId"));
		getAlgorithmHistoryResultResponse.setCode(_ctx.stringValue("GetAlgorithmHistoryResultResponse.Code"));
		getAlgorithmHistoryResultResponse.setMessage(_ctx.stringValue("GetAlgorithmHistoryResultResponse.Message"));
		getAlgorithmHistoryResultResponse.setTraceId(_ctx.stringValue("GetAlgorithmHistoryResultResponse.TraceId"));

		List<Region> data = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("GetAlgorithmHistoryResultResponse.Data.Length"); i++) {
			Region region = new Region();
			region.setOutput(_ctx.mapValue("GetAlgorithmHistoryResultResponse.Data["+ i +"].Output"));
			region.setInput(_ctx.mapValue("GetAlgorithmHistoryResultResponse.Data["+ i +"].Input"));
			region.setInvokeTime(_ctx.stringValue("GetAlgorithmHistoryResultResponse.Data["+ i +"].InvokeTime"));

			data.add(region);
		}
		getAlgorithmHistoryResultResponse.setData(data);
	 
	 	return getAlgorithmHistoryResultResponse;
	}
}