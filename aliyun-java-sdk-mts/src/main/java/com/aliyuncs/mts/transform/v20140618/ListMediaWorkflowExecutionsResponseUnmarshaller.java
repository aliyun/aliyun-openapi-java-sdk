/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
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

	public static ListMediaWorkflowExecutionsResponse unmarshall(ListMediaWorkflowExecutionsResponse listMediaWorkflowExecutionsResponse, UnmarshallerContext context) {
		
		listMediaWorkflowExecutionsResponse.setRequestId(context.stringValue("ListMediaWorkflowExecutionsResponse.RequestId"));
		listMediaWorkflowExecutionsResponse.setNextPageToken(context.stringValue("ListMediaWorkflowExecutionsResponse.NextPageToken"));

		List<MediaWorkflowExecution> mediaWorkflowExecutionList = new ArrayList<MediaWorkflowExecution>();
		for (int i = 0; i < context.lengthValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList.Length"); i++) {
			MediaWorkflowExecution mediaWorkflowExecution = new MediaWorkflowExecution();
			mediaWorkflowExecution.setRunId(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].RunId"));
			mediaWorkflowExecution.setName(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].Name"));
			mediaWorkflowExecution.setState(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].State"));
			mediaWorkflowExecution.setMediaId(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].MediaId"));
			mediaWorkflowExecution.setCreationTime(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setUserData(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].Input.UserData"));

			InputFile inputFile = new InputFile();
			inputFile.setBucket(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].Input.InputFile.Bucket"));
			inputFile.setLocation(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].Input.InputFile.Location"));
			inputFile.setObject(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].Input.InputFile.Object"));
			input.setInputFile(inputFile);
			mediaWorkflowExecution.setInput(input);

			List<Activity> activityList = new ArrayList<Activity>();
			for (int j = 0; j < context.lengthValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList.Length"); j++) {
				Activity activity = new Activity();
				activity.setName(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].Name"));
				activity.setType(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].Type"));
				activity.setJobId(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].JobId"));
				activity.setState(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].State"));
				activity.setCode(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].Code"));
				activity.setMessage(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].Message"));
				activity.setStartTime(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].StartTime"));
				activity.setEndTime(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].EndTime"));

				MNSMessageResult mNSMessageResult = new MNSMessageResult();
				mNSMessageResult.setMessageId(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].MNSMessageResult.MessageId"));
				mNSMessageResult.setErrorMessage(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].MNSMessageResult.ErrorMessage"));
				mNSMessageResult.setErrorCode(context.stringValue("ListMediaWorkflowExecutionsResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].MNSMessageResult.ErrorCode"));
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