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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceBootConfigurationRequest extends RpcAcsRequest<ModifyInstanceBootConfigurationResponse> {
	   

	private String diskSet;

	private String bootType;

	private String bootSet;

	private String instanceId;
	public ModifyInstanceBootConfigurationRequest() {
		super("Ens", "2017-11-10", "ModifyInstanceBootConfiguration", "ens");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getDiskSet() {
		return this.diskSet;
	}

	public void setDiskSet(String diskSet) {
		this.diskSet = diskSet;
		if(diskSet != null){
			putQueryParameter("DiskSet", diskSet);
		}
	}

	public String getBootType() {
		return this.bootType;
	}

	public void setBootType(String bootType) {
		this.bootType = bootType;
		if(bootType != null){
			putQueryParameter("BootType", bootType);
		}
	}

	public String getBootSet() {
		return this.bootSet;
	}

	public void setBootSet(String bootSet) {
		this.bootSet = bootSet;
		if(bootSet != null){
			putQueryParameter("BootSet", bootSet);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<ModifyInstanceBootConfigurationResponse> getResponseClass() {
		return ModifyInstanceBootConfigurationResponse.class;
	}

}
