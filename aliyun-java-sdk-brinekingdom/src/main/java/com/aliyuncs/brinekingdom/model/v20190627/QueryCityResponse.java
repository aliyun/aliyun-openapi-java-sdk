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

package com.aliyuncs.brinekingdom.model.v20190627;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.brinekingdom.transform.v20190627.QueryCityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCityResponse extends AcsResponse {

	private String _class;

	private String errorMessage;

	private Boolean success;

	private String resultCode;

	private String requestId;

	private List<ResultItem> result;

	public String get_Class() {
		return this._class;
	}

	public void set_Class(String _class) {
		this._class = _class;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String cityAlias;

		private String cityCnName;

		private String cityCode;

		private String cityEnName;

		private Long cityId;

		private String _class;

		private String creator;

		private String creatorNic;

		private Long lastUpdate;

		private String modifier;

		private String modifierNic;

		public String getCityAlias() {
			return this.cityAlias;
		}

		public void setCityAlias(String cityAlias) {
			this.cityAlias = cityAlias;
		}

		public String getCityCnName() {
			return this.cityCnName;
		}

		public void setCityCnName(String cityCnName) {
			this.cityCnName = cityCnName;
		}

		public String getCityCode() {
			return this.cityCode;
		}

		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}

		public String getCityEnName() {
			return this.cityEnName;
		}

		public void setCityEnName(String cityEnName) {
			this.cityEnName = cityEnName;
		}

		public Long getCityId() {
			return this.cityId;
		}

		public void setCityId(Long cityId) {
			this.cityId = cityId;
		}

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getCreatorNic() {
			return this.creatorNic;
		}

		public void setCreatorNic(String creatorNic) {
			this.creatorNic = creatorNic;
		}

		public Long getLastUpdate() {
			return this.lastUpdate;
		}

		public void setLastUpdate(Long lastUpdate) {
			this.lastUpdate = lastUpdate;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public String getModifierNic() {
			return this.modifierNic;
		}

		public void setModifierNic(String modifierNic) {
			this.modifierNic = modifierNic;
		}
	}

	@Override
	public QueryCityResponse getInstance(UnmarshallerContext context) {
		return	QueryCityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
