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

import com.aliyuncs.pts.model.v20201020.ListOpenJMeterScenesResponse;
import com.aliyuncs.pts.model.v20201020.ListOpenJMeterScenesResponse.JMeterSceneItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOpenJMeterScenesResponseUnmarshaller {

	public static ListOpenJMeterScenesResponse unmarshall(ListOpenJMeterScenesResponse listOpenJMeterScenesResponse, UnmarshallerContext _ctx) {
		
		listOpenJMeterScenesResponse.setRequestId(_ctx.stringValue("ListOpenJMeterScenesResponse.RequestId"));
		listOpenJMeterScenesResponse.setMessage(_ctx.stringValue("ListOpenJMeterScenesResponse.Message"));
		listOpenJMeterScenesResponse.setHttpStatusCode(_ctx.integerValue("ListOpenJMeterScenesResponse.HttpStatusCode"));
		listOpenJMeterScenesResponse.setCode(_ctx.stringValue("ListOpenJMeterScenesResponse.Code"));
		listOpenJMeterScenesResponse.setSuccess(_ctx.booleanValue("ListOpenJMeterScenesResponse.Success"));
		listOpenJMeterScenesResponse.setPageNumber(_ctx.integerValue("ListOpenJMeterScenesResponse.PageNumber"));
		listOpenJMeterScenesResponse.setPageSize(_ctx.integerValue("ListOpenJMeterScenesResponse.PageSize"));
		listOpenJMeterScenesResponse.setTotalCount(_ctx.longValue("ListOpenJMeterScenesResponse.TotalCount"));

		List<JMeterSceneItem> jMeterScene = new ArrayList<JMeterSceneItem>();
		for (int i = 0; i < _ctx.lengthValue("ListOpenJMeterScenesResponse.JMeterScene.Length"); i++) {
			JMeterSceneItem jMeterSceneItem = new JMeterSceneItem();
			jMeterSceneItem.setDurationStr(_ctx.stringValue("ListOpenJMeterScenesResponse.JMeterScene["+ i +"].DurationStr"));
			jMeterSceneItem.setSceneId(_ctx.stringValue("ListOpenJMeterScenesResponse.JMeterScene["+ i +"].SceneId"));
			jMeterSceneItem.setSceneName(_ctx.stringValue("ListOpenJMeterScenesResponse.JMeterScene["+ i +"].SceneName"));

			jMeterScene.add(jMeterSceneItem);
		}
		listOpenJMeterScenesResponse.setJMeterScene(jMeterScene);
	 
	 	return listOpenJMeterScenesResponse;
	}
}