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

/**
 * @author auto create
 * @version 
 */
public class DescribeGraph4InvestigationOnlineRequest extends RpcAcsRequest<DescribeGraph4InvestigationOnlineResponse> {
	   

	private String vertexId;

	private String anomalyId;

	private String anomalyUuid;

	private String lang;

	private String direction;

	private Integer pathLength;

	private String namespace;
	public DescribeGraph4InvestigationOnlineRequest() {
		super("Sas", "2018-12-03", "DescribeGraph4InvestigationOnline", "sas");
		setMethod(MethodType.POST);
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

	public String getAnomalyId() {
		return this.anomalyId;
	}

	public void setAnomalyId(String anomalyId) {
		this.anomalyId = anomalyId;
		if(anomalyId != null){
			putQueryParameter("AnomalyId", anomalyId);
		}
	}

	public String getAnomalyUuid() {
		return this.anomalyUuid;
	}

	public void setAnomalyUuid(String anomalyUuid) {
		this.anomalyUuid = anomalyUuid;
		if(anomalyUuid != null){
			putQueryParameter("AnomalyUuid", anomalyUuid);
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

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	public Integer getPathLength() {
		return this.pathLength;
	}

	public void setPathLength(Integer pathLength) {
		this.pathLength = pathLength;
		if(pathLength != null){
			putQueryParameter("PathLength", pathLength.toString());
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
	public Class<DescribeGraph4InvestigationOnlineResponse> getResponseClass() {
		return DescribeGraph4InvestigationOnlineResponse.class;
	}

}
