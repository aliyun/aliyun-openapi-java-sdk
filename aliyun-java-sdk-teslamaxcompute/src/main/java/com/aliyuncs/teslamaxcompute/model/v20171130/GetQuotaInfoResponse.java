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
package com.aliyuncs.teslamaxcompute.model.v20171130;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.teslamaxcompute.transform.v20171130.GetQuotaInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQuotaInfoResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String request_id;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequest_id() {
		return this.request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private List<Instance> detail;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<Instance> getDetail() {
			return this.detail;
		}

		public void setDetail(List<Instance> detail) {
			this.detail = detail;
		}

		public static class Instance {

			private String project;

			private String instanceid;

			private String status;

			private String userAccount;

			private String chName;

			private String cluster;

			private String runTime;

			public String getProject() {
				return this.project;
			}

			public void setProject(String project) {
				this.project = project;
			}

			public String getInstanceid() {
				return this.instanceid;
			}

			public void setInstanceid(String instanceid) {
				this.instanceid = instanceid;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getUserAccount() {
				return this.userAccount;
			}

			public void setUserAccount(String userAccount) {
				this.userAccount = userAccount;
			}

			public String getChName() {
				return this.chName;
			}

			public void setChName(String chName) {
				this.chName = chName;
			}

			public String getCluster() {
				return this.cluster;
			}

			public void setCluster(String cluster) {
				this.cluster = cluster;
			}

			public String getRunTime() {
				return this.runTime;
			}

			public void setRunTime(String runTime) {
				this.runTime = runTime;
			}
		}
	}

	@Override
	public GetQuotaInfoResponse getInstance(UnmarshallerContext context) {
		return	GetQuotaInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
