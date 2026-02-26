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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeSampleDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSampleDataResponse extends AcsResponse {

	private String requestId;

	private Boolean hasSampleData;

	private String errorMessage;

	private String dBInstanceId;

	private String sampleDataStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getHasSampleData() {
		return this.hasSampleData;
	}

	public void setHasSampleData(Boolean hasSampleData) {
		this.hasSampleData = hasSampleData;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getSampleDataStatus() {
		return this.sampleDataStatus;
	}

	public void setSampleDataStatus(String sampleDataStatus) {
		this.sampleDataStatus = sampleDataStatus;
	}

	@Override
	public DescribeSampleDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeSampleDataResponseUnmarshaller.unmarshall(this, context);
	}
}
