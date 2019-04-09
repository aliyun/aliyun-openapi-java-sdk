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
import com.aliyuncs.airec.transform.v20181012.DescribeDashboardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDashboardResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<ResultItem> result;

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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

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

	@Override
	public DescribeDashboardResponse getInstance(UnmarshallerContext context) {
		return	DescribeDashboardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
