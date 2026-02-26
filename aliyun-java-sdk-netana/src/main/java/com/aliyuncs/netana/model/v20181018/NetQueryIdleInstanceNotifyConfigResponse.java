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

package com.aliyuncs.netana.model.v20181018;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.netana.transform.v20181018.NetQueryIdleInstanceNotifyConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class NetQueryIdleInstanceNotifyConfigResponse extends AcsResponse {

	private String requestId;

	private List<NotifyConfigInfoItem> notifyConfigInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NotifyConfigInfoItem> getNotifyConfigInfo() {
		return this.notifyConfigInfo;
	}

	public void setNotifyConfigInfo(List<NotifyConfigInfoItem> notifyConfigInfo) {
		this.notifyConfigInfo = notifyConfigInfo;
	}

	public static class NotifyConfigInfoItem {

		private String productId;

		private Integer period;

		private Boolean status;

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public Boolean getStatus() {
			return this.status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}
	}

	@Override
	public NetQueryIdleInstanceNotifyConfigResponse getInstance(UnmarshallerContext context) {
		return	NetQueryIdleInstanceNotifyConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
