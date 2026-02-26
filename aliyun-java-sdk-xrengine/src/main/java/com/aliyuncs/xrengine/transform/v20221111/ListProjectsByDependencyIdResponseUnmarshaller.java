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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xrengine.model.v20221111.ListProjectsByDependencyIdResponse;
import com.aliyuncs.xrengine.model.v20221111.ListProjectsByDependencyIdResponse.DataItem;
import com.aliyuncs.xrengine.model.v20221111.ListProjectsByDependencyIdResponse.DataItem.BuildDetail;
import com.aliyuncs.xrengine.model.v20221111.ListProjectsByDependencyIdResponse.DataItem.Dataset;
import com.aliyuncs.xrengine.model.v20221111.ListProjectsByDependencyIdResponse.DataItem.Source;
import com.aliyuncs.xrengine.model.v20221111.ListProjectsByDependencyIdResponse.DataItem.Source.SourceFilesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsByDependencyIdResponseUnmarshaller {

	public static ListProjectsByDependencyIdResponse unmarshall(ListProjectsByDependencyIdResponse listProjectsByDependencyIdResponse, UnmarshallerContext _ctx) {
		
		listProjectsByDependencyIdResponse.setRequestId(_ctx.stringValue("ListProjectsByDependencyIdResponse.RequestId"));
		listProjectsByDependencyIdResponse.setSuccess(_ctx.booleanValue("ListProjectsByDependencyIdResponse.Success"));
		listProjectsByDependencyIdResponse.setCode(_ctx.stringValue("ListProjectsByDependencyIdResponse.Code"));
		listProjectsByDependencyIdResponse.setMessage(_ctx.stringValue("ListProjectsByDependencyIdResponse.Message"));
		listProjectsByDependencyIdResponse.setErrorName(_ctx.stringValue("ListProjectsByDependencyIdResponse.ErrorName"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectsByDependencyIdResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTitle(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Title"));
			dataItem.setType(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Type"));
			dataItem.setStatus(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Status"));
			dataItem.setIntro(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Intro"));
			dataItem.setId(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Id"));
			dataItem.setCreateTime(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].CreateTime"));
			dataItem.setModifiedTime(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].ModifiedTime"));
			dataItem.setExt(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Ext"));
			dataItem.setBizUsage(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].BizUsage"));

			Source source = new Source();
			source.setId(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Source.Id"));
			source.setCreateTime(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Source.CreateTime"));
			source.setModifiedTime(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Source.ModifiedTime"));
			source.setOssKey(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Source.OssKey"));
			source.setProjectId(_ctx.longValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Source.ProjectId"));

			List<SourceFilesItem> sourceFiles = new ArrayList<SourceFilesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Source.SourceFiles.Length"); j++) {
				SourceFilesItem sourceFilesItem = new SourceFilesItem();
				sourceFilesItem.setId(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Source.SourceFiles["+ j +"].Id"));
				sourceFilesItem.setFileName(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Source.SourceFiles["+ j +"].FileName"));
				sourceFilesItem.setType(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Source.SourceFiles["+ j +"].Type"));
				sourceFilesItem.setSize(_ctx.longValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Source.SourceFiles["+ j +"].Size"));
				sourceFilesItem.setUrl(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Source.SourceFiles["+ j +"].Url"));
				sourceFilesItem.setCoverUrl(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Source.SourceFiles["+ j +"].CoverUrl"));

				sourceFiles.add(sourceFilesItem);
			}
			source.setSourceFiles(sourceFiles);
			dataItem.setSource(source);

			Dataset dataset = new Dataset();
			dataset.setOssKey(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Dataset.OssKey"));
			dataset.setCoverUrl(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Dataset.CoverUrl"));
			dataset.setPreviewUrl(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Dataset.PreviewUrl"));
			dataset.setModelUrl(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Dataset.ModelUrl"));
			dataset.setPoseUrl(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Dataset.PoseUrl"));
			dataset.setOriginResultUrl(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Dataset.OriginResultUrl"));
			dataset.setGlbModelUrl(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Dataset.GlbModelUrl"));
			dataset.setBuildResultUrl(_ctx.mapValue("ListProjectsByDependencyIdResponse.Data["+ i +"].Dataset.BuildResultUrl"));
			dataItem.setDataset(dataset);

			BuildDetail buildDetail = new BuildDetail();
			buildDetail.setSubmitTime(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].BuildDetail.SubmitTime"));
			buildDetail.setRunningTime(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].BuildDetail.RunningTime"));
			buildDetail.setCompletedTime(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].BuildDetail.CompletedTime"));
			buildDetail.setEstimatedDuration(_ctx.longValue("ListProjectsByDependencyIdResponse.Data["+ i +"].BuildDetail.EstimatedDuration"));
			buildDetail.setErrorMessage(_ctx.stringValue("ListProjectsByDependencyIdResponse.Data["+ i +"].BuildDetail.ErrorMessage"));
			dataItem.setBuildDetail(buildDetail);

			data.add(dataItem);
		}
		listProjectsByDependencyIdResponse.setData(data);
	 
	 	return listProjectsByDependencyIdResponse;
	}
}