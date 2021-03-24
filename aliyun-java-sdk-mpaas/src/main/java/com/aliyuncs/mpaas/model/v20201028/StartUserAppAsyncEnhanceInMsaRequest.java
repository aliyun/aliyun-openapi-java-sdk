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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartUserAppAsyncEnhanceInMsaRequest extends RpcAcsRequest<StartUserAppAsyncEnhanceInMsaResponse> {
	   

	private String classes;

	private Integer nativeDebugger;

	private Integer dalvikDebugger;

	private Boolean totalSwitch;

	private String tenantId;

	private Integer javaHook;

	private Long id;

	private String taskType;

	private Integer packageTampered;

	private Integer memoryDump;

	private Integer emulatorEnvironment;

	private Integer nativeHook;

	private String appId;

	private String workspaceId;
	public StartUserAppAsyncEnhanceInMsaRequest() {
		super("mPaaS", "2020-10-28", "StartUserAppAsyncEnhanceInMsa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClasses() {
		return this.classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
		if(classes != null){
			putBodyParameter("Classes", classes);
		}
	}

	public Integer getNativeDebugger() {
		return this.nativeDebugger;
	}

	public void setNativeDebugger(Integer nativeDebugger) {
		this.nativeDebugger = nativeDebugger;
		if(nativeDebugger != null){
			putBodyParameter("NativeDebugger", nativeDebugger.toString());
		}
	}

	public Integer getDalvikDebugger() {
		return this.dalvikDebugger;
	}

	public void setDalvikDebugger(Integer dalvikDebugger) {
		this.dalvikDebugger = dalvikDebugger;
		if(dalvikDebugger != null){
			putBodyParameter("DalvikDebugger", dalvikDebugger.toString());
		}
	}

	public Boolean getTotalSwitch() {
		return this.totalSwitch;
	}

	public void setTotalSwitch(Boolean totalSwitch) {
		this.totalSwitch = totalSwitch;
		if(totalSwitch != null){
			putBodyParameter("TotalSwitch", totalSwitch.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public Integer getJavaHook() {
		return this.javaHook;
	}

	public void setJavaHook(Integer javaHook) {
		this.javaHook = javaHook;
		if(javaHook != null){
			putBodyParameter("JavaHook", javaHook.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putBodyParameter("TaskType", taskType);
		}
	}

	public Integer getPackageTampered() {
		return this.packageTampered;
	}

	public void setPackageTampered(Integer packageTampered) {
		this.packageTampered = packageTampered;
		if(packageTampered != null){
			putBodyParameter("PackageTampered", packageTampered.toString());
		}
	}

	public Integer getMemoryDump() {
		return this.memoryDump;
	}

	public void setMemoryDump(Integer memoryDump) {
		this.memoryDump = memoryDump;
		if(memoryDump != null){
			putBodyParameter("MemoryDump", memoryDump.toString());
		}
	}

	public Integer getEmulatorEnvironment() {
		return this.emulatorEnvironment;
	}

	public void setEmulatorEnvironment(Integer emulatorEnvironment) {
		this.emulatorEnvironment = emulatorEnvironment;
		if(emulatorEnvironment != null){
			putBodyParameter("EmulatorEnvironment", emulatorEnvironment.toString());
		}
	}

	public Integer getNativeHook() {
		return this.nativeHook;
	}

	public void setNativeHook(Integer nativeHook) {
		this.nativeHook = nativeHook;
		if(nativeHook != null){
			putBodyParameter("NativeHook", nativeHook.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<StartUserAppAsyncEnhanceInMsaResponse> getResponseClass() {
		return StartUserAppAsyncEnhanceInMsaResponse.class;
	}

}
