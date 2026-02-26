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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.GetProjectDatasetResponse;
import com.aliyuncs.xrengine.model.v20221111.GetProjectDatasetResponse.Data;
import com.aliyuncs.xrengine.model.v20221111.GetProjectDatasetResponse.Data.Dataset;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectDatasetResponseUnmarshaller {

	public static GetProjectDatasetResponse unmarshall(GetProjectDatasetResponse getProjectDatasetResponse, UnmarshallerContext _ctx) {
		
		getProjectDatasetResponse.setRequestId(_ctx.stringValue("GetProjectDatasetResponse.RequestId"));
		getProjectDatasetResponse.setSuccess(_ctx.booleanValue("GetProjectDatasetResponse.Success"));
		getProjectDatasetResponse.setCode(_ctx.stringValue("GetProjectDatasetResponse.Code"));
		getProjectDatasetResponse.setMessage(_ctx.stringValue("GetProjectDatasetResponse.Message"));

		Data data = new Data();
		data.setTitle(_ctx.stringValue("GetProjectDatasetResponse.Data.Title"));
		data.setType(_ctx.stringValue("GetProjectDatasetResponse.Data.Type"));
		data.setStatus(_ctx.stringValue("GetProjectDatasetResponse.Data.Status"));
		data.setCreateMode(_ctx.stringValue("GetProjectDatasetResponse.Data.CreateMode"));
		data.setIntro(_ctx.stringValue("GetProjectDatasetResponse.Data.Intro"));
		data.setId(_ctx.stringValue("GetProjectDatasetResponse.Data.Id"));
		data.setCreateTime(_ctx.stringValue("GetProjectDatasetResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("GetProjectDatasetResponse.Data.ModifiedTime"));
		data.setBizUsage(_ctx.stringValue("GetProjectDatasetResponse.Data.bizUsage"));

		Dataset dataset = new Dataset();
		dataset.setOssKey(_ctx.stringValue("GetProjectDatasetResponse.Data.Dataset.OssKey"));
		dataset.setId(_ctx.stringValue("GetProjectDatasetResponse.Data.Dataset.Id"));
		dataset.setCreateTime(_ctx.stringValue("GetProjectDatasetResponse.Data.Dataset.CreateTime"));
		dataset.setModifiedTime(_ctx.stringValue("GetProjectDatasetResponse.Data.Dataset.ModifiedTime"));
		dataset.setModelUrl(_ctx.stringValue("GetProjectDatasetResponse.Data.Dataset.ModelUrl"));
		dataset.setCoverUrl(_ctx.stringValue("GetProjectDatasetResponse.Data.Dataset.CoverUrl"));
		dataset.setPreviewUrl(_ctx.stringValue("GetProjectDatasetResponse.Data.Dataset.PreviewUrl"));
		dataset.setPoseUrl(_ctx.stringValue("GetProjectDatasetResponse.Data.Dataset.PoseUrl"));
		dataset.setOriginResultUrl(_ctx.stringValue("GetProjectDatasetResponse.Data.Dataset.OriginResultUrl"));
		data.setDataset(dataset);
		getProjectDatasetResponse.setData(data);
	 
	 	return getProjectDatasetResponse;
	}
}