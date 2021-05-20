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
import com.aliyuncs.ens.transform.v20171110.DescribeEnsRegionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsRegionsResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private List<EnsRegionsItem> ensRegions;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EnsRegionsItem> getEnsRegions() {
		return this.ensRegions;
	}

	public void setEnsRegions(List<EnsRegionsItem> ensRegions) {
		this.ensRegions = ensRegions;
	}

	public static class EnsRegionsItem {

		private String area;

		private String enName;

		private String ensRegionId;

		private String name;

		private String province;

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getEnName() {
			return this.enName;
		}

		public void setEnName(String enName) {
			this.enName = enName;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}
	}

	@Override
	public DescribeEnsRegionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnsRegionsResponseUnmarshaller.unmarshall(this, context);
	}
}
