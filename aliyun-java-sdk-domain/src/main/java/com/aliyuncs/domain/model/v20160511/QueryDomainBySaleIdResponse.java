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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20160511.QueryDomainBySaleIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainBySaleIdResponse extends AcsResponse {

	private String userId;

	private String domainName;

	private String saleId;

	private String creationDate;

	private String expirationDate;

	private String domainRegType;

	private String englishHolder;

	private String chineseHolder;

	private String englishContactPerson;

	private String chineseContactPerson;

	private String holderEmail;

	private String transferOutStatus;

	private String safetyLock;

	private String transferLock;

	private Boolean whoisProtected;

	private List<String> dnsList;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getSaleId() {
		return this.saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	public String getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getDomainRegType() {
		return this.domainRegType;
	}

	public void setDomainRegType(String domainRegType) {
		this.domainRegType = domainRegType;
	}

	public String getEnglishHolder() {
		return this.englishHolder;
	}

	public void setEnglishHolder(String englishHolder) {
		this.englishHolder = englishHolder;
	}

	public String getChineseHolder() {
		return this.chineseHolder;
	}

	public void setChineseHolder(String chineseHolder) {
		this.chineseHolder = chineseHolder;
	}

	public String getEnglishContactPerson() {
		return this.englishContactPerson;
	}

	public void setEnglishContactPerson(String englishContactPerson) {
		this.englishContactPerson = englishContactPerson;
	}

	public String getChineseContactPerson() {
		return this.chineseContactPerson;
	}

	public void setChineseContactPerson(String chineseContactPerson) {
		this.chineseContactPerson = chineseContactPerson;
	}

	public String getHolderEmail() {
		return this.holderEmail;
	}

	public void setHolderEmail(String holderEmail) {
		this.holderEmail = holderEmail;
	}

	public String getTransferOutStatus() {
		return this.transferOutStatus;
	}

	public void setTransferOutStatus(String transferOutStatus) {
		this.transferOutStatus = transferOutStatus;
	}

	public String getSafetyLock() {
		return this.safetyLock;
	}

	public void setSafetyLock(String safetyLock) {
		this.safetyLock = safetyLock;
	}

	public String getTransferLock() {
		return this.transferLock;
	}

	public void setTransferLock(String transferLock) {
		this.transferLock = transferLock;
	}

	public Boolean getWhoisProtected() {
		return this.whoisProtected;
	}

	public void setWhoisProtected(Boolean whoisProtected) {
		this.whoisProtected = whoisProtected;
	}

	public List<String> getDnsList() {
		return this.dnsList;
	}

	public void setDnsList(List<String> dnsList) {
		this.dnsList = dnsList;
	}

	@Override
	public QueryDomainBySaleIdResponse getInstance(UnmarshallerContext context) {
		return	QueryDomainBySaleIdResponseUnmarshaller.unmarshall(this, context);
	}
}
