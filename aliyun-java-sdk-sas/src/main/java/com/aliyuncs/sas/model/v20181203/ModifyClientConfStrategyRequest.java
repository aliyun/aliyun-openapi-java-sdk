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
public class ModifyClientConfStrategyRequest extends RpcAcsRequest<ModifyClientConfStrategyResponse> {
	   

	private String uuid;

	private String tag;

	private String tagValue;

	private String tagExt;

	private List<String> uuidss;
	public ModifyClientConfStrategyRequest() {
		super("Sas", "2018-12-03", "ModifyClientConfStrategy", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
		}
	}

	public String getTagValue() {
		return this.tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
		if(tagValue != null){
			putQueryParameter("TagValue", tagValue);
		}
	}

	public String getTagExt() {
		return this.tagExt;
	}

	public void setTagExt(String tagExt) {
		this.tagExt = tagExt;
		if(tagExt != null){
			putQueryParameter("TagExt", tagExt);
		}
	}

	public List<String> getUuidss() {
		return this.uuidss;
	}

	public void setUuidss(List<String> uuidss) {
		this.uuidss = uuidss;	
		if (uuidss != null) {
			for (int i = 0; i < uuidss.size(); i++) {
				putQueryParameter("Uuids." + (i + 1) , uuidss.get(i));
			}
		}	
	}

	@Override
	public Class<ModifyClientConfStrategyResponse> getResponseClass() {
		return ModifyClientConfStrategyResponse.class;
	}

}
