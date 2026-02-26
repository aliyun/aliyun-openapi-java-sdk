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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupSetRequest extends RpcAcsRequest<DescribeBackupSetResponse> {
	   

	private String dBInstanceName;

	private String backupSetId;

	private String destCrossRegion;
	public DescribeBackupSetRequest() {
		super("polardbx", "2020-02-02", "DescribeBackupSet", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
	}

	public String getBackupSetId() {
		return this.backupSetId;
	}

	public void setBackupSetId(String backupSetId) {
		this.backupSetId = backupSetId;
		if(backupSetId != null){
			putQueryParameter("BackupSetId", backupSetId);
		}
	}

	public String getDestCrossRegion() {
		return this.destCrossRegion;
	}

	public void setDestCrossRegion(String destCrossRegion) {
		this.destCrossRegion = destCrossRegion;
		if(destCrossRegion != null){
			putQueryParameter("DestCrossRegion", destCrossRegion);
		}
	}

	@Override
	public Class<DescribeBackupSetResponse> getResponseClass() {
		return DescribeBackupSetResponse.class;
	}

}
