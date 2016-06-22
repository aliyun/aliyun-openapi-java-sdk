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

import com.aliyuncs.mts.model.v20140618.StartMediaWorkflowExecutionResponse;
import com.aliyuncs.mts.model.v20140618.StartMediaWorkflowExecutionResponse.MediaWorkflowExecution;
import com.aliyuncs.mts.model.v20140618.StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.Activity;
import com.aliyuncs.mts.model.v20140618.StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.Input;
import com.aliyuncs.mts.model.v20140618.StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.Input.InputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartMediaWorkflowExecutionResponseUnmarshaller {

	public static StartMediaWorkflowExecutionResponse unmarshall(StartMediaWorkflowExecutionResponse startMediaWorkflowExecutionResponse, UnmarshallerContext context) {
		
		startMediaWorkflowExecutionResponse.setRequestId(context.stringValue("StartMediaWorkflowExecutionResponse.RequestId"));

		MediaWorkflowExecution mediaWorkflowExecution = new MediaWorkflowExecution();
		mediaWorkflowExecution.setRunId(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.RunId"));
		mediaWorkflowExecution.setName(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.Name"));
		mediaWorkflowExecution.setState(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.State"));
		mediaWorkflowExecution.setMediaId(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.MediaId"));
		mediaWorkflowExecution.setCreationTime(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.CreationTime"));

		Input input = new Input();
		input.setUserData(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.Input.UserData"));

		InputFile inputFile = new InputFile();
		inputFile.setBucket(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.Input.InputFile.Bucket"));
		inputFile.setLocation(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.Input.InputFile.Location"));
		inputFile.setObject(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.Input.InputFile.Object"));
		input.setInputFile(inputFile);
		mediaWorkflowExecution.setInput(input);

		List<Activity> activityList = new ArrayList<Activity>();
		for (int i = 0; i < context.lengthValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.ActivityList.Length"); i++) {
			Activity activity = new Activity();
			activity.setName(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.ActivityList["+ i +"].Name"));
			activity.setType(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.ActivityList["+ i +"].Type"));
			activity.setJobId(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.ActivityList["+ i +"].JobId"));
			activity.setState(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.ActivityList["+ i +"].State"));
			activity.setCode(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.ActivityList["+ i +"].Code"));
			activity.setMessage(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.ActivityList["+ i +"].Message"));
			activity.setStartTime(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.ActivityList["+ i +"].StartTime"));
			activity.setEndTime(context.stringValue("StartMediaWorkflowExecutionResponse.MediaWorkflowExecution.ActivityList["+ i +"].EndTime"));

			activityList.add(activity);
		}
		mediaWorkflowExecution.setActivityList(activityList);
		startMediaWorkflowExecutionResponse.setMediaWorkflowExecution(mediaWorkflowExecution);
	 
	 	return startMediaWorkflowExecutionResponse;
	}
}