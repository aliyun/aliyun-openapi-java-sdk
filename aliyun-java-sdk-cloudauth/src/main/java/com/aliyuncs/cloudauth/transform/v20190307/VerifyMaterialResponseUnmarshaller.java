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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.VerifyMaterialResponse;
import com.aliyuncs.cloudauth.model.v20190307.VerifyMaterialResponse.Material;
import com.aliyuncs.cloudauth.model.v20190307.VerifyMaterialResponse.Material.IdCardInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyMaterialResponseUnmarshaller {

	public static VerifyMaterialResponse unmarshall(VerifyMaterialResponse verifyMaterialResponse, UnmarshallerContext _ctx) {
		
		verifyMaterialResponse.setRequestId(_ctx.stringValue("VerifyMaterialResponse.RequestId"));
		verifyMaterialResponse.setAuthorityComparisionScore(_ctx.floatValue("VerifyMaterialResponse.AuthorityComparisionScore"));
		verifyMaterialResponse.setVerifyStatus(_ctx.integerValue("VerifyMaterialResponse.VerifyStatus"));
		verifyMaterialResponse.setVerifyToken(_ctx.stringValue("VerifyMaterialResponse.VerifyToken"));
		verifyMaterialResponse.setIdCardFaceComparisonScore(_ctx.floatValue("VerifyMaterialResponse.IdCardFaceComparisonScore"));

		Material material = new Material();
		material.setIdCardNumber(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardNumber"));
		material.setFaceGlobalUrl(_ctx.stringValue("VerifyMaterialResponse.Material.FaceGlobalUrl"));
		material.setFaceImageUrl(_ctx.stringValue("VerifyMaterialResponse.Material.FaceImageUrl"));
		material.setFaceMask(_ctx.stringValue("VerifyMaterialResponse.Material.FaceMask"));
		material.setIdCardName(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardName"));
		material.setFaceQuality(_ctx.stringValue("VerifyMaterialResponse.Material.FaceQuality"));

		IdCardInfo idCardInfo = new IdCardInfo();
		idCardInfo.setSex(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Sex"));
		idCardInfo.setEndDate(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.EndDate"));
		idCardInfo.setAuthority(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Authority"));
		idCardInfo.setAddress(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Address"));
		idCardInfo.setNumber(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Number"));
		idCardInfo.setStartDate(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.StartDate"));
		idCardInfo.setBackImageUrl(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.BackImageUrl"));
		idCardInfo.setNationality(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Nationality"));
		idCardInfo.setBirth(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Birth"));
		idCardInfo.setName(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Name"));
		idCardInfo.setFrontImageUrl(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.FrontImageUrl"));
		material.setIdCardInfo(idCardInfo);
		verifyMaterialResponse.setMaterial(material);
	 
	 	return verifyMaterialResponse;
	}
}