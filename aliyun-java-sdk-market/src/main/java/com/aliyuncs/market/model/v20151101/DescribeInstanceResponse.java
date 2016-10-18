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
package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version
 */
public class DescribeInstanceResponse extends AcsResponse {

	private Long instanceId;

	private Long orderId;

	private String supplierName;

	private String productCode;

	private String productSkuCode;

	private String productName;

	private String productType;

	private String status;

	private Long beganOn;

	private Long endOn;

	private Long createdOn;

	private String extendJson;

	private String hostJson;

	private String appJson;

	public Long getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(Long instanceId) {
		this.instanceId = instanceId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductSkuCode() {
		return this.productSkuCode;
	}

	public void setProductSkuCode(String productSkuCode) {
		this.productSkuCode = productSkuCode;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getBeganOn() {
		return this.beganOn;
	}

	public void setBeganOn(Long beganOn) {
		this.beganOn = beganOn;
	}

	public Long getEndOn() {
		return this.endOn;
	}

	public void setEndOn(Long endOn) {
		this.endOn = endOn;
	}

	public Long getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Long createdOn) {
		this.createdOn = createdOn;
	}

	public String getExtendJson() {
		return this.extendJson;
	}

	public void setExtendJson(String extendJson) {
		this.extendJson = extendJson;
	}

	public String getHostJson() {
		return this.hostJson;
	}

	public void setHostJson(String hostJson) {
		this.hostJson = hostJson;
	}

	public String getAppJson() {
		return this.appJson;
	}

	public void setAppJson(String appJson) {
		this.appJson = appJson;
	}

	@Override
	public DescribeInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
