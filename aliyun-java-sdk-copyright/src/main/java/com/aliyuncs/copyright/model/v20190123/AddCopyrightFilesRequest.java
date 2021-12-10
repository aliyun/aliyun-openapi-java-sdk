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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddCopyrightFilesRequest extends RpcAcsRequest<AddCopyrightFilesResponse> {
	   

	private String extInfo;

	private String copyrightOwnersList;

	private String bizType;

	private String contactInfo;

	private String files;

	private String swtype;
	public AddCopyrightFilesRequest() {
		super("Copyright", "2019-01-23", "AddCopyrightFiles");
		setMethod(MethodType.POST);
	}

	public String getExtInfo() {
		return this.extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
		if(extInfo != null){
			putBodyParameter("ExtInfo", extInfo);
		}
	}

	public String getCopyrightOwnersList() {
		return this.copyrightOwnersList;
	}

	public void setCopyrightOwnersList(String copyrightOwnersList) {
		this.copyrightOwnersList = copyrightOwnersList;
		if(copyrightOwnersList != null){
			putBodyParameter("CopyrightOwnersList", copyrightOwnersList);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
		}
	}

	public String getContactInfo() {
		return this.contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
		if(contactInfo != null){
			putBodyParameter("ContactInfo", contactInfo);
		}
	}

	public String getFiles() {
		return this.files;
	}

	public void setFiles(String files) {
		this.files = files;
		if(files != null){
			putBodyParameter("Files", files);
		}
	}

	public String getSwtype() {
		return this.swtype;
	}

	public void setSwtype(String swtype) {
		this.swtype = swtype;
		if(swtype != null){
			putBodyParameter("Swtype", swtype);
		}
	}

	@Override
	public Class<AddCopyrightFilesResponse> getResponseClass() {
		return AddCopyrightFilesResponse.class;
	}

}
