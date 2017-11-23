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
package com.aliyuncs.cds.model.v20170925;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetBuildsRequest extends RoaAcsRequest<GetBuildsResponse> {
	
	public GetBuildsRequest() {
		super("Cds", "2017-09-25", "GetBuilds");
		setUriPattern("/v1/job/[JobName]/builds");
		setMethod(MethodType.GET);
	}

	private Integer start;

	private Integer numberPerPage;

	private String jobName;

	public Integer getStart() {
		return this.start;
	}

	public void setStart(Integer start) {
		this.start = start;
		if(start != null){
			putQueryParameter("Start", start.toString());
		}
	}

	public Integer getNumberPerPage() {
		return this.numberPerPage;
	}

	public void setNumberPerPage(Integer numberPerPage) {
		this.numberPerPage = numberPerPage;
		if(numberPerPage != null){
			putQueryParameter("NumberPerPage", numberPerPage.toString());
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putPathParameter("JobName", jobName);
		}
	}

	@Override
	public Class<GetBuildsResponse> getResponseClass() {
		return GetBuildsResponse.class;
	}

}
