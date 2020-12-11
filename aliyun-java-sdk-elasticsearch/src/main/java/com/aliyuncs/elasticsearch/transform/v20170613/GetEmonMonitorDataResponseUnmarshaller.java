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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.GetEmonMonitorDataResponse;
import com.aliyuncs.elasticsearch.model.v20170613.GetEmonMonitorDataResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEmonMonitorDataResponseUnmarshaller {

	public static GetEmonMonitorDataResponse unmarshall(GetEmonMonitorDataResponse getEmonMonitorDataResponse, UnmarshallerContext _ctx) {
		
		getEmonMonitorDataResponse.setRequestId(_ctx.stringValue("GetEmonMonitorDataResponse.RequestId"));
		getEmonMonitorDataResponse.setCode(_ctx.stringValue("GetEmonMonitorDataResponse.Code"));
		getEmonMonitorDataResponse.setMessage(_ctx.stringValue("GetEmonMonitorDataResponse.Message"));
		getEmonMonitorDataResponse.setSuccess(_ctx.booleanValue("GetEmonMonitorDataResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetEmonMonitorDataResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDps(_ctx.mapValue("GetEmonMonitorDataResponse.Result["+ i +"].dps"));
			resultItem.setIntegrity(_ctx.floatValue("GetEmonMonitorDataResponse.Result["+ i +"].integrity"));
			resultItem.setMessageWatermark(_ctx.longValue("GetEmonMonitorDataResponse.Result["+ i +"].messageWatermark"));
			resultItem.setMetric(_ctx.stringValue("GetEmonMonitorDataResponse.Result["+ i +"].metric"));
			resultItem.setSummary(_ctx.floatValue("GetEmonMonitorDataResponse.Result["+ i +"].summary"));
			resultItem.setTags(_ctx.mapValue("GetEmonMonitorDataResponse.Result["+ i +"].tags"));

			result.add(resultItem);
		}
		getEmonMonitorDataResponse.setResult(result);
	 
	 	return getEmonMonitorDataResponse;
	}
}