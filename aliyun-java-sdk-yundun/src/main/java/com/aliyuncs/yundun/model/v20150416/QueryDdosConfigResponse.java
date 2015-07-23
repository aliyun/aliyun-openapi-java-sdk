/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.yundun.model.v20150416;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun.transform.v20150416.QueryDdosConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDdosConfigResponse extends AcsResponse {

	private String requestId;

	private Long bps;

	private Long pps;

	private Long qps;

	private Long sipconn;

	private Long sipnew;

	private Boolean layer7Config;

	private Integer flowPosition;

	private Integer qpsPosition;

	private Integer strategyPosition;

	private Integer level;

	private String holeBps;

	private String configType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getBps() {
		return this.bps;
	}

	public void setBps(Long bps) {
		this.bps = bps;
	}

	public Long getPps() {
		return this.pps;
	}

	public void setPps(Long pps) {
		this.pps = pps;
	}

	public Long getQps() {
		return this.qps;
	}

	public void setQps(Long qps) {
		this.qps = qps;
	}

	public Long getSipconn() {
		return this.sipconn;
	}

	public void setSipconn(Long sipconn) {
		this.sipconn = sipconn;
	}

	public Long getSipnew() {
		return this.sipnew;
	}

	public void setSipnew(Long sipnew) {
		this.sipnew = sipnew;
	}

	public Boolean getLayer7Config() {
		return this.layer7Config;
	}

	public void setLayer7Config(Boolean layer7Config) {
		this.layer7Config = layer7Config;
	}

	public Integer getFlowPosition() {
		return this.flowPosition;
	}

	public void setFlowPosition(Integer flowPosition) {
		this.flowPosition = flowPosition;
	}

	public Integer getQpsPosition() {
		return this.qpsPosition;
	}

	public void setQpsPosition(Integer qpsPosition) {
		this.qpsPosition = qpsPosition;
	}

	public Integer getStrategyPosition() {
		return this.strategyPosition;
	}

	public void setStrategyPosition(Integer strategyPosition) {
		this.strategyPosition = strategyPosition;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getHoleBps() {
		return this.holeBps;
	}

	public void setHoleBps(String holeBps) {
		this.holeBps = holeBps;
	}

	public String getConfigType() {
		return this.configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
	}

	@Override
	public QueryDdosConfigResponse getInstance(UnmarshallerContext context) {
		return	QueryDdosConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
