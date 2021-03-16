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

package com.aliyuncs.reid_cloud.model.v20201029;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid_cloud.transform.v20201029.DescribeOverviewDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOverviewDataResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String message;

	private String code;

	private String dynamicCode;

	private String requestId;

	private Boolean success;

	private String dynamicMessage;

	private OverviewDetail overviewDetail;

	private AccurateOverviewDetail accurateOverviewDetail;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public OverviewDetail getOverviewDetail() {
		return this.overviewDetail;
	}

	public void setOverviewDetail(OverviewDetail overviewDetail) {
		this.overviewDetail = overviewDetail;
	}

	public AccurateOverviewDetail getAccurateOverviewDetail() {
		return this.accurateOverviewDetail;
	}

	public void setAccurateOverviewDetail(AccurateOverviewDetail accurateOverviewDetail) {
		this.accurateOverviewDetail = accurateOverviewDetail;
	}

	public static class OverviewDetail {

		private Float stayDeepAvgWOWPercent;

		private Float stayDeepAvg;

		private Float uvAvgWOWPercent;

		private Float stayAvgPeriodWOWPercent;

		private Float uvEverySqmGrowthWOWPercent;

		private Float uvWOWPercent;

		private Long uv;

		private Float uvEverySqm;

		private Float uvAvg;

		private Float stayAvgPeriod;

		public Float getStayDeepAvgWOWPercent() {
			return this.stayDeepAvgWOWPercent;
		}

		public void setStayDeepAvgWOWPercent(Float stayDeepAvgWOWPercent) {
			this.stayDeepAvgWOWPercent = stayDeepAvgWOWPercent;
		}

		public Float getStayDeepAvg() {
			return this.stayDeepAvg;
		}

		public void setStayDeepAvg(Float stayDeepAvg) {
			this.stayDeepAvg = stayDeepAvg;
		}

		public Float getUvAvgWOWPercent() {
			return this.uvAvgWOWPercent;
		}

		public void setUvAvgWOWPercent(Float uvAvgWOWPercent) {
			this.uvAvgWOWPercent = uvAvgWOWPercent;
		}

		public Float getStayAvgPeriodWOWPercent() {
			return this.stayAvgPeriodWOWPercent;
		}

		public void setStayAvgPeriodWOWPercent(Float stayAvgPeriodWOWPercent) {
			this.stayAvgPeriodWOWPercent = stayAvgPeriodWOWPercent;
		}

		public Float getUvEverySqmGrowthWOWPercent() {
			return this.uvEverySqmGrowthWOWPercent;
		}

		public void setUvEverySqmGrowthWOWPercent(Float uvEverySqmGrowthWOWPercent) {
			this.uvEverySqmGrowthWOWPercent = uvEverySqmGrowthWOWPercent;
		}

		public Float getUvWOWPercent() {
			return this.uvWOWPercent;
		}

		public void setUvWOWPercent(Float uvWOWPercent) {
			this.uvWOWPercent = uvWOWPercent;
		}

		public Long getUv() {
			return this.uv;
		}

		public void setUv(Long uv) {
			this.uv = uv;
		}

		public Float getUvEverySqm() {
			return this.uvEverySqm;
		}

		public void setUvEverySqm(Float uvEverySqm) {
			this.uvEverySqm = uvEverySqm;
		}

		public Float getUvAvg() {
			return this.uvAvg;
		}

		public void setUvAvg(Float uvAvg) {
			this.uvAvg = uvAvg;
		}

		public Float getStayAvgPeriod() {
			return this.stayAvgPeriod;
		}

		public void setStayAvgPeriod(Float stayAvgPeriod) {
			this.stayAvgPeriod = stayAvgPeriod;
		}
	}

	public static class AccurateOverviewDetail {

		private String stayDeepAvgWOWPercent;

		private String stayDeepAvg;

		private String uvAvgWOWPercent;

		private String stayAvgPeriodWOWPercent;

		private String uvWOWPercent;

		private String uvEverySqmGrowthWOWPercent;

		private Long uv;

		private String uvEverySqm;

		private String uvAvg;

		private String stayAvgPeriod;

		public String getStayDeepAvgWOWPercent() {
			return this.stayDeepAvgWOWPercent;
		}

		public void setStayDeepAvgWOWPercent(String stayDeepAvgWOWPercent) {
			this.stayDeepAvgWOWPercent = stayDeepAvgWOWPercent;
		}

		public String getStayDeepAvg() {
			return this.stayDeepAvg;
		}

		public void setStayDeepAvg(String stayDeepAvg) {
			this.stayDeepAvg = stayDeepAvg;
		}

		public String getUvAvgWOWPercent() {
			return this.uvAvgWOWPercent;
		}

		public void setUvAvgWOWPercent(String uvAvgWOWPercent) {
			this.uvAvgWOWPercent = uvAvgWOWPercent;
		}

		public String getStayAvgPeriodWOWPercent() {
			return this.stayAvgPeriodWOWPercent;
		}

		public void setStayAvgPeriodWOWPercent(String stayAvgPeriodWOWPercent) {
			this.stayAvgPeriodWOWPercent = stayAvgPeriodWOWPercent;
		}

		public String getUvWOWPercent() {
			return this.uvWOWPercent;
		}

		public void setUvWOWPercent(String uvWOWPercent) {
			this.uvWOWPercent = uvWOWPercent;
		}

		public String getUvEverySqmGrowthWOWPercent() {
			return this.uvEverySqmGrowthWOWPercent;
		}

		public void setUvEverySqmGrowthWOWPercent(String uvEverySqmGrowthWOWPercent) {
			this.uvEverySqmGrowthWOWPercent = uvEverySqmGrowthWOWPercent;
		}

		public Long getUv() {
			return this.uv;
		}

		public void setUv(Long uv) {
			this.uv = uv;
		}

		public String getUvEverySqm() {
			return this.uvEverySqm;
		}

		public void setUvEverySqm(String uvEverySqm) {
			this.uvEverySqm = uvEverySqm;
		}

		public String getUvAvg() {
			return this.uvAvg;
		}

		public void setUvAvg(String uvAvg) {
			this.uvAvg = uvAvg;
		}

		public String getStayAvgPeriod() {
			return this.stayAvgPeriod;
		}

		public void setStayAvgPeriod(String stayAvgPeriod) {
			this.stayAvgPeriod = stayAvgPeriod;
		}
	}

	@Override
	public DescribeOverviewDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeOverviewDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
