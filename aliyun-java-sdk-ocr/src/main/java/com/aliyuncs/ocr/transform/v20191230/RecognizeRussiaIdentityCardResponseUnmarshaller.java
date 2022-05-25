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

import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.BirthDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.BirthDate.KeyPointsItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.BirthPlaceFirstLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.BirthPlaceFirstLine.KeyPointsItem2;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.BirthPlaceSecondLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.BirthPlaceSecondLine.KeyPointsItem4;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.BirthPlaceThirdLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.BirthPlaceThirdLine.KeyPointsItem6;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.CardBox;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.CardBox.KeyPointsItem8;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.GivenName;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.GivenName.KeyPointsItem10;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.IdNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.IdNumber.KeyPointsItem12;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.PaternalName;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.PaternalName.KeyPointsItem14;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.PortraitBox;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.PortraitBox.KeyPointsItem16;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.Sex;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.Sex.KeyPointsItem18;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.SurnameFirstLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.SurnameFirstLine.KeyPointsItem20;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.SurnameSecondLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeRussiaIdentityCardResponse.Data.SurnameSecondLine.KeyPointsItem22;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeRussiaIdentityCardResponseUnmarshaller {

	public static RecognizeRussiaIdentityCardResponse unmarshall(RecognizeRussiaIdentityCardResponse recognizeRussiaIdentityCardResponse, UnmarshallerContext _ctx) {
		
		recognizeRussiaIdentityCardResponse.setRequestId(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.RequestId"));
		recognizeRussiaIdentityCardResponse.setCode(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Code"));
		recognizeRussiaIdentityCardResponse.setMessage(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Message"));

		Data data = new Data();

		BirthDate birthDate = new BirthDate();
		birthDate.setText(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.BirthDate.Text"));
		birthDate.setScore(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.BirthDate.Score"));

		List<KeyPointsItem> keyPoints = new ArrayList<KeyPointsItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeRussiaIdentityCardResponse.Data.BirthDate.KeyPoints.Length"); i++) {
			KeyPointsItem keyPointsItem = new KeyPointsItem();
			keyPointsItem.setX(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.BirthDate.KeyPoints["+ i +"].X"));
			keyPointsItem.setY(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.BirthDate.KeyPoints["+ i +"].Y"));

			keyPoints.add(keyPointsItem);
		}
		birthDate.setKeyPoints(keyPoints);
		data.setBirthDate(birthDate);

		BirthPlaceFirstLine birthPlaceFirstLine = new BirthPlaceFirstLine();
		birthPlaceFirstLine.setText(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceFirstLine.Text"));
		birthPlaceFirstLine.setScore(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceFirstLine.Score"));

		List<KeyPointsItem2> keyPoints1 = new ArrayList<KeyPointsItem2>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceFirstLine.KeyPoints.Length"); i++) {
			KeyPointsItem2 keyPointsItem2 = new KeyPointsItem2();
			keyPointsItem2.setX(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceFirstLine.KeyPoints["+ i +"].X"));
			keyPointsItem2.setY(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceFirstLine.KeyPoints["+ i +"].Y"));

			keyPoints1.add(keyPointsItem2);
		}
		birthPlaceFirstLine.setKeyPoints1(keyPoints1);
		data.setBirthPlaceFirstLine(birthPlaceFirstLine);

		BirthPlaceSecondLine birthPlaceSecondLine = new BirthPlaceSecondLine();
		birthPlaceSecondLine.setText(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceSecondLine.Text"));
		birthPlaceSecondLine.setScore(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceSecondLine.Score"));

		List<KeyPointsItem4> keyPoints3 = new ArrayList<KeyPointsItem4>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceSecondLine.KeyPoints.Length"); i++) {
			KeyPointsItem4 keyPointsItem4 = new KeyPointsItem4();
			keyPointsItem4.setX(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceSecondLine.KeyPoints["+ i +"].X"));
			keyPointsItem4.setY(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceSecondLine.KeyPoints["+ i +"].Y"));

			keyPoints3.add(keyPointsItem4);
		}
		birthPlaceSecondLine.setKeyPoints3(keyPoints3);
		data.setBirthPlaceSecondLine(birthPlaceSecondLine);

		BirthPlaceThirdLine birthPlaceThirdLine = new BirthPlaceThirdLine();
		birthPlaceThirdLine.setText(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceThirdLine.Text"));
		birthPlaceThirdLine.setScore(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceThirdLine.Score"));

		List<KeyPointsItem6> keyPoints5 = new ArrayList<KeyPointsItem6>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceThirdLine.KeyPoints.Length"); i++) {
			KeyPointsItem6 keyPointsItem6 = new KeyPointsItem6();
			keyPointsItem6.setX(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceThirdLine.KeyPoints["+ i +"].X"));
			keyPointsItem6.setY(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.BirthPlaceThirdLine.KeyPoints["+ i +"].Y"));

			keyPoints5.add(keyPointsItem6);
		}
		birthPlaceThirdLine.setKeyPoints5(keyPoints5);
		data.setBirthPlaceThirdLine(birthPlaceThirdLine);

		CardBox cardBox = new CardBox();
		cardBox.setText(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.CardBox.Text"));
		cardBox.setScore(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.CardBox.Score"));

		List<KeyPointsItem8> keyPoints7 = new ArrayList<KeyPointsItem8>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeRussiaIdentityCardResponse.Data.CardBox.KeyPoints.Length"); i++) {
			KeyPointsItem8 keyPointsItem8 = new KeyPointsItem8();
			keyPointsItem8.setX(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.CardBox.KeyPoints["+ i +"].X"));
			keyPointsItem8.setY(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.CardBox.KeyPoints["+ i +"].Y"));

			keyPoints7.add(keyPointsItem8);
		}
		cardBox.setKeyPoints7(keyPoints7);
		data.setCardBox(cardBox);

		GivenName givenName = new GivenName();
		givenName.setText(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.GivenName.Text"));
		givenName.setScore(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.GivenName.Score"));

		List<KeyPointsItem10> keyPoints9 = new ArrayList<KeyPointsItem10>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeRussiaIdentityCardResponse.Data.GivenName.KeyPoints.Length"); i++) {
			KeyPointsItem10 keyPointsItem10 = new KeyPointsItem10();
			keyPointsItem10.setX(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.GivenName.KeyPoints["+ i +"].X"));
			keyPointsItem10.setY(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.GivenName.KeyPoints["+ i +"].Y"));

			keyPoints9.add(keyPointsItem10);
		}
		givenName.setKeyPoints9(keyPoints9);
		data.setGivenName(givenName);

		IdNumber idNumber = new IdNumber();
		idNumber.setText(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.IdNumber.Text"));
		idNumber.setScore(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.IdNumber.Score"));

		List<KeyPointsItem12> keyPoints11 = new ArrayList<KeyPointsItem12>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeRussiaIdentityCardResponse.Data.IdNumber.KeyPoints.Length"); i++) {
			KeyPointsItem12 keyPointsItem12 = new KeyPointsItem12();
			keyPointsItem12.setX(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.IdNumber.KeyPoints["+ i +"].X"));
			keyPointsItem12.setY(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.IdNumber.KeyPoints["+ i +"].Y"));

			keyPoints11.add(keyPointsItem12);
		}
		idNumber.setKeyPoints11(keyPoints11);
		data.setIdNumber(idNumber);

		PaternalName paternalName = new PaternalName();
		paternalName.setText(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.PaternalName.Text"));
		paternalName.setScore(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.PaternalName.Score"));

		List<KeyPointsItem14> keyPoints13 = new ArrayList<KeyPointsItem14>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeRussiaIdentityCardResponse.Data.PaternalName.KeyPoints.Length"); i++) {
			KeyPointsItem14 keyPointsItem14 = new KeyPointsItem14();
			keyPointsItem14.setX(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.PaternalName.KeyPoints["+ i +"].X"));
			keyPointsItem14.setY(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.PaternalName.KeyPoints["+ i +"].Y"));

			keyPoints13.add(keyPointsItem14);
		}
		paternalName.setKeyPoints13(keyPoints13);
		data.setPaternalName(paternalName);

		PortraitBox portraitBox = new PortraitBox();
		portraitBox.setText(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.PortraitBox.Text"));
		portraitBox.setScore(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.PortraitBox.Score"));

		List<KeyPointsItem16> keyPoints15 = new ArrayList<KeyPointsItem16>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeRussiaIdentityCardResponse.Data.PortraitBox.KeyPoints.Length"); i++) {
			KeyPointsItem16 keyPointsItem16 = new KeyPointsItem16();
			keyPointsItem16.setX(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.PortraitBox.KeyPoints["+ i +"].X"));
			keyPointsItem16.setY(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.PortraitBox.KeyPoints["+ i +"].Y"));

			keyPoints15.add(keyPointsItem16);
		}
		portraitBox.setKeyPoints15(keyPoints15);
		data.setPortraitBox(portraitBox);

		Sex sex = new Sex();
		sex.setText(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.Sex.Text"));
		sex.setScore(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.Sex.Score"));

		List<KeyPointsItem18> keyPoints17 = new ArrayList<KeyPointsItem18>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeRussiaIdentityCardResponse.Data.Sex.KeyPoints.Length"); i++) {
			KeyPointsItem18 keyPointsItem18 = new KeyPointsItem18();
			keyPointsItem18.setX(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.Sex.KeyPoints["+ i +"].X"));
			keyPointsItem18.setY(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.Sex.KeyPoints["+ i +"].Y"));

			keyPoints17.add(keyPointsItem18);
		}
		sex.setKeyPoints17(keyPoints17);
		data.setSex(sex);

		SurnameFirstLine surnameFirstLine = new SurnameFirstLine();
		surnameFirstLine.setText(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.SurnameFirstLine.Text"));
		surnameFirstLine.setScore(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.SurnameFirstLine.Score"));

		List<KeyPointsItem20> keyPoints19 = new ArrayList<KeyPointsItem20>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeRussiaIdentityCardResponse.Data.SurnameFirstLine.KeyPoints.Length"); i++) {
			KeyPointsItem20 keyPointsItem20 = new KeyPointsItem20();
			keyPointsItem20.setX(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.SurnameFirstLine.KeyPoints["+ i +"].X"));
			keyPointsItem20.setY(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.SurnameFirstLine.KeyPoints["+ i +"].Y"));

			keyPoints19.add(keyPointsItem20);
		}
		surnameFirstLine.setKeyPoints19(keyPoints19);
		data.setSurnameFirstLine(surnameFirstLine);

		SurnameSecondLine surnameSecondLine = new SurnameSecondLine();
		surnameSecondLine.setText(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.SurnameSecondLine.Text"));
		surnameSecondLine.setScore(_ctx.stringValue("RecognizeRussiaIdentityCardResponse.Data.SurnameSecondLine.Score"));

		List<KeyPointsItem22> keyPoints21 = new ArrayList<KeyPointsItem22>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeRussiaIdentityCardResponse.Data.SurnameSecondLine.KeyPoints.Length"); i++) {
			KeyPointsItem22 keyPointsItem22 = new KeyPointsItem22();
			keyPointsItem22.setX(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.SurnameSecondLine.KeyPoints["+ i +"].X"));
			keyPointsItem22.setY(_ctx.floatValue("RecognizeRussiaIdentityCardResponse.Data.SurnameSecondLine.KeyPoints["+ i +"].Y"));

			keyPoints21.add(keyPointsItem22);
		}
		surnameSecondLine.setKeyPoints21(keyPoints21);
		data.setSurnameSecondLine(surnameSecondLine);
		recognizeRussiaIdentityCardResponse.setData(data);
	 
	 	return recognizeRussiaIdentityCardResponse;
	}
}