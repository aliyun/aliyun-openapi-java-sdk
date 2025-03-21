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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeLicenseOrderDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLicenseOrderDetailsResponse extends AcsResponse {

	private Integer activatedCodeCount;

	private Integer activationCodeQuota;

	private String aliyunOrderId;

	private Boolean allowEmptySystemIdentifier;

	private String engine;

	private String gmtCreated;

	private String gmtModified;

	private Boolean isVirtualOrder;

	private Boolean isVirtualOrderFrozen;

	private String packageType;

	private String packageValidity;

	private String purchaseChannel;

	private String requestId;

	private String virtualOrderId;

	public Integer getActivatedCodeCount() {
		return this.activatedCodeCount;
	}

	public void setActivatedCodeCount(Integer activatedCodeCount) {
		this.activatedCodeCount = activatedCodeCount;
	}

	public Integer getActivationCodeQuota() {
		return this.activationCodeQuota;
	}

	public void setActivationCodeQuota(Integer activationCodeQuota) {
		this.activationCodeQuota = activationCodeQuota;
	}

	public String getAliyunOrderId() {
		return this.aliyunOrderId;
	}

	public void setAliyunOrderId(String aliyunOrderId) {
		this.aliyunOrderId = aliyunOrderId;
	}

	public Boolean getAllowEmptySystemIdentifier() {
		return this.allowEmptySystemIdentifier;
	}

	public void setAllowEmptySystemIdentifier(Boolean allowEmptySystemIdentifier) {
		this.allowEmptySystemIdentifier = allowEmptySystemIdentifier;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(String gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Boolean getIsVirtualOrder() {
		return this.isVirtualOrder;
	}

	public void setIsVirtualOrder(Boolean isVirtualOrder) {
		this.isVirtualOrder = isVirtualOrder;
	}

	public Boolean getIsVirtualOrderFrozen() {
		return this.isVirtualOrderFrozen;
	}

	public void setIsVirtualOrderFrozen(Boolean isVirtualOrderFrozen) {
		this.isVirtualOrderFrozen = isVirtualOrderFrozen;
	}

	public String getPackageType() {
		return this.packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getPackageValidity() {
		return this.packageValidity;
	}

	public void setPackageValidity(String packageValidity) {
		this.packageValidity = packageValidity;
	}

	public String getPurchaseChannel() {
		return this.purchaseChannel;
	}

	public void setPurchaseChannel(String purchaseChannel) {
		this.purchaseChannel = purchaseChannel;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVirtualOrderId() {
		return this.virtualOrderId;
	}

	public void setVirtualOrderId(String virtualOrderId) {
		this.virtualOrderId = virtualOrderId;
	}

	@Override
	public DescribeLicenseOrderDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLicenseOrderDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
