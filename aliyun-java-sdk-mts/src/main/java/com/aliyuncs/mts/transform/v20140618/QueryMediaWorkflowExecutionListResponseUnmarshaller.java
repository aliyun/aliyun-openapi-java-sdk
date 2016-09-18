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

import com.aliyuncs.mts.model.v20140618.QueryMediaWorkflowExecutionListResponse;
import com.aliyuncs.mts.model.v20140618.QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecution;
import com.aliyuncs.mts.model.v20140618.QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecution.Activity;
import com.aliyuncs.mts.model.v20140618.QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecution.Activity.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecution.Input;
import com.aliyuncs.mts.model.v20140618.QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecution.Input.InputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMediaWorkflowExecutionListResponseUnmarshaller {

	public static QueryMediaWorkflowExecutionListResponse unmarshall(QueryMediaWorkflowExecutionListResponse queryMediaWorkflowExecutionListResponse, UnmarshallerContext context) {
		
		queryMediaWorkflowExecutionListResponse.setRequestId(context.stringValue("QueryMediaWorkflowExecutionListResponse.RequestId"));

		List<String> nonExistRunIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryMediaWorkflowExecutionListResponse.NonExistRunIds.Length"); i++) {
			nonExistRunIds.add(context.stringValue("QueryMediaWorkflowExecutionListResponse.NonExistRunIds["+ i +"]"));
		}
		queryMediaWorkflowExecutionListResponse.setNonExistRunIds(nonExistRunIds);

		List<MediaWorkflowExecution> mediaWorkflowExecutionList = new ArrayList<MediaWorkflowExecution>();
		for (int i = 0; i < context.lengthValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList.Length"); i++) {
			MediaWorkflowExecution mediaWorkflowExecution = new MediaWorkflowExecution();
			mediaWorkflowExecution.setRunId(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].RunId"));
			mediaWorkflowExecution.setName(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].Name"));
			mediaWorkflowExecution.setState(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].State"));
			mediaWorkflowExecution.setMediaId(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].MediaId"));
			mediaWorkflowExecution.setCreationTime(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setUserData(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].Input.UserData"));

			InputFile inputFile = new InputFile();
			inputFile.setBucket(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].Input.InputFile.Bucket"));
			inputFile.setLocation(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].Input.InputFile.Location"));
			inputFile.setObject(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].Input.InputFile.Object"));
			input.setInputFile(inputFile);
			mediaWorkflowExecution.setInput(input);

			List<Activity> activityList = new ArrayList<Activity>();
			for (int j = 0; j < context.lengthValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].ActivityList.Length"); j++) {
				Activity activity = new Activity();
				activity.setName(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].Name"));
				activity.setType(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].Type"));
				activity.setJobId(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].JobId"));
				activity.setState(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].State"));
				activity.setCode(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].Code"));
				activity.setMessage(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].Message"));
				activity.setStartTime(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].StartTime"));
				activity.setEndTime(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].EndTime"));

				MNSMessageResult mNSMessageResult = new MNSMessageResult();
				mNSMessageResult.setMessageId(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].MNSMessageResult.MessageId"));
				mNSMessageResult.setErrorMessage(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].MNSMessageResult.ErrorMessage"));
				mNSMessageResult.setErrorCode(context.stringValue("QueryMediaWorkflowExecutionListResponse.MediaWorkflowExecutionList["+ i +"].ActivityList["+ j +"].MNSMessageResult.ErrorCode"));
				activity.setMNSMessageResult(mNSMessageResult);

				activityList.add(activity);
			}
			mediaWorkflowExecution.setActivityList(activityList);

			mediaWorkflowExecutionList.add(mediaWorkflowExecution);
		}
		queryMediaWorkflowExecutionListResponse.setMediaWorkflowExecutionList(mediaWorkflowExecutionList);
	 
	 	return queryMediaWorkflowExecutionListResponse;
	}
}