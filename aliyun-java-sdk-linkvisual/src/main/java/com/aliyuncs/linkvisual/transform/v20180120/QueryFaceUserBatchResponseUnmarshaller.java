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

import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserBatchResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserBatchResponse.DataItem;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserBatchResponse.DataItem.FacePicListItem;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserBatchResponse.DataItem.FacePicListItem.FeatureDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceUserBatchResponseUnmarshaller {

	public static QueryFaceUserBatchResponse unmarshall(QueryFaceUserBatchResponse queryFaceUserBatchResponse, UnmarshallerContext _ctx) {
		
		queryFaceUserBatchResponse.setRequestId(_ctx.stringValue("QueryFaceUserBatchResponse.RequestId"));
		queryFaceUserBatchResponse.setCode(_ctx.stringValue("QueryFaceUserBatchResponse.Code"));
		queryFaceUserBatchResponse.setErrorMessage(_ctx.stringValue("QueryFaceUserBatchResponse.ErrorMessage"));
		queryFaceUserBatchResponse.setSuccess(_ctx.booleanValue("QueryFaceUserBatchResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaceUserBatchResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setParams(_ctx.stringValue("QueryFaceUserBatchResponse.Data["+ i +"].Params"));
			dataItem.setCustomUserId(_ctx.stringValue("QueryFaceUserBatchResponse.Data["+ i +"].CustomUserId"));
			dataItem.setCreateTime(_ctx.longValue("QueryFaceUserBatchResponse.Data["+ i +"].CreateTime"));
			dataItem.setUserId(_ctx.stringValue("QueryFaceUserBatchResponse.Data["+ i +"].UserId"));
			dataItem.setName(_ctx.stringValue("QueryFaceUserBatchResponse.Data["+ i +"].Name"));
			dataItem.setModifyTime(_ctx.longValue("QueryFaceUserBatchResponse.Data["+ i +"].ModifyTime"));

			List<FacePicListItem> facePicList = new ArrayList<FacePicListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryFaceUserBatchResponse.Data["+ i +"].FacePicList.Length"); j++) {
				FacePicListItem facePicListItem = new FacePicListItem();
				facePicListItem.setFaceUrl(_ctx.stringValue("QueryFaceUserBatchResponse.Data["+ i +"].FacePicList["+ j +"].FaceUrl"));
				facePicListItem.setFaceMd5(_ctx.stringValue("QueryFaceUserBatchResponse.Data["+ i +"].FacePicList["+ j +"].FaceMd5"));

				List<FeatureDTO> featureDTOList = new ArrayList<FeatureDTO>();
				for (int k = 0; k < _ctx.lengthValue("QueryFaceUserBatchResponse.Data["+ i +"].FacePicList["+ j +"].FeatureDTOList.Length"); k++) {
					FeatureDTO featureDTO = new FeatureDTO();
					featureDTO.setAlgorithmName(_ctx.stringValue("QueryFaceUserBatchResponse.Data["+ i +"].FacePicList["+ j +"].FeatureDTOList["+ k +"].AlgorithmName"));
					featureDTO.setAlgorithmVersion(_ctx.stringValue("QueryFaceUserBatchResponse.Data["+ i +"].FacePicList["+ j +"].FeatureDTOList["+ k +"].AlgorithmVersion"));
					featureDTO.setAlgorithmProvider(_ctx.stringValue("QueryFaceUserBatchResponse.Data["+ i +"].FacePicList["+ j +"].FeatureDTOList["+ k +"].AlgorithmProvider"));
					featureDTO.setErrorMessage(_ctx.stringValue("QueryFaceUserBatchResponse.Data["+ i +"].FacePicList["+ j +"].FeatureDTOList["+ k +"].ErrorMessage"));
					featureDTO.setErrorCode(_ctx.stringValue("QueryFaceUserBatchResponse.Data["+ i +"].FacePicList["+ j +"].FeatureDTOList["+ k +"].ErrorCode"));
					featureDTO.setFaceMd5(_ctx.stringValue("QueryFaceUserBatchResponse.Data["+ i +"].FacePicList["+ j +"].FeatureDTOList["+ k +"].FaceMd5"));

					featureDTOList.add(featureDTO);
				}
				facePicListItem.setFeatureDTOList(featureDTOList);

				facePicList.add(facePicListItem);
			}
			dataItem.setFacePicList(facePicList);

			data.add(dataItem);
		}
		queryFaceUserBatchResponse.setData(data);
	 
	 	return queryFaceUserBatchResponse;
	}
}