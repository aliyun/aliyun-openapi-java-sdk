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

import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserByNameResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserByNameResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserByNameResponse.Data.PageData;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserByNameResponse.Data.PageData.FacePicListItem;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceUserByNameResponse.Data.PageData.FacePicListItem.FeatureDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceUserByNameResponseUnmarshaller {

	public static QueryFaceUserByNameResponse unmarshall(QueryFaceUserByNameResponse queryFaceUserByNameResponse, UnmarshallerContext _ctx) {
		
		queryFaceUserByNameResponse.setRequestId(_ctx.stringValue("QueryFaceUserByNameResponse.RequestId"));
		queryFaceUserByNameResponse.setCode(_ctx.stringValue("QueryFaceUserByNameResponse.Code"));
		queryFaceUserByNameResponse.setErrorMessage(_ctx.stringValue("QueryFaceUserByNameResponse.ErrorMessage"));
		queryFaceUserByNameResponse.setSuccess(_ctx.booleanValue("QueryFaceUserByNameResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("QueryFaceUserByNameResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("QueryFaceUserByNameResponse.Data.Total"));
		data.setPage(_ctx.integerValue("QueryFaceUserByNameResponse.Data.Page"));

		List<PageData> list = new ArrayList<PageData>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaceUserByNameResponse.Data.List.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setParams(_ctx.stringValue("QueryFaceUserByNameResponse.Data.List["+ i +"].Params"));
			pageData.setCustomUserId(_ctx.stringValue("QueryFaceUserByNameResponse.Data.List["+ i +"].CustomUserId"));
			pageData.setCreateTime(_ctx.longValue("QueryFaceUserByNameResponse.Data.List["+ i +"].CreateTime"));
			pageData.setUserId(_ctx.stringValue("QueryFaceUserByNameResponse.Data.List["+ i +"].UserId"));
			pageData.setName(_ctx.stringValue("QueryFaceUserByNameResponse.Data.List["+ i +"].Name"));
			pageData.setModifyTime(_ctx.longValue("QueryFaceUserByNameResponse.Data.List["+ i +"].ModifyTime"));

			List<FacePicListItem> facePicList = new ArrayList<FacePicListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryFaceUserByNameResponse.Data.List["+ i +"].FacePicList.Length"); j++) {
				FacePicListItem facePicListItem = new FacePicListItem();
				facePicListItem.setFaceUrl(_ctx.stringValue("QueryFaceUserByNameResponse.Data.List["+ i +"].FacePicList["+ j +"].FaceUrl"));
				facePicListItem.setFaceMd5(_ctx.stringValue("QueryFaceUserByNameResponse.Data.List["+ i +"].FacePicList["+ j +"].FaceMd5"));

				List<FeatureDTO> featureDTOList = new ArrayList<FeatureDTO>();
				for (int k = 0; k < _ctx.lengthValue("QueryFaceUserByNameResponse.Data.List["+ i +"].FacePicList["+ j +"].FeatureDTOList.Length"); k++) {
					FeatureDTO featureDTO = new FeatureDTO();
					featureDTO.setAlgorithmName(_ctx.stringValue("QueryFaceUserByNameResponse.Data.List["+ i +"].FacePicList["+ j +"].FeatureDTOList["+ k +"].AlgorithmName"));
					featureDTO.setAlgorithmVersion(_ctx.stringValue("QueryFaceUserByNameResponse.Data.List["+ i +"].FacePicList["+ j +"].FeatureDTOList["+ k +"].AlgorithmVersion"));
					featureDTO.setAlgorithmProvider(_ctx.stringValue("QueryFaceUserByNameResponse.Data.List["+ i +"].FacePicList["+ j +"].FeatureDTOList["+ k +"].AlgorithmProvider"));
					featureDTO.setErrorMessage(_ctx.stringValue("QueryFaceUserByNameResponse.Data.List["+ i +"].FacePicList["+ j +"].FeatureDTOList["+ k +"].ErrorMessage"));
					featureDTO.setErrorCode(_ctx.stringValue("QueryFaceUserByNameResponse.Data.List["+ i +"].FacePicList["+ j +"].FeatureDTOList["+ k +"].ErrorCode"));
					featureDTO.setFaceMd5(_ctx.stringValue("QueryFaceUserByNameResponse.Data.List["+ i +"].FacePicList["+ j +"].FeatureDTOList["+ k +"].FaceMd5"));

					featureDTOList.add(featureDTO);
				}
				facePicListItem.setFeatureDTOList(featureDTOList);

				facePicList.add(facePicListItem);
			}
			pageData.setFacePicList(facePicList);

			list.add(pageData);
		}
		data.setList(list);
		queryFaceUserByNameResponse.setData(data);
	 
	 	return queryFaceUserByNameResponse;
	}
}