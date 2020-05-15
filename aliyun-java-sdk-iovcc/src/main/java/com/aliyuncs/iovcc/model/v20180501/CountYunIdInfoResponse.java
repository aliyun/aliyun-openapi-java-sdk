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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.CountYunIdInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CountYunIdInfoResponse extends AcsResponse {

	private String requestId;

	private List<YunIdInfoItem> yunIdInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<YunIdInfoItem> getYunIdInfo() {
		return this.yunIdInfo;
	}

	public void setYunIdInfo(List<YunIdInfoItem> yunIdInfo) {
		this.yunIdInfo = yunIdInfo;
	}

	public static class YunIdInfoItem {

		private Long totalBrandCount;

		private Long totalDeviceModelCount;

		private Long totalDeviceCount;

		public Long getTotalBrandCount() {
			return this.totalBrandCount;
		}

		public void setTotalBrandCount(Long totalBrandCount) {
			this.totalBrandCount = totalBrandCount;
		}

		public Long getTotalDeviceModelCount() {
			return this.totalDeviceModelCount;
		}

		public void setTotalDeviceModelCount(Long totalDeviceModelCount) {
			this.totalDeviceModelCount = totalDeviceModelCount;
		}

		public Long getTotalDeviceCount() {
			return this.totalDeviceCount;
		}

		public void setTotalDeviceCount(Long totalDeviceCount) {
			this.totalDeviceCount = totalDeviceCount;
		}
	}

	@Override
	public CountYunIdInfoResponse getInstance(UnmarshallerContext context) {
		return	CountYunIdInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
