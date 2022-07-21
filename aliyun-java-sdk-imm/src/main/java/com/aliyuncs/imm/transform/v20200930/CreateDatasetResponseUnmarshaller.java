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

import com.aliyuncs.imm.model.v20200930.CreateDatasetResponse;
import com.aliyuncs.imm.model.v20200930.CreateDatasetResponse.Dataset;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDatasetResponseUnmarshaller {

	public static CreateDatasetResponse unmarshall(CreateDatasetResponse createDatasetResponse, UnmarshallerContext _ctx) {
		
		createDatasetResponse.setRequestId(_ctx.stringValue("CreateDatasetResponse.RequestId"));

		Dataset dataset = new Dataset();
		dataset.setProjectName(_ctx.stringValue("CreateDatasetResponse.Dataset.ProjectName"));
		dataset.setDatasetName(_ctx.stringValue("CreateDatasetResponse.Dataset.DatasetName"));
		dataset.setTemplateId(_ctx.stringValue("CreateDatasetResponse.Dataset.TemplateId"));
		dataset.setCreateTime(_ctx.stringValue("CreateDatasetResponse.Dataset.CreateTime"));
		dataset.setUpdateTime(_ctx.stringValue("CreateDatasetResponse.Dataset.UpdateTime"));
		dataset.setDescription(_ctx.stringValue("CreateDatasetResponse.Dataset.Description"));
		dataset.setDatasetMaxBindCount(_ctx.longValue("CreateDatasetResponse.Dataset.DatasetMaxBindCount"));
		dataset.setDatasetMaxFileCount(_ctx.longValue("CreateDatasetResponse.Dataset.DatasetMaxFileCount"));
		dataset.setDatasetMaxEntityCount(_ctx.longValue("CreateDatasetResponse.Dataset.DatasetMaxEntityCount"));
		dataset.setDatasetMaxRelationCount(_ctx.longValue("CreateDatasetResponse.Dataset.DatasetMaxRelationCount"));
		dataset.setDatasetMaxTotalFileSize(_ctx.longValue("CreateDatasetResponse.Dataset.DatasetMaxTotalFileSize"));
		dataset.setBindCount(_ctx.longValue("CreateDatasetResponse.Dataset.BindCount"));
		dataset.setFileCount(_ctx.longValue("CreateDatasetResponse.Dataset.FileCount"));
		dataset.setTotalFileSize(_ctx.longValue("CreateDatasetResponse.Dataset.TotalFileSize"));
		createDatasetResponse.setDataset(dataset);
	 
	 	return createDatasetResponse;
	}
}