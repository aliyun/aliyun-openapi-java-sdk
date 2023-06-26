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

package com.aliyuncs.ebs.model.v20210730;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StartDiskMonitorRequest extends RpcAcsRequest<StartDiskMonitorResponse> {
	   

	@SerializedName("diskIds")
	private List<String> diskIds;
	public StartDiskMonitorRequest() {
		super("ebs", "2021-07-30", "StartDiskMonitor", "ebs");
		setMethod(MethodType.POST);
	}

	public List<String> getDiskIds() {
		return this.diskIds;
	}

	public void setDiskIds(List<String> diskIds) {
		this.diskIds = diskIds;	
		if (diskIds != null) {
			putQueryParameter("DiskIds" , new Gson().toJson(diskIds));
		}	
	}

	@Override
	public Class<StartDiskMonitorResponse> getResponseClass() {
		return StartDiskMonitorResponse.class;
	}

}
