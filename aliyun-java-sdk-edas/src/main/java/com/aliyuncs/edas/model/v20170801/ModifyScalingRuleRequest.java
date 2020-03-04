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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyScalingRuleRequest extends RoaAcsRequest<ModifyScalingRuleResponse> {
	   

	private Integer inStep;

	private Integer outInstanceNum;

	private Integer outRT;

	private Integer inInstanceNum;

	private String vSwitchIds;

	private String templateInstanceId;

	private Boolean acceptEULA;

	private Integer outStep;

	private Integer outCPU;

	private String keyPairName;

	private String password;

	private Integer templateVersion;

	private String inCondition;

	private Integer inRT;

	private Integer inCpu;

	private Integer outDuration;

	private String multiAzPolicy;

	private Integer outLoad;

	private Integer inLoad;

	private String groupId;

	private String resourceFrom;

	private Boolean outEnable;

	private String templateId;

	private String scalingPolicy;

	private String outCondition;

	private Integer inDuration;

	private Boolean inEnable;

	private String appId;

	private String vpcId;

	private String templateInstanceName;
	public ModifyScalingRuleRequest() {
		super("Edas", "2017-08-01", "ModifyScalingRule", "Edas");
		setUriPattern("/pop/v5/app/scaling_rules2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getInStep() {
		return this.inStep;
	}

	public void setInStep(Integer inStep) {
		this.inStep = inStep;
		if(inStep != null){
			putQueryParameter("InStep", inStep.toString());
		}
	}

	public Integer getOutInstanceNum() {
		return this.outInstanceNum;
	}

	public void setOutInstanceNum(Integer outInstanceNum) {
		this.outInstanceNum = outInstanceNum;
		if(outInstanceNum != null){
			putQueryParameter("OutInstanceNum", outInstanceNum.toString());
		}
	}

	public Integer getOutRT() {
		return this.outRT;
	}

	public void setOutRT(Integer outRT) {
		this.outRT = outRT;
		if(outRT != null){
			putQueryParameter("OutRT", outRT.toString());
		}
	}

	public Integer getInInstanceNum() {
		return this.inInstanceNum;
	}

	public void setInInstanceNum(Integer inInstanceNum) {
		this.inInstanceNum = inInstanceNum;
		if(inInstanceNum != null){
			putQueryParameter("InInstanceNum", inInstanceNum.toString());
		}
	}

	public String getVSwitchIds() {
		return this.vSwitchIds;
	}

	public void setVSwitchIds(String vSwitchIds) {
		this.vSwitchIds = vSwitchIds;
		if(vSwitchIds != null){
			putQueryParameter("VSwitchIds", vSwitchIds);
		}
	}

	public String getTemplateInstanceId() {
		return this.templateInstanceId;
	}

	public void setTemplateInstanceId(String templateInstanceId) {
		this.templateInstanceId = templateInstanceId;
		if(templateInstanceId != null){
			putQueryParameter("TemplateInstanceId", templateInstanceId);
		}
	}

	public Boolean getAcceptEULA() {
		return this.acceptEULA;
	}

	public void setAcceptEULA(Boolean acceptEULA) {
		this.acceptEULA = acceptEULA;
		if(acceptEULA != null){
			putQueryParameter("AcceptEULA", acceptEULA.toString());
		}
	}

	public Integer getOutStep() {
		return this.outStep;
	}

	public void setOutStep(Integer outStep) {
		this.outStep = outStep;
		if(outStep != null){
			putQueryParameter("OutStep", outStep.toString());
		}
	}

	public Integer getOutCPU() {
		return this.outCPU;
	}

	public void setOutCPU(Integer outCPU) {
		this.outCPU = outCPU;
		if(outCPU != null){
			putQueryParameter("OutCPU", outCPU.toString());
		}
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
		if(keyPairName != null){
			putQueryParameter("KeyPairName", keyPairName);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public Integer getTemplateVersion() {
		return this.templateVersion;
	}

	public void setTemplateVersion(Integer templateVersion) {
		this.templateVersion = templateVersion;
		if(templateVersion != null){
			putQueryParameter("TemplateVersion", templateVersion.toString());
		}
	}

	public String getInCondition() {
		return this.inCondition;
	}

	public void setInCondition(String inCondition) {
		this.inCondition = inCondition;
		if(inCondition != null){
			putQueryParameter("InCondition", inCondition);
		}
	}

	public Integer getInRT() {
		return this.inRT;
	}

	public void setInRT(Integer inRT) {
		this.inRT = inRT;
		if(inRT != null){
			putQueryParameter("InRT", inRT.toString());
		}
	}

	public Integer getInCpu() {
		return this.inCpu;
	}

	public void setInCpu(Integer inCpu) {
		this.inCpu = inCpu;
		if(inCpu != null){
			putQueryParameter("InCpu", inCpu.toString());
		}
	}

	public Integer getOutDuration() {
		return this.outDuration;
	}

	public void setOutDuration(Integer outDuration) {
		this.outDuration = outDuration;
		if(outDuration != null){
			putQueryParameter("OutDuration", outDuration.toString());
		}
	}

	public String getMultiAzPolicy() {
		return this.multiAzPolicy;
	}

	public void setMultiAzPolicy(String multiAzPolicy) {
		this.multiAzPolicy = multiAzPolicy;
		if(multiAzPolicy != null){
			putQueryParameter("MultiAzPolicy", multiAzPolicy);
		}
	}

	public Integer getOutLoad() {
		return this.outLoad;
	}

	public void setOutLoad(Integer outLoad) {
		this.outLoad = outLoad;
		if(outLoad != null){
			putQueryParameter("OutLoad", outLoad.toString());
		}
	}

	public Integer getInLoad() {
		return this.inLoad;
	}

	public void setInLoad(Integer inLoad) {
		this.inLoad = inLoad;
		if(inLoad != null){
			putQueryParameter("InLoad", inLoad.toString());
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getResourceFrom() {
		return this.resourceFrom;
	}

	public void setResourceFrom(String resourceFrom) {
		this.resourceFrom = resourceFrom;
		if(resourceFrom != null){
			putQueryParameter("ResourceFrom", resourceFrom);
		}
	}

	public Boolean getOutEnable() {
		return this.outEnable;
	}

	public void setOutEnable(Boolean outEnable) {
		this.outEnable = outEnable;
		if(outEnable != null){
			putQueryParameter("OutEnable", outEnable.toString());
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	public String getScalingPolicy() {
		return this.scalingPolicy;
	}

	public void setScalingPolicy(String scalingPolicy) {
		this.scalingPolicy = scalingPolicy;
		if(scalingPolicy != null){
			putQueryParameter("ScalingPolicy", scalingPolicy);
		}
	}

	public String getOutCondition() {
		return this.outCondition;
	}

	public void setOutCondition(String outCondition) {
		this.outCondition = outCondition;
		if(outCondition != null){
			putQueryParameter("OutCondition", outCondition);
		}
	}

	public Integer getInDuration() {
		return this.inDuration;
	}

	public void setInDuration(Integer inDuration) {
		this.inDuration = inDuration;
		if(inDuration != null){
			putQueryParameter("InDuration", inDuration.toString());
		}
	}

	public Boolean getInEnable() {
		return this.inEnable;
	}

	public void setInEnable(Boolean inEnable) {
		this.inEnable = inEnable;
		if(inEnable != null){
			putQueryParameter("InEnable", inEnable.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getTemplateInstanceName() {
		return this.templateInstanceName;
	}

	public void setTemplateInstanceName(String templateInstanceName) {
		this.templateInstanceName = templateInstanceName;
		if(templateInstanceName != null){
			putQueryParameter("TemplateInstanceName", templateInstanceName);
		}
	}

	@Override
	public Class<ModifyScalingRuleResponse> getResponseClass() {
		return ModifyScalingRuleResponse.class;
	}

}
