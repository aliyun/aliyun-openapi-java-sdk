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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyDisplayConfigRequest extends RpcAcsRequest<ModifyDisplayConfigResponse> {
	   

	private List<String> androidInstanceIdss;

	@SerializedName("displayConfig")
	private DisplayConfig displayConfig;
	public ModifyDisplayConfigRequest() {
		super("eds-aic", "2023-09-30", "ModifyDisplayConfig");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getAndroidInstanceIdss() {
		return this.androidInstanceIdss;
	}

	public void setAndroidInstanceIdss(List<String> androidInstanceIdss) {
		this.androidInstanceIdss = androidInstanceIdss;	
		if (androidInstanceIdss != null) {
			for (int i = 0; i < androidInstanceIdss.size(); i++) {
				putBodyParameter("AndroidInstanceIds." + (i + 1) , androidInstanceIdss.get(i));
			}
		}	
	}

	public DisplayConfig getDisplayConfig() {
		return this.displayConfig;
	}

	public void setDisplayConfig(DisplayConfig displayConfig) {
		this.displayConfig = displayConfig;	
		if (displayConfig != null) {
			putBodyParameter("DisplayConfig" , new Gson().toJson(displayConfig));
		}	
	}

	public static class DisplayConfig {

		@SerializedName("ResolutionWidth")
		private Integer resolutionWidth;

		@SerializedName("Fps")
		private Integer fps;

		@SerializedName("LockResolution")
		private String lockResolution;

		@SerializedName("ResolutionHeight")
		private Integer resolutionHeight;

		@SerializedName("Dpi")
		private Integer dpi;

		public Integer getResolutionWidth() {
			return this.resolutionWidth;
		}

		public void setResolutionWidth(Integer resolutionWidth) {
			this.resolutionWidth = resolutionWidth;
		}

		public Integer getFps() {
			return this.fps;
		}

		public void setFps(Integer fps) {
			this.fps = fps;
		}

		public String getLockResolution() {
			return this.lockResolution;
		}

		public void setLockResolution(String lockResolution) {
			this.lockResolution = lockResolution;
		}

		public Integer getResolutionHeight() {
			return this.resolutionHeight;
		}

		public void setResolutionHeight(Integer resolutionHeight) {
			this.resolutionHeight = resolutionHeight;
		}

		public Integer getDpi() {
			return this.dpi;
		}

		public void setDpi(Integer dpi) {
			this.dpi = dpi;
		}
	}

	@Override
	public Class<ModifyDisplayConfigResponse> getResponseClass() {
		return ModifyDisplayConfigResponse.class;
	}

}
