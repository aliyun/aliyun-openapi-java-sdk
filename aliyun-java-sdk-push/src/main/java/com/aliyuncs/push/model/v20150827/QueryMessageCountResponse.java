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
package com.aliyuncs.push.model.v20150827;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20150827.QueryMessageCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMessageCountResponse extends AcsResponse {

	private String requestId;

	private List<BillInfo> billInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BillInfo> getbillInfos() {
		return this.billInfos;
	}

	public void setbillInfos(List<BillInfo> billInfos) {
		this.billInfos = billInfos;
	}

	public static class BillInfo {

		private String date;

		private Integer count;

		public String getdate() {
			return this.date;
		}

		public void setdate(String date) {
			this.date = date;
		}

		public Integer getcount() {
			return this.count;
		}

		public void setcount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public QueryMessageCountResponse getInstance(UnmarshallerContext context) {
		return	QueryMessageCountResponseUnmarshaller.unmarshall(this, context);
	}
}
