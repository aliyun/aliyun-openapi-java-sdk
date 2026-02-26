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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnDdosServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnDdosServiceResponse extends AcsResponse {

	private String status;

	private String changingAffectTime;

	private String openingTime;

	private String changingEdition;

	private String chargeType;

	private Integer domianNum;

	private Integer changingProtectNum;

	private Integer changingDomianNum;

	private String instanceId;

	private String edition;

	private String changingChargeType;

	private String requestId;

	private Integer protectNum;

	private String enabled;

	private String endingTime;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getChangingAffectTime() {
		return this.changingAffectTime;
	}

	public void setChangingAffectTime(String changingAffectTime) {
		this.changingAffectTime = changingAffectTime;
	}

	public String getOpeningTime() {
		return this.openingTime;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public String getChangingEdition() {
		return this.changingEdition;
	}

	public void setChangingEdition(String changingEdition) {
		this.changingEdition = changingEdition;
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public Integer getDomianNum() {
		return this.domianNum;
	}

	public void setDomianNum(Integer domianNum) {
		this.domianNum = domianNum;
	}

	public Integer getChangingProtectNum() {
		return this.changingProtectNum;
	}

	public void setChangingProtectNum(Integer changingProtectNum) {
		this.changingProtectNum = changingProtectNum;
	}

	public Integer getChangingDomianNum() {
		return this.changingDomianNum;
	}

	public void setChangingDomianNum(Integer changingDomianNum) {
		this.changingDomianNum = changingDomianNum;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getEdition() {
		return this.edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getChangingChargeType() {
		return this.changingChargeType;
	}

	public void setChangingChargeType(String changingChargeType) {
		this.changingChargeType = changingChargeType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getProtectNum() {
		return this.protectNum;
	}

	public void setProtectNum(Integer protectNum) {
		this.protectNum = protectNum;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getEndingTime() {
		return this.endingTime;
	}

	public void setEndingTime(String endingTime) {
		this.endingTime = endingTime;
	}

	@Override
	public DescribeDcdnDdosServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnDdosServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
