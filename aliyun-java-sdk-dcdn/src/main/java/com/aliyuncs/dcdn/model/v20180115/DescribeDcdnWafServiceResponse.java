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
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnWafServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnWafServiceResponse extends AcsResponse {

	private String status;

	private String requestBillingType;

	private String edition;

	private String requestId;

	private String openingTime;

	private String enabled;

	private String ruleBillingType;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRequestBillingType() {
		return this.requestBillingType;
	}

	public void setRequestBillingType(String requestBillingType) {
		this.requestBillingType = requestBillingType;
	}

	public String getEdition() {
		return this.edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOpeningTime() {
		return this.openingTime;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getRuleBillingType() {
		return this.ruleBillingType;
	}

	public void setRuleBillingType(String ruleBillingType) {
		this.ruleBillingType = ruleBillingType;
	}

	@Override
	public DescribeDcdnWafServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnWafServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
