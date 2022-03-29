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

package com.aliyuncs.cro.model.v20200102;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cro.transform.v20200102.GetVerifyResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVerifyResultResponse extends AcsResponse {

	private String requestId;

	private VerifyResult verifyResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public VerifyResult getVerifyResult() {
		return this.verifyResult;
	}

	public void setVerifyResult(VerifyResult verifyResult) {
		this.verifyResult = verifyResult;
	}

	public static class VerifyResult {

		private Integer status;

		private Integer subStatus;

		private String message;

		private CardInfo cardInfo;

		private FaceInfo faceInfo;

		private AuditInfo auditInfo;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getSubStatus() {
			return this.subStatus;
		}

		public void setSubStatus(Integer subStatus) {
			this.subStatus = subStatus;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public CardInfo getCardInfo() {
			return this.cardInfo;
		}

		public void setCardInfo(CardInfo cardInfo) {
			this.cardInfo = cardInfo;
		}

		public FaceInfo getFaceInfo() {
			return this.faceInfo;
		}

		public void setFaceInfo(FaceInfo faceInfo) {
			this.faceInfo = faceInfo;
		}

		public AuditInfo getAuditInfo() {
			return this.auditInfo;
		}

		public void setAuditInfo(AuditInfo auditInfo) {
			this.auditInfo = auditInfo;
		}

		public static class CardInfo {

			private String cardNumber;

			private String endDate;

			private String backUrl;

			private String beginDate;

			private String frontUrl;

			private String name;

			public String getCardNumber() {
				return this.cardNumber;
			}

			public void setCardNumber(String cardNumber) {
				this.cardNumber = cardNumber;
			}

			public String getEndDate() {
				return this.endDate;
			}

			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}

			public String getBackUrl() {
				return this.backUrl;
			}

			public void setBackUrl(String backUrl) {
				this.backUrl = backUrl;
			}

			public String getBeginDate() {
				return this.beginDate;
			}

			public void setBeginDate(String beginDate) {
				this.beginDate = beginDate;
			}

			public String getFrontUrl() {
				return this.frontUrl;
			}

			public void setFrontUrl(String frontUrl) {
				this.frontUrl = frontUrl;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class FaceInfo {

			private String biometricVideoUrl;

			private String faceImageUrl;

			private String originalFaceUrl;

			public String getBiometricVideoUrl() {
				return this.biometricVideoUrl;
			}

			public void setBiometricVideoUrl(String biometricVideoUrl) {
				this.biometricVideoUrl = biometricVideoUrl;
			}

			public String getFaceImageUrl() {
				return this.faceImageUrl;
			}

			public void setFaceImageUrl(String faceImageUrl) {
				this.faceImageUrl = faceImageUrl;
			}

			public String getOriginalFaceUrl() {
				return this.originalFaceUrl;
			}

			public void setOriginalFaceUrl(String originalFaceUrl) {
				this.originalFaceUrl = originalFaceUrl;
			}
		}

		public static class AuditInfo {

			private Boolean realNameCheckPass;

			private Boolean faceCardComparePass;

			private Boolean faceAuthorityComparePass;

			private Boolean cardAuthorityComparePass;

			private Boolean cardCopyCheckPass;

			private Boolean faceExpressionCheckPass;

			private Boolean idCardOcrCheckPass;

			private Integer authorityComparableCode;

			private Boolean faceCopyCheckPass;

			private String externalFailReason;

			public Boolean getRealNameCheckPass() {
				return this.realNameCheckPass;
			}

			public void setRealNameCheckPass(Boolean realNameCheckPass) {
				this.realNameCheckPass = realNameCheckPass;
			}

			public Boolean getFaceCardComparePass() {
				return this.faceCardComparePass;
			}

			public void setFaceCardComparePass(Boolean faceCardComparePass) {
				this.faceCardComparePass = faceCardComparePass;
			}

			public Boolean getFaceAuthorityComparePass() {
				return this.faceAuthorityComparePass;
			}

			public void setFaceAuthorityComparePass(Boolean faceAuthorityComparePass) {
				this.faceAuthorityComparePass = faceAuthorityComparePass;
			}

			public Boolean getCardAuthorityComparePass() {
				return this.cardAuthorityComparePass;
			}

			public void setCardAuthorityComparePass(Boolean cardAuthorityComparePass) {
				this.cardAuthorityComparePass = cardAuthorityComparePass;
			}

			public Boolean getCardCopyCheckPass() {
				return this.cardCopyCheckPass;
			}

			public void setCardCopyCheckPass(Boolean cardCopyCheckPass) {
				this.cardCopyCheckPass = cardCopyCheckPass;
			}

			public Boolean getFaceExpressionCheckPass() {
				return this.faceExpressionCheckPass;
			}

			public void setFaceExpressionCheckPass(Boolean faceExpressionCheckPass) {
				this.faceExpressionCheckPass = faceExpressionCheckPass;
			}

			public Boolean getIdCardOcrCheckPass() {
				return this.idCardOcrCheckPass;
			}

			public void setIdCardOcrCheckPass(Boolean idCardOcrCheckPass) {
				this.idCardOcrCheckPass = idCardOcrCheckPass;
			}

			public Integer getAuthorityComparableCode() {
				return this.authorityComparableCode;
			}

			public void setAuthorityComparableCode(Integer authorityComparableCode) {
				this.authorityComparableCode = authorityComparableCode;
			}

			public Boolean getFaceCopyCheckPass() {
				return this.faceCopyCheckPass;
			}

			public void setFaceCopyCheckPass(Boolean faceCopyCheckPass) {
				this.faceCopyCheckPass = faceCopyCheckPass;
			}

			public String getExternalFailReason() {
				return this.externalFailReason;
			}

			public void setExternalFailReason(String externalFailReason) {
				this.externalFailReason = externalFailReason;
			}
		}
	}

	@Override
	public GetVerifyResultResponse getInstance(UnmarshallerContext context) {
		return	GetVerifyResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
