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
import com.aliyuncs.ocr.transform.v20191230.RecognizeTurkeyIdentityCardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeTurkeyIdentityCardResponse extends AcsResponse {

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

		private AuxiliaryTools auxiliaryTools;

		private BirthDate birthDate;

		private BirthPlace birthPlace;

		private BloodType bloodType;

		private CardBox cardBox;

		private Cilt cilt;

		private DocumentNumber documentNumber;

		private DriveClass driveClass;

		private DueDate dueDate;

		private Duzenleyen duzenleyen;

		private EntryNumber entryNumber;

		private ExpiryDate expiryDate;

		private FatherName fatherName;

		private ForeignersId foreignersId;

		private Gender gender;

		private GivenName givenName;

		private IdNumber idNumber;

		private IssueBy issueBy;

		private IssueCounty issueCounty;

		private IssueDate issueDate;

		private IssuePlace issuePlace;

		private Kutuk kutuk;

		private LicenseNumber licenseNumber;

		private MaritalStatus maritalStatus;

		private MotherName motherName;

		private Name name;

		private Nationality nationality;

		private NeighborhoodVillage neighborhoodVillage;

		private PageNumber pageNumber;

		private PassportNumber passportNumber;

		private PortraitBox portraitBox;

		private Province province;

		private ProvinceOfResidence provinceOfResidence;

		private ReasonOfIssue reasonOfIssue;

		private RegisterNumber registerNumber;

		private Religion religion;

		private Sayfa sayfa;

		private Seri seri;

		private Surname surname;

		private TypeOfResidencePermit typeOfResidencePermit;

		private ValidUntil validUntil;

		private Village village;

		private VolumeNumber volumeNumber;

		private Sex sex;

		public AuxiliaryTools getAuxiliaryTools() {
			return this.auxiliaryTools;
		}

		public void setAuxiliaryTools(AuxiliaryTools auxiliaryTools) {
			this.auxiliaryTools = auxiliaryTools;
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

		public BloodType getBloodType() {
			return this.bloodType;
		}

		public void setBloodType(BloodType bloodType) {
			this.bloodType = bloodType;
		}

		public CardBox getCardBox() {
			return this.cardBox;
		}

		public void setCardBox(CardBox cardBox) {
			this.cardBox = cardBox;
		}

		public Cilt getCilt() {
			return this.cilt;
		}

		public void setCilt(Cilt cilt) {
			this.cilt = cilt;
		}

		public DocumentNumber getDocumentNumber() {
			return this.documentNumber;
		}

		public void setDocumentNumber(DocumentNumber documentNumber) {
			this.documentNumber = documentNumber;
		}

		public DriveClass getDriveClass() {
			return this.driveClass;
		}

		public void setDriveClass(DriveClass driveClass) {
			this.driveClass = driveClass;
		}

		public DueDate getDueDate() {
			return this.dueDate;
		}

		public void setDueDate(DueDate dueDate) {
			this.dueDate = dueDate;
		}

		public Duzenleyen getDuzenleyen() {
			return this.duzenleyen;
		}

		public void setDuzenleyen(Duzenleyen duzenleyen) {
			this.duzenleyen = duzenleyen;
		}

		public EntryNumber getEntryNumber() {
			return this.entryNumber;
		}

		public void setEntryNumber(EntryNumber entryNumber) {
			this.entryNumber = entryNumber;
		}

		public ExpiryDate getExpiryDate() {
			return this.expiryDate;
		}

		public void setExpiryDate(ExpiryDate expiryDate) {
			this.expiryDate = expiryDate;
		}

		public FatherName getFatherName() {
			return this.fatherName;
		}

		public void setFatherName(FatherName fatherName) {
			this.fatherName = fatherName;
		}

		public ForeignersId getForeignersId() {
			return this.foreignersId;
		}

		public void setForeignersId(ForeignersId foreignersId) {
			this.foreignersId = foreignersId;
		}

		public Gender getGender() {
			return this.gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
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

		public IssueBy getIssueBy() {
			return this.issueBy;
		}

		public void setIssueBy(IssueBy issueBy) {
			this.issueBy = issueBy;
		}

		public IssueCounty getIssueCounty() {
			return this.issueCounty;
		}

		public void setIssueCounty(IssueCounty issueCounty) {
			this.issueCounty = issueCounty;
		}

		public IssueDate getIssueDate() {
			return this.issueDate;
		}

		public void setIssueDate(IssueDate issueDate) {
			this.issueDate = issueDate;
		}

		public IssuePlace getIssuePlace() {
			return this.issuePlace;
		}

		public void setIssuePlace(IssuePlace issuePlace) {
			this.issuePlace = issuePlace;
		}

		public Kutuk getKutuk() {
			return this.kutuk;
		}

		public void setKutuk(Kutuk kutuk) {
			this.kutuk = kutuk;
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

		public MotherName getMotherName() {
			return this.motherName;
		}

		public void setMotherName(MotherName motherName) {
			this.motherName = motherName;
		}

		public Name getName() {
			return this.name;
		}

		public void setName(Name name) {
			this.name = name;
		}

		public Nationality getNationality() {
			return this.nationality;
		}

		public void setNationality(Nationality nationality) {
			this.nationality = nationality;
		}

		public NeighborhoodVillage getNeighborhoodVillage() {
			return this.neighborhoodVillage;
		}

		public void setNeighborhoodVillage(NeighborhoodVillage neighborhoodVillage) {
			this.neighborhoodVillage = neighborhoodVillage;
		}

		public PageNumber getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(PageNumber pageNumber) {
			this.pageNumber = pageNumber;
		}

		public PassportNumber getPassportNumber() {
			return this.passportNumber;
		}

		public void setPassportNumber(PassportNumber passportNumber) {
			this.passportNumber = passportNumber;
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

		public ProvinceOfResidence getProvinceOfResidence() {
			return this.provinceOfResidence;
		}

		public void setProvinceOfResidence(ProvinceOfResidence provinceOfResidence) {
			this.provinceOfResidence = provinceOfResidence;
		}

		public ReasonOfIssue getReasonOfIssue() {
			return this.reasonOfIssue;
		}

		public void setReasonOfIssue(ReasonOfIssue reasonOfIssue) {
			this.reasonOfIssue = reasonOfIssue;
		}

		public RegisterNumber getRegisterNumber() {
			return this.registerNumber;
		}

		public void setRegisterNumber(RegisterNumber registerNumber) {
			this.registerNumber = registerNumber;
		}

		public Religion getReligion() {
			return this.religion;
		}

		public void setReligion(Religion religion) {
			this.religion = religion;
		}

		public Sayfa getSayfa() {
			return this.sayfa;
		}

		public void setSayfa(Sayfa sayfa) {
			this.sayfa = sayfa;
		}

		public Seri getSeri() {
			return this.seri;
		}

		public void setSeri(Seri seri) {
			this.seri = seri;
		}

		public Surname getSurname() {
			return this.surname;
		}

		public void setSurname(Surname surname) {
			this.surname = surname;
		}

		public TypeOfResidencePermit getTypeOfResidencePermit() {
			return this.typeOfResidencePermit;
		}

		public void setTypeOfResidencePermit(TypeOfResidencePermit typeOfResidencePermit) {
			this.typeOfResidencePermit = typeOfResidencePermit;
		}

		public ValidUntil getValidUntil() {
			return this.validUntil;
		}

		public void setValidUntil(ValidUntil validUntil) {
			this.validUntil = validUntil;
		}

		public Village getVillage() {
			return this.village;
		}

		public void setVillage(Village village) {
			this.village = village;
		}

		public VolumeNumber getVolumeNumber() {
			return this.volumeNumber;
		}

		public void setVolumeNumber(VolumeNumber volumeNumber) {
			this.volumeNumber = volumeNumber;
		}

		public Sex getSex() {
			return this.sex;
		}

		public void setSex(Sex sex) {
			this.sex = sex;
		}

		public static class AuxiliaryTools {

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

		public static class BirthDate {

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

		public static class BirthPlace {

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

		public static class BloodType {

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

		public static class Cilt {

			private String text;

			private Float score;

			private List<KeyPointsItem10> keyPoints9;

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

		public static class DocumentNumber {

			private String text;

			private Float score;

			private List<KeyPointsItem12> keyPoints11;

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

		public static class DriveClass {

			private String text;

			private Float score;

			private List<KeyPointsItem14> keyPoints13;

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

		public static class DueDate {

			private String text;

			private Float score;

			private List<KeyPointsItem16> keyPoints15;

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

		public static class Duzenleyen {

			private String text;

			private Float score;

			private List<KeyPointsItem18> keyPoints17;

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

		public static class EntryNumber {

			private String text;

			private Float score;

			private List<KeyPointsItem20> keyPoints19;

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

		public static class ExpiryDate {

			private String text;

			private Float score;

			private List<KeyPointsItem22> keyPoints21;

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

		public static class FatherName {

			private String text;

			private Float score;

			private List<KeyPointsItem24> keyPoints23;

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

		public static class ForeignersId {

			private String text;

			private Float score;

			private List<KeyPointsItem26> keyPoints25;

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

		public static class Gender {

			private String text;

			private Float score;

			private List<KeyPointsItem28> keyPoints27;

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

		public static class GivenName {

			private String text;

			private Float score;

			private List<KeyPointsItem30> keyPoints29;

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

		public static class IdNumber {

			private String text;

			private Float score;

			private List<KeyPointsItem32> keyPoints31;

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

		public static class IssueBy {

			private String text;

			private Float score;

			private List<KeyPointsItem34> keyPoints33;

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

		public static class IssueCounty {

			private String text;

			private Float score;

			private List<KeyPointsItem36> keyPoints35;

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

		public static class IssueDate {

			private String text;

			private Float score;

			private List<KeyPointsItem38> keyPoints37;

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

		public static class IssuePlace {

			private String text;

			private Float score;

			private List<KeyPointsItem40> keyPoints39;

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

		public static class Kutuk {

			private String text;

			private Float score;

			private List<KeyPointsItem42> keyPoints41;

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

		public static class LicenseNumber {

			private String text;

			private Float score;

			private List<KeyPointsItem44> keyPoints43;

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

			public List<KeyPointsItem44> getKeyPoints43() {
				return this.keyPoints43;
			}

			public void setKeyPoints43(List<KeyPointsItem44> keyPoints43) {
				this.keyPoints43 = keyPoints43;
			}

			public static class KeyPointsItem44 {

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

			private Float score;

			private List<KeyPointsItem46> keyPoints45;

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

			public List<KeyPointsItem46> getKeyPoints45() {
				return this.keyPoints45;
			}

			public void setKeyPoints45(List<KeyPointsItem46> keyPoints45) {
				this.keyPoints45 = keyPoints45;
			}

			public static class KeyPointsItem46 {

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

		public static class MotherName {

			private String text;

			private Float score;

			private List<KeyPointsItem48> keyPoints47;

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

			public List<KeyPointsItem48> getKeyPoints47() {
				return this.keyPoints47;
			}

			public void setKeyPoints47(List<KeyPointsItem48> keyPoints47) {
				this.keyPoints47 = keyPoints47;
			}

			public static class KeyPointsItem48 {

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

		public static class Name {

			private String text;

			private Float score;

			private List<KeyPointsItem50> keyPoints49;

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

			public List<KeyPointsItem50> getKeyPoints49() {
				return this.keyPoints49;
			}

			public void setKeyPoints49(List<KeyPointsItem50> keyPoints49) {
				this.keyPoints49 = keyPoints49;
			}

			public static class KeyPointsItem50 {

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

			private Float score;

			private List<KeyPointsItem52> keyPoints51;

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

			public List<KeyPointsItem52> getKeyPoints51() {
				return this.keyPoints51;
			}

			public void setKeyPoints51(List<KeyPointsItem52> keyPoints51) {
				this.keyPoints51 = keyPoints51;
			}

			public static class KeyPointsItem52 {

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

		public static class NeighborhoodVillage {

			private String text;

			private Float score;

			private List<KeyPointsItem54> keyPoints53;

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

			public List<KeyPointsItem54> getKeyPoints53() {
				return this.keyPoints53;
			}

			public void setKeyPoints53(List<KeyPointsItem54> keyPoints53) {
				this.keyPoints53 = keyPoints53;
			}

			public static class KeyPointsItem54 {

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

		public static class PageNumber {

			private String text;

			private Float score;

			private List<KeyPointsItem56> keyPoints55;

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

			public List<KeyPointsItem56> getKeyPoints55() {
				return this.keyPoints55;
			}

			public void setKeyPoints55(List<KeyPointsItem56> keyPoints55) {
				this.keyPoints55 = keyPoints55;
			}

			public static class KeyPointsItem56 {

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

		public static class PassportNumber {

			private String text;

			private Float score;

			private List<KeyPointsItem58> keyPoints57;

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

			public List<KeyPointsItem58> getKeyPoints57() {
				return this.keyPoints57;
			}

			public void setKeyPoints57(List<KeyPointsItem58> keyPoints57) {
				this.keyPoints57 = keyPoints57;
			}

			public static class KeyPointsItem58 {

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

			private Float score;

			private List<KeyPointsItem60> keyPoints59;

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

			public List<KeyPointsItem60> getKeyPoints59() {
				return this.keyPoints59;
			}

			public void setKeyPoints59(List<KeyPointsItem60> keyPoints59) {
				this.keyPoints59 = keyPoints59;
			}

			public static class KeyPointsItem60 {

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

			private Float score;

			private List<KeyPointsItem62> keyPoints61;

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

			public List<KeyPointsItem62> getKeyPoints61() {
				return this.keyPoints61;
			}

			public void setKeyPoints61(List<KeyPointsItem62> keyPoints61) {
				this.keyPoints61 = keyPoints61;
			}

			public static class KeyPointsItem62 {

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

		public static class ProvinceOfResidence {

			private String text;

			private Float score;

			private List<KeyPointsItem64> keyPoints63;

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

			public List<KeyPointsItem64> getKeyPoints63() {
				return this.keyPoints63;
			}

			public void setKeyPoints63(List<KeyPointsItem64> keyPoints63) {
				this.keyPoints63 = keyPoints63;
			}

			public static class KeyPointsItem64 {

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

		public static class ReasonOfIssue {

			private String text;

			private Float score;

			private List<KeyPointsItem66> keyPoints65;

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

			public List<KeyPointsItem66> getKeyPoints65() {
				return this.keyPoints65;
			}

			public void setKeyPoints65(List<KeyPointsItem66> keyPoints65) {
				this.keyPoints65 = keyPoints65;
			}

			public static class KeyPointsItem66 {

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

		public static class RegisterNumber {

			private String text;

			private Float score;

			private List<KeyPointsItem68> keyPoints67;

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

			public List<KeyPointsItem68> getKeyPoints67() {
				return this.keyPoints67;
			}

			public void setKeyPoints67(List<KeyPointsItem68> keyPoints67) {
				this.keyPoints67 = keyPoints67;
			}

			public static class KeyPointsItem68 {

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

			private Float score;

			private List<KeyPointsItem70> keyPoints69;

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

			public List<KeyPointsItem70> getKeyPoints69() {
				return this.keyPoints69;
			}

			public void setKeyPoints69(List<KeyPointsItem70> keyPoints69) {
				this.keyPoints69 = keyPoints69;
			}

			public static class KeyPointsItem70 {

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

		public static class Sayfa {

			private String text;

			private Float score;

			private List<KeyPointsItem72> keyPoints71;

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

			public List<KeyPointsItem72> getKeyPoints71() {
				return this.keyPoints71;
			}

			public void setKeyPoints71(List<KeyPointsItem72> keyPoints71) {
				this.keyPoints71 = keyPoints71;
			}

			public static class KeyPointsItem72 {

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

		public static class Seri {

			private String text;

			private Float score;

			private List<KeyPointsItem74> keyPoints73;

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

			public List<KeyPointsItem74> getKeyPoints73() {
				return this.keyPoints73;
			}

			public void setKeyPoints73(List<KeyPointsItem74> keyPoints73) {
				this.keyPoints73 = keyPoints73;
			}

			public static class KeyPointsItem74 {

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

		public static class Surname {

			private String text;

			private Float score;

			private List<KeyPointsItem76> keyPoints75;

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

			public List<KeyPointsItem76> getKeyPoints75() {
				return this.keyPoints75;
			}

			public void setKeyPoints75(List<KeyPointsItem76> keyPoints75) {
				this.keyPoints75 = keyPoints75;
			}

			public static class KeyPointsItem76 {

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

		public static class TypeOfResidencePermit {

			private String text;

			private Float score;

			private List<KeyPointsItem78> keyPoints77;

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

			public List<KeyPointsItem78> getKeyPoints77() {
				return this.keyPoints77;
			}

			public void setKeyPoints77(List<KeyPointsItem78> keyPoints77) {
				this.keyPoints77 = keyPoints77;
			}

			public static class KeyPointsItem78 {

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

		public static class ValidUntil {

			private String text;

			private Float score;

			private List<KeyPointsItem80> keyPoints79;

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

			public List<KeyPointsItem80> getKeyPoints79() {
				return this.keyPoints79;
			}

			public void setKeyPoints79(List<KeyPointsItem80> keyPoints79) {
				this.keyPoints79 = keyPoints79;
			}

			public static class KeyPointsItem80 {

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

		public static class Village {

			private String text;

			private Float score;

			private List<KeyPointsItem82> keyPoints81;

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

			public List<KeyPointsItem82> getKeyPoints81() {
				return this.keyPoints81;
			}

			public void setKeyPoints81(List<KeyPointsItem82> keyPoints81) {
				this.keyPoints81 = keyPoints81;
			}

			public static class KeyPointsItem82 {

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

		public static class VolumeNumber {

			private String text;

			private Float score;

			private List<KeyPointsItem84> keyPoints83;

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

			public List<KeyPointsItem84> getKeyPoints83() {
				return this.keyPoints83;
			}

			public void setKeyPoints83(List<KeyPointsItem84> keyPoints83) {
				this.keyPoints83 = keyPoints83;
			}

			public static class KeyPointsItem84 {

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

			private Float score;

			private List<KeyPointsItem86> keyPoints85;

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

			public List<KeyPointsItem86> getKeyPoints85() {
				return this.keyPoints85;
			}

			public void setKeyPoints85(List<KeyPointsItem86> keyPoints85) {
				this.keyPoints85 = keyPoints85;
			}

			public static class KeyPointsItem86 {

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
	public RecognizeTurkeyIdentityCardResponse getInstance(UnmarshallerContext context) {
		return	RecognizeTurkeyIdentityCardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
