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
import com.aliyuncs.rds.transform.v20140815.CheckResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckResourceResponse extends AcsResponse {

	private String requestId;

	private String specifyCount;

	private List<Resource> resources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSpecifyCount() {
		return this.specifyCount;
	}

	public void setSpecifyCount(String specifyCount) {
		this.specifyCount = specifyCount;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private String dBInstanceAvailable;

		private String engine;

		private String engineVersion;

		public String getDBInstanceAvailable() {
			return this.dBInstanceAvailable;
		}

		public void setDBInstanceAvailable(String dBInstanceAvailable) {
			this.dBInstanceAvailable = dBInstanceAvailable;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}
	}

	@Override
	public CheckResourceResponse getInstance(UnmarshallerContext context) {
		return	CheckResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
