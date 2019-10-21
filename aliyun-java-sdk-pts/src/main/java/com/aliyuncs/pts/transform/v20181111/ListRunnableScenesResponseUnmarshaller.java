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

package com.aliyuncs.pts.transform.v20181111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20181111.ListRunnableScenesResponse;
import com.aliyuncs.pts.model.v20181111.ListRunnableScenesResponse.Scene;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRunnableScenesResponseUnmarshaller {

	public static ListRunnableScenesResponse unmarshall(ListRunnableScenesResponse listRunnableScenesResponse, UnmarshallerContext _ctx) {
		
		listRunnableScenesResponse.setRequestId(_ctx.stringValue("ListRunnableScenesResponse.RequestId"));
		listRunnableScenesResponse.setCode(_ctx.stringValue("ListRunnableScenesResponse.Code"));
		listRunnableScenesResponse.setMessage(_ctx.stringValue("ListRunnableScenesResponse.Message"));
		listRunnableScenesResponse.setSuccess(_ctx.booleanValue("ListRunnableScenesResponse.Success"));
		listRunnableScenesResponse.setPageNumber(_ctx.integerValue("ListRunnableScenesResponse.PageNumber"));
		listRunnableScenesResponse.setPageSize(_ctx.integerValue("ListRunnableScenesResponse.PageSize"));
		listRunnableScenesResponse.setTotalCount(_ctx.longValue("ListRunnableScenesResponse.TotalCount"));

		List<Scene> scenes = new ArrayList<Scene>();
		for (int i = 0; i < _ctx.lengthValue("ListRunnableScenesResponse.Scenes.Length"); i++) {
			Scene scene = new Scene();
			scene.setSceneId(_ctx.longValue("ListRunnableScenesResponse.Scenes["+ i +"].SceneId"));
			scene.setSceneName(_ctx.stringValue("ListRunnableScenesResponse.Scenes["+ i +"].SceneName"));
			scene.setDuration(_ctx.integerValue("ListRunnableScenesResponse.Scenes["+ i +"].Duration"));
			scene.setModifiedTime(_ctx.longValue("ListRunnableScenesResponse.Scenes["+ i +"].ModifiedTime"));

			scenes.add(scene);
		}
		listRunnableScenesResponse.setScenes(scenes);
	 
	 	return listRunnableScenesResponse;
	}
}