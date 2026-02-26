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

package com.aliyuncs.pts.transform.v20201020;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20201020.ListEnvsResponse;
import com.aliyuncs.pts.model.v20201020.ListEnvsResponse.Env;
import com.aliyuncs.pts.model.v20201020.ListEnvsResponse.Env.File;
import com.aliyuncs.pts.model.v20201020.ListEnvsResponse.Env.PropertiesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvsResponseUnmarshaller {

	public static ListEnvsResponse unmarshall(ListEnvsResponse listEnvsResponse, UnmarshallerContext _ctx) {
		
		listEnvsResponse.setRequestId(_ctx.stringValue("ListEnvsResponse.RequestId"));
		listEnvsResponse.setTotalCount(_ctx.longValue("ListEnvsResponse.TotalCount"));
		listEnvsResponse.setMessage(_ctx.stringValue("ListEnvsResponse.Message"));
		listEnvsResponse.setPageSize(_ctx.integerValue("ListEnvsResponse.PageSize"));
		listEnvsResponse.setPageNumber(_ctx.integerValue("ListEnvsResponse.PageNumber"));
		listEnvsResponse.setHttpStatusCode(_ctx.integerValue("ListEnvsResponse.HttpStatusCode"));
		listEnvsResponse.setCode(_ctx.stringValue("ListEnvsResponse.Code"));
		listEnvsResponse.setSuccess(_ctx.booleanValue("ListEnvsResponse.Success"));

		List<Env> envs = new ArrayList<Env>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvsResponse.Envs.Length"); i++) {
			Env env = new Env();
			env.setCreateTime(_ctx.longValue("ListEnvsResponse.Envs["+ i +"].CreateTime"));
			env.setEnvVersion(_ctx.stringValue("ListEnvsResponse.Envs["+ i +"].EnvVersion"));
			env.setModifiedTime(_ctx.longValue("ListEnvsResponse.Envs["+ i +"].ModifiedTime"));
			env.setUsedCapacity(_ctx.longValue("ListEnvsResponse.Envs["+ i +"].UsedCapacity"));
			env.setEnvName(_ctx.stringValue("ListEnvsResponse.Envs["+ i +"].EnvName"));
			env.setEnvId(_ctx.stringValue("ListEnvsResponse.Envs["+ i +"].EnvId"));

			List<String> runningScenes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvsResponse.Envs["+ i +"].RunningScenes.Length"); j++) {
				runningScenes.add(_ctx.stringValue("ListEnvsResponse.Envs["+ i +"].RunningScenes["+ j +"]"));
			}
			env.setRunningScenes(runningScenes);

			List<String> relatedScenes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvsResponse.Envs["+ i +"].RelatedScenes.Length"); j++) {
				relatedScenes.add(_ctx.stringValue("ListEnvsResponse.Envs["+ i +"].RelatedScenes["+ j +"]"));
			}
			env.setRelatedScenes(relatedScenes);

			List<File> files = new ArrayList<File>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvsResponse.Envs["+ i +"].Files.Length"); j++) {
				File file = new File();
				file.setFileSize(_ctx.longValue("ListEnvsResponse.Envs["+ i +"].Files["+ j +"].FileSize"));
				file.setMd5(_ctx.stringValue("ListEnvsResponse.Envs["+ i +"].Files["+ j +"].Md5"));
				file.setFileName(_ctx.stringValue("ListEnvsResponse.Envs["+ i +"].Files["+ j +"].FileName"));
				file.setFileOssAddress(_ctx.stringValue("ListEnvsResponse.Envs["+ i +"].Files["+ j +"].FileOssAddress"));
				file.setFileId(_ctx.longValue("ListEnvsResponse.Envs["+ i +"].Files["+ j +"].FileId"));

				files.add(file);
			}
			env.setFiles(files);

			List<PropertiesItem> properties = new ArrayList<PropertiesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListEnvsResponse.Envs["+ i +"].Properties.Length"); j++) {
				PropertiesItem propertiesItem = new PropertiesItem();
				propertiesItem.setName(_ctx.stringValue("ListEnvsResponse.Envs["+ i +"].Properties["+ j +"].Name"));
				propertiesItem.setValue(_ctx.stringValue("ListEnvsResponse.Envs["+ i +"].Properties["+ j +"].Value"));
				propertiesItem.setDescription(_ctx.stringValue("ListEnvsResponse.Envs["+ i +"].Properties["+ j +"].Description"));

				properties.add(propertiesItem);
			}
			env.setProperties(properties);

			envs.add(env);
		}
		listEnvsResponse.setEnvs(envs);
	 
	 	return listEnvsResponse;
	}
}