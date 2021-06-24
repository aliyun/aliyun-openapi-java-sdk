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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryLiveMigrateEcsInstanceHouyiInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse extends AcsResponse {

	private String status;

	private String sourceNcId;

	private String message;

	private String requestId;

	private String instanceId;

	private Long timeout;

	private Long rate;

	private Long migrationId;

	private String code;

	private String success;

	private String sourceNcMigStatus;

	private String destinationNcMigStatus;

	private Long resultCode;

	private String destinationNcId;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSourceNcId() {
		return this.sourceNcId;
	}

	public void setSourceNcId(String sourceNcId) {
		this.sourceNcId = sourceNcId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Long getMigrationId() {
		return this.migrationId;
	}

	public void setMigrationId(Long migrationId) {
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

	public String getSourceNcMigStatus() {
		return this.sourceNcMigStatus;
	}

	public void setSourceNcMigStatus(String sourceNcMigStatus) {
		this.sourceNcMigStatus = sourceNcMigStatus;
	}

	public String getDestinationNcMigStatus() {
		return this.destinationNcMigStatus;
	}

	public void setDestinationNcMigStatus(String destinationNcMigStatus) {
		this.destinationNcMigStatus = destinationNcMigStatus;
	}

	public Long getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(Long resultCode) {
		this.resultCode = resultCode;
	}

	public String getDestinationNcId() {
		return this.destinationNcId;
	}

	public void setDestinationNcId(String destinationNcId) {
		this.destinationNcId = destinationNcId;
	}

	@Override
	public OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryLiveMigrateEcsInstanceHouyiInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
