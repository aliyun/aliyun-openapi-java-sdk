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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateFileRequest extends RpcAcsRequest<CreateFileResponse> {
	   

	private Integer fileType;

	private String imageId;

	private String dependentNodeIdList;

	private String content;

	private String projectIdentifier;

	private Integer timeout;

	private Long resourceGroupId;

	private Boolean startImmediately;

	private Long projectId;

	private String advancedSettings;

	private Long startEffectDate;

	private String cycleType;

	private String owner;

	private Integer autoRerunIntervalMillis;

	private String inputList;

	private Boolean createFolderIfNotExists;

	private Boolean applyScheduleImmediately;

	private String rerunMode;

	private String connectionName;

	private String outputParameters;

	private String paraValue;

	private String resourceGroupIdentifier;

	private Integer autoRerunTimes;

	private String cronExpress;

	private Boolean ignoreParentSkipRunningProperty;

	private Long endEffectDate;

	private String fileName;

	private String inputParameters;

	private Boolean stop;

	private String dependentType;

	private String fileFolderPath;

	private String fileDescription;

	private Boolean autoParsing;

	private String schedulerType;
	public CreateFileRequest() {
		super("dataworks-public", "2020-05-18", "CreateFile");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getFileType() {
		return this.fileType;
	}

	public void setFileType(Integer fileType) {
		this.fileType = fileType;
		if(fileType != null){
			putBodyParameter("FileType", fileType.toString());
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putBodyParameter("ImageId", imageId);
		}
	}

	public String getDependentNodeIdList() {
		return this.dependentNodeIdList;
	}

	public void setDependentNodeIdList(String dependentNodeIdList) {
		this.dependentNodeIdList = dependentNodeIdList;
		if(dependentNodeIdList != null){
			putBodyParameter("DependentNodeIdList", dependentNodeIdList);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getProjectIdentifier() {
		return this.projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
		if(projectIdentifier != null){
			putBodyParameter("ProjectIdentifier", projectIdentifier);
		}
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putBodyParameter("Timeout", timeout.toString());
		}
	}

	public Long getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(Long resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId.toString());
		}
	}

	public Boolean getStartImmediately() {
		return this.startImmediately;
	}

	public void setStartImmediately(Boolean startImmediately) {
		this.startImmediately = startImmediately;
		if(startImmediately != null){
			putBodyParameter("StartImmediately", startImmediately.toString());
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public String getAdvancedSettings() {
		return this.advancedSettings;
	}

	public void setAdvancedSettings(String advancedSettings) {
		this.advancedSettings = advancedSettings;
		if(advancedSettings != null){
			putBodyParameter("AdvancedSettings", advancedSettings);
		}
	}

	public Long getStartEffectDate() {
		return this.startEffectDate;
	}

	public void setStartEffectDate(Long startEffectDate) {
		this.startEffectDate = startEffectDate;
		if(startEffectDate != null){
			putBodyParameter("StartEffectDate", startEffectDate.toString());
		}
	}

	public String getCycleType() {
		return this.cycleType;
	}

	public void setCycleType(String cycleType) {
		this.cycleType = cycleType;
		if(cycleType != null){
			putBodyParameter("CycleType", cycleType);
		}
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putBodyParameter("Owner", owner);
		}
	}

	public Integer getAutoRerunIntervalMillis() {
		return this.autoRerunIntervalMillis;
	}

	public void setAutoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
		this.autoRerunIntervalMillis = autoRerunIntervalMillis;
		if(autoRerunIntervalMillis != null){
			putBodyParameter("AutoRerunIntervalMillis", autoRerunIntervalMillis.toString());
		}
	}

	public String getInputList() {
		return this.inputList;
	}

	public void setInputList(String inputList) {
		this.inputList = inputList;
		if(inputList != null){
			putBodyParameter("InputList", inputList);
		}
	}

	public Boolean getCreateFolderIfNotExists() {
		return this.createFolderIfNotExists;
	}

	public void setCreateFolderIfNotExists(Boolean createFolderIfNotExists) {
		this.createFolderIfNotExists = createFolderIfNotExists;
		if(createFolderIfNotExists != null){
			putBodyParameter("CreateFolderIfNotExists", createFolderIfNotExists.toString());
		}
	}

	public Boolean getApplyScheduleImmediately() {
		return this.applyScheduleImmediately;
	}

	public void setApplyScheduleImmediately(Boolean applyScheduleImmediately) {
		this.applyScheduleImmediately = applyScheduleImmediately;
		if(applyScheduleImmediately != null){
			putBodyParameter("ApplyScheduleImmediately", applyScheduleImmediately.toString());
		}
	}

	public String getRerunMode() {
		return this.rerunMode;
	}

	public void setRerunMode(String rerunMode) {
		this.rerunMode = rerunMode;
		if(rerunMode != null){
			putBodyParameter("RerunMode", rerunMode);
		}
	}

	public String getConnectionName() {
		return this.connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
		if(connectionName != null){
			putBodyParameter("ConnectionName", connectionName);
		}
	}

	public String getOutputParameters() {
		return this.outputParameters;
	}

	public void setOutputParameters(String outputParameters) {
		this.outputParameters = outputParameters;
		if(outputParameters != null){
			putBodyParameter("OutputParameters", outputParameters);
		}
	}

	public String getParaValue() {
		return this.paraValue;
	}

	public void setParaValue(String paraValue) {
		this.paraValue = paraValue;
		if(paraValue != null){
			putBodyParameter("ParaValue", paraValue);
		}
	}

	public String getResourceGroupIdentifier() {
		return this.resourceGroupIdentifier;
	}

	public void setResourceGroupIdentifier(String resourceGroupIdentifier) {
		this.resourceGroupIdentifier = resourceGroupIdentifier;
		if(resourceGroupIdentifier != null){
			putBodyParameter("ResourceGroupIdentifier", resourceGroupIdentifier);
		}
	}

	public Integer getAutoRerunTimes() {
		return this.autoRerunTimes;
	}

	public void setAutoRerunTimes(Integer autoRerunTimes) {
		this.autoRerunTimes = autoRerunTimes;
		if(autoRerunTimes != null){
			putBodyParameter("AutoRerunTimes", autoRerunTimes.toString());
		}
	}

	public String getCronExpress() {
		return this.cronExpress;
	}

	public void setCronExpress(String cronExpress) {
		this.cronExpress = cronExpress;
		if(cronExpress != null){
			putBodyParameter("CronExpress", cronExpress);
		}
	}

	public Boolean getIgnoreParentSkipRunningProperty() {
		return this.ignoreParentSkipRunningProperty;
	}

	public void setIgnoreParentSkipRunningProperty(Boolean ignoreParentSkipRunningProperty) {
		this.ignoreParentSkipRunningProperty = ignoreParentSkipRunningProperty;
		if(ignoreParentSkipRunningProperty != null){
			putBodyParameter("IgnoreParentSkipRunningProperty", ignoreParentSkipRunningProperty.toString());
		}
	}

	public Long getEndEffectDate() {
		return this.endEffectDate;
	}

	public void setEndEffectDate(Long endEffectDate) {
		this.endEffectDate = endEffectDate;
		if(endEffectDate != null){
			putBodyParameter("EndEffectDate", endEffectDate.toString());
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putBodyParameter("FileName", fileName);
		}
	}

	public String getInputParameters() {
		return this.inputParameters;
	}

	public void setInputParameters(String inputParameters) {
		this.inputParameters = inputParameters;
		if(inputParameters != null){
			putBodyParameter("InputParameters", inputParameters);
		}
	}

	public Boolean getStop() {
		return this.stop;
	}

	public void setStop(Boolean stop) {
		this.stop = stop;
		if(stop != null){
			putBodyParameter("Stop", stop.toString());
		}
	}

	public String getDependentType() {
		return this.dependentType;
	}

	public void setDependentType(String dependentType) {
		this.dependentType = dependentType;
		if(dependentType != null){
			putBodyParameter("DependentType", dependentType);
		}
	}

	public String getFileFolderPath() {
		return this.fileFolderPath;
	}

	public void setFileFolderPath(String fileFolderPath) {
		this.fileFolderPath = fileFolderPath;
		if(fileFolderPath != null){
			putBodyParameter("FileFolderPath", fileFolderPath);
		}
	}

	public String getFileDescription() {
		return this.fileDescription;
	}

	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
		if(fileDescription != null){
			putBodyParameter("FileDescription", fileDescription);
		}
	}

	public Boolean getAutoParsing() {
		return this.autoParsing;
	}

	public void setAutoParsing(Boolean autoParsing) {
		this.autoParsing = autoParsing;
		if(autoParsing != null){
			putBodyParameter("AutoParsing", autoParsing.toString());
		}
	}

	public String getSchedulerType() {
		return this.schedulerType;
	}

	public void setSchedulerType(String schedulerType) {
		this.schedulerType = schedulerType;
		if(schedulerType != null){
			putBodyParameter("SchedulerType", schedulerType);
		}
	}

	@Override
	public Class<CreateFileResponse> getResponseClass() {
		return CreateFileResponse.class;
	}

}
