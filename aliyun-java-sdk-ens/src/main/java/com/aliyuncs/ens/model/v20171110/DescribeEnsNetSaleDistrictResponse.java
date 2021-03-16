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
import com.aliyuncs.ens.transform.v20171110.DescribeEnsNetSaleDistrictResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsNetSaleDistrictResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private List<EnsNetDistrict> ensNetDistricts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<EnsNetDistrict> getEnsNetDistricts() {
		return this.ensNetDistricts;
	}

	public void setEnsNetDistricts(List<EnsNetDistrict> ensNetDistricts) {
		this.ensNetDistricts = ensNetDistricts;
	}

	public static class EnsNetDistrict {

		private String netDistrictEnName;

		private String instanceCount;

		private String netDistrictName;

		private String netDistrictFatherCode;

		private String netDistrictCode;

		private String netDistrictLevel;

		private String ensRegionIdCount;

		public String getNetDistrictEnName() {
			return this.netDistrictEnName;
		}

		public void setNetDistrictEnName(String netDistrictEnName) {
			this.netDistrictEnName = netDistrictEnName;
		}

		public String getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(String instanceCount) {
			this.instanceCount = instanceCount;
		}

		public String getNetDistrictName() {
			return this.netDistrictName;
		}

		public void setNetDistrictName(String netDistrictName) {
			this.netDistrictName = netDistrictName;
		}

		public String getNetDistrictFatherCode() {
			return this.netDistrictFatherCode;
		}

		public void setNetDistrictFatherCode(String netDistrictFatherCode) {
			this.netDistrictFatherCode = netDistrictFatherCode;
		}

		public String getNetDistrictCode() {
			return this.netDistrictCode;
		}

		public void setNetDistrictCode(String netDistrictCode) {
			this.netDistrictCode = netDistrictCode;
		}

		public String getNetDistrictLevel() {
			return this.netDistrictLevel;
		}

		public void setNetDistrictLevel(String netDistrictLevel) {
			this.netDistrictLevel = netDistrictLevel;
		}

		public String getEnsRegionIdCount() {
			return this.ensRegionIdCount;
		}

		public void setEnsRegionIdCount(String ensRegionIdCount) {
			this.ensRegionIdCount = ensRegionIdCount;
		}
	}

	@Override
	public DescribeEnsNetSaleDistrictResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnsNetSaleDistrictResponseUnmarshaller.unmarshall(this, context);
	}
}
