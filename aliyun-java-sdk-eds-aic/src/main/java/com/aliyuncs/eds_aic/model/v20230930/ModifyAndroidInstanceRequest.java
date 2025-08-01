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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyAndroidInstanceRequest extends RpcAcsRequest<ModifyAndroidInstanceResponse> {
	   

	private Integer downBandwidthLimit;

	private String androidInstanceId;

	private List<String> instanceIdss;

	private String newAndroidInstanceName;

	private Integer upBandwidthLimit;
	public ModifyAndroidInstanceRequest() {
		super("eds-aic", "2023-09-30", "ModifyAndroidInstance");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getDownBandwidthLimit() {
		return this.downBandwidthLimit;
	}

	public void setDownBandwidthLimit(Integer downBandwidthLimit) {
		this.downBandwidthLimit = downBandwidthLimit;
		if(downBandwidthLimit != null){
			putQueryParameter("DownBandwidthLimit", downBandwidthLimit.toString());
		}
	}

	public String getAndroidInstanceId() {
		return this.androidInstanceId;
	}

	public void setAndroidInstanceId(String androidInstanceId) {
		this.androidInstanceId = androidInstanceId;
		if(androidInstanceId != null){
			putQueryParameter("AndroidInstanceId", androidInstanceId);
		}
	}

	public List<String> getInstanceIdss() {
		return this.instanceIdss;
	}

	public void setInstanceIdss(List<String> instanceIdss) {
		this.instanceIdss = instanceIdss;	
		if (instanceIdss != null) {
			for (int i = 0; i < instanceIdss.size(); i++) {
				putQueryParameter("InstanceIds." + (i + 1) , instanceIdss.get(i));
			}
		}	
	}

	public String getNewAndroidInstanceName() {
		return this.newAndroidInstanceName;
	}

	public void setNewAndroidInstanceName(String newAndroidInstanceName) {
		this.newAndroidInstanceName = newAndroidInstanceName;
		if(newAndroidInstanceName != null){
			putQueryParameter("NewAndroidInstanceName", newAndroidInstanceName);
		}
	}

	public Integer getUpBandwidthLimit() {
		return this.upBandwidthLimit;
	}

	public void setUpBandwidthLimit(Integer upBandwidthLimit) {
		this.upBandwidthLimit = upBandwidthLimit;
		if(upBandwidthLimit != null){
			putQueryParameter("UpBandwidthLimit", upBandwidthLimit.toString());
		}
	}

	@Override
	public Class<ModifyAndroidInstanceResponse> getResponseClass() {
		return ModifyAndroidInstanceResponse.class;
	}

}
