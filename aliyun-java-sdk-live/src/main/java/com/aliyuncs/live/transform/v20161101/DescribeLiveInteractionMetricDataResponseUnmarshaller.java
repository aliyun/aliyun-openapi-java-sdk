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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveInteractionMetricDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveInteractionMetricDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveInteractionMetricDataResponseUnmarshaller {

	public static DescribeLiveInteractionMetricDataResponse unmarshall(DescribeLiveInteractionMetricDataResponse describeLiveInteractionMetricDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveInteractionMetricDataResponse.setRequestId(_ctx.stringValue("DescribeLiveInteractionMetricDataResponse.RequestId"));
		describeLiveInteractionMetricDataResponse.setSummaryData(_ctx.stringValue("DescribeLiveInteractionMetricDataResponse.SummaryData"));

		List<Data> nodes = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveInteractionMetricDataResponse.Nodes.Length"); i++) {
			Data data = new Data();
			data.setTimestamp(_ctx.stringValue("DescribeLiveInteractionMetricDataResponse.Nodes["+ i +"].Timestamp"));
			data.setValue(_ctx.stringValue("DescribeLiveInteractionMetricDataResponse.Nodes["+ i +"].Value"));

			nodes.add(data);
		}
		describeLiveInteractionMetricDataResponse.setNodes(nodes);
	 
	 	return describeLiveInteractionMetricDataResponse;
	}
}