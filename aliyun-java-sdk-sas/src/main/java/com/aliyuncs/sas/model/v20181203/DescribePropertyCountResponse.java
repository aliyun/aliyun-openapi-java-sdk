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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribePropertyCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePropertyCountResponse extends AcsResponse {

	private String requestId;

	private Integer port;

	private Integer process;

	private Integer software;

	private Integer user;

	private Integer cron;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public Integer getProcess() {
		return this.process;
	}

	public void setProcess(Integer process) {
		this.process = process;
	}

	public Integer getSoftware() {
		return this.software;
	}

	public void setSoftware(Integer software) {
		this.software = software;
	}

	public Integer getUser() {
		return this.user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getCron() {
		return this.cron;
	}

	public void setCron(Integer cron) {
		this.cron = cron;
	}

	@Override
	public DescribePropertyCountResponse getInstance(UnmarshallerContext context) {
		return	DescribePropertyCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
