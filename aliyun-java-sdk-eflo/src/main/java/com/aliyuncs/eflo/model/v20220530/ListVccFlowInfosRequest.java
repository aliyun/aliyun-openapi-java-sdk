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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListVccFlowInfosRequest extends RpcAcsRequest<ListVccFlowInfosResponse> {
	   

	private Long from;

	private Long to;

	private String vccId;

	private String metricName;

	private String direction;
	public ListVccFlowInfosRequest() {
		super("eflo", "2022-05-30", "ListVccFlowInfos", "eflo");
		setMethod(MethodType.POST);
	}

	public Long getFrom() {
		return this.from;
	}

	public void setFrom(Long from) {
		this.from = from;
		if(from != null){
			putBodyParameter("From", from.toString());
		}
	}

	public Long getTo() {
		return this.to;
	}

	public void setTo(Long to) {
		this.to = to;
		if(to != null){
			putBodyParameter("To", to.toString());
		}
	}

	public String getVccId() {
		return this.vccId;
	}

	public void setVccId(String vccId) {
		this.vccId = vccId;
		if(vccId != null){
			putBodyParameter("VccId", vccId);
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putBodyParameter("MetricName", metricName);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putBodyParameter("Direction", direction);
		}
	}

	@Override
	public Class<ListVccFlowInfosResponse> getResponseClass() {
		return ListVccFlowInfosResponse.class;
	}

}
