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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20190307.DescribeVerifyResultResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeVerifyResultResponse.Material;
import com.aliyuncs.cloudauth.model.v20190307.DescribeVerifyResultResponse.Material.IdCardInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVerifyResultResponseUnmarshaller {

	public static DescribeVerifyResultResponse unmarshall(DescribeVerifyResultResponse describeVerifyResultResponse, UnmarshallerContext _ctx) {
		
		describeVerifyResultResponse.setRequestId(_ctx.stringValue("DescribeVerifyResultResponse.RequestId"));
		describeVerifyResultResponse.setVerifyStatus(_ctx.integerValue("DescribeVerifyResultResponse.VerifyStatus"));
		describeVerifyResultResponse.setAuthorityComparisionScore(_ctx.floatValue("DescribeVerifyResultResponse.AuthorityComparisionScore"));
		describeVerifyResultResponse.setFaceComparisonScore(_ctx.floatValue("DescribeVerifyResultResponse.FaceComparisonScore"));
		describeVerifyResultResponse.setIdCardFaceComparisonScore(_ctx.floatValue("DescribeVerifyResultResponse.IdCardFaceComparisonScore"));

		Material material = new Material();
		material.setFaceImageUrl(_ctx.stringValue("DescribeVerifyResultResponse.Material.FaceImageUrl"));
		material.setIdCardName(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardName"));
		material.setIdCardNumber(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardNumber"));

		List<String> videoUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVerifyResultResponse.Material.VideoUrls.Length"); i++) {
			videoUrls.add(_ctx.stringValue("DescribeVerifyResultResponse.Material.VideoUrls["+ i +"]"));
		}
		material.setVideoUrls(videoUrls);

		IdCardInfo idCardInfo = new IdCardInfo();
		idCardInfo.setNumber(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardInfo.Number"));
		idCardInfo.setAddress(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardInfo.Address"));
		idCardInfo.setNationality(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardInfo.Nationality"));
		idCardInfo.setEndDate(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardInfo.EndDate"));
		idCardInfo.setFrontImageUrl(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardInfo.FrontImageUrl"));
		idCardInfo.setAuthority(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardInfo.Authority"));
		idCardInfo.setSex(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardInfo.Sex"));
		idCardInfo.setName(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardInfo.Name"));
		idCardInfo.setBirth(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardInfo.Birth"));
		idCardInfo.setBackImageUrl(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardInfo.BackImageUrl"));
		idCardInfo.setStartDate(_ctx.stringValue("DescribeVerifyResultResponse.Material.IdCardInfo.StartDate"));
		material.setIdCardInfo(idCardInfo);
		describeVerifyResultResponse.setMaterial(material);
	 
	 	return describeVerifyResultResponse;
	}
}