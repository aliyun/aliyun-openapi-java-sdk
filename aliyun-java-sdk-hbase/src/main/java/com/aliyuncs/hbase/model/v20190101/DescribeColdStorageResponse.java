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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeColdStorageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeColdStorageResponse extends AcsResponse {

	private String requestId;

	private String clusterId;

	private String openStatus;

	private String coldStorageSize;

	private String coldStorageUsePercent;

	private String payType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getOpenStatus() {
		return this.openStatus;
	}

	public void setOpenStatus(String openStatus) {
		this.openStatus = openStatus;
	}

	public String getColdStorageSize() {
		return this.coldStorageSize;
	}

	public void setColdStorageSize(String coldStorageSize) {
		this.coldStorageSize = coldStorageSize;
	}

	public String getColdStorageUsePercent() {
		return this.coldStorageUsePercent;
	}

	public void setColdStorageUsePercent(String coldStorageUsePercent) {
		this.coldStorageUsePercent = coldStorageUsePercent;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	@Override
	public DescribeColdStorageResponse getInstance(UnmarshallerContext context) {
		return	DescribeColdStorageResponseUnmarshaller.unmarshall(this, context);
	}
}
