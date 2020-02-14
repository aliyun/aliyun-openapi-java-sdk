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

package com.aliyuncs.cloudesl.model.v20190801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20190801.DescribePlanogramRailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlanogramRailsResponse extends AcsResponse {

	private String dynamicMessage;

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private String message;

	private Integer pageNumber;

	private String dynamicCode;

	private String storeId;

	private Integer totalCount;

	private String code;

	private Integer pageSize;

	private List<PlanogramRailInfo> planogramRailInfos;

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<PlanogramRailInfo> getPlanogramRailInfos() {
		return this.planogramRailInfos;
	}

	public void setPlanogramRailInfos(List<PlanogramRailInfo> planogramRailInfos) {
		this.planogramRailInfos = planogramRailInfos;
	}

	public static class PlanogramRailInfo {

		private String shelf;

		private String railCode;

		private String layer;

		private Integer gapUnit;

		public String getShelf() {
			return this.shelf;
		}

		public void setShelf(String shelf) {
			this.shelf = shelf;
		}

		public String getRailCode() {
			return this.railCode;
		}

		public void setRailCode(String railCode) {
			this.railCode = railCode;
		}

		public String getLayer() {
			return this.layer;
		}

		public void setLayer(String layer) {
			this.layer = layer;
		}

		public Integer getGapUnit() {
			return this.gapUnit;
		}

		public void setGapUnit(Integer gapUnit) {
			this.gapUnit = gapUnit;
		}
	}

	@Override
	public DescribePlanogramRailsResponse getInstance(UnmarshallerContext context) {
		return	DescribePlanogramRailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
