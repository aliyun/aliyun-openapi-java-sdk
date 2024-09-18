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
public class CancelReportShareRequest extends RpcAcsRequest<CancelReportShareResponse> {
	   

	private String reportId;

	private String shareToIds;

	private Integer shareToType;
	public CancelReportShareRequest() {
		super("quickbi-public", "2022-01-01", "CancelReportShare", "2.2.0");
		setMethod(MethodType.POST);
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
		if(reportId != null){
			putQueryParameter("ReportId", reportId);
		}
	}

	public String getShareToIds() {
		return this.shareToIds;
	}

	public void setShareToIds(String shareToIds) {
		this.shareToIds = shareToIds;
		if(shareToIds != null){
			putQueryParameter("ShareToIds", shareToIds);
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

	@Override
	public Class<CancelReportShareResponse> getResponseClass() {
		return CancelReportShareResponse.class;
	}

}
