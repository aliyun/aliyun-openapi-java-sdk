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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterTDEResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterTDEResponse extends AcsResponse {

	private String automaticRotation;

	private String dBClusterId;

	private String encryptNewTables;

	private String encryptionKey;

	private String requestId;

	private String rotationInterval;

	private String tDERegion;

	private String tDEStatus;

	public String getAutomaticRotation() {
		return this.automaticRotation;
	}

	public void setAutomaticRotation(String automaticRotation) {
		this.automaticRotation = automaticRotation;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getEncryptNewTables() {
		return this.encryptNewTables;
	}

	public void setEncryptNewTables(String encryptNewTables) {
		this.encryptNewTables = encryptNewTables;
	}

	public String getEncryptionKey() {
		return this.encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRotationInterval() {
		return this.rotationInterval;
	}

	public void setRotationInterval(String rotationInterval) {
		this.rotationInterval = rotationInterval;
	}

	public String getTDERegion() {
		return this.tDERegion;
	}

	public void setTDERegion(String tDERegion) {
		this.tDERegion = tDERegion;
	}

	public String getTDEStatus() {
		return this.tDEStatus;
	}

	public void setTDEStatus(String tDEStatus) {
		this.tDEStatus = tDEStatus;
	}

	@Override
	public DescribeDBClusterTDEResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterTDEResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
