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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteUserDevicesRequest extends RpcAcsRequest<DeleteUserDevicesResponse> {
	   

	private List<String> deviceTags;
	public DeleteUserDevicesRequest() {
		super("csas", "2023-01-20", "DeleteUserDevices");
		setMethod(MethodType.POST);
	}

	public List<String> getDeviceTags() {
		return this.deviceTags;
	}

	public void setDeviceTags(List<String> deviceTags) {
		this.deviceTags = deviceTags;	
		if (deviceTags != null) {
			for (int depth1 = 0; depth1 < deviceTags.size(); depth1++) {
				putBodyParameter("DeviceTags." + (depth1 + 1) , deviceTags.get(depth1));
			}
		}	
	}

	@Override
	public Class<DeleteUserDevicesResponse> getResponseClass() {
		return DeleteUserDevicesResponse.class;
	}

}
