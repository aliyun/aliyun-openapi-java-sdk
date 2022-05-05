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

import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.BirthDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.BirthDate.KeyPointsItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.CardBox;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.CardBox.KeyPointsItem2;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.DocumentNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.DocumentNumber.KeyPointsItem4;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.ExpiryDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.ExpiryDate.KeyPointsItem6;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.NameEnglish;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.NameEnglish.KeyPointsItem8;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.NameUkraine;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.NameUkraine.KeyPointsItem10;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.Nationality;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.Nationality.KeyPointsItem12;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.Patronymic;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.Patronymic.KeyPointsItem14;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.PortraitBox;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.PortraitBox.KeyPointsItem16;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.RecordNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.RecordNumber.KeyPointsItem18;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.Sex;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.Sex.KeyPointsItem20;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.SurnameEnglish;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.SurnameEnglish.KeyPointsItem22;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.SurnameUkraine;
import com.aliyuncs.ocr.model.v20191230.RecognizeUkraineIdentityCardResponse.Data.SurnameUkraine.KeyPointsItem24;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeUkraineIdentityCardResponseUnmarshaller {

	public static RecognizeUkraineIdentityCardResponse unmarshall(RecognizeUkraineIdentityCardResponse recognizeUkraineIdentityCardResponse, UnmarshallerContext _ctx) {
		
		recognizeUkraineIdentityCardResponse.setRequestId(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.RequestId"));
		recognizeUkraineIdentityCardResponse.setCode(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Code"));
		recognizeUkraineIdentityCardResponse.setMessage(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Message"));

		Data data = new Data();

		BirthDate birthDate = new BirthDate();
		birthDate.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.BirthDate.Text"));
		birthDate.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.BirthDate.Score"));

		List<KeyPointsItem> keyPoints = new ArrayList<KeyPointsItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.BirthDate.KeyPoints.Length"); i++) {
			KeyPointsItem keyPointsItem = new KeyPointsItem();
			keyPointsItem.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.BirthDate.KeyPoints["+ i +"].X"));
			keyPointsItem.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.BirthDate.KeyPoints["+ i +"].Y"));

			keyPoints.add(keyPointsItem);
		}
		birthDate.setKeyPoints(keyPoints);
		data.setBirthDate(birthDate);

		CardBox cardBox = new CardBox();
		cardBox.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.CardBox.Text"));
		cardBox.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.CardBox.Score"));

		List<KeyPointsItem2> keyPoints1 = new ArrayList<KeyPointsItem2>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.CardBox.KeyPoints.Length"); i++) {
			KeyPointsItem2 keyPointsItem2 = new KeyPointsItem2();
			keyPointsItem2.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.CardBox.KeyPoints["+ i +"].X"));
			keyPointsItem2.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.CardBox.KeyPoints["+ i +"].Y"));

			keyPoints1.add(keyPointsItem2);
		}
		cardBox.setKeyPoints1(keyPoints1);
		data.setCardBox(cardBox);

		DocumentNumber documentNumber = new DocumentNumber();
		documentNumber.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.DocumentNumber.Text"));
		documentNumber.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.DocumentNumber.Score"));

		List<KeyPointsItem4> keyPoints3 = new ArrayList<KeyPointsItem4>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.DocumentNumber.KeyPoints.Length"); i++) {
			KeyPointsItem4 keyPointsItem4 = new KeyPointsItem4();
			keyPointsItem4.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.DocumentNumber.KeyPoints["+ i +"].X"));
			keyPointsItem4.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.DocumentNumber.KeyPoints["+ i +"].Y"));

			keyPoints3.add(keyPointsItem4);
		}
		documentNumber.setKeyPoints3(keyPoints3);
		data.setDocumentNumber(documentNumber);

		ExpiryDate expiryDate = new ExpiryDate();
		expiryDate.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.ExpiryDate.Text"));
		expiryDate.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.ExpiryDate.Score"));

		List<KeyPointsItem6> keyPoints5 = new ArrayList<KeyPointsItem6>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.ExpiryDate.KeyPoints.Length"); i++) {
			KeyPointsItem6 keyPointsItem6 = new KeyPointsItem6();
			keyPointsItem6.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.ExpiryDate.KeyPoints["+ i +"].X"));
			keyPointsItem6.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.ExpiryDate.KeyPoints["+ i +"].Y"));

			keyPoints5.add(keyPointsItem6);
		}
		expiryDate.setKeyPoints5(keyPoints5);
		data.setExpiryDate(expiryDate);

		NameEnglish nameEnglish = new NameEnglish();
		nameEnglish.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.NameEnglish.Text"));
		nameEnglish.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.NameEnglish.Score"));

		List<KeyPointsItem8> keyPoints7 = new ArrayList<KeyPointsItem8>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.NameEnglish.KeyPoints.Length"); i++) {
			KeyPointsItem8 keyPointsItem8 = new KeyPointsItem8();
			keyPointsItem8.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.NameEnglish.KeyPoints["+ i +"].X"));
			keyPointsItem8.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.NameEnglish.KeyPoints["+ i +"].Y"));

			keyPoints7.add(keyPointsItem8);
		}
		nameEnglish.setKeyPoints7(keyPoints7);
		data.setNameEnglish(nameEnglish);

		NameUkraine nameUkraine = new NameUkraine();
		nameUkraine.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.NameUkraine.Text"));
		nameUkraine.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.NameUkraine.Score"));

		List<KeyPointsItem10> keyPoints9 = new ArrayList<KeyPointsItem10>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.NameUkraine.KeyPoints.Length"); i++) {
			KeyPointsItem10 keyPointsItem10 = new KeyPointsItem10();
			keyPointsItem10.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.NameUkraine.KeyPoints["+ i +"].X"));
			keyPointsItem10.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.NameUkraine.KeyPoints["+ i +"].Y"));

			keyPoints9.add(keyPointsItem10);
		}
		nameUkraine.setKeyPoints9(keyPoints9);
		data.setNameUkraine(nameUkraine);

		Nationality nationality = new Nationality();
		nationality.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.Nationality.Text"));
		nationality.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.Nationality.Score"));

		List<KeyPointsItem12> keyPoints11 = new ArrayList<KeyPointsItem12>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.Nationality.KeyPoints.Length"); i++) {
			KeyPointsItem12 keyPointsItem12 = new KeyPointsItem12();
			keyPointsItem12.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.Nationality.KeyPoints["+ i +"].X"));
			keyPointsItem12.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.Nationality.KeyPoints["+ i +"].Y"));

			keyPoints11.add(keyPointsItem12);
		}
		nationality.setKeyPoints11(keyPoints11);
		data.setNationality(nationality);

		Patronymic patronymic = new Patronymic();
		patronymic.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.Patronymic.Text"));
		patronymic.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.Patronymic.Score"));

		List<KeyPointsItem14> keyPoints13 = new ArrayList<KeyPointsItem14>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.Patronymic.KeyPoints.Length"); i++) {
			KeyPointsItem14 keyPointsItem14 = new KeyPointsItem14();
			keyPointsItem14.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.Patronymic.KeyPoints["+ i +"].X"));
			keyPointsItem14.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.Patronymic.KeyPoints["+ i +"].Y"));

			keyPoints13.add(keyPointsItem14);
		}
		patronymic.setKeyPoints13(keyPoints13);
		data.setPatronymic(patronymic);

		PortraitBox portraitBox = new PortraitBox();
		portraitBox.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.PortraitBox.Text"));
		portraitBox.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.PortraitBox.Score"));

		List<KeyPointsItem16> keyPoints15 = new ArrayList<KeyPointsItem16>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.PortraitBox.KeyPoints.Length"); i++) {
			KeyPointsItem16 keyPointsItem16 = new KeyPointsItem16();
			keyPointsItem16.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.PortraitBox.KeyPoints["+ i +"].X"));
			keyPointsItem16.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.PortraitBox.KeyPoints["+ i +"].Y"));

			keyPoints15.add(keyPointsItem16);
		}
		portraitBox.setKeyPoints15(keyPoints15);
		data.setPortraitBox(portraitBox);

		RecordNumber recordNumber = new RecordNumber();
		recordNumber.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.RecordNumber.Text"));
		recordNumber.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.RecordNumber.Score"));

		List<KeyPointsItem18> keyPoints17 = new ArrayList<KeyPointsItem18>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.RecordNumber.KeyPoints.Length"); i++) {
			KeyPointsItem18 keyPointsItem18 = new KeyPointsItem18();
			keyPointsItem18.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.RecordNumber.KeyPoints["+ i +"].X"));
			keyPointsItem18.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.RecordNumber.KeyPoints["+ i +"].Y"));

			keyPoints17.add(keyPointsItem18);
		}
		recordNumber.setKeyPoints17(keyPoints17);
		data.setRecordNumber(recordNumber);

		Sex sex = new Sex();
		sex.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.Sex.Text"));
		sex.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.Sex.Score"));

		List<KeyPointsItem20> keyPoints19 = new ArrayList<KeyPointsItem20>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.Sex.KeyPoints.Length"); i++) {
			KeyPointsItem20 keyPointsItem20 = new KeyPointsItem20();
			keyPointsItem20.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.Sex.KeyPoints["+ i +"].X"));
			keyPointsItem20.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.Sex.KeyPoints["+ i +"].Y"));

			keyPoints19.add(keyPointsItem20);
		}
		sex.setKeyPoints19(keyPoints19);
		data.setSex(sex);

		SurnameEnglish surnameEnglish = new SurnameEnglish();
		surnameEnglish.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.SurnameEnglish.Text"));
		surnameEnglish.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.SurnameEnglish.Score"));

		List<KeyPointsItem22> keyPoints21 = new ArrayList<KeyPointsItem22>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.SurnameEnglish.KeyPoints.Length"); i++) {
			KeyPointsItem22 keyPointsItem22 = new KeyPointsItem22();
			keyPointsItem22.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.SurnameEnglish.KeyPoints["+ i +"].X"));
			keyPointsItem22.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.SurnameEnglish.KeyPoints["+ i +"].Y"));

			keyPoints21.add(keyPointsItem22);
		}
		surnameEnglish.setKeyPoints21(keyPoints21);
		data.setSurnameEnglish(surnameEnglish);

		SurnameUkraine surnameUkraine = new SurnameUkraine();
		surnameUkraine.setText(_ctx.stringValue("RecognizeUkraineIdentityCardResponse.Data.SurnameUkraine.Text"));
		surnameUkraine.setScore(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.SurnameUkraine.Score"));

		List<KeyPointsItem24> keyPoints23 = new ArrayList<KeyPointsItem24>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeUkraineIdentityCardResponse.Data.SurnameUkraine.KeyPoints.Length"); i++) {
			KeyPointsItem24 keyPointsItem24 = new KeyPointsItem24();
			keyPointsItem24.setX(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.SurnameUkraine.KeyPoints["+ i +"].X"));
			keyPointsItem24.setY(_ctx.floatValue("RecognizeUkraineIdentityCardResponse.Data.SurnameUkraine.KeyPoints["+ i +"].Y"));

			keyPoints23.add(keyPointsItem24);
		}
		surnameUkraine.setKeyPoints23(keyPoints23);
		data.setSurnameUkraine(surnameUkraine);
		recognizeUkraineIdentityCardResponse.setData(data);
	 
	 	return recognizeUkraineIdentityCardResponse;
	}
}