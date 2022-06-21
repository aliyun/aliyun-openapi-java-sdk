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
public class GetDiskRequest extends RpcAcsRequest<GetDiskResponse> {
	   

	private Boolean isSystemDisk;

	private String site;

	private String diskId;
	public GetDiskRequest() {
		super("SWAS", "2017-08-10", "GetDisk", "SWAS");
		setMethod(MethodType.POST);
	}

	public Boolean getIsSystemDisk() {
		return this.isSystemDisk;
	}

	public void setIsSystemDisk(Boolean isSystemDisk) {
		this.isSystemDisk = isSystemDisk;
		if(isSystemDisk != null){
			putQueryParameter("IsSystemDisk", isSystemDisk.toString());
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

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putQueryParameter("DiskId", diskId);
		}
	}

	@Override
	public Class<GetDiskResponse> getResponseClass() {
		return GetDiskResponse.class;
	}

}
