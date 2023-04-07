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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCdsFileShareLinkRequest extends RpcAcsRequest<CreateCdsFileShareLinkResponse> {
	   

	private String description;

	private Long previewLimit;

	private Boolean disableDownload;

	private Boolean disablePreview;

	private String sharePwd;

	private String shareName;

	private String endUserId;

	private Boolean disableSave;

	private Long downloadLimit;

	private String cdsId;

	private Long saveLimit;

	private List<String> fileIdss;

	private String expiration;
	public CreateCdsFileShareLinkRequest() {
		super("ecd", "2020-09-30", "CreateCdsFileShareLink");
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

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putQueryParameter("EndUserId", endUserId);
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

	public List<String> getFileIdss() {
		return this.fileIdss;
	}

	public void setFileIdss(List<String> fileIdss) {
		this.fileIdss = fileIdss;	
		if (fileIdss != null) {
			for (int i = 0; i < fileIdss.size(); i++) {
				putQueryParameter("FileIds." + (i + 1) , fileIdss.get(i));
			}
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

	@Override
	public Class<CreateCdsFileShareLinkResponse> getResponseClass() {
		return CreateCdsFileShareLinkResponse.class;
	}

}
