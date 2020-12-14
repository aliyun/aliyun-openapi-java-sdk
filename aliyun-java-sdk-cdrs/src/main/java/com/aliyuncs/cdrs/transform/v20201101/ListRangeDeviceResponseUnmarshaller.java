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

import com.aliyuncs.cdrs.model.v20201101.ListRangeDeviceResponse;
import com.aliyuncs.cdrs.model.v20201101.ListRangeDeviceResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRangeDeviceResponseUnmarshaller {

	public static ListRangeDeviceResponse unmarshall(ListRangeDeviceResponse listRangeDeviceResponse, UnmarshallerContext _ctx) {
		
		listRangeDeviceResponse.setRequestId(_ctx.stringValue("ListRangeDeviceResponse.RequestId"));
		listRangeDeviceResponse.setCode(_ctx.stringValue("ListRangeDeviceResponse.Code"));
		listRangeDeviceResponse.setMessage(_ctx.stringValue("ListRangeDeviceResponse.Message"));
		listRangeDeviceResponse.setPageNumber(_ctx.longValue("ListRangeDeviceResponse.PageNumber"));
		listRangeDeviceResponse.setPageSize(_ctx.longValue("ListRangeDeviceResponse.PageSize"));
		listRangeDeviceResponse.setTotalCount(_ctx.longValue("ListRangeDeviceResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListRangeDeviceResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setCorpId(_ctx.stringValue("ListRangeDeviceResponse.Data["+ i +"].CorpId"));
			datas.setDataSourceId(_ctx.stringValue("ListRangeDeviceResponse.Data["+ i +"].DataSourceId"));
			datas.setNearPoi(_ctx.stringValue("ListRangeDeviceResponse.Data["+ i +"].NearPoi"));
			datas.setDistance(_ctx.stringValue("ListRangeDeviceResponse.Data["+ i +"].Distance"));
			datas.setDataSourceIdPoi(_ctx.stringValue("ListRangeDeviceResponse.Data["+ i +"].DataSourceIdPoi"));
			datas.setLatitude(_ctx.stringValue("ListRangeDeviceResponse.Data["+ i +"].Latitude"));
			datas.setDataSourceIdName(_ctx.stringValue("ListRangeDeviceResponse.Data["+ i +"].DataSourceIdName"));
			datas.setLongitude(_ctx.stringValue("ListRangeDeviceResponse.Data["+ i +"].Longitude"));

			data.add(datas);
		}
		listRangeDeviceResponse.setData(data);
	 
	 	return listRangeDeviceResponse;
	}
}