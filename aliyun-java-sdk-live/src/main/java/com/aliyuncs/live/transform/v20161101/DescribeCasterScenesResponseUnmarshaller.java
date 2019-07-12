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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeCasterScenesResponse;
import com.aliyuncs.live.model.v20161101.DescribeCasterScenesResponse.Scene;
import com.aliyuncs.live.model.v20161101.DescribeCasterScenesResponse.Scene.StreamInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterScenesResponseUnmarshaller {

	public static DescribeCasterScenesResponse unmarshall(DescribeCasterScenesResponse describeCasterScenesResponse, UnmarshallerContext _ctx) {
		
		describeCasterScenesResponse.setRequestId(_ctx.stringValue("DescribeCasterScenesResponse.RequestId"));
		describeCasterScenesResponse.setTotal(_ctx.integerValue("DescribeCasterScenesResponse.Total"));

		List<Scene> sceneList = new ArrayList<Scene>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasterScenesResponse.SceneList.Length"); i++) {
			Scene scene = new Scene();
			scene.setSceneId(_ctx.stringValue("DescribeCasterScenesResponse.SceneList["+ i +"].SceneId"));
			scene.setSceneName(_ctx.stringValue("DescribeCasterScenesResponse.SceneList["+ i +"].SceneName"));
			scene.setOutputType(_ctx.stringValue("DescribeCasterScenesResponse.SceneList["+ i +"].OutputType"));
			scene.setLayoutId(_ctx.stringValue("DescribeCasterScenesResponse.SceneList["+ i +"].LayoutId"));
			scene.setStreamUrl(_ctx.stringValue("DescribeCasterScenesResponse.SceneList["+ i +"].StreamUrl"));
			scene.setStatus(_ctx.integerValue("DescribeCasterScenesResponse.SceneList["+ i +"].Status"));

			List<String> componentIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCasterScenesResponse.SceneList["+ i +"].ComponentIds.Length"); j++) {
				componentIds.add(_ctx.stringValue("DescribeCasterScenesResponse.SceneList["+ i +"].ComponentIds["+ j +"]"));
			}
			scene.setComponentIds(componentIds);

			List<StreamInfo> streamInfos = new ArrayList<StreamInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCasterScenesResponse.SceneList["+ i +"].StreamInfos.Length"); j++) {
				StreamInfo streamInfo = new StreamInfo();
				streamInfo.setTranscodeConfig(_ctx.stringValue("DescribeCasterScenesResponse.SceneList["+ i +"].StreamInfos["+ j +"].TranscodeConfig"));
				streamInfo.setVideoFormat(_ctx.stringValue("DescribeCasterScenesResponse.SceneList["+ i +"].StreamInfos["+ j +"].VideoFormat"));
				streamInfo.setOutputStreamUrl(_ctx.stringValue("DescribeCasterScenesResponse.SceneList["+ i +"].StreamInfos["+ j +"].OutputStreamUrl"));

				streamInfos.add(streamInfo);
			}
			scene.setStreamInfos(streamInfos);

			sceneList.add(scene);
		}
		describeCasterScenesResponse.setSceneList(sceneList);
	 
	 	return describeCasterScenesResponse;
	}
}