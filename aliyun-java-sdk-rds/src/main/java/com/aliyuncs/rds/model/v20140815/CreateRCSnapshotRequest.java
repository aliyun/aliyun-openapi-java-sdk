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
public class CreateRCSnapshotRequest extends RpcAcsRequest<CreateRCSnapshotResponse> {
	   

	private Boolean instantAccess;

	private String description;

	private Integer instantAccessRetentionDays;

	private String diskId;

	private String zoneId;

	private Integer retentionDays;
	public CreateRCSnapshotRequest() {
		super("Rds", "2014-08-15", "CreateRCSnapshot", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getInstantAccess() {
		return this.instantAccess;
	}

	public void setInstantAccess(Boolean instantAccess) {
		this.instantAccess = instantAccess;
		if(instantAccess != null){
			putQueryParameter("InstantAccess", instantAccess.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getInstantAccessRetentionDays() {
		return this.instantAccessRetentionDays;
	}

	public void setInstantAccessRetentionDays(Integer instantAccessRetentionDays) {
		this.instantAccessRetentionDays = instantAccessRetentionDays;
		if(instantAccessRetentionDays != null){
			putQueryParameter("InstantAccessRetentionDays", instantAccessRetentionDays.toString());
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public Integer getRetentionDays() {
		return this.retentionDays;
	}

	public void setRetentionDays(Integer retentionDays) {
		this.retentionDays = retentionDays;
		if(retentionDays != null){
			putQueryParameter("RetentionDays", retentionDays.toString());
		}
	}

	@Override
	public Class<CreateRCSnapshotResponse> getResponseClass() {
		return CreateRCSnapshotResponse.class;
	}

}
