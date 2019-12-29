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

		Data data = new Data();

		FaceResult faceResult = new FaceResult();
		faceResult.setName(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.Name"));
		faceResult.setLicenseNumber(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.LicenseNumber"));
		faceResult.setVehicleType(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.VehicleType"));
		faceResult.setStartDate(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.StartDate"));
		faceResult.setEndDate(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.EndDate"));
		faceResult.setIssueDate(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.IssueDate"));
		faceResult.setAddress(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.Address"));
		faceResult.setGender(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.FaceResult.Gender"));
		data.setFaceResult(faceResult);

		BackResult backResult = new BackResult();
		backResult.setArchiveNumber(_ctx.stringValue("RecognizeDriverLicenseResponse.Data.BackResult.ArchiveNumber"));
		data.setBackResult(backResult);
		recognizeDriverLicenseResponse.setData(data);
	 
	 	return recognizeDriverLicenseResponse;
	}
}