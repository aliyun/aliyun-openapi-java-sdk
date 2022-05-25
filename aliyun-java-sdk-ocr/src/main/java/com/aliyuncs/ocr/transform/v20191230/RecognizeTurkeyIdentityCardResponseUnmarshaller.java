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

import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.AuxiliaryTools;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.AuxiliaryTools.KeyPointsItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.BirthDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.BirthDate.KeyPointsItem2;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.BirthPlace;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.BirthPlace.KeyPointsItem4;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.BloodType;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.BloodType.KeyPointsItem6;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.CardBox;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.CardBox.KeyPointsItem8;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Cilt;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Cilt.KeyPointsItem10;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.DocumentNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.DocumentNumber.KeyPointsItem12;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.DriveClass;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.DriveClass.KeyPointsItem14;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.DueDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.DueDate.KeyPointsItem16;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Duzenleyen;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Duzenleyen.KeyPointsItem18;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.EntryNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.EntryNumber.KeyPointsItem20;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.ExpiryDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.ExpiryDate.KeyPointsItem22;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.FatherName;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.FatherName.KeyPointsItem24;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.ForeignersId;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.ForeignersId.KeyPointsItem26;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Gender;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Gender.KeyPointsItem28;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.GivenName;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.GivenName.KeyPointsItem30;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.IdNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.IdNumber.KeyPointsItem32;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.IssueBy;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.IssueBy.KeyPointsItem34;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.IssueCounty;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.IssueCounty.KeyPointsItem36;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.IssueDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.IssueDate.KeyPointsItem38;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.IssuePlace;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.IssuePlace.KeyPointsItem40;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Kutuk;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Kutuk.KeyPointsItem42;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.LicenseNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.LicenseNumber.KeyPointsItem44;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.MaritalStatus;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.MaritalStatus.KeyPointsItem46;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.MotherName;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.MotherName.KeyPointsItem48;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Name;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Name.KeyPointsItem50;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Nationality;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Nationality.KeyPointsItem52;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.NeighborhoodVillage;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.NeighborhoodVillage.KeyPointsItem54;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.PageNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.PageNumber.KeyPointsItem56;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.PassportNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.PassportNumber.KeyPointsItem58;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.PortraitBox;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.PortraitBox.KeyPointsItem60;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Province;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Province.KeyPointsItem62;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.ProvinceOfResidence;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.ProvinceOfResidence.KeyPointsItem64;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.ReasonOfIssue;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.ReasonOfIssue.KeyPointsItem66;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.RegisterNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.RegisterNumber.KeyPointsItem68;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Religion;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Religion.KeyPointsItem70;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Sayfa;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Sayfa.KeyPointsItem72;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Seri;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Seri.KeyPointsItem74;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Sex;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Sex.KeyPointsItem86;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Surname;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Surname.KeyPointsItem76;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.TypeOfResidencePermit;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.TypeOfResidencePermit.KeyPointsItem78;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.ValidUntil;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.ValidUntil.KeyPointsItem80;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Village;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.Village.KeyPointsItem82;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.VolumeNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeTurkeyIdentityCardResponse.Data.VolumeNumber.KeyPointsItem84;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeTurkeyIdentityCardResponseUnmarshaller {

	public static RecognizeTurkeyIdentityCardResponse unmarshall(RecognizeTurkeyIdentityCardResponse recognizeTurkeyIdentityCardResponse, UnmarshallerContext _ctx) {
		
		recognizeTurkeyIdentityCardResponse.setRequestId(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.RequestId"));
		recognizeTurkeyIdentityCardResponse.setCode(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Code"));
		recognizeTurkeyIdentityCardResponse.setMessage(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Message"));

		Data data = new Data();

		AuxiliaryTools auxiliaryTools = new AuxiliaryTools();
		auxiliaryTools.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.AuxiliaryTools.Text"));
		auxiliaryTools.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.AuxiliaryTools.Score"));

		List<KeyPointsItem> keyPoints = new ArrayList<KeyPointsItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.AuxiliaryTools.KeyPoints.Length"); i++) {
			KeyPointsItem keyPointsItem = new KeyPointsItem();
			keyPointsItem.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.AuxiliaryTools.KeyPoints["+ i +"].X"));
			keyPointsItem.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.AuxiliaryTools.KeyPoints["+ i +"].Y"));

			keyPoints.add(keyPointsItem);
		}
		auxiliaryTools.setKeyPoints(keyPoints);
		data.setAuxiliaryTools(auxiliaryTools);

		BirthDate birthDate = new BirthDate();
		birthDate.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.BirthDate.Text"));
		birthDate.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.BirthDate.Score"));

		List<KeyPointsItem2> keyPoints1 = new ArrayList<KeyPointsItem2>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.BirthDate.KeyPoints.Length"); i++) {
			KeyPointsItem2 keyPointsItem2 = new KeyPointsItem2();
			keyPointsItem2.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.BirthDate.KeyPoints["+ i +"].X"));
			keyPointsItem2.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.BirthDate.KeyPoints["+ i +"].Y"));

			keyPoints1.add(keyPointsItem2);
		}
		birthDate.setKeyPoints1(keyPoints1);
		data.setBirthDate(birthDate);

		BirthPlace birthPlace = new BirthPlace();
		birthPlace.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.BirthPlace.Text"));
		birthPlace.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.BirthPlace.Score"));

		List<KeyPointsItem4> keyPoints3 = new ArrayList<KeyPointsItem4>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.BirthPlace.KeyPoints.Length"); i++) {
			KeyPointsItem4 keyPointsItem4 = new KeyPointsItem4();
			keyPointsItem4.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.BirthPlace.KeyPoints["+ i +"].X"));
			keyPointsItem4.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.BirthPlace.KeyPoints["+ i +"].Y"));

			keyPoints3.add(keyPointsItem4);
		}
		birthPlace.setKeyPoints3(keyPoints3);
		data.setBirthPlace(birthPlace);

		BloodType bloodType = new BloodType();
		bloodType.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.BloodType.Text"));
		bloodType.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.BloodType.Score"));

		List<KeyPointsItem6> keyPoints5 = new ArrayList<KeyPointsItem6>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.BloodType.KeyPoints.Length"); i++) {
			KeyPointsItem6 keyPointsItem6 = new KeyPointsItem6();
			keyPointsItem6.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.BloodType.KeyPoints["+ i +"].X"));
			keyPointsItem6.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.BloodType.KeyPoints["+ i +"].Y"));

			keyPoints5.add(keyPointsItem6);
		}
		bloodType.setKeyPoints5(keyPoints5);
		data.setBloodType(bloodType);

		CardBox cardBox = new CardBox();
		cardBox.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.CardBox.Text"));
		cardBox.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.CardBox.Score"));

		List<KeyPointsItem8> keyPoints7 = new ArrayList<KeyPointsItem8>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.CardBox.KeyPoints.Length"); i++) {
			KeyPointsItem8 keyPointsItem8 = new KeyPointsItem8();
			keyPointsItem8.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.CardBox.KeyPoints["+ i +"].X"));
			keyPointsItem8.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.CardBox.KeyPoints["+ i +"].Y"));

			keyPoints7.add(keyPointsItem8);
		}
		cardBox.setKeyPoints7(keyPoints7);
		data.setCardBox(cardBox);

		Cilt cilt = new Cilt();
		cilt.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Cilt.Text"));
		cilt.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Cilt.Score"));

		List<KeyPointsItem10> keyPoints9 = new ArrayList<KeyPointsItem10>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Cilt.KeyPoints.Length"); i++) {
			KeyPointsItem10 keyPointsItem10 = new KeyPointsItem10();
			keyPointsItem10.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Cilt.KeyPoints["+ i +"].X"));
			keyPointsItem10.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Cilt.KeyPoints["+ i +"].Y"));

			keyPoints9.add(keyPointsItem10);
		}
		cilt.setKeyPoints9(keyPoints9);
		data.setCilt(cilt);

		DocumentNumber documentNumber = new DocumentNumber();
		documentNumber.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.DocumentNumber.Text"));
		documentNumber.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.DocumentNumber.Score"));

		List<KeyPointsItem12> keyPoints11 = new ArrayList<KeyPointsItem12>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.DocumentNumber.KeyPoints.Length"); i++) {
			KeyPointsItem12 keyPointsItem12 = new KeyPointsItem12();
			keyPointsItem12.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.DocumentNumber.KeyPoints["+ i +"].X"));
			keyPointsItem12.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.DocumentNumber.KeyPoints["+ i +"].Y"));

			keyPoints11.add(keyPointsItem12);
		}
		documentNumber.setKeyPoints11(keyPoints11);
		data.setDocumentNumber(documentNumber);

		DriveClass driveClass = new DriveClass();
		driveClass.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.DriveClass.Text"));
		driveClass.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.DriveClass.Score"));

		List<KeyPointsItem14> keyPoints13 = new ArrayList<KeyPointsItem14>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.DriveClass.KeyPoints.Length"); i++) {
			KeyPointsItem14 keyPointsItem14 = new KeyPointsItem14();
			keyPointsItem14.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.DriveClass.KeyPoints["+ i +"].X"));
			keyPointsItem14.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.DriveClass.KeyPoints["+ i +"].Y"));

			keyPoints13.add(keyPointsItem14);
		}
		driveClass.setKeyPoints13(keyPoints13);
		data.setDriveClass(driveClass);

		DueDate dueDate = new DueDate();
		dueDate.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.DueDate.Text"));
		dueDate.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.DueDate.Score"));

		List<KeyPointsItem16> keyPoints15 = new ArrayList<KeyPointsItem16>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.DueDate.KeyPoints.Length"); i++) {
			KeyPointsItem16 keyPointsItem16 = new KeyPointsItem16();
			keyPointsItem16.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.DueDate.KeyPoints["+ i +"].X"));
			keyPointsItem16.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.DueDate.KeyPoints["+ i +"].Y"));

			keyPoints15.add(keyPointsItem16);
		}
		dueDate.setKeyPoints15(keyPoints15);
		data.setDueDate(dueDate);

		Duzenleyen duzenleyen = new Duzenleyen();
		duzenleyen.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Duzenleyen.Text"));
		duzenleyen.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Duzenleyen.Score"));

		List<KeyPointsItem18> keyPoints17 = new ArrayList<KeyPointsItem18>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Duzenleyen.KeyPoints.Length"); i++) {
			KeyPointsItem18 keyPointsItem18 = new KeyPointsItem18();
			keyPointsItem18.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Duzenleyen.KeyPoints["+ i +"].X"));
			keyPointsItem18.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Duzenleyen.KeyPoints["+ i +"].Y"));

			keyPoints17.add(keyPointsItem18);
		}
		duzenleyen.setKeyPoints17(keyPoints17);
		data.setDuzenleyen(duzenleyen);

		EntryNumber entryNumber = new EntryNumber();
		entryNumber.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.EntryNumber.Text"));
		entryNumber.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.EntryNumber.Score"));

		List<KeyPointsItem20> keyPoints19 = new ArrayList<KeyPointsItem20>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.EntryNumber.KeyPoints.Length"); i++) {
			KeyPointsItem20 keyPointsItem20 = new KeyPointsItem20();
			keyPointsItem20.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.EntryNumber.KeyPoints["+ i +"].X"));
			keyPointsItem20.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.EntryNumber.KeyPoints["+ i +"].Y"));

			keyPoints19.add(keyPointsItem20);
		}
		entryNumber.setKeyPoints19(keyPoints19);
		data.setEntryNumber(entryNumber);

		ExpiryDate expiryDate = new ExpiryDate();
		expiryDate.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.ExpiryDate.Text"));
		expiryDate.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ExpiryDate.Score"));

		List<KeyPointsItem22> keyPoints21 = new ArrayList<KeyPointsItem22>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.ExpiryDate.KeyPoints.Length"); i++) {
			KeyPointsItem22 keyPointsItem22 = new KeyPointsItem22();
			keyPointsItem22.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ExpiryDate.KeyPoints["+ i +"].X"));
			keyPointsItem22.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ExpiryDate.KeyPoints["+ i +"].Y"));

			keyPoints21.add(keyPointsItem22);
		}
		expiryDate.setKeyPoints21(keyPoints21);
		data.setExpiryDate(expiryDate);

		FatherName fatherName = new FatherName();
		fatherName.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.FatherName.Text"));
		fatherName.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.FatherName.Score"));

		List<KeyPointsItem24> keyPoints23 = new ArrayList<KeyPointsItem24>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.FatherName.KeyPoints.Length"); i++) {
			KeyPointsItem24 keyPointsItem24 = new KeyPointsItem24();
			keyPointsItem24.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.FatherName.KeyPoints["+ i +"].X"));
			keyPointsItem24.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.FatherName.KeyPoints["+ i +"].Y"));

			keyPoints23.add(keyPointsItem24);
		}
		fatherName.setKeyPoints23(keyPoints23);
		data.setFatherName(fatherName);

		ForeignersId foreignersId = new ForeignersId();
		foreignersId.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.ForeignersId.Text"));
		foreignersId.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ForeignersId.Score"));

		List<KeyPointsItem26> keyPoints25 = new ArrayList<KeyPointsItem26>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.ForeignersId.KeyPoints.Length"); i++) {
			KeyPointsItem26 keyPointsItem26 = new KeyPointsItem26();
			keyPointsItem26.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ForeignersId.KeyPoints["+ i +"].X"));
			keyPointsItem26.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ForeignersId.KeyPoints["+ i +"].Y"));

			keyPoints25.add(keyPointsItem26);
		}
		foreignersId.setKeyPoints25(keyPoints25);
		data.setForeignersId(foreignersId);

		Gender gender = new Gender();
		gender.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Gender.Text"));
		gender.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Gender.Score"));

		List<KeyPointsItem28> keyPoints27 = new ArrayList<KeyPointsItem28>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Gender.KeyPoints.Length"); i++) {
			KeyPointsItem28 keyPointsItem28 = new KeyPointsItem28();
			keyPointsItem28.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Gender.KeyPoints["+ i +"].X"));
			keyPointsItem28.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Gender.KeyPoints["+ i +"].Y"));

			keyPoints27.add(keyPointsItem28);
		}
		gender.setKeyPoints27(keyPoints27);
		data.setGender(gender);

		GivenName givenName = new GivenName();
		givenName.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.GivenName.Text"));
		givenName.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.GivenName.Score"));

		List<KeyPointsItem30> keyPoints29 = new ArrayList<KeyPointsItem30>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.GivenName.KeyPoints.Length"); i++) {
			KeyPointsItem30 keyPointsItem30 = new KeyPointsItem30();
			keyPointsItem30.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.GivenName.KeyPoints["+ i +"].X"));
			keyPointsItem30.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.GivenName.KeyPoints["+ i +"].Y"));

			keyPoints29.add(keyPointsItem30);
		}
		givenName.setKeyPoints29(keyPoints29);
		data.setGivenName(givenName);

		IdNumber idNumber = new IdNumber();
		idNumber.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.IdNumber.Text"));
		idNumber.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IdNumber.Score"));

		List<KeyPointsItem32> keyPoints31 = new ArrayList<KeyPointsItem32>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.IdNumber.KeyPoints.Length"); i++) {
			KeyPointsItem32 keyPointsItem32 = new KeyPointsItem32();
			keyPointsItem32.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IdNumber.KeyPoints["+ i +"].X"));
			keyPointsItem32.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IdNumber.KeyPoints["+ i +"].Y"));

			keyPoints31.add(keyPointsItem32);
		}
		idNumber.setKeyPoints31(keyPoints31);
		data.setIdNumber(idNumber);

		IssueBy issueBy = new IssueBy();
		issueBy.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.IssueBy.Text"));
		issueBy.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IssueBy.Score"));

		List<KeyPointsItem34> keyPoints33 = new ArrayList<KeyPointsItem34>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.IssueBy.KeyPoints.Length"); i++) {
			KeyPointsItem34 keyPointsItem34 = new KeyPointsItem34();
			keyPointsItem34.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IssueBy.KeyPoints["+ i +"].X"));
			keyPointsItem34.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IssueBy.KeyPoints["+ i +"].Y"));

			keyPoints33.add(keyPointsItem34);
		}
		issueBy.setKeyPoints33(keyPoints33);
		data.setIssueBy(issueBy);

		IssueCounty issueCounty = new IssueCounty();
		issueCounty.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.IssueCounty.Text"));
		issueCounty.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IssueCounty.Score"));

		List<KeyPointsItem36> keyPoints35 = new ArrayList<KeyPointsItem36>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.IssueCounty.KeyPoints.Length"); i++) {
			KeyPointsItem36 keyPointsItem36 = new KeyPointsItem36();
			keyPointsItem36.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IssueCounty.KeyPoints["+ i +"].X"));
			keyPointsItem36.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IssueCounty.KeyPoints["+ i +"].Y"));

			keyPoints35.add(keyPointsItem36);
		}
		issueCounty.setKeyPoints35(keyPoints35);
		data.setIssueCounty(issueCounty);

		IssueDate issueDate = new IssueDate();
		issueDate.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.IssueDate.Text"));
		issueDate.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IssueDate.Score"));

		List<KeyPointsItem38> keyPoints37 = new ArrayList<KeyPointsItem38>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.IssueDate.KeyPoints.Length"); i++) {
			KeyPointsItem38 keyPointsItem38 = new KeyPointsItem38();
			keyPointsItem38.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IssueDate.KeyPoints["+ i +"].X"));
			keyPointsItem38.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IssueDate.KeyPoints["+ i +"].Y"));

			keyPoints37.add(keyPointsItem38);
		}
		issueDate.setKeyPoints37(keyPoints37);
		data.setIssueDate(issueDate);

		IssuePlace issuePlace = new IssuePlace();
		issuePlace.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.IssuePlace.Text"));
		issuePlace.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IssuePlace.Score"));

		List<KeyPointsItem40> keyPoints39 = new ArrayList<KeyPointsItem40>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.IssuePlace.KeyPoints.Length"); i++) {
			KeyPointsItem40 keyPointsItem40 = new KeyPointsItem40();
			keyPointsItem40.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IssuePlace.KeyPoints["+ i +"].X"));
			keyPointsItem40.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.IssuePlace.KeyPoints["+ i +"].Y"));

			keyPoints39.add(keyPointsItem40);
		}
		issuePlace.setKeyPoints39(keyPoints39);
		data.setIssuePlace(issuePlace);

		Kutuk kutuk = new Kutuk();
		kutuk.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Kutuk.Text"));
		kutuk.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Kutuk.Score"));

		List<KeyPointsItem42> keyPoints41 = new ArrayList<KeyPointsItem42>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Kutuk.KeyPoints.Length"); i++) {
			KeyPointsItem42 keyPointsItem42 = new KeyPointsItem42();
			keyPointsItem42.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Kutuk.KeyPoints["+ i +"].X"));
			keyPointsItem42.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Kutuk.KeyPoints["+ i +"].Y"));

			keyPoints41.add(keyPointsItem42);
		}
		kutuk.setKeyPoints41(keyPoints41);
		data.setKutuk(kutuk);

		LicenseNumber licenseNumber = new LicenseNumber();
		licenseNumber.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.LicenseNumber.Text"));
		licenseNumber.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.LicenseNumber.Score"));

		List<KeyPointsItem44> keyPoints43 = new ArrayList<KeyPointsItem44>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.LicenseNumber.KeyPoints.Length"); i++) {
			KeyPointsItem44 keyPointsItem44 = new KeyPointsItem44();
			keyPointsItem44.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.LicenseNumber.KeyPoints["+ i +"].X"));
			keyPointsItem44.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.LicenseNumber.KeyPoints["+ i +"].Y"));

			keyPoints43.add(keyPointsItem44);
		}
		licenseNumber.setKeyPoints43(keyPoints43);
		data.setLicenseNumber(licenseNumber);

		MaritalStatus maritalStatus = new MaritalStatus();
		maritalStatus.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.MaritalStatus.Text"));
		maritalStatus.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.MaritalStatus.Score"));

		List<KeyPointsItem46> keyPoints45 = new ArrayList<KeyPointsItem46>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.MaritalStatus.KeyPoints.Length"); i++) {
			KeyPointsItem46 keyPointsItem46 = new KeyPointsItem46();
			keyPointsItem46.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.MaritalStatus.KeyPoints["+ i +"].X"));
			keyPointsItem46.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.MaritalStatus.KeyPoints["+ i +"].Y"));

			keyPoints45.add(keyPointsItem46);
		}
		maritalStatus.setKeyPoints45(keyPoints45);
		data.setMaritalStatus(maritalStatus);

		MotherName motherName = new MotherName();
		motherName.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.MotherName.Text"));
		motherName.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.MotherName.Score"));

		List<KeyPointsItem48> keyPoints47 = new ArrayList<KeyPointsItem48>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.MotherName.KeyPoints.Length"); i++) {
			KeyPointsItem48 keyPointsItem48 = new KeyPointsItem48();
			keyPointsItem48.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.MotherName.KeyPoints["+ i +"].X"));
			keyPointsItem48.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.MotherName.KeyPoints["+ i +"].Y"));

			keyPoints47.add(keyPointsItem48);
		}
		motherName.setKeyPoints47(keyPoints47);
		data.setMotherName(motherName);

		Name name = new Name();
		name.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Name.Text"));
		name.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Name.Score"));

		List<KeyPointsItem50> keyPoints49 = new ArrayList<KeyPointsItem50>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Name.KeyPoints.Length"); i++) {
			KeyPointsItem50 keyPointsItem50 = new KeyPointsItem50();
			keyPointsItem50.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Name.KeyPoints["+ i +"].X"));
			keyPointsItem50.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Name.KeyPoints["+ i +"].Y"));

			keyPoints49.add(keyPointsItem50);
		}
		name.setKeyPoints49(keyPoints49);
		data.setName(name);

		Nationality nationality = new Nationality();
		nationality.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Nationality.Text"));
		nationality.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Nationality.Score"));

		List<KeyPointsItem52> keyPoints51 = new ArrayList<KeyPointsItem52>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Nationality.KeyPoints.Length"); i++) {
			KeyPointsItem52 keyPointsItem52 = new KeyPointsItem52();
			keyPointsItem52.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Nationality.KeyPoints["+ i +"].X"));
			keyPointsItem52.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Nationality.KeyPoints["+ i +"].Y"));

			keyPoints51.add(keyPointsItem52);
		}
		nationality.setKeyPoints51(keyPoints51);
		data.setNationality(nationality);

		NeighborhoodVillage neighborhoodVillage = new NeighborhoodVillage();
		neighborhoodVillage.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.NeighborhoodVillage.Text"));
		neighborhoodVillage.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.NeighborhoodVillage.Score"));

		List<KeyPointsItem54> keyPoints53 = new ArrayList<KeyPointsItem54>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.NeighborhoodVillage.KeyPoints.Length"); i++) {
			KeyPointsItem54 keyPointsItem54 = new KeyPointsItem54();
			keyPointsItem54.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.NeighborhoodVillage.KeyPoints["+ i +"].X"));
			keyPointsItem54.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.NeighborhoodVillage.KeyPoints["+ i +"].Y"));

			keyPoints53.add(keyPointsItem54);
		}
		neighborhoodVillage.setKeyPoints53(keyPoints53);
		data.setNeighborhoodVillage(neighborhoodVillage);

		PageNumber pageNumber = new PageNumber();
		pageNumber.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.PageNumber.Text"));
		pageNumber.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.PageNumber.Score"));

		List<KeyPointsItem56> keyPoints55 = new ArrayList<KeyPointsItem56>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.PageNumber.KeyPoints.Length"); i++) {
			KeyPointsItem56 keyPointsItem56 = new KeyPointsItem56();
			keyPointsItem56.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.PageNumber.KeyPoints["+ i +"].X"));
			keyPointsItem56.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.PageNumber.KeyPoints["+ i +"].Y"));

			keyPoints55.add(keyPointsItem56);
		}
		pageNumber.setKeyPoints55(keyPoints55);
		data.setPageNumber(pageNumber);

		PassportNumber passportNumber = new PassportNumber();
		passportNumber.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.PassportNumber.Text"));
		passportNumber.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.PassportNumber.Score"));

		List<KeyPointsItem58> keyPoints57 = new ArrayList<KeyPointsItem58>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.PassportNumber.KeyPoints.Length"); i++) {
			KeyPointsItem58 keyPointsItem58 = new KeyPointsItem58();
			keyPointsItem58.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.PassportNumber.KeyPoints["+ i +"].X"));
			keyPointsItem58.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.PassportNumber.KeyPoints["+ i +"].Y"));

			keyPoints57.add(keyPointsItem58);
		}
		passportNumber.setKeyPoints57(keyPoints57);
		data.setPassportNumber(passportNumber);

		PortraitBox portraitBox = new PortraitBox();
		portraitBox.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.PortraitBox.Text"));
		portraitBox.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.PortraitBox.Score"));

		List<KeyPointsItem60> keyPoints59 = new ArrayList<KeyPointsItem60>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.PortraitBox.KeyPoints.Length"); i++) {
			KeyPointsItem60 keyPointsItem60 = new KeyPointsItem60();
			keyPointsItem60.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.PortraitBox.KeyPoints["+ i +"].X"));
			keyPointsItem60.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.PortraitBox.KeyPoints["+ i +"].Y"));

			keyPoints59.add(keyPointsItem60);
		}
		portraitBox.setKeyPoints59(keyPoints59);
		data.setPortraitBox(portraitBox);

		Province province = new Province();
		province.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Province.Text"));
		province.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Province.Score"));

		List<KeyPointsItem62> keyPoints61 = new ArrayList<KeyPointsItem62>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Province.KeyPoints.Length"); i++) {
			KeyPointsItem62 keyPointsItem62 = new KeyPointsItem62();
			keyPointsItem62.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Province.KeyPoints["+ i +"].X"));
			keyPointsItem62.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Province.KeyPoints["+ i +"].Y"));

			keyPoints61.add(keyPointsItem62);
		}
		province.setKeyPoints61(keyPoints61);
		data.setProvince(province);

		ProvinceOfResidence provinceOfResidence = new ProvinceOfResidence();
		provinceOfResidence.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.ProvinceOfResidence.Text"));
		provinceOfResidence.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ProvinceOfResidence.Score"));

		List<KeyPointsItem64> keyPoints63 = new ArrayList<KeyPointsItem64>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.ProvinceOfResidence.KeyPoints.Length"); i++) {
			KeyPointsItem64 keyPointsItem64 = new KeyPointsItem64();
			keyPointsItem64.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ProvinceOfResidence.KeyPoints["+ i +"].X"));
			keyPointsItem64.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ProvinceOfResidence.KeyPoints["+ i +"].Y"));

			keyPoints63.add(keyPointsItem64);
		}
		provinceOfResidence.setKeyPoints63(keyPoints63);
		data.setProvinceOfResidence(provinceOfResidence);

		ReasonOfIssue reasonOfIssue = new ReasonOfIssue();
		reasonOfIssue.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.ReasonOfIssue.Text"));
		reasonOfIssue.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ReasonOfIssue.Score"));

		List<KeyPointsItem66> keyPoints65 = new ArrayList<KeyPointsItem66>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.ReasonOfIssue.KeyPoints.Length"); i++) {
			KeyPointsItem66 keyPointsItem66 = new KeyPointsItem66();
			keyPointsItem66.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ReasonOfIssue.KeyPoints["+ i +"].X"));
			keyPointsItem66.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ReasonOfIssue.KeyPoints["+ i +"].Y"));

			keyPoints65.add(keyPointsItem66);
		}
		reasonOfIssue.setKeyPoints65(keyPoints65);
		data.setReasonOfIssue(reasonOfIssue);

		RegisterNumber registerNumber = new RegisterNumber();
		registerNumber.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.RegisterNumber.Text"));
		registerNumber.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.RegisterNumber.Score"));

		List<KeyPointsItem68> keyPoints67 = new ArrayList<KeyPointsItem68>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.RegisterNumber.KeyPoints.Length"); i++) {
			KeyPointsItem68 keyPointsItem68 = new KeyPointsItem68();
			keyPointsItem68.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.RegisterNumber.KeyPoints["+ i +"].X"));
			keyPointsItem68.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.RegisterNumber.KeyPoints["+ i +"].Y"));

			keyPoints67.add(keyPointsItem68);
		}
		registerNumber.setKeyPoints67(keyPoints67);
		data.setRegisterNumber(registerNumber);

		Religion religion = new Religion();
		religion.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Religion.Text"));
		religion.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Religion.Score"));

		List<KeyPointsItem70> keyPoints69 = new ArrayList<KeyPointsItem70>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Religion.KeyPoints.Length"); i++) {
			KeyPointsItem70 keyPointsItem70 = new KeyPointsItem70();
			keyPointsItem70.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Religion.KeyPoints["+ i +"].X"));
			keyPointsItem70.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Religion.KeyPoints["+ i +"].Y"));

			keyPoints69.add(keyPointsItem70);
		}
		religion.setKeyPoints69(keyPoints69);
		data.setReligion(religion);

		Sayfa sayfa = new Sayfa();
		sayfa.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Sayfa.Text"));
		sayfa.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Sayfa.Score"));

		List<KeyPointsItem72> keyPoints71 = new ArrayList<KeyPointsItem72>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Sayfa.KeyPoints.Length"); i++) {
			KeyPointsItem72 keyPointsItem72 = new KeyPointsItem72();
			keyPointsItem72.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Sayfa.KeyPoints["+ i +"].X"));
			keyPointsItem72.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Sayfa.KeyPoints["+ i +"].Y"));

			keyPoints71.add(keyPointsItem72);
		}
		sayfa.setKeyPoints71(keyPoints71);
		data.setSayfa(sayfa);

		Seri seri = new Seri();
		seri.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Seri.Text"));
		seri.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Seri.Score"));

		List<KeyPointsItem74> keyPoints73 = new ArrayList<KeyPointsItem74>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Seri.KeyPoints.Length"); i++) {
			KeyPointsItem74 keyPointsItem74 = new KeyPointsItem74();
			keyPointsItem74.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Seri.KeyPoints["+ i +"].X"));
			keyPointsItem74.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Seri.KeyPoints["+ i +"].Y"));

			keyPoints73.add(keyPointsItem74);
		}
		seri.setKeyPoints73(keyPoints73);
		data.setSeri(seri);

		Surname surname = new Surname();
		surname.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Surname.Text"));
		surname.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Surname.Score"));

		List<KeyPointsItem76> keyPoints75 = new ArrayList<KeyPointsItem76>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Surname.KeyPoints.Length"); i++) {
			KeyPointsItem76 keyPointsItem76 = new KeyPointsItem76();
			keyPointsItem76.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Surname.KeyPoints["+ i +"].X"));
			keyPointsItem76.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Surname.KeyPoints["+ i +"].Y"));

			keyPoints75.add(keyPointsItem76);
		}
		surname.setKeyPoints75(keyPoints75);
		data.setSurname(surname);

		TypeOfResidencePermit typeOfResidencePermit = new TypeOfResidencePermit();
		typeOfResidencePermit.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.TypeOfResidencePermit.Text"));
		typeOfResidencePermit.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.TypeOfResidencePermit.Score"));

		List<KeyPointsItem78> keyPoints77 = new ArrayList<KeyPointsItem78>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.TypeOfResidencePermit.KeyPoints.Length"); i++) {
			KeyPointsItem78 keyPointsItem78 = new KeyPointsItem78();
			keyPointsItem78.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.TypeOfResidencePermit.KeyPoints["+ i +"].X"));
			keyPointsItem78.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.TypeOfResidencePermit.KeyPoints["+ i +"].Y"));

			keyPoints77.add(keyPointsItem78);
		}
		typeOfResidencePermit.setKeyPoints77(keyPoints77);
		data.setTypeOfResidencePermit(typeOfResidencePermit);

		ValidUntil validUntil = new ValidUntil();
		validUntil.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.ValidUntil.Text"));
		validUntil.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ValidUntil.Score"));

		List<KeyPointsItem80> keyPoints79 = new ArrayList<KeyPointsItem80>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.ValidUntil.KeyPoints.Length"); i++) {
			KeyPointsItem80 keyPointsItem80 = new KeyPointsItem80();
			keyPointsItem80.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ValidUntil.KeyPoints["+ i +"].X"));
			keyPointsItem80.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.ValidUntil.KeyPoints["+ i +"].Y"));

			keyPoints79.add(keyPointsItem80);
		}
		validUntil.setKeyPoints79(keyPoints79);
		data.setValidUntil(validUntil);

		Village village = new Village();
		village.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Village.Text"));
		village.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Village.Score"));

		List<KeyPointsItem82> keyPoints81 = new ArrayList<KeyPointsItem82>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Village.KeyPoints.Length"); i++) {
			KeyPointsItem82 keyPointsItem82 = new KeyPointsItem82();
			keyPointsItem82.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Village.KeyPoints["+ i +"].X"));
			keyPointsItem82.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Village.KeyPoints["+ i +"].Y"));

			keyPoints81.add(keyPointsItem82);
		}
		village.setKeyPoints81(keyPoints81);
		data.setVillage(village);

		VolumeNumber volumeNumber = new VolumeNumber();
		volumeNumber.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.VolumeNumber.Text"));
		volumeNumber.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.VolumeNumber.Score"));

		List<KeyPointsItem84> keyPoints83 = new ArrayList<KeyPointsItem84>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.VolumeNumber.KeyPoints.Length"); i++) {
			KeyPointsItem84 keyPointsItem84 = new KeyPointsItem84();
			keyPointsItem84.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.VolumeNumber.KeyPoints["+ i +"].X"));
			keyPointsItem84.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.VolumeNumber.KeyPoints["+ i +"].Y"));

			keyPoints83.add(keyPointsItem84);
		}
		volumeNumber.setKeyPoints83(keyPoints83);
		data.setVolumeNumber(volumeNumber);

		Sex sex = new Sex();
		sex.setText(_ctx.stringValue("RecognizeTurkeyIdentityCardResponse.Data.Sex.Text"));
		sex.setScore(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Sex.Score"));

		List<KeyPointsItem86> keyPoints85 = new ArrayList<KeyPointsItem86>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTurkeyIdentityCardResponse.Data.Sex.KeyPoints.Length"); i++) {
			KeyPointsItem86 keyPointsItem86 = new KeyPointsItem86();
			keyPointsItem86.setX(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Sex.KeyPoints["+ i +"].X"));
			keyPointsItem86.setY(_ctx.floatValue("RecognizeTurkeyIdentityCardResponse.Data.Sex.KeyPoints["+ i +"].Y"));

			keyPoints85.add(keyPointsItem86);
		}
		sex.setKeyPoints85(keyPoints85);
		data.setSex(sex);
		recognizeTurkeyIdentityCardResponse.setData(data);
	 
	 	return recognizeTurkeyIdentityCardResponse;
	}
}