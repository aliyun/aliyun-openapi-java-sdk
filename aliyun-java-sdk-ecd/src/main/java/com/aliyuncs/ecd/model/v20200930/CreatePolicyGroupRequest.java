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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePolicyGroupRequest extends RpcAcsRequest<CreatePolicyGroupResponse> {
	   

	private String watermarkCustomText;

	private String preemptLogin;

	private List<String> preemptLoginUsers;

	private String localDrive;

	private List<String> authorizeSecurityPolicyRules;

	private String clipboard;

	private String usbRedirect;

	private String watermarkType;

	private String watermark;

	private String visualQuality;

	private String watermarkTransparency;

	private String name;
	public CreatePolicyGroupRequest() {
		super("ecd", "2020-09-30", "CreatePolicyGroup", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWatermarkCustomText() {
		return this.watermarkCustomText;
	}

	public void setWatermarkCustomText(String watermarkCustomText) {
		this.watermarkCustomText = watermarkCustomText;
		if(watermarkCustomText != null){
			putQueryParameter("WatermarkCustomText", watermarkCustomText);
		}
	}

	public String getPreemptLogin() {
		return this.preemptLogin;
	}

	public void setPreemptLogin(String preemptLogin) {
		this.preemptLogin = preemptLogin;
		if(preemptLogin != null){
			putQueryParameter("PreemptLogin", preemptLogin);
		}
	}

	public List<String> getPreemptLoginUsers() {
		return this.preemptLoginUsers;
	}

	public void setPreemptLoginUsers(List<String> preemptLoginUsers) {
		this.preemptLoginUsers = preemptLoginUsers;	
		if (preemptLoginUsers != null) {
			for (int i = 0; i < preemptLoginUsers.size(); i++) {
				putQueryParameter("PreemptLoginUser." + (i + 1) , preemptLoginUsers.get(i));
			}
		}	
	}

	public String getLocalDrive() {
		return this.localDrive;
	}

	public void setLocalDrive(String localDrive) {
		this.localDrive = localDrive;
		if(localDrive != null){
			putQueryParameter("LocalDrive", localDrive);
		}
	}

	public List<String> getAuthorizeSecurityPolicyRules() {
		return this.authorizeSecurityPolicyRules;
	}

	public void setAuthorizeSecurityPolicyRules(List<String> authorizeSecurityPolicyRules) {
		this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;	
		if (authorizeSecurityPolicyRules != null) {
			for (int i = 0; i < authorizeSecurityPolicyRules.size(); i++) {
				putQueryParameter("AuthorizeSecurityPolicyRule." + (i + 1) , authorizeSecurityPolicyRules.get(i));
			}
		}	
	}

	public String getClipboard() {
		return this.clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
		if(clipboard != null){
			putQueryParameter("Clipboard", clipboard);
		}
	}

	public String getUsbRedirect() {
		return this.usbRedirect;
	}

	public void setUsbRedirect(String usbRedirect) {
		this.usbRedirect = usbRedirect;
		if(usbRedirect != null){
			putQueryParameter("UsbRedirect", usbRedirect);
		}
	}

	public String getWatermarkType() {
		return this.watermarkType;
	}

	public void setWatermarkType(String watermarkType) {
		this.watermarkType = watermarkType;
		if(watermarkType != null){
			putQueryParameter("WatermarkType", watermarkType);
		}
	}

	public String getWatermark() {
		return this.watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
		if(watermark != null){
			putQueryParameter("Watermark", watermark);
		}
	}

	public String getVisualQuality() {
		return this.visualQuality;
	}

	public void setVisualQuality(String visualQuality) {
		this.visualQuality = visualQuality;
		if(visualQuality != null){
			putQueryParameter("VisualQuality", visualQuality);
		}
	}

	public String getWatermarkTransparency() {
		return this.watermarkTransparency;
	}

	public void setWatermarkTransparency(String watermarkTransparency) {
		this.watermarkTransparency = watermarkTransparency;
		if(watermarkTransparency != null){
			putQueryParameter("WatermarkTransparency", watermarkTransparency);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<CreatePolicyGroupResponse> getResponseClass() {
		return CreatePolicyGroupResponse.class;
	}

}
