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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.ListDevicePersonStatisticsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListDevicePersonStatisticsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevicePersonStatisticsResponseUnmarshaller {

	public static ListDevicePersonStatisticsResponse unmarshall(ListDevicePersonStatisticsResponse listDevicePersonStatisticsResponse, UnmarshallerContext _ctx) {
		
		listDevicePersonStatisticsResponse.setRequestId(_ctx.stringValue("ListDevicePersonStatisticsResponse.RequestId"));
		listDevicePersonStatisticsResponse.setCode(_ctx.stringValue("ListDevicePersonStatisticsResponse.Code"));
		listDevicePersonStatisticsResponse.setMessage(_ctx.stringValue("ListDevicePersonStatisticsResponse.Message"));
		listDevicePersonStatisticsResponse.setTotalCount(_ctx.longValue("ListDevicePersonStatisticsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListDevicePersonStatisticsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setDataSourceId(_ctx.stringValue("ListDevicePersonStatisticsResponse.Data["+ i +"].DataSourceId"));
			datas.setShotTime(_ctx.stringValue("ListDevicePersonStatisticsResponse.Data["+ i +"].ShotTime"));
			datas.setNumber(_ctx.stringValue("ListDevicePersonStatisticsResponse.Data["+ i +"].Number"));

			data.add(datas);
		}
		listDevicePersonStatisticsResponse.setData(data);
	 
	 	return listDevicePersonStatisticsResponse;
	}
}