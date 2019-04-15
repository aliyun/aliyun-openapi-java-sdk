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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerEcsQueryIpThresholdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerEcsQueryIpThresholdResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<EcsIpThreshold> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<EcsIpThreshold> getData() {
		return this.data;
	}

	public void setData(List<EcsIpThreshold> data) {
		this.data = data;
	}

	public static class EcsIpThreshold {

		private String instanceId;

		private String internetIp;

		private Long cleanPps;

		private Long cleanBps;

		private Long blackholeBps;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public Long getCleanPps() {
			return this.cleanPps;
		}

		public void setCleanPps(Long cleanPps) {
			this.cleanPps = cleanPps;
		}

		public Long getCleanBps() {
			return this.cleanBps;
		}

		public void setCleanBps(Long cleanBps) {
			this.cleanBps = cleanBps;
		}

		public Long getBlackholeBps() {
			return this.blackholeBps;
		}

		public void setBlackholeBps(Long blackholeBps) {
			this.blackholeBps = blackholeBps;
		}
	}

	@Override
	public InnerEcsQueryIpThresholdResponse getInstance(UnmarshallerContext context) {
		return	InnerEcsQueryIpThresholdResponseUnmarshaller.unmarshall(this, context);
	}
}
