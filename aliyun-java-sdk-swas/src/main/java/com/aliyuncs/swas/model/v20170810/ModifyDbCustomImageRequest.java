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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyDbCustomImageRequest extends RpcAcsRequest<ModifyDbCustomImageResponse> {
	   

	private String finalImageId;

	private String copyUserId;

	private String site;

	private String tempImageId;

	private Long status;
	public ModifyDbCustomImageRequest() {
		super("SWAS", "2017-08-10", "ModifyDbCustomImage", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getFinalImageId() {
		return this.finalImageId;
	}

	public void setFinalImageId(String finalImageId) {
		this.finalImageId = finalImageId;
		if(finalImageId != null){
			putQueryParameter("FinalImageId", finalImageId);
		}
	}

	public String getCopyUserId() {
		return this.copyUserId;
	}

	public void setCopyUserId(String copyUserId) {
		this.copyUserId = copyUserId;
		if(copyUserId != null){
			putQueryParameter("CopyUserId", copyUserId);
		}
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
		}
	}

	public String getTempImageId() {
		return this.tempImageId;
	}

	public void setTempImageId(String tempImageId) {
		this.tempImageId = tempImageId;
		if(tempImageId != null){
			putQueryParameter("TempImageId", tempImageId);
		}
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<ModifyDbCustomImageResponse> getResponseClass() {
		return ModifyDbCustomImageResponse.class;
	}

}
