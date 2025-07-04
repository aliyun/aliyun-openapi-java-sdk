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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackupSetExpireTimeRequest extends RpcAcsRequest<ModifyBackupSetExpireTimeResponse> {
	   

	private Long resourceOwnerId;

	private String expectExpireTime;

	private String dBInstanceId;

	private Long backupId;
	public ModifyBackupSetExpireTimeRequest() {
		super("Rds", "2014-08-15", "ModifyBackupSetExpireTime", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getExpectExpireTime() {
		return this.expectExpireTime;
	}

	public void setExpectExpireTime(String expectExpireTime) {
		this.expectExpireTime = expectExpireTime;
		if(expectExpireTime != null){
			putQueryParameter("ExpectExpireTime", expectExpireTime);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public Long getBackupId() {
		return this.backupId;
	}

	public void setBackupId(Long backupId) {
		this.backupId = backupId;
		if(backupId != null){
			putQueryParameter("BackupId", backupId.toString());
		}
	}

	@Override
	public Class<ModifyBackupSetExpireTimeResponse> getResponseClass() {
		return ModifyBackupSetExpireTimeResponse.class;
	}

}
