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

package com.aliyuncs.cc5g.model.v20220314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cc5g.transform.v20220314.ListAPNsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAPNsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private String maxResults;

	private String totalCount;

	private List<Region> aPNs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<Region> getAPNs() {
		return this.aPNs;
	}

	public void setAPNs(List<Region> aPNs) {
		this.aPNs = aPNs;
	}

	public static class Region {

		private String iSP;

		private String aPN;

		private String name;

		private String description;

		private List<String> zones;

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public String getAPN() {
			return this.aPN;
		}

		public void setAPN(String aPN) {
			this.aPN = aPN;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<String> getZones() {
			return this.zones;
		}

		public void setZones(List<String> zones) {
			this.zones = zones;
		}
	}

	@Override
	public ListAPNsResponse getInstance(UnmarshallerContext context) {
		return	ListAPNsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
