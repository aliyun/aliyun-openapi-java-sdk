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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnRegionAndIspResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnRegionAndIspResponse extends AcsResponse {

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
	public DescribeDcdnRegionAndIspResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnRegionAndIspResponseUnmarshaller.unmarshall(this, context);
	}
}
