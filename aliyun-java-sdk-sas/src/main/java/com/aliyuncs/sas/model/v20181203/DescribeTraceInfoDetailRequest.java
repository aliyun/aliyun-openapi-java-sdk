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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeTraceInfoDetailRequest extends RpcAcsRequest<DescribeTraceInfoDetailResponse> {
	   

	private String vertexId;

	private String type;

	private String uuid;

	private String sourceIp;

	private String from;

	private String lang;

	private Long incidentTime;
	public DescribeTraceInfoDetailRequest() {
		super("Sas", "2018-12-03", "DescribeTraceInfoDetail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVertexId() {
		return this.vertexId;
	}

	public void setVertexId(String vertexId) {
		this.vertexId = vertexId;
		if(vertexId != null){
			putQueryParameter("VertexId", vertexId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
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

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Long getIncidentTime() {
		return this.incidentTime;
	}

	public void setIncidentTime(Long incidentTime) {
		this.incidentTime = incidentTime;
		if(incidentTime != null){
			putQueryParameter("IncidentTime", incidentTime.toString());
		}
	}

	@Override
	public Class<DescribeTraceInfoDetailResponse> getResponseClass() {
		return DescribeTraceInfoDetailResponse.class;
	}

}
