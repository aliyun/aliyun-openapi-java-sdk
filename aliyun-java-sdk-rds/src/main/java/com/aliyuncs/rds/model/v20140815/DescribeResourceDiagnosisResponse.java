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
package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeResourceDiagnosisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceDiagnosisResponse extends AcsResponse {

	private String requestId;

	private String startTime;

	private String endTime;

	private List<String> cPU;

	private List<String> memory;

	private List<String> storage;

	private List<String> iOPS;

	private List<String> connection;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<String> getCPU() {
		return this.cPU;
	}

	public void setCPU(List<String> cPU) {
		this.cPU = cPU;
	}

	public List<String> getMemory() {
		return this.memory;
	}

	public void setMemory(List<String> memory) {
		this.memory = memory;
	}

	public List<String> getStorage() {
		return this.storage;
	}

	public void setStorage(List<String> storage) {
		this.storage = storage;
	}

	public List<String> getIOPS() {
		return this.iOPS;
	}

	public void setIOPS(List<String> iOPS) {
		this.iOPS = iOPS;
	}

	public List<String> getConnection() {
		return this.connection;
	}

	public void setConnection(List<String> connection) {
		this.connection = connection;
	}

	@Override
	public DescribeResourceDiagnosisResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceDiagnosisResponseUnmarshaller.unmarshall(this, context);
	}
}
