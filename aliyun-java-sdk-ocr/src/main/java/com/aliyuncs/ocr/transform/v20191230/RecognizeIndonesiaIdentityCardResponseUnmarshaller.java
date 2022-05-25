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

import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.AddressFifthLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.AddressFifthLine.KeyPointsItem8;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.AddressFirstLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.AddressFirstLine.KeyPointsItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.AddressFourthLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.AddressFourthLine.KeyPointsItem6;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.AddressSecondLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.AddressSecondLine.KeyPointsItem2;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.AddressThirdLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.AddressThirdLine.KeyPointsItem4;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.BirthDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.BirthDate.KeyPointsItem10;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.BirthPlace;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.BirthPlace.KeyPointsItem12;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.CardBox;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.CardBox.KeyPointsItem14;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.ExpiryDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.ExpiryDate.KeyPointsItem16;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Gender;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Gender.KeyPointsItem18;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Height;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Height.KeyPointsItem20;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.IdNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.IdNumber.KeyPointsItem22;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.LicenseNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.LicenseNumber.KeyPointsItem24;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.MaritalStatus;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.MaritalStatus.KeyPointsItem26;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.NameFirstLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.NameFirstLine.KeyPointsItem28;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.NameSecondLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.NameSecondLine.KeyPointsItem30;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Nationality;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Nationality.KeyPointsItem32;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Occupation;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Occupation.KeyPointsItem34;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.PortraitBox;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.PortraitBox.KeyPointsItem36;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Province;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Province.KeyPointsItem38;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Religion;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Religion.KeyPointsItem40;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Sex;
import com.aliyuncs.ocr.model.v20191230.RecognizeIndonesiaIdentityCardResponse.Data.Sex.KeyPointsItem42;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeIndonesiaIdentityCardResponseUnmarshaller {

	public static RecognizeIndonesiaIdentityCardResponse unmarshall(RecognizeIndonesiaIdentityCardResponse recognizeIndonesiaIdentityCardResponse, UnmarshallerContext _ctx) {
		
		recognizeIndonesiaIdentityCardResponse.setRequestId(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.RequestId"));
		recognizeIndonesiaIdentityCardResponse.setCode(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Code"));
		recognizeIndonesiaIdentityCardResponse.setMessage(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Message"));

		Data data = new Data();

		AddressFirstLine addressFirstLine = new AddressFirstLine();
		addressFirstLine.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFirstLine.Text"));
		addressFirstLine.setScore(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFirstLine.Score"));

		List<KeyPointsItem> keyPoints = new ArrayList<KeyPointsItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFirstLine.KeyPoints.Length"); i++) {
			KeyPointsItem keyPointsItem = new KeyPointsItem();
			keyPointsItem.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFirstLine.KeyPoints["+ i +"].X"));
			keyPointsItem.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFirstLine.KeyPoints["+ i +"].Y"));

			keyPoints.add(keyPointsItem);
		}
		addressFirstLine.setKeyPoints(keyPoints);
		data.setAddressFirstLine(addressFirstLine);

		AddressSecondLine addressSecondLine = new AddressSecondLine();
		addressSecondLine.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressSecondLine.Text"));
		addressSecondLine.setScore(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressSecondLine.Score"));

		List<KeyPointsItem2> keyPoints1 = new ArrayList<KeyPointsItem2>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressSecondLine.KeyPoints.Length"); i++) {
			KeyPointsItem2 keyPointsItem2 = new KeyPointsItem2();
			keyPointsItem2.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressSecondLine.KeyPoints["+ i +"].X"));
			keyPointsItem2.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressSecondLine.KeyPoints["+ i +"].Y"));

			keyPoints1.add(keyPointsItem2);
		}
		addressSecondLine.setKeyPoints1(keyPoints1);
		data.setAddressSecondLine(addressSecondLine);

		AddressThirdLine addressThirdLine = new AddressThirdLine();
		addressThirdLine.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressThirdLine.Text"));
		addressThirdLine.setScore(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressThirdLine.Score"));

		List<KeyPointsItem4> keyPoints3 = new ArrayList<KeyPointsItem4>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressThirdLine.KeyPoints.Length"); i++) {
			KeyPointsItem4 keyPointsItem4 = new KeyPointsItem4();
			keyPointsItem4.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressThirdLine.KeyPoints["+ i +"].X"));
			keyPointsItem4.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressThirdLine.KeyPoints["+ i +"].Y"));

			keyPoints3.add(keyPointsItem4);
		}
		addressThirdLine.setKeyPoints3(keyPoints3);
		data.setAddressThirdLine(addressThirdLine);

		AddressFourthLine addressFourthLine = new AddressFourthLine();
		addressFourthLine.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFourthLine.Text"));
		addressFourthLine.setScore(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFourthLine.Score"));

		List<KeyPointsItem6> keyPoints5 = new ArrayList<KeyPointsItem6>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFourthLine.KeyPoints.Length"); i++) {
			KeyPointsItem6 keyPointsItem6 = new KeyPointsItem6();
			keyPointsItem6.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFourthLine.KeyPoints["+ i +"].X"));
			keyPointsItem6.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFourthLine.KeyPoints["+ i +"].Y"));

			keyPoints5.add(keyPointsItem6);
		}
		addressFourthLine.setKeyPoints5(keyPoints5);
		data.setAddressFourthLine(addressFourthLine);

		AddressFifthLine addressFifthLine = new AddressFifthLine();
		addressFifthLine.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFifthLine.Text"));
		addressFifthLine.setScore(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFifthLine.Score"));

		List<KeyPointsItem8> keyPoints7 = new ArrayList<KeyPointsItem8>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFifthLine.KeyPoints.Length"); i++) {
			KeyPointsItem8 keyPointsItem8 = new KeyPointsItem8();
			keyPointsItem8.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFifthLine.KeyPoints["+ i +"].X"));
			keyPointsItem8.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.AddressFifthLine.KeyPoints["+ i +"].Y"));

			keyPoints7.add(keyPointsItem8);
		}
		addressFifthLine.setKeyPoints7(keyPoints7);
		data.setAddressFifthLine(addressFifthLine);

		BirthDate birthDate = new BirthDate();
		birthDate.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.BirthDate.Text"));
		birthDate.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.BirthDate.Score"));

		List<KeyPointsItem10> keyPoints9 = new ArrayList<KeyPointsItem10>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.BirthDate.KeyPoints.Length"); i++) {
			KeyPointsItem10 keyPointsItem10 = new KeyPointsItem10();
			keyPointsItem10.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.BirthDate.KeyPoints["+ i +"].X"));
			keyPointsItem10.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.BirthDate.KeyPoints["+ i +"].Y"));

			keyPoints9.add(keyPointsItem10);
		}
		birthDate.setKeyPoints9(keyPoints9);
		data.setBirthDate(birthDate);

		BirthPlace birthPlace = new BirthPlace();
		birthPlace.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.BirthPlace.Text"));
		birthPlace.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.BirthPlace.Score"));

		List<KeyPointsItem12> keyPoints11 = new ArrayList<KeyPointsItem12>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.BirthPlace.KeyPoints.Length"); i++) {
			KeyPointsItem12 keyPointsItem12 = new KeyPointsItem12();
			keyPointsItem12.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.BirthPlace.KeyPoints["+ i +"].X"));
			keyPointsItem12.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.BirthPlace.KeyPoints["+ i +"].Y"));

			keyPoints11.add(keyPointsItem12);
		}
		birthPlace.setKeyPoints11(keyPoints11);
		data.setBirthPlace(birthPlace);

		CardBox cardBox = new CardBox();
		cardBox.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.CardBox.Text"));
		cardBox.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.CardBox.Score"));

		List<KeyPointsItem14> keyPoints13 = new ArrayList<KeyPointsItem14>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.CardBox.KeyPoints.Length"); i++) {
			KeyPointsItem14 keyPointsItem14 = new KeyPointsItem14();
			keyPointsItem14.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.CardBox.KeyPoints["+ i +"].X"));
			keyPointsItem14.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.CardBox.KeyPoints["+ i +"].Y"));

			keyPoints13.add(keyPointsItem14);
		}
		cardBox.setKeyPoints13(keyPoints13);
		data.setCardBox(cardBox);

		ExpiryDate expiryDate = new ExpiryDate();
		expiryDate.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.ExpiryDate.Text"));
		expiryDate.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.ExpiryDate.Score"));

		List<KeyPointsItem16> keyPoints15 = new ArrayList<KeyPointsItem16>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.ExpiryDate.KeyPoints.Length"); i++) {
			KeyPointsItem16 keyPointsItem16 = new KeyPointsItem16();
			keyPointsItem16.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.ExpiryDate.KeyPoints["+ i +"].X"));
			keyPointsItem16.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.ExpiryDate.KeyPoints["+ i +"].Y"));

			keyPoints15.add(keyPointsItem16);
		}
		expiryDate.setKeyPoints15(keyPoints15);
		data.setExpiryDate(expiryDate);

		Gender gender = new Gender();
		gender.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Gender.Text"));
		gender.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Gender.Score"));

		List<KeyPointsItem18> keyPoints17 = new ArrayList<KeyPointsItem18>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.Gender.KeyPoints.Length"); i++) {
			KeyPointsItem18 keyPointsItem18 = new KeyPointsItem18();
			keyPointsItem18.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Gender.KeyPoints["+ i +"].X"));
			keyPointsItem18.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Gender.KeyPoints["+ i +"].Y"));

			keyPoints17.add(keyPointsItem18);
		}
		gender.setKeyPoints17(keyPoints17);
		data.setGender(gender);

		Height height = new Height();
		height.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Height.Text"));
		height.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Height.Score"));

		List<KeyPointsItem20> keyPoints19 = new ArrayList<KeyPointsItem20>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.Height.KeyPoints.Length"); i++) {
			KeyPointsItem20 keyPointsItem20 = new KeyPointsItem20();
			keyPointsItem20.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Height.KeyPoints["+ i +"].X"));
			keyPointsItem20.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Height.KeyPoints["+ i +"].Y"));

			keyPoints19.add(keyPointsItem20);
		}
		height.setKeyPoints19(keyPoints19);
		data.setHeight(height);

		IdNumber idNumber = new IdNumber();
		idNumber.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.IdNumber.Text"));
		idNumber.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.IdNumber.Score"));

		List<KeyPointsItem22> keyPoints21 = new ArrayList<KeyPointsItem22>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.IdNumber.KeyPoints.Length"); i++) {
			KeyPointsItem22 keyPointsItem22 = new KeyPointsItem22();
			keyPointsItem22.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.IdNumber.KeyPoints["+ i +"].X"));
			keyPointsItem22.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.IdNumber.KeyPoints["+ i +"].Y"));

			keyPoints21.add(keyPointsItem22);
		}
		idNumber.setKeyPoints21(keyPoints21);
		data.setIdNumber(idNumber);

		LicenseNumber licenseNumber = new LicenseNumber();
		licenseNumber.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.LicenseNumber.Text"));
		licenseNumber.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.LicenseNumber.Score"));

		List<KeyPointsItem24> keyPoints23 = new ArrayList<KeyPointsItem24>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.LicenseNumber.KeyPoints.Length"); i++) {
			KeyPointsItem24 keyPointsItem24 = new KeyPointsItem24();
			keyPointsItem24.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.LicenseNumber.KeyPoints["+ i +"].X"));
			keyPointsItem24.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.LicenseNumber.KeyPoints["+ i +"].Y"));

			keyPoints23.add(keyPointsItem24);
		}
		licenseNumber.setKeyPoints23(keyPoints23);
		data.setLicenseNumber(licenseNumber);

		MaritalStatus maritalStatus = new MaritalStatus();
		maritalStatus.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.MaritalStatus.Text"));
		maritalStatus.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.MaritalStatus.Score"));

		List<KeyPointsItem26> keyPoints25 = new ArrayList<KeyPointsItem26>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.MaritalStatus.KeyPoints.Length"); i++) {
			KeyPointsItem26 keyPointsItem26 = new KeyPointsItem26();
			keyPointsItem26.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.MaritalStatus.KeyPoints["+ i +"].X"));
			keyPointsItem26.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.MaritalStatus.KeyPoints["+ i +"].Y"));

			keyPoints25.add(keyPointsItem26);
		}
		maritalStatus.setKeyPoints25(keyPoints25);
		data.setMaritalStatus(maritalStatus);

		NameFirstLine nameFirstLine = new NameFirstLine();
		nameFirstLine.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.NameFirstLine.Text"));
		nameFirstLine.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.NameFirstLine.Score"));

		List<KeyPointsItem28> keyPoints27 = new ArrayList<KeyPointsItem28>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.NameFirstLine.KeyPoints.Length"); i++) {
			KeyPointsItem28 keyPointsItem28 = new KeyPointsItem28();
			keyPointsItem28.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.NameFirstLine.KeyPoints["+ i +"].X"));
			keyPointsItem28.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.NameFirstLine.KeyPoints["+ i +"].Y"));

			keyPoints27.add(keyPointsItem28);
		}
		nameFirstLine.setKeyPoints27(keyPoints27);
		data.setNameFirstLine(nameFirstLine);

		NameSecondLine nameSecondLine = new NameSecondLine();
		nameSecondLine.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.NameSecondLine.Text"));
		nameSecondLine.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.NameSecondLine.Score"));

		List<KeyPointsItem30> keyPoints29 = new ArrayList<KeyPointsItem30>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.NameSecondLine.KeyPoints.Length"); i++) {
			KeyPointsItem30 keyPointsItem30 = new KeyPointsItem30();
			keyPointsItem30.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.NameSecondLine.KeyPoints["+ i +"].X"));
			keyPointsItem30.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.NameSecondLine.KeyPoints["+ i +"].Y"));

			keyPoints29.add(keyPointsItem30);
		}
		nameSecondLine.setKeyPoints29(keyPoints29);
		data.setNameSecondLine(nameSecondLine);

		Nationality nationality = new Nationality();
		nationality.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Nationality.Text"));
		nationality.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Nationality.Score"));

		List<KeyPointsItem32> keyPoints31 = new ArrayList<KeyPointsItem32>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.Nationality.KeyPoints.Length"); i++) {
			KeyPointsItem32 keyPointsItem32 = new KeyPointsItem32();
			keyPointsItem32.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Nationality.KeyPoints["+ i +"].X"));
			keyPointsItem32.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Nationality.KeyPoints["+ i +"].Y"));

			keyPoints31.add(keyPointsItem32);
		}
		nationality.setKeyPoints31(keyPoints31);
		data.setNationality(nationality);

		Occupation occupation = new Occupation();
		occupation.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Occupation.Text"));
		occupation.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Occupation.Score"));

		List<KeyPointsItem34> keyPoints33 = new ArrayList<KeyPointsItem34>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.Occupation.KeyPoints.Length"); i++) {
			KeyPointsItem34 keyPointsItem34 = new KeyPointsItem34();
			keyPointsItem34.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Occupation.KeyPoints["+ i +"].X"));
			keyPointsItem34.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Occupation.KeyPoints["+ i +"].Y"));

			keyPoints33.add(keyPointsItem34);
		}
		occupation.setKeyPoints33(keyPoints33);
		data.setOccupation(occupation);

		PortraitBox portraitBox = new PortraitBox();
		portraitBox.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.PortraitBox.Text"));
		portraitBox.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.PortraitBox.Score"));

		List<KeyPointsItem36> keyPoints35 = new ArrayList<KeyPointsItem36>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.PortraitBox.KeyPoints.Length"); i++) {
			KeyPointsItem36 keyPointsItem36 = new KeyPointsItem36();
			keyPointsItem36.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.PortraitBox.KeyPoints["+ i +"].X"));
			keyPointsItem36.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.PortraitBox.KeyPoints["+ i +"].Y"));

			keyPoints35.add(keyPointsItem36);
		}
		portraitBox.setKeyPoints35(keyPoints35);
		data.setPortraitBox(portraitBox);

		Province province = new Province();
		province.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Province.Text"));
		province.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Province.Score"));

		List<KeyPointsItem38> keyPoints37 = new ArrayList<KeyPointsItem38>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.Province.KeyPoints.Length"); i++) {
			KeyPointsItem38 keyPointsItem38 = new KeyPointsItem38();
			keyPointsItem38.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Province.KeyPoints["+ i +"].X"));
			keyPointsItem38.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Province.KeyPoints["+ i +"].Y"));

			keyPoints37.add(keyPointsItem38);
		}
		province.setKeyPoints37(keyPoints37);
		data.setProvince(province);

		Religion religion = new Religion();
		religion.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Religion.Text"));
		religion.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Religion.Score"));

		List<KeyPointsItem40> keyPoints39 = new ArrayList<KeyPointsItem40>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.Religion.KeyPoints.Length"); i++) {
			KeyPointsItem40 keyPointsItem40 = new KeyPointsItem40();
			keyPointsItem40.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Religion.KeyPoints["+ i +"].X"));
			keyPointsItem40.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Religion.KeyPoints["+ i +"].Y"));

			keyPoints39.add(keyPointsItem40);
		}
		religion.setKeyPoints39(keyPoints39);
		data.setReligion(religion);

		Sex sex = new Sex();
		sex.setText(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Sex.Text"));
		sex.setScore(_ctx.stringValue("RecognizeIndonesiaIdentityCardResponse.Data.Sex.Score"));

		List<KeyPointsItem42> keyPoints41 = new ArrayList<KeyPointsItem42>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeIndonesiaIdentityCardResponse.Data.Sex.KeyPoints.Length"); i++) {
			KeyPointsItem42 keyPointsItem42 = new KeyPointsItem42();
			keyPointsItem42.setX(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Sex.KeyPoints["+ i +"].X"));
			keyPointsItem42.setY(_ctx.floatValue("RecognizeIndonesiaIdentityCardResponse.Data.Sex.KeyPoints["+ i +"].Y"));

			keyPoints41.add(keyPointsItem42);
		}
		sex.setKeyPoints41(keyPoints41);
		data.setSex(sex);
		recognizeIndonesiaIdentityCardResponse.setData(data);
	 
	 	return recognizeIndonesiaIdentityCardResponse;
	}
}