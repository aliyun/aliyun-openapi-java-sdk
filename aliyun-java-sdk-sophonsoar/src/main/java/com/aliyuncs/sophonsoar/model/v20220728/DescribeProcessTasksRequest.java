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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeProcessTasksRequest extends RpcAcsRequest<DescribeProcessTasksResponse> {
	   

	private String entityName;

	private String yunCode;

	private String source;

	private Long pageNumber;

	private String taskStatus;

	private Long processRemoveEnd;

	private String paramContent;

	private String reqUuid;

	private String scope;

	private Integer pageSize;

	private String triggerSource;

	private Long processRemoveStart;

	private String taskId;

	private String orderField;

	private String direction;

	private String sceneCode;

	private Long processActionStart;

	private Long processActionEnd;

	private String processStrategyUuid;

	private String entityType;

	private String entityUuid;

	private String eventUuid;
	public DescribeProcessTasksRequest() {
		super("sophonsoar", "2022-07-28", "DescribeProcessTasks");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
		if(entityName != null){
			putQueryParameter("EntityName", entityName);
		}
	}

	public String getYunCode() {
		return this.yunCode;
	}

	public void setYunCode(String yunCode) {
		this.yunCode = yunCode;
		if(yunCode != null){
			putQueryParameter("YunCode", yunCode);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
		if(taskStatus != null){
			putQueryParameter("TaskStatus", taskStatus);
		}
	}

	public Long getProcessRemoveEnd() {
		return this.processRemoveEnd;
	}

	public void setProcessRemoveEnd(Long processRemoveEnd) {
		this.processRemoveEnd = processRemoveEnd;
		if(processRemoveEnd != null){
			putQueryParameter("ProcessRemoveEnd", processRemoveEnd.toString());
		}
	}

	public String getParamContent() {
		return this.paramContent;
	}

	public void setParamContent(String paramContent) {
		this.paramContent = paramContent;
		if(paramContent != null){
			putQueryParameter("ParamContent", paramContent);
		}
	}

	public String getReqUuid() {
		return this.reqUuid;
	}

	public void setReqUuid(String reqUuid) {
		this.reqUuid = reqUuid;
		if(reqUuid != null){
			putQueryParameter("ReqUuid", reqUuid);
		}
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putQueryParameter("Scope", scope);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getTriggerSource() {
		return this.triggerSource;
	}

	public void setTriggerSource(String triggerSource) {
		this.triggerSource = triggerSource;
		if(triggerSource != null){
			putQueryParameter("TriggerSource", triggerSource);
		}
	}

	public Long getProcessRemoveStart() {
		return this.processRemoveStart;
	}

	public void setProcessRemoveStart(Long processRemoveStart) {
		this.processRemoveStart = processRemoveStart;
		if(processRemoveStart != null){
			putQueryParameter("ProcessRemoveStart", processRemoveStart.toString());
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	public String getOrderField() {
		return this.orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
		if(orderField != null){
			putQueryParameter("OrderField", orderField);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	public String getSceneCode() {
		return this.sceneCode;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
		if(sceneCode != null){
			putQueryParameter("SceneCode", sceneCode);
		}
	}

	public Long getProcessActionStart() {
		return this.processActionStart;
	}

	public void setProcessActionStart(Long processActionStart) {
		this.processActionStart = processActionStart;
		if(processActionStart != null){
			putQueryParameter("ProcessActionStart", processActionStart.toString());
		}
	}

	public Long getProcessActionEnd() {
		return this.processActionEnd;
	}

	public void setProcessActionEnd(Long processActionEnd) {
		this.processActionEnd = processActionEnd;
		if(processActionEnd != null){
			putQueryParameter("ProcessActionEnd", processActionEnd.toString());
		}
	}

	public String getProcessStrategyUuid() {
		return this.processStrategyUuid;
	}

	public void setProcessStrategyUuid(String processStrategyUuid) {
		this.processStrategyUuid = processStrategyUuid;
		if(processStrategyUuid != null){
			putQueryParameter("ProcessStrategyUuid", processStrategyUuid);
		}
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
		if(entityType != null){
			putQueryParameter("EntityType", entityType);
		}
	}

	public String getEntityUuid() {
		return this.entityUuid;
	}

	public void setEntityUuid(String entityUuid) {
		this.entityUuid = entityUuid;
		if(entityUuid != null){
			putQueryParameter("EntityUuid", entityUuid);
		}
	}

	public String getEventUuid() {
		return this.eventUuid;
	}

	public void setEventUuid(String eventUuid) {
		this.eventUuid = eventUuid;
		if(eventUuid != null){
			putQueryParameter("EventUuid", eventUuid);
		}
	}

	@Override
	public Class<DescribeProcessTasksResponse> getResponseClass() {
		return DescribeProcessTasksResponse.class;
	}

}
