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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpgradeIsvConfigRequest extends RpcAcsRequest<UpgradeIsvConfigResponse> {
	   

	private AliyunAccountDTO aliyunAccountDTO;

	private Long versionId;
	public UpgradeIsvConfigRequest() {
		super("RetailBot", "2021-02-24", "UpgradeIsvConfig");
		setMethod(MethodType.POST);
	}

	public AliyunAccountDTO getAliyunAccountDTO() {
		return this.aliyunAccountDTO;
	}

	public void setAliyunAccountDTO(AliyunAccountDTO aliyunAccountDTO) {
		this.aliyunAccountDTO = aliyunAccountDTO;	
		if (aliyunAccountDTO != null) {
			
				putBodyParameter("AliyunAccountDTO.AliUid" , aliyunAccountDTO.getAliUid());
		}	
	}

	public Long getVersionId() {
		return this.versionId;
	}

	public void setVersionId(Long versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putBodyParameter("VersionId", versionId.toString());
		}
	}

	public static class AliyunAccountDTO {

		private Long aliUid;

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}
	}

	@Override
	public Class<UpgradeIsvConfigResponse> getResponseClass() {
		return UpgradeIsvConfigResponse.class;
	}

}
