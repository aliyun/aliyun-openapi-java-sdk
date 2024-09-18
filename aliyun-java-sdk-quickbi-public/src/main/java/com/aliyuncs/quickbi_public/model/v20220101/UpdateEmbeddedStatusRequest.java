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
public class UpdateEmbeddedStatusRequest extends RpcAcsRequest<UpdateEmbeddedStatusResponse> {
	   

	private Boolean thirdPartAuthFlag;

	private String worksId;
	public UpdateEmbeddedStatusRequest() {
		super("quickbi-public", "2022-01-01", "UpdateEmbeddedStatus", "2.2.0");
		setMethod(MethodType.POST);
	}

	public Boolean getThirdPartAuthFlag() {
		return this.thirdPartAuthFlag;
	}

	public void setThirdPartAuthFlag(Boolean thirdPartAuthFlag) {
		this.thirdPartAuthFlag = thirdPartAuthFlag;
		if(thirdPartAuthFlag != null){
			putQueryParameter("ThirdPartAuthFlag", thirdPartAuthFlag.toString());
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

	@Override
	public Class<UpdateEmbeddedStatusResponse> getResponseClass() {
		return UpdateEmbeddedStatusResponse.class;
	}

}
