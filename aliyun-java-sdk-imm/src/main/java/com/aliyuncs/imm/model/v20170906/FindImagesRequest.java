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
public class FindImagesRequest extends RpcAcsRequest<FindImagesResponse> {
	
	public FindImagesRequest() {
		super("imm", "2017-09-06", "FindImages", "imm");
	}

	private String gender;

	private String remarksAPrefix;

	private String project;

	private String orderBy;

	private String imageSizeRange;

	private String remarksBPrefix;

	private String tagNames;

	private String sourceUriPrefix;

	private String locationBoundary;

	private String emotion;

	private String imageTimeRange;

	private String marker;

	private String oCRContentsMatch;

	private String createTimeRange;

	private String setId;

	private String sourceType;

	private String updateTimeRange;

	private String ageRange;

	private String order;

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
		if(gender != null){
			putQueryParameter("Gender", gender);
		}
	}

	public String getRemarksAPrefix() {
		return this.remarksAPrefix;
	}

	public void setRemarksAPrefix(String remarksAPrefix) {
		this.remarksAPrefix = remarksAPrefix;
		if(remarksAPrefix != null){
			putQueryParameter("RemarksAPrefix", remarksAPrefix);
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

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public String getImageSizeRange() {
		return this.imageSizeRange;
	}

	public void setImageSizeRange(String imageSizeRange) {
		this.imageSizeRange = imageSizeRange;
		if(imageSizeRange != null){
			putQueryParameter("ImageSizeRange", imageSizeRange);
		}
	}

	public String getRemarksBPrefix() {
		return this.remarksBPrefix;
	}

	public void setRemarksBPrefix(String remarksBPrefix) {
		this.remarksBPrefix = remarksBPrefix;
		if(remarksBPrefix != null){
			putQueryParameter("RemarksBPrefix", remarksBPrefix);
		}
	}

	public String getTagNames() {
		return this.tagNames;
	}

	public void setTagNames(String tagNames) {
		this.tagNames = tagNames;
		if(tagNames != null){
			putQueryParameter("TagNames", tagNames);
		}
	}

	public String getSourceUriPrefix() {
		return this.sourceUriPrefix;
	}

	public void setSourceUriPrefix(String sourceUriPrefix) {
		this.sourceUriPrefix = sourceUriPrefix;
		if(sourceUriPrefix != null){
			putQueryParameter("SourceUriPrefix", sourceUriPrefix);
		}
	}

	public String getLocationBoundary() {
		return this.locationBoundary;
	}

	public void setLocationBoundary(String locationBoundary) {
		this.locationBoundary = locationBoundary;
		if(locationBoundary != null){
			putQueryParameter("LocationBoundary", locationBoundary);
		}
	}

	public String getEmotion() {
		return this.emotion;
	}

	public void setEmotion(String emotion) {
		this.emotion = emotion;
		if(emotion != null){
			putQueryParameter("Emotion", emotion);
		}
	}

	public String getImageTimeRange() {
		return this.imageTimeRange;
	}

	public void setImageTimeRange(String imageTimeRange) {
		this.imageTimeRange = imageTimeRange;
		if(imageTimeRange != null){
			putQueryParameter("ImageTimeRange", imageTimeRange);
		}
	}

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
		if(marker != null){
			putQueryParameter("Marker", marker);
		}
	}

	public String getOCRContentsMatch() {
		return this.oCRContentsMatch;
	}

	public void setOCRContentsMatch(String oCRContentsMatch) {
		this.oCRContentsMatch = oCRContentsMatch;
		if(oCRContentsMatch != null){
			putQueryParameter("OCRContentsMatch", oCRContentsMatch);
		}
	}

	public String getCreateTimeRange() {
		return this.createTimeRange;
	}

	public void setCreateTimeRange(String createTimeRange) {
		this.createTimeRange = createTimeRange;
		if(createTimeRange != null){
			putQueryParameter("CreateTimeRange", createTimeRange);
		}
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
		if(setId != null){
			putQueryParameter("SetId", setId);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getUpdateTimeRange() {
		return this.updateTimeRange;
	}

	public void setUpdateTimeRange(String updateTimeRange) {
		this.updateTimeRange = updateTimeRange;
		if(updateTimeRange != null){
			putQueryParameter("UpdateTimeRange", updateTimeRange);
		}
	}

	public String getAgeRange() {
		return this.ageRange;
	}

	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
		if(ageRange != null){
			putQueryParameter("AgeRange", ageRange);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	@Override
	public Class<FindImagesResponse> getResponseClass() {
		return FindImagesResponse.class;
	}

}
