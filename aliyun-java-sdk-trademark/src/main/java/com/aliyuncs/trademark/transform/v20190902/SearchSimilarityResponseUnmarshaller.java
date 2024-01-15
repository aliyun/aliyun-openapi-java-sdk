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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.SearchSimilarityResponse;
import com.aliyuncs.trademark.model.v20190902.SearchSimilarityResponse.Data;
import com.aliyuncs.trademark.model.v20190902.SearchSimilarityResponse.Data.ClassificationSimilarity;
import com.aliyuncs.trademark.model.v20190902.SearchSimilarityResponse.Data.ClassificationSimilarity.SimilarGroup;
import com.aliyuncs.trademark.model.v20190902.SearchSimilarityResponse.Data.ClassificationSimilarity.SimilarGroup.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchSimilarityResponseUnmarshaller {

	public static SearchSimilarityResponse unmarshall(SearchSimilarityResponse searchSimilarityResponse, UnmarshallerContext _ctx) {
		
		searchSimilarityResponse.setRequestId(_ctx.stringValue("SearchSimilarityResponse.RequestId"));

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("SearchSimilarityResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setName(_ctx.stringValue("SearchSimilarityResponse.DataList["+ i +"].Name"));
			data.setUri(_ctx.stringValue("SearchSimilarityResponse.DataList["+ i +"].Uri"));

			List<ClassificationSimilarity> classificationSimilarityList = new ArrayList<ClassificationSimilarity>();
			for (int j = 0; j < _ctx.lengthValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList.Length"); j++) {
				ClassificationSimilarity classificationSimilarity = new ClassificationSimilarity();
				classificationSimilarity.setClassificationName(_ctx.stringValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].ClassificationName"));
				classificationSimilarity.setClassification(_ctx.integerValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].Classification"));
				classificationSimilarity.setRate(_ctx.integerValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].Rate"));

				List<SimilarGroup> similarGroupList = new ArrayList<SimilarGroup>();
				for (int k = 0; k < _ctx.lengthValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].SimilarGroupList.Length"); k++) {
					SimilarGroup similarGroup = new SimilarGroup();
					similarGroup.setSimilarGroup(_ctx.stringValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].SimilarGroupList["+ k +"].SimilarGroup"));
					similarGroup.setSimilarGroupName(_ctx.stringValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].SimilarGroupList["+ k +"].SimilarGroupName"));
					similarGroup.setRate(_ctx.integerValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].SimilarGroupList["+ k +"].Rate"));

					List<Detail> detailList = new ArrayList<Detail>();
					for (int l = 0; l < _ctx.lengthValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].SimilarGroupList["+ k +"].DetailList.Length"); l++) {
						Detail detail = new Detail();
						detail.setCode(_ctx.stringValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].SimilarGroupList["+ k +"].DetailList["+ l +"].Code"));
						detail.setTmNumber(_ctx.stringValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].SimilarGroupList["+ k +"].DetailList["+ l +"].TmNumber"));
						detail.setName(_ctx.stringValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].SimilarGroupList["+ k +"].DetailList["+ l +"].Name"));
						detail.setUri(_ctx.stringValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].SimilarGroupList["+ k +"].DetailList["+ l +"].Uri"));
						detail.setUid(_ctx.stringValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].SimilarGroupList["+ k +"].DetailList["+ l +"].Uid"));
						detail.setRate(_ctx.integerValue("SearchSimilarityResponse.DataList["+ i +"].ClassificationSimilarityList["+ j +"].SimilarGroupList["+ k +"].DetailList["+ l +"].Rate"));

						detailList.add(detail);
					}
					similarGroup.setDetailList(detailList);

					similarGroupList.add(similarGroup);
				}
				classificationSimilarity.setSimilarGroupList(similarGroupList);

				classificationSimilarityList.add(classificationSimilarity);
			}
			data.setClassificationSimilarityList(classificationSimilarityList);

			dataList.add(data);
		}
		searchSimilarityResponse.setDataList(dataList);
	 
	 	return searchSimilarityResponse;
	}
}