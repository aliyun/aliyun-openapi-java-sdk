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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpgradeRenderingDevicesHostOSRequest extends RpcAcsRequest<UpgradeRenderingDevicesHostOSResponse> {
	   

	private String imageId;

	private String romPath;

	private Long ownerId;

	private String instanceIds;

	private String romName;

	private String romVersion;
	public UpgradeRenderingDevicesHostOSRequest() {
		super("vs", "2018-12-12", "UpgradeRenderingDevicesHostOS");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getRomPath() {
		return this.romPath;
	}

	public void setRomPath(String romPath) {
		this.romPath = romPath;
		if(romPath != null){
			putQueryParameter("RomPath", romPath);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public String getRomName() {
		return this.romName;
	}

	public void setRomName(String romName) {
		this.romName = romName;
		if(romName != null){
			putQueryParameter("RomName", romName);
		}
	}

	public String getRomVersion() {
		return this.romVersion;
	}

	public void setRomVersion(String romVersion) {
		this.romVersion = romVersion;
		if(romVersion != null){
			putQueryParameter("RomVersion", romVersion);
		}
	}

	@Override
	public Class<UpgradeRenderingDevicesHostOSResponse> getResponseClass() {
		return UpgradeRenderingDevicesHostOSResponse.class;
	}

}
