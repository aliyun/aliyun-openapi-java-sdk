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
package com.aliyuncs.dm.model.v20151123;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class BatchSendMailRequest extends RpcAcsRequest<BatchSendMailResponse> {
	
	public BatchSendMailRequest() {
		super("Dm", "2015-11-23", "BatchSendMail", "dm");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String templateName;

	private String accountName;

	private String receiversName;

	private Integer addressType;

	private String tagName;

	private String replyAddress;

	private String replyAddressAlias;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		putQueryParameter("TemplateName", templateName);
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		putQueryParameter("AccountName", accountName);
	}

	public String getReceiversName() {
		return this.receiversName;
	}

	public void setReceiversName(String receiversName) {
		this.receiversName = receiversName;
		putQueryParameter("ReceiversName", receiversName);
	}

	public Integer getAddressType() {
		return this.addressType;
	}

	public void setAddressType(Integer addressType) {
		this.addressType = addressType;
		putQueryParameter("AddressType", addressType);
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
		putQueryParameter("TagName", tagName);
	}

	public String getReplyAddress() {
		return this.replyAddress;
	}

	public void setReplyAddress(String replyAddress) {
		this.replyAddress = replyAddress;
		putQueryParameter("ReplyAddress", replyAddress);
	}

	public String getReplyAddressAlias() {
		return this.replyAddressAlias;
	}

	public void setReplyAddressAlias(String replyAddressAlias) {
		this.replyAddressAlias = replyAddressAlias;
		putQueryParameter("ReplyAddressAlias", replyAddressAlias);
	}

	@Override
	public Class<BatchSendMailResponse> getResponseClass() {
		return BatchSendMailResponse.class;
	}

}
