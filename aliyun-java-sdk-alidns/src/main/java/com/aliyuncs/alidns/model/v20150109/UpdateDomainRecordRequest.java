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
package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateDomainRecordRequest extends RpcAcsRequest<UpdateDomainRecordResponse> {
	
	public UpdateDomainRecordRequest() {
		super("Alidns", "2015-01-09", "UpdateDomainRecord");
	}

	private String recordId;

	private String rR;

	private String type;

	private String value;

	private Long tTL;

	private Long priority;

	private String line;

	public String getRecordId() {
		return this.recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
		putQueryParameter("RecordId", recordId);
	}

	public String getRR() {
		return this.rR;
	}

	public void setRR(String rR) {
		this.rR = rR;
		putQueryParameter("RR", rR);
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		putQueryParameter("Type", type);
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		putQueryParameter("Value", value);
	}

	public Long getTTL() {
		return this.tTL;
	}

	public void setTTL(Long tTL) {
		this.tTL = tTL;
		putQueryParameter("TTL", tTL);
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
		putQueryParameter("Priority", priority);
	}

	public String getLine() {
		return this.line;
	}

	public void setLine(String line) {
		this.line = line;
		putQueryParameter("Line", line);
	}

	@Override
	public Class<UpdateDomainRecordResponse> getResponseClass() {
		return UpdateDomainRecordResponse.class;
	}

}
