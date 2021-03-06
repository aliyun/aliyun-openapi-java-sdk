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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.GetFaceModelResultResponse;
import com.aliyuncs.vcs.model.v20200515.GetFaceModelResultResponse.Data;
import com.aliyuncs.vcs.model.v20200515.GetFaceModelResultResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFaceModelResultResponseUnmarshaller {

	public static GetFaceModelResultResponse unmarshall(GetFaceModelResultResponse getFaceModelResultResponse, UnmarshallerContext _ctx) {
		
		getFaceModelResultResponse.setRequestId(_ctx.stringValue("GetFaceModelResultResponse.RequestId"));
		getFaceModelResultResponse.setMessage(_ctx.stringValue("GetFaceModelResultResponse.Message"));
		getFaceModelResultResponse.setCode(_ctx.stringValue("GetFaceModelResultResponse.Code"));

		Data data = new Data();

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFaceModelResultResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setRightBottomY(_ctx.floatValue("GetFaceModelResultResponse.Data.Records["+ i +"].RightBottomY"));
			recordsItem.setHairColorReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].HairColorReliability"));
			recordsItem.setHairColor(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].HairColor"));
			recordsItem.setFaceStyle(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].FaceStyle"));
			recordsItem.setGlassStyleReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].GlassStyleReliability"));
			recordsItem.setMustacheStyleReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].MustacheStyleReliability"));
			recordsItem.setRespiratorColorReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].RespiratorColorReliability"));
			recordsItem.setRightBottomX(_ctx.floatValue("GetFaceModelResultResponse.Data.Records["+ i +"].RightBottomX"));
			recordsItem.setAgeUpLimit(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].AgeUpLimit"));
			recordsItem.setAgeUpLimitReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].AgeUpLimitReliability"));
			recordsItem.setHairStyle(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].HairStyle"));
			recordsItem.setAgeLowerLimit(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].AgeLowerLimit"));
			recordsItem.setLeftTopY(_ctx.floatValue("GetFaceModelResultResponse.Data.Records["+ i +"].LeftTopY"));
			recordsItem.setSkinColorReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].SkinColorReliability"));
			recordsItem.setCapColor(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].CapColor"));
			recordsItem.setFaceStyleReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].FaceStyleReliability"));
			recordsItem.setCapStyleReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].CapStyleReliability"));
			recordsItem.setGenderCodeReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].GenderCodeReliability"));
			recordsItem.setHairStyleReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].HairStyleReliability"));
			recordsItem.setGlassColorReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].GlassColorReliability"));
			recordsItem.setEthicCode(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].EthicCode"));
			recordsItem.setRespiratorColor(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].RespiratorColor"));
			recordsItem.setMustacheStyle(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].MustacheStyle"));
			recordsItem.setGlassColor(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].GlassColor"));
			recordsItem.setGlassStyle(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].GlassStyle"));
			recordsItem.setSkinColor(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].SkinColor"));
			recordsItem.setCapColorReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].CapColorReliability"));
			recordsItem.setCapStyle(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].CapStyle"));
			recordsItem.setGenderCode(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].GenderCode"));
			recordsItem.setLeftTopX(_ctx.floatValue("GetFaceModelResultResponse.Data.Records["+ i +"].LeftTopX"));
			recordsItem.setAgeLowerLimitReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].AgeLowerLimitReliability"));
			recordsItem.setEthicCodeReliability(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].EthicCodeReliability"));

			List<Float> featureData = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("GetFaceModelResultResponse.Data.Records["+ i +"].FeatureData.Length"); j++) {
				featureData.add(_ctx.floatValue("GetFaceModelResultResponse.Data.Records["+ i +"].FeatureData["+ j +"]"));
			}
			recordsItem.setFeatureData(featureData);

			records.add(recordsItem);
		}
		data.setRecords(records);
		getFaceModelResultResponse.setData(data);
	 
	 	return getFaceModelResultResponse;
	}
}