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

import com.aliyuncs.imm.model.v20200930.UpdateDatasetResponse;
import com.aliyuncs.imm.model.v20200930.UpdateDatasetResponse.Dataset;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDatasetResponseUnmarshaller {

	public static UpdateDatasetResponse unmarshall(UpdateDatasetResponse updateDatasetResponse, UnmarshallerContext _ctx) {
		
		updateDatasetResponse.setRequestId(_ctx.stringValue("UpdateDatasetResponse.RequestId"));

		Dataset dataset = new Dataset();
		dataset.setProjectName(_ctx.stringValue("UpdateDatasetResponse.Dataset.ProjectName"));
		dataset.setDatasetName(_ctx.stringValue("UpdateDatasetResponse.Dataset.DatasetName"));
		dataset.setTemplateId(_ctx.stringValue("UpdateDatasetResponse.Dataset.TemplateId"));
		dataset.setCreateTime(_ctx.stringValue("UpdateDatasetResponse.Dataset.CreateTime"));
		dataset.setUpdateTime(_ctx.stringValue("UpdateDatasetResponse.Dataset.UpdateTime"));
		dataset.setDescription(_ctx.stringValue("UpdateDatasetResponse.Dataset.Description"));
		dataset.setDatasetMaxBindCount(_ctx.longValue("UpdateDatasetResponse.Dataset.DatasetMaxBindCount"));
		dataset.setDatasetMaxFileCount(_ctx.longValue("UpdateDatasetResponse.Dataset.DatasetMaxFileCount"));
		dataset.setDatasetMaxEntityCount(_ctx.longValue("UpdateDatasetResponse.Dataset.DatasetMaxEntityCount"));
		dataset.setDatasetMaxRelationCount(_ctx.longValue("UpdateDatasetResponse.Dataset.DatasetMaxRelationCount"));
		dataset.setDatasetMaxTotalFileSize(_ctx.longValue("UpdateDatasetResponse.Dataset.DatasetMaxTotalFileSize"));
		dataset.setBindCount(_ctx.longValue("UpdateDatasetResponse.Dataset.BindCount"));
		dataset.setFileCount(_ctx.longValue("UpdateDatasetResponse.Dataset.FileCount"));
		dataset.setTotalFileSize(_ctx.longValue("UpdateDatasetResponse.Dataset.TotalFileSize"));
		updateDatasetResponse.setDataset(dataset);
	 
	 	return updateDatasetResponse;
	}
}