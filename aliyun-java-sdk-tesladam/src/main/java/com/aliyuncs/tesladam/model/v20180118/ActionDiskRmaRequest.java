/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.tesladam.model.v20180118;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ActionDiskRmaRequest extends RpcAcsRequest<ActionDiskRmaResponse> {
	
	public ActionDiskRmaRequest() {
		super("TeslaDam", "2018-01-18", "ActionDiskRma");
	}

	private String diskName;

	private String executionId;

	private String diskSlot;

	private String hostname;

	private String diskMount;

	private String diskReason;

	private String diskSn;

	public String getDiskName() {
		return this.diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
		if(diskName != null){
			putQueryParameter("DiskName", diskName);
		}
	}

	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
		if(executionId != null){
			putQueryParameter("ExecutionId", executionId);
		}
	}

	public String getDiskSlot() {
		return this.diskSlot;
	}

	public void setDiskSlot(String diskSlot) {
		this.diskSlot = diskSlot;
		if(diskSlot != null){
			putQueryParameter("DiskSlot", diskSlot);
		}
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
		if(hostname != null){
			putQueryParameter("Hostname", hostname);
		}
	}

	public String getDiskMount() {
		return this.diskMount;
	}

	public void setDiskMount(String diskMount) {
		this.diskMount = diskMount;
		if(diskMount != null){
			putQueryParameter("DiskMount", diskMount);
		}
	}

	public String getDiskReason() {
		return this.diskReason;
	}

	public void setDiskReason(String diskReason) {
		this.diskReason = diskReason;
		if(diskReason != null){
			putQueryParameter("DiskReason", diskReason);
		}
	}

	public String getDiskSn() {
		return this.diskSn;
	}

	public void setDiskSn(String diskSn) {
		this.diskSn = diskSn;
		if(diskSn != null){
			putQueryParameter("DiskSn", diskSn);
		}
	}

	@Override
	public Class<ActionDiskRmaResponse> getResponseClass() {
		return ActionDiskRmaResponse.class;
	}

}
