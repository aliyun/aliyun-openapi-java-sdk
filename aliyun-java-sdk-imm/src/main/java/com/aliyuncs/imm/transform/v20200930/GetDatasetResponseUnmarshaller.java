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

import com.aliyuncs.imm.model.v20200930.GetDatasetResponse;
import com.aliyuncs.imm.model.v20200930.GetDatasetResponse.Dataset;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDatasetResponseUnmarshaller {

	public static GetDatasetResponse unmarshall(GetDatasetResponse getDatasetResponse, UnmarshallerContext _ctx) {
		
		getDatasetResponse.setRequestId(_ctx.stringValue("GetDatasetResponse.RequestId"));

		Dataset dataset = new Dataset();
		dataset.setProjectName(_ctx.stringValue("GetDatasetResponse.Dataset.ProjectName"));
		dataset.setDatasetName(_ctx.stringValue("GetDatasetResponse.Dataset.DatasetName"));
		dataset.setTemplateId(_ctx.stringValue("GetDatasetResponse.Dataset.TemplateId"));
		dataset.setCreateTime(_ctx.stringValue("GetDatasetResponse.Dataset.CreateTime"));
		dataset.setUpdateTime(_ctx.stringValue("GetDatasetResponse.Dataset.UpdateTime"));
		dataset.setDescription(_ctx.stringValue("GetDatasetResponse.Dataset.Description"));
		dataset.setDatasetMaxBindCount(_ctx.longValue("GetDatasetResponse.Dataset.DatasetMaxBindCount"));
		dataset.setDatasetMaxFileCount(_ctx.longValue("GetDatasetResponse.Dataset.DatasetMaxFileCount"));
		dataset.setDatasetMaxEntityCount(_ctx.longValue("GetDatasetResponse.Dataset.DatasetMaxEntityCount"));
		dataset.setDatasetMaxRelationCount(_ctx.longValue("GetDatasetResponse.Dataset.DatasetMaxRelationCount"));
		dataset.setDatasetMaxTotalFileSize(_ctx.longValue("GetDatasetResponse.Dataset.DatasetMaxTotalFileSize"));
		dataset.setBindCount(_ctx.longValue("GetDatasetResponse.Dataset.BindCount"));
		dataset.setFileCount(_ctx.longValue("GetDatasetResponse.Dataset.FileCount"));
		dataset.setTotalFileSize(_ctx.longValue("GetDatasetResponse.Dataset.TotalFileSize"));
		getDatasetResponse.setDataset(dataset);
	 
	 	return getDatasetResponse;
	}
}