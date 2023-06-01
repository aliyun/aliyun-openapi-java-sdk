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
import com.aliyuncs.ens.transform.v20171110.DescribeEnsCommodityModuleCodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsCommodityModuleCodeResponse extends AcsResponse {

	private String requestId;

	private List<CommodityCodesInfoItem> commodityCodesInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CommodityCodesInfoItem> getCommodityCodesInfo() {
		return this.commodityCodesInfo;
	}

	public void setCommodityCodesInfo(List<CommodityCodesInfoItem> commodityCodesInfo) {
		this.commodityCodesInfo = commodityCodesInfo;
	}

	public static class CommodityCodesInfoItem {

		private String commodityCode;

		private List<ModuleCodesInfoItem> moduleCodesInfo;

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public List<ModuleCodesInfoItem> getModuleCodesInfo() {
			return this.moduleCodesInfo;
		}

		public void setModuleCodesInfo(List<ModuleCodesInfoItem> moduleCodesInfo) {
			this.moduleCodesInfo = moduleCodesInfo;
		}

		public static class ModuleCodesInfoItem {

			private String moduleCode;

			private String moduleName;

			public String getModuleCode() {
				return this.moduleCode;
			}

			public void setModuleCode(String moduleCode) {
				this.moduleCode = moduleCode;
			}

			public String getModuleName() {
				return this.moduleName;
			}

			public void setModuleName(String moduleName) {
				this.moduleName = moduleName;
			}
		}
	}

	@Override
	public DescribeEnsCommodityModuleCodeResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnsCommodityModuleCodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
