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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateCADConversionTaskRequest extends RpcAcsRequest<CreateCADConversionTaskResponse> {
	
	public CreateCADConversionTaskRequest() {
		super("imm", "2017-09-06", "CreateCADConversionTask", "imm");
	}

	private String srcType;

	private Integer baseCol;

	private String notifyTopicName;

	private Long unitWidth;

	private Integer zoomLevel;

	private Integer baseRow;

	private String modelId;

	private String project;

	private Integer zoomFactor;

	private String tgtType;

	private Long unitHeight;

	private String notifyEndpoint;

	private String srcUri;

	private Boolean thumbnails;

	private String tgtUri;

	public String getSrcType() {
		return this.srcType;
	}

	public void setSrcType(String srcType) {
		this.srcType = srcType;
		if(srcType != null){
			putQueryParameter("SrcType", srcType);
		}
	}

	public Integer getBaseCol() {
		return this.baseCol;
	}

	public void setBaseCol(Integer baseCol) {
		this.baseCol = baseCol;
		if(baseCol != null){
			putQueryParameter("BaseCol", baseCol.toString());
		}
	}

	public String getNotifyTopicName() {
		return this.notifyTopicName;
	}

	public void setNotifyTopicName(String notifyTopicName) {
		this.notifyTopicName = notifyTopicName;
		if(notifyTopicName != null){
			putQueryParameter("NotifyTopicName", notifyTopicName);
		}
	}

	public Long getUnitWidth() {
		return this.unitWidth;
	}

	public void setUnitWidth(Long unitWidth) {
		this.unitWidth = unitWidth;
		if(unitWidth != null){
			putQueryParameter("UnitWidth", unitWidth.toString());
		}
	}

	public Integer getZoomLevel() {
		return this.zoomLevel;
	}

	public void setZoomLevel(Integer zoomLevel) {
		this.zoomLevel = zoomLevel;
		if(zoomLevel != null){
			putQueryParameter("ZoomLevel", zoomLevel.toString());
		}
	}

	public Integer getBaseRow() {
		return this.baseRow;
	}

	public void setBaseRow(Integer baseRow) {
		this.baseRow = baseRow;
		if(baseRow != null){
			putQueryParameter("BaseRow", baseRow.toString());
		}
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putQueryParameter("ModelId", modelId);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public Integer getZoomFactor() {
		return this.zoomFactor;
	}

	public void setZoomFactor(Integer zoomFactor) {
		this.zoomFactor = zoomFactor;
		if(zoomFactor != null){
			putQueryParameter("ZoomFactor", zoomFactor.toString());
		}
	}

	public String getTgtType() {
		return this.tgtType;
	}

	public void setTgtType(String tgtType) {
		this.tgtType = tgtType;
		if(tgtType != null){
			putQueryParameter("TgtType", tgtType);
		}
	}

	public Long getUnitHeight() {
		return this.unitHeight;
	}

	public void setUnitHeight(Long unitHeight) {
		this.unitHeight = unitHeight;
		if(unitHeight != null){
			putQueryParameter("UnitHeight", unitHeight.toString());
		}
	}

	public String getNotifyEndpoint() {
		return this.notifyEndpoint;
	}

	public void setNotifyEndpoint(String notifyEndpoint) {
		this.notifyEndpoint = notifyEndpoint;
		if(notifyEndpoint != null){
			putQueryParameter("NotifyEndpoint", notifyEndpoint);
		}
	}

	public String getSrcUri() {
		return this.srcUri;
	}

	public void setSrcUri(String srcUri) {
		this.srcUri = srcUri;
		if(srcUri != null){
			putQueryParameter("SrcUri", srcUri);
		}
	}

	public Boolean getThumbnails() {
		return this.thumbnails;
	}

	public void setThumbnails(Boolean thumbnails) {
		this.thumbnails = thumbnails;
		if(thumbnails != null){
			putQueryParameter("Thumbnails", thumbnails.toString());
		}
	}

	public String getTgtUri() {
		return this.tgtUri;
	}

	public void setTgtUri(String tgtUri) {
		this.tgtUri = tgtUri;
		if(tgtUri != null){
			putQueryParameter("TgtUri", tgtUri);
		}
	}

	@Override
	public Class<CreateCADConversionTaskResponse> getResponseClass() {
		return CreateCADConversionTaskResponse.class;
	}

}
