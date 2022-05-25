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

import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.AddressFifthLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.AddressFifthLine.KeyPointsItem8;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.AddressFirstLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.AddressFirstLine.KeyPointsItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.AddressFourthLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.AddressFourthLine.KeyPointsItem6;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.AddressSecondLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.AddressSecondLine.KeyPointsItem2;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.AddressThirdLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.AddressThirdLine.KeyPointsItem4;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.CardBox;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.CardBox.KeyPointsItem10;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.DriveClass;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.DriveClass.KeyPointsItem12;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.ExpiryDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.ExpiryDate.KeyPointsItem14;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.IdNumber;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.IdNumber.KeyPointsItem16;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.IssueDate;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.IssueDate.KeyPointsItem18;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.NameFirstLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.NameFirstLine.KeyPointsItem20;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.NameSecondLine;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.NameSecondLine.KeyPointsItem22;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.Nationality;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.Nationality.KeyPointsItem24;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.PortraitBox;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.PortraitBox.KeyPointsItem26;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.Sex;
import com.aliyuncs.ocr.model.v20191230.RecognizeMalaysiaIdentityCardResponse.Data.Sex.KeyPointsItem28;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeMalaysiaIdentityCardResponseUnmarshaller {

	public static RecognizeMalaysiaIdentityCardResponse unmarshall(RecognizeMalaysiaIdentityCardResponse recognizeMalaysiaIdentityCardResponse, UnmarshallerContext _ctx) {
		
		recognizeMalaysiaIdentityCardResponse.setRequestId(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.RequestId"));
		recognizeMalaysiaIdentityCardResponse.setCode(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Code"));
		recognizeMalaysiaIdentityCardResponse.setMessage(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Message"));

		Data data = new Data();

		AddressFirstLine addressFirstLine = new AddressFirstLine();
		addressFirstLine.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFirstLine.Text"));
		addressFirstLine.setScore(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFirstLine.Score"));

		List<KeyPointsItem> keyPoints = new ArrayList<KeyPointsItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFirstLine.KeyPoints.Length"); i++) {
			KeyPointsItem keyPointsItem = new KeyPointsItem();
			keyPointsItem.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFirstLine.KeyPoints["+ i +"].X"));
			keyPointsItem.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFirstLine.KeyPoints["+ i +"].Y"));

			keyPoints.add(keyPointsItem);
		}
		addressFirstLine.setKeyPoints(keyPoints);
		data.setAddressFirstLine(addressFirstLine);

		AddressSecondLine addressSecondLine = new AddressSecondLine();
		addressSecondLine.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressSecondLine.Text"));
		addressSecondLine.setScore(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressSecondLine.Score"));

		List<KeyPointsItem2> keyPoints1 = new ArrayList<KeyPointsItem2>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressSecondLine.KeyPoints.Length"); i++) {
			KeyPointsItem2 keyPointsItem2 = new KeyPointsItem2();
			keyPointsItem2.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressSecondLine.KeyPoints["+ i +"].X"));
			keyPointsItem2.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressSecondLine.KeyPoints["+ i +"].Y"));

			keyPoints1.add(keyPointsItem2);
		}
		addressSecondLine.setKeyPoints1(keyPoints1);
		data.setAddressSecondLine(addressSecondLine);

		AddressThirdLine addressThirdLine = new AddressThirdLine();
		addressThirdLine.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressThirdLine.Text"));
		addressThirdLine.setScore(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressThirdLine.Score"));

		List<KeyPointsItem4> keyPoints3 = new ArrayList<KeyPointsItem4>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressThirdLine.KeyPoints.Length"); i++) {
			KeyPointsItem4 keyPointsItem4 = new KeyPointsItem4();
			keyPointsItem4.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressThirdLine.KeyPoints["+ i +"].X"));
			keyPointsItem4.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressThirdLine.KeyPoints["+ i +"].Y"));

			keyPoints3.add(keyPointsItem4);
		}
		addressThirdLine.setKeyPoints3(keyPoints3);
		data.setAddressThirdLine(addressThirdLine);

		AddressFourthLine addressFourthLine = new AddressFourthLine();
		addressFourthLine.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFourthLine.Text"));
		addressFourthLine.setScore(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFourthLine.Score"));

		List<KeyPointsItem6> keyPoints5 = new ArrayList<KeyPointsItem6>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFourthLine.KeyPoints.Length"); i++) {
			KeyPointsItem6 keyPointsItem6 = new KeyPointsItem6();
			keyPointsItem6.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFourthLine.KeyPoints["+ i +"].X"));
			keyPointsItem6.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFourthLine.KeyPoints["+ i +"].Y"));

			keyPoints5.add(keyPointsItem6);
		}
		addressFourthLine.setKeyPoints5(keyPoints5);
		data.setAddressFourthLine(addressFourthLine);

		AddressFifthLine addressFifthLine = new AddressFifthLine();
		addressFifthLine.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFifthLine.Text"));
		addressFifthLine.setScore(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFifthLine.Score"));

		List<KeyPointsItem8> keyPoints7 = new ArrayList<KeyPointsItem8>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFifthLine.KeyPoints.Length"); i++) {
			KeyPointsItem8 keyPointsItem8 = new KeyPointsItem8();
			keyPointsItem8.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFifthLine.KeyPoints["+ i +"].X"));
			keyPointsItem8.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.AddressFifthLine.KeyPoints["+ i +"].Y"));

			keyPoints7.add(keyPointsItem8);
		}
		addressFifthLine.setKeyPoints7(keyPoints7);
		data.setAddressFifthLine(addressFifthLine);

		CardBox cardBox = new CardBox();
		cardBox.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.CardBox.Text"));
		cardBox.setScore(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.CardBox.Score"));

		List<KeyPointsItem10> keyPoints9 = new ArrayList<KeyPointsItem10>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.CardBox.KeyPoints.Length"); i++) {
			KeyPointsItem10 keyPointsItem10 = new KeyPointsItem10();
			keyPointsItem10.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.CardBox.KeyPoints["+ i +"].X"));
			keyPointsItem10.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.CardBox.KeyPoints["+ i +"].Y"));

			keyPoints9.add(keyPointsItem10);
		}
		cardBox.setKeyPoints9(keyPoints9);
		data.setCardBox(cardBox);

		DriveClass driveClass = new DriveClass();
		driveClass.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.DriveClass.Text"));
		driveClass.setScore(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.DriveClass.Score"));

		List<KeyPointsItem12> keyPoints11 = new ArrayList<KeyPointsItem12>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.DriveClass.KeyPoints.Length"); i++) {
			KeyPointsItem12 keyPointsItem12 = new KeyPointsItem12();
			keyPointsItem12.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.DriveClass.KeyPoints["+ i +"].X"));
			keyPointsItem12.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.DriveClass.KeyPoints["+ i +"].Y"));

			keyPoints11.add(keyPointsItem12);
		}
		driveClass.setKeyPoints11(keyPoints11);
		data.setDriveClass(driveClass);

		ExpiryDate expiryDate = new ExpiryDate();
		expiryDate.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.ExpiryDate.Text"));
		expiryDate.setScore(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.ExpiryDate.Score"));

		List<KeyPointsItem14> keyPoints13 = new ArrayList<KeyPointsItem14>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.ExpiryDate.KeyPoints.Length"); i++) {
			KeyPointsItem14 keyPointsItem14 = new KeyPointsItem14();
			keyPointsItem14.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.ExpiryDate.KeyPoints["+ i +"].X"));
			keyPointsItem14.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.ExpiryDate.KeyPoints["+ i +"].Y"));

			keyPoints13.add(keyPointsItem14);
		}
		expiryDate.setKeyPoints13(keyPoints13);
		data.setExpiryDate(expiryDate);

		IdNumber idNumber = new IdNumber();
		idNumber.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.IdNumber.Text"));
		idNumber.setScore(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.IdNumber.Score"));

		List<KeyPointsItem16> keyPoints15 = new ArrayList<KeyPointsItem16>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.IdNumber.KeyPoints.Length"); i++) {
			KeyPointsItem16 keyPointsItem16 = new KeyPointsItem16();
			keyPointsItem16.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.IdNumber.KeyPoints["+ i +"].X"));
			keyPointsItem16.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.IdNumber.KeyPoints["+ i +"].Y"));

			keyPoints15.add(keyPointsItem16);
		}
		idNumber.setKeyPoints15(keyPoints15);
		data.setIdNumber(idNumber);

		IssueDate issueDate = new IssueDate();
		issueDate.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.IssueDate.Text"));
		issueDate.setScore(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.IssueDate.Score"));

		List<KeyPointsItem18> keyPoints17 = new ArrayList<KeyPointsItem18>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.IssueDate.KeyPoints.Length"); i++) {
			KeyPointsItem18 keyPointsItem18 = new KeyPointsItem18();
			keyPointsItem18.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.IssueDate.KeyPoints["+ i +"].X"));
			keyPointsItem18.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.IssueDate.KeyPoints["+ i +"].Y"));

			keyPoints17.add(keyPointsItem18);
		}
		issueDate.setKeyPoints17(keyPoints17);
		data.setIssueDate(issueDate);

		NameFirstLine nameFirstLine = new NameFirstLine();
		nameFirstLine.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.NameFirstLine.Text"));
		nameFirstLine.setScore(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.NameFirstLine.Score"));

		List<KeyPointsItem20> keyPoints19 = new ArrayList<KeyPointsItem20>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.NameFirstLine.KeyPoints.Length"); i++) {
			KeyPointsItem20 keyPointsItem20 = new KeyPointsItem20();
			keyPointsItem20.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.NameFirstLine.KeyPoints["+ i +"].X"));
			keyPointsItem20.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.NameFirstLine.KeyPoints["+ i +"].Y"));

			keyPoints19.add(keyPointsItem20);
		}
		nameFirstLine.setKeyPoints19(keyPoints19);
		data.setNameFirstLine(nameFirstLine);

		NameSecondLine nameSecondLine = new NameSecondLine();
		nameSecondLine.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.NameSecondLine.Text"));
		nameSecondLine.setScore(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.NameSecondLine.Score"));

		List<KeyPointsItem22> keyPoints21 = new ArrayList<KeyPointsItem22>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.NameSecondLine.KeyPoints.Length"); i++) {
			KeyPointsItem22 keyPointsItem22 = new KeyPointsItem22();
			keyPointsItem22.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.NameSecondLine.KeyPoints["+ i +"].X"));
			keyPointsItem22.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.NameSecondLine.KeyPoints["+ i +"].Y"));

			keyPoints21.add(keyPointsItem22);
		}
		nameSecondLine.setKeyPoints21(keyPoints21);
		data.setNameSecondLine(nameSecondLine);

		Nationality nationality = new Nationality();
		nationality.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.Nationality.Text"));
		nationality.setScore(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.Nationality.Score"));

		List<KeyPointsItem24> keyPoints23 = new ArrayList<KeyPointsItem24>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.Nationality.KeyPoints.Length"); i++) {
			KeyPointsItem24 keyPointsItem24 = new KeyPointsItem24();
			keyPointsItem24.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.Nationality.KeyPoints["+ i +"].X"));
			keyPointsItem24.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.Nationality.KeyPoints["+ i +"].Y"));

			keyPoints23.add(keyPointsItem24);
		}
		nationality.setKeyPoints23(keyPoints23);
		data.setNationality(nationality);

		PortraitBox portraitBox = new PortraitBox();
		portraitBox.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.PortraitBox.Text"));
		portraitBox.setScore(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.PortraitBox.Score"));

		List<KeyPointsItem26> keyPoints25 = new ArrayList<KeyPointsItem26>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.PortraitBox.KeyPoints.Length"); i++) {
			KeyPointsItem26 keyPointsItem26 = new KeyPointsItem26();
			keyPointsItem26.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.PortraitBox.KeyPoints["+ i +"].X"));
			keyPointsItem26.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.PortraitBox.KeyPoints["+ i +"].Y"));

			keyPoints25.add(keyPointsItem26);
		}
		portraitBox.setKeyPoints25(keyPoints25);
		data.setPortraitBox(portraitBox);

		Sex sex = new Sex();
		sex.setText(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.Sex.Text"));
		sex.setScore(_ctx.stringValue("RecognizeMalaysiaIdentityCardResponse.Data.Sex.Score"));

		List<KeyPointsItem28> keyPoints27 = new ArrayList<KeyPointsItem28>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeMalaysiaIdentityCardResponse.Data.Sex.KeyPoints.Length"); i++) {
			KeyPointsItem28 keyPointsItem28 = new KeyPointsItem28();
			keyPointsItem28.setX(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.Sex.KeyPoints["+ i +"].X"));
			keyPointsItem28.setY(_ctx.floatValue("RecognizeMalaysiaIdentityCardResponse.Data.Sex.KeyPoints["+ i +"].Y"));

			keyPoints27.add(keyPointsItem28);
		}
		sex.setKeyPoints27(keyPoints27);
		data.setSex(sex);
		recognizeMalaysiaIdentityCardResponse.setData(data);
	 
	 	return recognizeMalaysiaIdentityCardResponse;
	}
}