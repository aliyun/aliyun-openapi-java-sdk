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
import com.aliyuncs.polardb.transform.v20170801.DescribeActivationCodeDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeActivationCodeDetailsResponse extends AcsResponse {

	private String activateAt;

	private String certContentB64;

	private String description;

	private String expireAt;

	private String gmtCreated;

	private String gmtModified;

	private Integer id;

	private String macAddress;

	private String name;

	private String requestId;

	private String systemIdentifier;

	public String getActivateAt() {
		return this.activateAt;
	}

	public void setActivateAt(String activateAt) {
		this.activateAt = activateAt;
	}

	public String getCertContentB64() {
		return this.certContentB64;
	}

	public void setCertContentB64(String certContentB64) {
		this.certContentB64 = certContentB64;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExpireAt() {
		return this.expireAt;
	}

	public void setExpireAt(String expireAt) {
		this.expireAt = expireAt;
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

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSystemIdentifier() {
		return this.systemIdentifier;
	}

	public void setSystemIdentifier(String systemIdentifier) {
		this.systemIdentifier = systemIdentifier;
	}

	@Override
	public DescribeActivationCodeDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeActivationCodeDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
