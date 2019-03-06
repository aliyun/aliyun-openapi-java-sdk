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

package com.aliyuncs.actiontrail.model.v20171204;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.actiontrail.transform.v20171204.GetTrailStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTrailStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean isLogging;

	private String latestDeliveryError;

	private String latestDeliveryTime;

	private String startLoggingTime;

	private String stopLoggingTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsLogging() {
		return this.isLogging;
	}

	public void setIsLogging(Boolean isLogging) {
		this.isLogging = isLogging;
	}

	public String getLatestDeliveryError() {
		return this.latestDeliveryError;
	}

	public void setLatestDeliveryError(String latestDeliveryError) {
		this.latestDeliveryError = latestDeliveryError;
	}

	public String getLatestDeliveryTime() {
		return this.latestDeliveryTime;
	}

	public void setLatestDeliveryTime(String latestDeliveryTime) {
		this.latestDeliveryTime = latestDeliveryTime;
	}

	public String getStartLoggingTime() {
		return this.startLoggingTime;
	}

	public void setStartLoggingTime(String startLoggingTime) {
		this.startLoggingTime = startLoggingTime;
	}

	public String getStopLoggingTime() {
		return this.stopLoggingTime;
	}

	public void setStopLoggingTime(String stopLoggingTime) {
		this.stopLoggingTime = stopLoggingTime;
	}

	@Override
	public GetTrailStatusResponse getInstance(UnmarshallerContext context) {
		return	GetTrailStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
