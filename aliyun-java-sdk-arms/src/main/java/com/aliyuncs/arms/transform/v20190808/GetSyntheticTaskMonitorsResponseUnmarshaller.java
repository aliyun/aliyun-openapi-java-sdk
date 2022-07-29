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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskMonitorsResponse;
import com.aliyuncs.arms.model.v20190808.GetSyntheticTaskMonitorsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSyntheticTaskMonitorsResponseUnmarshaller {

	public static GetSyntheticTaskMonitorsResponse unmarshall(GetSyntheticTaskMonitorsResponse getSyntheticTaskMonitorsResponse, UnmarshallerContext _ctx) {
		
		getSyntheticTaskMonitorsResponse.setRequestId(_ctx.stringValue("GetSyntheticTaskMonitorsResponse.RequestId"));
		getSyntheticTaskMonitorsResponse.setCode(_ctx.stringValue("GetSyntheticTaskMonitorsResponse.Code"));
		getSyntheticTaskMonitorsResponse.setMsg(_ctx.stringValue("GetSyntheticTaskMonitorsResponse.Msg"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSyntheticTaskMonitorsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setClientType(_ctx.longValue("GetSyntheticTaskMonitorsResponse.Data["+ i +"].ClientType"));
			dataItem.setCityCode(_ctx.longValue("GetSyntheticTaskMonitorsResponse.Data["+ i +"].CityCode"));
			dataItem.setCity(_ctx.stringValue("GetSyntheticTaskMonitorsResponse.Data["+ i +"].City"));
			dataItem.setDistrict(_ctx.stringValue("GetSyntheticTaskMonitorsResponse.Data["+ i +"].District"));
			dataItem.setNetServiceId(_ctx.longValue("GetSyntheticTaskMonitorsResponse.Data["+ i +"].NetServiceId"));
			dataItem.setNetServiceName(_ctx.stringValue("GetSyntheticTaskMonitorsResponse.Data["+ i +"].NetServiceName"));
			dataItem.setBusy(_ctx.longValue("GetSyntheticTaskMonitorsResponse.Data["+ i +"].Busy"));

			data.add(dataItem);
		}
		getSyntheticTaskMonitorsResponse.setData(data);
	 
	 	return getSyntheticTaskMonitorsResponse;
	}
}