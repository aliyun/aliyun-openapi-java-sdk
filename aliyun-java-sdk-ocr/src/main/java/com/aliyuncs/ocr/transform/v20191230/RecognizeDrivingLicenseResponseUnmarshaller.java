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

package com.aliyuncs.ocr.transform.v20191230;

import com.aliyuncs.ocr.model.v20191230.RecognizeDrivingLicenseResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeDrivingLicenseResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeDrivingLicenseResponse.Data.BackResult;
import com.aliyuncs.ocr.model.v20191230.RecognizeDrivingLicenseResponse.Data.FaceResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeDrivingLicenseResponseUnmarshaller {

	public static RecognizeDrivingLicenseResponse unmarshall(RecognizeDrivingLicenseResponse recognizeDrivingLicenseResponse, UnmarshallerContext _ctx) {
		
		recognizeDrivingLicenseResponse.setRequestId(_ctx.stringValue("RecognizeDrivingLicenseResponse.RequestId"));

		Data data = new Data();

		FaceResult faceResult = new FaceResult();
		faceResult.setPlateNumber(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.FaceResult.PlateNumber"));
		faceResult.setVehicleType(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.FaceResult.VehicleType"));
		faceResult.setOwner(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.FaceResult.Owner"));
		faceResult.setUseCharacter(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.FaceResult.UseCharacter"));
		faceResult.setAddress(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.FaceResult.Address"));
		faceResult.setModel(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.FaceResult.Model"));
		faceResult.setVin(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.FaceResult.Vin"));
		faceResult.setEngineNumber(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.FaceResult.EngineNumber"));
		faceResult.setRegisterDate(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.FaceResult.RegisterDate"));
		faceResult.setIssueDate(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.FaceResult.IssueDate"));
		data.setFaceResult(faceResult);

		BackResult backResult = new BackResult();
		backResult.setApprovedPassengerCapacity(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.BackResult.ApprovedPassengerCapacity"));
		backResult.setApprovedLoad(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.BackResult.ApprovedLoad"));
		backResult.setFileNumber(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.BackResult.FileNumber"));
		backResult.setGrossMass(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.BackResult.GrossMass"));
		backResult.setEnergyType(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.BackResult.EnergyType"));
		backResult.setInspectionRecord(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.BackResult.InspectionRecord"));
		backResult.setOverallDimension(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.BackResult.OverallDimension"));
		backResult.setTractionMass(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.BackResult.TractionMass"));
		backResult.setUnladenMass(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.BackResult.UnladenMass"));
		backResult.setPlateNumber(_ctx.stringValue("RecognizeDrivingLicenseResponse.Data.BackResult.PlateNumber"));
		data.setBackResult(backResult);
		recognizeDrivingLicenseResponse.setData(data);
	 
	 	return recognizeDrivingLicenseResponse;
	}
}