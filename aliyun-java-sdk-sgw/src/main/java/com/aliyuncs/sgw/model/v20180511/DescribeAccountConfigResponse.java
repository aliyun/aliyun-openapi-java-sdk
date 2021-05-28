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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeAccountConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountConfigResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Boolean isSupportServerSideEncryption;

	private Boolean isSupportClientSideEncryption;

	private Boolean isSupportGatewayLogging;

	private Boolean isSupportElasticGatewayBeta;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getIsSupportServerSideEncryption() {
		return this.isSupportServerSideEncryption;
	}

	public void setIsSupportServerSideEncryption(Boolean isSupportServerSideEncryption) {
		this.isSupportServerSideEncryption = isSupportServerSideEncryption;
	}

	public Boolean getIsSupportClientSideEncryption() {
		return this.isSupportClientSideEncryption;
	}

	public void setIsSupportClientSideEncryption(Boolean isSupportClientSideEncryption) {
		this.isSupportClientSideEncryption = isSupportClientSideEncryption;
	}

	public Boolean getIsSupportGatewayLogging() {
		return this.isSupportGatewayLogging;
	}

	public void setIsSupportGatewayLogging(Boolean isSupportGatewayLogging) {
		this.isSupportGatewayLogging = isSupportGatewayLogging;
	}

	public Boolean getIsSupportElasticGatewayBeta() {
		return this.isSupportElasticGatewayBeta;
	}

	public void setIsSupportElasticGatewayBeta(Boolean isSupportElasticGatewayBeta) {
		this.isSupportElasticGatewayBeta = isSupportElasticGatewayBeta;
	}

	@Override
	public DescribeAccountConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
