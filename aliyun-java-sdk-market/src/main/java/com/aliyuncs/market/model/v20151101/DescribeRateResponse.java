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

package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeRateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRateResponse extends AcsResponse {

	private String type;

	private Long aliUid;

	private String score;

	private String instanceId;

	private String explaintion;

	private Long gmtAdditional;

	private Long gmtCreated;

	private String requestId;

	private String additionalExplaintion;

	private Long gmtAdditionalExplaintion;

	private String productId;

	private Long gmtExplaintion;

	private String content;

	private String additionalContent;

	private Long id;

	private String orderId;

	private String packageVersion;

	private String customerLabels;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getExplaintion() {
		return this.explaintion;
	}

	public void setExplaintion(String explaintion) {
		this.explaintion = explaintion;
	}

	public Long getGmtAdditional() {
		return this.gmtAdditional;
	}

	public void setGmtAdditional(Long gmtAdditional) {
		this.gmtAdditional = gmtAdditional;
	}

	public Long getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(Long gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAdditionalExplaintion() {
		return this.additionalExplaintion;
	}

	public void setAdditionalExplaintion(String additionalExplaintion) {
		this.additionalExplaintion = additionalExplaintion;
	}

	public Long getGmtAdditionalExplaintion() {
		return this.gmtAdditionalExplaintion;
	}

	public void setGmtAdditionalExplaintion(Long gmtAdditionalExplaintion) {
		this.gmtAdditionalExplaintion = gmtAdditionalExplaintion;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Long getGmtExplaintion() {
		return this.gmtExplaintion;
	}

	public void setGmtExplaintion(Long gmtExplaintion) {
		this.gmtExplaintion = gmtExplaintion;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAdditionalContent() {
		return this.additionalContent;
	}

	public void setAdditionalContent(String additionalContent) {
		this.additionalContent = additionalContent;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPackageVersion() {
		return this.packageVersion;
	}

	public void setPackageVersion(String packageVersion) {
		this.packageVersion = packageVersion;
	}

	public String getCustomerLabels() {
		return this.customerLabels;
	}

	public void setCustomerLabels(String customerLabels) {
		this.customerLabels = customerLabels;
	}

	@Override
	public DescribeRateResponse getInstance(UnmarshallerContext context) {
		return	DescribeRateResponseUnmarshaller.unmarshall(this, context);
	}
}
