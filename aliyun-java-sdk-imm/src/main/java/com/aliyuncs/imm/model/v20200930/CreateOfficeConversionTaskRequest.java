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

package com.aliyuncs.imm.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOfficeConversionTaskRequest extends RpcAcsRequest<CreateOfficeConversionTaskResponse> {
	   

	private Long sheetCount;

	private Boolean showComments;

	@SerializedName("notification")
	private Notification notification;

	private String password;

	private String pages;

	private String sourceType;

	private String projectName;

	private Boolean fitToHeight;

	private Long endPage;

	private Boolean fitToWidth;

	private Long quality;

	@SerializedName("tags")
	private Map<String,String> tags;

	private String sourceURI;

	private Long sheetIndex;

	private Boolean holdLineFeed;

	private Boolean longText;

	private String targetType;

	@SerializedName("trimPolicy")
	private TrimPolicy trimPolicy;

	private Long maxSheetColumn;

	private Boolean firstPage;

	private Boolean paperHorizontal;

	private String userData;

	private Long scalePercentage;

	private Long startPage;

	private String targetURIPrefix;

	private String targetURI;

	private String paperSize;

	private Long imageDPI;

	private Boolean longPicture;

	private Long maxSheetRow;

	@SerializedName("credentialConfig")
	private CredentialConfig credentialConfig;
	public CreateOfficeConversionTaskRequest() {
		super("imm", "2020-09-30", "CreateOfficeConversionTask", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getSheetCount() {
		return this.sheetCount;
	}

	public void setSheetCount(Long sheetCount) {
		this.sheetCount = sheetCount;
		if(sheetCount != null){
			putQueryParameter("SheetCount", sheetCount.toString());
		}
	}

	public Boolean getShowComments() {
		return this.showComments;
	}

	public void setShowComments(Boolean showComments) {
		this.showComments = showComments;
		if(showComments != null){
			putQueryParameter("ShowComments", showComments.toString());
		}
	}

	public Notification getNotification() {
		return this.notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;	
		if (notification != null) {
			putQueryParameter("Notification" , new Gson().toJson(notification));
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

	public String getPages() {
		return this.pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
		if(pages != null){
			putQueryParameter("Pages", pages);
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

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public Boolean getFitToHeight() {
		return this.fitToHeight;
	}

	public void setFitToHeight(Boolean fitToHeight) {
		this.fitToHeight = fitToHeight;
		if(fitToHeight != null){
			putQueryParameter("FitToHeight", fitToHeight.toString());
		}
	}

	public Long getEndPage() {
		return this.endPage;
	}

	public void setEndPage(Long endPage) {
		this.endPage = endPage;
		if(endPage != null){
			putQueryParameter("EndPage", endPage.toString());
		}
	}

	public Boolean getFitToWidth() {
		return this.fitToWidth;
	}

	public void setFitToWidth(Boolean fitToWidth) {
		this.fitToWidth = fitToWidth;
		if(fitToWidth != null){
			putQueryParameter("FitToWidth", fitToWidth.toString());
		}
	}

	public Long getQuality() {
		return this.quality;
	}

	public void setQuality(Long quality) {
		this.quality = quality;
		if(quality != null){
			putQueryParameter("Quality", quality.toString());
		}
	}

	public Map<String,String> getTags() {
		return this.tags;
	}

	public void setTags(Map<String,String> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
		}	
	}

	public String getSourceURI() {
		return this.sourceURI;
	}

	public void setSourceURI(String sourceURI) {
		this.sourceURI = sourceURI;
		if(sourceURI != null){
			putQueryParameter("SourceURI", sourceURI);
		}
	}

	public Long getSheetIndex() {
		return this.sheetIndex;
	}

	public void setSheetIndex(Long sheetIndex) {
		this.sheetIndex = sheetIndex;
		if(sheetIndex != null){
			putQueryParameter("SheetIndex", sheetIndex.toString());
		}
	}

	public Boolean getHoldLineFeed() {
		return this.holdLineFeed;
	}

	public void setHoldLineFeed(Boolean holdLineFeed) {
		this.holdLineFeed = holdLineFeed;
		if(holdLineFeed != null){
			putQueryParameter("HoldLineFeed", holdLineFeed.toString());
		}
	}

	public Boolean getLongText() {
		return this.longText;
	}

	public void setLongText(Boolean longText) {
		this.longText = longText;
		if(longText != null){
			putQueryParameter("LongText", longText.toString());
		}
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
		}
	}

	public TrimPolicy getTrimPolicy() {
		return this.trimPolicy;
	}

	public void setTrimPolicy(TrimPolicy trimPolicy) {
		this.trimPolicy = trimPolicy;	
		if (trimPolicy != null) {
			putQueryParameter("TrimPolicy" , new Gson().toJson(trimPolicy));
		}	
	}

	public Long getMaxSheetColumn() {
		return this.maxSheetColumn;
	}

	public void setMaxSheetColumn(Long maxSheetColumn) {
		this.maxSheetColumn = maxSheetColumn;
		if(maxSheetColumn != null){
			putQueryParameter("MaxSheetColumn", maxSheetColumn.toString());
		}
	}

	public Boolean getFirstPage() {
		return this.firstPage;
	}

	public void setFirstPage(Boolean firstPage) {
		this.firstPage = firstPage;
		if(firstPage != null){
			putQueryParameter("FirstPage", firstPage.toString());
		}
	}

	public Boolean getPaperHorizontal() {
		return this.paperHorizontal;
	}

	public void setPaperHorizontal(Boolean paperHorizontal) {
		this.paperHorizontal = paperHorizontal;
		if(paperHorizontal != null){
			putQueryParameter("PaperHorizontal", paperHorizontal.toString());
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public Long getScalePercentage() {
		return this.scalePercentage;
	}

	public void setScalePercentage(Long scalePercentage) {
		this.scalePercentage = scalePercentage;
		if(scalePercentage != null){
			putQueryParameter("ScalePercentage", scalePercentage.toString());
		}
	}

	public Long getStartPage() {
		return this.startPage;
	}

	public void setStartPage(Long startPage) {
		this.startPage = startPage;
		if(startPage != null){
			putQueryParameter("StartPage", startPage.toString());
		}
	}

	public String getTargetURIPrefix() {
		return this.targetURIPrefix;
	}

	public void setTargetURIPrefix(String targetURIPrefix) {
		this.targetURIPrefix = targetURIPrefix;
		if(targetURIPrefix != null){
			putQueryParameter("TargetURIPrefix", targetURIPrefix);
		}
	}

	public String getTargetURI() {
		return this.targetURI;
	}

	public void setTargetURI(String targetURI) {
		this.targetURI = targetURI;
		if(targetURI != null){
			putQueryParameter("TargetURI", targetURI);
		}
	}

	public String getPaperSize() {
		return this.paperSize;
	}

	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
		if(paperSize != null){
			putQueryParameter("PaperSize", paperSize);
		}
	}

	public Long getImageDPI() {
		return this.imageDPI;
	}

	public void setImageDPI(Long imageDPI) {
		this.imageDPI = imageDPI;
		if(imageDPI != null){
			putQueryParameter("ImageDPI", imageDPI.toString());
		}
	}

	public Boolean getLongPicture() {
		return this.longPicture;
	}

	public void setLongPicture(Boolean longPicture) {
		this.longPicture = longPicture;
		if(longPicture != null){
			putQueryParameter("LongPicture", longPicture.toString());
		}
	}

	public Long getMaxSheetRow() {
		return this.maxSheetRow;
	}

	public void setMaxSheetRow(Long maxSheetRow) {
		this.maxSheetRow = maxSheetRow;
		if(maxSheetRow != null){
			putQueryParameter("MaxSheetRow", maxSheetRow.toString());
		}
	}

	public CredentialConfig getCredentialConfig() {
		return this.credentialConfig;
	}

	public void setCredentialConfig(CredentialConfig credentialConfig) {
		this.credentialConfig = credentialConfig;	
		if (credentialConfig != null) {
			putQueryParameter("CredentialConfig" , new Gson().toJson(credentialConfig));
		}	
	}

	public static class Notification {

		@SerializedName("MNS")
		private MNS mNS;

		@SerializedName("RocketMQ")
		private RocketMQ rocketMQ;

		public MNS getMNS() {
			return this.mNS;
		}

		public void setMNS(MNS mNS) {
			this.mNS = mNS;
		}

		public RocketMQ getRocketMQ() {
			return this.rocketMQ;
		}

		public void setRocketMQ(RocketMQ rocketMQ) {
			this.rocketMQ = rocketMQ;
		}

		public static class MNS {

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("TopicName")
			private String topicName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}
		}

		public static class RocketMQ {

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("InstanceId")
			private String instanceId;

			@SerializedName("TopicName")
			private String topicName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}
		}
	}

	public static class TrimPolicy {

		@SerializedName("DisableDeleteUnusedPicture")
		private Boolean disableDeleteUnusedPicture;

		@SerializedName("DisableDeleteRepeatedStyle")
		private Boolean disableDeleteRepeatedStyle;

		@SerializedName("DisableDeleteUnusedShape")
		private Boolean disableDeleteUnusedShape;

		@SerializedName("DisableDeleteEmptyCell")
		private Boolean disableDeleteEmptyCell;

		public Boolean getDisableDeleteUnusedPicture() {
			return this.disableDeleteUnusedPicture;
		}

		public void setDisableDeleteUnusedPicture(Boolean disableDeleteUnusedPicture) {
			this.disableDeleteUnusedPicture = disableDeleteUnusedPicture;
		}

		public Boolean getDisableDeleteRepeatedStyle() {
			return this.disableDeleteRepeatedStyle;
		}

		public void setDisableDeleteRepeatedStyle(Boolean disableDeleteRepeatedStyle) {
			this.disableDeleteRepeatedStyle = disableDeleteRepeatedStyle;
		}

		public Boolean getDisableDeleteUnusedShape() {
			return this.disableDeleteUnusedShape;
		}

		public void setDisableDeleteUnusedShape(Boolean disableDeleteUnusedShape) {
			this.disableDeleteUnusedShape = disableDeleteUnusedShape;
		}

		public Boolean getDisableDeleteEmptyCell() {
			return this.disableDeleteEmptyCell;
		}

		public void setDisableDeleteEmptyCell(Boolean disableDeleteEmptyCell) {
			this.disableDeleteEmptyCell = disableDeleteEmptyCell;
		}
	}

	public static class CredentialConfig {

		@SerializedName("Chain")
		private List<ChainItem> chain;

		@SerializedName("ServiceRole")
		private String serviceRole;

		@SerializedName("Policy")
		private String policy;

		public List<ChainItem> getChain() {
			return this.chain;
		}

		public void setChain(List<ChainItem> chain) {
			this.chain = chain;
		}

		public String getServiceRole() {
			return this.serviceRole;
		}

		public void setServiceRole(String serviceRole) {
			this.serviceRole = serviceRole;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public static class ChainItem {

			@SerializedName("Role")
			private String role;

			@SerializedName("RoleType")
			private String roleType;

			@SerializedName("AssumeRoleFor")
			private String assumeRoleFor;

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getRoleType() {
				return this.roleType;
			}

			public void setRoleType(String roleType) {
				this.roleType = roleType;
			}

			public String getAssumeRoleFor() {
				return this.assumeRoleFor;
			}

			public void setAssumeRoleFor(String assumeRoleFor) {
				this.assumeRoleFor = assumeRoleFor;
			}
		}
	}

	@Override
	public Class<CreateOfficeConversionTaskResponse> getResponseClass() {
		return CreateOfficeConversionTaskResponse.class;
	}

}
