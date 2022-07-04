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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddShareReportRequest extends RpcAcsRequest<AddShareReportResponse> {
	   

	private Integer authPoint;

	private Long expireDate;

	private Integer shareToType;

	private String worksId;

	private String shareToId;
	public AddShareReportRequest() {
		super("quickbi-public", "2022-01-01", "AddShareReport", "quickbi");
		setMethod(MethodType.POST);
	}

	public Integer getAuthPoint() {
		return this.authPoint;
	}

	public void setAuthPoint(Integer authPoint) {
		this.authPoint = authPoint;
		if(authPoint != null){
			putQueryParameter("AuthPoint", authPoint.toString());
		}
	}

	public Long getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Long expireDate) {
		this.expireDate = expireDate;
		if(expireDate != null){
			putQueryParameter("ExpireDate", expireDate.toString());
		}
	}

	public Integer getShareToType() {
		return this.shareToType;
	}

	public void setShareToType(Integer shareToType) {
		this.shareToType = shareToType;
		if(shareToType != null){
			putQueryParameter("ShareToType", shareToType.toString());
		}
	}

	public String getWorksId() {
		return this.worksId;
	}

	public void setWorksId(String worksId) {
		this.worksId = worksId;
		if(worksId != null){
			putQueryParameter("WorksId", worksId);
		}
	}

	public String getShareToId() {
		return this.shareToId;
	}

	public void setShareToId(String shareToId) {
		this.shareToId = shareToId;
		if(shareToId != null){
			putQueryParameter("ShareToId", shareToId);
		}
	}

	@Override
	public Class<AddShareReportResponse> getResponseClass() {
		return AddShareReportResponse.class;
	}

}
