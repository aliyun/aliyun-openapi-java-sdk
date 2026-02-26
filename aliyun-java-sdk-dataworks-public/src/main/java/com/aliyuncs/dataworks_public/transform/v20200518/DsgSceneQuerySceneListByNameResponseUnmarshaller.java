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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.DsgSceneQuerySceneListByNameResponse;
import com.aliyuncs.dataworks_public.model.v20200518.DsgSceneQuerySceneListByNameResponse.Datas;
import com.aliyuncs.dataworks_public.model.v20200518.DsgSceneQuerySceneListByNameResponse.Datas.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgSceneQuerySceneListByNameResponseUnmarshaller {

	public static DsgSceneQuerySceneListByNameResponse unmarshall(DsgSceneQuerySceneListByNameResponse dsgSceneQuerySceneListByNameResponse, UnmarshallerContext _ctx) {
		
		dsgSceneQuerySceneListByNameResponse.setRequestId(_ctx.stringValue("DsgSceneQuerySceneListByNameResponse.RequestId"));
		dsgSceneQuerySceneListByNameResponse.setSuccess(_ctx.booleanValue("DsgSceneQuerySceneListByNameResponse.Success"));
		dsgSceneQuerySceneListByNameResponse.setErrorCode(_ctx.stringValue("DsgSceneQuerySceneListByNameResponse.ErrorCode"));
		dsgSceneQuerySceneListByNameResponse.setErrorMessage(_ctx.stringValue("DsgSceneQuerySceneListByNameResponse.ErrorMessage"));
		dsgSceneQuerySceneListByNameResponse.setHttpStatusCode(_ctx.integerValue("DsgSceneQuerySceneListByNameResponse.HttpStatusCode"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("DsgSceneQuerySceneListByNameResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setId(_ctx.longValue("DsgSceneQuerySceneListByNameResponse.Data["+ i +"].Id"));
			datas.setSceneCode(_ctx.stringValue("DsgSceneQuerySceneListByNameResponse.Data["+ i +"].SceneCode"));
			datas.setDesc(_ctx.stringValue("DsgSceneQuerySceneListByNameResponse.Data["+ i +"].Desc"));
			datas.setSceneName(_ctx.stringValue("DsgSceneQuerySceneListByNameResponse.Data["+ i +"].SceneName"));
			datas.setUserGroups(_ctx.stringValue("DsgSceneQuerySceneListByNameResponse.Data["+ i +"].UserGroups"));
			datas.setSceneLevel(_ctx.integerValue("DsgSceneQuerySceneListByNameResponse.Data["+ i +"].SceneLevel"));

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DsgSceneQuerySceneListByNameResponse.Data["+ i +"].Children.Length"); j++) {
				children.add(_ctx.stringValue("DsgSceneQuerySceneListByNameResponse.Data["+ i +"].Children["+ j +"]"));
			}
			datas.setChildren(children);

			List<Project> projects = new ArrayList<Project>();
			for (int j = 0; j < _ctx.lengthValue("DsgSceneQuerySceneListByNameResponse.Data["+ i +"].Projects.Length"); j++) {
				Project project = new Project();
				project.setDbType(_ctx.stringValue("DsgSceneQuerySceneListByNameResponse.Data["+ i +"].Projects["+ j +"].DbType"));
				project.setProjectName(_ctx.stringValue("DsgSceneQuerySceneListByNameResponse.Data["+ i +"].Projects["+ j +"].ProjectName"));
				project.setClusterId(_ctx.stringValue("DsgSceneQuerySceneListByNameResponse.Data["+ i +"].Projects["+ j +"].ClusterId"));

				projects.add(project);
			}
			datas.setProjects(projects);

			data.add(datas);
		}
		dsgSceneQuerySceneListByNameResponse.setData(data);
	 
	 	return dsgSceneQuerySceneListByNameResponse;
	}
}