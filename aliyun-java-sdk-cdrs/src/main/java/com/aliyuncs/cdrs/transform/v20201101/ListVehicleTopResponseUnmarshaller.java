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

import com.aliyuncs.cdrs.model.v20201101.ListVehicleTopResponse;
import com.aliyuncs.cdrs.model.v20201101.ListVehicleTopResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVehicleTopResponseUnmarshaller {

	public static ListVehicleTopResponse unmarshall(ListVehicleTopResponse listVehicleTopResponse, UnmarshallerContext _ctx) {
		
		listVehicleTopResponse.setRequestId(_ctx.stringValue("ListVehicleTopResponse.RequestId"));
		listVehicleTopResponse.setCode(_ctx.stringValue("ListVehicleTopResponse.Code"));
		listVehicleTopResponse.setMessage(_ctx.stringValue("ListVehicleTopResponse.Message"));
		listVehicleTopResponse.setPageNumber(_ctx.longValue("ListVehicleTopResponse.PageNumber"));
		listVehicleTopResponse.setPageSize(_ctx.longValue("ListVehicleTopResponse.PageSize"));
		listVehicleTopResponse.setTotalCount(_ctx.longValue("ListVehicleTopResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListVehicleTopResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setCorpId(_ctx.stringValue("ListVehicleTopResponse.Data["+ i +"].CorpId"));
			datas.setVehicleId(_ctx.stringValue("ListVehicleTopResponse.Data["+ i +"].VehicleId"));
			datas.setPoiId(_ctx.stringValue("ListVehicleTopResponse.Data["+ i +"].PoiId"));
			datas.setPoiName(_ctx.stringValue("ListVehicleTopResponse.Data["+ i +"].PoiName"));
			datas.setPassHour(_ctx.stringValue("ListVehicleTopResponse.Data["+ i +"].PassHour"));
			datas.setFrequency(_ctx.stringValue("ListVehicleTopResponse.Data["+ i +"].Frequency"));

			data.add(datas);
		}
		listVehicleTopResponse.setData(data);
	 
	 	return listVehicleTopResponse;
	}
}