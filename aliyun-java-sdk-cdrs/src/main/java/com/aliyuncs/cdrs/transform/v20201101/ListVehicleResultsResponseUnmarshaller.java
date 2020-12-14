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

import com.aliyuncs.cdrs.model.v20201101.ListVehicleResultsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListVehicleResultsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVehicleResultsResponseUnmarshaller {

	public static ListVehicleResultsResponse unmarshall(ListVehicleResultsResponse listVehicleResultsResponse, UnmarshallerContext _ctx) {
		
		listVehicleResultsResponse.setRequestId(_ctx.stringValue("ListVehicleResultsResponse.RequestId"));
		listVehicleResultsResponse.setCode(_ctx.stringValue("ListVehicleResultsResponse.Code"));
		listVehicleResultsResponse.setMessage(_ctx.stringValue("ListVehicleResultsResponse.Message"));
		listVehicleResultsResponse.setPageNumber(_ctx.longValue("ListVehicleResultsResponse.PageNumber"));
		listVehicleResultsResponse.setPageSize(_ctx.longValue("ListVehicleResultsResponse.PageSize"));
		listVehicleResultsResponse.setTotalCount(_ctx.longValue("ListVehicleResultsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListVehicleResultsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setVehicleId(_ctx.stringValue("ListVehicleResultsResponse.Data["+ i +"].VehicleId"));
			datas.setGender(_ctx.stringValue("ListVehicleResultsResponse.Data["+ i +"].Gender"));
			datas.setVehicleClass(_ctx.stringValue("ListVehicleResultsResponse.Data["+ i +"].VehicleClass"));
			datas.setProfession(_ctx.stringValue("ListVehicleResultsResponse.Data["+ i +"].Profession"));
			datas.setLiveAddress(_ctx.stringValue("ListVehicleResultsResponse.Data["+ i +"].LiveAddress"));
			datas.setPlateId(_ctx.stringValue("ListVehicleResultsResponse.Data["+ i +"].PlateId"));
			datas.setVehicleApplication(_ctx.stringValue("ListVehicleResultsResponse.Data["+ i +"].VehicleApplication"));
			datas.setPersonId(_ctx.stringValue("ListVehicleResultsResponse.Data["+ i +"].PersonId"));
			datas.setUpdateTime(_ctx.stringValue("ListVehicleResultsResponse.Data["+ i +"].UpdateTime"));

			data.add(datas);
		}
		listVehicleResultsResponse.setData(data);
	 
	 	return listVehicleResultsResponse;
	}
}