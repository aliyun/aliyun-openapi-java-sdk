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
public class ModifyPolicyGroupRequest extends RpcAcsRequest<ModifyPolicyGroupResponse> {
	   

	private String policyGroupName;

	private String localDrive;

	private String clipboard;

	@SerializedName("netRedirectPolicy")
	private NetRedirectPolicy netRedirectPolicy;

	private Integer resolutionWidth;

	private String lockResolution;

	private Integer resolutionHeight;

	@SerializedName("watermark")
	private Watermark watermark;

	private String cameraRedirect;

	private String html5FileTransfer;

	private String policyGroupId;
	public ModifyPolicyGroupRequest() {
		super("eds-aic", "2023-09-30", "ModifyPolicyGroup");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getPolicyGroupName() {
		return this.policyGroupName;
	}

	public void setPolicyGroupName(String policyGroupName) {
		this.policyGroupName = policyGroupName;
		if(policyGroupName != null){
			putBodyParameter("PolicyGroupName", policyGroupName);
		}
	}

	public String getLocalDrive() {
		return this.localDrive;
	}

	public void setLocalDrive(String localDrive) {
		this.localDrive = localDrive;
		if(localDrive != null){
			putBodyParameter("LocalDrive", localDrive);
		}
	}

	public String getClipboard() {
		return this.clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
		if(clipboard != null){
			putBodyParameter("Clipboard", clipboard);
		}
	}

	public NetRedirectPolicy getNetRedirectPolicy() {
		return this.netRedirectPolicy;
	}

	public void setNetRedirectPolicy(NetRedirectPolicy netRedirectPolicy) {
		this.netRedirectPolicy = netRedirectPolicy;	
		if (netRedirectPolicy != null) {
			putBodyParameter("NetRedirectPolicy" , new Gson().toJson(netRedirectPolicy));
		}	
	}

	public Integer getResolutionWidth() {
		return this.resolutionWidth;
	}

	public void setResolutionWidth(Integer resolutionWidth) {
		this.resolutionWidth = resolutionWidth;
		if(resolutionWidth != null){
			putBodyParameter("ResolutionWidth", resolutionWidth.toString());
		}
	}

	public String getLockResolution() {
		return this.lockResolution;
	}

	public void setLockResolution(String lockResolution) {
		this.lockResolution = lockResolution;
		if(lockResolution != null){
			putBodyParameter("LockResolution", lockResolution);
		}
	}

	public Integer getResolutionHeight() {
		return this.resolutionHeight;
	}

	public void setResolutionHeight(Integer resolutionHeight) {
		this.resolutionHeight = resolutionHeight;
		if(resolutionHeight != null){
			putBodyParameter("ResolutionHeight", resolutionHeight.toString());
		}
	}

	public Watermark getWatermark() {
		return this.watermark;
	}

	public void setWatermark(Watermark watermark) {
		this.watermark = watermark;	
		if (watermark != null) {
			putBodyParameter("Watermark" , new Gson().toJson(watermark));
		}	
	}

	public String getCameraRedirect() {
		return this.cameraRedirect;
	}

	public void setCameraRedirect(String cameraRedirect) {
		this.cameraRedirect = cameraRedirect;
		if(cameraRedirect != null){
			putBodyParameter("CameraRedirect", cameraRedirect);
		}
	}

	public String getHtml5FileTransfer() {
		return this.html5FileTransfer;
	}

	public void setHtml5FileTransfer(String html5FileTransfer) {
		this.html5FileTransfer = html5FileTransfer;
		if(html5FileTransfer != null){
			putBodyParameter("Html5FileTransfer", html5FileTransfer);
		}
	}

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putBodyParameter("PolicyGroupId", policyGroupId);
		}
	}

	public static class NetRedirectPolicy {

		@SerializedName("HostAddr")
		private String hostAddr;

		@SerializedName("ProxyUserName")
		private String proxyUserName;

		@SerializedName("NetRedirect")
		private String netRedirect;

		@SerializedName("Port")
		private String port;

		@SerializedName("CustomProxy")
		private String customProxy;

		@SerializedName("ProxyType")
		private String proxyType;

		@SerializedName("Rules")
		private List<RulesItem> rules;

		@SerializedName("ProxyPassword")
		private String proxyPassword;

		public String getHostAddr() {
			return this.hostAddr;
		}

		public void setHostAddr(String hostAddr) {
			this.hostAddr = hostAddr;
		}

		public String getProxyUserName() {
			return this.proxyUserName;
		}

		public void setProxyUserName(String proxyUserName) {
			this.proxyUserName = proxyUserName;
		}

		public String getNetRedirect() {
			return this.netRedirect;
		}

		public void setNetRedirect(String netRedirect) {
			this.netRedirect = netRedirect;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getCustomProxy() {
			return this.customProxy;
		}

		public void setCustomProxy(String customProxy) {
			this.customProxy = customProxy;
		}

		public String getProxyType() {
			return this.proxyType;
		}

		public void setProxyType(String proxyType) {
			this.proxyType = proxyType;
		}

		public List<RulesItem> getRules() {
			return this.rules;
		}

		public void setRules(List<RulesItem> rules) {
			this.rules = rules;
		}

		public String getProxyPassword() {
			return this.proxyPassword;
		}

		public void setProxyPassword(String proxyPassword) {
			this.proxyPassword = proxyPassword;
		}

		public static class RulesItem {

			@SerializedName("RuleType")
			private String ruleType;

			@SerializedName("Target")
			private String target;

			public String getRuleType() {
				return this.ruleType;
			}

			public void setRuleType(String ruleType) {
				this.ruleType = ruleType;
			}

			public String getTarget() {
				return this.target;
			}

			public void setTarget(String target) {
				this.target = target;
			}
		}
	}

	public static class Watermark {

		@SerializedName("WatermarkCustomText")
		private String watermarkCustomText;

		@SerializedName("WatermarkTransparencyValue")
		private Integer watermarkTransparencyValue;

		@SerializedName("WatermarkFontSize")
		private Integer watermarkFontSize;

		@SerializedName("WatermarkColor")
		private Integer watermarkColor;

		@SerializedName("WatermarkSwitch")
		private String watermarkSwitch;

		@SerializedName("WatermarkTypes")
		private List<String> watermarkTypes;

		public String getWatermarkCustomText() {
			return this.watermarkCustomText;
		}

		public void setWatermarkCustomText(String watermarkCustomText) {
			this.watermarkCustomText = watermarkCustomText;
		}

		public Integer getWatermarkTransparencyValue() {
			return this.watermarkTransparencyValue;
		}

		public void setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
			this.watermarkTransparencyValue = watermarkTransparencyValue;
		}

		public Integer getWatermarkFontSize() {
			return this.watermarkFontSize;
		}

		public void setWatermarkFontSize(Integer watermarkFontSize) {
			this.watermarkFontSize = watermarkFontSize;
		}

		public Integer getWatermarkColor() {
			return this.watermarkColor;
		}

		public void setWatermarkColor(Integer watermarkColor) {
			this.watermarkColor = watermarkColor;
		}

		public String getWatermarkSwitch() {
			return this.watermarkSwitch;
		}

		public void setWatermarkSwitch(String watermarkSwitch) {
			this.watermarkSwitch = watermarkSwitch;
		}

		public List<String> getWatermarkTypes() {
			return this.watermarkTypes;
		}

		public void setWatermarkTypes(List<String> watermarkTypes) {
			this.watermarkTypes = watermarkTypes;
		}
	}

	@Override
	public Class<ModifyPolicyGroupResponse> getResponseClass() {
		return ModifyPolicyGroupResponse.class;
	}

}
