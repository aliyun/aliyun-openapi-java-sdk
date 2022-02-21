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
public class UpdateFileRequest extends RpcAcsRequest<UpdateFileResponse> {
	   

	private String outputList;

	private String dependentNodeIdList;

	private String content;

	private String projectIdentifier;

	private Boolean startImmediately;

	private Long projectId;

	private String advancedSettings;

	private Long startEffectDate;

	private String cycleType;

	private Long fileId;

	private Integer autoRerunIntervalMillis;

	private String owner;

	private String inputList;

	private String rerunMode;

	private String connectionName;

	private String paraValue;

	private String resourceGroupIdentifier;

	private Integer autoRerunTimes;

	private String cronExpress;

	private Long endEffectDate;

	private String fileName;

	private Boolean stop;

	private String dependentType;

	private String fileFolderPath;

	private String fileDescription;

	private Boolean autoParsing;

	private String schedulerType;
	public UpdateFileRequest() {
		super("dataworks-public", "2020-05-18", "UpdateFile");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOutputList() {
		return this.outputList;
	}

	public void setOutputList(String outputList) {
		this.outputList = outputList;
		if(outputList != null){
			putBodyParameter("OutputList", outputList);
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

	public Long getFileId() {
		return this.fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
		if(fileId != null){
			putBodyParameter("FileId", fileId.toString());
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

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		if(owner != null){
			putBodyParameter("Owner", owner);
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
	public Class<UpdateFileResponse> getResponseClass() {
		return UpdateFileResponse.class;
	}

}
