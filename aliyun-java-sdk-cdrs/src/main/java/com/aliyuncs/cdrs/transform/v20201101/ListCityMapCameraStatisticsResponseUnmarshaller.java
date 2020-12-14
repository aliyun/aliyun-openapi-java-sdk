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

import com.aliyuncs.cdrs.model.v20201101.ListCityMapCameraStatisticsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListCityMapCameraStatisticsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCityMapCameraStatisticsResponseUnmarshaller {

	public static ListCityMapCameraStatisticsResponse unmarshall(ListCityMapCameraStatisticsResponse listCityMapCameraStatisticsResponse, UnmarshallerContext _ctx) {
		
		listCityMapCameraStatisticsResponse.setRequestId(_ctx.stringValue("ListCityMapCameraStatisticsResponse.RequestId"));
		listCityMapCameraStatisticsResponse.setCode(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Code"));
		listCityMapCameraStatisticsResponse.setMessage(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Message"));
		listCityMapCameraStatisticsResponse.setPageNumber(_ctx.longValue("ListCityMapCameraStatisticsResponse.PageNumber"));
		listCityMapCameraStatisticsResponse.setPageSize(_ctx.longValue("ListCityMapCameraStatisticsResponse.PageSize"));
		listCityMapCameraStatisticsResponse.setTotalCount(_ctx.longValue("ListCityMapCameraStatisticsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListCityMapCameraStatisticsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setDataSourceId(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Data["+ i +"].DataSourceId"));
			datas.setLatitude(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Data["+ i +"].Latitude"));
			datas.setLongitude(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Data["+ i +"].Longitude"));
			datas.setDataSourceName(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Data["+ i +"].DataSourceName"));
			datas.setCorpId(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Data["+ i +"].CorpId"));
			datas.setAdultValue(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Data["+ i +"].AdultValue"));
			datas.setWomanValue(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Data["+ i +"].WomanValue"));
			datas.setMotorValue(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Data["+ i +"].MotorValue"));
			datas.setManValue(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Data["+ i +"].ManValue"));
			datas.setOldValue(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Data["+ i +"].OldValue"));
			datas.setChildValue(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Data["+ i +"].ChildValue"));
			datas.setStatisticTime(_ctx.stringValue("ListCityMapCameraStatisticsResponse.Data["+ i +"].StatisticTime"));

			data.add(datas);
		}
		listCityMapCameraStatisticsResponse.setData(data);
	 
	 	return listCityMapCameraStatisticsResponse;
	}
}