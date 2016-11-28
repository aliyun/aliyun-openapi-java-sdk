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
package com.aliyuncs.green.model.v20161124;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SampleFeedbackRequest extends RpcAcsRequest<SampleFeedbackResponse> {
	
	public SampleFeedbackRequest() {
		super("Green", "2016-11-24", "SampleFeedback", "green");
		setMethod(MethodType.POST);
	}

	private String marking;

	private String category;

	private List<String> taskIds;

	public String getMarking() {
		return this.marking;
	}

	public void setMarking(String marking) {
		this.marking = marking;
		putQueryParameter("Marking", marking);
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		putQueryParameter("Category", category);
	}

	public List<String> getTaskIds() {
		return this.taskIds;
	}

	public void setTaskIds(List<String> taskIds) {
		this.taskIds = taskIds;	
		for (int i = 0; i < taskIds.size(); i++) {
			putQueryParameter("TaskId." + (i + 1) , taskIds.get(i));
		}	
	}

	@Override
	public Class<SampleFeedbackResponse> getResponseClass() {
		return SampleFeedbackResponse.class;
	}

}
