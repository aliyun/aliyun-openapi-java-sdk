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
package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterIPArrayListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterIPArrayListResponse extends AcsResponse {

	private String requestId;

	private List<DBClusterIPArray> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBClusterIPArray> getItems() {
		return this.items;
	}

	public void setItems(List<DBClusterIPArray> items) {
		this.items = items;
	}

	public static class DBClusterIPArray {

		private String dBClusterIPArrayName;

		private String dBClusterIPArrayAttribute;

		private String securityIPList;

		public String getDBClusterIPArrayName() {
			return this.dBClusterIPArrayName;
		}

		public void setDBClusterIPArrayName(String dBClusterIPArrayName) {
			this.dBClusterIPArrayName = dBClusterIPArrayName;
		}

		public String getDBClusterIPArrayAttribute() {
			return this.dBClusterIPArrayAttribute;
		}

		public void setDBClusterIPArrayAttribute(String dBClusterIPArrayAttribute) {
			this.dBClusterIPArrayAttribute = dBClusterIPArrayAttribute;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}
	}

	@Override
	public DescribeDBClusterIPArrayListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterIPArrayListResponseUnmarshaller.unmarshall(this, context);
	}
}
