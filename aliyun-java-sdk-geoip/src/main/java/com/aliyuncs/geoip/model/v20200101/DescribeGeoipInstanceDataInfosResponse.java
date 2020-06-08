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

package com.aliyuncs.geoip.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.geoip.transform.v20200101.DescribeGeoipInstanceDataInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGeoipInstanceDataInfosResponse extends AcsResponse {

	private String requestId;

	private List<DataInfo> dataInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataInfo> getDataInfos() {
		return this.dataInfos;
	}

	public void setDataInfos(List<DataInfo> dataInfos) {
		this.dataInfos = dataInfos;
	}

	public static class DataInfo {

		private String type;

		private String version;

		private String updateTime;

		private Long updateTimestamp;

		private Long downloadCount;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Long getUpdateTimestamp() {
			return this.updateTimestamp;
		}

		public void setUpdateTimestamp(Long updateTimestamp) {
			this.updateTimestamp = updateTimestamp;
		}

		public Long getDownloadCount() {
			return this.downloadCount;
		}

		public void setDownloadCount(Long downloadCount) {
			this.downloadCount = downloadCount;
		}
	}

	@Override
	public DescribeGeoipInstanceDataInfosResponse getInstance(UnmarshallerContext context) {
		return	DescribeGeoipInstanceDataInfosResponseUnmarshaller.unmarshall(this, context);
	}
}
