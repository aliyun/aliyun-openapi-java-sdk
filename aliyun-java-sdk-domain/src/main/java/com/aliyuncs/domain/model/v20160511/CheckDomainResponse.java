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
package com.aliyuncs.domain.model.v20160511;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20160511.CheckDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckDomainResponse extends AcsResponse {

	private String requestId;

	private String name;

	private Integer avail;

	private String reason;

	private String feeCurrency;

	private Integer feePeriod;

	private String feeFee;

	private String rmbFee;

	private String feeCommand;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAvail() {
		return this.avail;
	}

	public void setAvail(Integer avail) {
		this.avail = avail;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getFeeCurrency() {
		return this.feeCurrency;
	}

	public void setFeeCurrency(String feeCurrency) {
		this.feeCurrency = feeCurrency;
	}

	public Integer getFeePeriod() {
		return this.feePeriod;
	}

	public void setFeePeriod(Integer feePeriod) {
		this.feePeriod = feePeriod;
	}

	public String getFeeFee() {
		return this.feeFee;
	}

	public void setFeeFee(String feeFee) {
		this.feeFee = feeFee;
	}

	public String getRmbFee() {
		return this.rmbFee;
	}

	public void setRmbFee(String rmbFee) {
		this.rmbFee = rmbFee;
	}

	public String getFeeCommand() {
		return this.feeCommand;
	}

	public void setFeeCommand(String feeCommand) {
		this.feeCommand = feeCommand;
	}

	@Override
	public CheckDomainResponse getInstance(UnmarshallerContext context) {
		return	CheckDomainResponseUnmarshaller.unmarshall(this, context);
	}
}
