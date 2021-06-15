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

package com.aliyuncs.actiontrail.model.v20200706;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.actiontrail.transform.v20200706.GetTrailStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTrailStatusResponse extends AcsResponse {

	private String latestDeliveryLogServiceTime;

	private String requestId;

	private String latestDeliveryLogServiceError;

	private String startLoggingTime;

	private Boolean ossBucketStatus;

	private String latestDeliveryError;

	private String stopLoggingTime;

	private Boolean slsLogStoreStatus;

	private String latestDeliveryTime;

	private Boolean isLogging;

	public String getLatestDeliveryLogServiceTime() {
		return this.latestDeliveryLogServiceTime;
	}

	public void setLatestDeliveryLogServiceTime(String latestDeliveryLogServiceTime) {
		this.latestDeliveryLogServiceTime = latestDeliveryLogServiceTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLatestDeliveryLogServiceError() {
		return this.latestDeliveryLogServiceError;
	}

	public void setLatestDeliveryLogServiceError(String latestDeliveryLogServiceError) {
		this.latestDeliveryLogServiceError = latestDeliveryLogServiceError;
	}

	public String getStartLoggingTime() {
		return this.startLoggingTime;
	}

	public void setStartLoggingTime(String startLoggingTime) {
		this.startLoggingTime = startLoggingTime;
	}

	public Boolean getOssBucketStatus() {
		return this.ossBucketStatus;
	}

	public void setOssBucketStatus(Boolean ossBucketStatus) {
		this.ossBucketStatus = ossBucketStatus;
	}

	public String getLatestDeliveryError() {
		return this.latestDeliveryError;
	}

	public void setLatestDeliveryError(String latestDeliveryError) {
		this.latestDeliveryError = latestDeliveryError;
	}

	public String getStopLoggingTime() {
		return this.stopLoggingTime;
	}

	public void setStopLoggingTime(String stopLoggingTime) {
		this.stopLoggingTime = stopLoggingTime;
	}

	public Boolean getSlsLogStoreStatus() {
		return this.slsLogStoreStatus;
	}

	public void setSlsLogStoreStatus(Boolean slsLogStoreStatus) {
		this.slsLogStoreStatus = slsLogStoreStatus;
	}

	public String getLatestDeliveryTime() {
		return this.latestDeliveryTime;
	}

	public void setLatestDeliveryTime(String latestDeliveryTime) {
		this.latestDeliveryTime = latestDeliveryTime;
	}

	public Boolean getIsLogging() {
		return this.isLogging;
	}

	public void setIsLogging(Boolean isLogging) {
		this.isLogging = isLogging;
	}

	@Override
	public GetTrailStatusResponse getInstance(UnmarshallerContext context) {
		return	GetTrailStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
