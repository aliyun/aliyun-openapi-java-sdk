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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyInterceptionTargetRequest extends RpcAcsRequest<ModifyInterceptionTargetResponse> {
	   

	private Long targetId;

	private String targetType;

	private List<String> imageLists;

	private List<String> tagLists;

	private String targetName;

	private String appName;

	private String namespace;
	public ModifyInterceptionTargetRequest() {
		super("Sas", "2018-12-03", "ModifyInterceptionTarget", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getTargetId() {
		return this.targetId;
	}

	public void setTargetId(Long targetId) {
		this.targetId = targetId;
		if(targetId != null){
			putQueryParameter("TargetId", targetId.toString());
		}
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
		}
	}

	public List<String> getImageLists() {
		return this.imageLists;
	}

	public void setImageLists(List<String> imageLists) {
		this.imageLists = imageLists;	
		if (imageLists != null) {
			for (int i = 0; i < imageLists.size(); i++) {
				putQueryParameter("ImageList." + (i + 1) , imageLists.get(i));
			}
		}	
	}

	public List<String> getTagLists() {
		return this.tagLists;
	}

	public void setTagLists(List<String> tagLists) {
		this.tagLists = tagLists;	
		if (tagLists != null) {
			for (int i = 0; i < tagLists.size(); i++) {
				putQueryParameter("TagList." + (i + 1) , tagLists.get(i));
			}
		}	
	}

	public String getTargetName() {
		return this.targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
		if(targetName != null){
			putQueryParameter("TargetName", targetName);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	@Override
	public Class<ModifyInterceptionTargetResponse> getResponseClass() {
		return ModifyInterceptionTargetResponse.class;
	}

}
