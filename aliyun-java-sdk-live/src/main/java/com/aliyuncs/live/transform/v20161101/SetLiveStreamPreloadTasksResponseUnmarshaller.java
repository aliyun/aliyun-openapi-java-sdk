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

import com.aliyuncs.live.model.v20161101.SetLiveStreamPreloadTasksResponse;
import com.aliyuncs.live.model.v20161101.SetLiveStreamPreloadTasksResponse.PreloadTasksMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetLiveStreamPreloadTasksResponseUnmarshaller {

	public static SetLiveStreamPreloadTasksResponse unmarshall(SetLiveStreamPreloadTasksResponse setLiveStreamPreloadTasksResponse, UnmarshallerContext _ctx) {
		
		setLiveStreamPreloadTasksResponse.setRequestId(_ctx.stringValue("SetLiveStreamPreloadTasksResponse.RequestId"));
		setLiveStreamPreloadTasksResponse.setFailedURL(_ctx.integerValue("SetLiveStreamPreloadTasksResponse.FailedURL"));
		setLiveStreamPreloadTasksResponse.setStatus(_ctx.stringValue("SetLiveStreamPreloadTasksResponse.Status"));
		setLiveStreamPreloadTasksResponse.setSuccessURL(_ctx.integerValue("SetLiveStreamPreloadTasksResponse.SuccessURL"));
		setLiveStreamPreloadTasksResponse.setTotalURL(_ctx.integerValue("SetLiveStreamPreloadTasksResponse.TotalURL"));

		List<PreloadTasksMessage> preloadTasksMessages = new ArrayList<PreloadTasksMessage>();
		for (int i = 0; i < _ctx.lengthValue("SetLiveStreamPreloadTasksResponse.PreloadTasksMessages.Length"); i++) {
			PreloadTasksMessage preloadTasksMessage = new PreloadTasksMessage();
			preloadTasksMessage.setDescription(_ctx.stringValue("SetLiveStreamPreloadTasksResponse.PreloadTasksMessages["+ i +"].Description"));
			preloadTasksMessage.setPlayUrl(_ctx.stringValue("SetLiveStreamPreloadTasksResponse.PreloadTasksMessages["+ i +"].PlayUrl"));
			preloadTasksMessage.setTaskId(_ctx.stringValue("SetLiveStreamPreloadTasksResponse.PreloadTasksMessages["+ i +"].TaskId"));

			preloadTasksMessages.add(preloadTasksMessage);
		}
		setLiveStreamPreloadTasksResponse.setPreloadTasksMessages(preloadTasksMessages);
	 
	 	return setLiveStreamPreloadTasksResponse;
	}
}