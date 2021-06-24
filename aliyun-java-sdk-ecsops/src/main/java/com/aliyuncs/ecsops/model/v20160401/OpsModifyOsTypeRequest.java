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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsModifyOsTypeRequest extends RpcAcsRequest<OpsModifyOsTypeResponse> {
	   

	private Integer maxMemory;

	private Integer maxCpu;

	private String type;

	private String platform;

	private Long osTypeBit;

	private String osNameEn;

	private Long id;

	private String osName;

	private String osLicense;

	private String architecture;

	private String kind;

	private Integer minCpu;

	private Integer osBit;

	private Integer minMemory;

	private String auditParamStr;
	public OpsModifyOsTypeRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyOsType", "ecsops");
		setMethod(MethodType.POST);
	}

	public Integer getMaxMemory() {
		return this.maxMemory;
	}

	public void setMaxMemory(Integer maxMemory) {
		this.maxMemory = maxMemory;
		if(maxMemory != null){
			putQueryParameter("MaxMemory", maxMemory.toString());
		}
	}

	public Integer getMaxCpu() {
		return this.maxCpu;
	}

	public void setMaxCpu(Integer maxCpu) {
		this.maxCpu = maxCpu;
		if(maxCpu != null){
			putQueryParameter("MaxCpu", maxCpu.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public Long getOsTypeBit() {
		return this.osTypeBit;
	}

	public void setOsTypeBit(Long osTypeBit) {
		this.osTypeBit = osTypeBit;
		if(osTypeBit != null){
			putQueryParameter("OsTypeBit", osTypeBit.toString());
		}
	}

	public String getOsNameEn() {
		return this.osNameEn;
	}

	public void setOsNameEn(String osNameEn) {
		this.osNameEn = osNameEn;
		if(osNameEn != null){
			putQueryParameter("OsNameEn", osNameEn);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getOsName() {
		return this.osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
		if(osName != null){
			putQueryParameter("OsName", osName);
		}
	}

	public String getOsLicense() {
		return this.osLicense;
	}

	public void setOsLicense(String osLicense) {
		this.osLicense = osLicense;
		if(osLicense != null){
			putQueryParameter("OsLicense", osLicense);
		}
	}

	public String getArchitecture() {
		return this.architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
		if(architecture != null){
			putQueryParameter("Architecture", architecture);
		}
	}

	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
		if(kind != null){
			putQueryParameter("Kind", kind);
		}
	}

	public Integer getMinCpu() {
		return this.minCpu;
	}

	public void setMinCpu(Integer minCpu) {
		this.minCpu = minCpu;
		if(minCpu != null){
			putQueryParameter("MinCpu", minCpu.toString());
		}
	}

	public Integer getOsBit() {
		return this.osBit;
	}

	public void setOsBit(Integer osBit) {
		this.osBit = osBit;
		if(osBit != null){
			putQueryParameter("OsBit", osBit.toString());
		}
	}

	public Integer getMinMemory() {
		return this.minMemory;
	}

	public void setMinMemory(Integer minMemory) {
		this.minMemory = minMemory;
		if(minMemory != null){
			putQueryParameter("MinMemory", minMemory.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsModifyOsTypeResponse> getResponseClass() {
		return OpsModifyOsTypeResponse.class;
	}

}
