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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.PreviewGtmRecoveryPlanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PreviewGtmRecoveryPlanResponse extends AcsResponse {

	private String requestId;

	private Integer totalItems;

	private Integer totalPages;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Preview> previews;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Preview> getPreviews() {
		return this.previews;
	}

	public void setPreviews(List<Preview> previews) {
		this.previews = previews;
	}

	public static class Preview {

		private String instanceId;

		private String name;

		private String userDomainName;

		private List<SwitchInfo> switchInfos;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUserDomainName() {
			return this.userDomainName;
		}

		public void setUserDomainName(String userDomainName) {
			this.userDomainName = userDomainName;
		}

		public List<SwitchInfo> getSwitchInfos() {
			return this.switchInfos;
		}

		public void setSwitchInfos(List<SwitchInfo> switchInfos) {
			this.switchInfos = switchInfos;
		}

		public static class SwitchInfo {

			private String strategyName;

			private String content;

			public String getStrategyName() {
				return this.strategyName;
			}

			public void setStrategyName(String strategyName) {
				this.strategyName = strategyName;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	@Override
	public PreviewGtmRecoveryPlanResponse getInstance(UnmarshallerContext context) {
		return	PreviewGtmRecoveryPlanResponseUnmarshaller.unmarshall(this, context);
	}
}
