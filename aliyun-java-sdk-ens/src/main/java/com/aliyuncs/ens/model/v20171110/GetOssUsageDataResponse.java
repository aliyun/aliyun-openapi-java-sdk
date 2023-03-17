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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.GetOssUsageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOssUsageDataResponse extends AcsResponse {

	private String requestId;

	private List<UsageListItem> usageList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UsageListItem> getUsageList() {
		return this.usageList;
	}

	public void setUsageList(List<UsageListItem> usageList) {
		this.usageList = usageList;
	}

	public static class UsageListItem {

		private Long lanRxBw;

		private Long lanTxBw;

		private Long point;

		private String pointTs;

		private Long storageUsageByte;

		private Long wanRxBw;

		private Long wanTxBw;

		public Long getLanRxBw() {
			return this.lanRxBw;
		}

		public void setLanRxBw(Long lanRxBw) {
			this.lanRxBw = lanRxBw;
		}

		public Long getLanTxBw() {
			return this.lanTxBw;
		}

		public void setLanTxBw(Long lanTxBw) {
			this.lanTxBw = lanTxBw;
		}

		public Long getPoint() {
			return this.point;
		}

		public void setPoint(Long point) {
			this.point = point;
		}

		public String getPointTs() {
			return this.pointTs;
		}

		public void setPointTs(String pointTs) {
			this.pointTs = pointTs;
		}

		public Long getStorageUsageByte() {
			return this.storageUsageByte;
		}

		public void setStorageUsageByte(Long storageUsageByte) {
			this.storageUsageByte = storageUsageByte;
		}

		public Long getWanRxBw() {
			return this.wanRxBw;
		}

		public void setWanRxBw(Long wanRxBw) {
			this.wanRxBw = wanRxBw;
		}

		public Long getWanTxBw() {
			return this.wanTxBw;
		}

		public void setWanTxBw(Long wanTxBw) {
			this.wanTxBw = wanTxBw;
		}
	}

	@Override
	public GetOssUsageDataResponse getInstance(UnmarshallerContext context) {
		return	GetOssUsageDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
