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

import com.aliyuncs.cdrs.model.v20201101.ListDeviceDetailResponse;
import com.aliyuncs.cdrs.model.v20201101.ListDeviceDetailResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceDetailResponseUnmarshaller {

	public static ListDeviceDetailResponse unmarshall(ListDeviceDetailResponse listDeviceDetailResponse, UnmarshallerContext _ctx) {
		
		listDeviceDetailResponse.setRequestId(_ctx.stringValue("ListDeviceDetailResponse.RequestId"));
		listDeviceDetailResponse.setCode(_ctx.stringValue("ListDeviceDetailResponse.Code"));
		listDeviceDetailResponse.setMessage(_ctx.stringValue("ListDeviceDetailResponse.Message"));
		listDeviceDetailResponse.setPageNumber(_ctx.longValue("ListDeviceDetailResponse.PageNumber"));
		listDeviceDetailResponse.setPageSize(_ctx.longValue("ListDeviceDetailResponse.PageSize"));
		listDeviceDetailResponse.setTotalCount(_ctx.longValue("ListDeviceDetailResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceDetailResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setDataSourceId(_ctx.stringValue("ListDeviceDetailResponse.Data["+ i +"].DataSourceId"));
			datas.setCorpId(_ctx.stringValue("ListDeviceDetailResponse.Data["+ i +"].CorpId"));
			datas.setDataSourceName(_ctx.stringValue("ListDeviceDetailResponse.Data["+ i +"].DataSourceName"));
			datas.setDataSourcePoi(_ctx.stringValue("ListDeviceDetailResponse.Data["+ i +"].DataSourcePoi"));
			datas.setNearPoi(_ctx.stringValue("ListDeviceDetailResponse.Data["+ i +"].NearPoi"));
			datas.setLatitude(_ctx.stringValue("ListDeviceDetailResponse.Data["+ i +"].Latitude"));
			datas.setLongitude(_ctx.stringValue("ListDeviceDetailResponse.Data["+ i +"].Longitude"));

			data.add(datas);
		}
		listDeviceDetailResponse.setData(data);
	 
	 	return listDeviceDetailResponse;
	}
}