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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateTerminalPolicyRequest extends RpcAcsRequest<UpdateTerminalPolicyResponse> {
	   

	private Integer enableAutoLogin;

	private Integer powerButtonDefineForAs;

	private String scheduledShutdown;

	private Integer enableScheduledShutdown;

	private Integer enableModifyPassword;

	private Integer powerButtonDefineForNs;

	private Integer powerButtonDefine;

	private Integer enableBluetooth;

	private Integer enableAutoLockScreen;

	private Integer idleTimeoutAction;

	private Integer enableSwitchPersonal;

	private String displayLayout;

	private String terminalPolicyId;

	private Integer enableWlan;

	private Integer idleTimeout;

	private String displayScaleRatio;

	private String displayResolution;

	private String name;

	private Integer settingLock;

	private Integer powerOnBehavior;
	public UpdateTerminalPolicyRequest() {
		super("wyota", "2021-04-20", "UpdateTerminalPolicy");
		setMethod(MethodType.POST);
	}

	public Integer getEnableAutoLogin() {
		return this.enableAutoLogin;
	}

	public void setEnableAutoLogin(Integer enableAutoLogin) {
		this.enableAutoLogin = enableAutoLogin;
		if(enableAutoLogin != null){
			putBodyParameter("EnableAutoLogin", enableAutoLogin.toString());
		}
	}

	public Integer getPowerButtonDefineForAs() {
		return this.powerButtonDefineForAs;
	}

	public void setPowerButtonDefineForAs(Integer powerButtonDefineForAs) {
		this.powerButtonDefineForAs = powerButtonDefineForAs;
		if(powerButtonDefineForAs != null){
			putBodyParameter("PowerButtonDefineForAs", powerButtonDefineForAs.toString());
		}
	}

	public String getScheduledShutdown() {
		return this.scheduledShutdown;
	}

	public void setScheduledShutdown(String scheduledShutdown) {
		this.scheduledShutdown = scheduledShutdown;
		if(scheduledShutdown != null){
			putBodyParameter("ScheduledShutdown", scheduledShutdown);
		}
	}

	public Integer getEnableScheduledShutdown() {
		return this.enableScheduledShutdown;
	}

	public void setEnableScheduledShutdown(Integer enableScheduledShutdown) {
		this.enableScheduledShutdown = enableScheduledShutdown;
		if(enableScheduledShutdown != null){
			putBodyParameter("EnableScheduledShutdown", enableScheduledShutdown.toString());
		}
	}

	public Integer getEnableModifyPassword() {
		return this.enableModifyPassword;
	}

	public void setEnableModifyPassword(Integer enableModifyPassword) {
		this.enableModifyPassword = enableModifyPassword;
		if(enableModifyPassword != null){
			putBodyParameter("EnableModifyPassword", enableModifyPassword.toString());
		}
	}

	public Integer getPowerButtonDefineForNs() {
		return this.powerButtonDefineForNs;
	}

	public void setPowerButtonDefineForNs(Integer powerButtonDefineForNs) {
		this.powerButtonDefineForNs = powerButtonDefineForNs;
		if(powerButtonDefineForNs != null){
			putBodyParameter("PowerButtonDefineForNs", powerButtonDefineForNs.toString());
		}
	}

	public Integer getPowerButtonDefine() {
		return this.powerButtonDefine;
	}

	public void setPowerButtonDefine(Integer powerButtonDefine) {
		this.powerButtonDefine = powerButtonDefine;
		if(powerButtonDefine != null){
			putBodyParameter("PowerButtonDefine", powerButtonDefine.toString());
		}
	}

	public Integer getEnableBluetooth() {
		return this.enableBluetooth;
	}

	public void setEnableBluetooth(Integer enableBluetooth) {
		this.enableBluetooth = enableBluetooth;
		if(enableBluetooth != null){
			putBodyParameter("EnableBluetooth", enableBluetooth.toString());
		}
	}

	public Integer getEnableAutoLockScreen() {
		return this.enableAutoLockScreen;
	}

	public void setEnableAutoLockScreen(Integer enableAutoLockScreen) {
		this.enableAutoLockScreen = enableAutoLockScreen;
		if(enableAutoLockScreen != null){
			putBodyParameter("EnableAutoLockScreen", enableAutoLockScreen.toString());
		}
	}

	public Integer getIdleTimeoutAction() {
		return this.idleTimeoutAction;
	}

	public void setIdleTimeoutAction(Integer idleTimeoutAction) {
		this.idleTimeoutAction = idleTimeoutAction;
		if(idleTimeoutAction != null){
			putBodyParameter("IdleTimeoutAction", idleTimeoutAction.toString());
		}
	}

	public Integer getEnableSwitchPersonal() {
		return this.enableSwitchPersonal;
	}

	public void setEnableSwitchPersonal(Integer enableSwitchPersonal) {
		this.enableSwitchPersonal = enableSwitchPersonal;
		if(enableSwitchPersonal != null){
			putBodyParameter("EnableSwitchPersonal", enableSwitchPersonal.toString());
		}
	}

	public String getDisplayLayout() {
		return this.displayLayout;
	}

	public void setDisplayLayout(String displayLayout) {
		this.displayLayout = displayLayout;
		if(displayLayout != null){
			putBodyParameter("DisplayLayout", displayLayout);
		}
	}

	public String getTerminalPolicyId() {
		return this.terminalPolicyId;
	}

	public void setTerminalPolicyId(String terminalPolicyId) {
		this.terminalPolicyId = terminalPolicyId;
		if(terminalPolicyId != null){
			putBodyParameter("TerminalPolicyId", terminalPolicyId);
		}
	}

	public Integer getEnableWlan() {
		return this.enableWlan;
	}

	public void setEnableWlan(Integer enableWlan) {
		this.enableWlan = enableWlan;
		if(enableWlan != null){
			putBodyParameter("EnableWlan", enableWlan.toString());
		}
	}

	public Integer getIdleTimeout() {
		return this.idleTimeout;
	}

	public void setIdleTimeout(Integer idleTimeout) {
		this.idleTimeout = idleTimeout;
		if(idleTimeout != null){
			putBodyParameter("IdleTimeout", idleTimeout.toString());
		}
	}

	public String getDisplayScaleRatio() {
		return this.displayScaleRatio;
	}

	public void setDisplayScaleRatio(String displayScaleRatio) {
		this.displayScaleRatio = displayScaleRatio;
		if(displayScaleRatio != null){
			putBodyParameter("DisplayScaleRatio", displayScaleRatio);
		}
	}

	public String getDisplayResolution() {
		return this.displayResolution;
	}

	public void setDisplayResolution(String displayResolution) {
		this.displayResolution = displayResolution;
		if(displayResolution != null){
			putBodyParameter("DisplayResolution", displayResolution);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Integer getSettingLock() {
		return this.settingLock;
	}

	public void setSettingLock(Integer settingLock) {
		this.settingLock = settingLock;
		if(settingLock != null){
			putBodyParameter("SettingLock", settingLock.toString());
		}
	}

	public Integer getPowerOnBehavior() {
		return this.powerOnBehavior;
	}

	public void setPowerOnBehavior(Integer powerOnBehavior) {
		this.powerOnBehavior = powerOnBehavior;
		if(powerOnBehavior != null){
			putBodyParameter("PowerOnBehavior", powerOnBehavior.toString());
		}
	}

	@Override
	public Class<UpdateTerminalPolicyResponse> getResponseClass() {
		return UpdateTerminalPolicyResponse.class;
	}

}
