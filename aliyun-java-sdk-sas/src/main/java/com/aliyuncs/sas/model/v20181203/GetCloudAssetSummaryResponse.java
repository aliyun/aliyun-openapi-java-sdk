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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetCloudAssetSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCloudAssetSummaryResponse extends AcsResponse {

	private String requestId;

	private GroupedFields groupedFields;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public GroupedFields getGroupedFields() {
		return this.groupedFields;
	}

	public void setGroupedFields(GroupedFields groupedFields) {
		this.groupedFields = groupedFields;
	}

	public static class GroupedFields {

		private Integer instanceCountTotal;

		private Integer instanceRiskCountTotal;

		private List<CloudAssetSummaryMetasItem> cloudAssetSummaryMetas;

		public Integer getInstanceCountTotal() {
			return this.instanceCountTotal;
		}

		public void setInstanceCountTotal(Integer instanceCountTotal) {
			this.instanceCountTotal = instanceCountTotal;
		}

		public Integer getInstanceRiskCountTotal() {
			return this.instanceRiskCountTotal;
		}

		public void setInstanceRiskCountTotal(Integer instanceRiskCountTotal) {
			this.instanceRiskCountTotal = instanceRiskCountTotal;
		}

		public List<CloudAssetSummaryMetasItem> getCloudAssetSummaryMetas() {
			return this.cloudAssetSummaryMetas;
		}

		public void setCloudAssetSummaryMetas(List<CloudAssetSummaryMetasItem> cloudAssetSummaryMetas) {
			this.cloudAssetSummaryMetas = cloudAssetSummaryMetas;
		}

		public static class CloudAssetSummaryMetasItem {

			private Integer assetType;

			private Integer assetSubType;

			private Integer instanceCount;

			private Integer instanceRiskCount;

			public Integer getAssetType() {
				return this.assetType;
			}

			public void setAssetType(Integer assetType) {
				this.assetType = assetType;
			}

			public Integer getAssetSubType() {
				return this.assetSubType;
			}

			public void setAssetSubType(Integer assetSubType) {
				this.assetSubType = assetSubType;
			}

			public Integer getInstanceCount() {
				return this.instanceCount;
			}

			public void setInstanceCount(Integer instanceCount) {
				this.instanceCount = instanceCount;
			}

			public Integer getInstanceRiskCount() {
				return this.instanceRiskCount;
			}

			public void setInstanceRiskCount(Integer instanceRiskCount) {
				this.instanceRiskCount = instanceRiskCount;
			}
		}
	}

	@Override
	public GetCloudAssetSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetCloudAssetSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
