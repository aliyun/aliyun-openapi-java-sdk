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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsLiveMigrateEcsInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsLiveMigrateEcsInstanceResponse extends AcsResponse {

	private String sourceNcId;

	private String requestId;

	private String message;

	private String instanceId;

	private Long timeout;

	private Long rate;

	private String migrationId;

	private String code;

	private String success;

	private String destinationNcId;

	public String getSourceNcId() {
		return this.sourceNcId;
	}

	public void setSourceNcId(String sourceNcId) {
		this.sourceNcId = sourceNcId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Long getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
	}

	public Long getRate() {
		return this.rate;
	}

	public void setRate(Long rate) {
		this.rate = rate;
	}

	public String getMigrationId() {
		return this.migrationId;
	}

	public void setMigrationId(String migrationId) {
		this.migrationId = migrationId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getDestinationNcId() {
		return this.destinationNcId;
	}

	public void setDestinationNcId(String destinationNcId) {
		this.destinationNcId = destinationNcId;
	}

	@Override
	public OpsLiveMigrateEcsInstanceResponse getInstance(UnmarshallerContext context) {
		return	OpsLiveMigrateEcsInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
