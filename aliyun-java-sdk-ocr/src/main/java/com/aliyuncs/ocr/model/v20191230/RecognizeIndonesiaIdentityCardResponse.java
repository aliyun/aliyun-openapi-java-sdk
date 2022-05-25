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

package com.aliyuncs.ocr.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeIndonesiaIdentityCardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeIndonesiaIdentityCardResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private AddressFirstLine addressFirstLine;

		private AddressSecondLine addressSecondLine;

		private AddressThirdLine addressThirdLine;

		private AddressFourthLine addressFourthLine;

		private AddressFifthLine addressFifthLine;

		private BirthDate birthDate;

		private BirthPlace birthPlace;

		private CardBox cardBox;

		private ExpiryDate expiryDate;

		private Gender gender;

		private Height height;

		private IdNumber idNumber;

		private LicenseNumber licenseNumber;

		private MaritalStatus maritalStatus;

		private NameFirstLine nameFirstLine;

		private NameSecondLine nameSecondLine;

		private Nationality nationality;

		private Occupation occupation;

		private PortraitBox portraitBox;

		private Province province;

		private Religion religion;

		private Sex sex;

		public AddressFirstLine getAddressFirstLine() {
			return this.addressFirstLine;
		}

		public void setAddressFirstLine(AddressFirstLine addressFirstLine) {
			this.addressFirstLine = addressFirstLine;
		}

		public AddressSecondLine getAddressSecondLine() {
			return this.addressSecondLine;
		}

		public void setAddressSecondLine(AddressSecondLine addressSecondLine) {
			this.addressSecondLine = addressSecondLine;
		}

		public AddressThirdLine getAddressThirdLine() {
			return this.addressThirdLine;
		}

		public void setAddressThirdLine(AddressThirdLine addressThirdLine) {
			this.addressThirdLine = addressThirdLine;
		}

		public AddressFourthLine getAddressFourthLine() {
			return this.addressFourthLine;
		}

		public void setAddressFourthLine(AddressFourthLine addressFourthLine) {
			this.addressFourthLine = addressFourthLine;
		}

		public AddressFifthLine getAddressFifthLine() {
			return this.addressFifthLine;
		}

		public void setAddressFifthLine(AddressFifthLine addressFifthLine) {
			this.addressFifthLine = addressFifthLine;
		}

		public BirthDate getBirthDate() {
			return this.birthDate;
		}

		public void setBirthDate(BirthDate birthDate) {
			this.birthDate = birthDate;
		}

		public BirthPlace getBirthPlace() {
			return this.birthPlace;
		}

		public void setBirthPlace(BirthPlace birthPlace) {
			this.birthPlace = birthPlace;
		}

		public CardBox getCardBox() {
			return this.cardBox;
		}

		public void setCardBox(CardBox cardBox) {
			this.cardBox = cardBox;
		}

		public ExpiryDate getExpiryDate() {
			return this.expiryDate;
		}

		public void setExpiryDate(ExpiryDate expiryDate) {
			this.expiryDate = expiryDate;
		}

		public Gender getGender() {
			return this.gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}

		public Height getHeight() {
			return this.height;
		}

		public void setHeight(Height height) {
			this.height = height;
		}

		public IdNumber getIdNumber() {
			return this.idNumber;
		}

		public void setIdNumber(IdNumber idNumber) {
			this.idNumber = idNumber;
		}

		public LicenseNumber getLicenseNumber() {
			return this.licenseNumber;
		}

		public void setLicenseNumber(LicenseNumber licenseNumber) {
			this.licenseNumber = licenseNumber;
		}

		public MaritalStatus getMaritalStatus() {
			return this.maritalStatus;
		}

		public void setMaritalStatus(MaritalStatus maritalStatus) {
			this.maritalStatus = maritalStatus;
		}

		public NameFirstLine getNameFirstLine() {
			return this.nameFirstLine;
		}

		public void setNameFirstLine(NameFirstLine nameFirstLine) {
			this.nameFirstLine = nameFirstLine;
		}

		public NameSecondLine getNameSecondLine() {
			return this.nameSecondLine;
		}

		public void setNameSecondLine(NameSecondLine nameSecondLine) {
			this.nameSecondLine = nameSecondLine;
		}

		public Nationality getNationality() {
			return this.nationality;
		}

		public void setNationality(Nationality nationality) {
			this.nationality = nationality;
		}

		public Occupation getOccupation() {
			return this.occupation;
		}

		public void setOccupation(Occupation occupation) {
			this.occupation = occupation;
		}

		public PortraitBox getPortraitBox() {
			return this.portraitBox;
		}

		public void setPortraitBox(PortraitBox portraitBox) {
			this.portraitBox = portraitBox;
		}

		public Province getProvince() {
			return this.province;
		}

		public void setProvince(Province province) {
			this.province = province;
		}

		public Religion getReligion() {
			return this.religion;
		}

		public void setReligion(Religion religion) {
			this.religion = religion;
		}

		public Sex getSex() {
			return this.sex;
		}

		public void setSex(Sex sex) {
			this.sex = sex;
		}

		public static class AddressFirstLine {

			private String text;

			private Float score;

			private List<KeyPointsItem> keyPoints;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public List<KeyPointsItem> getKeyPoints() {
				return this.keyPoints;
			}

			public void setKeyPoints(List<KeyPointsItem> keyPoints) {
				this.keyPoints = keyPoints;
			}

			public static class KeyPointsItem {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class AddressSecondLine {

			private String text;

			private Float score;

			private List<KeyPointsItem2> keyPoints1;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public List<KeyPointsItem2> getKeyPoints1() {
				return this.keyPoints1;
			}

			public void setKeyPoints1(List<KeyPointsItem2> keyPoints1) {
				this.keyPoints1 = keyPoints1;
			}

			public static class KeyPointsItem2 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class AddressThirdLine {

			private String text;

			private Float score;

			private List<KeyPointsItem4> keyPoints3;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public List<KeyPointsItem4> getKeyPoints3() {
				return this.keyPoints3;
			}

			public void setKeyPoints3(List<KeyPointsItem4> keyPoints3) {
				this.keyPoints3 = keyPoints3;
			}

			public static class KeyPointsItem4 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class AddressFourthLine {

			private String text;

			private Float score;

			private List<KeyPointsItem6> keyPoints5;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public List<KeyPointsItem6> getKeyPoints5() {
				return this.keyPoints5;
			}

			public void setKeyPoints5(List<KeyPointsItem6> keyPoints5) {
				this.keyPoints5 = keyPoints5;
			}

			public static class KeyPointsItem6 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class AddressFifthLine {

			private String text;

			private Float score;

			private List<KeyPointsItem8> keyPoints7;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public List<KeyPointsItem8> getKeyPoints7() {
				return this.keyPoints7;
			}

			public void setKeyPoints7(List<KeyPointsItem8> keyPoints7) {
				this.keyPoints7 = keyPoints7;
			}

			public static class KeyPointsItem8 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class BirthDate {

			private String text;

			private String score;

			private List<KeyPointsItem10> keyPoints9;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem10> getKeyPoints9() {
				return this.keyPoints9;
			}

			public void setKeyPoints9(List<KeyPointsItem10> keyPoints9) {
				this.keyPoints9 = keyPoints9;
			}

			public static class KeyPointsItem10 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class BirthPlace {

			private String text;

			private String score;

			private List<KeyPointsItem12> keyPoints11;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem12> getKeyPoints11() {
				return this.keyPoints11;
			}

			public void setKeyPoints11(List<KeyPointsItem12> keyPoints11) {
				this.keyPoints11 = keyPoints11;
			}

			public static class KeyPointsItem12 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class CardBox {

			private String text;

			private String score;

			private List<KeyPointsItem14> keyPoints13;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem14> getKeyPoints13() {
				return this.keyPoints13;
			}

			public void setKeyPoints13(List<KeyPointsItem14> keyPoints13) {
				this.keyPoints13 = keyPoints13;
			}

			public static class KeyPointsItem14 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class ExpiryDate {

			private String text;

			private String score;

			private List<KeyPointsItem16> keyPoints15;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem16> getKeyPoints15() {
				return this.keyPoints15;
			}

			public void setKeyPoints15(List<KeyPointsItem16> keyPoints15) {
				this.keyPoints15 = keyPoints15;
			}

			public static class KeyPointsItem16 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class Gender {

			private String text;

			private String score;

			private List<KeyPointsItem18> keyPoints17;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem18> getKeyPoints17() {
				return this.keyPoints17;
			}

			public void setKeyPoints17(List<KeyPointsItem18> keyPoints17) {
				this.keyPoints17 = keyPoints17;
			}

			public static class KeyPointsItem18 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class Height {

			private String text;

			private String score;

			private List<KeyPointsItem20> keyPoints19;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem20> getKeyPoints19() {
				return this.keyPoints19;
			}

			public void setKeyPoints19(List<KeyPointsItem20> keyPoints19) {
				this.keyPoints19 = keyPoints19;
			}

			public static class KeyPointsItem20 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class IdNumber {

			private String text;

			private String score;

			private List<KeyPointsItem22> keyPoints21;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem22> getKeyPoints21() {
				return this.keyPoints21;
			}

			public void setKeyPoints21(List<KeyPointsItem22> keyPoints21) {
				this.keyPoints21 = keyPoints21;
			}

			public static class KeyPointsItem22 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class LicenseNumber {

			private String text;

			private String score;

			private List<KeyPointsItem24> keyPoints23;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem24> getKeyPoints23() {
				return this.keyPoints23;
			}

			public void setKeyPoints23(List<KeyPointsItem24> keyPoints23) {
				this.keyPoints23 = keyPoints23;
			}

			public static class KeyPointsItem24 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class MaritalStatus {

			private String text;

			private String score;

			private List<KeyPointsItem26> keyPoints25;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem26> getKeyPoints25() {
				return this.keyPoints25;
			}

			public void setKeyPoints25(List<KeyPointsItem26> keyPoints25) {
				this.keyPoints25 = keyPoints25;
			}

			public static class KeyPointsItem26 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class NameFirstLine {

			private String text;

			private String score;

			private List<KeyPointsItem28> keyPoints27;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem28> getKeyPoints27() {
				return this.keyPoints27;
			}

			public void setKeyPoints27(List<KeyPointsItem28> keyPoints27) {
				this.keyPoints27 = keyPoints27;
			}

			public static class KeyPointsItem28 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class NameSecondLine {

			private String text;

			private String score;

			private List<KeyPointsItem30> keyPoints29;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem30> getKeyPoints29() {
				return this.keyPoints29;
			}

			public void setKeyPoints29(List<KeyPointsItem30> keyPoints29) {
				this.keyPoints29 = keyPoints29;
			}

			public static class KeyPointsItem30 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class Nationality {

			private String text;

			private String score;

			private List<KeyPointsItem32> keyPoints31;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem32> getKeyPoints31() {
				return this.keyPoints31;
			}

			public void setKeyPoints31(List<KeyPointsItem32> keyPoints31) {
				this.keyPoints31 = keyPoints31;
			}

			public static class KeyPointsItem32 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class Occupation {

			private String text;

			private String score;

			private List<KeyPointsItem34> keyPoints33;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem34> getKeyPoints33() {
				return this.keyPoints33;
			}

			public void setKeyPoints33(List<KeyPointsItem34> keyPoints33) {
				this.keyPoints33 = keyPoints33;
			}

			public static class KeyPointsItem34 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class PortraitBox {

			private String text;

			private String score;

			private List<KeyPointsItem36> keyPoints35;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem36> getKeyPoints35() {
				return this.keyPoints35;
			}

			public void setKeyPoints35(List<KeyPointsItem36> keyPoints35) {
				this.keyPoints35 = keyPoints35;
			}

			public static class KeyPointsItem36 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class Province {

			private String text;

			private String score;

			private List<KeyPointsItem38> keyPoints37;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem38> getKeyPoints37() {
				return this.keyPoints37;
			}

			public void setKeyPoints37(List<KeyPointsItem38> keyPoints37) {
				this.keyPoints37 = keyPoints37;
			}

			public static class KeyPointsItem38 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class Religion {

			private String text;

			private String score;

			private List<KeyPointsItem40> keyPoints39;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem40> getKeyPoints39() {
				return this.keyPoints39;
			}

			public void setKeyPoints39(List<KeyPointsItem40> keyPoints39) {
				this.keyPoints39 = keyPoints39;
			}

			public static class KeyPointsItem40 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}

		public static class Sex {

			private String text;

			private String score;

			private List<KeyPointsItem42> keyPoints41;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public List<KeyPointsItem42> getKeyPoints41() {
				return this.keyPoints41;
			}

			public void setKeyPoints41(List<KeyPointsItem42> keyPoints41) {
				this.keyPoints41 = keyPoints41;
			}

			public static class KeyPointsItem42 {

				private Float x;

				private Float y;

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}
			}
		}
	}

	@Override
	public RecognizeIndonesiaIdentityCardResponse getInstance(UnmarshallerContext context) {
		return	RecognizeIndonesiaIdentityCardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
