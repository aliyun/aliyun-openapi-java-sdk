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
public class ModifySnapShotRemarkRequest extends RpcAcsRequest<ModifySnapShotRemarkResponse> {
	   

	private String snapshotId;

	private Boolean isSystemDiskSnapshot;

	private String remark;

	private String site;
	public ModifySnapShotRemarkRequest() {
		super("SWAS", "2017-08-10", "ModifySnapShotRemark", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
		}
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
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
	public Class<ModifySnapShotRemarkResponse> getResponseClass() {
		return ModifySnapShotRemarkResponse.class;
	}

}
