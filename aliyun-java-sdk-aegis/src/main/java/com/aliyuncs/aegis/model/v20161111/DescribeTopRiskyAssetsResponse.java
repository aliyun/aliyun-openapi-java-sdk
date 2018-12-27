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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeTopRiskyAssetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTopRiskyAssetsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<TopRiskyAsset> topRiskyAssets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<TopRiskyAsset> getTopRiskyAssets() {
		return this.topRiskyAssets;
	}

	public void setTopRiskyAssets(List<TopRiskyAsset> topRiskyAssets) {
		this.topRiskyAssets = topRiskyAssets;
	}

	public static class TopRiskyAsset {

		private String type;

		private List<AssetInfo> assetInfos;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<AssetInfo> getAssetInfos() {
			return this.assetInfos;
		}

		public void setAssetInfos(List<AssetInfo> assetInfos) {
			this.assetInfos = assetInfos;
		}

		public static class AssetInfo {

			private String uuid;

			private String ip;

			private String instanceName;

			private String count;

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getCount() {
				return this.count;
			}

			public void setCount(String count) {
				this.count = count;
			}
		}
	}

	@Override
	public DescribeTopRiskyAssetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTopRiskyAssetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
