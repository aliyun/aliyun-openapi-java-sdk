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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryRMSMetricsRequest extends RpcAcsRequest<QueryRMSMetricsResponse> {
	   

	private String dsId;

	private String workspaceName;

	private Long end;

	private List<Where> wheres;

	private List<String> fieldsRepeatLists;

	private Long start;

	private String contentType;

	private String plugin;
	public QueryRMSMetricsRequest() {
		super("SOFA", "2019-08-15", "QueryRMSMetrics", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDsId() {
		return this.dsId;
	}

	public void setDsId(String dsId) {
		this.dsId = dsId;
		if(dsId != null){
			putBodyParameter("DsId", dsId);
		}
	}

	public String getWorkspaceName() {
		return this.workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
		if(workspaceName != null){
			putBodyParameter("WorkspaceName", workspaceName);
		}
	}

	public Long getEnd() {
		return this.end;
	}

	public void setEnd(Long end) {
		this.end = end;
		if(end != null){
			putBodyParameter("End", end.toString());
		}
	}

	public List<Where> getWheres() {
		return this.wheres;
	}

	public void setWheres(List<Where> wheres) {
		this.wheres = wheres;	
		if (wheres != null) {
			for (int depth1 = 0; depth1 < wheres.size(); depth1++) {
				putBodyParameter("Where." + (depth1 + 1) + ".Value" , wheres.get(depth1).getValue());
				putBodyParameter("Where." + (depth1 + 1) + ".Key" , wheres.get(depth1).getKey());
			}
		}	
	}

	public List<String> getFieldsRepeatLists() {
		return this.fieldsRepeatLists;
	}

	public void setFieldsRepeatLists(List<String> fieldsRepeatLists) {
		this.fieldsRepeatLists = fieldsRepeatLists;	
		if (fieldsRepeatLists != null) {
			for (int i = 0; i < fieldsRepeatLists.size(); i++) {
				putBodyParameter("FieldsRepeatList." + (i + 1) , fieldsRepeatLists.get(i));
			}
		}	
	}

	public Long getStart() {
		return this.start;
	}

	public void setStart(Long start) {
		this.start = start;
		if(start != null){
			putBodyParameter("Start", start.toString());
		}
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
		if(contentType != null){
			putBodyParameter("ContentType", contentType);
		}
	}

	public String getPlugin() {
		return this.plugin;
	}

	public void setPlugin(String plugin) {
		this.plugin = plugin;
		if(plugin != null){
			putBodyParameter("Plugin", plugin);
		}
	}

	public static class Where {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<QueryRMSMetricsResponse> getResponseClass() {
		return QueryRMSMetricsResponse.class;
	}

}
