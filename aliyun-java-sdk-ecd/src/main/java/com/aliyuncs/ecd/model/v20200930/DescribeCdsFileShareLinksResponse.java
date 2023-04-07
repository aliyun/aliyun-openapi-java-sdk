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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeCdsFileShareLinksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdsFileShareLinksResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<CdsFileShareLinkModel> data;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<CdsFileShareLinkModel> getData() {
		return this.data;
	}

	public void setData(List<CdsFileShareLinkModel> data) {
		this.data = data;
	}

	public static class CdsFileShareLinkModel {

		private String description;

		private Long saveLimit;

		private Long downloadCount;

		private String creator;

		private Long saveCount;

		private Boolean disableSave;

		private String sharePwd;

		private Boolean disablePreview;

		private Long accessCount;

		private String shareId;

		private Long downloadLimit;

		private String status;

		private String driveId;

		private String modifiyTime;

		private Boolean disableDownload;

		private String expiration;

		private Boolean expired;

		private Long previewCount;

		private Long previewLimit;

		private Long videoPreviewCount;

		private Long reportCount;

		private String fileIds;

		private String shareName;

		private String createTime;

		private String shareLink;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getSaveLimit() {
			return this.saveLimit;
		}

		public void setSaveLimit(Long saveLimit) {
			this.saveLimit = saveLimit;
		}

		public Long getDownloadCount() {
			return this.downloadCount;
		}

		public void setDownloadCount(Long downloadCount) {
			this.downloadCount = downloadCount;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public Long getSaveCount() {
			return this.saveCount;
		}

		public void setSaveCount(Long saveCount) {
			this.saveCount = saveCount;
		}

		public Boolean getDisableSave() {
			return this.disableSave;
		}

		public void setDisableSave(Boolean disableSave) {
			this.disableSave = disableSave;
		}

		public String getSharePwd() {
			return this.sharePwd;
		}

		public void setSharePwd(String sharePwd) {
			this.sharePwd = sharePwd;
		}

		public Boolean getDisablePreview() {
			return this.disablePreview;
		}

		public void setDisablePreview(Boolean disablePreview) {
			this.disablePreview = disablePreview;
		}

		public Long getAccessCount() {
			return this.accessCount;
		}

		public void setAccessCount(Long accessCount) {
			this.accessCount = accessCount;
		}

		public String getShareId() {
			return this.shareId;
		}

		public void setShareId(String shareId) {
			this.shareId = shareId;
		}

		public Long getDownloadLimit() {
			return this.downloadLimit;
		}

		public void setDownloadLimit(Long downloadLimit) {
			this.downloadLimit = downloadLimit;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDriveId() {
			return this.driveId;
		}

		public void setDriveId(String driveId) {
			this.driveId = driveId;
		}

		public String getModifiyTime() {
			return this.modifiyTime;
		}

		public void setModifiyTime(String modifiyTime) {
			this.modifiyTime = modifiyTime;
		}

		public Boolean getDisableDownload() {
			return this.disableDownload;
		}

		public void setDisableDownload(Boolean disableDownload) {
			this.disableDownload = disableDownload;
		}

		public String getExpiration() {
			return this.expiration;
		}

		public void setExpiration(String expiration) {
			this.expiration = expiration;
		}

		public Boolean getExpired() {
			return this.expired;
		}

		public void setExpired(Boolean expired) {
			this.expired = expired;
		}

		public Long getPreviewCount() {
			return this.previewCount;
		}

		public void setPreviewCount(Long previewCount) {
			this.previewCount = previewCount;
		}

		public Long getPreviewLimit() {
			return this.previewLimit;
		}

		public void setPreviewLimit(Long previewLimit) {
			this.previewLimit = previewLimit;
		}

		public Long getVideoPreviewCount() {
			return this.videoPreviewCount;
		}

		public void setVideoPreviewCount(Long videoPreviewCount) {
			this.videoPreviewCount = videoPreviewCount;
		}

		public Long getReportCount() {
			return this.reportCount;
		}

		public void setReportCount(Long reportCount) {
			this.reportCount = reportCount;
		}

		public String getFileIds() {
			return this.fileIds;
		}

		public void setFileIds(String fileIds) {
			this.fileIds = fileIds;
		}

		public String getShareName() {
			return this.shareName;
		}

		public void setShareName(String shareName) {
			this.shareName = shareName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getShareLink() {
			return this.shareLink;
		}

		public void setShareLink(String shareLink) {
			this.shareLink = shareLink;
		}
	}

	@Override
	public DescribeCdsFileShareLinksResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdsFileShareLinksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
