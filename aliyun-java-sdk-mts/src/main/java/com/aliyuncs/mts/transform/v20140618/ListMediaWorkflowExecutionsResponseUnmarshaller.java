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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListMediaWorkflowExecutionsResponse;
import com.aliyuncs.mts.model.v20140618.ListMediaWorkflowExecutionsResponse.MediaWorkflowExecution;
import com.aliyuncs.mts.model.v20140618.ListMediaWorkflowExecutionsResponse.MediaWorkflowExecution.Activity;
import com.aliyuncs.mts.model.v20140618.ListMediaWorkflowExecutionsResponse.MediaWorkflowExecution.Activity.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.ListMediaWorkflowExecutionsResponse.MediaWorkflowExecution.Input;
import com.aliyuncs.mts.model.v20140618.ListMediaWorkflowExecutionsResponse.MediaWorkflowExecution.Input.InputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMediaWorkflowExecutionsResponseUnmarshaller {

	public static ListMediaWorkflowExecutionsResponse unmarshall(ListMediaWorkflowExecutionsResponse listMediaWorkflowExecutionsResponse, UnmarshallerContext _ctx) {
		
		listMediaWorkflowExecutionsResponse.setRequestId(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.RequestId"));
		listMediaWorkflowExecutionsResponse.setNextPageToken(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.NextPageToken"));

		List<MediaWorkflowExecution> mediaWorkflowExecutionList = new ArrayList<MediaWorkflowExecution>();
		for (int i = 0; i < _ctx.lengthValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList.Length"); i++) {
			MediaWorkflowExecution mediaWorkflowExecution = new MediaWorkflowExecution();
			mediaWorkflowExecution.setCreationTime(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].CreationTime"));
			mediaWorkflowExecution.setMediaWorkflowId(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].MediaWorkflowId"));
			mediaWorkflowExecution.setState(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].State"));
			mediaWorkflowExecution.setName(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].Name"));
			mediaWorkflowExecution.setMediaId(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].MediaId"));
			mediaWorkflowExecution.setRunId(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].RunId"));

			Input input = new Input();
			input.setUserData(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].Input.UserData"));

			InputFile inputFile = new InputFile();
			inputFile.setObject(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].Input.InputFile.Object"));
			inputFile.setLocation(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].Input.InputFile.Location"));
			inputFile.setBucket(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].Input.InputFile.Bucket"));
			input.setInputFile(inputFile);
			mediaWorkflowExecution.setInput(input);

			List<Activity> activityList = new ArrayList<Activity>();
			for (int j = 0; j < _ctx.lengthValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList.Length"); j++) {
				Activity activity = new Activity();
				activity.setEndTime(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].EndTime"));
				activity.setType(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].Type"));
				activity.setStartTime(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].StartTime"));
				activity.setState(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].State"));
				activity.setJobId(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].JobId"));
				activity.setCode(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].Code"));
				activity.setMessage(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].Message"));
				activity.setName(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].Name"));

				MNSMessageResult mNSMessageResult = new MNSMessageResult();
				mNSMessageResult.setMessageId(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].MNSMessageResult.MessageId"));
				mNSMessageResult.setErrorMessage(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].MNSMessageResult.ErrorMessage"));
				mNSMessageResult.setErrorCode(_ctx.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].MNSMessageResult.ErrorCode"));
				activity.setMNSMessageResult(mNSMessageResult);

				activityList.add(activity);
			}
			mediaWorkflowExecution.setActivityList(activityList);

			mediaWorkflowExecutionList.add(mediaWorkflowExecution);
		}
		listMediaWorkflowExecutionsResponse.setMediaWorkflowExecutionList(mediaWorkflowExecutionList);
	 
	 	return listMediaWorkflowExecutionsResponse;
	}
}