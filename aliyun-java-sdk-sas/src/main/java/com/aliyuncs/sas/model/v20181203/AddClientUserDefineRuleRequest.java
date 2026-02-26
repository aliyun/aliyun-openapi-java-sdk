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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddClientUserDefineRuleRequest extends RpcAcsRequest<AddClientUserDefineRuleResponse> {
	   

	private Integer actionType;

	private String newFilePath;

	private Integer type;

	private String platform;

	private String registryKey;

	private String cmdline;

	private String filePath;

	private String md5List;

	private String parentProcPath;

	private String procPath;

	private String parentCmdline;

	private String iP;

	private String registryContent;

	private String portStr;

	private Integer port;

	private String name;
	public AddClientUserDefineRuleRequest() {
		super("Sas", "2018-12-03", "AddClientUserDefineRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getActionType() {
		return this.actionType;
	}

	public void setActionType(Integer actionType) {
		this.actionType = actionType;
		if(actionType != null){
			putQueryParameter("ActionType", actionType.toString());
		}
	}

	public String getNewFilePath() {
		return this.newFilePath;
	}

	public void setNewFilePath(String newFilePath) {
		this.newFilePath = newFilePath;
		if(newFilePath != null){
			putQueryParameter("NewFilePath", newFilePath);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public String getRegistryKey() {
		return this.registryKey;
	}

	public void setRegistryKey(String registryKey) {
		this.registryKey = registryKey;
		if(registryKey != null){
			putQueryParameter("RegistryKey", registryKey);
		}
	}

	public String getCmdline() {
		return this.cmdline;
	}

	public void setCmdline(String cmdline) {
		this.cmdline = cmdline;
		if(cmdline != null){
			putQueryParameter("Cmdline", cmdline);
		}
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
		if(filePath != null){
			putQueryParameter("FilePath", filePath);
		}
	}

	public String getMd5List() {
		return this.md5List;
	}

	public void setMd5List(String md5List) {
		this.md5List = md5List;
		if(md5List != null){
			putQueryParameter("Md5List", md5List);
		}
	}

	public String getParentProcPath() {
		return this.parentProcPath;
	}

	public void setParentProcPath(String parentProcPath) {
		this.parentProcPath = parentProcPath;
		if(parentProcPath != null){
			putQueryParameter("ParentProcPath", parentProcPath);
		}
	}

	public String getProcPath() {
		return this.procPath;
	}

	public void setProcPath(String procPath) {
		this.procPath = procPath;
		if(procPath != null){
			putQueryParameter("ProcPath", procPath);
		}
	}

	public String getParentCmdline() {
		return this.parentCmdline;
	}

	public void setParentCmdline(String parentCmdline) {
		this.parentCmdline = parentCmdline;
		if(parentCmdline != null){
			putQueryParameter("ParentCmdline", parentCmdline);
		}
	}

	public String getIP() {
		return this.iP;
	}

	public void setIP(String iP) {
		this.iP = iP;
		if(iP != null){
			putQueryParameter("IP", iP);
		}
	}

	public String getRegistryContent() {
		return this.registryContent;
	}

	public void setRegistryContent(String registryContent) {
		this.registryContent = registryContent;
		if(registryContent != null){
			putQueryParameter("RegistryContent", registryContent);
		}
	}

	public String getPortStr() {
		return this.portStr;
	}

	public void setPortStr(String portStr) {
		this.portStr = portStr;
		if(portStr != null){
			putQueryParameter("PortStr", portStr);
		}
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port.toString());
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
	public Class<AddClientUserDefineRuleResponse> getResponseClass() {
		return AddClientUserDefineRuleResponse.class;
	}

}
