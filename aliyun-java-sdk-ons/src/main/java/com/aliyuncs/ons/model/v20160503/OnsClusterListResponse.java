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
package com.aliyuncs.ons.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20160503.OnsClusterListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsClusterListResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private List<ClusterInfoDo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public List<ClusterInfoDo> getData() {
		return this.data;
	}

	public void setData(List<ClusterInfoDo> data) {
		this.data = data;
	}

	public static class ClusterInfoDo {

		private String clusterName;

		private Boolean share;

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Boolean getShare() {
			return this.share;
		}

		public void setShare(Boolean share) {
			this.share = share;
		}
	}

	@Override
	public OnsClusterListResponse getInstance(UnmarshallerContext context) {
		return	OnsClusterListResponseUnmarshaller.unmarshall(this, context);
	}
}
