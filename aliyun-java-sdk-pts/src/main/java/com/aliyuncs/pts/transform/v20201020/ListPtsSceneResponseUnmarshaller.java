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

import com.aliyuncs.pts.model.v20201020.ListPtsSceneResponse;
import com.aliyuncs.pts.model.v20201020.ListPtsSceneResponse.SceneView;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPtsSceneResponseUnmarshaller {

	public static ListPtsSceneResponse unmarshall(ListPtsSceneResponse listPtsSceneResponse, UnmarshallerContext _ctx) {
		
		listPtsSceneResponse.setRequestId(_ctx.stringValue("ListPtsSceneResponse.RequestId"));
		listPtsSceneResponse.setSuccess(_ctx.booleanValue("ListPtsSceneResponse.Success"));
		listPtsSceneResponse.setCode(_ctx.stringValue("ListPtsSceneResponse.Code"));
		listPtsSceneResponse.setMessage(_ctx.stringValue("ListPtsSceneResponse.Message"));
		listPtsSceneResponse.setHttpStatusCode(_ctx.integerValue("ListPtsSceneResponse.HttpStatusCode"));

		List<SceneView> sceneViewList = new ArrayList<SceneView>();
		for (int i = 0; i < _ctx.lengthValue("ListPtsSceneResponse.SceneViewList.Length"); i++) {
			SceneView sceneView = new SceneView();
			sceneView.setSceneId(_ctx.stringValue("ListPtsSceneResponse.SceneViewList["+ i +"].SceneId"));
			sceneView.setSceneName(_ctx.stringValue("ListPtsSceneResponse.SceneViewList["+ i +"].SceneName"));
			sceneView.setCreateTime(_ctx.longValue("ListPtsSceneResponse.SceneViewList["+ i +"].CreateTime"));

			sceneViewList.add(sceneView);
		}
		listPtsSceneResponse.setSceneViewList(sceneViewList);
	 
	 	return listPtsSceneResponse;
	}
}