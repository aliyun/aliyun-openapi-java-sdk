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
public class RollbackSnapshotRequest extends RpcAcsRequest<RollbackSnapshotResponse> {
	   

	private Boolean isSystemDiskSnapshot;

	private String site;

	private String serverUid;

	private String diskId;

	private String snapshotUid;
	public RollbackSnapshotRequest() {
		super("SWAS", "2017-08-10", "RollbackSnapshot", "SWAS");
		setMethod(MethodType.POST);
	}

	public Boolean getIsSystemDiskSnapshot() {
		return this.isSystemDiskSnapshot;
	}

	public void setIsSystemDiskSnapshot(Boolean isSystemDiskSnapshot) {
		this.isSystemDiskSnapshot = isSystemDiskSnapshot;
		if(isSystemDiskSnapshot != null){
			putQueryParameter("IsSystemDiskSnapshot", isSystemDiskSnapshot.toString());
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

	public String getServerUid() {
		return this.serverUid;
	}

	public void setServerUid(String serverUid) {
		this.serverUid = serverUid;
		if(serverUid != null){
			putQueryParameter("ServerUid", serverUid);
		}
	}

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putQueryParameter("DiskId", diskId);
		}
	}

	public String getSnapshotUid() {
		return this.snapshotUid;
	}

	public void setSnapshotUid(String snapshotUid) {
		this.snapshotUid = snapshotUid;
		if(snapshotUid != null){
			putQueryParameter("SnapshotUid", snapshotUid);
		}
	}

	@Override
	public Class<RollbackSnapshotResponse> getResponseClass() {
		return RollbackSnapshotResponse.class;
	}

}
