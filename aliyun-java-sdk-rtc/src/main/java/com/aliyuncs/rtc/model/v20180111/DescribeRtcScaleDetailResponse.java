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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeRtcScaleDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcScaleDetailResponse extends AcsResponse {

	private String requestId;

	private List<ScaleItem> scale;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ScaleItem> getScale() {
		return this.scale;
	}

	public void setScale(List<ScaleItem> scale) {
		this.scale = scale;
	}

	public static class ScaleItem {

		private String tS;

		private Long cC;

		private Long uC;

		public String getTS() {
			return this.tS;
		}

		public void setTS(String tS) {
			this.tS = tS;
		}

		public Long getCC() {
			return this.cC;
		}

		public void setCC(Long cC) {
			this.cC = cC;
		}

		public Long getUC() {
			return this.uC;
		}

		public void setUC(Long uC) {
			this.uC = uC;
		}
	}

	@Override
	public DescribeRtcScaleDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcScaleDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
