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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBuildpackRequest extends RpcAcsRequest<CreateBuildpackResponse> {
	   

	private List<BuildCommandParams> buildCommandParamss;

	private String description;

	private Boolean debugMode;

	private List<SupportedRegions> supportedRegionss;

	private String scope;

	private String id;

	private Long patchVersion;

	private Long majorVersion;

	private Long minorVersion;

	private List<Long> supportedOsRepeatLists;

	private List<String> availableTenantNamesRepeatLists;

	private List<BuildpackParams> buildpackParamss;

	private String storageUploadEndpoints;

	private String fullVersion;

	private String techstackJsonStr;

	private String contactInfo;

	private String buildCommand;

	private Long techstackId;

	private String status;
	public CreateBuildpackRequest() {
		super("SOFA", "2019-08-15", "CreateBuildpack", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<BuildCommandParams> getBuildCommandParamss() {
		return this.buildCommandParamss;
	}

	public void setBuildCommandParamss(List<BuildCommandParams> buildCommandParamss) {
		this.buildCommandParamss = buildCommandParamss;	
		if (buildCommandParamss != null) {
			for (int depth1 = 0; depth1 < buildCommandParamss.size(); depth1++) {
				putBodyParameter("BuildCommandParams." + (depth1 + 1) + ".BuildpackId" , buildCommandParamss.get(depth1).getBuildpackId());
				putBodyParameter("BuildCommandParams." + (depth1 + 1) + ".Description" , buildCommandParamss.get(depth1).getDescription());
				putBodyParameter("BuildCommandParams." + (depth1 + 1) + ".Value" , buildCommandParamss.get(depth1).getValue());
				putBodyParameter("BuildCommandParams." + (depth1 + 1) + ".Key" , buildCommandParamss.get(depth1).getKey());
			}
		}	
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Boolean getDebugMode() {
		return this.debugMode;
	}

	public void setDebugMode(Boolean debugMode) {
		this.debugMode = debugMode;
		if(debugMode != null){
			putBodyParameter("DebugMode", debugMode.toString());
		}
	}

	public List<SupportedRegions> getSupportedRegionss() {
		return this.supportedRegionss;
	}

	public void setSupportedRegionss(List<SupportedRegions> supportedRegionss) {
		this.supportedRegionss = supportedRegionss;	
		if (supportedRegionss != null) {
			for (int depth1 = 0; depth1 < supportedRegionss.size(); depth1++) {
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".BuildpackTenantId" , supportedRegionss.get(depth1).getBuildpackTenantId());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".BuildpackId" , supportedRegionss.get(depth1).getBuildpackId());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".ReadableFileSize" , supportedRegionss.get(depth1).getReadableFileSize());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".ObjectName" , supportedRegionss.get(depth1).getObjectName());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".FileSize" , supportedRegionss.get(depth1).getFileSize());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".FromRegionId" , supportedRegionss.get(depth1).getFromRegionId());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".StorageType" , supportedRegionss.get(depth1).getStorageType());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".FileLocation" , supportedRegionss.get(depth1).getFileLocation());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".FileChecksum" , supportedRegionss.get(depth1).getFileChecksum());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".OriginalFileName" , supportedRegionss.get(depth1).getOriginalFileName());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".RegionId" , supportedRegionss.get(depth1).getRegionId());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".RegionIdentity" , supportedRegionss.get(depth1).getRegionIdentity());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".FileStatus" , supportedRegionss.get(depth1).getFileStatus());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".RegionName" , supportedRegionss.get(depth1).getRegionName());
				putBodyParameter("SupportedRegions." + (depth1 + 1) + ".Id" , supportedRegionss.get(depth1).getId());
			}
		}	
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putBodyParameter("Scope", scope);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public Long getPatchVersion() {
		return this.patchVersion;
	}

	public void setPatchVersion(Long patchVersion) {
		this.patchVersion = patchVersion;
		if(patchVersion != null){
			putBodyParameter("PatchVersion", patchVersion.toString());
		}
	}

	public Long getMajorVersion() {
		return this.majorVersion;
	}

	public void setMajorVersion(Long majorVersion) {
		this.majorVersion = majorVersion;
		if(majorVersion != null){
			putBodyParameter("MajorVersion", majorVersion.toString());
		}
	}

	public Long getMinorVersion() {
		return this.minorVersion;
	}

	public void setMinorVersion(Long minorVersion) {
		this.minorVersion = minorVersion;
		if(minorVersion != null){
			putBodyParameter("MinorVersion", minorVersion.toString());
		}
	}

	public List<Long> getSupportedOsRepeatLists() {
		return this.supportedOsRepeatLists;
	}

	public void setSupportedOsRepeatLists(List<Long> supportedOsRepeatLists) {
		this.supportedOsRepeatLists = supportedOsRepeatLists;	
		if (supportedOsRepeatLists != null) {
			for (int i = 0; i < supportedOsRepeatLists.size(); i++) {
				putBodyParameter("SupportedOsRepeatList." + (i + 1) , supportedOsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getAvailableTenantNamesRepeatLists() {
		return this.availableTenantNamesRepeatLists;
	}

	public void setAvailableTenantNamesRepeatLists(List<String> availableTenantNamesRepeatLists) {
		this.availableTenantNamesRepeatLists = availableTenantNamesRepeatLists;	
		if (availableTenantNamesRepeatLists != null) {
			for (int i = 0; i < availableTenantNamesRepeatLists.size(); i++) {
				putBodyParameter("AvailableTenantNamesRepeatList." + (i + 1) , availableTenantNamesRepeatLists.get(i));
			}
		}	
	}

	public List<BuildpackParams> getBuildpackParamss() {
		return this.buildpackParamss;
	}

	public void setBuildpackParamss(List<BuildpackParams> buildpackParamss) {
		this.buildpackParamss = buildpackParamss;	
		if (buildpackParamss != null) {
			for (int depth1 = 0; depth1 < buildpackParamss.size(); depth1++) {
				putBodyParameter("BuildpackParams." + (depth1 + 1) + ".BuildpackId" , buildpackParamss.get(depth1).getBuildpackId());
				putBodyParameter("BuildpackParams." + (depth1 + 1) + ".Readonly" , buildpackParamss.get(depth1).getReadonly());
				putBodyParameter("BuildpackParams." + (depth1 + 1) + ".DefaultValue" , buildpackParamss.get(depth1).getDefaultValue());
				putBodyParameter("BuildpackParams." + (depth1 + 1) + ".Description" , buildpackParamss.get(depth1).getDescription());
				putBodyParameter("BuildpackParams." + (depth1 + 1) + ".Id" , buildpackParamss.get(depth1).getId());
				putBodyParameter("BuildpackParams." + (depth1 + 1) + ".Key" , buildpackParamss.get(depth1).getKey());
				putBodyParameter("BuildpackParams." + (depth1 + 1) + ".Required" , buildpackParamss.get(depth1).getRequired());
			}
		}	
	}

	public String getStorageUploadEndpoints() {
		return this.storageUploadEndpoints;
	}

	public void setStorageUploadEndpoints(String storageUploadEndpoints) {
		this.storageUploadEndpoints = storageUploadEndpoints;
		if(storageUploadEndpoints != null){
			putBodyParameter("StorageUploadEndpoints", storageUploadEndpoints);
		}
	}

	public String getFullVersion() {
		return this.fullVersion;
	}

	public void setFullVersion(String fullVersion) {
		this.fullVersion = fullVersion;
		if(fullVersion != null){
			putBodyParameter("FullVersion", fullVersion);
		}
	}

	public String getTechstackJsonStr() {
		return this.techstackJsonStr;
	}

	public void setTechstackJsonStr(String techstackJsonStr) {
		this.techstackJsonStr = techstackJsonStr;
		if(techstackJsonStr != null){
			putBodyParameter("TechstackJsonStr", techstackJsonStr);
		}
	}

	public String getContactInfo() {
		return this.contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
		if(contactInfo != null){
			putBodyParameter("ContactInfo", contactInfo);
		}
	}

	public String getBuildCommand() {
		return this.buildCommand;
	}

	public void setBuildCommand(String buildCommand) {
		this.buildCommand = buildCommand;
		if(buildCommand != null){
			putBodyParameter("BuildCommand", buildCommand);
		}
	}

	public Long getTechstackId() {
		return this.techstackId;
	}

	public void setTechstackId(Long techstackId) {
		this.techstackId = techstackId;
		if(techstackId != null){
			putBodyParameter("TechstackId", techstackId.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	public static class BuildCommandParams {

		private String buildpackId;

		private String description;

		private String value;

		private String key;

		public String getBuildpackId() {
			return this.buildpackId;
		}

		public void setBuildpackId(String buildpackId) {
			this.buildpackId = buildpackId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

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

	public static class SupportedRegions {

		private String buildpackTenantId;

		private String buildpackId;

		private String readableFileSize;

		private String objectName;

		private Long fileSize;

		private String fromRegionId;

		private String storageType;

		private String fileLocation;

		private String fileChecksum;

		private String originalFileName;

		private String regionId;

		private String regionIdentity;

		private String fileStatus;

		private String regionName;

		private String id;

		public String getBuildpackTenantId() {
			return this.buildpackTenantId;
		}

		public void setBuildpackTenantId(String buildpackTenantId) {
			this.buildpackTenantId = buildpackTenantId;
		}

		public String getBuildpackId() {
			return this.buildpackId;
		}

		public void setBuildpackId(String buildpackId) {
			this.buildpackId = buildpackId;
		}

		public String getReadableFileSize() {
			return this.readableFileSize;
		}

		public void setReadableFileSize(String readableFileSize) {
			this.readableFileSize = readableFileSize;
		}

		public String getObjectName() {
			return this.objectName;
		}

		public void setObjectName(String objectName) {
			this.objectName = objectName;
		}

		public Long getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Long fileSize) {
			this.fileSize = fileSize;
		}

		public String getFromRegionId() {
			return this.fromRegionId;
		}

		public void setFromRegionId(String fromRegionId) {
			this.fromRegionId = fromRegionId;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getFileLocation() {
			return this.fileLocation;
		}

		public void setFileLocation(String fileLocation) {
			this.fileLocation = fileLocation;
		}

		public String getFileChecksum() {
			return this.fileChecksum;
		}

		public void setFileChecksum(String fileChecksum) {
			this.fileChecksum = fileChecksum;
		}

		public String getOriginalFileName() {
			return this.originalFileName;
		}

		public void setOriginalFileName(String originalFileName) {
			this.originalFileName = originalFileName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionIdentity() {
			return this.regionIdentity;
		}

		public void setRegionIdentity(String regionIdentity) {
			this.regionIdentity = regionIdentity;
		}

		public String getFileStatus() {
			return this.fileStatus;
		}

		public void setFileStatus(String fileStatus) {
			this.fileStatus = fileStatus;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public static class BuildpackParams {

		private String buildpackId;

		private Boolean readonly;

		private String defaultValue;

		private String description;

		private String id;

		private String key;

		private Boolean required;

		public String getBuildpackId() {
			return this.buildpackId;
		}

		public void setBuildpackId(String buildpackId) {
			this.buildpackId = buildpackId;
		}

		public Boolean getReadonly() {
			return this.readonly;
		}

		public void setReadonly(Boolean readonly) {
			this.readonly = readonly;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}
	}

	@Override
	public Class<CreateBuildpackResponse> getResponseClass() {
		return CreateBuildpackResponse.class;
	}

}
