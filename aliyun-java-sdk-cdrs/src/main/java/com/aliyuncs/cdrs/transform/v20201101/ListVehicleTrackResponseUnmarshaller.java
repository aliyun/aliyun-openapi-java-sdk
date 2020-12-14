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

import com.aliyuncs.cdrs.model.v20201101.ListVehicleTrackResponse;
import com.aliyuncs.cdrs.model.v20201101.ListVehicleTrackResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVehicleTrackResponseUnmarshaller {

	public static ListVehicleTrackResponse unmarshall(ListVehicleTrackResponse listVehicleTrackResponse, UnmarshallerContext _ctx) {
		
		listVehicleTrackResponse.setRequestId(_ctx.stringValue("ListVehicleTrackResponse.RequestId"));
		listVehicleTrackResponse.setCode(_ctx.stringValue("ListVehicleTrackResponse.Code"));
		listVehicleTrackResponse.setMessage(_ctx.stringValue("ListVehicleTrackResponse.Message"));
		listVehicleTrackResponse.setPageNumber(_ctx.longValue("ListVehicleTrackResponse.PageNumber"));
		listVehicleTrackResponse.setPageSize(_ctx.longValue("ListVehicleTrackResponse.PageSize"));
		listVehicleTrackResponse.setTotalCount(_ctx.longValue("ListVehicleTrackResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListVehicleTrackResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setPlateId(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].PlateId"));
			datas.setCorpId(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].CorpId"));
			datas.setDataSourceId(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].DataSourceId"));
			datas.setDataSourceName(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].DataSourceName"));
			datas.setPicUrlPath(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].PicUrlPath"));
			datas.setTargetPicUrlPath(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].TargetPicUrlPath"));
			datas.setRightBottomY(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].RightBottomY"));
			datas.setRightBottomX(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].RightBottomX"));
			datas.setLeftTopY(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].LeftTopY"));
			datas.setLeftTopX(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].LeftTopX"));
			datas.setPassTime(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].PassTime"));
			datas.setOrder(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].Order"));
			datas.setLatitude(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].Latitude"));
			datas.setLongitude(_ctx.stringValue("ListVehicleTrackResponse.Data["+ i +"].Longitude"));

			data.add(datas);
		}
		listVehicleTrackResponse.setData(data);
	 
	 	return listVehicleTrackResponse;
	}
}