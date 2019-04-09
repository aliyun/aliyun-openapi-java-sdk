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

package com.aliyuncs.airec.model.v20181012;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20181012.DescribeDataSetReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataSetReportResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<DetailItem> detail;

		private Overall overall;

		public List<DetailItem> getDetail() {
			return this.detail;
		}

		public void setDetail(List<DetailItem> detail) {
			this.detail = detail;
		}

		public Overall getOverall() {
			return this.overall;
		}

		public void setOverall(Overall overall) {
			this.overall = overall;
		}

		public static class DetailItem {

			private Long bizDate;

			private Long pv;

			private Long uv;

			private Long click;

			private Float ctr;

			private Float uvCtr;

			private Float perUvBhv;

			private Float perUvClick;

			private Long clickUser;

			private Long activeItem;

			public Long getBizDate() {
				return this.bizDate;
			}

			public void setBizDate(Long bizDate) {
				this.bizDate = bizDate;
			}

			public Long getPv() {
				return this.pv;
			}

			public void setPv(Long pv) {
				this.pv = pv;
			}

			public Long getUv() {
				return this.uv;
			}

			public void setUv(Long uv) {
				this.uv = uv;
			}

			public Long getClick() {
				return this.click;
			}

			public void setClick(Long click) {
				this.click = click;
			}

			public Float getCtr() {
				return this.ctr;
			}

			public void setCtr(Float ctr) {
				this.ctr = ctr;
			}

			public Float getUvCtr() {
				return this.uvCtr;
			}

			public void setUvCtr(Float uvCtr) {
				this.uvCtr = uvCtr;
			}

			public Float getPerUvBhv() {
				return this.perUvBhv;
			}

			public void setPerUvBhv(Float perUvBhv) {
				this.perUvBhv = perUvBhv;
			}

			public Float getPerUvClick() {
				return this.perUvClick;
			}

			public void setPerUvClick(Float perUvClick) {
				this.perUvClick = perUvClick;
			}

			public Long getClickUser() {
				return this.clickUser;
			}

			public void setClickUser(Long clickUser) {
				this.clickUser = clickUser;
			}

			public Long getActiveItem() {
				return this.activeItem;
			}

			public void setActiveItem(Long activeItem) {
				this.activeItem = activeItem;
			}
		}

		public static class Overall {

			private Integer bhvCount;

			private Integer itemItemCount;

			private Integer userUserCount;

			private Float itemRepetitiveRate;

			private Float userRepetitiveRate;

			private Float userLegalRate;

			private Float itemLegalRate;

			private Float bhvLegalRate;

			private Float userCompleteRate;

			private Float itemCompleteRate;

			private Float userLoginRate;

			private Float itemLoginRate;

			public Integer getBhvCount() {
				return this.bhvCount;
			}

			public void setBhvCount(Integer bhvCount) {
				this.bhvCount = bhvCount;
			}

			public Integer getItemItemCount() {
				return this.itemItemCount;
			}

			public void setItemItemCount(Integer itemItemCount) {
				this.itemItemCount = itemItemCount;
			}

			public Integer getUserUserCount() {
				return this.userUserCount;
			}

			public void setUserUserCount(Integer userUserCount) {
				this.userUserCount = userUserCount;
			}

			public Float getItemRepetitiveRate() {
				return this.itemRepetitiveRate;
			}

			public void setItemRepetitiveRate(Float itemRepetitiveRate) {
				this.itemRepetitiveRate = itemRepetitiveRate;
			}

			public Float getUserRepetitiveRate() {
				return this.userRepetitiveRate;
			}

			public void setUserRepetitiveRate(Float userRepetitiveRate) {
				this.userRepetitiveRate = userRepetitiveRate;
			}

			public Float getUserLegalRate() {
				return this.userLegalRate;
			}

			public void setUserLegalRate(Float userLegalRate) {
				this.userLegalRate = userLegalRate;
			}

			public Float getItemLegalRate() {
				return this.itemLegalRate;
			}

			public void setItemLegalRate(Float itemLegalRate) {
				this.itemLegalRate = itemLegalRate;
			}

			public Float getBhvLegalRate() {
				return this.bhvLegalRate;
			}

			public void setBhvLegalRate(Float bhvLegalRate) {
				this.bhvLegalRate = bhvLegalRate;
			}

			public Float getUserCompleteRate() {
				return this.userCompleteRate;
			}

			public void setUserCompleteRate(Float userCompleteRate) {
				this.userCompleteRate = userCompleteRate;
			}

			public Float getItemCompleteRate() {
				return this.itemCompleteRate;
			}

			public void setItemCompleteRate(Float itemCompleteRate) {
				this.itemCompleteRate = itemCompleteRate;
			}

			public Float getUserLoginRate() {
				return this.userLoginRate;
			}

			public void setUserLoginRate(Float userLoginRate) {
				this.userLoginRate = userLoginRate;
			}

			public Float getItemLoginRate() {
				return this.itemLoginRate;
			}

			public void setItemLoginRate(Float itemLoginRate) {
				this.itemLoginRate = itemLoginRate;
			}
		}
	}

	@Override
	public DescribeDataSetReportResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataSetReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
