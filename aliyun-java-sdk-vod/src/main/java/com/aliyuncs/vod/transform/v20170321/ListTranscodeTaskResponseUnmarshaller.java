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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListTranscodeTaskResponse;
import com.aliyuncs.vod.model.v20170321.ListTranscodeTaskResponse.TranscodeTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTranscodeTaskResponseUnmarshaller {

	public static ListTranscodeTaskResponse unmarshall(ListTranscodeTaskResponse listTranscodeTaskResponse, UnmarshallerContext context) {
		
		listTranscodeTaskResponse.setRequestId(context.stringValue("ListTranscodeTaskResponse.RequestId"));

		List<TranscodeTask> transcodeTaskList = new ArrayList<TranscodeTask>();
		for (int i = 0; i < context.lengthValue("ListTranscodeTaskResponse.TranscodeTaskList.Length"); i++) {
			TranscodeTask transcodeTask = new TranscodeTask();
			transcodeTask.setTranscodeTaskId(context.stringValue("ListTranscodeTaskResponse.TranscodeTaskList["+ i +"].TranscodeTaskId"));
			transcodeTask.setVideoId(context.stringValue("ListTranscodeTaskResponse.TranscodeTaskList["+ i +"].VideoId"));
			transcodeTask.setTaskStatus(context.stringValue("ListTranscodeTaskResponse.TranscodeTaskList["+ i +"].TaskStatus"));
			transcodeTask.setTranscodeTemplateGroupId(context.stringValue("ListTranscodeTaskResponse.TranscodeTaskList["+ i +"].TranscodeTemplateGroupId"));
			transcodeTask.setCreationTime(context.stringValue("ListTranscodeTaskResponse.TranscodeTaskList["+ i +"].CreationTime"));
			transcodeTask.setCompleteTime(context.stringValue("ListTranscodeTaskResponse.TranscodeTaskList["+ i +"].CompleteTime"));
			transcodeTask.setTrigger(context.stringValue("ListTranscodeTaskResponse.TranscodeTaskList["+ i +"].Trigger"));

			transcodeTaskList.add(transcodeTask);
		}
		listTranscodeTaskResponse.setTranscodeTaskList(transcodeTaskList);
	 
	 	return listTranscodeTaskResponse;
	}
}