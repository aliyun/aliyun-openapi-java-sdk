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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspiciousExportInfoRequest extends RpcAcsRequest<DescribeSuspiciousExportInfoResponse> {
	
	public DescribeSuspiciousExportInfoRequest() {
		super("aegis", "2016-11-11", "DescribeSuspiciousExportInfo", "vipaegis");
	}

	private Long resourceOwnerId;

	private String sourceIp;

	private Integer exportId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Integer getExportId() {
		return this.exportId;
	}

	public void setExportId(Integer exportId) {
		this.exportId = exportId;
		if(exportId != null){
			putQueryParameter("ExportId", exportId.toString());
		}
	}

	@Override
	public Class<DescribeSuspiciousExportInfoResponse> getResponseClass() {
		return DescribeSuspiciousExportInfoResponse.class;
	}

}
