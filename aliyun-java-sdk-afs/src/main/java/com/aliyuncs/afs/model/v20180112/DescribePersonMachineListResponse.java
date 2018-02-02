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
package com.aliyuncs.afs.model.v20180112;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.afs.transform.v20180112.DescribePersonMachineListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePersonMachineListResponse extends AcsResponse {

	private String requestId;

	private String bizCode;

	private PersonMachineRes personMachineRes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public PersonMachineRes getPersonMachineRes() {
		return this.personMachineRes;
	}

	public void setPersonMachineRes(PersonMachineRes personMachineRes) {
		this.personMachineRes = personMachineRes;
	}

	public static class PersonMachineRes {

		private String hasConfiguration;

		private List<PersonMachine> personMachines;

		public String getHasConfiguration() {
			return this.hasConfiguration;
		}

		public void setHasConfiguration(String hasConfiguration) {
			this.hasConfiguration = hasConfiguration;
		}

		public List<PersonMachine> getPersonMachines() {
			return this.personMachines;
		}

		public void setPersonMachines(List<PersonMachine> personMachines) {
			this.personMachines = personMachines;
		}

		public static class PersonMachine {

			private String configurationName;

			private String appkey;

			private String configurationMethod;

			private String applyType;

			private String scene;

			private String lastUpdate;

			public String getConfigurationName() {
				return this.configurationName;
			}

			public void setConfigurationName(String configurationName) {
				this.configurationName = configurationName;
			}

			public String getAppkey() {
				return this.appkey;
			}

			public void setAppkey(String appkey) {
				this.appkey = appkey;
			}

			public String getConfigurationMethod() {
				return this.configurationMethod;
			}

			public void setConfigurationMethod(String configurationMethod) {
				this.configurationMethod = configurationMethod;
			}

			public String getApplyType() {
				return this.applyType;
			}

			public void setApplyType(String applyType) {
				this.applyType = applyType;
			}

			public String getScene() {
				return this.scene;
			}

			public void setScene(String scene) {
				this.scene = scene;
			}

			public String getLastUpdate() {
				return this.lastUpdate;
			}

			public void setLastUpdate(String lastUpdate) {
				this.lastUpdate = lastUpdate;
			}
		}
	}

	@Override
	public DescribePersonMachineListResponse getInstance(UnmarshallerContext context) {
		return	DescribePersonMachineListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
