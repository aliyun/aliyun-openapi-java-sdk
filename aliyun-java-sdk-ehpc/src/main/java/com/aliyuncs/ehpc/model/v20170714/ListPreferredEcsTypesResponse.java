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
package com.aliyuncs.ehpc.model.v20170714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20170714.ListPreferredEcsTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPreferredEcsTypesResponse extends AcsResponse {

	private String requestId;

	private List<SeriesInfo> series;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SeriesInfo> getSeries() {
		return this.series;
	}

	public void setSeries(List<SeriesInfo> series) {
		this.series = series;
	}

	public static class SeriesInfo {

		private String seriesId;

		private String seriesName;

		private Roles roles;

		public String getSeriesId() {
			return this.seriesId;
		}

		public void setSeriesId(String seriesId) {
			this.seriesId = seriesId;
		}

		public String getSeriesName() {
			return this.seriesName;
		}

		public void setSeriesName(String seriesName) {
			this.seriesName = seriesName;
		}

		public Roles getRoles() {
			return this.roles;
		}

		public void setRoles(Roles roles) {
			this.roles = roles;
		}

		public static class Roles {

			private List<String> manager;

			private List<String> compute;

			private List<String> login;

			public List<String> getManager() {
				return this.manager;
			}

			public void setManager(List<String> manager) {
				this.manager = manager;
			}

			public List<String> getCompute() {
				return this.compute;
			}

			public void setCompute(List<String> compute) {
				this.compute = compute;
			}

			public List<String> getLogin() {
				return this.login;
			}

			public void setLogin(List<String> login) {
				this.login = login;
			}
		}
	}

	@Override
	public ListPreferredEcsTypesResponse getInstance(UnmarshallerContext context) {
		return	ListPreferredEcsTypesResponseUnmarshaller.unmarshall(this, context);
	}
}
