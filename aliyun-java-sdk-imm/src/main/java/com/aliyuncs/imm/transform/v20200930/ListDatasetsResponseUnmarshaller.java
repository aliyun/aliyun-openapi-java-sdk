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

import com.aliyuncs.imm.model.v20200930.ListDatasetsResponse;
import com.aliyuncs.imm.model.v20200930.ListDatasetsResponse.DatasetsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatasetsResponseUnmarshaller {

	public static ListDatasetsResponse unmarshall(ListDatasetsResponse listDatasetsResponse, UnmarshallerContext _ctx) {
		
		listDatasetsResponse.setRequestId(_ctx.stringValue("ListDatasetsResponse.RequestId"));
		listDatasetsResponse.setNextToken(_ctx.stringValue("ListDatasetsResponse.NextToken"));

		List<DatasetsItem> datasets = new ArrayList<DatasetsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDatasetsResponse.Datasets.Length"); i++) {
			DatasetsItem datasetsItem = new DatasetsItem();
			datasetsItem.setProjectName(_ctx.stringValue("ListDatasetsResponse.Datasets["+ i +"].ProjectName"));
			datasetsItem.setDatasetName(_ctx.stringValue("ListDatasetsResponse.Datasets["+ i +"].DatasetName"));
			datasetsItem.setTemplateId(_ctx.stringValue("ListDatasetsResponse.Datasets["+ i +"].TemplateId"));
			datasetsItem.setCreateTime(_ctx.stringValue("ListDatasetsResponse.Datasets["+ i +"].CreateTime"));
			datasetsItem.setUpdateTime(_ctx.stringValue("ListDatasetsResponse.Datasets["+ i +"].UpdateTime"));
			datasetsItem.setDescription(_ctx.stringValue("ListDatasetsResponse.Datasets["+ i +"].Description"));
			datasetsItem.setDatasetMaxBindCount(_ctx.longValue("ListDatasetsResponse.Datasets["+ i +"].DatasetMaxBindCount"));
			datasetsItem.setDatasetMaxFileCount(_ctx.longValue("ListDatasetsResponse.Datasets["+ i +"].DatasetMaxFileCount"));
			datasetsItem.setDatasetMaxEntityCount(_ctx.longValue("ListDatasetsResponse.Datasets["+ i +"].DatasetMaxEntityCount"));
			datasetsItem.setDatasetMaxRelationCount(_ctx.longValue("ListDatasetsResponse.Datasets["+ i +"].DatasetMaxRelationCount"));
			datasetsItem.setDatasetMaxTotalFileSize(_ctx.longValue("ListDatasetsResponse.Datasets["+ i +"].DatasetMaxTotalFileSize"));
			datasetsItem.setBindCount(_ctx.longValue("ListDatasetsResponse.Datasets["+ i +"].BindCount"));
			datasetsItem.setFileCount(_ctx.longValue("ListDatasetsResponse.Datasets["+ i +"].FileCount"));
			datasetsItem.setTotalFileSize(_ctx.longValue("ListDatasetsResponse.Datasets["+ i +"].TotalFileSize"));

			datasets.add(datasetsItem);
		}
		listDatasetsResponse.setDatasets(datasets);
	 
	 	return listDatasetsResponse;
	}
}