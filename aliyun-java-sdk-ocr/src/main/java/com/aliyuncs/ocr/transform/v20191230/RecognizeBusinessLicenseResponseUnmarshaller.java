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

import com.aliyuncs.ocr.model.v20191230.RecognizeBusinessLicenseResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeBusinessLicenseResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeBusinessLicenseResponse.Data.Emblem;
import com.aliyuncs.ocr.model.v20191230.RecognizeBusinessLicenseResponse.Data.QRCode;
import com.aliyuncs.ocr.model.v20191230.RecognizeBusinessLicenseResponse.Data.Stamp;
import com.aliyuncs.ocr.model.v20191230.RecognizeBusinessLicenseResponse.Data.Title;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeBusinessLicenseResponseUnmarshaller {

	public static RecognizeBusinessLicenseResponse unmarshall(RecognizeBusinessLicenseResponse recognizeBusinessLicenseResponse, UnmarshallerContext _ctx) {
		
		recognizeBusinessLicenseResponse.setRequestId(_ctx.stringValue("RecognizeBusinessLicenseResponse.RequestId"));

		Data data = new Data();
		data.setAngle(_ctx.floatValue("RecognizeBusinessLicenseResponse.Data.Angle"));
		data.setRegisterNumber(_ctx.stringValue("RecognizeBusinessLicenseResponse.Data.RegisterNumber"));
		data.setName(_ctx.stringValue("RecognizeBusinessLicenseResponse.Data.Name"));
		data.setType(_ctx.stringValue("RecognizeBusinessLicenseResponse.Data.Type"));
		data.setLegalPerson(_ctx.stringValue("RecognizeBusinessLicenseResponse.Data.LegalPerson"));
		data.setEstablishDate(_ctx.stringValue("RecognizeBusinessLicenseResponse.Data.EstablishDate"));
		data.setValidPeriod(_ctx.stringValue("RecognizeBusinessLicenseResponse.Data.ValidPeriod"));
		data.setAddress(_ctx.stringValue("RecognizeBusinessLicenseResponse.Data.Address"));
		data.setCapital(_ctx.stringValue("RecognizeBusinessLicenseResponse.Data.Capital"));
		data.setBusiness(_ctx.stringValue("RecognizeBusinessLicenseResponse.Data.Business"));

		Emblem emblem = new Emblem();
		emblem.setTop(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.Emblem.Top"));
		emblem.setLeft(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.Emblem.Left"));
		emblem.setHeight(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.Emblem.Height"));
		emblem.setWidth(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.Emblem.Width"));
		data.setEmblem(emblem);

		Title title = new Title();
		title.setTop(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.Title.Top"));
		title.setLeft(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.Title.Left"));
		title.setHeight(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.Title.Height"));
		title.setWidth(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.Title.Width"));
		data.setTitle(title);

		Stamp stamp = new Stamp();
		stamp.setTop(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.Stamp.Top"));
		stamp.setLeft(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.Stamp.Left"));
		stamp.setHeight(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.Stamp.Height"));
		stamp.setWidth(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.Stamp.Width"));
		data.setStamp(stamp);

		QRCode qRCode = new QRCode();
		qRCode.setTop(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.QRCode.Top"));
		qRCode.setLeft(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.QRCode.Left"));
		qRCode.setHeight(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.QRCode.Height"));
		qRCode.setWidth(_ctx.integerValue("RecognizeBusinessLicenseResponse.Data.QRCode.Width"));
		data.setQRCode(qRCode);
		recognizeBusinessLicenseResponse.setData(data);
	 
	 	return recognizeBusinessLicenseResponse;
	}
}