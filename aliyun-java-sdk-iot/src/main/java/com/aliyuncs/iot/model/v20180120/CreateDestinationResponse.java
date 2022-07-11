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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.CreateDestinationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDestinationResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Destination destination;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Destination getDestination() {
		return this.destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public static class Destination {

		private Long destinationId;

		private String name;

		private String type;

		private String configuration;

		private Boolean isFailover;

		private String utcCreated;

		public Long getDestinationId() {
			return this.destinationId;
		}

		public void setDestinationId(Long destinationId) {
			this.destinationId = destinationId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getConfiguration() {
			return this.configuration;
		}

		public void setConfiguration(String configuration) {
			this.configuration = configuration;
		}

		public Boolean getIsFailover() {
			return this.isFailover;
		}

		public void setIsFailover(Boolean isFailover) {
			this.isFailover = isFailover;
		}

		public String getUtcCreated() {
			return this.utcCreated;
		}

		public void setUtcCreated(String utcCreated) {
			this.utcCreated = utcCreated;
		}
	}

	@Override
	public CreateDestinationResponse getInstance(UnmarshallerContext context) {
		return	CreateDestinationResponseUnmarshaller.unmarshall(this, context);
	}
}
