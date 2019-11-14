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

package com.aliyuncs.fss.model.v20190125;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.fss.transform.v20190125.GetScanStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetScanStatusResponse extends AcsResponse {

	private String requestId;

	private String fssRequestID;

	private String scanStatusName;

	private String scanStatusDesc;

	private Integer totalStepCount;

	private Float scannedRate;

	private Integer fssCode;

	private String fssMessage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getFssRequestID() {
		return this.fssRequestID;
	}

	public void setFssRequestID(String fssRequestID) {
		this.fssRequestID = fssRequestID;
	}

	public String getScanStatusName() {
		return this.scanStatusName;
	}

	public void setScanStatusName(String scanStatusName) {
		this.scanStatusName = scanStatusName;
	}

	public String getScanStatusDesc() {
		return this.scanStatusDesc;
	}

	public void setScanStatusDesc(String scanStatusDesc) {
		this.scanStatusDesc = scanStatusDesc;
	}

	public Integer getTotalStepCount() {
		return this.totalStepCount;
	}

	public void setTotalStepCount(Integer totalStepCount) {
		this.totalStepCount = totalStepCount;
	}

	public Float getScannedRate() {
		return this.scannedRate;
	}

	public void setScannedRate(Float scannedRate) {
		this.scannedRate = scannedRate;
	}

	public Integer getFssCode() {
		return this.fssCode;
	}

	public void setFssCode(Integer fssCode) {
		this.fssCode = fssCode;
	}

	public String getFssMessage() {
		return this.fssMessage;
	}

	public void setFssMessage(String fssMessage) {
		this.fssMessage = fssMessage;
	}

	@Override
	public GetScanStatusResponse getInstance(UnmarshallerContext context) {
		return	GetScanStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
