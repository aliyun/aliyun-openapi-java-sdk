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

import com.aliyuncs.cdrs.model.v20201101.ListDeviceGenderStatisticsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListDeviceGenderStatisticsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceGenderStatisticsResponseUnmarshaller {

	public static ListDeviceGenderStatisticsResponse unmarshall(ListDeviceGenderStatisticsResponse listDeviceGenderStatisticsResponse, UnmarshallerContext _ctx) {
		
		listDeviceGenderStatisticsResponse.setRequestId(_ctx.stringValue("ListDeviceGenderStatisticsResponse.RequestId"));
		listDeviceGenderStatisticsResponse.setCode(_ctx.stringValue("ListDeviceGenderStatisticsResponse.Code"));
		listDeviceGenderStatisticsResponse.setMessage(_ctx.stringValue("ListDeviceGenderStatisticsResponse.Message"));
		listDeviceGenderStatisticsResponse.setTotalCount(_ctx.longValue("ListDeviceGenderStatisticsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceGenderStatisticsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setDataSourceId(_ctx.stringValue("ListDeviceGenderStatisticsResponse.Data["+ i +"].DataSourceId"));
			datas.setGender(_ctx.stringValue("ListDeviceGenderStatisticsResponse.Data["+ i +"].Gender"));
			datas.setNumber(_ctx.stringValue("ListDeviceGenderStatisticsResponse.Data["+ i +"].Number"));

			data.add(datas);
		}
		listDeviceGenderStatisticsResponse.setData(data);
	 
	 	return listDeviceGenderStatisticsResponse;
	}
}