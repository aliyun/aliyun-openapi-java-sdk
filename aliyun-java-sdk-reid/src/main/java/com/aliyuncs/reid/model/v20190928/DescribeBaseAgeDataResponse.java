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

package com.aliyuncs.reid.model.v20190928;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid.transform.v20190928.DescribeBaseAgeDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBaseAgeDataResponse extends AcsResponse {

	private String summaryType;

	private String requestId;

	private Boolean success;

	private String dynamicMessage;

	private Long storeId;

	private String errorCode;

	private String errorMessage;

	private Long locationId;

	private String message;

	private String hour;

	private String code;

	private String dynamicCode;

	private String day;

	private List<AgeItem> maleAgeItems;

	private List<AgeItem> ageItems;

	private List<AgeItem> femaleAgeItems;

	public String getSummaryType() {
		return this.summaryType;
	}

	public void setSummaryType(String summaryType) {
		this.summaryType = summaryType;
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

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

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

	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHour() {
		return this.hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
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

	public String getDay() {
		return this.day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public List<AgeItem> getMaleAgeItems() {
		return this.maleAgeItems;
	}

	public void setMaleAgeItems(List<AgeItem> maleAgeItems) {
		this.maleAgeItems = maleAgeItems;
	}

	public List<AgeItem> getAgeItems() {
		return this.ageItems;
	}

	public void setAgeItems(List<AgeItem> ageItems) {
		this.ageItems = ageItems;
	}

	public List<AgeItem> getFemaleAgeItems() {
		return this.femaleAgeItems;
	}

	public void setFemaleAgeItems(List<AgeItem> femaleAgeItems) {
		this.femaleAgeItems = femaleAgeItems;
	}

	public static class AgeItem {

		private String name;

		private Integer count;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeBaseAgeDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeBaseAgeDataResponseUnmarshaller.unmarshall(this, context);
	}
}
