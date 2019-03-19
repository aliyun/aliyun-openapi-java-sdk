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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SavePageConfigTemplateRequest extends RpcAcsRequest<SavePageConfigTemplateResponse> {
	
	public SavePageConfigTemplateRequest() {
		super("cloudwf", "2017-03-28", "SavePageConfigTemplate", "cloudwf");
	}

	private Integer tempType;

	private String tempDesc;

	private String tempName;

	private Long id;

	private String tempPermission;

	public Integer getTempType() {
		return this.tempType;
	}

	public void setTempType(Integer tempType) {
		this.tempType = tempType;
		if(tempType != null){
			putQueryParameter("TempType", tempType.toString());
		}
	}

	public String getTempDesc() {
		return this.tempDesc;
	}

	public void setTempDesc(String tempDesc) {
		this.tempDesc = tempDesc;
		if(tempDesc != null){
			putQueryParameter("TempDesc", tempDesc);
		}
	}

	public String getTempName() {
		return this.tempName;
	}

	public void setTempName(String tempName) {
		this.tempName = tempName;
		if(tempName != null){
			putQueryParameter("TempName", tempName);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getTempPermission() {
		return this.tempPermission;
	}

	public void setTempPermission(String tempPermission) {
		this.tempPermission = tempPermission;
		if(tempPermission != null){
			putQueryParameter("TempPermission", tempPermission);
		}
	}

	@Override
	public Class<SavePageConfigTemplateResponse> getResponseClass() {
		return SavePageConfigTemplateResponse.class;
	}

}
