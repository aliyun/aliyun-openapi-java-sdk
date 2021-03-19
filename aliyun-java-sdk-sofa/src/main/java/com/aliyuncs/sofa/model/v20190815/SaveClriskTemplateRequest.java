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
public class SaveClriskTemplateRequest extends RpcAcsRequest<SaveClriskTemplateResponse> {
	   

	private String cronExpression;

	private String dayType;

	private Long productId;

	private String memo;

	private List<FileAttributeMappings> fileAttributeMappingss;

	private String secondModelLoaderId;

	private String templateName;

	private List<String> ownersRepeatLists;

	private String alertDelayTime;

	private String modelDefineId;

	private String triggerDelay;

	private List<String> dataNodesRepeatLists;

	private String triggerMode;

	private String checkMethod;

	private String templateCode;

	private String firstModelLoaderId;
	public SaveClriskTemplateRequest() {
		super("SOFA", "2019-08-15", "SaveClriskTemplate", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
		if(cronExpression != null){
			putBodyParameter("CronExpression", cronExpression);
		}
	}

	public String getDayType() {
		return this.dayType;
	}

	public void setDayType(String dayType) {
		this.dayType = dayType;
		if(dayType != null){
			putBodyParameter("DayType", dayType);
		}
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
		if(productId != null){
			putBodyParameter("ProductId", productId.toString());
		}
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
		if(memo != null){
			putBodyParameter("Memo", memo);
		}
	}

	public List<FileAttributeMappings> getFileAttributeMappingss() {
		return this.fileAttributeMappingss;
	}

	public void setFileAttributeMappingss(List<FileAttributeMappings> fileAttributeMappingss) {
		this.fileAttributeMappingss = fileAttributeMappingss;	
		if (fileAttributeMappingss != null) {
			for (int depth1 = 0; depth1 < fileAttributeMappingss.size(); depth1++) {
				putBodyParameter("FileAttributeMappings." + (depth1 + 1) + ".FirstMapping" , fileAttributeMappingss.get(depth1).getFirstMapping());
				putBodyParameter("FileAttributeMappings." + (depth1 + 1) + ".Attribute" , fileAttributeMappingss.get(depth1).getAttribute());
				putBodyParameter("FileAttributeMappings." + (depth1 + 1) + ".AttributeName" , fileAttributeMappingss.get(depth1).getAttributeName());
				putBodyParameter("FileAttributeMappings." + (depth1 + 1) + ".Type" , fileAttributeMappingss.get(depth1).getType());
				putBodyParameter("FileAttributeMappings." + (depth1 + 1) + ".SecondMapping" , fileAttributeMappingss.get(depth1).getSecondMapping());
			}
		}	
	}

	public String getSecondModelLoaderId() {
		return this.secondModelLoaderId;
	}

	public void setSecondModelLoaderId(String secondModelLoaderId) {
		this.secondModelLoaderId = secondModelLoaderId;
		if(secondModelLoaderId != null){
			putBodyParameter("SecondModelLoaderId", secondModelLoaderId);
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putBodyParameter("TemplateName", templateName);
		}
	}

	public List<String> getOwnersRepeatLists() {
		return this.ownersRepeatLists;
	}

	public void setOwnersRepeatLists(List<String> ownersRepeatLists) {
		this.ownersRepeatLists = ownersRepeatLists;	
		if (ownersRepeatLists != null) {
			for (int i = 0; i < ownersRepeatLists.size(); i++) {
				putBodyParameter("OwnersRepeatList." + (i + 1) , ownersRepeatLists.get(i));
			}
		}	
	}

	public String getAlertDelayTime() {
		return this.alertDelayTime;
	}

	public void setAlertDelayTime(String alertDelayTime) {
		this.alertDelayTime = alertDelayTime;
		if(alertDelayTime != null){
			putBodyParameter("AlertDelayTime", alertDelayTime);
		}
	}

	public String getModelDefineId() {
		return this.modelDefineId;
	}

	public void setModelDefineId(String modelDefineId) {
		this.modelDefineId = modelDefineId;
		if(modelDefineId != null){
			putBodyParameter("ModelDefineId", modelDefineId);
		}
	}

	public String getTriggerDelay() {
		return this.triggerDelay;
	}

	public void setTriggerDelay(String triggerDelay) {
		this.triggerDelay = triggerDelay;
		if(triggerDelay != null){
			putBodyParameter("TriggerDelay", triggerDelay);
		}
	}

	public List<String> getDataNodesRepeatLists() {
		return this.dataNodesRepeatLists;
	}

	public void setDataNodesRepeatLists(List<String> dataNodesRepeatLists) {
		this.dataNodesRepeatLists = dataNodesRepeatLists;	
		if (dataNodesRepeatLists != null) {
			for (int i = 0; i < dataNodesRepeatLists.size(); i++) {
				putBodyParameter("DataNodesRepeatList." + (i + 1) , dataNodesRepeatLists.get(i));
			}
		}	
	}

	public String getTriggerMode() {
		return this.triggerMode;
	}

	public void setTriggerMode(String triggerMode) {
		this.triggerMode = triggerMode;
		if(triggerMode != null){
			putBodyParameter("TriggerMode", triggerMode);
		}
	}

	public String getCheckMethod() {
		return this.checkMethod;
	}

	public void setCheckMethod(String checkMethod) {
		this.checkMethod = checkMethod;
		if(checkMethod != null){
			putBodyParameter("CheckMethod", checkMethod);
		}
	}

	public String getTemplateCode() {
		return this.templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
		if(templateCode != null){
			putBodyParameter("TemplateCode", templateCode);
		}
	}

	public String getFirstModelLoaderId() {
		return this.firstModelLoaderId;
	}

	public void setFirstModelLoaderId(String firstModelLoaderId) {
		this.firstModelLoaderId = firstModelLoaderId;
		if(firstModelLoaderId != null){
			putBodyParameter("FirstModelLoaderId", firstModelLoaderId);
		}
	}

	public static class FileAttributeMappings {

		private String firstMapping;

		private String attribute;

		private String attributeName;

		private String type;

		private String secondMapping;

		public String getFirstMapping() {
			return this.firstMapping;
		}

		public void setFirstMapping(String firstMapping) {
			this.firstMapping = firstMapping;
		}

		public String getAttribute() {
			return this.attribute;
		}

		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}

		public String getAttributeName() {
			return this.attributeName;
		}

		public void setAttributeName(String attributeName) {
			this.attributeName = attributeName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSecondMapping() {
			return this.secondMapping;
		}

		public void setSecondMapping(String secondMapping) {
			this.secondMapping = secondMapping;
		}
	}

	@Override
	public Class<SaveClriskTemplateResponse> getResponseClass() {
		return SaveClriskTemplateResponse.class;
	}

}
