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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.InnerCreateSmartAccessGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerCreateSmartAccessGatewayResponse extends AcsResponse {

	private String requestId;

	private String cloudBoxId;

	private String name;

	private String location;

	private String city;

	private String bandWidthSpec;

	private String cidrBlock;

	private String associatedCcnId;

	private String description;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCloudBoxId() {
		return this.cloudBoxId;
	}

	public void setCloudBoxId(String cloudBoxId) {
		this.cloudBoxId = cloudBoxId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBandWidthSpec() {
		return this.bandWidthSpec;
	}

	public void setBandWidthSpec(String bandWidthSpec) {
		this.bandWidthSpec = bandWidthSpec;
	}

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	public String getAssociatedCcnId() {
		return this.associatedCcnId;
	}

	public void setAssociatedCcnId(String associatedCcnId) {
		this.associatedCcnId = associatedCcnId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public InnerCreateSmartAccessGatewayResponse getInstance(UnmarshallerContext context) {
		return	InnerCreateSmartAccessGatewayResponseUnmarshaller.unmarshall(this, context);
	}
}
