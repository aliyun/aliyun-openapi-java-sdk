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
public class DelSecCheckSampleRequest extends RpcAcsRequest<DelSecCheckSampleResponse> {
	   

	private Long libId;

	private List<Long> sampleIds;

	private String type;
	public DelSecCheckSampleRequest() {
		super("cspro", "2018-03-15", "DelSecCheckSample", "cspro");
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

	public List<Long> getSampleIds() {
		return this.sampleIds;
	}

	public void setSampleIds(List<Long> sampleIds) {
		this.sampleIds = sampleIds;	
		if (sampleIds != null) {
			for (int i = 0; i < sampleIds.size(); i++) {
				putBodyParameter("SampleId." + (i + 1) , sampleIds.get(i));
			}
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

	@Override
	public Class<DelSecCheckSampleResponse> getResponseClass() {
		return DelSecCheckSampleResponse.class;
	}

}
