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
package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeVulDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulDetailsResponse extends AcsResponse {

	private String requestId;

	private String name;

	private String aliasName;

	private String level;

	private Long vulPublishTs;

	private String type;

	private String product;

	private Boolean hasPatch;

	private Long patchPublishTs;

	private String patchSource;

	private String cvss;

	private String cveIds;

	private String advice;

	private String description;

	private Integer pendingCount;

	private Integer handledCount;

	private List<String> cveLists;

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

	public String getAliasName() {
		return this.aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Long getVulPublishTs() {
		return this.vulPublishTs;
	}

	public void setVulPublishTs(Long vulPublishTs) {
		this.vulPublishTs = vulPublishTs;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Boolean getHasPatch() {
		return this.hasPatch;
	}

	public void setHasPatch(Boolean hasPatch) {
		this.hasPatch = hasPatch;
	}

	public Long getPatchPublishTs() {
		return this.patchPublishTs;
	}

	public void setPatchPublishTs(Long patchPublishTs) {
		this.patchPublishTs = patchPublishTs;
	}

	public String getPatchSource() {
		return this.patchSource;
	}

	public void setPatchSource(String patchSource) {
		this.patchSource = patchSource;
	}

	public String getCvss() {
		return this.cvss;
	}

	public void setCvss(String cvss) {
		this.cvss = cvss;
	}

	public String getCveIds() {
		return this.cveIds;
	}

	public void setCveIds(String cveIds) {
		this.cveIds = cveIds;
	}

	public String getAdvice() {
		return this.advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPendingCount() {
		return this.pendingCount;
	}

	public void setPendingCount(Integer pendingCount) {
		this.pendingCount = pendingCount;
	}

	public Integer getHandledCount() {
		return this.handledCount;
	}

	public void setHandledCount(Integer handledCount) {
		this.handledCount = handledCount;
	}

	public List<String> getCveLists() {
		return this.cveLists;
	}

	public void setCveLists(List<String> cveLists) {
		this.cveLists = cveLists;
	}

	@Override
	public DescribeVulDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVulDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
