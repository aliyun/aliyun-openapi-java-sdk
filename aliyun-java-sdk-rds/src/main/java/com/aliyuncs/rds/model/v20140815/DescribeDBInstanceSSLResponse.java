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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceSSLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceSSLResponse extends AcsResponse {

	private String serverCert;

	private String clientCACertExpireTime;

	private String requireUpdateItem;

	private String serverCAUrl;

	private String requireUpdate;

	private String clientCertRevocationList;

	private String sSLExpireTime;

	private String cAType;

	private String sSLCreateTime;

	private String replicationACL;

	private String aCL;

	private String requestId;

	private String lastModifyStatus;

	private String sSLEnabled;

	private String connectionString;

	private String requireUpdateReason;

	private String clientCACert;

	private String serverKey;

	private String modifyStatusReason;

	public String getServerCert() {
		return this.serverCert;
	}

	public void setServerCert(String serverCert) {
		this.serverCert = serverCert;
	}

	public String getClientCACertExpireTime() {
		return this.clientCACertExpireTime;
	}

	public void setClientCACertExpireTime(String clientCACertExpireTime) {
		this.clientCACertExpireTime = clientCACertExpireTime;
	}

	public String getRequireUpdateItem() {
		return this.requireUpdateItem;
	}

	public void setRequireUpdateItem(String requireUpdateItem) {
		this.requireUpdateItem = requireUpdateItem;
	}

	public String getServerCAUrl() {
		return this.serverCAUrl;
	}

	public void setServerCAUrl(String serverCAUrl) {
		this.serverCAUrl = serverCAUrl;
	}

	public String getRequireUpdate() {
		return this.requireUpdate;
	}

	public void setRequireUpdate(String requireUpdate) {
		this.requireUpdate = requireUpdate;
	}

	public String getClientCertRevocationList() {
		return this.clientCertRevocationList;
	}

	public void setClientCertRevocationList(String clientCertRevocationList) {
		this.clientCertRevocationList = clientCertRevocationList;
	}

	public String getSSLExpireTime() {
		return this.sSLExpireTime;
	}

	public void setSSLExpireTime(String sSLExpireTime) {
		this.sSLExpireTime = sSLExpireTime;
	}

	public String getCAType() {
		return this.cAType;
	}

	public void setCAType(String cAType) {
		this.cAType = cAType;
	}

	public String getSSLCreateTime() {
		return this.sSLCreateTime;
	}

	public void setSSLCreateTime(String sSLCreateTime) {
		this.sSLCreateTime = sSLCreateTime;
	}

	public String getReplicationACL() {
		return this.replicationACL;
	}

	public void setReplicationACL(String replicationACL) {
		this.replicationACL = replicationACL;
	}

	public String getACL() {
		return this.aCL;
	}

	public void setACL(String aCL) {
		this.aCL = aCL;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLastModifyStatus() {
		return this.lastModifyStatus;
	}

	public void setLastModifyStatus(String lastModifyStatus) {
		this.lastModifyStatus = lastModifyStatus;
	}

	public String getSSLEnabled() {
		return this.sSLEnabled;
	}

	public void setSSLEnabled(String sSLEnabled) {
		this.sSLEnabled = sSLEnabled;
	}

	public String getConnectionString() {
		return this.connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getRequireUpdateReason() {
		return this.requireUpdateReason;
	}

	public void setRequireUpdateReason(String requireUpdateReason) {
		this.requireUpdateReason = requireUpdateReason;
	}

	public String getClientCACert() {
		return this.clientCACert;
	}

	public void setClientCACert(String clientCACert) {
		this.clientCACert = clientCACert;
	}

	public String getServerKey() {
		return this.serverKey;
	}

	public void setServerKey(String serverKey) {
		this.serverKey = serverKey;
	}

	public String getModifyStatusReason() {
		return this.modifyStatusReason;
	}

	public void setModifyStatusReason(String modifyStatusReason) {
		this.modifyStatusReason = modifyStatusReason;
	}

	@Override
	public DescribeDBInstanceSSLResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceSSLResponseUnmarshaller.unmarshall(this, context);
	}
}
