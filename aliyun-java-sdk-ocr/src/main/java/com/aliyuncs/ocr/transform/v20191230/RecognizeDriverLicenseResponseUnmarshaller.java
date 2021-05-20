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

import com.aliyuncs.ocr.model.v20191230.RecognizeDriverLicenseResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeDriverLicenseResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeDriverLicenseResponse.Data.BackResult;
import com.aliyuncs.ocr.model.v20191230.RecognizeDriverLicenseResponse.Data.FaceResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeDriverLicenseResponseUnmarshaller {

	public static RecognizeDriverLicenseResponse unmarshall(RecognizeDriverLicenseResponse recognizeDriverLicenseResponse, UnmarshallerContext _ctx) {
		
		recognizeDriverLicenseResponse.setRequestId(_ctx.stringValue("RecognizeDriverLicenseResponse.RequestId"));
		recognizeDriverLicenseResponse.setCode(_ctx.stringValue("RecognizeDriverLicenseResponse.Code"));
		recognizeDriverLicenseResponse.setMessage(_ctx.stringValue("RecognizeDriverLicenseResponse.Message"));

		Data data = new Data();

		BackResult backResult = new BackResult();
		backResult.setArchiveNumber(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.BackResult.ArchiveNumber"));
		backResult.setName(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.BackResult.Name"));
		backResult.setCardNumber(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.BackResult.CardNumber"));
		backResult.setRecord(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.BackResult.Record"));
		data.setBackResult(backResult);

		FaceResult faceResult = new FaceResult();
		faceResult.setVehicleType(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.VehicleType"));
		faceResult.setIssueDate(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.IssueDate"));
		faceResult.setEndDate(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.EndDate"));
		faceResult.setGender(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.Gender"));
		faceResult.setAddress(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.Address"));
		faceResult.setStartDate(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.StartDate"));
		faceResult.setLicenseNumber(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.LicenseNumber"));
		faceResult.setName(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.Name"));
		faceResult.setIssueUnit(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.IssueUnit"));
		data.setFaceResult(faceResult);
		recognizeDriverLicenseResponse.setData(data);
	 
	 	return recognizeDriverLicenseResponse;
	}
}