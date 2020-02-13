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

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddSecCheckSampleRequest extends RpcAcsRequest<AddSecCheckSampleResponse> {
	   

	private Long libId;

	private String type;

	private List<String> contents;
	public AddSecCheckSampleRequest() {
		super("cspro", "2018-03-15", "AddSecCheckSample", "cspro");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getLibId() {
		return this.libId;
	}

	public void setLibId(Long libId) {
		this.libId = libId;
		if(libId != null){
			putBodyParameter("LibId", libId.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public List<String> getContents() {
		return this.contents;
	}

	public void setContents(List<String> contents) {
		this.contents = contents;	
		if (contents != null) {
			for (int i = 0; i < contents.size(); i++) {
				putBodyParameter("Content." + (i + 1) , contents.get(i));
			}
		}	
	}

	@Override
	public Class<AddSecCheckSampleResponse> getResponseClass() {
		return AddSecCheckSampleResponse.class;
	}

}
