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

package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeCdnRegionAndIspResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnRegionAndIspResponse extends AcsResponse {

	private String requestId;

	private List<Region> regions;

	private List<Isp> isps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Region> getRegions() {
		return this.regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public List<Isp> getIsps() {
		return this.isps;
	}

	public void setIsps(List<Isp> isps) {
		this.isps = isps;
	}

	public static class Region {

		private String nameZh;

		private String nameEn;

		public String getNameZh() {
			return this.nameZh;
		}

		public void setNameZh(String nameZh) {
			this.nameZh = nameZh;
		}

		public String getNameEn() {
			return this.nameEn;
		}

		public void setNameEn(String nameEn) {
			this.nameEn = nameEn;
		}
	}

	public static class Isp {

		private String nameZh;

		private String nameEn;

		public String getNameZh() {
			return this.nameZh;
		}

		public void setNameZh(String nameZh) {
			this.nameZh = nameZh;
		}

		public String getNameEn() {
			return this.nameEn;
		}

		public void setNameEn(String nameEn) {
			this.nameEn = nameEn;
		}
	}

	@Override
	public DescribeCdnRegionAndIspResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnRegionAndIspResponseUnmarshaller.unmarshall(this, context);
	}
}
