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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutContactGroupRequest extends RpcAcsRequest<PutContactGroupResponse> {
	   

	private String contactGroupName;

	private String describe;

	private List<String> contactNamess;
	public PutContactGroupRequest() {
		super("Cms", "2019-01-01", "PutContactGroup", "cms");
		setMethod(MethodType.POST);
	}

	public String getContactGroupName() {
		return this.contactGroupName;
	}

	public void setContactGroupName(String contactGroupName) {
		this.contactGroupName = contactGroupName;
		if(contactGroupName != null){
			putQueryParameter("ContactGroupName", contactGroupName);
		}
	}

	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
		if(describe != null){
			putQueryParameter("Describe", describe);
		}
	}

	public List<String> getContactNamess() {
		return this.contactNamess;
	}

	public void setContactNamess(List<String> contactNamess) {
		this.contactNamess = contactNamess;	
		if (contactNamess != null) {
			for (int i = 0; i < contactNamess.size(); i++) {
				putQueryParameter("ContactNames." + (i + 1) , contactNamess.get(i));
			}
		}	
	}

	@Override
	public Class<PutContactGroupResponse> getResponseClass() {
		return PutContactGroupResponse.class;
	}

}
