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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.DetectImageCarsResponse;
import com.aliyuncs.imm.model.v20200930.DetectImageCarsResponse.CarsItem;
import com.aliyuncs.imm.model.v20200930.DetectImageCarsResponse.CarsItem.Boundary;
import com.aliyuncs.imm.model.v20200930.DetectImageCarsResponse.CarsItem.LicensePlatesItem;
import com.aliyuncs.imm.model.v20200930.DetectImageCarsResponse.CarsItem.LicensePlatesItem.Boundary1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageCarsResponseUnmarshaller {

	public static DetectImageCarsResponse unmarshall(DetectImageCarsResponse detectImageCarsResponse, UnmarshallerContext _ctx) {
		
		detectImageCarsResponse.setRequestId(_ctx.stringValue("DetectImageCarsResponse.RequestId"));

		List<CarsItem> cars = new ArrayList<CarsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectImageCarsResponse.Cars.Length"); i++) {
			CarsItem carsItem = new CarsItem();
			carsItem.setCarType(_ctx.stringValue("DetectImageCarsResponse.Cars["+ i +"].CarType"));
			carsItem.setCarTypeConfidence(_ctx.doubleValue("DetectImageCarsResponse.Cars["+ i +"].CarTypeConfidence"));
			carsItem.setCarColor(_ctx.stringValue("DetectImageCarsResponse.Cars["+ i +"].CarColor"));
			carsItem.setCarColorConfidence(_ctx.doubleValue("DetectImageCarsResponse.Cars["+ i +"].CarColorConfidence"));
			carsItem.setConfidence(_ctx.doubleValue("DetectImageCarsResponse.Cars["+ i +"].Confidence"));

			Boundary boundary = new Boundary();
			boundary.setWidth(_ctx.longValue("DetectImageCarsResponse.Cars["+ i +"].Boundary.Width"));
			boundary.setHeight(_ctx.longValue("DetectImageCarsResponse.Cars["+ i +"].Boundary.Height"));
			boundary.setLeft(_ctx.longValue("DetectImageCarsResponse.Cars["+ i +"].Boundary.Left"));
			boundary.setTop(_ctx.longValue("DetectImageCarsResponse.Cars["+ i +"].Boundary.Top"));
			carsItem.setBoundary(boundary);

			List<LicensePlatesItem> licensePlates = new ArrayList<LicensePlatesItem>();
			for (int j = 0; j < _ctx.lengthValue("DetectImageCarsResponse.Cars["+ i +"].LicensePlates.Length"); j++) {
				LicensePlatesItem licensePlatesItem = new LicensePlatesItem();
				licensePlatesItem.setContent(_ctx.stringValue("DetectImageCarsResponse.Cars["+ i +"].LicensePlates["+ j +"].Content"));
				licensePlatesItem.setConfidence(_ctx.doubleValue("DetectImageCarsResponse.Cars["+ i +"].LicensePlates["+ j +"].Confidence"));

				Boundary1 boundary1 = new Boundary1();
				boundary1.setWidth(_ctx.longValue("DetectImageCarsResponse.Cars["+ i +"].LicensePlates["+ j +"].Boundary.Width"));
				boundary1.setHeight(_ctx.longValue("DetectImageCarsResponse.Cars["+ i +"].LicensePlates["+ j +"].Boundary.Height"));
				boundary1.setLeft(_ctx.longValue("DetectImageCarsResponse.Cars["+ i +"].LicensePlates["+ j +"].Boundary.Left"));
				boundary1.setTop(_ctx.longValue("DetectImageCarsResponse.Cars["+ i +"].LicensePlates["+ j +"].Boundary.Top"));
				licensePlatesItem.setBoundary1(boundary1);

				licensePlates.add(licensePlatesItem);
			}
			carsItem.setLicensePlates(licensePlates);

			cars.add(carsItem);
		}
		detectImageCarsResponse.setCars(cars);
	 
	 	return detectImageCarsResponse;
	}
}