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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddRecognizeRuleRequest extends RpcAcsRequest<AddRecognizeRuleResponse> {
	   

	private String level;

	private String colScan;

	private String colExclude;

	private String contentScan;

	private Integer operationType;

	private String templateId;

	private String recognizeRulesType;

	private String commentScan;

	private String accountName;

	private String sensitiveDescription;

	private String tenantId;

	private String recognizeRules;

	private Integer hitThreshold;

	private String sensitiveName;

	private String nodeParent;

	private String levelName;

	private String nodeId;

	private Integer status;
	public AddRecognizeRuleRequest() {
		super("dataworks-public", "2020-05-18", "AddRecognizeRule");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putBodyParameter("Level", level);
		}
	}

	public String getColScan() {
		return this.colScan;
	}

	public void setColScan(String colScan) {
		this.colScan = colScan;
		if(colScan != null){
			putBodyParameter("ColScan", colScan);
		}
	}

	public String getColExclude() {
		return this.colExclude;
	}

	public void setColExclude(String colExclude) {
		this.colExclude = colExclude;
		if(colExclude != null){
			putBodyParameter("ColExclude", colExclude);
		}
	}

	public String getContentScan() {
		return this.contentScan;
	}

	public void setContentScan(String contentScan) {
		this.contentScan = contentScan;
		if(contentScan != null){
			putBodyParameter("ContentScan", contentScan);
		}
	}

	public Integer getOperationType() {
		return this.operationType;
	}

	public void setOperationType(Integer operationType) {
		this.operationType = operationType;
		if(operationType != null){
			putBodyParameter("OperationType", operationType.toString());
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId);
		}
	}

	public String getRecognizeRulesType() {
		return this.recognizeRulesType;
	}

	public void setRecognizeRulesType(String recognizeRulesType) {
		this.recognizeRulesType = recognizeRulesType;
		if(recognizeRulesType != null){
			putBodyParameter("RecognizeRulesType", recognizeRulesType);
		}
	}

	public String getCommentScan() {
		return this.commentScan;
	}

	public void setCommentScan(String commentScan) {
		this.commentScan = commentScan;
		if(commentScan != null){
			putBodyParameter("CommentScan", commentScan);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putBodyParameter("AccountName", accountName);
		}
	}

	public String getSensitiveDescription() {
		return this.sensitiveDescription;
	}

	public void setSensitiveDescription(String sensitiveDescription) {
		this.sensitiveDescription = sensitiveDescription;
		if(sensitiveDescription != null){
			putBodyParameter("SensitiveDescription", sensitiveDescription);
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

	public String getRecognizeRules() {
		return this.recognizeRules;
	}

	public void setRecognizeRules(String recognizeRules) {
		this.recognizeRules = recognizeRules;
		if(recognizeRules != null){
			putBodyParameter("RecognizeRules", recognizeRules);
		}
	}

	public Integer getHitThreshold() {
		return this.hitThreshold;
	}

	public void setHitThreshold(Integer hitThreshold) {
		this.hitThreshold = hitThreshold;
		if(hitThreshold != null){
			putBodyParameter("HitThreshold", hitThreshold.toString());
		}
	}

	public String getSensitiveName() {
		return this.sensitiveName;
	}

	public void setSensitiveName(String sensitiveName) {
		this.sensitiveName = sensitiveName;
		if(sensitiveName != null){
			putBodyParameter("SensitiveName", sensitiveName);
		}
	}

	public String getNodeParent() {
		return this.nodeParent;
	}

	public void setNodeParent(String nodeParent) {
		this.nodeParent = nodeParent;
		if(nodeParent != null){
			putBodyParameter("NodeParent", nodeParent);
		}
	}

	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
		if(levelName != null){
			putBodyParameter("LevelName", levelName);
		}
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putBodyParameter("NodeId", nodeId);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<AddRecognizeRuleResponse> getResponseClass() {
		return AddRecognizeRuleResponse.class;
	}

}
