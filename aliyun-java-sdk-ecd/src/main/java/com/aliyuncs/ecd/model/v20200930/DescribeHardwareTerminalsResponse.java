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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeHardwareTerminalsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHardwareTerminalsResponse extends AcsResponse {

	private String requestId;

	private List<HardwareTerminal> hardwareTerminals;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<HardwareTerminal> getHardwareTerminals() {
		return this.hardwareTerminals;
	}

	public void setHardwareTerminals(List<HardwareTerminal> hardwareTerminals) {
		this.hardwareTerminals = hardwareTerminals;
	}

	public static class HardwareTerminal {

		private String hardwareType;

		private List<HardwareTypeDetail> hardwareTypeDetails;

		public String getHardwareType() {
			return this.hardwareType;
		}

		public void setHardwareType(String hardwareType) {
			this.hardwareType = hardwareType;
		}

		public List<HardwareTypeDetail> getHardwareTypeDetails() {
			return this.hardwareTypeDetails;
		}

		public void setHardwareTypeDetails(List<HardwareTypeDetail> hardwareTypeDetails) {
			this.hardwareTypeDetails = hardwareTypeDetails;
		}

		public static class HardwareTypeDetail {

			private String stockState;

			private Integer hardwareVersion;

			private String description;

			public String getStockState() {
				return this.stockState;
			}

			public void setStockState(String stockState) {
				this.stockState = stockState;
			}

			public Integer getHardwareVersion() {
				return this.hardwareVersion;
			}

			public void setHardwareVersion(Integer hardwareVersion) {
				this.hardwareVersion = hardwareVersion;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public DescribeHardwareTerminalsResponse getInstance(UnmarshallerContext context) {
		return	DescribeHardwareTerminalsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
