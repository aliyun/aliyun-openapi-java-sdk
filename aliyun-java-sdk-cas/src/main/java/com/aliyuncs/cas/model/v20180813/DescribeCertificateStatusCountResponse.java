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

package com.aliyuncs.cas.model.v20180813;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20180813.DescribeCertificateStatusCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCertificateStatusCountResponse extends AcsResponse {

	private String requestId;

	private Integer payed;

	private Integer checking;

	private Integer checkedFail;

	private Integer issued;

	private Integer revoked;

	private Integer closed;

	private Integer willExpired;

	private Integer expired;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPayed() {
		return this.payed;
	}

	public void setPayed(Integer payed) {
		this.payed = payed;
	}

	public Integer getChecking() {
		return this.checking;
	}

	public void setChecking(Integer checking) {
		this.checking = checking;
	}

	public Integer getCheckedFail() {
		return this.checkedFail;
	}

	public void setCheckedFail(Integer checkedFail) {
		this.checkedFail = checkedFail;
	}

	public Integer getIssued() {
		return this.issued;
	}

	public void setIssued(Integer issued) {
		this.issued = issued;
	}

	public Integer getRevoked() {
		return this.revoked;
	}

	public void setRevoked(Integer revoked) {
		this.revoked = revoked;
	}

	public Integer getClosed() {
		return this.closed;
	}

	public void setClosed(Integer closed) {
		this.closed = closed;
	}

	public Integer getWillExpired() {
		return this.willExpired;
	}

	public void setWillExpired(Integer willExpired) {
		this.willExpired = willExpired;
	}

	public Integer getExpired() {
		return this.expired;
	}

	public void setExpired(Integer expired) {
		this.expired = expired;
	}

	@Override
	public DescribeCertificateStatusCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeCertificateStatusCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
