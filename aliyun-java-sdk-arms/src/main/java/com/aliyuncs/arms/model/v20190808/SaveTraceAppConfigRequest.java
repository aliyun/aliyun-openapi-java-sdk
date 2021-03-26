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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveTraceAppConfigRequest extends RpcAcsRequest<SaveTraceAppConfigResponse> {
	   

	private List<Settings> settingss;

	private String pid;
	public SaveTraceAppConfigRequest() {
		super("ARMS", "2019-08-08", "SaveTraceAppConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Settings> getSettingss() {
		return this.settingss;
	}

	public void setSettingss(List<Settings> settingss) {
		this.settingss = settingss;	
		if (settingss != null) {
			for (int depth1 = 0; depth1 < settingss.size(); depth1++) {
				putQueryParameter("Settings." + (depth1 + 1) + ".Value" , settingss.get(depth1).getValue());
				putQueryParameter("Settings." + (depth1 + 1) + ".Key" , settingss.get(depth1).getKey());
			}
		}	
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
		if(pid != null){
			putQueryParameter("Pid", pid);
		}
	}

	public static class Settings {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<SaveTraceAppConfigResponse> getResponseClass() {
		return SaveTraceAppConfigResponse.class;
	}

}
