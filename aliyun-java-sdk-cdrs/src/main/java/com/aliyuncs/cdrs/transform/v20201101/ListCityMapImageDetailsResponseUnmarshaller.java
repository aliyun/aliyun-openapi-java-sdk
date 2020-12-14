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

import com.aliyuncs.cdrs.model.v20201101.ListCityMapImageDetailsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListCityMapImageDetailsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCityMapImageDetailsResponseUnmarshaller {

	public static ListCityMapImageDetailsResponse unmarshall(ListCityMapImageDetailsResponse listCityMapImageDetailsResponse, UnmarshallerContext _ctx) {
		
		listCityMapImageDetailsResponse.setRequestId(_ctx.stringValue("ListCityMapImageDetailsResponse.RequestId"));
		listCityMapImageDetailsResponse.setCode(_ctx.stringValue("ListCityMapImageDetailsResponse.Code"));
		listCityMapImageDetailsResponse.setMessage(_ctx.stringValue("ListCityMapImageDetailsResponse.Message"));
		listCityMapImageDetailsResponse.setPageNumber(_ctx.longValue("ListCityMapImageDetailsResponse.PageNumber"));
		listCityMapImageDetailsResponse.setPageSize(_ctx.longValue("ListCityMapImageDetailsResponse.PageSize"));
		listCityMapImageDetailsResponse.setTotalCount(_ctx.longValue("ListCityMapImageDetailsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListCityMapImageDetailsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setPersonTargetImageStoragePath(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].PersonTargetImageStoragePath"));
			datas.setAgeLowerLimit(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].AgeLowerLimit"));
			datas.setAgeUpLimit(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].AgeUpLimit"));
			datas.setVehicleColor(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].VehicleColor"));
			datas.setTrousersColor(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].TrousersColor"));
			datas.setDataSourceId(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].DataSourceId"));
			datas.setGender(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].Gender"));
			datas.setAgeLowerLimitReliability(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].AgeLowerLimitReliability"));
			datas.setGenderCodeReliability(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].GenderCodeReliability"));
			datas.setVehicleClassReliability(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].VehicleClassReliability"));
			datas.setRecordId(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].RecordId"));
			datas.setAgeCodeReliability(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].AgeCodeReliability"));
			datas.setSourceImageStoragePath(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].SourceImageStoragePath"));
			datas.setVehicleClass(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].VehicleClass"));
			datas.setMotorTargetImageStoragePath(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].MotorTargetImageStoragePath"));
			datas.setCoatColor(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].CoatColor"));
			datas.setFaceTargetImageStoragePath(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].FaceTargetImageStoragePath"));
			datas.setShotTime(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].ShotTime"));
			datas.setVehicleColorReliability(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].VehicleColorReliability"));
			datas.setTrousersColorReliability(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].TrousersColorReliability"));
			datas.setCoatColorReliability(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].CoatColorReliability"));
			datas.setLeftTopX(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].LeftTopX"));
			datas.setLeftTopY(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].LeftTopY"));
			datas.setRightBottomX(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].RightBottomX"));
			datas.setRightBottomY(_ctx.stringValue("ListCityMapImageDetailsResponse.Data["+ i +"].RightBottomY"));

			data.add(datas);
		}
		listCityMapImageDetailsResponse.setData(data);
	 
	 	return listCityMapImageDetailsResponse;
	}
}