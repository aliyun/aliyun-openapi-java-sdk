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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceReplicationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceReplicationResponse extends AcsResponse {

	private String requestId;

	private String externalReplication;

	private String replicationSource;

	private String replicationState;

	private String replicationDelay;

	private String replicationErrorMessage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getExternalReplication() {
		return this.externalReplication;
	}

	public void setExternalReplication(String externalReplication) {
		this.externalReplication = externalReplication;
	}

	public String getReplicationSource() {
		return this.replicationSource;
	}

	public void setReplicationSource(String replicationSource) {
		this.replicationSource = replicationSource;
	}

	public String getReplicationState() {
		return this.replicationState;
	}

	public void setReplicationState(String replicationState) {
		this.replicationState = replicationState;
	}

	public String getReplicationDelay() {
		return this.replicationDelay;
	}

	public void setReplicationDelay(String replicationDelay) {
		this.replicationDelay = replicationDelay;
	}

	public String getReplicationErrorMessage() {
		return this.replicationErrorMessage;
	}

	public void setReplicationErrorMessage(String replicationErrorMessage) {
		this.replicationErrorMessage = replicationErrorMessage;
	}

	@Override
	public DescribeDBInstanceReplicationResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceReplicationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
