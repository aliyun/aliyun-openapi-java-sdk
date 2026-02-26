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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SendSystemPropertyTemplateRequest extends RpcAcsRequest<SendSystemPropertyTemplateResponse> {
	   

	private List<String> androidInstanceIdss;

	private List<String> templateIdss;

	private String templateId;
	public SendSystemPropertyTemplateRequest() {
		super("eds-aic", "2023-09-30", "SendSystemPropertyTemplate");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getAndroidInstanceIdss() {
		return this.androidInstanceIdss;
	}

	public void setAndroidInstanceIdss(List<String> androidInstanceIdss) {
		this.androidInstanceIdss = androidInstanceIdss;	
		if (androidInstanceIdss != null) {
			for (int i = 0; i < androidInstanceIdss.size(); i++) {
				putBodyParameter("AndroidInstanceIds." + (i + 1) , androidInstanceIdss.get(i));
			}
		}	
	}

	public List<String> getTemplateIdss() {
		return this.templateIdss;
	}

	public void setTemplateIdss(List<String> templateIdss) {
		this.templateIdss = templateIdss;	
		if (templateIdss != null) {
			for (int i = 0; i < templateIdss.size(); i++) {
				putQueryParameter("TemplateIds." + (i + 1) , templateIdss.get(i));
			}
		}	
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	@Override
	public Class<SendSystemPropertyTemplateResponse> getResponseClass() {
		return SendSystemPropertyTemplateResponse.class;
	}

}
