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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeAssetSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAssetSummaryResponse extends AcsResponse {

	private String requestId;

	private AssetsSummary assetsSummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AssetsSummary getAssetsSummary() {
		return this.assetsSummary;
	}

	public void setAssetsSummary(AssetsSummary assetsSummary) {
		this.assetsSummary = assetsSummary;
	}

	public static class AssetsSummary {

		private Integer totalCoreNum;

		private Integer totalAssetAllRegion;

		private Integer totalCoreAllRegion;

		public Integer getTotalCoreNum() {
			return this.totalCoreNum;
		}

		public void setTotalCoreNum(Integer totalCoreNum) {
			this.totalCoreNum = totalCoreNum;
		}

		public Integer getTotalAssetAllRegion() {
			return this.totalAssetAllRegion;
		}

		public void setTotalAssetAllRegion(Integer totalAssetAllRegion) {
			this.totalAssetAllRegion = totalAssetAllRegion;
		}

		public Integer getTotalCoreAllRegion() {
			return this.totalCoreAllRegion;
		}

		public void setTotalCoreAllRegion(Integer totalCoreAllRegion) {
			this.totalCoreAllRegion = totalCoreAllRegion;
		}
	}

	@Override
	public DescribeAssetSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeAssetSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
