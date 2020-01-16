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
		verifyMaterialResponse.setVerifyToken(_ctx.stringValue("VerifyMaterialResponse.VerifyToken"));
		verifyMaterialResponse.setVerifyStatus(_ctx.integerValue("VerifyMaterialResponse.VerifyStatus"));
		verifyMaterialResponse.setAuthorityComparisionScore(_ctx.floatValue("VerifyMaterialResponse.AuthorityComparisionScore"));
		verifyMaterialResponse.setFaceComparisonScore(_ctx.floatValue("VerifyMaterialResponse.FaceComparisonScore"));
		verifyMaterialResponse.setIdCardFaceComparisonScore(_ctx.floatValue("VerifyMaterialResponse.IdCardFaceComparisonScore"));

		Material material = new Material();
		material.setFaceImageUrl(_ctx.stringValue("VerifyMaterialResponse.Material.FaceImageUrl"));
		material.setIdCardName(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardName"));
		material.setIdCardNumber(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardNumber"));

		IdCardInfo idCardInfo = new IdCardInfo();
		idCardInfo.setNumber(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Number"));
		idCardInfo.setAddress(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Address"));
		idCardInfo.setNationality(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Nationality"));
		idCardInfo.setEndDate(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.EndDate"));
		idCardInfo.setFrontImageUrl(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.FrontImageUrl"));
		idCardInfo.setAuthority(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Authority"));
		idCardInfo.setSex(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Sex"));
		idCardInfo.setName(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Name"));
		idCardInfo.setBirth(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.Birth"));
		idCardInfo.setBackImageUrl(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.BackImageUrl"));
		idCardInfo.setStartDate(_ctx.stringValue("VerifyMaterialResponse.Material.IdCardInfo.StartDate"));
		material.setIdCardInfo(idCardInfo);
		verifyMaterialResponse.setMaterial(material);
	 
	 	return verifyMaterialResponse;
	}
}