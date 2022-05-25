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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeHybridMonitorDataListRequest extends RpcAcsRequest<DescribeHybridMonitorDataListResponse> {
	   

	private String period;

	private Long start;

	private String namespace;

	private Long end;

	private String promSQL;
	public DescribeHybridMonitorDataListRequest() {
		super("Cms", "2019-01-01", "DescribeHybridMonitorDataList", "cms");
		setMethod(MethodType.POST);
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public Long getStart() {
		return this.start;
	}

	public void setStart(Long start) {
		this.start = start;
		if(start != null){
			putQueryParameter("Start", start.toString());
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

	public Long getEnd() {
		return this.end;
	}

	public void setEnd(Long end) {
		this.end = end;
		if(end != null){
			putQueryParameter("End", end.toString());
		}
	}

	public String getPromSQL() {
		return this.promSQL;
	}

	public void setPromSQL(String promSQL) {
		this.promSQL = promSQL;
		if(promSQL != null){
			putQueryParameter("PromSQL", promSQL);
		}
	}

	@Override
	public Class<DescribeHybridMonitorDataListResponse> getResponseClass() {
		return DescribeHybridMonitorDataListResponse.class;
	}

}
