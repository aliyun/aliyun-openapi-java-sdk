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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.QuerySimilarImageClustersResponse;
import com.aliyuncs.imm.model.v20200930.QuerySimilarImageClustersResponse.SimilarImageClustersItem;
import com.aliyuncs.imm.model.v20200930.QuerySimilarImageClustersResponse.SimilarImageClustersItem.FilesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySimilarImageClustersResponseUnmarshaller {

	public static QuerySimilarImageClustersResponse unmarshall(QuerySimilarImageClustersResponse querySimilarImageClustersResponse, UnmarshallerContext _ctx) {
		
		querySimilarImageClustersResponse.setRequestId(_ctx.stringValue("QuerySimilarImageClustersResponse.RequestId"));
		querySimilarImageClustersResponse.setNextToken(_ctx.stringValue("QuerySimilarImageClustersResponse.NextToken"));

		List<SimilarImageClustersItem> similarImageClusters = new ArrayList<SimilarImageClustersItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySimilarImageClustersResponse.SimilarImageClusters.Length"); i++) {
			SimilarImageClustersItem similarImageClustersItem = new SimilarImageClustersItem();
			similarImageClustersItem.setObjectId(_ctx.stringValue("QuerySimilarImageClustersResponse.SimilarImageClusters["+ i +"].ObjectId"));
			similarImageClustersItem.setUpdateTime(_ctx.stringValue("QuerySimilarImageClustersResponse.SimilarImageClusters["+ i +"].UpdateTime"));
			similarImageClustersItem.setCreateTime(_ctx.stringValue("QuerySimilarImageClustersResponse.SimilarImageClusters["+ i +"].CreateTime"));
			similarImageClustersItem.setCustomLabels(_ctx.mapValue("QuerySimilarImageClustersResponse.SimilarImageClusters["+ i +"].CustomLabels"));

			List<FilesItem> files = new ArrayList<FilesItem>();
			for (int j = 0; j < _ctx.lengthValue("QuerySimilarImageClustersResponse.SimilarImageClusters["+ i +"].Files.Length"); j++) {
				FilesItem filesItem = new FilesItem();
				filesItem.setURI(_ctx.stringValue("QuerySimilarImageClustersResponse.SimilarImageClusters["+ i +"].Files["+ j +"].URI"));
				filesItem.setImageScore(_ctx.doubleValue("QuerySimilarImageClustersResponse.SimilarImageClusters["+ i +"].Files["+ j +"].ImageScore"));

				files.add(filesItem);
			}
			similarImageClustersItem.setFiles(files);

			similarImageClusters.add(similarImageClustersItem);
		}
		querySimilarImageClustersResponse.setSimilarImageClusters(similarImageClusters);
	 
	 	return querySimilarImageClustersResponse;
	}
}