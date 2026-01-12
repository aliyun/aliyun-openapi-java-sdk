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

import com.aliyuncs.xrengine.model.v20221111.ListProjectResponse;
import com.aliyuncs.xrengine.model.v20221111.ListProjectResponse.DataItem;
import com.aliyuncs.xrengine.model.v20221111.ListProjectResponse.DataItem.Dataset;
import com.aliyuncs.xrengine.model.v20221111.ListProjectResponse.DataItem.Source;
import com.aliyuncs.xrengine.model.v20221111.ListProjectResponse.DataItem.Source.ClothesItem;
import com.aliyuncs.xrengine.model.v20221111.ListProjectResponse.DataItem.Source.FilesItem;
import com.aliyuncs.xrengine.model.v20221111.ListProjectResponse.DataItem.User;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectResponseUnmarshaller {

	public static ListProjectResponse unmarshall(ListProjectResponse listProjectResponse, UnmarshallerContext _ctx) {
		
		listProjectResponse.setRequestId(_ctx.stringValue("ListProjectResponse.RequestId"));
		listProjectResponse.setCurrent(_ctx.integerValue("ListProjectResponse.Current"));
		listProjectResponse.setSize(_ctx.integerValue("ListProjectResponse.Size"));
		listProjectResponse.setTotal(_ctx.integerValue("ListProjectResponse.Total"));
		listProjectResponse.setPages(_ctx.integerValue("ListProjectResponse.Pages"));
		listProjectResponse.setSuccess(_ctx.booleanValue("ListProjectResponse.Success"));
		listProjectResponse.setCode(_ctx.stringValue("ListProjectResponse.Code"));
		listProjectResponse.setMessage(_ctx.stringValue("ListProjectResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTitle(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Title"));
			dataItem.setType(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Type"));
			dataItem.setStatus(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Status"));
			dataItem.setIntro(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Intro"));
			dataItem.setId(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Id"));
			dataItem.setCreateTime(_ctx.stringValue("ListProjectResponse.Data["+ i +"].CreateTime"));
			dataItem.setModifiedTime(_ctx.stringValue("ListProjectResponse.Data["+ i +"].ModifiedTime"));
			dataItem.setExt(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Ext"));
			dataItem.setBizUsage(_ctx.stringValue("ListProjectResponse.Data["+ i +"].BizUsage"));
			dataItem.setExtInfo(_ctx.mapValue("ListProjectResponse.Data["+ i +"].ExtInfo"));
			dataItem.setMaterialCoverUrl(_ctx.stringValue("ListProjectResponse.Data["+ i +"].MaterialCoverUrl"));

			Dataset dataset = new Dataset();
			dataset.setOssKey(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Dataset.OssKey"));
			dataset.setCoverUrl(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Dataset.CoverUrl"));
			dataset.setPreviewUrl(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Dataset.PreviewUrl"));
			dataset.setModelUrl(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Dataset.ModelUrl"));
			dataset.setPoseUrl(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Dataset.PoseUrl"));
			dataset.setOriginResultUrl(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Dataset.OriginResultUrl"));
			dataset.setGlbModelUrl(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Dataset.GlbModelUrl"));
			dataset.setBuildResultUrl(_ctx.mapValue("ListProjectResponse.Data["+ i +"].Dataset.BuildResultUrl"));
			dataset.setErrorMessage(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Dataset.ErrorMessage"));
			dataItem.setDataset(dataset);

			User user = new User();
			user.setNickname(_ctx.stringValue("ListProjectResponse.Data["+ i +"].User.Nickname"));
			user.setAliyunUid(_ctx.stringValue("ListProjectResponse.Data["+ i +"].User.AliyunUid"));
			user.setCreateTime(_ctx.stringValue("ListProjectResponse.Data["+ i +"].User.CreateTime"));
			user.setModifiedTime(_ctx.stringValue("ListProjectResponse.Data["+ i +"].User.ModifiedTime"));
			dataItem.setUser(user);

			Source source = new Source();
			source.setOssKey(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Source.OssKey"));

			List<FilesItem> files = new ArrayList<FilesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListProjectResponse.Data["+ i +"].Source.Files.Length"); j++) {
				FilesItem filesItem = new FilesItem();
				filesItem.setId(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Source.Files["+ j +"].Id"));
				filesItem.setFileName(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Source.Files["+ j +"].FileName"));
				filesItem.setType(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Source.Files["+ j +"].Type"));
				filesItem.setSize(_ctx.longValue("ListProjectResponse.Data["+ i +"].Source.Files["+ j +"].Size"));
				filesItem.setUrl(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Source.Files["+ j +"].Url"));
				filesItem.setCoverUrl(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Source.Files["+ j +"].CoverUrl"));

				files.add(filesItem);
			}
			source.setFiles(files);

			List<ClothesItem> clothes = new ArrayList<ClothesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListProjectResponse.Data["+ i +"].Source.Clothes.Length"); j++) {
				ClothesItem clothesItem = new ClothesItem();
				clothesItem.setOssKey(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Source.Clothes["+ j +"].OssKey"));
				clothesItem.setType(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Source.Clothes["+ j +"].Type"));
				clothesItem.setName(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Source.Clothes["+ j +"].Name"));
				clothesItem.setCoverUrl(_ctx.stringValue("ListProjectResponse.Data["+ i +"].Source.Clothes["+ j +"].CoverUrl"));

				clothes.add(clothesItem);
			}
			source.setClothes(clothes);
			dataItem.setSource(source);

			data.add(dataItem);
		}
		listProjectResponse.setData(data);
	 
	 	return listProjectResponse;
	}
}