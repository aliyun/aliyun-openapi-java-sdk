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
import com.aliyuncs.ocr.transform.v20191230.RecognizeRussiaIdentityCardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeRussiaIdentityCardResponse extends AcsResponse {

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

		private BirthDate birthDate;

		private BirthPlaceFirstLine birthPlaceFirstLine;

		private BirthPlaceSecondLine birthPlaceSecondLine;

		private BirthPlaceThirdLine birthPlaceThirdLine;

		private CardBox cardBox;

		private GivenName givenName;

		private IdNumber idNumber;

		private PaternalName paternalName;

		private PortraitBox portraitBox;

		private Sex sex;

		private SurnameFirstLine surnameFirstLine;

		private SurnameSecondLine surnameSecondLine;

		public BirthDate getBirthDate() {
			return this.birthDate;
		}

		public void setBirthDate(BirthDate birthDate) {
			this.birthDate = birthDate;
		}

		public BirthPlaceFirstLine getBirthPlaceFirstLine() {
			return this.birthPlaceFirstLine;
		}

		public void setBirthPlaceFirstLine(BirthPlaceFirstLine birthPlaceFirstLine) {
			this.birthPlaceFirstLine = birthPlaceFirstLine;
		}

		public BirthPlaceSecondLine getBirthPlaceSecondLine() {
			return this.birthPlaceSecondLine;
		}

		public void setBirthPlaceSecondLine(BirthPlaceSecondLine birthPlaceSecondLine) {
			this.birthPlaceSecondLine = birthPlaceSecondLine;
		}

		public BirthPlaceThirdLine getBirthPlaceThirdLine() {
			return this.birthPlaceThirdLine;
		}

		public void setBirthPlaceThirdLine(BirthPlaceThirdLine birthPlaceThirdLine) {
			this.birthPlaceThirdLine = birthPlaceThirdLine;
		}

		public CardBox getCardBox() {
			return this.cardBox;
		}

		public void setCardBox(CardBox cardBox) {
			this.cardBox = cardBox;
		}

		public GivenName getGivenName() {
			return this.givenName;
		}

		public void setGivenName(GivenName givenName) {
			this.givenName = givenName;
		}

		public IdNumber getIdNumber() {
			return this.idNumber;
		}

		public void setIdNumber(IdNumber idNumber) {
			this.idNumber = idNumber;
		}

		public PaternalName getPaternalName() {
			return this.paternalName;
		}

		public void setPaternalName(PaternalName paternalName) {
			this.paternalName = paternalName;
		}

		public PortraitBox getPortraitBox() {
			return this.portraitBox;
		}

		public void setPortraitBox(PortraitBox portraitBox) {
			this.portraitBox = portraitBox;
		}

		public Sex getSex() {
			return this.sex;
		}

		public void setSex(Sex sex) {
			this.sex = sex;
		}

		public SurnameFirstLine getSurnameFirstLine() {
			return this.surnameFirstLine;
		}

		public void setSurnameFirstLine(SurnameFirstLine surnameFirstLine) {
			this.surnameFirstLine = surnameFirstLine;
		}

		public SurnameSecondLine getSurnameSecondLine() {
			return this.surnameSecondLine;
		}

		public void setSurnameSecondLine(SurnameSecondLine surnameSecondLine) {
			this.surnameSecondLine = surnameSecondLine;
		}

		public static class BirthDate {

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

		public static class BirthPlaceFirstLine {

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

		public static class BirthPlaceSecondLine {

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

		public static class BirthPlaceThirdLine {

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

		public static class CardBox {

			private String text;

			private String score;

			private List<KeyPointsItem8> keyPoints7;

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

		public static class GivenName {

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

		public static class IdNumber {

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

		public static class PaternalName {

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

		public static class PortraitBox {

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

		public static class Sex {

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

		public static class SurnameFirstLine {

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

		public static class SurnameSecondLine {

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
	}

	@Override
	public RecognizeRussiaIdentityCardResponse getInstance(UnmarshallerContext context) {
		return	RecognizeRussiaIdentityCardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
