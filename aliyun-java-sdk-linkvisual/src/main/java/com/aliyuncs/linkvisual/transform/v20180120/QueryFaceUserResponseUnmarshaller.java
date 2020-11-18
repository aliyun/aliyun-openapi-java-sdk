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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserResponse.Data.FacePicListItem;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserResponse.Data.FacePicListItem.FeatureDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceUserResponseUnmarshaller {

	public static QueryFaceUserResponse unmarshall(QueryFaceUserResponse queryFaceUserResponse, UnmarshallerContext _ctx) {
		
		queryFaceUserResponse.setRequestId(_ctx.stringValue("QueryFaceUserResponse.RequestId"));
		queryFaceUserResponse.setSuccess(_ctx.booleanValue("QueryFaceUserResponse.Success"));
		queryFaceUserResponse.setErrorMessage(_ctx.stringValue("QueryFaceUserResponse.ErrorMessage"));
		queryFaceUserResponse.setCode(_ctx.stringValue("QueryFaceUserResponse.Code"));

		Data data = new Data();
		data.setUserId(_ctx.stringValue("QueryFaceUserResponse.Data.UserId"));
		data.setCustomUserId(_ctx.stringValue("QueryFaceUserResponse.Data.CustomUserId"));
		data.setName(_ctx.stringValue("QueryFaceUserResponse.Data.Name"));
		data.setParams(_ctx.stringValue("QueryFaceUserResponse.Data.Params"));

		List<FacePicListItem> facePicList = new ArrayList<FacePicListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaceUserResponse.Data.FacePicList.Length"); i++) {
			FacePicListItem facePicListItem = new FacePicListItem();
			facePicListItem.setFaceMd5(_ctx.stringValue("QueryFaceUserResponse.Data.FacePicList["+ i +"].FaceMd5"));
			facePicListItem.setFaceUrl(_ctx.stringValue("QueryFaceUserResponse.Data.FacePicList["+ i +"].FaceUrl"));

			List<FeatureDTO> featureDTOList = new ArrayList<FeatureDTO>();
			for (int j = 0; j < _ctx.lengthValue("QueryFaceUserResponse.Data.FacePicList["+ i +"].FeatureDTOList.Length"); j++) {
				FeatureDTO featureDTO = new FeatureDTO();
				featureDTO.setAlgorithmName(_ctx.stringValue("QueryFaceUserResponse.Data.FacePicList["+ i +"].FeatureDTOList["+ j +"].AlgorithmName"));
				featureDTO.setAlgorithmProvider(_ctx.stringValue("QueryFaceUserResponse.Data.FacePicList["+ i +"].FeatureDTOList["+ j +"].AlgorithmProvider"));
				featureDTO.setAlgorithmVersion(_ctx.stringValue("QueryFaceUserResponse.Data.FacePicList["+ i +"].FeatureDTOList["+ j +"].AlgorithmVersion"));
				featureDTO.setFaceMd5(_ctx.stringValue("QueryFaceUserResponse.Data.FacePicList["+ i +"].FeatureDTOList["+ j +"].FaceMd5"));
				featureDTO.setErrorCode(_ctx.stringValue("QueryFaceUserResponse.Data.FacePicList["+ i +"].FeatureDTOList["+ j +"].ErrorCode"));
				featureDTO.setErrorMessage(_ctx.stringValue("QueryFaceUserResponse.Data.FacePicList["+ i +"].FeatureDTOList["+ j +"].ErrorMessage"));

				featureDTOList.add(featureDTO);
			}
			facePicListItem.setFeatureDTOList(featureDTOList);

			facePicList.add(facePicListItem);
		}
		data.setFacePicList(facePicList);
		queryFaceUserResponse.setData(data);
	 
	 	return queryFaceUserResponse;
	}
}