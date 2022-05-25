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

import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.AddressFirstLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.AddressFirstLine.KeyPointsItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.AddressSecondLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.AddressSecondLine.KeyPointsItem2;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.BirthDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.BirthDate.KeyPointsItem4;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.CardBox;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.CardBox.KeyPointsItem6;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.DriveClass;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.DriveClass.KeyPointsItem8;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.ExpiryDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.ExpiryDate.KeyPointsItem10;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.FullName;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.FullName.KeyPointsItem12;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.IdNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.IdNumber.KeyPointsItem14;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.Nationality;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.Nationality.KeyPointsItem16;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.OriginPlaceFirstLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.OriginPlaceFirstLine.KeyPointsItem18;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.OriginPlaceSecondLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.OriginPlaceSecondLine.KeyPointsItem20;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.PortraitBox;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.PortraitBox.KeyPointsItem22;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceFirstLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceFirstLine.KeyPointsItem24;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceSecondLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceSecondLine.KeyPointsItem26;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.Sex;
import com.aliyuncs.ocr.model.v20191230.RecognizeVietnamIdentityCardResponse.Data.Sex.KeyPointsItem28;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeVietnamIdentityCardResponseUnmarshaller {

	public static RecognizeVietnamIdentityCardResponse unmarshall(RecognizeVietnamIdentityCardResponse recognizeVietnamIdentityCardResponse, UnmarshallerContext _ctx) {
		
		recognizeVietnamIdentityCardResponse.setRequestId(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.RequestId"));
		recognizeVietnamIdentityCardResponse.setCode(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Code"));
		recognizeVietnamIdentityCardResponse.setMessage(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Message"));

		Data data = new Data();

		AddressFirstLine addressFirstLine = new AddressFirstLine();
		addressFirstLine.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.AddressFirstLine.Text"));
		addressFirstLine.setScore(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.AddressFirstLine.Score"));

		List<KeyPointsItem> keyPoints = new ArrayList<KeyPointsItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.AddressFirstLine.KeyPoints.Length"); i++) {
			KeyPointsItem keyPointsItem = new KeyPointsItem();
			keyPointsItem.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.AddressFirstLine.KeyPoints["+ i +"].X"));
			keyPointsItem.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.AddressFirstLine.KeyPoints["+ i +"].Y"));

			keyPoints.add(keyPointsItem);
		}
		addressFirstLine.setKeyPoints(keyPoints);
		data.setAddressFirstLine(addressFirstLine);

		AddressSecondLine addressSecondLine = new AddressSecondLine();
		addressSecondLine.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.AddressSecondLine.Text"));
		addressSecondLine.setScore(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.AddressSecondLine.Score"));

		List<KeyPointsItem2> keyPoints1 = new ArrayList<KeyPointsItem2>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.AddressSecondLine.KeyPoints.Length"); i++) {
			KeyPointsItem2 keyPointsItem2 = new KeyPointsItem2();
			keyPointsItem2.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.AddressSecondLine.KeyPoints["+ i +"].X"));
			keyPointsItem2.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.AddressSecondLine.KeyPoints["+ i +"].Y"));

			keyPoints1.add(keyPointsItem2);
		}
		addressSecondLine.setKeyPoints1(keyPoints1);
		data.setAddressSecondLine(addressSecondLine);

		BirthDate birthDate = new BirthDate();
		birthDate.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.BirthDate.Text"));
		birthDate.setScore(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.BirthDate.Score"));

		List<KeyPointsItem4> keyPoints3 = new ArrayList<KeyPointsItem4>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.BirthDate.KeyPoints.Length"); i++) {
			KeyPointsItem4 keyPointsItem4 = new KeyPointsItem4();
			keyPointsItem4.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.BirthDate.KeyPoints["+ i +"].X"));
			keyPointsItem4.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.BirthDate.KeyPoints["+ i +"].Y"));

			keyPoints3.add(keyPointsItem4);
		}
		birthDate.setKeyPoints3(keyPoints3);
		data.setBirthDate(birthDate);

		CardBox cardBox = new CardBox();
		cardBox.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.CardBox.Text"));
		cardBox.setScore(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.CardBox.Score"));

		List<KeyPointsItem6> keyPoints5 = new ArrayList<KeyPointsItem6>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.CardBox.KeyPoints.Length"); i++) {
			KeyPointsItem6 keyPointsItem6 = new KeyPointsItem6();
			keyPointsItem6.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.CardBox.KeyPoints["+ i +"].X"));
			keyPointsItem6.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.CardBox.KeyPoints["+ i +"].Y"));

			keyPoints5.add(keyPointsItem6);
		}
		cardBox.setKeyPoints5(keyPoints5);
		data.setCardBox(cardBox);

		DriveClass driveClass = new DriveClass();
		driveClass.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.DriveClass.Text"));
		driveClass.setScore(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.DriveClass.Score"));

		List<KeyPointsItem8> keyPoints7 = new ArrayList<KeyPointsItem8>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.DriveClass.KeyPoints.Length"); i++) {
			KeyPointsItem8 keyPointsItem8 = new KeyPointsItem8();
			keyPointsItem8.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.DriveClass.KeyPoints["+ i +"].X"));
			keyPointsItem8.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.DriveClass.KeyPoints["+ i +"].Y"));

			keyPoints7.add(keyPointsItem8);
		}
		driveClass.setKeyPoints7(keyPoints7);
		data.setDriveClass(driveClass);

		ExpiryDate expiryDate = new ExpiryDate();
		expiryDate.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.ExpiryDate.Text"));
		expiryDate.setScore(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.ExpiryDate.Score"));

		List<KeyPointsItem10> keyPoints9 = new ArrayList<KeyPointsItem10>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.ExpiryDate.KeyPoints.Length"); i++) {
			KeyPointsItem10 keyPointsItem10 = new KeyPointsItem10();
			keyPointsItem10.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.ExpiryDate.KeyPoints["+ i +"].X"));
			keyPointsItem10.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.ExpiryDate.KeyPoints["+ i +"].Y"));

			keyPoints9.add(keyPointsItem10);
		}
		expiryDate.setKeyPoints9(keyPoints9);
		data.setExpiryDate(expiryDate);

		FullName fullName = new FullName();
		fullName.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.FullName.Text"));
		fullName.setScore(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.FullName.Score"));

		List<KeyPointsItem12> keyPoints11 = new ArrayList<KeyPointsItem12>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.FullName.KeyPoints.Length"); i++) {
			KeyPointsItem12 keyPointsItem12 = new KeyPointsItem12();
			keyPointsItem12.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.FullName.KeyPoints["+ i +"].X"));
			keyPointsItem12.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.FullName.KeyPoints["+ i +"].Y"));

			keyPoints11.add(keyPointsItem12);
		}
		fullName.setKeyPoints11(keyPoints11);
		data.setFullName(fullName);

		IdNumber idNumber = new IdNumber();
		idNumber.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.IdNumber.Text"));
		idNumber.setScore(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.IdNumber.Score"));

		List<KeyPointsItem14> keyPoints13 = new ArrayList<KeyPointsItem14>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.IdNumber.KeyPoints.Length"); i++) {
			KeyPointsItem14 keyPointsItem14 = new KeyPointsItem14();
			keyPointsItem14.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.IdNumber.KeyPoints["+ i +"].X"));
			keyPointsItem14.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.IdNumber.KeyPoints["+ i +"].Y"));

			keyPoints13.add(keyPointsItem14);
		}
		idNumber.setKeyPoints13(keyPoints13);
		data.setIdNumber(idNumber);

		Nationality nationality = new Nationality();
		nationality.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.Nationality.Text"));
		nationality.setScore(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.Nationality.Score"));

		List<KeyPointsItem16> keyPoints15 = new ArrayList<KeyPointsItem16>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.Nationality.KeyPoints.Length"); i++) {
			KeyPointsItem16 keyPointsItem16 = new KeyPointsItem16();
			keyPointsItem16.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.Nationality.KeyPoints["+ i +"].X"));
			keyPointsItem16.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.Nationality.KeyPoints["+ i +"].Y"));

			keyPoints15.add(keyPointsItem16);
		}
		nationality.setKeyPoints15(keyPoints15);
		data.setNationality(nationality);

		OriginPlaceFirstLine originPlaceFirstLine = new OriginPlaceFirstLine();
		originPlaceFirstLine.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.OriginPlaceFirstLine.Text"));
		originPlaceFirstLine.setScore(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.OriginPlaceFirstLine.Score"));

		List<KeyPointsItem18> keyPoints17 = new ArrayList<KeyPointsItem18>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.OriginPlaceFirstLine.KeyPoints.Length"); i++) {
			KeyPointsItem18 keyPointsItem18 = new KeyPointsItem18();
			keyPointsItem18.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.OriginPlaceFirstLine.KeyPoints["+ i +"].X"));
			keyPointsItem18.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.OriginPlaceFirstLine.KeyPoints["+ i +"].Y"));

			keyPoints17.add(keyPointsItem18);
		}
		originPlaceFirstLine.setKeyPoints17(keyPoints17);
		data.setOriginPlaceFirstLine(originPlaceFirstLine);

		OriginPlaceSecondLine originPlaceSecondLine = new OriginPlaceSecondLine();
		originPlaceSecondLine.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.OriginPlaceSecondLine.Text"));
		originPlaceSecondLine.setScore(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.OriginPlaceSecondLine.Score"));

		List<KeyPointsItem20> keyPoints19 = new ArrayList<KeyPointsItem20>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.OriginPlaceSecondLine.KeyPoints.Length"); i++) {
			KeyPointsItem20 keyPointsItem20 = new KeyPointsItem20();
			keyPointsItem20.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.OriginPlaceSecondLine.KeyPoints["+ i +"].X"));
			keyPointsItem20.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.OriginPlaceSecondLine.KeyPoints["+ i +"].Y"));

			keyPoints19.add(keyPointsItem20);
		}
		originPlaceSecondLine.setKeyPoints19(keyPoints19);
		data.setOriginPlaceSecondLine(originPlaceSecondLine);

		PortraitBox portraitBox = new PortraitBox();
		portraitBox.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.PortraitBox.Text"));
		portraitBox.setScore(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.PortraitBox.Score"));

		List<KeyPointsItem22> keyPoints21 = new ArrayList<KeyPointsItem22>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.PortraitBox.KeyPoints.Length"); i++) {
			KeyPointsItem22 keyPointsItem22 = new KeyPointsItem22();
			keyPointsItem22.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.PortraitBox.KeyPoints["+ i +"].X"));
			keyPointsItem22.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.PortraitBox.KeyPoints["+ i +"].Y"));

			keyPoints21.add(keyPointsItem22);
		}
		portraitBox.setKeyPoints21(keyPoints21);
		data.setPortraitBox(portraitBox);

		ResidencePlaceFirstLine residencePlaceFirstLine = new ResidencePlaceFirstLine();
		residencePlaceFirstLine.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceFirstLine.Text"));
		residencePlaceFirstLine.setScore(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceFirstLine.Score"));

		List<KeyPointsItem24> keyPoints23 = new ArrayList<KeyPointsItem24>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceFirstLine.KeyPoints.Length"); i++) {
			KeyPointsItem24 keyPointsItem24 = new KeyPointsItem24();
			keyPointsItem24.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceFirstLine.KeyPoints["+ i +"].X"));
			keyPointsItem24.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceFirstLine.KeyPoints["+ i +"].Y"));

			keyPoints23.add(keyPointsItem24);
		}
		residencePlaceFirstLine.setKeyPoints23(keyPoints23);
		data.setResidencePlaceFirstLine(residencePlaceFirstLine);

		ResidencePlaceSecondLine residencePlaceSecondLine = new ResidencePlaceSecondLine();
		residencePlaceSecondLine.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceSecondLine.Text"));
		residencePlaceSecondLine.setScore(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceSecondLine.Score"));

		List<KeyPointsItem26> keyPoints25 = new ArrayList<KeyPointsItem26>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceSecondLine.KeyPoints.Length"); i++) {
			KeyPointsItem26 keyPointsItem26 = new KeyPointsItem26();
			keyPointsItem26.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceSecondLine.KeyPoints["+ i +"].X"));
			keyPointsItem26.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.ResidencePlaceSecondLine.KeyPoints["+ i +"].Y"));

			keyPoints25.add(keyPointsItem26);
		}
		residencePlaceSecondLine.setKeyPoints25(keyPoints25);
		data.setResidencePlaceSecondLine(residencePlaceSecondLine);

		Sex sex = new Sex();
		sex.setText(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.Sex.Text"));
		sex.setScore(_ctx.stringValue("RecognizeVietnamIdentityCardResponse.Data.Sex.Score"));

		List<KeyPointsItem28> keyPoints27 = new ArrayList<KeyPointsItem28>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVietnamIdentityCardResponse.Data.Sex.KeyPoints.Length"); i++) {
			KeyPointsItem28 keyPointsItem28 = new KeyPointsItem28();
			keyPointsItem28.setX(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.Sex.KeyPoints["+ i +"].X"));
			keyPointsItem28.setY(_ctx.floatValue("RecognizeVietnamIdentityCardResponse.Data.Sex.KeyPoints["+ i +"].Y"));

			keyPoints27.add(keyPointsItem28);
		}
		sex.setKeyPoints27(keyPoints27);
		data.setSex(sex);
		recognizeVietnamIdentityCardResponse.setData(data);
	 
	 	return recognizeVietnamIdentityCardResponse;
	}
}