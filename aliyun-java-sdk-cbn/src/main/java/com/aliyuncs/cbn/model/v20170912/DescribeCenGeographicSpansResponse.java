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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.DescribeCenGeographicSpansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenGeographicSpansResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<GeographicSpanModel> geographicSpanModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<GeographicSpanModel> getGeographicSpanModels() {
		return this.geographicSpanModels;
	}

	public void setGeographicSpanModels(List<GeographicSpanModel> geographicSpanModels) {
		this.geographicSpanModels = geographicSpanModels;
	}

	public static class GeographicSpanModel {

		private String geographicSpanId;

		private String localGeoRegionId;

		private String oppositeGeoRegionId;

		public String getGeographicSpanId() {
			return this.geographicSpanId;
		}

		public void setGeographicSpanId(String geographicSpanId) {
			this.geographicSpanId = geographicSpanId;
		}

		public String getLocalGeoRegionId() {
			return this.localGeoRegionId;
		}

		public void setLocalGeoRegionId(String localGeoRegionId) {
			this.localGeoRegionId = localGeoRegionId;
		}

		public String getOppositeGeoRegionId() {
			return this.oppositeGeoRegionId;
		}

		public void setOppositeGeoRegionId(String oppositeGeoRegionId) {
			this.oppositeGeoRegionId = oppositeGeoRegionId;
		}
	}

	@Override
	public DescribeCenGeographicSpansResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenGeographicSpansResponseUnmarshaller.unmarshall(this, context);
	}
}
