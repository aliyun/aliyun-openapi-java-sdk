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

import com.aliyuncs.live.model.v20161101.StartCasterResponse;
import com.aliyuncs.live.model.v20161101.StartCasterResponse.SceneInfo;
import com.aliyuncs.live.model.v20161101.StartCasterResponse.SceneInfo1;
import com.aliyuncs.live.model.v20161101.StartCasterResponse.SceneInfo1.StreamInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartCasterResponseUnmarshaller {

	public static StartCasterResponse unmarshall(StartCasterResponse startCasterResponse, UnmarshallerContext _ctx) {
		
		startCasterResponse.setRequestId(_ctx.stringValue("StartCasterResponse.RequestId"));

		List<SceneInfo> pvwSceneInfos = new ArrayList<SceneInfo>();
		for (int i = 0; i < _ctx.lengthValue("StartCasterResponse.PvwSceneInfos.Length"); i++) {
			SceneInfo sceneInfo = new SceneInfo();
			sceneInfo.setSceneId(_ctx.stringValue("StartCasterResponse.PvwSceneInfos["+ i +"].SceneId"));
			sceneInfo.setStreamUrl(_ctx.stringValue("StartCasterResponse.PvwSceneInfos["+ i +"].StreamUrl"));

			pvwSceneInfos.add(sceneInfo);
		}
		startCasterResponse.setPvwSceneInfos(pvwSceneInfos);

		List<SceneInfo1> pgmSceneInfos = new ArrayList<SceneInfo1>();
		for (int i = 0; i < _ctx.lengthValue("StartCasterResponse.PgmSceneInfos.Length"); i++) {
			SceneInfo1 sceneInfo1 = new SceneInfo1();
			sceneInfo1.setSceneId(_ctx.stringValue("StartCasterResponse.PgmSceneInfos["+ i +"].SceneId"));
			sceneInfo1.setStreamUrl(_ctx.stringValue("StartCasterResponse.PgmSceneInfos["+ i +"].StreamUrl"));

			List<StreamInfo> streamInfos = new ArrayList<StreamInfo>();
			for (int j = 0; j < _ctx.lengthValue("StartCasterResponse.PgmSceneInfos["+ i +"].StreamInfos.Length"); j++) {
				StreamInfo streamInfo = new StreamInfo();
				streamInfo.setTranscodeConfig(_ctx.stringValue("StartCasterResponse.PgmSceneInfos["+ i +"].StreamInfos["+ j +"].TranscodeConfig"));
				streamInfo.setVideoFormat(_ctx.stringValue("StartCasterResponse.PgmSceneInfos["+ i +"].StreamInfos["+ j +"].VideoFormat"));
				streamInfo.setOutputStreamUrl(_ctx.stringValue("StartCasterResponse.PgmSceneInfos["+ i +"].StreamInfos["+ j +"].OutputStreamUrl"));

				streamInfos.add(streamInfo);
			}
			sceneInfo1.setStreamInfos(streamInfos);

			pgmSceneInfos.add(sceneInfo1);
		}
		startCasterResponse.setPgmSceneInfos(pgmSceneInfos);
	 
	 	return startCasterResponse;
	}
}