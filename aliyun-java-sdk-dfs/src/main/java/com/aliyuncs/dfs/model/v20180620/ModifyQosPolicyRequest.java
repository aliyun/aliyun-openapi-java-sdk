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

package com.aliyuncs.dfs.model.v20180620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyQosPolicyRequest extends RpcAcsRequest<ModifyQosPolicyResponse> {
	   

	private String qosPolicyId;

	private String description;

	private Long maxIOps;

	private String inputRegionId;

	private Long maxMetaQps;

	private Long maxIOBandWidth;
	public ModifyQosPolicyRequest() {
		super("DFS", "2018-06-20", "ModifyQosPolicy", "alidfs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getQosPolicyId() {
		return this.qosPolicyId;
	}

	public void setQosPolicyId(String qosPolicyId) {
		this.qosPolicyId = qosPolicyId;
		if(qosPolicyId != null){
			putQueryParameter("QosPolicyId", qosPolicyId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getMaxIOps() {
		return this.maxIOps;
	}

	public void setMaxIOps(Long maxIOps) {
		this.maxIOps = maxIOps;
		if(maxIOps != null){
			putQueryParameter("MaxIOps", maxIOps.toString());
		}
	}

	public String getInputRegionId() {
		return this.inputRegionId;
	}

	public void setInputRegionId(String inputRegionId) {
		this.inputRegionId = inputRegionId;
		if(inputRegionId != null){
			putQueryParameter("InputRegionId", inputRegionId);
		}
	}

	public Long getMaxMetaQps() {
		return this.maxMetaQps;
	}

	public void setMaxMetaQps(Long maxMetaQps) {
		this.maxMetaQps = maxMetaQps;
		if(maxMetaQps != null){
			putQueryParameter("MaxMetaQps", maxMetaQps.toString());
		}
	}

	public Long getMaxIOBandWidth() {
		return this.maxIOBandWidth;
	}

	public void setMaxIOBandWidth(Long maxIOBandWidth) {
		this.maxIOBandWidth = maxIOBandWidth;
		if(maxIOBandWidth != null){
			putQueryParameter("MaxIOBandWidth", maxIOBandWidth.toString());
		}
	}

	@Override
	public Class<ModifyQosPolicyResponse> getResponseClass() {
		return ModifyQosPolicyResponse.class;
	}

}
