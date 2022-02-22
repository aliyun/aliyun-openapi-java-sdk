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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.QueryMonitorResponse;
import com.aliyuncs.mse.model.v20190531.QueryMonitorResponse.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMonitorResponseUnmarshaller {

	public static QueryMonitorResponse unmarshall(QueryMonitorResponse queryMonitorResponse, UnmarshallerContext _ctx) {
		
		queryMonitorResponse.setRequestId(_ctx.stringValue("QueryMonitorResponse.RequestId"));
		queryMonitorResponse.setMessage(_ctx.stringValue("QueryMonitorResponse.Message"));
		queryMonitorResponse.setErrorCode(_ctx.stringValue("QueryMonitorResponse.ErrorCode"));
		queryMonitorResponse.setSuccess(_ctx.booleanValue("QueryMonitorResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMonitorResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setPodName(_ctx.stringValue("QueryMonitorResponse.Data["+ i +"].podName"));
			dataItem.setClusterNamePrefix(_ctx.stringValue("QueryMonitorResponse.Data["+ i +"].clusterNamePrefix"));

			List<Map<Object, Object>> values = _ctx.listMapValue("QueryMonitorResponse.Data["+ i +"].values");
			dataItem.setValues(values);

			data.add(dataItem);
		}
		queryMonitorResponse.setData(data);
	 
	 	return queryMonitorResponse;
	}
}