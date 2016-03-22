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
public class DescribeDomainRecordsRequest extends RpcAcsRequest<DescribeDomainRecordsResponse> {
	
	public DescribeDomainRecordsRequest() {
		super("Alidns", "2015-01-09", "DescribeDomainRecords");
	}

	private String domainName;

	private Long pageNumber;

	private Long pageSize;

	private String rRKeyWord;

	private String typeKeyWord;

	private String valueKeyWord;

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		putQueryParameter("DomainName", domainName);
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		putQueryParameter("PageNumber", pageNumber);
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	public String getRRKeyWord() {
		return this.rRKeyWord;
	}

	public void setRRKeyWord(String rRKeyWord) {
		this.rRKeyWord = rRKeyWord;
		putQueryParameter("RRKeyWord", rRKeyWord);
	}

	public String getTypeKeyWord() {
		return this.typeKeyWord;
	}

	public void setTypeKeyWord(String typeKeyWord) {
		this.typeKeyWord = typeKeyWord;
		putQueryParameter("TypeKeyWord", typeKeyWord);
	}

	public String getValueKeyWord() {
		return this.valueKeyWord;
	}

	public void setValueKeyWord(String valueKeyWord) {
		this.valueKeyWord = valueKeyWord;
		putQueryParameter("ValueKeyWord", valueKeyWord);
	}

	@Override
	public Class<DescribeDomainRecordsResponse> getResponseClass() {
		return DescribeDomainRecordsResponse.class;
	}

}
