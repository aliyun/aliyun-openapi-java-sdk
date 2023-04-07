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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyCdsFileShareLinkRequest extends RpcAcsRequest<ModifyCdsFileShareLinkResponse> {
	   

	private String description;

	private String shareId;

	private Long previewLimit;

	private Boolean disableDownload;

	private Boolean disablePreview;

	private String sharePwd;

	private String shareName;

	private Long downloadCount;

	private Boolean disableSave;

	private Long saveCount;

	private Long reportCount;

	private Long videoPreviewCount;

	private Long downloadLimit;

	private String cdsId;

	private Long saveLimit;

	private String expiration;

	private Long previewCount;

	private String status;
	public ModifyCdsFileShareLinkRequest() {
		super("ecd", "2020-09-30", "ModifyCdsFileShareLink");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getShareId() {
		return this.shareId;
	}

	public void setShareId(String shareId) {
		this.shareId = shareId;
		if(shareId != null){
			putQueryParameter("ShareId", shareId);
		}
	}

	public Long getPreviewLimit() {
		return this.previewLimit;
	}

	public void setPreviewLimit(Long previewLimit) {
		this.previewLimit = previewLimit;
		if(previewLimit != null){
			putQueryParameter("PreviewLimit", previewLimit.toString());
		}
	}

	public Boolean getDisableDownload() {
		return this.disableDownload;
	}

	public void setDisableDownload(Boolean disableDownload) {
		this.disableDownload = disableDownload;
		if(disableDownload != null){
			putQueryParameter("DisableDownload", disableDownload.toString());
		}
	}

	public Boolean getDisablePreview() {
		return this.disablePreview;
	}

	public void setDisablePreview(Boolean disablePreview) {
		this.disablePreview = disablePreview;
		if(disablePreview != null){
			putQueryParameter("DisablePreview", disablePreview.toString());
		}
	}

	public String getSharePwd() {
		return this.sharePwd;
	}

	public void setSharePwd(String sharePwd) {
		this.sharePwd = sharePwd;
		if(sharePwd != null){
			putQueryParameter("SharePwd", sharePwd);
		}
	}

	public String getShareName() {
		return this.shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
		if(shareName != null){
			putQueryParameter("ShareName", shareName);
		}
	}

	public Long getDownloadCount() {
		return this.downloadCount;
	}

	public void setDownloadCount(Long downloadCount) {
		this.downloadCount = downloadCount;
		if(downloadCount != null){
			putQueryParameter("DownloadCount", downloadCount.toString());
		}
	}

	public Boolean getDisableSave() {
		return this.disableSave;
	}

	public void setDisableSave(Boolean disableSave) {
		this.disableSave = disableSave;
		if(disableSave != null){
			putQueryParameter("DisableSave", disableSave.toString());
		}
	}

	public Long getSaveCount() {
		return this.saveCount;
	}

	public void setSaveCount(Long saveCount) {
		this.saveCount = saveCount;
		if(saveCount != null){
			putQueryParameter("SaveCount", saveCount.toString());
		}
	}

	public Long getReportCount() {
		return this.reportCount;
	}

	public void setReportCount(Long reportCount) {
		this.reportCount = reportCount;
		if(reportCount != null){
			putQueryParameter("ReportCount", reportCount.toString());
		}
	}

	public Long getVideoPreviewCount() {
		return this.videoPreviewCount;
	}

	public void setVideoPreviewCount(Long videoPreviewCount) {
		this.videoPreviewCount = videoPreviewCount;
		if(videoPreviewCount != null){
			putQueryParameter("VideoPreviewCount", videoPreviewCount.toString());
		}
	}

	public Long getDownloadLimit() {
		return this.downloadLimit;
	}

	public void setDownloadLimit(Long downloadLimit) {
		this.downloadLimit = downloadLimit;
		if(downloadLimit != null){
			putQueryParameter("DownloadLimit", downloadLimit.toString());
		}
	}

	public String getCdsId() {
		return this.cdsId;
	}

	public void setCdsId(String cdsId) {
		this.cdsId = cdsId;
		if(cdsId != null){
			putQueryParameter("CdsId", cdsId);
		}
	}

	public Long getSaveLimit() {
		return this.saveLimit;
	}

	public void setSaveLimit(Long saveLimit) {
		this.saveLimit = saveLimit;
		if(saveLimit != null){
			putQueryParameter("SaveLimit", saveLimit.toString());
		}
	}

	public String getExpiration() {
		return this.expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
		if(expiration != null){
			putQueryParameter("Expiration", expiration);
		}
	}

	public Long getPreviewCount() {
		return this.previewCount;
	}

	public void setPreviewCount(Long previewCount) {
		this.previewCount = previewCount;
		if(previewCount != null){
			putQueryParameter("PreviewCount", previewCount.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ModifyCdsFileShareLinkResponse> getResponseClass() {
		return ModifyCdsFileShareLinkResponse.class;
	}

}
