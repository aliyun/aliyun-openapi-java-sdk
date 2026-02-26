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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeDBClusterSpaceSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterSpaceSummaryResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String totalSize;

		private HotData hotData;

		private ColdData coldData;

		private DataGrowth dataGrowth;

		public String getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(String totalSize) {
			this.totalSize = totalSize;
		}

		public HotData getHotData() {
			return this.hotData;
		}

		public void setHotData(HotData hotData) {
			this.hotData = hotData;
		}

		public ColdData getColdData() {
			return this.coldData;
		}

		public void setColdData(ColdData coldData) {
			this.coldData = coldData;
		}

		public DataGrowth getDataGrowth() {
			return this.dataGrowth;
		}

		public void setDataGrowth(DataGrowth dataGrowth) {
			this.dataGrowth = dataGrowth;
		}

		public static class HotData {

			private Long totalSize;

			private Long dataSize;

			private Long indexSize;

			private Long primaryKeyIndexSize;

			private Long otherSize;

			public Long getTotalSize() {
				return this.totalSize;
			}

			public void setTotalSize(Long totalSize) {
				this.totalSize = totalSize;
			}

			public Long getDataSize() {
				return this.dataSize;
			}

			public void setDataSize(Long dataSize) {
				this.dataSize = dataSize;
			}

			public Long getIndexSize() {
				return this.indexSize;
			}

			public void setIndexSize(Long indexSize) {
				this.indexSize = indexSize;
			}

			public Long getPrimaryKeyIndexSize() {
				return this.primaryKeyIndexSize;
			}

			public void setPrimaryKeyIndexSize(Long primaryKeyIndexSize) {
				this.primaryKeyIndexSize = primaryKeyIndexSize;
			}

			public Long getOtherSize() {
				return this.otherSize;
			}

			public void setOtherSize(Long otherSize) {
				this.otherSize = otherSize;
			}
		}

		public static class ColdData {

			private Long totalSize;

			private Long dataSize;

			private Long indexSize;

			private Long primaryKeyIndexSize;

			private Long otherSize;

			public Long getTotalSize() {
				return this.totalSize;
			}

			public void setTotalSize(Long totalSize) {
				this.totalSize = totalSize;
			}

			public Long getDataSize() {
				return this.dataSize;
			}

			public void setDataSize(Long dataSize) {
				this.dataSize = dataSize;
			}

			public Long getIndexSize() {
				return this.indexSize;
			}

			public void setIndexSize(Long indexSize) {
				this.indexSize = indexSize;
			}

			public Long getPrimaryKeyIndexSize() {
				return this.primaryKeyIndexSize;
			}

			public void setPrimaryKeyIndexSize(Long primaryKeyIndexSize) {
				this.primaryKeyIndexSize = primaryKeyIndexSize;
			}

			public Long getOtherSize() {
				return this.otherSize;
			}

			public void setOtherSize(Long otherSize) {
				this.otherSize = otherSize;
			}
		}

		public static class DataGrowth {

			private Long dayGrowth;

			private Long weekGrowth;

			public Long getDayGrowth() {
				return this.dayGrowth;
			}

			public void setDayGrowth(Long dayGrowth) {
				this.dayGrowth = dayGrowth;
			}

			public Long getWeekGrowth() {
				return this.weekGrowth;
			}

			public void setWeekGrowth(Long weekGrowth) {
				this.weekGrowth = weekGrowth;
			}
		}
	}

	@Override
	public DescribeDBClusterSpaceSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterSpaceSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
