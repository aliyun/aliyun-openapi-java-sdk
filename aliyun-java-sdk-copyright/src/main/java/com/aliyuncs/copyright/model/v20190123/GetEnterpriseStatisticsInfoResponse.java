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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetEnterpriseStatisticsInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEnterpriseStatisticsInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer total;

	private Integer monthCount;

	private Integer halfMonthCount;

	private Integer twoMonthCount;

	private Integer threeMonthCount;

	private Integer expiredCount;

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getMonthCount() {
		return this.monthCount;
	}

	public void setMonthCount(Integer monthCount) {
		this.monthCount = monthCount;
	}

	public Integer getHalfMonthCount() {
		return this.halfMonthCount;
	}

	public void setHalfMonthCount(Integer halfMonthCount) {
		this.halfMonthCount = halfMonthCount;
	}

	public Integer getTwoMonthCount() {
		return this.twoMonthCount;
	}

	public void setTwoMonthCount(Integer twoMonthCount) {
		this.twoMonthCount = twoMonthCount;
	}

	public Integer getThreeMonthCount() {
		return this.threeMonthCount;
	}

	public void setThreeMonthCount(Integer threeMonthCount) {
		this.threeMonthCount = threeMonthCount;
	}

	public Integer getExpiredCount() {
		return this.expiredCount;
	}

	public void setExpiredCount(Integer expiredCount) {
		this.expiredCount = expiredCount;
	}

	@Override
	public GetEnterpriseStatisticsInfoResponse getInstance(UnmarshallerContext context) {
		return	GetEnterpriseStatisticsInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
