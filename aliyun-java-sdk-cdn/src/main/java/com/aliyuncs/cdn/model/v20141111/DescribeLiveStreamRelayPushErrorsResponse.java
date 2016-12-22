/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamRelayPushErrorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamRelayPushErrorsResponse extends AcsResponse {

	private String requestId;

	private List<RelayPushErrorsModel> relayPushErrorsModelList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RelayPushErrorsModel> getRelayPushErrorsModelList() {
		return this.relayPushErrorsModelList;
	}

	public void setRelayPushErrorsModelList(List<RelayPushErrorsModel> relayPushErrorsModelList) {
		this.relayPushErrorsModelList = relayPushErrorsModelList;
	}

	public static class RelayPushErrorsModel {

		private String errorCode;

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
	}

	@Override
	public DescribeLiveStreamRelayPushErrorsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamRelayPushErrorsResponseUnmarshaller.unmarshall(this, context);
	}
}
