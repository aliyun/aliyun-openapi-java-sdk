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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ocr.model.v20191230.RecognizeIdentityCardResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeIdentityCardResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeIdentityCardResponse.Data.BackResult;
import com.aliyuncs.ocr.model.v20191230.RecognizeIdentityCardResponse.Data.FrontResult;
import com.aliyuncs.ocr.model.v20191230.RecognizeIdentityCardResponse.Data.FrontResult.CardArea;
import com.aliyuncs.ocr.model.v20191230.RecognizeIdentityCardResponse.Data.FrontResult.FaceRectVertice;
import com.aliyuncs.ocr.model.v20191230.RecognizeIdentityCardResponse.Data.FrontResult.FaceRectangle;
import com.aliyuncs.ocr.model.v20191230.RecognizeIdentityCardResponse.Data.FrontResult.FaceRectangle.Center;
import com.aliyuncs.ocr.model.v20191230.RecognizeIdentityCardResponse.Data.FrontResult.FaceRectangle.Size;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeIdentityCardResponseUnmarshaller {

	public static RecognizeIdentityCardResponse unmarshall(RecognizeIdentityCardResponse recognizeIdentityCardResponse, UnmarshallerContext _ctx) {
		
		recognizeIdentityCardResponse.setRequestId(_ctx.stringValue("RecognizeIdentityCardResponse.RequestId"));

		Data data = new Data();

		BackResult backResult = new BackResult();
		backResult.setEndDate(_ctx.stringValue("RecognizeIdentityCardResponse.Data.BackResult.EndDate"));
		backResult.setIssue(_ctx.stringValue("RecognizeIdentityCardResponse.Data.BackResult.Issue"));
		backResult.setStartDate(_ctx.stringValue("RecognizeIdentityCardResponse.Data.BackResult.StartDate"));
		data.setBackResult(backResult);

		FrontResult frontResult = new FrontResult();
		frontResult.setBirthDate(_ctx.stringValue("RecognizeIdentityCardResponse.Data.FrontResult.BirthDate"));
		frontResult.setGender(_ctx.stringValue("RecognizeIdentityCardResponse.Data.FrontResult.Gender"));
		frontResult.setAddress(_ctx.stringValue("RecognizeIdentityCardResponse.Data.FrontResult.Address"));
		frontResult.setNationality(_ctx.stringValue("RecognizeIdentityCardResponse.Data.FrontResult.Nationality"));
		frontResult.setName(_ctx.stringValue("RecognizeIdentityCardResponse.Data.FrontResult.Name"));
		frontResult.setIDNumber(_ctx.stringValue("RecognizeIdentityCardResponse.Data.FrontResult.IDNumber"));

		FaceRectangle faceRectangle = new FaceRectangle();
		faceRectangle.setAngle(_ctx.floatValue("RecognizeIdentityCardResponse.Data.FrontResult.FaceRectangle.Angle"));

		Size size = new Size();
		size.setWidth(_ctx.floatValue("RecognizeIdentityCardResponse.Data.FrontResult.FaceRectangle.Size.Width"));
		size.setHeight(_ctx.floatValue("RecognizeIdentityCardResponse.Data.FrontResult.FaceRectangle.Size.Height"));
		faceRectangle.setSize(size);

		Center center = new Center();
		center.setY(_ctx.floatValue("RecognizeIdentityCardResponse.Data.FrontResult.FaceRectangle.Center.Y"));
		center.setX(_ctx.floatValue("RecognizeIdentityCardResponse.Data.FrontResult.FaceRectangle.Center.X"));
		faceRectangle.setCenter(center);
		frontResult.setFaceRectangle(faceRectangle);

		List<FaceRectVertice> faceRectVertices = new ArrayList<FaceRectVertice>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIdentityCardResponse.Data.FrontResult.FaceRectVertices.Length"); i++) {
			FaceRectVertice faceRectVertice = new FaceRectVertice();
			faceRectVertice.setY(_ctx.floatValue("RecognizeIdentityCardResponse.Data.FrontResult.FaceRectVertices["+ i +"].Y"));
			faceRectVertice.setX(_ctx.floatValue("RecognizeIdentityCardResponse.Data.FrontResult.FaceRectVertices["+ i +"].X"));

			faceRectVertices.add(faceRectVertice);
		}
		frontResult.setFaceRectVertices(faceRectVertices);

		List<CardArea> cardAreas = new ArrayList<CardArea>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIdentityCardResponse.Data.FrontResult.CardAreas.Length"); i++) {
			CardArea cardArea = new CardArea();
			cardArea.setY(_ctx.floatValue("RecognizeIdentityCardResponse.Data.FrontResult.CardAreas["+ i +"].Y"));
			cardArea.setX(_ctx.floatValue("RecognizeIdentityCardResponse.Data.FrontResult.CardAreas["+ i +"].X"));

			cardAreas.add(cardArea);
		}
		frontResult.setCardAreas(cardAreas);
		data.setFrontResult(frontResult);
		recognizeIdentityCardResponse.setData(data);
	 
	 	return recognizeIdentityCardResponse;
	}
}