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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDiskSnapshotRequest extends RpcAcsRequest<CreateDiskSnapshotResponse> {
	   

	private String diskSnapshotName;

	private String diskName;

	private String site;
	public CreateDiskSnapshotRequest() {
		super("SWAS", "2017-08-10", "CreateDiskSnapshot", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getDiskSnapshotName() {
		return this.diskSnapshotName;
	}

	public void setDiskSnapshotName(String diskSnapshotName) {
		this.diskSnapshotName = diskSnapshotName;
		if(diskSnapshotName != null){
			putQueryParameter("DiskSnapshotName", diskSnapshotName);
		}
	}

	public String getDiskName() {
		return this.diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
		if(diskName != null){
			putQueryParameter("DiskName", diskName);
		}
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
		}
	}

	@Override
	public Class<CreateDiskSnapshotResponse> getResponseClass() {
		return CreateDiskSnapshotResponse.class;
	}

}
