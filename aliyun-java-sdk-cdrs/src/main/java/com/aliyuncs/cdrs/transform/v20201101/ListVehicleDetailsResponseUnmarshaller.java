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

import com.aliyuncs.cdrs.model.v20201101.ListVehicleDetailsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListVehicleDetailsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVehicleDetailsResponseUnmarshaller {

	public static ListVehicleDetailsResponse unmarshall(ListVehicleDetailsResponse listVehicleDetailsResponse, UnmarshallerContext _ctx) {
		
		listVehicleDetailsResponse.setRequestId(_ctx.stringValue("ListVehicleDetailsResponse.RequestId"));
		listVehicleDetailsResponse.setCode(_ctx.stringValue("ListVehicleDetailsResponse.Code"));
		listVehicleDetailsResponse.setMessage(_ctx.stringValue("ListVehicleDetailsResponse.Message"));
		listVehicleDetailsResponse.setPageNumber(_ctx.longValue("ListVehicleDetailsResponse.PageNumber"));
		listVehicleDetailsResponse.setPageSize(_ctx.longValue("ListVehicleDetailsResponse.PageSize"));
		listVehicleDetailsResponse.setTotalCount(_ctx.longValue("ListVehicleDetailsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListVehicleDetailsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setVehicleId(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].VehicleId"));
			datas.setVehicleColor(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].VehicleColor"));
			datas.setTargetImageStoragePath(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].TargetImageStoragePath"));
			datas.setGender(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].Gender"));
			datas.setPersonType(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].PersonType"));
			datas.setPrefOutTime(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].PrefOutTime"));
			datas.setPopularPoi(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].PopularPoi"));
			datas.setPopularAddress(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].PopularAddress"));
			datas.setSourceImageStoragePath(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].SourceImageStoragePath"));
			datas.setVehicleClass(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].VehicleClass"));
			datas.setVehicleApplication(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].VehicleApplication"));
			datas.setPersonId(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].PersonId"));
			datas.setPlateId(_ctx.stringValue("ListVehicleDetailsResponse.Data["+ i +"].PlateId"));

			data.add(datas);
		}
		listVehicleDetailsResponse.setData(data);
	 
	 	return listVehicleDetailsResponse;
	}
}