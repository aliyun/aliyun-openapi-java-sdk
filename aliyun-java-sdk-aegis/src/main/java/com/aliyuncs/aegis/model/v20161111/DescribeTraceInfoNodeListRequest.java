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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeTraceInfoNodeListRequest extends RpcAcsRequest<DescribeTraceInfoNodeListResponse> {
	
	public DescribeTraceInfoNodeListRequest() {
		super("aegis", "2016-11-11", "DescribeTraceInfoNodeList", "vipaegis");
	}

	private String sourceIp;

	private String vertexId;

	private String startType;

	private Integer pageSize;

	private String from;

	private Integer page;

	private String lang;

	private String type;

	private String uuid;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
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

	public String getStartType() {
		return this.startType;
	}

	public void setStartType(String startType) {
		this.startType = startType;
		if(startType != null){
			putQueryParameter("StartType", startType);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
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

	@Override
	public Class<DescribeTraceInfoNodeListResponse> getResponseClass() {
		return DescribeTraceInfoNodeListResponse.class;
	}

}
