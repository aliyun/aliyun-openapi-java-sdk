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

import com.aliyuncs.xrengine.model.v20221111.QueryProjectDetailResponse;
import com.aliyuncs.xrengine.model.v20221111.QueryProjectDetailResponse.Data;
import com.aliyuncs.xrengine.model.v20221111.QueryProjectDetailResponse.Data.BuildDetail;
import com.aliyuncs.xrengine.model.v20221111.QueryProjectDetailResponse.Data.Dataset;
import com.aliyuncs.xrengine.model.v20221111.QueryProjectDetailResponse.Data.Dataset.Policy1;
import com.aliyuncs.xrengine.model.v20221111.QueryProjectDetailResponse.Data.Source;
import com.aliyuncs.xrengine.model.v20221111.QueryProjectDetailResponse.Data.Source.ClothesItem;
import com.aliyuncs.xrengine.model.v20221111.QueryProjectDetailResponse.Data.Source.FilesItem;
import com.aliyuncs.xrengine.model.v20221111.QueryProjectDetailResponse.Data.Source.Policy;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProjectDetailResponseUnmarshaller {

	public static QueryProjectDetailResponse unmarshall(QueryProjectDetailResponse queryProjectDetailResponse, UnmarshallerContext _ctx) {
		
		queryProjectDetailResponse.setRequestId(_ctx.stringValue("QueryProjectDetailResponse.RequestId"));
		queryProjectDetailResponse.setSuccess(_ctx.booleanValue("QueryProjectDetailResponse.Success"));
		queryProjectDetailResponse.setCode(_ctx.stringValue("QueryProjectDetailResponse.Code"));
		queryProjectDetailResponse.setMessage(_ctx.stringValue("QueryProjectDetailResponse.Message"));
		queryProjectDetailResponse.setErrorName(_ctx.stringValue("QueryProjectDetailResponse.ErrorName"));
		queryProjectDetailResponse.setHttpCode(_ctx.integerValue("QueryProjectDetailResponse.HttpCode"));

		Data data = new Data();
		data.setTitle(_ctx.stringValue("QueryProjectDetailResponse.Data.Title"));
		data.setType(_ctx.stringValue("QueryProjectDetailResponse.Data.Type"));
		data.setStatus(_ctx.stringValue("QueryProjectDetailResponse.Data.Status"));
		data.setCreateMode(_ctx.stringValue("QueryProjectDetailResponse.Data.CreateMode"));
		data.setIntro(_ctx.stringValue("QueryProjectDetailResponse.Data.Intro"));
		data.setBizUsage(_ctx.stringValue("QueryProjectDetailResponse.Data.BizUsage"));
		data.setId(_ctx.stringValue("QueryProjectDetailResponse.Data.Id"));
		data.setDeleted(_ctx.booleanValue("QueryProjectDetailResponse.Data.Deleted"));
		data.setCreateTime(_ctx.stringValue("QueryProjectDetailResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("QueryProjectDetailResponse.Data.ModifiedTime"));
		data.setDependencies(_ctx.stringValue("QueryProjectDetailResponse.Data.Dependencies"));
		data.setMaterialCoverUrl(_ctx.stringValue("QueryProjectDetailResponse.Data.MaterialCoverUrl"));
		data.setExt(_ctx.stringValue("QueryProjectDetailResponse.Data.Ext"));

		Source source = new Source();
		source.setOssKey(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.OssKey"));
		source.setId(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Id"));
		source.setDeleted(_ctx.booleanValue("QueryProjectDetailResponse.Data.Source.Deleted"));
		source.setCreateTime(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.CreateTime"));
		source.setModifiedTime(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.ModifiedTime"));

		Policy policy = new Policy();
		policy.setAccessId(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Policy.AccessId"));
		policy.setPolicy(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Policy.Policy"));
		policy.setSignature(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Policy.Signature"));
		policy.setDir(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Policy.Dir"));
		policy.setHost(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Policy.Host"));
		policy.setExpire(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Policy.Expire"));
		source.setPolicy(policy);

		List<FilesItem> files = new ArrayList<FilesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryProjectDetailResponse.Data.Source.Files.Length"); i++) {
			FilesItem filesItem = new FilesItem();
			filesItem.setId(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Files["+ i +"].Id"));
			filesItem.setFileName(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Files["+ i +"].FileName"));
			filesItem.setType(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Files["+ i +"].Type"));
			filesItem.setSize(_ctx.longValue("QueryProjectDetailResponse.Data.Source.Files["+ i +"].Size"));
			filesItem.setUrl(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Files["+ i +"].Url"));
			filesItem.setCoverUrl(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Files["+ i +"].CoverUrl"));

			files.add(filesItem);
		}
		source.setFiles(files);

		List<ClothesItem> clothes = new ArrayList<ClothesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryProjectDetailResponse.Data.Source.Clothes.Length"); i++) {
			ClothesItem clothesItem = new ClothesItem();
			clothesItem.setId(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Clothes["+ i +"].Id"));
			clothesItem.setOssKey(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Clothes["+ i +"].OssKey"));
			clothesItem.setType(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Clothes["+ i +"].Type"));
			clothesItem.setName(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Clothes["+ i +"].Name"));
			clothesItem.setCoverUrl(_ctx.stringValue("QueryProjectDetailResponse.Data.Source.Clothes["+ i +"].CoverUrl"));

			clothes.add(clothesItem);
		}
		source.setClothes(clothes);
		data.setSource(source);

		Dataset dataset = new Dataset();
		dataset.setOssKey(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.OssKey"));
		dataset.setCoverUrl(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.CoverUrl"));
		dataset.setPreviewUrl(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.PreviewUrl"));
		dataset.setModelUrl(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.ModelUrl"));
		dataset.setPoseUrl(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.PoseUrl"));
		dataset.setOriginResultUrl(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.OriginResultUrl"));
		dataset.setId(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.Id"));
		dataset.setDeleted(_ctx.booleanValue("QueryProjectDetailResponse.Data.Dataset.Deleted"));
		dataset.setCreateTime(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.CreateTime"));
		dataset.setModifiedTime(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.ModifiedTime"));
		dataset.setGlbModelUrl(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.GlbModelUrl"));
		dataset.setBuildResultUrl(_ctx.mapValue("QueryProjectDetailResponse.Data.Dataset.BuildResultUrl"));
		dataset.setErrorMessage(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.ErrorMessage"));
		dataset.setErrorCode(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.ErrorCode"));

		Policy1 policy1 = new Policy1();
		policy1.setAccessId(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.Policy.AccessId"));
		policy1.setPolicy(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.Policy.Policy"));
		policy1.setSignature(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.Policy.Signature"));
		policy1.setDir(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.Policy.Dir"));
		policy1.setHost(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.Policy.Host"));
		policy1.setExpire(_ctx.stringValue("QueryProjectDetailResponse.Data.Dataset.Policy.Expire"));
		dataset.setPolicy1(policy1);
		data.setDataset(dataset);

		BuildDetail buildDetail = new BuildDetail();
		buildDetail.setSubmitTime(_ctx.stringValue("QueryProjectDetailResponse.Data.BuildDetail.SubmitTime"));
		buildDetail.setRunningTime(_ctx.stringValue("QueryProjectDetailResponse.Data.BuildDetail.RunningTime"));
		buildDetail.setCompletedTime(_ctx.stringValue("QueryProjectDetailResponse.Data.BuildDetail.CompletedTime"));
		buildDetail.setEstimatedDuration(_ctx.longValue("QueryProjectDetailResponse.Data.BuildDetail.EstimatedDuration"));
		buildDetail.setErrorMessage(_ctx.stringValue("QueryProjectDetailResponse.Data.BuildDetail.ErrorMessage"));
		data.setBuildDetail(buildDetail);
		queryProjectDetailResponse.setData(data);
	 
	 	return queryProjectDetailResponse;
	}
}