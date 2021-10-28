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

package com.aliyuncs.cloudauth.transform.v20201112;

import com.aliyuncs.cloudauth.model.v20201112.VerifyMaterialResponse;
import com.aliyuncs.cloudauth.model.v20201112.VerifyMaterialResponse.ResultObject;
import com.aliyuncs.cloudauth.model.v20201112.VerifyMaterialResponse.ResultObject.Material;
import com.aliyuncs.cloudauth.model.v20201112.VerifyMaterialResponse.ResultObject.Material.IdCardInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyMaterialResponseUnmarshaller {

	public static VerifyMaterialResponse unmarshall(VerifyMaterialResponse verifyMaterialResponse, UnmarshallerContext _ctx) {
		
		verifyMaterialResponse.setRequestId(_ctx.stringValue("VerifyMaterialResponse.RequestId"));
		verifyMaterialResponse.setCode(_ctx.stringValue("VerifyMaterialResponse.Code"));
		verifyMaterialResponse.setMessage(_ctx.stringValue("VerifyMaterialResponse.Message"));
		verifyMaterialResponse.setSuccess(_ctx.booleanValue("VerifyMaterialResponse.Success"));

		ResultObject resultObject = new ResultObject();
		resultObject.setVerifyToken(_ctx.stringValue("VerifyMaterialResponse.ResultObject.VerifyToken"));
		resultObject.setVerifyStatus(_ctx.integerValue("VerifyMaterialResponse.ResultObject.VerifyStatus"));
		resultObject.setAuthorityComparisionScore(_ctx.floatValue("VerifyMaterialResponse.ResultObject.AuthorityComparisionScore"));
		resultObject.setIdCardFaceComparisonScore(_ctx.floatValue("VerifyMaterialResponse.ResultObject.IdCardFaceComparisonScore"));

		Material material = new Material();
		material.setFaceImageUrl(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.FaceImageUrl"));
		material.setIdCardName(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardName"));
		material.setIdCardNumber(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardNumber"));
		material.setFaceQuality(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.FaceQuality"));
		material.setFaceGlobalUrl(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.FaceGlobalUrl"));
		material.setFaceMask(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.FaceMask"));

		IdCardInfo idCardInfo = new IdCardInfo();
		idCardInfo.setNumber(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardInfo.Number"));
		idCardInfo.setAddress(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardInfo.Address"));
		idCardInfo.setNationality(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardInfo.Nationality"));
		idCardInfo.setEndDate(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardInfo.EndDate"));
		idCardInfo.setFrontImageUrl(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardInfo.FrontImageUrl"));
		idCardInfo.setAuthority(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardInfo.Authority"));
		idCardInfo.setSex(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardInfo.Sex"));
		idCardInfo.setName(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardInfo.Name"));
		idCardInfo.setBirth(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardInfo.Birth"));
		idCardInfo.setBackImageUrl(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardInfo.BackImageUrl"));
		idCardInfo.setStartDate(_ctx.stringValue("VerifyMaterialResponse.ResultObject.Material.IdCardInfo.StartDate"));
		material.setIdCardInfo(idCardInfo);
		resultObject.setMaterial(material);
		verifyMaterialResponse.setResultObject(resultObject);
	 
	 	return verifyMaterialResponse;
	}
}