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
		getFaceModelResultResponse.setCode(_ctx.stringValue("GetFaceModelResultResponse.Code"));
		getFaceModelResultResponse.setMessage(_ctx.stringValue("GetFaceModelResultResponse.Message"));

		Data data = new Data();

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFaceModelResultResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setMustacheStyle(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].MustacheStyle"));
			recordsItem.setFaceStyle(_ctx.stringValue("GetFaceModelResultResponse.Data.Records["+ i +"].FaceStyle"));
			recordsItem.setCapStyle(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].CapStyle"));
			recordsItem.setSkinColor(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].SkinColor"));
			recordsItem.setRightBottomY(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].RightBottomY"));
			recordsItem.setRightBottomX(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].RightBottomX"));
			recordsItem.setHairStyle(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].HairStyle"));
			recordsItem.setGenderCode(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].GenderCode"));
			recordsItem.setRespiratorColor(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].RespiratorColor"));
			recordsItem.setEthicCode(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].EthicCode"));
			recordsItem.setAgeLowerLimit(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].AgeLowerLimit"));
			recordsItem.setLeftTopY(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].LeftTopY"));
			recordsItem.setLeftTopX(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].LeftTopX"));
			recordsItem.setHairColor(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].HairColor"));
			recordsItem.setAgeUpLimit(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].AgeUpLimit"));
			recordsItem.setGlassStyle(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].GlassStyle"));
			recordsItem.setGlassColor(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].GlassColor"));
			recordsItem.setCapColor(_ctx.integerValue("GetFaceModelResultResponse.Data.Records["+ i +"].CapColor"));

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