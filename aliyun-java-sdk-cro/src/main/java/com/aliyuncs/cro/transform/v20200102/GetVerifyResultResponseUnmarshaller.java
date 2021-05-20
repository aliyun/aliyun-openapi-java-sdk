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

package com.aliyuncs.cro.transform.v20200102;

import com.aliyuncs.cro.model.v20200102.GetVerifyResultResponse;
import com.aliyuncs.cro.model.v20200102.GetVerifyResultResponse.VerifyResult;
import com.aliyuncs.cro.model.v20200102.GetVerifyResultResponse.VerifyResult.AuditInfo;
import com.aliyuncs.cro.model.v20200102.GetVerifyResultResponse.VerifyResult.CardInfo;
import com.aliyuncs.cro.model.v20200102.GetVerifyResultResponse.VerifyResult.FaceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVerifyResultResponseUnmarshaller {

	public static GetVerifyResultResponse unmarshall(GetVerifyResultResponse getVerifyResultResponse, UnmarshallerContext _ctx) {
		
		getVerifyResultResponse.setRequestId(_ctx.stringValue("GetVerifyResultResponse.RequestId"));

		VerifyResult verifyResult = new VerifyResult();
		verifyResult.setStatus(_ctx.integerValue("GetVerifyResultResponse.VerifyResult.Status"));

		CardInfo cardInfo = new CardInfo();
		cardInfo.setName(_ctx.stringValue("GetVerifyResultResponse.VerifyResult.CardInfo.Name"));
		cardInfo.setCardNumber(_ctx.stringValue("GetVerifyResultResponse.VerifyResult.CardInfo.CardNumber"));
		cardInfo.setFrontUrl(_ctx.stringValue("GetVerifyResultResponse.VerifyResult.CardInfo.FrontUrl"));
		cardInfo.setBackUrl(_ctx.stringValue("GetVerifyResultResponse.VerifyResult.CardInfo.BackUrl"));
		cardInfo.setBeginDate(_ctx.stringValue("GetVerifyResultResponse.VerifyResult.CardInfo.BeginDate"));
		cardInfo.setEndDate(_ctx.stringValue("GetVerifyResultResponse.VerifyResult.CardInfo.EndDate"));
		verifyResult.setCardInfo(cardInfo);

		FaceInfo faceInfo = new FaceInfo();
		faceInfo.setFaceImageUrl(_ctx.stringValue("GetVerifyResultResponse.VerifyResult.FaceInfo.FaceImageUrl"));
		faceInfo.setOriginalFaceUrl(_ctx.stringValue("GetVerifyResultResponse.VerifyResult.FaceInfo.OriginalFaceUrl"));
		faceInfo.setBiometricVideoUrl(_ctx.stringValue("GetVerifyResultResponse.VerifyResult.FaceInfo.BiometricVideoUrl"));
		verifyResult.setFaceInfo(faceInfo);

		AuditInfo auditInfo = new AuditInfo();
		auditInfo.setExternalFailReason(_ctx.stringValue("GetVerifyResultResponse.VerifyResult.AuditInfo.ExternalFailReason"));
		auditInfo.setAuthorityComparableCode(_ctx.integerValue("GetVerifyResultResponse.VerifyResult.AuditInfo.AuthorityComparableCode"));
		auditInfo.setFaceAuthorityComparePass(_ctx.booleanValue("GetVerifyResultResponse.VerifyResult.AuditInfo.FaceAuthorityComparePass"));
		auditInfo.setCardAuthorityComparePass(_ctx.booleanValue("GetVerifyResultResponse.VerifyResult.AuditInfo.CardAuthorityComparePass"));
		auditInfo.setFaceCardComparePass(_ctx.booleanValue("GetVerifyResultResponse.VerifyResult.AuditInfo.FaceCardComparePass"));
		auditInfo.setFaceCopyCheckPass(_ctx.booleanValue("GetVerifyResultResponse.VerifyResult.AuditInfo.FaceCopyCheckPass"));
		auditInfo.setCardCopyCheckPass(_ctx.booleanValue("GetVerifyResultResponse.VerifyResult.AuditInfo.CardCopyCheckPass"));
		auditInfo.setRealNameCheckPass(_ctx.booleanValue("GetVerifyResultResponse.VerifyResult.AuditInfo.RealNameCheckPass"));
		auditInfo.setIdCardOcrCheckPass(_ctx.booleanValue("GetVerifyResultResponse.VerifyResult.AuditInfo.IdCardOcrCheckPass"));
		auditInfo.setFaceExpressionCheckPass(_ctx.booleanValue("GetVerifyResultResponse.VerifyResult.AuditInfo.FaceExpressionCheckPass"));
		verifyResult.setAuditInfo(auditInfo);
		getVerifyResultResponse.setVerifyResult(verifyResult);
	 
	 	return getVerifyResultResponse;
	}
}