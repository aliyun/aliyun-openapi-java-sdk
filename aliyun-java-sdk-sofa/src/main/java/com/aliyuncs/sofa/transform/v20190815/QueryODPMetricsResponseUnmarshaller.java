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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryODPMetricsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPMetricsResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryODPMetricsResponse.DataItem.MertricsValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPMetricsResponseUnmarshaller {

	public static QueryODPMetricsResponse unmarshall(QueryODPMetricsResponse queryODPMetricsResponse, UnmarshallerContext _ctx) {
		
		queryODPMetricsResponse.setRequestId(_ctx.stringValue("QueryODPMetricsResponse.RequestId"));
		queryODPMetricsResponse.setResultCode(_ctx.stringValue("QueryODPMetricsResponse.ResultCode"));
		queryODPMetricsResponse.setResultMessage(_ctx.stringValue("QueryODPMetricsResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPMetricsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMetricsType(_ctx.stringValue("QueryODPMetricsResponse.Data["+ i +"].MetricsType"));
			dataItem.setSchema(_ctx.stringValue("QueryODPMetricsResponse.Data["+ i +"].Schema"));

			List<MertricsValuesItem> mertricsValues = new ArrayList<MertricsValuesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryODPMetricsResponse.Data["+ i +"].MertricsValues.Length"); j++) {
				MertricsValuesItem mertricsValuesItem = new MertricsValuesItem();
				mertricsValuesItem.setT(_ctx.longValue("QueryODPMetricsResponse.Data["+ i +"].MertricsValues["+ j +"].T"));
				mertricsValuesItem.setV(_ctx.stringValue("QueryODPMetricsResponse.Data["+ i +"].MertricsValues["+ j +"].V"));

				mertricsValues.add(mertricsValuesItem);
			}
			dataItem.setMertricsValues(mertricsValues);

			data.add(dataItem);
		}
		queryODPMetricsResponse.setData(data);
	 
	 	return queryODPMetricsResponse;
	}
}