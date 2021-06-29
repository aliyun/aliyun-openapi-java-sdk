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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.GetDataSourceStatsResponse;
import com.aliyuncs.vcs.model.v20200515.GetDataSourceStatsResponse.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataSourceStatsResponseUnmarshaller {

	public static GetDataSourceStatsResponse unmarshall(GetDataSourceStatsResponse getDataSourceStatsResponse, UnmarshallerContext _ctx) {
		
		getDataSourceStatsResponse.setRequestId(_ctx.stringValue("GetDataSourceStatsResponse.RequestId"));
		getDataSourceStatsResponse.setCode(_ctx.stringValue("GetDataSourceStatsResponse.Code"));
		getDataSourceStatsResponse.setMessage(_ctx.stringValue("GetDataSourceStatsResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDataSourceStatsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDataSourceType(_ctx.stringValue("GetDataSourceStatsResponse.Data["+ i +"].DataSourceType"));
			dataItem.setTotal(_ctx.longValue("GetDataSourceStatsResponse.Data["+ i +"].Total"));
			dataItem.setItems(_ctx.mapValue("GetDataSourceStatsResponse.Data["+ i +"].Items"));

			data.add(dataItem);
		}
		getDataSourceStatsResponse.setData(data);
	 
	 	return getDataSourceStatsResponse;
	}
}