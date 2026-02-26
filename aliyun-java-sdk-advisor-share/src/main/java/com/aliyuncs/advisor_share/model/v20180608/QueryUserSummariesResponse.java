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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.QueryUserSummariesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUserSummariesResponse extends AcsResponse {

	private String requestId;

	private List<UserSummary> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UserSummary> getData() {
		return this.data;
	}

	public void setData(List<UserSummary> data) {
		this.data = data;
	}

	public static class UserSummary {

		private String gcLevel;

		private Long adviceCount;

		private Float conversionRate;

		private Long detailViewCount;

		private Long aliyunId;

		private String userName;

		private Long acceptedCount;

		private List<OwnedResourcesItem> ownedResources;

		public String getGcLevel() {
			return this.gcLevel;
		}

		public void setGcLevel(String gcLevel) {
			this.gcLevel = gcLevel;
		}

		public Long getAdviceCount() {
			return this.adviceCount;
		}

		public void setAdviceCount(Long adviceCount) {
			this.adviceCount = adviceCount;
		}

		public Float getConversionRate() {
			return this.conversionRate;
		}

		public void setConversionRate(Float conversionRate) {
			this.conversionRate = conversionRate;
		}

		public Long getDetailViewCount() {
			return this.detailViewCount;
		}

		public void setDetailViewCount(Long detailViewCount) {
			this.detailViewCount = detailViewCount;
		}

		public Long getAliyunId() {
			return this.aliyunId;
		}

		public void setAliyunId(Long aliyunId) {
			this.aliyunId = aliyunId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getAcceptedCount() {
			return this.acceptedCount;
		}

		public void setAcceptedCount(Long acceptedCount) {
			this.acceptedCount = acceptedCount;
		}

		public List<OwnedResourcesItem> getOwnedResources() {
			return this.ownedResources;
		}

		public void setOwnedResources(List<OwnedResourcesItem> ownedResources) {
			this.ownedResources = ownedResources;
		}

		public static class OwnedResourcesItem {

			private String value;

			private Float percent;

			private String name;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public Float getPercent() {
				return this.percent;
			}

			public void setPercent(Float percent) {
				this.percent = percent;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public QueryUserSummariesResponse getInstance(UnmarshallerContext context) {
		return	QueryUserSummariesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
