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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDasInstanceConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDasInstanceConfigResponse extends AcsResponse {

	private String requestId;

	private String data;

	private Integer storageUpperBound;

	private Integer maxStorageUpperBound;

	private String dBInstanceId;

	private Integer storageThreshold;

	private Boolean storageAutoScale;

	private String dBType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getStorageUpperBound() {
		return this.storageUpperBound;
	}

	public void setStorageUpperBound(Integer storageUpperBound) {
		this.storageUpperBound = storageUpperBound;
	}

	public Integer getMaxStorageUpperBound() {
		return this.maxStorageUpperBound;
	}

	public void setMaxStorageUpperBound(Integer maxStorageUpperBound) {
		this.maxStorageUpperBound = maxStorageUpperBound;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public Integer getStorageThreshold() {
		return this.storageThreshold;
	}

	public void setStorageThreshold(Integer storageThreshold) {
		this.storageThreshold = storageThreshold;
	}

	public Boolean getStorageAutoScale() {
		return this.storageAutoScale;
	}

	public void setStorageAutoScale(Boolean storageAutoScale) {
		this.storageAutoScale = storageAutoScale;
	}

	public String getDBType() {
		return this.dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
	}

	@Override
	public DescribeDasInstanceConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeDasInstanceConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
