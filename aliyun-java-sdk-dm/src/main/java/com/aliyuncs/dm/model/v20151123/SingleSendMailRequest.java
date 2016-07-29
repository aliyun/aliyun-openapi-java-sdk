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
import com.aliyuncs.http.MethodType;
/**
 * @author auto create
 * @version 
 */
public class SingleSendMailRequest extends RpcAcsRequest<SingleSendMailResponse> {
	
	public SingleSendMailRequest() {
		super("Dm", "2015-11-23", "SingleSendMail", "dm");
		this.setMethod(MethodType.POST);
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String accountName;

	private Integer addressType;

	private String tagName;

	private Boolean replyToAddress;

	private String toAddress;

	private String subject;

	private String htmlBody;

	private String textBody;

	private String fromAlias;

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

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		putQueryParameter("AccountName", accountName);
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

	public Boolean getReplyToAddress() {
		return this.replyToAddress;
	}

	public void setReplyToAddress(Boolean replyToAddress) {
		this.replyToAddress = replyToAddress;
		putQueryParameter("ReplyToAddress", replyToAddress);
	}

	public String getToAddress() {
		return this.toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
		putQueryParameter("ToAddress", toAddress);
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		putQueryParameter("Subject", subject);
	}

	public String getHtmlBody() {
		return this.htmlBody;
	}

	public void setHtmlBody(String htmlBody) {
		this.htmlBody = htmlBody;
		putQueryParameter("HtmlBody", htmlBody);
	}

	public String getTextBody() {
		return this.textBody;
	}

	public void setTextBody(String textBody) {
		this.textBody = textBody;
		putQueryParameter("TextBody", textBody);
	}

	public String getFromAlias() {
		return this.fromAlias;
	}

	public void setFromAlias(String fromAlias) {
		this.fromAlias = fromAlias;
		putQueryParameter("FromAlias", fromAlias);
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
	public Class<SingleSendMailResponse> getResponseClass() {
		return SingleSendMailResponse.class;
	}

}
