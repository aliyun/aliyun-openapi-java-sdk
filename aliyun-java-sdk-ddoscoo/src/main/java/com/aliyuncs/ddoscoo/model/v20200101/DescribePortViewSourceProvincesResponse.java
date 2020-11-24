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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribePortViewSourceProvincesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePortViewSourceProvincesResponse extends AcsResponse {

	private String requestId;

	private List<Province> sourceProvinces;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Province> getSourceProvinces() {
		return this.sourceProvinces;
	}

	public void setSourceProvinces(List<Province> sourceProvinces) {
		this.sourceProvinces = sourceProvinces;
	}

	public static class Province {

		private Long count;

		private String provinceId;

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public String getProvinceId() {
			return this.provinceId;
		}

		public void setProvinceId(String provinceId) {
			this.provinceId = provinceId;
		}
	}

	@Override
	public DescribePortViewSourceProvincesResponse getInstance(UnmarshallerContext context) {
		return	DescribePortViewSourceProvincesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
