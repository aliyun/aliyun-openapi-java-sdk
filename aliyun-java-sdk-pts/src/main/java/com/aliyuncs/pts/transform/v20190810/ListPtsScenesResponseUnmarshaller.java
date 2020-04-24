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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.ListPtsScenesResponse;
import com.aliyuncs.pts.model.v20190810.ListPtsScenesResponse.Scene;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPtsScenesResponseUnmarshaller {

	public static ListPtsScenesResponse unmarshall(ListPtsScenesResponse listPtsScenesResponse, UnmarshallerContext _ctx) {
		
		listPtsScenesResponse.setRequestId(_ctx.stringValue("ListPtsScenesResponse.RequestId"));
		listPtsScenesResponse.setCode(_ctx.stringValue("ListPtsScenesResponse.Code"));
		listPtsScenesResponse.setMessage(_ctx.stringValue("ListPtsScenesResponse.Message"));
		listPtsScenesResponse.setSuccess(_ctx.booleanValue("ListPtsScenesResponse.Success"));
		listPtsScenesResponse.setPageNumber(_ctx.integerValue("ListPtsScenesResponse.PageNumber"));
		listPtsScenesResponse.setPageSize(_ctx.integerValue("ListPtsScenesResponse.PageSize"));
		listPtsScenesResponse.setTotalCount(_ctx.longValue("ListPtsScenesResponse.TotalCount"));

		List<Scene> scenes = new ArrayList<Scene>();
		for (int i = 0; i < _ctx.lengthValue("ListPtsScenesResponse.Scenes.Length"); i++) {
			Scene scene = new Scene();
			scene.setSceneId(_ctx.stringValue("ListPtsScenesResponse.Scenes["+ i +"].SceneId"));
			scene.setSceneName(_ctx.stringValue("ListPtsScenesResponse.Scenes["+ i +"].SceneName"));
			scene.setDuration(_ctx.integerValue("ListPtsScenesResponse.Scenes["+ i +"].Duration"));
			scene.setModifiedTime(_ctx.longValue("ListPtsScenesResponse.Scenes["+ i +"].ModifiedTime"));
			scene.setSceneType(_ctx.stringValue("ListPtsScenesResponse.Scenes["+ i +"].SceneType"));
			scene.setCronable(_ctx.booleanValue("ListPtsScenesResponse.Scenes["+ i +"].Cronable"));
			scene.setStatus(_ctx.stringValue("ListPtsScenesResponse.Scenes["+ i +"].Status"));

			scenes.add(scene);
		}
		listPtsScenesResponse.setScenes(scenes);
	 
	 	return listPtsScenesResponse;
	}
}