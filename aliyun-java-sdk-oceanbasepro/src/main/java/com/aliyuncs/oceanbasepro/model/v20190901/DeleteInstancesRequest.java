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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteInstancesRequest extends RpcAcsRequest<DeleteInstancesResponse> {
	   

	private String backupRetainMode;

	private String instanceIds;
	public DeleteInstancesRequest() {
		super("OceanBasePro", "2019-09-01", "DeleteInstances");
		setMethod(MethodType.POST);
	}

	public String getBackupRetainMode() {
		return this.backupRetainMode;
	}

	public void setBackupRetainMode(String backupRetainMode) {
		this.backupRetainMode = backupRetainMode;
		if(backupRetainMode != null){
			putBodyParameter("BackupRetainMode", backupRetainMode);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putBodyParameter("InstanceIds", instanceIds);
		}
	}

	@Override
	public Class<DeleteInstancesResponse> getResponseClass() {
		return DeleteInstancesResponse.class;
	}

}
